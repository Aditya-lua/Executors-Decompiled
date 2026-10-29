package p589z;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Executor;
import p001a0.C0008c0;
import p140g0.InterfaceC5909m;
import p296n0.InterfaceC8795n1;
import p561y.C12964a;
import p563y1.C12997c;

/* JADX INFO: renamed from: z.s3 */
/* JADX INFO: loaded from: classes.dex */
public class C13620s3 {

    /* JADX INFO: renamed from: a */
    public final C13658y f47664a;

    /* JADX INFO: renamed from: b */
    public final C13627t3 f47665b;

    /* JADX INFO: renamed from: c */
    public final Executor f47666c;

    /* JADX INFO: renamed from: d */
    public boolean f47667d = false;

    /* JADX INFO: renamed from: e */
    public C12997c.a<Integer> f47668e;

    /* JADX INFO: renamed from: f */
    public C13658y.c f47669f;

    public C13620s3(C13658y c13658y, C0008c0 c0008c0, Executor executor) {
        this.f47664a = c13658y;
        this.f47665b = new C13627t3(c0008c0, 0);
        this.f47666c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m49605a() {
        C12997c.a<Integer> aVar = this.f47668e;
        if (aVar != null) {
            aVar.m48317f(new InterfaceC5909m.a("Cancelled by another setExposureCompensationIndex()"));
            this.f47668e = null;
        }
        C13658y.c cVar = this.f47669f;
        if (cVar != null) {
            this.f47664a.m49790g0(cVar);
            this.f47669f = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m49606b(boolean z10) {
        if (z10 == this.f47667d) {
            return;
        }
        this.f47667d = z10;
        if (z10) {
            return;
        }
        this.f47665b.m49610b(0);
        m49605a();
    }

    /* JADX INFO: renamed from: c */
    public void m49607c(C12964a.a aVar) {
        aVar.m48222g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f47665b.m49609a()), InterfaceC8795n1.c.REQUIRED);
    }
}
