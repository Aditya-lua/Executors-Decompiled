package p306nb;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: nb.m9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9192m9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f33207a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9257qa f33208b;

    public RunnableC9192m9(C9257qa c9257qa, long j10) {
        this.f33207a = j10;
        Objects.requireNonNull(c9257qa);
        this.f33208b = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9257qa c9257qa = this.f33208b;
        c9257qa.mo36088h();
        c9257qa.m36121j();
        C9094g7 c9094g7 = c9257qa.f33067a;
        c9094g7.mo36321a().m37010v().m36911a("Resetting analytics data (FE)");
        C9094g7 c9094g8 = c9257qa.f33067a;
        C9180ld c9180ldM36341z = c9094g8.m36341z();
        c9180ldM36341z.mo36088h();
        c9180ldM36341z.f33191f.m36392c();
        c9094g8.m36317L().m36431p();
        boolean z10 = !c9257qa.f33067a.m36327g();
        C9157k6 c9157k6M36339x = c9094g7.m36339x();
        c9157k6M36339x.f33118f.m36346b(this.f33207a);
        C9094g7 c9094g9 = c9157k6M36339x.f33067a;
        if (!TextUtils.isEmpty(c9094g9.m36339x().f33135w.m36369a())) {
            c9157k6M36339x.f33135w.m36370b(null);
        }
        c9157k6M36339x.f33129q.m36346b(0L);
        c9157k6M36339x.f33130r.m36346b(0L);
        if (!c9094g9.m36338w().m36410L()) {
            c9157k6M36339x.m36452y(z10);
        }
        c9157k6M36339x.f33136x.m36370b(null);
        c9157k6M36339x.f33137y.m36346b(0L);
        c9157k6M36339x.f33138z.m36299b(null);
        c9094g8.m36315J().m36898p();
        c9094g8.m36341z().f33190e.m36458a();
        c9257qa.f33408s = z10;
        c9094g8.m36315J().m36899q(new AtomicReference());
    }
}
