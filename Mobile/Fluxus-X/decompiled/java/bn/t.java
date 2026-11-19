package bn;

import android.os.Build;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class t extends k {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4496a;

        static {
            int[] iArr = new int[o.values().length];
            f4496a = iArr;
            try {
                iArr[o.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4496a[o.CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4496a[o.RECORD_AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4496a[o.MODIFY_AUDIO_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4496a[o.WRITE_EXTERNAL_STORAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4496a[o.READ_EXTERNAL_STORAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4496a[o.POST_NOTIFICATIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f4497a = new t();
    }

    public static t U() {
        return b.f4497a;
    }

    @Override // bn.k
    public String k(o oVar) {
        switch (a.f4496a[oVar.ordinal()]) {
            case 1:
                return "android.permission.CAMERA";
            case 2:
                return "android.permission.READ_CONTACTS";
            case 3:
                return "android.permission.RECORD_AUDIO";
            case 4:
                return "android.permission.MODIFY_AUDIO_SETTINGS";
            case 5:
                return "android.permission.WRITE_EXTERNAL_STORAGE";
            case 6:
                return "android.permission.READ_EXTERNAL_STORAGE";
            case 7:
                return Build.VERSION.SDK_INT >= 33 ? "android.permission.POST_NOTIFICATIONS" : BuildConfig.FLAVOR;
            default:
                return BuildConfig.FLAVOR;
        }
    }
}
