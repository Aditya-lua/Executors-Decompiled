package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.v */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9326v implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC9175l8 f33547a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC9342w f33548b;

    public RunnableC9326v(AbstractC9342w abstractC9342w, InterfaceC9175l8 interfaceC9175l8) {
        this.f33547a = interfaceC9175l8;
        Objects.requireNonNull(abstractC9342w);
        this.f33548b = abstractC9342w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC9175l8 interfaceC9175l8 = this.f33547a;
        interfaceC9175l8.mo36323c();
        if (C9070f.m36294a()) {
            interfaceC9175l8.mo36322b().m36263t(this);
            return;
        }
        AbstractC9342w abstractC9342w = this.f33548b;
        boolean zM36991c = abstractC9342w.m36991c();
        abstractC9342w.m36993e(0L);
        if (zM36991c) {
            abstractC9342w.mo36270a();
        }
    }
}
