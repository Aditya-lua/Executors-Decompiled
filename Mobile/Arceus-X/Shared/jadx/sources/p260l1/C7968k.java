package p260l1;

import android.util.Rational;
import cu.C4366b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p140g0.C5931r1;

/* JADX INFO: renamed from: l1.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"", "captureRate", "Landroid/util/Rational;", "captureToEncodeRatio", "c", "(ILandroid/util/Rational;)I", "encodeRate", "b", "ratio", "", "a", "(Landroid/util/Rational;)Z", "camera-video_release"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C7968k {
    /* JADX INFO: renamed from: a */
    public static final boolean m32989a(Rational rational) {
        return Intrinsics.m31980c(rational, Rational.NaN) || Intrinsics.m31980c(rational, Rational.ZERO) || Intrinsics.m31980c(rational, Rational.NEGATIVE_INFINITY) || Intrinsics.m31980c(rational, Rational.POSITIVE_INFINITY);
    }

    /* JADX INFO: renamed from: b */
    public static final int m32990b(int i10, @Nullable Rational rational) {
        if (rational == null) {
            return i10;
        }
        if (!m32989a(rational)) {
            return C4366b.m22016d(i10 * rational.floatValue());
        }
        C5931r1.m26572l("CaptureEncodeRates", "Invalid capture-to-encode ratio: " + rational);
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public static final int m32991c(int i10, @Nullable Rational rational) {
        if (rational == null) {
            return i10;
        }
        if (!m32989a(rational)) {
            return C4366b.m22016d(i10 / rational.floatValue());
        }
        C5931r1.m26572l("CaptureEncodeRates", "Invalid capture-to-encode ratio: " + rational);
        return i10;
    }
}
