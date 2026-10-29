package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.hd */
/* JADX INFO: loaded from: classes.dex */
public final class C9116hd extends AbstractC9342w {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9148jd f33018e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9116hd(C9148jd c9148jd, InterfaceC9175l8 interfaceC9175l8) {
        super(interfaceC9175l8);
        Objects.requireNonNull(c9148jd);
        this.f33018e = c9148jd;
    }

    @Override // p306nb.AbstractC9342w
    /* JADX INFO: renamed from: a */
    public final void mo36270a() {
        C9148jd c9148jd = this.f33018e;
        C9180ld c9180ld = c9148jd.f33088d;
        c9180ld.mo36088h();
        C9094g7 c9094g7 = c9180ld.f33067a;
        c9148jd.m36393d(false, false, c9094g7.mo36325e().mo44176b());
        c9180ld.f33067a.m36318M().m37071k(c9094g7.mo36325e().mo44176b());
    }
}
