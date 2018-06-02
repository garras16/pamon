package id.ac.unila.pamon.pamon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.support.v7.widget.Toolbar;

public class MonitorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor);

        // toolbar
        Toolbar ToolBarAtas = (Toolbar)findViewById(R.id.monitorToolbar);
        setSupportActionBar(ToolBarAtas);
        ToolBarAtas.setLogo(R.mipmap.ic_launcher);
        ToolBarAtas.setLogoDescription(getResources().getString(R.string.app_name));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
