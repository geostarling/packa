package org.geostarling.packa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.geostarling.packa.rest.model.ChannelInfo;
import org.geostarling.packa.rest.model.ChannelInfoList;
import org.geostarling.packa.rest.model.FrontendStatus;
import org.geostarling.packa.rest.model.Program;
import org.geostarling.packa.rest.model.ProgramList;
import org.geostarling.packa.rest.service.ChannelService;
import org.geostarling.packa.rest.service.FrontendService;
import org.geostarling.packa.rest.service.RecordingService;


public class MainActivity extends ActionBarActivity implements ActionBar.TabListener {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the action bar.
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());


        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        // When swiping between different sections, select the corresponding
        // tab. We can also use ActionBar.Tab#select() to do this if we have
        // a reference to the Tab.
        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }
        });

        // For each of the sections in the app, add a tab to the action bar.
        for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
            // Create a tab with text corresponding to the page title defined by
            // the adapter. Also specify this Activity object, which implements
            // the TabListener interface, as the callback (listener) for when
            // this tab is selected.
            actionBar.addTab(
                    actionBar.newTab()
                            .setText(mSectionsPagerAdapter.getPageTitle(i))
                            .setTabListener(this));
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        // When the given tab is selected, switch to the corresponding page in
        // the ViewPager.
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    private static void showAlertDialog(FragmentActivity activity, String title, String message) {
        new AlertDialog.Builder(activity)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return ChannelListFragment.newInstance(position + 1);
                case 1:
                    return RecordingListFragment.newInstance(position + 1);
            }
            return RecordingListFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.title_section1).toUpperCase(l);
                case 1:
                    return getString(R.string.title_section2).toUpperCase(l);
            }
            return null;
        }
    }

    public static class ChannelListFragment extends Fragment {


        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";
        private ChannelService channelService;
        private FrontendService frontendService;
        private final List<ToggleButton> chanButtons;


        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static ChannelListFragment newInstance(int sectionNumber) {
            ChannelListFragment fragment = new ChannelListFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public ChannelListFragment() {
            channelService = new ChannelService();
            frontendService = new FrontendService();
            chanButtons = new ArrayList<ToggleButton>();
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_main, container, false);
            new ChannelListRequestTask(rootView).execute();
            return rootView;

        }


        private class ChannelListRequestTask extends AsyncTask<Void, Void, ChannelInfoList> {


            private static final String TAG = "ChannelListRequestTask";


            private ViewGroup rootView;

            public ChannelListRequestTask(ViewGroup rootView) {
                this.rootView = rootView;
            }

            @Override
            protected ChannelInfoList doInBackground(Void... params) {
                ChannelInfoList chanList;
                try {
                    chanList = channelService.getAll();
                    return chanList;
                } catch (Exception ex) {
                    Log.e(TAG, ex.getMessage(), ex);
                    showAlertDialog(getActivity(), "Chyba nacteni kanalu", ex.getMessage());
                    return null;
                }
            }

            @Override
            protected void onPostExecute(ChannelInfoList chanList) {

                if (chanList == null || chanList.getChannelInfos() == null) {
                    return;
                }


                Collections.sort(chanList.getChannelInfos(), new Comparator<ChannelInfo>() {
                    @Override
                    public int compare(ChannelInfo lhs, ChannelInfo rhs) {
                        try {
                            int lNum = Integer.parseInt(lhs.getChanNum());
                            int rNum = Integer.parseInt(rhs.getChanNum());
                            return lNum < rNum ? -1 : (lNum == rNum ? 0 : 1);
                        } catch (NumberFormatException ex) {
                            return 1;
                        }
                    }
                });
                for (final ChannelInfo channel : chanList.getChannelInfos()) {

                    Log.d(TAG, channel.toString());

                    final ToggleButton button = new ToggleButton(getActivity());
                    button.setTextOff(channel.getChannelName());
                    button.setText(channel.getChannelName());
                    button.setTextOn(channel.getChannelName());
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String chanNum = channel.getChanNum();
                            new SwitchChannelTask(chanNum).execute();
                        }
                    });
                    LinearLayout fragmentLayout = (LinearLayout) getView().findViewById(R.id.scrollable_layout);
                    button.setLayoutParams(new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                    button.setGravity(Gravity.CENTER | Gravity.RIGHT);
                    fragmentLayout.addView(button);

                }


            }

        }


        private class SwitchChannelTask extends AsyncTask<Void, Void, Boolean> {

            private static final String TAG = "SwitchChannelTask";

            private String chanNum;

            public SwitchChannelTask(String chanNum) {
                this.chanNum = chanNum;
            }

            @Override
            protected Boolean doInBackground(Void... params) {

                try {

                    FrontendStatus state = frontendService.getState();

                    if (state == null || state.getState() == null) {
                        return false;
                    }
                    if (state.getState().getState() == null || !state.getState().getState().equalsIgnoreCase("WatchingLiveTV")) {
                        frontendService.sendAction("Live TV");
                    }
                    return frontendService.sendAction(chanNum);
                } catch (Exception ex) {
                    Log.e(TAG, ex.getMessage(), ex);
                    showAlertDialog(getActivity(), "Chyba zmeny kanalu", ex.getMessage());
                    return false;
                }
            }

            @Override
            protected void onPostExecute(Boolean result) {

                if (!result) {
                    Log.e(TAG, "Prepnuti se nepovedlo.");
                    return;
                }

                for (ToggleButton butt : chanButtons) {
                    butt.setChecked(false);
                }
            }
        }
    }


    public static class RecordingListFragment extends Fragment {

        private RecordingService recordingService;
        private FrontendService frontendService;
        private final List<ToggleButton> recButtons;

        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static RecordingListFragment newInstance(int sectionNumber) {
            RecordingListFragment fragment = new RecordingListFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public RecordingListFragment() {
            recordingService = new RecordingService();
            frontendService = new FrontendService();
            recButtons = new ArrayList<ToggleButton>();
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_main, container, false);
            new RecordingListRequestTask(rootView).execute();
            return rootView;
        }


        private class RecordingListRequestTask extends AsyncTask<Void, Void, ProgramList> {


            private static final String TAG = "RecordingListRequestTask";


            private ViewGroup rootView;

            public RecordingListRequestTask(ViewGroup rootView) {
                this.rootView = rootView;
            }

            @Override
            protected ProgramList doInBackground(Void... params) {
                ProgramList recList;
                try {
                    recList = recordingService.getAll();
                    return recList;
                } catch (Exception ex) {
                    Log.e(TAG, ex.getMessage(), ex);
                    showAlertDialog(getActivity(), "Chyba nacteni kanalu", ex.getMessage());
                    return null;
                }
            }

            @Override
            protected void onPostExecute(ProgramList recList) {

                if (recList == null || recList.getPrograms() == null) {
                    return;
                }

                for (final Program prog : recList.getPrograms()) {

                    if (prog.getRecording() != null && !prog.getRecording().getRecGroup().equalsIgnoreCase("Default")) {
                        // we dont care about Live TV recordings, only those explicitly selected as recordings: either red button recorded, or moved to Default group via InformationService or ordinary SchedRecoridngs
                        continue;
                    }

                    Log.d(TAG, prog.toString());

                    final ToggleButton button = new ToggleButton(getActivity());
                    button.setTextOff(prog.getTitle());
                    button.setText(prog.getTitle());
                    button.setTextOn(prog.getTitle());
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String chanNum = prog.getChannel().getChanId();
                            String startTime = prog.getStartTime();
                            new PlayRecordingTask(chanNum, startTime).execute();
                        }
                    });
                    LinearLayout fragmentLayout = (LinearLayout) getView().findViewById(R.id.scrollable_layout);
                    button.setLayoutParams(new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                    button.setGravity(Gravity.CENTER | Gravity.RIGHT);
                    fragmentLayout.addView(button);

                }


            }

        }


        private class PlayRecordingTask extends AsyncTask<Void, Void, Boolean> {

            private static final String TAG = "SwitchChannelTask";

            private String chanNum;
            private String startTime;

            public PlayRecordingTask(String chanNum, String startTime) {
                this.chanNum = chanNum;
                this.startTime = startTime;
            }

            @Override
            protected Boolean doInBackground(Void... params) {

                try {
                    return frontendService.playRecording(chanNum, startTime);
                } catch (Exception ex) {
                    Log.e(TAG, ex.getMessage(), ex);
                    showAlertDialog(getActivity(), "Chyba zmeny kanalu", ex.getMessage());
                    return false;
                }
            }

            @Override
            protected void onPostExecute(Boolean result) {

                if (!result) {
                    Log.e(TAG, "Prepnuti se nepovedlo.");
                    return;
                }

                for (ToggleButton butt : recButtons) {
                    butt.setChecked(false);
                }
            }
        }
    }


}
