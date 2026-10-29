package ae;

import android.os.RemoteException;
import be.AbstractRunnableC1358r1;
import java.util.List;
import sb.C11264k;

/* JADX INFO: renamed from: ae.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C0191u extends AbstractRunnableC1358r1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f590b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C11264k f591c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0150a0 f592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0191u(C0150a0 c0150a0, C11264k c11264k, List list, C11264k c11264k2) {
        super(c11264k);
        this.f592d = c0150a0;
        this.f590b = list;
        this.f591c = c11264k2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, be.k0] */
    @Override // be.AbstractRunnableC1358r1
    /* JADX INFO: renamed from: c */
    public final void mo534c() {
        try {
            this.f592d.f518b.m7151e().mo7169I0(this.f592d.f517a, C0150a0.m472i(this.f590b), C0150a0.m473j(), new BinderC0193v(this.f592d, this.f591c));
        } catch (RemoteException e10) {
            C0150a0.f515c.m7209c(e10, "deferredInstall(%s)", this.f590b);
            this.f591c.m42329d(new RuntimeException(e10));
        }
    }
}
