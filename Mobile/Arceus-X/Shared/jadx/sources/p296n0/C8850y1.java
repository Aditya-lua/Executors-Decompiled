package p296n0;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140g0.C5902k0;
import p533x2.C12637g;

/* JADX INFO: renamed from: n0.y1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m31665d2 = {"Ln0/y1;", "", "<init>", "()V", "Lg0/k0;", "dynamicRangeToTest", "", "fullySpecifiedDynamicRanges", "", "c", "(Lg0/k0;Ljava/util/Set;)Z", "underSpecifiedDynamicRange", "fullySpecifiedDynamicRange", "d", "(Lg0/k0;Lg0/k0;)Z", "a", "b", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C8850y1 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C8850y1 f32227a = new C8850y1();

    /* JADX WARN: Code duplicated, block: B:14:0x0034 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[RETURN] */
    /* JADX INFO: renamed from: c */
    public static final boolean m35546c(@NotNull C5902k0 dynamicRangeToTest, @NotNull Set<C5902k0> fullySpecifiedDynamicRanges) {
        Intrinsics.checkNotNullParameter(dynamicRangeToTest, "dynamicRangeToTest");
        Intrinsics.checkNotNullParameter(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangeToTest.m26519e()) {
            return fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        }
        for (Object obj : fullySpecifiedDynamicRanges) {
            if (f32227a.m35549d(dynamicRangeToTest, (C5902k0) obj)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m35547a(C5902k0 dynamicRangeToTest, C5902k0 fullySpecifiedDynamicRange) {
        C12637g.m47078j(fullySpecifiedDynamicRange.m26519e(), "Fully specified range is not actually fully specified.");
        return dynamicRangeToTest.m26516a() == 0 || dynamicRangeToTest.m26516a() == fullySpecifiedDynamicRange.m26516a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m35548b(C5902k0 dynamicRangeToTest, C5902k0 fullySpecifiedDynamicRange) {
        C12637g.m47078j(fullySpecifiedDynamicRange.m26519e(), "Fully specified range is not actually fully specified.");
        int iM26517b = dynamicRangeToTest.m26517b();
        if (iM26517b == 0) {
            return true;
        }
        int iM26517b2 = fullySpecifiedDynamicRange.m26517b();
        return (iM26517b == 2 && iM26517b2 != 1) || iM26517b == iM26517b2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m35549d(C5902k0 underSpecifiedDynamicRange, C5902k0 fullySpecifiedDynamicRange) {
        return m35547a(underSpecifiedDynamicRange, fullySpecifiedDynamicRange) && m35548b(underSpecifiedDynamicRange, fullySpecifiedDynamicRange);
    }
}
