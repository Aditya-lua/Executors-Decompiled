package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.xb */
/* JADX INFO: loaded from: classes.dex */
public final class C9370xb extends AbstractC9342w {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9307tc f33659e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9370xb(C9307tc c9307tc, InterfaceC9175l8 interfaceC9175l8) {
        super(interfaceC9175l8);
        Objects.requireNonNull(c9307tc);
        this.f33659e = c9307tc;
    }

    @Override // p306nb.AbstractC9342w
    /* JADX INFO: renamed from: a */
    public final void mo36270a() {
        this.f33659e.f33067a.mo36321a().m37006r().m36911a("Tasks have been queued for a long time");
    }
}
