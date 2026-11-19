package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class yb extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yc f28001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(yc ycVar, q8 q8Var) {
        super(q8Var);
        Objects.requireNonNull(ycVar);
        this.f28001e = ycVar;
    }

    @Override // ob.z
    public final void a() {
        yc ycVar = this.f28001e;
        ycVar.h();
        if (ycVar.W()) {
            ycVar.f27641a.a().w().a("Inactivity, disconnecting from the service");
            ycVar.A();
        }
    }
}
