package yd;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends k {
    public l(m mVar, tb.k kVar, String str) {
        super(mVar, new zd.i("OnRequestInstallCallback"), kVar);
    }

    @Override // yd.k, zd.h
    public final void l(Bundle bundle) {
        super.l(bundle);
        this.b.e(new e((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
