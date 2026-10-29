package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h9 extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa f25579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(qa qaVar, l8 l8Var) {
        super(l8Var);
        Objects.requireNonNull(qaVar);
        this.f25579e = qaVar;
    }

    @Override // nb.w
    public final void a() {
        this.f25579e.r();
    }
}
