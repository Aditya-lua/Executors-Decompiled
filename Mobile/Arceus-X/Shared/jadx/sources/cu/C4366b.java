package cu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;

/* JADX INFO: renamed from: cu.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0004*\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"", "", "c", "(D)I", "", "e", "(D)J", "", "d", "(F)I", "f", "(F)J", "a", "(I)I", "getSign$annotations", "(I)V", "sign", "b", "(J)I", "(J)V", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/math/MathKt")
public class C4366b extends C4365a {
    /* JADX INFO: renamed from: a */
    public static int m22013a(int i10) {
        return Integer.signum(i10);
    }

    /* JADX INFO: renamed from: b */
    public static int m22014b(long j10) {
        return Long.signum(j10);
    }

    /* JADX INFO: renamed from: c */
    public static int m22015c(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d10 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        return d10 < -2.147483648E9d ? EditorInfoCompat.IME_FLAG_FORCE_ASCII : (int) Math.round(d10);
    }

    /* JADX INFO: renamed from: d */
    public static int m22016d(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    /* JADX INFO: renamed from: e */
    public static long m22017e(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d10);
    }

    /* JADX INFO: renamed from: f */
    public static long m22018f(float f10) {
        return m22017e(f10);
    }
}
