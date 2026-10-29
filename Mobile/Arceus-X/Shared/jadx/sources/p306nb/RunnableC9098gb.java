package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.gb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9098gb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9014bb f32984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f32985b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9146jb f32986c;

    public RunnableC9098gb(C9146jb c9146jb, C9014bb c9014bb, long j10) {
        this.f32984a = c9014bb;
        this.f32985b = j10;
        Objects.requireNonNull(c9146jb);
        this.f32986c = c9146jb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9146jb c9146jb = this.f32986c;
        c9146jb.m36373C(this.f32984a, false, this.f32985b);
        c9146jb.f33076e = null;
        c9146jb.f33067a.m36315J().m36903u(null);
    }
}
