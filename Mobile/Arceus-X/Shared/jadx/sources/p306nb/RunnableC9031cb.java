package p306nb;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: nb.cb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9031cb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Bundle f32816a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9014bb f32817b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9014bb f32818c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f32819d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9146jb f32820e;

    public RunnableC9031cb(C9146jb c9146jb, Bundle bundle, C9014bb c9014bb, C9014bb c9014bb2, long j10) {
        this.f32816a = bundle;
        this.f32817b = c9014bb;
        this.f32818c = c9014bb2;
        this.f32819d = j10;
        Objects.requireNonNull(c9146jb);
        this.f32820e = c9146jb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32820e.m36371A(this.f32816a, this.f32817b, this.f32818c, this.f32819d);
    }
}
