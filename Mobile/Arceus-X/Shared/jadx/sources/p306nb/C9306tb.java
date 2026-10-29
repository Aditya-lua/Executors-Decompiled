package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.tb */
/* JADX INFO: loaded from: classes.dex */
public final class C9306tb extends AbstractC9342w {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9307tc f33507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9306tb(C9307tc c9307tc, InterfaceC9175l8 interfaceC9175l8) {
        super(interfaceC9175l8);
        Objects.requireNonNull(c9307tc);
        this.f33507e = c9307tc;
    }

    @Override // p306nb.AbstractC9342w
    /* JADX INFO: renamed from: a */
    public final void mo36270a() {
        C9307tc c9307tc = this.f33507e;
        c9307tc.mo36088h();
        if (c9307tc.m36881W()) {
            c9307tc.f33067a.mo36321a().m37011w().m36911a("Inactivity, disconnecting from the service");
            c9307tc.m36860A();
        }
    }
}
