package n0;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<a0> f24815a = Collections.unmodifiableSet(EnumSet.of(a0.PASSIVE_FOCUSED, a0.PASSIVE_NOT_FOCUSED, a0.LOCKED_FOCUSED, a0.LOCKED_NOT_FOCUSED));
    public static final Set<c0> b = Collections.unmodifiableSet(EnumSet.of(c0.CONVERGED, c0.UNKNOWN));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<y> f24816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<y> f24817d;

    static {
        y yVar = y.CONVERGED;
        y yVar2 = y.FLASH_REQUIRED;
        y yVar3 = y.UNKNOWN;
        Set<y> setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(yVar, yVar2, yVar3));
        f24816c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(yVar2);
        enumSetCopyOf.remove(yVar3);
        f24817d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    public static boolean a(e0 e0Var, boolean z10) {
        boolean z11 = e0Var.i() == z.OFF || f24815a.contains(e0Var.g());
        boolean z12 = e0Var.f() == x.OFF;
        boolean z13 = !z10 ? !(z12 || f24816c.contains(e0Var.j())) : !(z12 || f24817d.contains(e0Var.j()));
        boolean z14 = e0Var.d() == b0.OFF || b.contains(e0Var.h());
        g0.r1.a("ConvergenceUtils", "checkCaptureResult, AE=" + e0Var.j() + " AF =" + e0Var.g() + " AWB=" + e0Var.h());
        return z11 && z13 && z14;
    }
}
