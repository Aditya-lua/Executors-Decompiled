package ce;

import android.os.RemoteException;
import de.j1;
import de.r1;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends r1 {
    public final /* synthetic */ Collection b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Collection f5005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f5006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tb.k f5007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f5008f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a0 a0Var, tb.k kVar, Collection collection, Collection collection2, j1 j1Var, tb.k kVar2) {
        super(kVar);
        this.f5008f = a0Var;
        this.b = collection;
        this.f5005c = collection2;
        this.f5006d = j1Var;
        this.f5007e = kVar2;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.IInterface, de.k0] */
    @Override // de.r1
    public final void c() {
        ArrayList arrayListI = a0.i(this.b);
        arrayListI.addAll(a0.h(this.f5005c));
        try {
            this.f5006d.b(2);
            this.f5008f.b.e().l0(this.f5008f.f4952a, arrayListI, a0.b(this.f5006d), new y(this.f5008f, this.f5007e));
        } catch (RemoteException e10) {
            a0.f4950c.c(e10, "startInstall(%s,%s)", this.b, this.f5005c);
            this.f5007e.d(new RuntimeException(e10));
        }
    }
}
