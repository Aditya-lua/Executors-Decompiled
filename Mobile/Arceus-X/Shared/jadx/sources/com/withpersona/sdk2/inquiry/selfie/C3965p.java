package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.permissions.C3858g;
import com.withpersona.sdk2.inquiry.selfie.C3965p;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType;
import java.util.ArrayList;
import java.util.List;
import kn.EnumC7638a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.AbstractC5685h;
import p132fn.C5678d0;
import p132fn.C5686h0;
import p132fn.C5688i0;
import p132fn.C5694l0;
import p132fn.C5696m0;
import p132fn.C5713v;
import p132fn.C5714v0;
import p134fq.C5776l2;
import p226jq.C7259g;
import p229jt.C7345l;
import p419rp.EnumC11024i0;
import p476ur.InterfaceC11932a;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13208b0;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.p */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a1\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00140\u0004R\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001aY\u0010\u0015\u001a\u00020\u0006*\u00160\u0004R\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a=\u0010\u001f\u001a\u00020\u001e*\"0\u0017R\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 \u001aM\u0010%\u001a\u0012\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001e0\"j\u0002`$*\"0\u0017R\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u00182\b\b\u0002\u0010!\u001a\u00020\u0001H\u0000¢\u0006\u0004\b%\u0010&\u001aO\u0010,\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020'2&\u0010)\u001a\"0\u0017R\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u00182\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0001H\u0000¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010/\u001a\u00020.*\u00020\nH\u0000¢\u0006\u0004\b/\u00100\u001a\u0013\u00103\u001a\u000202*\u000201H\u0000¢\u0006\u0004\b3\u00104\u001a\u0013\u00107\u001a\u000206*\u000205H\u0000¢\u0006\u0004\b7\u00108\u001a\u0013\u0010;\u001a\u00020:*\u000209H\u0000¢\u0006\u0004\b;\u0010<\u001a\u0013\u0010=\u001a\u00020\u0001*\u00020\u0006H\u0000¢\u0006\u0004\b=\u0010>\"\u001a\u0010B\u001a\u0004\u0018\u00010\u000e*\u00020?8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "", "B", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Z", "Lym/r$c;", "Lym/r;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "addCurrentState", "k", "(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "D", "(Lym/r$c;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "", "Lur/a;", "webRtcManagerBridge", "", "x", "(Lym/k$a;Lur/a;)V", "inRecoverableState", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "m", "(Lym/k$a;Z)Lkotlin/jvm/functions/Function1;", "Landroid/content/Context;", "context", "renderContext", "renderProps", "useVideoCapture", "z", "(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "C", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "E", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "Lkn/a;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "G", "(Lkn/a;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureMethod;", "F", "(Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureMethod;", "H", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Z", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "w", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;)Ljava/lang/String;", "centerSelfieFilePath", "selfie_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3965p {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.p$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16688a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f16689b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f16690c;

        static {
            int[] iArr = new int[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.values().length];
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.CENTER_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_LEFT_HINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_LEFT_COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_RIGHT_HINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_RIGHT_COMPLETE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_UP_HINT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_UP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_UP_COMPLETE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_DOWN_HINT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_DOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.LOOK_DOWN_COMPLETE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.FINALIZING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.COMPLETE_WITH_CAPTURE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SelfieWorkflow.AbstractC3928c.c.EnumC14142c.COMPLETE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f16688a = iArr;
            int[] iArr2 = new int[EnumC7638a.values().length];
            try {
                iArr2[EnumC7638a.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[EnumC7638a.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[EnumC7638a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[EnumC7638a.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[EnumC7638a.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            f16689b = iArr2;
            int[] iArr3 = new int[Selfie.EnumC3902a.values().length];
            try {
                iArr3[Selfie.EnumC3902a.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[Selfie.EnumC3902a.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            f16690c = iArr3;
        }
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m20161A(List list, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        SelfieState selfieState = (SelfieState) action.m48901c();
        if (selfieState instanceof SelfieState.WaitForCameraFeed) {
            action.m48903e(SelfieState.WaitForCameraFeed.m19402A((SelfieState.WaitForCameraFeed) selfieState, !list.contains(EnumC11024i0.Camera), !list.contains(EnumC11024i0.RecordAudio), null, null, null, false, null, false, 252, null));
        } else {
            C5776l2.m26151c((SelfieState) action.m48901c());
            action.m48903e(new SelfieState.RestartCamera(false, false, m20179k(action, false), ((SelfieState) action.m48901c()).getCameraFacingMode(), 3, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m20162B(@NotNull InternalErrorInfo internalErrorInfo) {
        Intrinsics.checkNotNullParameter(internalErrorInfo, "<this>");
        return (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) && ((InternalErrorInfo.NetworkErrorInfo) internalErrorInfo).isRecoverable();
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public static final SelfieWorkflow.AbstractC3928c.c.AssetOverrides m20163C(@NotNull SelfieWorkflow.Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        NextStep.Selfie.AssetConfig.RecordPage recordPage = input.getAssetConfig().getRecordPage();
        RemoteImage selfieLeftPictograph = recordPage != null ? recordPage.getSelfieLeftPictograph() : null;
        NextStep.Selfie.AssetConfig.RecordPage recordPage2 = input.getAssetConfig().getRecordPage();
        return new SelfieWorkflow.AbstractC3928c.c.AssetOverrides(selfieLeftPictograph, recordPage2 != null ? recordPage2.getSelfieRightPictograph() : null);
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public static final SelfieState m20164D(@NotNull AbstractC13225r<? super SelfieWorkflow.Input, SelfieState, ?>.c cVar, @NotNull List<? extends Selfie> selfies, @Nullable String str, @NotNull CameraProperties cameraProperties, long j10, @Nullable SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(selfies, "selfies");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        ArrayList arrayList = new ArrayList();
        for (Object obj : selfies) {
            Selfie selfie = (Selfie) obj;
            if (selfie instanceof Selfie.SelfieImage ? cVar.m48900b().getPoseConfigs().m19281a(((Selfie.SelfieImage) selfie).getPose()).getAllowReview() : false) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return new SelfieState.Submit(selfies, str, cameraProperties, j10, selfieState, cVar.m48901c().getCameraFacingMode(), 0, null, 192, null);
        }
        return new SelfieState.ReviewCaptures(selfies, arrayList, str, cameraProperties, j10, selfieState, cVar.m48901c().getCameraFacingMode());
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public static final SelfieWorkflow.AbstractC3928c.a.b m20165E(@NotNull SelfieWorkflow.AbstractC3928c.c.EnumC14142c enumC14142c) {
        Intrinsics.checkNotNullParameter(enumC14142c, "<this>");
        switch (a.f16688a[enumC14142c.ordinal()]) {
            case 1:
                return SelfieWorkflow.AbstractC3928c.a.b.CLEAR;
            case 2:
            case 3:
                return SelfieWorkflow.AbstractC3928c.a.b.CENTER;
            case 4:
            case 5:
            case 6:
                return SelfieWorkflow.AbstractC3928c.a.b.LOOK_LEFT;
            case 7:
            case 8:
            case 9:
                return SelfieWorkflow.AbstractC3928c.a.b.LOOK_RIGHT;
            case 10:
            case 11:
            case 12:
                return SelfieWorkflow.AbstractC3928c.a.b.LOOK_UP;
            case 13:
            case 14:
            case 15:
                return SelfieWorkflow.AbstractC3928c.a.b.LOOK_DOWN;
            case 16:
                return SelfieWorkflow.AbstractC3928c.a.b.FINALIZING;
            case 17:
                return SelfieWorkflow.AbstractC3928c.a.b.CLEAR;
            case 18:
                return SelfieWorkflow.AbstractC3928c.a.b.CLEAR;
            default:
                throw new C7345l();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public static final SelfieCaptureMethod m20166F(@NotNull Selfie.EnumC3902a enumC3902a) {
        Intrinsics.checkNotNullParameter(enumC3902a, "<this>");
        int i10 = a.f16690c[enumC3902a.ordinal()];
        if (i10 == 1) {
            return SelfieCaptureMethod.AUTO;
        }
        if (i10 == 2) {
            return SelfieCaptureMethod.MANUAL;
        }
        throw new C7345l();
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public static final SelfiePoseType m20167G(@NotNull EnumC7638a enumC7638a) {
        Intrinsics.checkNotNullParameter(enumC7638a, "<this>");
        int i10 = a.f16689b[enumC7638a.ordinal()];
        if (i10 == 1) {
            return SelfiePoseType.CENTER;
        }
        if (i10 == 2) {
            return SelfiePoseType.LEFT;
        }
        if (i10 == 3) {
            return SelfiePoseType.RIGHT;
        }
        if (i10 == 4) {
            return SelfiePoseType.UP;
        }
        if (i10 == 5) {
            return SelfiePoseType.DOWN;
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m20168H(@NotNull SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(selfieState, "<this>");
        if ((selfieState instanceof SelfieState.Capture) || (selfieState instanceof SelfieState.CaptureTransition) || (selfieState instanceof SelfieState.CountdownToCapture) || (selfieState instanceof SelfieState.CountdownToManualCapture) || (selfieState instanceof SelfieState.ShowPoseHint) || (selfieState instanceof SelfieState.StartCapture) || (selfieState instanceof SelfieState.StartCaptureFaceDetected) || (selfieState instanceof SelfieState.WaitForCameraFeed) || (selfieState instanceof SelfieState.WaitForWebRtcSetup) || (selfieState instanceof SelfieState.FinalizeWebRtc) || (selfieState instanceof SelfieState.WebRtcFinished) || (selfieState instanceof SelfieState.FinalizeLocalVideoCapture) || (selfieState instanceof SelfieState.AcquireNextPose)) {
            return true;
        }
        if ((selfieState instanceof SelfieState.ShowInstructions) || (selfieState instanceof SelfieState.RestartCamera) || (selfieState instanceof SelfieState.ReviewCaptures) || (selfieState instanceof SelfieState.Submit)) {
            return false;
        }
        throw new C7345l();
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final SelfieState m20179k(@NotNull AbstractC13225r<?, SelfieState, ?>.c cVar, boolean z10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return z10 ? cVar.m48901c() : cVar.m48901c().getBackState();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ SelfieState m20180l(AbstractC13225r.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return m20179k(cVar, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final Function1<Throwable, Unit> m20181m(@NotNull final AbstractC13218k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.AbstractC3927b, ? extends Object>.a aVar, final boolean z10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new Function1() { // from class: yp.f5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3965p.m20183o(aVar, z10, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Function1 m20182n(AbstractC13218k.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return m20181m(aVar, z10);
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m20183o(AbstractC13218k.a aVar, final boolean z10, final Throwable cameraError) {
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        if (!(cameraError instanceof AbstractC5685h)) {
            aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: yp.h5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3965p.m20184p(cameraError, (AbstractC13225r.c) obj);
                }
            }, 1, null));
            return Unit.f29331a;
        }
        AbstractC5685h abstractC5685h = (AbstractC5685h) cameraError;
        if (!(abstractC5685h instanceof C5686h0)) {
            if (abstractC5685h instanceof C5688i0) {
                aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: yp.i5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3965p.m20185q((AbstractC13225r.c) obj);
                    }
                }, 1, null));
            } else if (abstractC5685h instanceof C5678d0) {
                aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: yp.j5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3965p.m20186r((AbstractC13225r.c) obj);
                    }
                }, 1, null));
            } else if (abstractC5685h instanceof C5696m0) {
                aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: yp.k5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3965p.m20187s(z10, (AbstractC13225r.c) obj);
                    }
                }, 1, null));
            } else if (abstractC5685h instanceof C5713v) {
                aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: yp.l5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3965p.m20188t((AbstractC13225r.c) obj);
                    }
                }, 1, null));
            } else if (abstractC5685h instanceof C5714v0) {
                aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: yp.m5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3965p.m20189u((AbstractC13225r.c) obj);
                    }
                }, 1, null));
            } else {
                if (!(abstractC5685h instanceof C5694l0)) {
                    throw new C7345l();
                }
                aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: yp.n5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3965p.m20190v(z10, (AbstractC13225r.c) obj);
                    }
                }, 1, null));
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m20184p(Throwable th2, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + th2.getClass().getCanonicalName())));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m20185q(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m20186r(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m20187s(boolean z10, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            C5776l2.m26151c((SelfieState) action.m48901c());
            if (m20168H((SelfieState) action.m48901c())) {
                action.m48903e(new SelfieState.RestartCamera(false, false, m20179k(action, false), ((SelfieState) action.m48901c()).getCameraFacingMode(), 3, null));
            }
        } else {
            action.m48902d(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.CameraErrorInfo("Recording too long.")));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m20188t(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m20189u(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m20190v(boolean z10, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            C5776l2.m26151c((SelfieState) action.m48901c());
            if (m20168H((SelfieState) action.m48901c())) {
                action.m48903e(new SelfieState.RestartCamera(false, false, m20179k(action, false), ((SelfieState) action.m48901c()).getCameraFacingMode(), 3, null));
            }
        } else {
            action.m48902d(new SelfieWorkflow.AbstractC3927b.Error(new InternalErrorInfo.CameraErrorInfo("Recording interrupted.")));
        }
        return Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public static final String m20191w(@NotNull SelfieState.Submit submit) {
        Object obj;
        Intrinsics.checkNotNullParameter(submit, "<this>");
        List<Selfie> listMo19297w = submit.mo19297w();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listMo19297w) {
            if (obj2 instanceof Selfie.SelfieImage) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        do {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
        } while (((Selfie.SelfieImage) obj).getPose() != EnumC7638a.Center);
        Selfie.SelfieImage selfieImage = (Selfie.SelfieImage) obj;
        if (selfieImage != null) {
            return selfieImage.getAbsoluteFilePath();
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static final void m20192x(@NotNull AbstractC13218k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.AbstractC3927b, ? extends Object>.a aVar, @Nullable final InterfaceC11932a interfaceC11932a) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: yp.e5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3965p.m20193y(interfaceC11932a, (AbstractC13225r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m20193y(InterfaceC11932a interfaceC11932a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        SelfieState backState = ((SelfieState) action.m48901c()).getBackState();
        if (interfaceC11932a != null) {
            interfaceC11932a.m44538d();
        }
        if (backState != null) {
            backState.m19298x(true);
            action.m48903e(backState);
        } else if (((SelfieWorkflow.Input) action.m48900b()).getBackStepEnabled()) {
            action.m48902d(SelfieWorkflow.AbstractC3927b.a.f16223a);
        } else {
            action.m48902d(SelfieWorkflow.AbstractC3927b.b.f16224a);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z */
    public static final void m20194z(@NotNull Context context, @NotNull AbstractC13218k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.AbstractC3927b, ? extends Object>.a renderContext, @NotNull SelfieWorkflow.Input renderProps, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        List listM31897p = C7699p.m31897p(EnumC11024i0.Camera);
        if (z10 && C7259g.m30272f(context) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
            listM31897p.add(EnumC11024i0.RecordAudio);
        }
        final List<EnumC11024i0> listM19163a = C3858g.m19163a(context, listM31897p);
        if (listM19163a.isEmpty()) {
            return;
        }
        renderContext.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: yp.g5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3965p.m20161A(listM19163a, (AbstractC13225r.c) obj);
            }
        }, 1, null));
    }
}
