package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l9 extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa f25728e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(qa qaVar, l8 l8Var) {
        super(l8Var);
        Objects.requireNonNull(qaVar);
        this.f25728e = qaVar;
    }

    @Override // nb.w
    public final void a() {
        qa qaVar = this.f25728e;
        if (qaVar.f25625a.n()) {
            qaVar.c0().b(2000L);
        }
    }
}
