package edu.galileo.android.tipcalc.activities;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import edu.galileo.android.tipcalc.R;

public class TipDetailActivity extends AppCompatActivity {

    @Bind(R.id.txtBillTotal)
    TextView txtBillTotal;
    @Bind(R.id.txtTip)
    TextView txtTip;
    @Bind(R.id.txtTimeStamp)
    TextView txtTimeStamp;

    public final static String TIP_KEY = "tip";
    public final static String DATE_KEY = "timestamp";
    public final static String BILL_TOTAL_KEY = "total";


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_detail);
        ButterKnife.bind(this);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if( actionBar != null)
            actionBar.setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        String strTotal = String.format(getString(R.string.tipdetail_message_bill),
                intent.getDoubleExtra(BILL_TOTAL_KEY, 0d));
        String strTip = String.format(getString(R.string.global_message_tip),
                intent.getDoubleExtra(TIP_KEY, 0d));
        txtBillTotal.setText(strTotal);
        txtTip.setText(strTip);
        txtTimeStamp.setText(intent.getStringExtra(DATE_KEY));

    }
}
