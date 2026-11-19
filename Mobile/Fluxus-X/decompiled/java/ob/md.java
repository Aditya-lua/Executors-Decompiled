package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class md extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ od f27591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md(od odVar, q8 q8Var) {
        super(q8Var);
        Objects.requireNonNull(odVar);
        this.f27591e = odVar;
    }

    @Override // ob.z
    public final void a() {
        od odVar = this.f27591e;
        qd qdVar = odVar.f27660d;
        qdVar.h();
        l7 l7Var = qdVar.f27641a;
        odVar.d(false, false, l7Var.e().b());
        qdVar.f27641a.M().k(l7Var.e().b());
    }
}
