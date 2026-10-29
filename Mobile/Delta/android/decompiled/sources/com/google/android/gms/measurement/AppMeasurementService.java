package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import h4.a;
import nb.bd;
import nb.xc;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bd f7403a;

    private final bd c() {
        if (this.f7403a == null) {
            this.f7403a = new bd(this);
        }
        return this.f7403a;
    }

    @Override // nb.xc
    public final boolean a(int i10) {
        return stopSelfResult(i10);
    }

    @Override // nb.xc
    public final void b(@NonNull JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // nb.xc
    public final void g(@NonNull Intent intent) {
        a.b(intent);
    }

    @Override // android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
        return c().d(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c().a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        c().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(@NonNull Intent intent) {
        c();
        bd.i(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(@NonNull Intent intent, int i10, int i11) {
        c().c(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(@NonNull Intent intent) {
        c();
        bd.j(intent);
        return true;
    }
}
