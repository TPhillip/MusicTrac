package com.uie.musictrak.activities.activities.trackedit;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.uie.musictrak.R;
import com.uie.musictrak.activities.activities.songview.YourSongs;

public class TrackEditor extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.save_song:
                    Snackbar.make(findViewById(R.id.song_control_bar) , "Would save the newly-created song bach to user's song list", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    return true;
                case R.id.trash_song:
                    Snackbar.make(findViewById(R.id.song_control_bar) , "Disgards the current song project", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_editor);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        TextView add_track_button = findViewById(R.id.add_track_button);
        add_track_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(findViewById(R.id.track_edit_body), "In a real app, this would open the community editor to find tracks", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
