package p531x0;

import java.util.Objects;
import java.util.concurrent.Executor;
import p140g0.AbstractC5913n;
import p140g0.C5891h1;
import p140g0.InterfaceC5907l1;
import p533x2.C12637g;
import p533x2.InterfaceC12631a;
import p563y1.C12997c;

/* JADX INFO: renamed from: x0.y */
/* JADX INFO: loaded from: classes.dex */
public class C12623y {

    /* JADX INFO: renamed from: a */
    public final Executor f44932a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5907l1 f44933b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12631a<Throwable> f44934c;

    public C12623y(AbstractC5913n abstractC5913n) {
        C12637g.m47069a(abstractC5913n.m26545g() == 4);
        this.f44932a = abstractC5913n.m26541c();
        InterfaceC5907l1 interfaceC5907l1M26542d = abstractC5913n.m26542d();
        Objects.requireNonNull(interfaceC5907l1M26542d);
        this.f44933b = interfaceC5907l1M26542d;
        this.f44934c = abstractC5913n.m26540b();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m47018a(final C12623y c12623y, final InterfaceC5907l1.a aVar, final C12997c.a aVar2) {
        c12623y.f44932a.execute(new Runnable() { // from class: x0.x
            @Override // java.lang.Runnable
            public final void run() {
                C12623y c12623y2 = this.f44927a;
                aVar2.m48314c(c12623y2.f44933b.m26522a(aVar));
            }
        });
        return "InternalImageProcessor#process " + aVar.hashCode();
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC5907l1.b m47020c(final InterfaceC5907l1.a aVar) throws C5891h1 {
        try {
            return (InterfaceC5907l1.b) C12997c.m48311a(new C12997c.c() { // from class: x0.w
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar2) {
                    return C12623y.m47018a(this.f44923a, aVar, aVar2);
                }
            }).get();
        } catch (Exception e10) {
            e = e10;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new C5891h1(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
