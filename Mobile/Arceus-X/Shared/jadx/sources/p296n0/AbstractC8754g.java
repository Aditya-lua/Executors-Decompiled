package p296n0;

import android.util.Range;
import android.util.Size;
import java.util.List;
import p140g0.C5902k0;

/* JADX INFO: renamed from: n0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8754g {
    /* JADX INFO: renamed from: a */
    public static AbstractC8754g m35094a(SurfaceConfig surfaceConfig, int i10, Size size, C5902k0 c5902k0, List<InterfaceC8777j4.b> list, InterfaceC8795n1 interfaceC8795n1, int i11, Range<Integer> range, boolean z10) {
        return new C8760h(surfaceConfig, i10, size, c5902k0, list, interfaceC8795n1, i11, range, z10);
    }

    /* JADX INFO: renamed from: b */
    public abstract List<InterfaceC8777j4.b> mo35095b();

    /* JADX INFO: renamed from: c */
    public abstract C5902k0 mo35096c();

    /* JADX INFO: renamed from: d */
    public abstract int mo35097d();

    /* JADX INFO: renamed from: e */
    public abstract InterfaceC8795n1 mo35098e();

    /* JADX INFO: renamed from: f */
    public abstract int mo35099f();

    /* JADX INFO: renamed from: g */
    public abstract Size mo35100g();

    /* JADX INFO: renamed from: h */
    public abstract SurfaceConfig mo35101h();

    /* JADX INFO: renamed from: i */
    public abstract Range<Integer> mo35102i();

    /* JADX INFO: renamed from: j */
    public abstract boolean mo35103j();

    /* JADX INFO: renamed from: k */
    public AbstractC8827t3 m35104k(InterfaceC8795n1 interfaceC8795n1) {
        return AbstractC8827t3.m35424a(mo35100g()).mo35405g(mo35099f()).mo35401c(mo35102i()).mo35400b(mo35096c()).mo35402d(interfaceC8795n1).mo35399a();
    }
}
