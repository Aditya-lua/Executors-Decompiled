package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p115f1.AbstractC5245c2;
import p282m1.InterfaceC8389r1;
import p296n0.InterfaceC8721a2;
import p296n0.InterfaceC8758g3;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8855z1;
import p297n1.C8860c;
import p503w0.C12274d;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedQualityQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: i */
    public static Range<Integer> m2289i(InterfaceC8721a2.c cVar, InterfaceC8389r1.a aVar) {
        InterfaceC8389r1 interfaceC8389r1Mo34064a = aVar.mo34064a(cVar.mo34995i());
        return interfaceC8389r1Mo34064a != null ? interfaceC8389r1Mo34064a.mo34057g() : AbstractC5245c2.f20322a;
    }

    /* JADX INFO: renamed from: j */
    private static boolean m2290j() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2291k() {
        return m2290j();
    }

    /* JADX INFO: renamed from: g */
    public Map<Integer, InterfaceC8721a2> m2292g(InterfaceC8799o0 interfaceC8799o0, InterfaceC8855z1 interfaceC8855z1, InterfaceC8389r1.a aVar) {
        return m2290j() ? m2293h(interfaceC8799o0, interfaceC8855z1, aVar) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: h */
    public final Map<Integer, InterfaceC8721a2> m2293h(InterfaceC8799o0 interfaceC8799o0, InterfaceC8855z1 interfaceC8855z1, InterfaceC8389r1.a aVar) {
        InterfaceC8721a2 interfaceC8721a2Mo27504b;
        InterfaceC8721a2.c cVarM35578b;
        if (!"1".equals(interfaceC8799o0.mo6750e()) || interfaceC8855z1.mo27503a(4) || (cVarM35578b = C8860c.m35578b((interfaceC8721a2Mo27504b = interfaceC8855z1.mo27504b(1)))) == null) {
            return null;
        }
        Range<Integer> rangeM2289i = m2289i(cVarM35578b, aVar);
        Size size = C12274d.f43483d;
        InterfaceC8721a2.b bVarM34986h = InterfaceC8721a2.b.m34986h(interfaceC8721a2Mo27504b.mo27489a(), interfaceC8721a2Mo27504b.mo27491e(), interfaceC8721a2Mo27504b.mo27492f(), Collections.singletonList(C8860c.m35577a(cVarM35578b, size, rangeM2289i)));
        HashMap map = new HashMap();
        map.put(4, bVarM34986h);
        if (C12274d.m45571c(size) > C12274d.m45571c(cVarM35578b.m34997k())) {
            map.put(1, bVarM34986h);
        }
        return map;
    }
}
