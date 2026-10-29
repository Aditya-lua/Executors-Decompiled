package p480v0;

import android.media.MediaCodec;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p021b1.C1196g;
import p140g0.C5864a2;
import p296n0.AbstractC8830u1;
import p296n0.C8802o3;
import p454u0.C11766b;

/* JADX INFO: renamed from: v0.g */
/* JADX INFO: loaded from: classes.dex */
public class C11992g {

    /* JADX INFO: renamed from: a */
    public final boolean f42467a;

    public C11992g() {
        this.f42467a = C11766b.m44046b(SurfaceOrderQuirk.class) != null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m44745a(C11992g c11992g, C8802o3.f fVar, C8802o3.f fVar2) {
        c11992g.getClass();
        return c11992g.m44746b(fVar.mo35348f()) - c11992g.m44746b(fVar2.mo35348f());
    }

    /* JADX INFO: renamed from: b */
    public final int m44746b(AbstractC8830u1 abstractC8830u1) {
        if (abstractC8830u1.m35433g() == MediaCodec.class) {
            return 2;
        }
        return (abstractC8830u1.m35433g() == C5864a2.class || abstractC8830u1.m35433g() == C1196g.class) ? 0 : 1;
    }

    /* JADX INFO: renamed from: c */
    public void m44747c(List<C8802o3.f> list) {
        if (this.f42467a) {
            Collections.sort(list, new Comparator() { // from class: v0.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C11992g.m44745a(this.f42466a, (C8802o3.f) obj, (C8802o3.f) obj2);
                }
            });
        }
    }
}
