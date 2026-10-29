package com.withpersona.sdk2.inquiry.selfie;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0018\u0010\f\u001a\u00020\t*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkn/b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "strings", "Lkn/a;", "pose", "", "b", "(Lkn/b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;Lkn/a;)Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)J", "captureCountdownTickMillis", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12990a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[kn.a.values().length];
            try {
                iArr[kn.a.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kn.a.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kn.a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kn.a.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kn.a.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f12990a = iArr;
            int[] iArr2 = new int[kn.b.values().length];
            try {
                iArr2[kn.b.FaceNotCentered.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[kn.b.FaceTooClose.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[kn.b.FaceTooFar.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[kn.b.MultipleFaces.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[kn.b.IncompleteFace.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[kn.b.FaceNotFound.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[kn.b.IncorrectPose.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[kn.b.FaceDetectionUnsupported.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[kn.b.Other.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            b = iArr2;
        }
    }

    public static final long a(@NotNull SelfieWorkflow.Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return 1000L;
    }

    @Nullable
    public static final String b(@NotNull kn.b bVar, @NotNull SelfieWorkflow.Input.Strings strings, @NotNull kn.a pose) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(pose, "pose");
        switch (a.b[bVar.ordinal()]) {
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
                int i10 = a.f12990a[pose.ordinal()];
                if (i10 == 1) {
                    return strings.getSelfieHintPoseNotCentered();
                }
                if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                    return null;
                }
                throw new jt.l();
            case 8:
                return strings.getSelfieHintCenterFace();
            case 9:
                return strings.getSelfieHintCenterFace();
            default:
                throw new jt.l();
        }
    }
}
