package mm;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public class r extends k {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24920a;

        static {
            int[] iArr = new int[n.values().length];
            f24920a = iArr;
            try {
                iArr[n.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24920a[n.CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24920a[n.RECORD_AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24920a[n.MODIFY_AUDIO_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24920a[n.WRITE_EXTERNAL_STORAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24920a[n.READ_EXTERNAL_STORAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24920a[n.POST_NOTIFICATIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f24921a = new r();
    }

    public static r f0() {
        return b.f24921a;
    }

    @Override // mm.k
    public String s(n nVar) {
        switch (a.f24920a[nVar.ordinal()]) {
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
                return Build.VERSION.SDK_INT >= 33 ? "android.permission.POST_NOTIFICATIONS" : "";
            default:
                return "";
        }
    }
}
