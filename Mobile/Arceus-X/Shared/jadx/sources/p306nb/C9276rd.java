package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.rd */
/* JADX INFO: loaded from: classes.dex */
public final class C9276rd extends AbstractC9342w {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9292sd f33444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9276rd(C9292sd c9292sd, InterfaceC9175l8 interfaceC9175l8) {
        super(interfaceC9175l8);
        Objects.requireNonNull(c9292sd);
        this.f33444e = c9292sd;
    }

    @Override // p306nb.AbstractC9342w
    /* JADX INFO: renamed from: a */
    public final void mo36270a() {
        C9292sd c9292sd = this.f33444e;
        c9292sd.m36774n();
        c9292sd.f33067a.mo36321a().m37011w().m36911a("Starting upload from DelayedRunnable");
        c9292sd.f33516b.m36564r();
    }
}
