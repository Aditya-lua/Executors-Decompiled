package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.g9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9096g9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f32980a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9257qa f32981b;

    public RunnableC9096g9(C9257qa c9257qa, long j10) {
        this.f32980a = j10;
        Objects.requireNonNull(c9257qa);
        this.f32981b = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9094g7 c9094g7 = this.f32981b.f33067a;
        C9109h6 c9109h6 = c9094g7.m36339x().f33124l;
        long j10 = this.f32980a;
        c9109h6.m36346b(j10);
        c9094g7.mo36321a().m37010v().m36912b("Session timeout duration set", Long.valueOf(j10));
    }
}
