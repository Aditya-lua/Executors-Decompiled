package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.ic */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9131ic implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC9042d5 f33047a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ServiceConnectionC9211nc f33048b;

    public RunnableC9131ic(ServiceConnectionC9211nc serviceConnectionC9211nc, InterfaceC9042d5 interfaceC9042d5) {
        this.f33047a = interfaceC9042d5;
        Objects.requireNonNull(serviceConnectionC9211nc);
        this.f33048b = serviceConnectionC9211nc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC9211nc serviceConnectionC9211nc = this.f33048b;
        synchronized (serviceConnectionC9211nc) {
            try {
                serviceConnectionC9211nc.m36597d(false);
                C9307tc c9307tc = serviceConnectionC9211nc.f33281c;
                if (!c9307tc.m36881W()) {
                    c9307tc.f33067a.mo36321a().m37010v().m36911a("Connected to remote service");
                    c9307tc.m36908z(this.f33047a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C9307tc c9307tc2 = this.f33048b.f33281c;
        if (c9307tc2.m36875P() != null) {
            c9307tc2.m36875P().shutdownNow();
            c9307tc2.m36876Q(null);
        }
    }
}
