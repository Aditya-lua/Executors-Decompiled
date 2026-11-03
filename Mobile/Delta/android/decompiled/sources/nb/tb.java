package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tb extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc f26807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(tc tcVar, l8 l8Var) {
        super(l8Var);
        Objects.requireNonNull(tcVar);
        this.f26807e = tcVar;
    }

    @Override // nb.w
    public final void a() {
        tc tcVar = this.f26807e;
        tcVar.h();
        if (tcVar.W()) {
            tcVar.f26446a.a().w().a("Inactivity, disconnecting from the service");
            tcVar.A();
        }
    }
}
