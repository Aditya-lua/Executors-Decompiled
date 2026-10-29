package ee;

import sb.C11264k;

/* JADX INFO: renamed from: ee.x0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5104x0 extends AbstractRunnableC5098u0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11264k f19921b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractRunnableC5098u0 f19922c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C5067f f19923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5104x0(C5067f c5067f, C11264k c11264k, C11264k c11264k2, AbstractRunnableC5098u0 abstractRunnableC5098u0) {
        super(c11264k);
        this.f19921b = c11264k2;
        this.f19922c = abstractRunnableC5098u0;
        this.f19923d = c5067f;
    }

    @Override // ee.AbstractRunnableC5098u0
    /* JADX INFO: renamed from: b */
    public final void mo23771b() {
        synchronized (this.f19923d.f19889f) {
            try {
                C5067f.m23786o(this.f19923d, this.f19921b);
                if (this.f19923d.f19895l.getAndIncrement() > 0) {
                    this.f19923d.f19885b.m23841c("Already connected to the service.", new Object[0]);
                }
                C5067f.m23788q(this.f19923d, this.f19922c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
