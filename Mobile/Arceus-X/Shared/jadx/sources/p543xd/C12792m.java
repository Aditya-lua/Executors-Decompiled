package p543xd;

import sb.C11264k;

/* JADX INFO: renamed from: xd.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C12792m extends AbstractRunnableC12789j {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11264k f45524b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractRunnableC12789j f45525c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C12799t f45526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12792m(C12799t c12799t, C11264k c11264k, C11264k c11264k2, AbstractRunnableC12789j abstractRunnableC12789j) {
        super(c11264k);
        this.f45524b = c11264k2;
        this.f45525c = abstractRunnableC12789j;
        this.f45526d = c12799t;
    }

    @Override // p543xd.AbstractRunnableC12789j
    /* JADX INFO: renamed from: a */
    public final void mo46218a() {
        synchronized (this.f45526d.f45538f) {
            try {
                C12799t.m47667n(this.f45526d, this.f45524b);
                if (this.f45526d.f45543k.getAndIncrement() > 0) {
                    this.f45526d.f45534b.m47652c("Already connected to the service.", new Object[0]);
                }
                C12799t.m47669p(this.f45526d, this.f45525c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
