package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import p159h4.AbstractC6279a;
import p306nb.C9237p6;
import p306nb.InterfaceC9221o6;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC6279a implements InterfaceC9221o6 {

    /* JADX INFO: renamed from: c */
    public C9237p6 f9481c;

    @Override // p306nb.InterfaceC9221o6
    /* JADX INFO: renamed from: a */
    public void mo11874a(@NonNull Context context, @NonNull Intent intent) {
        AbstractC6279a.m27538c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.f9481c == null) {
            this.f9481c = new C9237p6(this);
        }
        this.f9481c.m36626a(context, intent);
    }
}
