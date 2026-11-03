package ae;

import android.os.RemoteException;
import be.r1;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends r1 {
    public final /* synthetic */ List b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sb.k f462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f463d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a0 a0Var, sb.k kVar, List list, sb.k kVar2) {
        super(kVar);
        this.f463d = a0Var;
        this.b = list;
        this.f462c = kVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, be.k0] */
    @Override // be.r1
    public final void c() {
        try {
            this.f463d.b.e().n0(this.f463d.f405a, a0.i(this.b), a0.j(), new w(this.f463d, this.f462c));
        } catch (RemoteException e10) {
            a0.f403c.c(e10, "deferredUninstall(%s)", this.b);
            this.f462c.d(new RuntimeException(e10));
        }
    }
}
