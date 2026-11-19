package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import i4.a;
import ob.t6;
import ob.u6;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends a implements t6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u6 f7390c;

    @Override // ob.t6
    public void a(@NonNull Context context, @NonNull Intent intent) {
        a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.f7390c == null) {
            this.f7390c = new u6(this);
        }
        this.f7390c.a(context, intent);
    }
}
