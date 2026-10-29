package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z8 extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa f26220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(qa qaVar, l8 l8Var) {
        super(l8Var);
        Objects.requireNonNull(qaVar);
        this.f26220e = qaVar;
    }

    @Override // nb.w
    public final void a() {
        final qa qaVarB = this.f26220e.f25625a.B();
        Objects.requireNonNull(qaVarB);
        new Thread(new Runnable() { // from class: nb.y8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                qaVarB.u0();
            }
        }).start();
    }
}
