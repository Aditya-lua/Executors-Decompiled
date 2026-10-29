package ae;

import android.content.Context;
import be.InterfaceC1376y0;

/* JADX INFO: renamed from: ae.b0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0153b0 implements InterfaceC1376y0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1376y0 f523a;

    public C0153b0(InterfaceC1376y0 interfaceC1376y0) {
        this.f523a = interfaceC1376y0;
    }

    @Override // be.InterfaceC1376y0
    public final /* bridge */ /* synthetic */ Object zza() {
        Context contextM527a = ((C0171k) this.f523a).m527a();
        return new C0150a0(contextM527a, contextM527a.getPackageName());
    }
}
