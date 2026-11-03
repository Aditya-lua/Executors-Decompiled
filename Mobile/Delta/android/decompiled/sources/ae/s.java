package ae;

import android.os.RemoteException;
import be.j1;
import be.r1;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends r1 {
    public final /* synthetic */ Collection b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Collection f458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb.k f460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f461f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a0 a0Var, sb.k kVar, Collection collection, Collection collection2, j1 j1Var, sb.k kVar2) {
        super(kVar);
        this.f461f = a0Var;
        this.b = collection;
        this.f458c = collection2;
        this.f459d = j1Var;
        this.f460e = kVar2;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.IInterface, be.k0] */
    @Override // be.r1
    public final void c() {
        ArrayList arrayListI = a0.i(this.b);
        arrayListI.addAll(a0.h(this.f458c));
        try {
            this.f459d.b(2);
            this.f461f.b.e().E0(this.f461f.f405a, arrayListI, a0.b(this.f459d), new y(this.f461f, this.f460e));
        } catch (RemoteException e10) {
            a0.f403c.c(e10, "startInstall(%s,%s)", this.b, this.f458c);
            this.f460e.d(new RuntimeException(e10));
        }
    }
}
