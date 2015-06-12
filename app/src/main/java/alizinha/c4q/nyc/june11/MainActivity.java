package alizinha.c4q.nyc.june11;

import android.app.Activity;
import android.app.ExpandableListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class MainActivity extends Activity{

    ExpandableListView superPersonList;


    ArrayList<String> supermanPowers = new ArrayList<>();
    ArrayList<String> wonderwomanPowers = new ArrayList<>();
    ArrayList<String> spidermanPowers = new ArrayList<>();
    ArrayList<String> jokerPowers = new ArrayList<>();

    ArrayList<String> superpersonsNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        supermanPowers.add("Heat Vision");
        supermanPowers.add("Flight");

        wonderwomanPowers.add("Golden Lasso");
        wonderwomanPowers.add("Super Strength");

        spidermanPowers.add("Spidy Senses");
        spidermanPowers.add("Spider Web");

        jokerPowers.add("Knife");




        superPersonList = (ExpandableListView) findViewById(R.id.superperson_list);

        ArrayList<Superperson> superpersons = new ArrayList<>();
        Superhero superman = new Superhero("Super Man", "Clark Kent", supermanPowers);
        Superhero wonderwoman = new Superhero("Wonder Woman", "Diana Prince", wonderwomanPowers);
        Superhero spiderman = new Superhero("Spider Man", "Peter Parker", spidermanPowers);
        Supervillain joker = new Supervillain("The Joker", "Jack Napier", spidermanPowers);

        superpersons.add(superman);
        superpersons.add(wonderwoman);
        superpersons.add(spiderman);
        superpersons.add(joker);

        for(Superperson superperson: superpersons){
            superpersonsNames.add(superperson.getName() +", Secret Identity:"+ superperson.getSecretIdentity() );
        }


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,superpersonsNames);
        superPersonList.setAdapter(adapter);


    }



}
