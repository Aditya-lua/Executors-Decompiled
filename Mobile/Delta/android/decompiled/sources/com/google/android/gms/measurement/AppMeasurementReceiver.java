package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import h4.a;
import nb.o6;
import nb.p6;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends a implements o6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p6 f7476c;

    @Override // nb.o6
    public void a(@NonNull Context context, @NonNull Intent intent) {
        a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.f7476c == null) {
            this.f7476c = new p6(this);
        }
        this.f7476c.a(context, intent);
    }
}
