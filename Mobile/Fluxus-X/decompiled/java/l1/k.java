package l1;

import android.util.Rational;
import com.github.luben.zstd.BuildConfig;
import g0.r1;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {BuildConfig.FLAVOR, "captureRate", "Landroid/util/Rational;", "captureToEncodeRatio", "c", "(ILandroid/util/Rational;)I", "encodeRate", "b", "ratio", BuildConfig.FLAVOR, "a", "(Landroid/util/Rational;)Z", "camera-video_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class k {
    public static final boolean a(Rational rational) {
        return Intrinsics.c(rational, Rational.NaN) || Intrinsics.c(rational, Rational.ZERO) || Intrinsics.c(rational, Rational.NEGATIVE_INFINITY) || Intrinsics.c(rational, Rational.POSITIVE_INFINITY);
    }

    public static final int b(int i10, @Nullable Rational rational) {
        if (rational == null) {
            return i10;
        }
        if (!a(rational)) {
            return su.b.d(i10 * rational.floatValue());
        }
        r1.l("CaptureEncodeRates", "Invalid capture-to-encode ratio: " + rational);
        return i10;
    }

    public static final int c(int i10, @Nullable Rational rational) {
        if (rational == null) {
            return i10;
        }
        if (!a(rational)) {
            return su.b.d(i10 / rational.floatValue());
        }
        r1.l("CaptureEncodeRates", "Invalid capture-to-encode ratio: " + rational);
        return i10;
    }
}
