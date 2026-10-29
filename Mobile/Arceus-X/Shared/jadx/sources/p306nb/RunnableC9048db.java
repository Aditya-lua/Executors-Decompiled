package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.db */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9048db implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9014bb f32849a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9014bb f32850b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f32851c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f32852d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9146jb f32853e;

    public RunnableC9048db(C9146jb c9146jb, C9014bb c9014bb, C9014bb c9014bb2, long j10, boolean z10) {
        this.f32849a = c9014bb;
        this.f32850b = c9014bb2;
        this.f32851c = j10;
        this.f32852d = z10;
        Objects.requireNonNull(c9146jb);
        this.f32853e = c9146jb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32853e.m36372B(this.f32849a, this.f32850b, this.f32851c, this.f32852d, null);
    }
}
