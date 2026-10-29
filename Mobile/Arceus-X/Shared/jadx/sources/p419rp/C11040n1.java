package p419rp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;

/* JADX INFO: renamed from: rp.n1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lrp/i0;", "", "c", "(Lrp/i0;)Ljava/lang/String;", "Lrp/j1;", "b", "(Lrp/j1;)Ljava/lang/String;", "Lrp/u;", "a", "(Lrp/i0;)Lrp/u;", "permissions_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11040n1 {

    /* JADX INFO: renamed from: rp.n1$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39014a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f39015b;

        static {
            int[] iArr = new int[EnumC11024i0.values().length];
            try {
                iArr[EnumC11024i0.Camera.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11024i0.RecordAudio.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11024i0.RoughLocation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC11024i0.PreciseLocation.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f39014a = iArr;
            int[] iArr2 = new int[EnumC11028j1.values().length];
            try {
                iArr2[EnumC11028j1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC11028j1.PermissionRejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC11028j1.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f39015b = iArr2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final EnumC11055u m41735a(@NotNull EnumC11024i0 enumC11024i0) {
        Intrinsics.checkNotNullParameter(enumC11024i0, "<this>");
        int i10 = a.f39014a[enumC11024i0.ordinal()];
        if (i10 == 1) {
            return EnumC11055u.Camera;
        }
        if (i10 == 2) {
            return EnumC11055u.RecordAudio;
        }
        if (i10 == 3) {
            return EnumC11055u.RoughLocation;
        }
        if (i10 == 4) {
            return EnumC11055u.PreciseLocation;
        }
        throw new C7345l();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m41736b(@NotNull EnumC11028j1 enumC11028j1) {
        Intrinsics.checkNotNullParameter(enumC11028j1, "<this>");
        int i10 = a.f39015b[enumC11028j1.ordinal()];
        if (i10 == 1) {
            return "granted";
        }
        if (i10 == 2) {
            return "denied";
        }
        if (i10 == 3) {
            return "settings_opened";
        }
        throw new C7345l();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m41737c(@NotNull EnumC11024i0 enumC11024i0) {
        Intrinsics.checkNotNullParameter(enumC11024i0, "<this>");
        int i10 = a.f39014a[enumC11024i0.ordinal()];
        if (i10 == 1) {
            return "android.permission.CAMERA";
        }
        if (i10 == 2) {
            return "android.permission.RECORD_AUDIO";
        }
        if (i10 == 3) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        if (i10 == 4) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        throw new C7345l();
    }
}
