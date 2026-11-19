package mq;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0018\u0010\f\u001a\u00020\t*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lxn/c;", "Lmq/q5$b$b;", "strings", "Lxn/a;", "pose", BuildConfig.FLAVOR, "b", "(Lxn/c;Lmq/q5$b$b;Lxn/a;)Ljava/lang/String;", "Lmq/q5$b;", BuildConfig.FLAVOR, "a", "(Lmq/q5$b;)J", "captureCountdownTickMillis", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b1 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23513a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[xn.a.values().length];
            try {
                iArr[xn.a.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xn.a.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xn.a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[xn.a.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[xn.a.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f23513a = iArr;
            int[] iArr2 = new int[xn.c.values().length];
            try {
                iArr2[xn.c.FaceNotCentered.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[xn.c.FaceTooClose.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[xn.c.FaceTooFar.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[xn.c.MultipleFaces.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[xn.c.IncompleteFace.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[xn.c.FaceNotFound.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[xn.c.IncorrectPose.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[xn.c.FaceDetectionUnsupported.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[xn.c.Other.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            b = iArr2;
        }
    }

    public static final long a(@NotNull q5.Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return 1000L;
    }

    @Nullable
    public static final String b(@NotNull xn.c cVar, @NotNull q5.Input.Strings strings, @NotNull xn.a pose) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(pose, "pose");
        switch (a.b[cVar.ordinal()]) {
            case 1:
                return strings.getSelfieHintCenterFace();
            case 2:
                return strings.getSelfieHintFaceTooClose();
            case 3:
                return strings.getSelfieHintFaceTooFar();
            case 4:
                return strings.getSelfieHintMultipleFaces();
            case 5:
                return strings.getSelfieHintFaceIncomplete();
            case 6:
                return strings.getSelfieHintCenterFace();
            case 7:
                int i10 = a.f23513a[pose.ordinal()];
                if (i10 == 1) {
                    return strings.getSelfieHintPoseNotCentered();
                }
                if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                    return null;
                }
                throw new zt.l();
            case 8:
                return strings.getSelfieHintCenterFace();
            case 9:
                return strings.getSelfieHintCenterFace();
            default:
                throw new zt.l();
        }
    }
}
