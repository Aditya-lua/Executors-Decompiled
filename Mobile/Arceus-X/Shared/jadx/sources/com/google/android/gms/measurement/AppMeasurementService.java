package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import p159h4.AbstractC6279a;
import p306nb.C9016bd;
import p306nb.InterfaceC9371xc;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC9371xc {

    /* JADX INFO: renamed from: a */
    public C9016bd f9482a;

    /* JADX INFO: renamed from: c */
    private final C9016bd m11875c() {
        if (this.f9482a == null) {
            this.f9482a = new C9016bd(this);
        }
        return this.f9482a;
    }

    @Override // p306nb.InterfaceC9371xc
    /* JADX INFO: renamed from: a */
    public final boolean mo11870a(int i10) {
        return stopSelfResult(i10);
    }

    @Override // p306nb.InterfaceC9371xc
    /* JADX INFO: renamed from: b */
    public final void mo11871b(@NonNull JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // p306nb.InterfaceC9371xc
    /* JADX INFO: renamed from: g */
    public final void mo11873g(@NonNull Intent intent) {
        AbstractC6279a.m27537b(intent);
    }

    @Override // android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
        return m11875c().m36144d(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m11875c().m36141a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m11875c().m36142b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(@NonNull Intent intent) {
        m11875c();
        C9016bd.m36139i(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(@NonNull Intent intent, int i10, int i11) {
        m11875c().m36143c(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(@NonNull Intent intent) {
        m11875c();
        C9016bd.m36140j(intent);
        return true;
    }
}
