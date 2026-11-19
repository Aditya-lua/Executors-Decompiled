package fq;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfq/n0;", BuildConfig.FLAVOR, "c", "(Lfq/n0;)Ljava/lang/String;", "Lfq/s1;", "b", "(Lfq/s1;)Ljava/lang/String;", "Lfq/z;", "a", "(Lfq/n0;)Lfq/z;", "permissions_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class x1 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16553a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[n0.values().length];
            try {
                iArr[n0.Camera.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n0.RecordAudio.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n0.RoughLocation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n0.PreciseLocation.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16553a = iArr;
            int[] iArr2 = new int[s1.values().length];
            try {
                iArr2[s1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[s1.PermissionRejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[s1.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    @NotNull
    public static final z a(@NotNull n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        int i10 = a.f16553a[n0Var.ordinal()];
        if (i10 == 1) {
            return z.Camera;
        }
        if (i10 == 2) {
            return z.RecordAudio;
        }
        if (i10 == 3) {
            return z.RoughLocation;
        }
        if (i10 == 4) {
            return z.PreciseLocation;
        }
        throw new zt.l();
    }

    @NotNull
    public static final String b(@NotNull s1 s1Var) {
        Intrinsics.checkNotNullParameter(s1Var, "<this>");
        int i10 = a.b[s1Var.ordinal()];
        if (i10 == 1) {
            return "granted";
        }
        if (i10 == 2) {
            return "denied";
        }
        if (i10 == 3) {
            return "settings_opened";
        }
        throw new zt.l();
    }

    @NotNull
    public static final String c(@NotNull n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        int i10 = a.f16553a[n0Var.ordinal()];
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
        throw new zt.l();
    }
}
