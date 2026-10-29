package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9082fb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f32927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9146jb f32928b;

    public RunnableC9082fb(C9146jb c9146jb, long j10) {
        this.f32927a = j10;
        Objects.requireNonNull(c9146jb);
        this.f32928b = c9146jb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9146jb c9146jb = this.f32928b;
        c9146jb.f33067a.m36318M().m37071k(this.f32927a);
        c9146jb.f33076e = null;
    }
}
