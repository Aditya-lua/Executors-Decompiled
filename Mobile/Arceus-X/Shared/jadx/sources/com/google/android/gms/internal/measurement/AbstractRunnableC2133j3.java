package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC2133j3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final long f8335a;

    /* JADX INFO: renamed from: b */
    public final long f8336b;

    /* JADX INFO: renamed from: c */
    public final boolean f8337c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2349v3 f8338d;

    public AbstractRunnableC2133j3(C2349v3 c2349v3, boolean z10) {
        Objects.requireNonNull(c2349v3);
        this.f8338d = c2349v3;
        this.f8335a = c2349v3.f8704b.mo44175a();
        this.f8336b = c2349v3.f8704b.mo44176b();
        this.f8337c = z10;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo9575a();

    /* JADX INFO: renamed from: b */
    public void mo9843b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8338d.m10813l()) {
            mo9843b();
            return;
        }
        try {
            mo9575a();
        } catch (Exception e10) {
            this.f8338d.m10811j(e10, false, this.f8337c);
            mo9843b();
        }
    }
}
