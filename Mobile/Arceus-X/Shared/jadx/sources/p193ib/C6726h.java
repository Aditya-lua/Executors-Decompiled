package p193ib;

import java.util.Objects;
import sb.C11264k;

/* JADX INFO: renamed from: ib.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6726h extends AbstractRunnableC6723e {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11264k f25832b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractRunnableC6723e f25833c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C6733o f25834d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6726h(C6733o c6733o, C11264k c11264k, C11264k c11264k2, AbstractRunnableC6723e abstractRunnableC6723e) {
        super(c11264k);
        this.f25832b = c11264k2;
        this.f25833c = abstractRunnableC6723e;
        Objects.requireNonNull(c6733o);
        this.f25834d = c6733o;
    }

    @Override // p193ib.AbstractRunnableC6723e
    /* JADX INFO: renamed from: b */
    public final void mo28824b() {
        C6733o c6733o = this.f25834d;
        synchronized (c6733o.f25846f) {
            try {
                C6733o.m28838o(c6733o, this.f25832b);
                if (c6733o.f25851k.getAndIncrement() > 0) {
                    c6733o.f25842b.m28821c("Already connected to the service.", new Object[0]);
                }
                C6733o.m28840q(c6733o, this.f25833c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
