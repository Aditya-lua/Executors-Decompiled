package p595z5;

import java.util.HashMap;
import java.util.Map;
import p120f6.C5390j0;
import p536x5.AbstractC12732w;
import p536x5.InterfaceC12690b;
import p536x5.InterfaceC12707j0;
import p567y5.InterfaceC13090u;

/* JADX INFO: renamed from: z5.a */
/* JADX INFO: loaded from: classes.dex */
public class C13719a {

    /* JADX INFO: renamed from: e */
    public static final String f48241e = AbstractC12732w.m47443i("DelayedWorkTracker");

    /* JADX INFO: renamed from: a */
    public final InterfaceC13090u f48242a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC12707j0 f48243b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12690b f48244c;

    /* JADX INFO: renamed from: d */
    public final Map<String, Runnable> f48245d = new HashMap();

    /* JADX INFO: renamed from: z5.a$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C5390j0 f48246a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(C5390j0 c5390j0) {
            this.f48246a = c5390j0;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC12732w.m47441e().mo47444a(C13719a.f48241e, "Scheduling work " + this.f48246a.id);
            C13719a.this.f48242a.mo193a(this.f48246a);
        }
    }

    public C13719a(InterfaceC13090u interfaceC13090u, InterfaceC12707j0 interfaceC12707j0, InterfaceC12690b interfaceC12690b) {
        this.f48242a = interfaceC13090u;
        this.f48243b = interfaceC12707j0;
        this.f48244c = interfaceC12690b;
    }

    /* JADX INFO: renamed from: a */
    public void m50113a(C5390j0 c5390j0, long j10) {
        Runnable runnableRemove = this.f48245d.remove(c5390j0.id);
        if (runnableRemove != null) {
            this.f48243b.mo47381a(runnableRemove);
        }
        a aVar = new a(c5390j0);
        this.f48245d.put(c5390j0.id, aVar);
        this.f48243b.mo47382b(j10 - this.f48244c.mo47323a(), aVar);
    }

    /* JADX INFO: renamed from: b */
    public void m50114b(String str) {
        Runnable runnableRemove = this.f48245d.remove(str);
        if (runnableRemove != null) {
            this.f48243b.mo47381a(runnableRemove);
        }
    }
}
