package p531x0;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import ne.InterfaceFutureC9440x;
import p140g0.AbstractC5913n;
import p140g0.C5931r1;
import p140g0.C5948v2;
import p140g0.InterfaceC5900j2;
import p140g0.InterfaceC5904k2;
import p397r0.C10773n;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: x0.y0 */
/* JADX INFO: loaded from: classes.dex */
public class C12624y0 implements InterfaceC12610r0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5904k2 f44935a;

    /* JADX INFO: renamed from: b */
    public final Executor f44936b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12631a<Throwable> f44937c;

    public C12624y0(AbstractC5913n abstractC5913n) {
        InterfaceC5904k2 interfaceC5904k2M26544f = abstractC5913n.m26544f();
        Objects.requireNonNull(interfaceC5904k2M26544f);
        this.f44935a = interfaceC5904k2M26544f;
        this.f44936b = abstractC5913n.m26541c();
        this.f44937c = abstractC5913n.m26540b();
    }

    @Override // p531x0.InterfaceC12610r0
    /* JADX INFO: renamed from: a */
    public void mo46980a() {
    }

    @Override // p140g0.InterfaceC5904k2
    /* JADX INFO: renamed from: b */
    public void mo26520b(final C5948v2 c5948v2) {
        try {
            this.f44936b.execute(new Runnable() { // from class: x0.w0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44925a.f44935a.mo26520b(c5948v2);
                }
            });
        } catch (RejectedExecutionException unused) {
            C5931r1.m26563c("SurfaceProcessor", "SurfaceProcessor failed due to executor shutdown");
        }
    }

    @Override // p531x0.InterfaceC12610r0
    /* JADX INFO: renamed from: c */
    public InterfaceFutureC9440x<Void> mo46981c(int i10, int i11) {
        return C10773n.m40991n(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    @Override // p140g0.InterfaceC5904k2
    /* JADX INFO: renamed from: d */
    public void mo26521d(final InterfaceC5900j2 interfaceC5900j2) {
        try {
            this.f44936b.execute(new Runnable() { // from class: x0.x0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44930a.f44935a.mo26521d(interfaceC5900j2);
                }
            });
        } catch (RejectedExecutionException unused) {
            C5931r1.m26563c("SurfaceProcessor", "SurfaceProcessor failed due to executor shutdown");
        }
    }

    public String toString() {
        return "SurfaceProcessorWithExecutor(" + this.f44935a + ")";
    }
}
