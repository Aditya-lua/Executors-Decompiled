package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.fc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9083fc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC9042d5 f32929a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ServiceConnectionC9211nc f32930b;

    public RunnableC9083fc(ServiceConnectionC9211nc serviceConnectionC9211nc, InterfaceC9042d5 interfaceC9042d5) {
        this.f32929a = interfaceC9042d5;
        Objects.requireNonNull(serviceConnectionC9211nc);
        this.f32930b = serviceConnectionC9211nc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC9211nc serviceConnectionC9211nc = this.f32930b;
        synchronized (serviceConnectionC9211nc) {
            try {
                serviceConnectionC9211nc.m36597d(false);
                C9307tc c9307tc = serviceConnectionC9211nc.f33281c;
                if (!c9307tc.m36881W()) {
                    c9307tc.f33067a.mo36321a().m37011w().m36911a("Connected to service");
                    c9307tc.m36908z(this.f32929a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
