package p140g0;

import androidx.camera.core.InterfaceC0494d;
import p296n0.InterfaceC8775j2;
import p366q0.C10417c;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;

/* JADX INFO: renamed from: g0.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5958y0 extends AbstractC5954x0 {

    /* JADX INFO: renamed from: g0.y0$a */
    public class a implements InterfaceC10762c<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0494d f22748a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(InterfaceC0494d interfaceC0494d) {
            this.f22748a = interfaceC0494d;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            this.f22748a.close();
        }
    }

    @Override // p140g0.AbstractC5954x0
    /* JADX INFO: renamed from: d */
    public InterfaceC0494d mo2198d(InterfaceC8775j2 interfaceC8775j2) {
        return interfaceC8775j2.mo2213g();
    }

    @Override // p140g0.AbstractC5954x0
    /* JADX INFO: renamed from: f */
    public void mo2199f() {
    }

    @Override // p140g0.AbstractC5954x0
    /* JADX INFO: renamed from: l */
    public void mo2200l(InterfaceC0494d interfaceC0494d) {
        C10773n.m40987j(m26727e(interfaceC0494d), new a(interfaceC0494d), C10417c.m40081b());
    }
}
