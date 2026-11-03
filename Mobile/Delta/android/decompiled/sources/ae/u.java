package ae;

import android.os.RemoteException;
import be.r1;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends r1 {
    public final /* synthetic */ List b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sb.k f464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a0 a0Var, sb.k kVar, List list, sb.k kVar2) {
        super(kVar);
        this.f465d = a0Var;
        this.b = list;
        this.f464c = kVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, be.k0] */
    @Override // be.r1
    public final void c() {
        try {
            this.f465d.b.e().I0(this.f465d.f405a, a0.i(this.b), a0.j(), new v(this.f465d, this.f464c));
        } catch (RemoteException e10) {
            a0.f403c.c(e10, "deferredInstall(%s)", this.b);
            this.f464c.d(new RuntimeException(e10));
        }
    }
}
