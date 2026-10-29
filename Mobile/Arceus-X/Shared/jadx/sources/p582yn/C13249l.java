package p582yn;

import android.os.Build;
import androidx.core.os.EnvironmentCompat;
import java.io.File;
import kotlin.Metadata;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: yn.l */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m31665d2 = {"", "a", "()Z", "device_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13249l {
    /* JADX INFO: renamed from: a */
    public static final boolean m49002a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = Build.BRAND;
        if (str7 == null || (str = Build.DEVICE) == null || (str2 = Build.FINGERPRINT) == null || (str3 = Build.HARDWARE) == null || (str4 = Build.MODEL) == null || (str5 = Build.MANUFACTURER) == null || (str6 = Build.PRODUCT) == null) {
            return true;
        }
        return (C7797x.m32309T(str7, "generic", false, 2, null) && C7797x.m32309T(str, "generic", false, 2, null)) || C7797x.m32309T(str2, "generic", false, 2, null) || C7797x.m32309T(str2, EnvironmentCompat.MEDIA_UNKNOWN, false, 2, null) || StringsKt.m32152a0(str3, "goldfish", false, 2, null) || StringsKt.m32152a0(str3, "ranchu", false, 2, null) || StringsKt.m32152a0(str4, "google_sdk", false, 2, null) || StringsKt.m32152a0(str4, "Emulator", false, 2, null) || StringsKt.m32152a0(str4, "Android SDK built for x86", false, 2, null) || StringsKt.m32152a0(str5, "Genymotion", false, 2, null) || StringsKt.m32152a0(str6, "sdk_google", false, 2, null) || StringsKt.m32152a0(str6, "google_sdk", false, 2, null) || StringsKt.m32152a0(str6, "sdk", false, 2, null) || StringsKt.m32152a0(str6, "sdk_x86", false, 2, null) || StringsKt.m32152a0(str6, "sdk_gphone64_arm64", false, 2, null) || StringsKt.m32152a0(str6, "vbox86p", false, 2, null) || StringsKt.m32152a0(str6, "emulator", false, 2, null) || StringsKt.m32152a0(str6, "simulator", false, 2, null) || (new File("/storage/emulated/0/Android/data/com.android.ld.appstore/files").exists() || new File("/storage/emulated/0/Android/data/com.android.ld.appstore/cache").exists());
    }
}
