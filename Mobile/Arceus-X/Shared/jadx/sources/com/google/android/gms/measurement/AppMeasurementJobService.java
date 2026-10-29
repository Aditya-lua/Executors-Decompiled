package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.NonNull;
import p306nb.C9016bd;
import p306nb.InterfaceC9371xc;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements InterfaceC9371xc {

    /* JADX INFO: renamed from: a */
    public C9016bd f9480a;

    @Override // p306nb.InterfaceC9371xc
    /* JADX INFO: renamed from: a */
    public final boolean mo11870a(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // p306nb.InterfaceC9371xc
    @TargetApi(24)
    /* JADX INFO: renamed from: b */
    public final void mo11871b(@NonNull JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    /* JADX INFO: renamed from: c */
    public final C9016bd m11872c() {
        if (this.f9480a == null) {
            this.f9480a = new C9016bd(this);
        }
        return this.f9480a;
    }

    @Override // p306nb.InterfaceC9371xc
    /* JADX INFO: renamed from: g */
    public final void mo11873g(@NonNull Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m11872c().m36141a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m11872c().m36142b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(@NonNull Intent intent) {
        m11872c();
        C9016bd.m36139i(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        m11872c().m36145e(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(@NonNull Intent intent) {
        m11872c();
        C9016bd.m36140j(intent);
        return true;
    }
}
