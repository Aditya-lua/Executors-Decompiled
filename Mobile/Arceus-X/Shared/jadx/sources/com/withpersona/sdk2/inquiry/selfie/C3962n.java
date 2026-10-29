package com.withpersona.sdk2.inquiry.selfie;

import kn.EnumC7638a;
import kn.EnumC7639b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.n */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0018\u0010\f\u001a\u00020\t*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m31665d2 = {"Lkn/b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "strings", "Lkn/a;", "pose", "", "b", "(Lkn/b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;Lkn/a;)Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)J", "captureCountdownTickMillis", "selfie_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3962n {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.n$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16652a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f16653b;

        static {
            int[] iArr = new int[EnumC7638a.values().length];
            try {
                iArr[EnumC7638a.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7638a.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7638a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC7638a.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC7638a.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f16652a = iArr;
            int[] iArr2 = new int[EnumC7639b.values().length];
            try {
                iArr2[EnumC7639b.FaceNotCentered.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC7639b.FaceTooClose.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC7639b.FaceTooFar.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC7639b.MultipleFaces.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC7639b.IncompleteFace.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC7639b.FaceNotFound.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC7639b.IncorrectPose.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EnumC7639b.FaceDetectionUnsupported.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[EnumC7639b.Other.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            f16653b = iArr2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final long m20115a(@NotNull SelfieWorkflow.Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return 1000L;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m20116b(@NotNull EnumC7639b enumC7639b, @NotNull SelfieWorkflow.Input.Strings strings, @NotNull EnumC7638a pose) {
        Intrinsics.checkNotNullParameter(enumC7639b, "<this>");
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(pose, "pose");
        switch (a.f16653b[enumC7639b.ordinal()]) {
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
                int i10 = a.f16652a[pose.ordinal()];
                if (i10 == 1) {
                    return strings.getSelfieHintPoseNotCentered();
                }
                if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                    return null;
                }
                throw new C7345l();
            case 8:
                return strings.getSelfieHintCenterFace();
            case 9:
                return strings.getSelfieHintCenterFace();
            default:
                throw new C7345l();
        }
    }
}
