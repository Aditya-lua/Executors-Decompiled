package com.google.android.gms.games.internal.v2.resolution;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import fb.s0;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public final class GamesResolutionActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResultReceiver f6200a;
    public boolean b;

    public final void a(int i10, Intent intent) {
        Bundle bundle;
        if (this.b) {
            return;
        }
        this.b = true;
        ResultReceiver resultReceiver = this.f6200a;
        if (resultReceiver != null) {
            if (intent == null) {
                bundle = new Bundle();
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("resultData", intent);
                bundle = bundle2;
            }
            resultReceiver.send(i10, bundle);
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, @NonNull Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 0) {
            a(i11, intent);
            finish();
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 25);
        sb2.append("Unexpected request code: ");
        sb2.append(i10);
        s0.f("ResultActivity", sb2.toString());
        a(0, intent);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f6200a = (ResultReceiver) m.l((ResultReceiver) bundle.getParcelable("resultReceiver"));
            return;
        }
        this.f6200a = (ResultReceiver) m.l((ResultReceiver) getIntent().getParcelableExtra("resultReceiver"));
        try {
            try {
                startIntentSenderForResult(((PendingIntent) m.l((PendingIntent) getIntent().getParcelableExtra("pendingIntent"))).getIntentSender(), 0, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                s0.g("ResultActivity", "Failed to launch", e);
                a(0, null);
                finish();
            }
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (!isChangingConfigurations()) {
            a(0, null);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("resultReceiver", this.f6200a);
    }
}
