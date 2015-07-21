package c.mars.activitiesex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by Constantine Mars on 7/21/15.
 */
public abstract class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        create();
        ButterKnife.bind(this);
    }

    abstract void create();
}
