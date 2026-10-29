package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import sb.C11264k;

/* JADX INFO: loaded from: classes2.dex */
final class zzc extends ResultReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11264k f10771a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(C2890b c2890b, Handler handler, C11264k c11264k) {
        super(handler);
        this.f10771a = c11264k;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f10771a.m42330e(null);
    }
}
