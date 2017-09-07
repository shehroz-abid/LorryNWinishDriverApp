package driverapp.lorry.com.lorrynwinishdriver.Gui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import driverapp.lorry.com.lorrynwinishdriver.Adapters.OrderHistoryAdapter;
import driverapp.lorry.com.lorrynwinishdriver.R;

import static com.facebook.FacebookSdk.getApplicationContext;

/**
 * Created by Shehroz on 06-Sep-17.
 */

public class OrderHistoryActivity extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trip_history);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.trip_history_expandlist);

        // preparing list data
        prepareListData();

        listAdapter = new OrderHistoryAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Day");
        listDataHeader.add("Month");
        listDataHeader.add("Year");
        listDataHeader.add("Quarter");

        // Adding child data
        List<String> day = new ArrayList<String>();
        day.add("250 12:14 AM  65 min");
        day.add("250 12:14 AM  65 min");
        day.add("250 12:14 AM  65 min");
        day.add("250 12:14 AM  65 min");


        List<String> month = new ArrayList<String>();
        month.add("250 12:14 AM  65 min");
        month.add("250 12:14 AM  65 min");
        month.add("250 12:14 AM  65 min");
        month.add("250 12:14 AM  65 min");


        List<String> year = new ArrayList<String>();
        year.add("250 12:14 AM  65 min");
        year.add("250 12:14 AM  65 min");
        year.add("250 12:14 AM  65 min");


        List<String> quarter = new ArrayList<String>();
        quarter.add("250 12:14 AM  65 min");
        quarter.add("250 12:14 AM  65 min");
        quarter.add("250 12:14 AM  65 min");
        quarter.add("250 12:14 AM  65 min");

        listDataChild.put(listDataHeader.get(0), day); // Header, Child data
        listDataChild.put(listDataHeader.get(1), month);
        listDataChild.put(listDataHeader.get(2), year);
        listDataChild.put(listDataHeader.get(3), quarter);
    }
}
