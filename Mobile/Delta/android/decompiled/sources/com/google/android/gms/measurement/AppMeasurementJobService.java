package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.NonNull;
import nb.bd;
import nb.xc;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bd f7401a;

    @Override // nb.xc
    public final boolean a(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // nb.xc
    @TargetApi(24)
    public final void b(@NonNull JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    public final bd c() {
        if (this.f7401a == null) {
            this.f7401a = new bd(this);
        }
        return this.f7401a;
    }

    @Override // nb.xc
    public final void g(@NonNull Intent intent) {
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

    @Override // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        c().e(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(@NonNull Intent intent) {
        c();
        bd.j(intent);
        return true;
    }
}
