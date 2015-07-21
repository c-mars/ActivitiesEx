package c.mars.activitiesex;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Slide;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.OnClick;

import static android.app.ActivityOptions.makeSceneTransitionAnimation;


public class MainActivity extends BaseActivity {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @OnClick(R.id.t) void t() {
        getWindow().setExitTransition(new Fade());
        Intent i=new Intent(this, LoginActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(i, makeSceneTransitionAnimation(this).toBundle());
    }

    @Override
    void create() {
        setContentView(R.layout.activity_main);
    }
}
