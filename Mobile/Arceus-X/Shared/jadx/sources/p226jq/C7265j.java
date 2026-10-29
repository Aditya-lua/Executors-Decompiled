package p226jq;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C7737g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jq.j */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\t*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n\"\u0015\u0010\r\u001a\u00020\t*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\n\"\u0015\u0010\u000f\u001a\u00020\t*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n\"\u0015\u0010\u0012\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0016\u001a\u00020\u0013*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0018\u001a\u00020\u0013*\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, m31665d2 = {"", "", "g", "(I)Ljava/lang/String;", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "a", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "(D)D", "dpToPx", "c", "pxToDp", "d", "spToPx", "b", "(Ljava/lang/String;)Ljava/lang/String;", "formattedResourceName", "", "e", "(Ljava/lang/String;)Z", "isFallbackInquiryId", "f", "isRegularInquiryId", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7265j {

    /* JADX INFO: renamed from: a */
    public static final DisplayMetrics f28029a = Resources.getSystem().getDisplayMetrics();

    /* JADX INFO: renamed from: a */
    public static final double m30285a(double d10) {
        return d10 * ((double) f28029a.density);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m30286b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new Regex("[- ]").replace(lowerCase, "_");
    }

    /* JADX INFO: renamed from: c */
    public static final double m30287c(double d10) {
        return d10 / ((double) f28029a.density);
    }

    /* JADX INFO: renamed from: d */
    public static final double m30288d(double d10) {
        return d10 * ((double) f28029a.scaledDensity);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m30289e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return C7797x.m32307R(str, "iqfs", true);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m30290f(@Nullable String str) {
        if (str != null) {
            return C7797x.m32307R(str, "inq_", true);
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m30291g(int i10) {
        C7737g0 c7737g0 = C7737g0.f29434a;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i10 & ViewCompat.MEASURED_SIZE_MASK)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
