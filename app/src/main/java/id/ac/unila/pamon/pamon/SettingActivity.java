package id.ac.unila.pamon.pamon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);


        // toolbar
        Toolbar ToolBarAtas = (Toolbar)findViewById(R.id.settingToolbar);
        setSupportActionBar(ToolBarAtas);
        ToolBarAtas.setLogo(R.mipmap.ic_launcher);
        ToolBarAtas.setLogoDescription(getResources().getString(R.string.app_name));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
