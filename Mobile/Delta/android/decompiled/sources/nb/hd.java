package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class hd extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jd f25585e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(jd jdVar, l8 l8Var) {
        super(l8Var);
        Objects.requireNonNull(jdVar);
        this.f25585e = jdVar;
    }

    @Override // nb.w
    public final void a() {
        jd jdVar = this.f25585e;
        ld ldVar = jdVar.f25644d;
        ldVar.h();
        g7 g7Var = ldVar.f25625a;
        jdVar.d(false, false, g7Var.e().b());
        ldVar.f25625a.M().k(g7Var.e().b());
    }
}
