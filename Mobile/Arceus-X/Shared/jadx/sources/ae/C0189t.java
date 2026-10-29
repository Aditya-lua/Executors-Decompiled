package ae;

import android.os.RemoteException;
import be.AbstractRunnableC1358r1;
import java.util.List;
import sb.C11264k;

/* JADX INFO: renamed from: ae.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C0189t extends AbstractRunnableC1358r1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f587b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C11264k f588c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0150a0 f589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0189t(C0150a0 c0150a0, C11264k c11264k, List list, C11264k c11264k2) {
        super(c11264k);
        this.f589d = c0150a0;
        this.f587b = list;
        this.f588c = c11264k2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, be.k0] */
    @Override // be.AbstractRunnableC1358r1
    /* JADX INFO: renamed from: c */
    public final void mo534c() {
        try {
            this.f589d.f518b.m7151e().mo7170n0(this.f589d.f517a, C0150a0.m472i(this.f587b), C0150a0.m473j(), new BinderC0195w(this.f589d, this.f588c));
        } catch (RemoteException e10) {
            C0150a0.f515c.m7209c(e10, "deferredUninstall(%s)", this.f587b);
            this.f588c.m42329d(new RuntimeException(e10));
        }
    }
}
