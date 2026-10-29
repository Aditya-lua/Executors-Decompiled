package om;

import android.os.Build;

/* JADX INFO: renamed from: om.s */
/* JADX INFO: loaded from: classes2.dex */
public class C9818s extends AbstractC9810k {

    /* JADX INFO: renamed from: om.s$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35620a;

        static {
            int[] iArr = new int[EnumC9813n.values().length];
            f35620a = iArr;
            try {
                iArr[EnumC9813n.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35620a[EnumC9813n.CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35620a[EnumC9813n.RECORD_AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35620a[EnumC9813n.MODIFY_AUDIO_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35620a[EnumC9813n.WRITE_EXTERNAL_STORAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35620a[EnumC9813n.READ_EXTERNAL_STORAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35620a[EnumC9813n.POST_NOTIFICATIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: om.s$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C9818s f35621a = new C9818s();
    }

    /* JADX INFO: renamed from: f0 */
    public static C9818s m38680f0() {
        return b.f35621a;
    }

    @Override // om.AbstractC9810k
    /* JADX INFO: renamed from: s */
    public String mo38655s(EnumC9813n enumC9813n) {
        switch (a.f35620a[enumC9813n.ordinal()]) {
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
