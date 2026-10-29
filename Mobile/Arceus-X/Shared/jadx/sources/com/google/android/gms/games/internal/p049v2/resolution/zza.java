package com.google.android.gms.games.internal.p049v2.resolution;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.Task;
import la.C8096a;
import p125fb.HandlerC5572w0;
import sb.C11264k;

/* JADX INFO: loaded from: classes.dex */
final class zza extends ResultReceiver {

    /* JADX INFO: renamed from: a */
    public final C11264k f7918a;

    public zza() {
        super(new HandlerC5572w0(Looper.getMainLooper()));
        this.f7918a = new C11264k();
    }

    /* JADX INFO: renamed from: a */
    public final Task m9455a() {
        return this.f7918a.m42326a();
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        Intent intent;
        super.onReceiveResult(i10, bundle);
        boolean z10 = i10 == -1;
        if (bundle == null || (intent = (Intent) bundle.getParcelable("resultData")) == null) {
            intent = new Intent();
        }
        this.f7918a.m42330e(z10 ? C8096a.m33316a(intent) : C8096a.m33317b(intent));
    }
}
