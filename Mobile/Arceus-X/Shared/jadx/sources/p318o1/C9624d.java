package p318o1;

import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p282m1.InterfaceC8389r1;
import p296n0.C8782k3;
import p296n0.InterfaceC8721a2;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8855z1;
import p533x2.C12637g;

/* JADX INFO: renamed from: o1.d */
/* JADX INFO: loaded from: classes.dex */
public class C9624d implements InterfaceC8855z1 {

    /* JADX INFO: renamed from: c */
    public final InterfaceC8855z1 f34908c;

    /* JADX INFO: renamed from: d */
    public Map<Integer, InterfaceC8721a2> f34909d;

    public C9624d(InterfaceC8855z1 interfaceC8855z1, C8782k3 c8782k3, InterfaceC8799o0 interfaceC8799o0, InterfaceC8389r1.a aVar) {
        this.f34908c = interfaceC8855z1;
        List listM35235c = c8782k3.m35235c(ExtraSupportedQualityQuirk.class);
        if (listM35235c.isEmpty()) {
            return;
        }
        C12637g.m47077i(listM35235c.size() == 1);
        Map<Integer, InterfaceC8721a2> mapM2292g = ((ExtraSupportedQualityQuirk) listM35235c.get(0)).m2292g(interfaceC8799o0, interfaceC8855z1, aVar);
        if (mapM2292g != null) {
            this.f34909d = new HashMap(mapM2292g);
        }
    }

    /* JADX INFO: renamed from: c */
    private InterfaceC8721a2 m37983c(int i10) {
        Map<Integer, InterfaceC8721a2> map = this.f34909d;
        return (map == null || !map.containsKey(Integer.valueOf(i10))) ? this.f34908c.mo27504b(i10) : this.f34909d.get(Integer.valueOf(i10));
    }

    @Override // p296n0.InterfaceC8855z1
    /* JADX INFO: renamed from: a */
    public boolean mo27503a(int i10) {
        return m37983c(i10) != null;
    }

    @Override // p296n0.InterfaceC8855z1
    /* JADX INFO: renamed from: b */
    public InterfaceC8721a2 mo27504b(int i10) {
        return m37983c(i10);
    }
}
