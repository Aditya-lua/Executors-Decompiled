package com.google.android.gms.games.internal.p049v2.resolution;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import p125fb.C5560s0;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes.dex */
public final class GamesResolutionActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public ResultReceiver f7916a;

    /* JADX INFO: renamed from: b */
    public boolean f7917b;

    /* JADX INFO: renamed from: a */
    public final void m9452a(int i10, Intent intent) {
        Bundle bundle;
        if (this.f7917b) {
            return;
        }
        this.f7917b = true;
        ResultReceiver resultReceiver = this.f7916a;
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
            m9452a(i11, intent);
            finish();
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 25);
        sb2.append("Unexpected request code: ");
        sb2.append(i10);
        C5560s0.m25225f("ResultActivity", sb2.toString());
        m9452a(0, intent);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f7916a = (ResultReceiver) C8953m.m36047l((ResultReceiver) bundle.getParcelable("resultReceiver"));
            return;
        }
        this.f7916a = (ResultReceiver) C8953m.m36047l((ResultReceiver) getIntent().getParcelableExtra("resultReceiver"));
        try {
            try {
                startIntentSenderForResult(((PendingIntent) C8953m.m36047l((PendingIntent) getIntent().getParcelableExtra("pendingIntent"))).getIntentSender(), 0, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                C5560s0.m25226g("ResultActivity", "Failed to launch", e);
                m9452a(0, null);
                finish();
            }
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (!isChangingConfigurations()) {
            m9452a(0, null);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("resultReceiver", this.f7916a);
    }
}
