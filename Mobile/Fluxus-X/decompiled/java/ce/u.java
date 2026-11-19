package ce;

import android.os.RemoteException;
import de.r1;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends r1 {
    public final /* synthetic */ List b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tb.k f5011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f5012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a0 a0Var, tb.k kVar, List list, tb.k kVar2) {
        super(kVar);
        this.f5012d = a0Var;
        this.b = list;
        this.f5011c = kVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, de.k0] */
    @Override // de.r1
    public final void c() {
        try {
            this.f5012d.b.e().u1(this.f5012d.f4952a, a0.i(this.b), a0.j(), new v(this.f5012d, this.f5011c));
        } catch (RemoteException e10) {
            a0.f4950c.c(e10, "deferredInstall(%s)", this.b);
            this.f5011c.d(new RuntimeException(e10));
        }
    }
}
