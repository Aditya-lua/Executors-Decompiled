package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.e7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9061e7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9367x8 f32882a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9094g7 f32883b;

    public RunnableC9061e7(C9094g7 c9094g7, C9367x8 c9367x8) {
        this.f32882a = c9367x8;
        Objects.requireNonNull(c9094g7);
        this.f32883b = c9094g7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9094g7 c9094g7 = this.f32883b;
        C9367x8 c9367x8 = this.f32882a;
        c9094g7.m36336p(c9367x8);
        c9094g7.m36337v(c9367x8.f33652d);
    }
}
