package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import p514wd.BinderC12354f;
import p514wd.C12355g;
import p543xd.C12788i;
import sb.C11264k;

/* JADX INFO: renamed from: com.google.android.play.core.review.c */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC2891c extends BinderC12354f {
    public BinderC2891c(C12355g c12355g, C11264k c11264k, String str) {
        super(c12355g, new C12788i("OnRequestInstallCallback"), c11264k);
    }

    @Override // p514wd.BinderC12354f, p543xd.InterfaceC12787h
    /* JADX INFO: renamed from: l */
    public final void mo13352l(Bundle bundle) {
        super.mo13352l(bundle);
        this.f44209b.m42330e(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
