package p296n0;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import p140g0.C5931r1;

/* JADX INFO: renamed from: n0.q1 */
/* JADX INFO: loaded from: classes.dex */
public class C8810q1 {

    /* JADX INFO: renamed from: a */
    public static final Set<EnumC8719a0> f32047a = Collections.unmodifiableSet(EnumSet.of(EnumC8719a0.PASSIVE_FOCUSED, EnumC8719a0.PASSIVE_NOT_FOCUSED, EnumC8719a0.LOCKED_FOCUSED, EnumC8719a0.LOCKED_NOT_FOCUSED));

    /* JADX INFO: renamed from: b */
    public static final Set<EnumC8731c0> f32048b = Collections.unmodifiableSet(EnumSet.of(EnumC8731c0.CONVERGED, EnumC8731c0.UNKNOWN));

    /* JADX INFO: renamed from: c */
    public static final Set<EnumC8848y> f32049c;

    /* JADX INFO: renamed from: d */
    public static final Set<EnumC8848y> f32050d;

    static {
        EnumC8848y enumC8848y = EnumC8848y.CONVERGED;
        EnumC8848y enumC8848y2 = EnumC8848y.FLASH_REQUIRED;
        EnumC8848y enumC8848y3 = EnumC8848y.UNKNOWN;
        Set<EnumC8848y> setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(enumC8848y, enumC8848y2, enumC8848y3));
        f32049c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(enumC8848y2);
        enumSetCopyOf.remove(enumC8848y3);
        f32050d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m35374a(InterfaceC8743e0 interfaceC8743e0, boolean z10) {
        boolean z11 = interfaceC8743e0.mo6740i() == EnumC8853z.OFF || f32047a.contains(interfaceC8743e0.mo6738g());
        boolean z12 = interfaceC8743e0.mo6737f() == EnumC8843x.OFF;
        boolean z13 = !z10 ? !(z12 || f32049c.contains(interfaceC8743e0.mo6741j())) : !(z12 || f32050d.contains(interfaceC8743e0.mo6741j()));
        boolean z14 = interfaceC8743e0.mo6736d() == EnumC8725b0.OFF || f32048b.contains(interfaceC8743e0.mo6739h());
        C5931r1.m26561a("ConvergenceUtils", "checkCaptureResult, AE=" + interfaceC8743e0.mo6741j() + " AF =" + interfaceC8743e0.mo6738g() + " AWB=" + interfaceC8743e0.mo6739h());
        return z11 && z13 && z14;
    }
}
