package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.eb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9065eb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9146jb f32892a;

    public RunnableC9065eb(C9146jb c9146jb) {
        Objects.requireNonNull(c9146jb);
        this.f32892a = c9146jb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9146jb c9146jb = this.f32892a;
        c9146jb.f33076e = c9146jb.m36374D();
    }
}
