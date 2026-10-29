package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.z8 */
/* JADX INFO: loaded from: classes.dex */
public final class C9399z8 extends AbstractC9342w {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9257qa f33832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9399z8(C9257qa c9257qa, InterfaceC9175l8 interfaceC9175l8) {
        super(interfaceC9175l8);
        Objects.requireNonNull(c9257qa);
        this.f33832e = c9257qa;
    }

    @Override // p306nb.AbstractC9342w
    /* JADX INFO: renamed from: a */
    public final void mo36270a() {
        final C9257qa c9257qaM36307B = this.f33832e.f33067a.m36307B();
        Objects.requireNonNull(c9257qaM36307B);
        new Thread(new Runnable() { // from class: nb.y8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                c9257qaM36307B.m36715u0();
            }
        }).start();
    }
}
