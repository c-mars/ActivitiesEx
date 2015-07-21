package c.mars.activitiesex;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.OnClick;

import static android.app.ActivityOptions.*;


public class LoginActivity extends BaseActivity {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @OnClick(R.id.t) void t() {
        getWindow().setExitTransition(new Explode());
        Intent i=new Intent(this, SetupActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i, makeSceneTransitionAnimation(this).toBundle());
    }

    @Override
    void create() {
        setContentView(R.layout.activity_login);
    }
}
