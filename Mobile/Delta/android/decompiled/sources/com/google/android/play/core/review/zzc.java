package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import sb.k;

/* JADX INFO: loaded from: classes2.dex */
final class zzc extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f8454a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(b bVar, Handler handler, k kVar) {
        super(handler);
        this.f8454a = kVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f8454a.e(null);
    }
}
