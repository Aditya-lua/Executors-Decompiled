package ae;

import be.InterfaceC1376y0;
import de.C4554d;
import java.io.File;

/* JADX INFO: renamed from: ae.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C0173l implements InterfaceC1376y0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1376y0 f565a;

    public C0173l(InterfaceC1376y0 interfaceC1376y0) {
        this.f565a = interfaceC1376y0;
    }

    @Override // be.InterfaceC1376y0
    public final /* bridge */ /* synthetic */ Object zza() {
        File file = (File) this.f565a.zza();
        if (file == null) {
            return null;
        }
        return C4554d.m22623a(file);
    }
}
