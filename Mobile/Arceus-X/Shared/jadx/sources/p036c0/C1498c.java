package p036c0;

import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: c0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u0004*\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lc0/c;", "", "<init>", "()V", "", "d", "()Z", "c", "", "vendor", "b", "(Ljava/lang/String;)Z", "other", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "camera-camera2_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C1498c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C1498c f5776a = new C1498c();

    /* JADX INFO: renamed from: d */
    public static final boolean m7648d() {
        if (Build.VERSION.SDK_INT < 31 || !C7797x.m32294E("Spreadtrum", Build.SOC_MANUFACTURER, true)) {
            String HARDWARE = Build.HARDWARE;
            Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
            Locale locale = Locale.ROOT;
            String lowerCase = HARDWARE.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!C7797x.m32309T(lowerCase, "ums", false, 2, null)) {
                if (f5776a.m7651c()) {
                    Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                    String lowerCase2 = HARDWARE.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    if (C7797x.m32309T(lowerCase2, "sp", false, 2, null)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7649a(String str, String str2) {
        return C7797x.m32294E(str, str2, true);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7650b(String vendor) {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (m7649a(MANUFACTURER, vendor)) {
            return true;
        }
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        return m7649a(BRAND, vendor);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7651c() {
        return m7650b("Itel");
    }
}
