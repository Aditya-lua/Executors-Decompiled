package zd;

import ae.r1;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends r1 {
    public final /* synthetic */ List b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sb.k f37506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f37507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a0 a0Var, sb.k kVar, List list, sb.k kVar2) {
        super(kVar);
        this.f37507d = a0Var;
        this.b = list;
        this.f37506c = kVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ae.k0, android.os.IInterface] */
    @Override // ae.r1
    public final void c() {
        try {
            this.f37507d.b.e().g0(this.f37507d.f37449a, a0.i(this.b), a0.j(), new w(this.f37507d, this.f37506c));
        } catch (RemoteException e10) {
            a0.f37447c.c(e10, "deferredUninstall(%s)", this.b);
            this.f37506c.d(new RuntimeException(e10));
        }
    }
}
