package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import sb.k;
import vd.f;
import vd.g;
import wd.i;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends f {
    public c(g gVar, k kVar, String str) {
        super(gVar, new i("OnRequestInstallCallback"), kVar);
    }

    @Override // vd.f, wd.h
    public final void l(Bundle bundle) {
        super.l(bundle);
        this.b.e(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
