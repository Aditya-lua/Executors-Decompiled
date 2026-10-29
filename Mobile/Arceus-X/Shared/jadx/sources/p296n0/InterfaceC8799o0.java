package p296n0;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p140g0.C5888g2;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p140g0.InterfaceC5937t;
import p140g0.InterfaceC5957y;
import p182i0.AbstractC6600b;
import p204j0.ResolvedFeatureGroup;
import p424s0.C11145f;

/* JADX INFO: renamed from: n0.o0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8799o0 extends InterfaceC5937t {
    /* JADX INFO: renamed from: A */
    default boolean m35294A(ResolvedFeatureGroup c7012b, C5888g2 c5888g2) {
        for (AbstractC6600b abstractC6600b : c7012b.m29677a()) {
            if (!abstractC6600b.mo28506d(this, c5888g2)) {
                C5931r1.m26561a("CameraInfoInternal", abstractC6600b + " is not supported.");
                return false;
            }
        }
        try {
            C8735c4.m35033c(this, c5888g2, false, c7012b);
            return true;
        } catch (IllegalArgumentException | C11145f.a e10) {
            C5931r1.m26562b("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    Set<Integer> mo35042a();

    /* JADX INFO: renamed from: c */
    Set<C5902k0> mo35043c();

    /* JADX INFO: renamed from: e */
    String mo6750e();

    /* JADX INFO: renamed from: f */
    void mo35044f(Executor executor, AbstractC8828u abstractC8828u);

    /* JADX INFO: renamed from: g */
    default void mo35045g(InterfaceC5957y interfaceC5957y) {
        C8735c4.m35032b(interfaceC5957y);
    }

    /* JADX INFO: renamed from: h */
    Rect mo35046h();

    /* JADX INFO: renamed from: j */
    List<Size> mo35047j(int i10);

    /* JADX INFO: renamed from: k */
    Object mo35048k();

    /* JADX INFO: renamed from: l */
    C8782k3 mo35049l();

    /* JADX INFO: renamed from: m */
    List<Size> mo35050m(int i10);

    /* JADX INFO: renamed from: n */
    default Set<Integer> mo35051n() {
        return Collections.EMPTY_SET;
    }

    /* JADX INFO: renamed from: o */
    boolean mo35052o();

    /* JADX INFO: renamed from: q */
    default InterfaceC8799o0 mo35053q() {
        return this;
    }

    /* JADX INFO: renamed from: r */
    List<Size> mo35054r(Range<Integer> range);

    /* JADX INFO: renamed from: s */
    boolean mo35055s();

    /* JADX INFO: renamed from: t */
    EnumC8723a4 mo35056t();

    /* JADX INFO: renamed from: v */
    void mo35057v(AbstractC8828u abstractC8828u);

    /* JADX INFO: renamed from: x */
    InterfaceC8855z1 mo35058x();

    /* JADX INFO: renamed from: y */
    List<Size> mo35059y();
}
