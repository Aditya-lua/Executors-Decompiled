package zd;

import ae.j1;
import ae.r1;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends r1 {
    public final /* synthetic */ Collection b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Collection f37502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f37503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb.k f37504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f37505f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a0 a0Var, sb.k kVar, Collection collection, Collection collection2, j1 j1Var, sb.k kVar2) {
        super(kVar);
        this.f37505f = a0Var;
        this.b = collection;
        this.f37502c = collection2;
        this.f37503d = j1Var;
        this.f37504e = kVar2;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [ae.k0, android.os.IInterface] */
    @Override // ae.r1
    public final void c() {
        ArrayList arrayListI = a0.i(this.b);
        arrayListI.addAll(a0.h(this.f37502c));
        try {
            this.f37503d.b(2);
            this.f37505f.b.e().H0(this.f37505f.f37449a, arrayListI, a0.b(this.f37503d), new y(this.f37505f, this.f37504e));
        } catch (RemoteException e10) {
            a0.f37447c.c(e10, "startInstall(%s,%s)", this.b, this.f37502c);
            this.f37504e.d(new RuntimeException(e10));
        }
    }
}
