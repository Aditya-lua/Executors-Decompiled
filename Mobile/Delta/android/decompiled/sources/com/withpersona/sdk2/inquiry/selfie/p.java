package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType;
import fn.d0;
import fn.h0;
import fn.l0;
import fn.m0;
import fn.v;
import fn.v0;
import fq.l2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rp.i0;
import ym.b0;
import ym.r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a1\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00140\u0004R\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001aY\u0010\u0015\u001a\u00020\u0006*\u00160\u0004R\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a=\u0010\u001f\u001a\u00020\u001e*\"0\u0017R\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 \u001aM\u0010%\u001a\u0012\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001e0\"j\u0002`$*\"0\u0017R\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u00182\b\b\u0002\u0010!\u001a\u00020\u0001H\u0000¢\u0006\u0004\b%\u0010&\u001aO\u0010,\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020'2&\u0010)\u001a\"0\u0017R\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u00182\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0001H\u0000¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010/\u001a\u00020.*\u00020\nH\u0000¢\u0006\u0004\b/\u00100\u001a\u0013\u00103\u001a\u000202*\u000201H\u0000¢\u0006\u0004\b3\u00104\u001a\u0013\u00107\u001a\u000206*\u000205H\u0000¢\u0006\u0004\b7\u00108\u001a\u0013\u0010;\u001a\u00020:*\u000209H\u0000¢\u0006\u0004\b;\u0010<\u001a\u0013\u0010=\u001a\u00020\u0001*\u00020\u0006H\u0000¢\u0006\u0004\b=\u0010>\"\u001a\u0010B\u001a\u0004\u0018\u00010\u000e*\u00020?8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "", "B", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Z", "Lym/r$c;", "Lym/r;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "addCurrentState", "k", "(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "backState", "D", "(Lym/r$c;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "", "Lur/a;", "webRtcManagerBridge", "", "x", "(Lym/k$a;Lur/a;)V", "inRecoverableState", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "m", "(Lym/k$a;Z)Lkotlin/jvm/functions/Function1;", "Landroid/content/Context;", "context", "renderContext", "renderProps", "useVideoCapture", "z", "(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "C", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "E", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "Lkn/a;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "G", "(Lkn/a;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureMethod;", "F", "(Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureMethod;", "H", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Z", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "w", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;)Ljava/lang/String;", "centerSelfieFilePath", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13014a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f13015c;

        static {
            int[] iArr = new int[SelfieWorkflow.c.C0235c.EnumC0238c.values().length];
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.CENTER_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_LEFT_HINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_LEFT_COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_RIGHT_HINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_RIGHT_COMPLETE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_UP_HINT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_UP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_UP_COMPLETE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_DOWN_HINT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_DOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.LOOK_DOWN_COMPLETE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.FINALIZING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.COMPLETE_WITH_CAPTURE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SelfieWorkflow.c.C0235c.EnumC0238c.COMPLETE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f13014a = iArr;
            int[] iArr2 = new int[kn.a.values().length];
            try {
                iArr2[kn.a.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[kn.a.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[kn.a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[kn.a.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[kn.a.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            b = iArr2;
            int[] iArr3 = new int[Selfie.a.values().length];
            try {
                iArr3[Selfie.a.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[Selfie.a.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            f13015c = iArr3;
        }
    }

    public static final Unit A(List list, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        SelfieState selfieState = (SelfieState) action.c();
        if (selfieState instanceof SelfieState.WaitForCameraFeed) {
            action.e(SelfieState.WaitForCameraFeed.A((SelfieState.WaitForCameraFeed) selfieState, !list.contains(i0.Camera), !list.contains(i0.RecordAudio), null, null, null, false, null, false, 252, null));
        } else {
            l2.c((SelfieState) action.c());
            action.e(new SelfieState.RestartCamera(false, false, k(action, false), ((SelfieState) action.c()).getCameraFacingMode(), 3, null));
        }
        return Unit.f22483a;
    }

    public static final boolean B(@NotNull InternalErrorInfo internalErrorInfo) {
        Intrinsics.checkNotNullParameter(internalErrorInfo, "<this>");
        return (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) && ((InternalErrorInfo.NetworkErrorInfo) internalErrorInfo).isRecoverable();
    }

    @NotNull
    public static final SelfieWorkflow.c.C0235c.AssetOverrides C(@NotNull SelfieWorkflow.Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        NextStep.Selfie.AssetConfig.RecordPage recordPage = input.getAssetConfig().getRecordPage();
        RemoteImage selfieLeftPictograph = recordPage != null ? recordPage.getSelfieLeftPictograph() : null;
        NextStep.Selfie.AssetConfig.RecordPage recordPage2 = input.getAssetConfig().getRecordPage();
        return new SelfieWorkflow.c.C0235c.AssetOverrides(selfieLeftPictograph, recordPage2 != null ? recordPage2.getSelfieRightPictograph() : null);
    }

    @NotNull
    public static final SelfieState D(@NotNull r<? super SelfieWorkflow.Input, SelfieState, ?>.c cVar, @NotNull List<? extends Selfie> selfies, @Nullable String str, @NotNull CameraProperties cameraProperties, long j10, @Nullable SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(selfies, "selfies");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        ArrayList arrayList = new ArrayList();
        for (Object obj : selfies) {
            Selfie selfie = (Selfie) obj;
            if (selfie instanceof Selfie.SelfieImage ? cVar.b().getPoseConfigs().a(((Selfie.SelfieImage) selfie).getPose()).getAllowReview() : false) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return new SelfieState.Submit(selfies, str, cameraProperties, j10, selfieState, cVar.c().getCameraFacingMode(), 0, null, 192, null);
        }
        return new SelfieState.ReviewCaptures(selfies, arrayList, str, cameraProperties, j10, selfieState, cVar.c().getCameraFacingMode());
    }

    @NotNull
    public static final SelfieWorkflow.c.a.b E(@NotNull SelfieWorkflow.c.C0235c.EnumC0238c enumC0238c) {
        Intrinsics.checkNotNullParameter(enumC0238c, "<this>");
        switch (a.f13014a[enumC0238c.ordinal()]) {
            case 1:
                return SelfieWorkflow.c.a.b.CLEAR;
            case 2:
            case 3:
                return SelfieWorkflow.c.a.b.CENTER;
            case 4:
            case 5:
            case 6:
                return SelfieWorkflow.c.a.b.LOOK_LEFT;
            case 7:
            case 8:
            case 9:
                return SelfieWorkflow.c.a.b.LOOK_RIGHT;
            case 10:
            case 11:
            case 12:
                return SelfieWorkflow.c.a.b.LOOK_UP;
            case 13:
            case 14:
            case 15:
                return SelfieWorkflow.c.a.b.LOOK_DOWN;
            case 16:
                return SelfieWorkflow.c.a.b.FINALIZING;
            case 17:
                return SelfieWorkflow.c.a.b.CLEAR;
            case 18:
                return SelfieWorkflow.c.a.b.CLEAR;
            default:
                throw new jt.l();
        }
    }

    @NotNull
    public static final SelfieCaptureMethod F(@NotNull Selfie.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i10 = a.f13015c[aVar.ordinal()];
        if (i10 == 1) {
            return SelfieCaptureMethod.AUTO;
        }
        if (i10 == 2) {
            return SelfieCaptureMethod.MANUAL;
        }
        throw new jt.l();
    }

    @NotNull
    public static final SelfiePoseType G(@NotNull kn.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i10 = a.b[aVar.ordinal()];
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
        throw new jt.l();
    }

    public static final boolean H(@NotNull SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(selfieState, "<this>");
        if ((selfieState instanceof SelfieState.Capture) || (selfieState instanceof SelfieState.CaptureTransition) || (selfieState instanceof SelfieState.CountdownToCapture) || (selfieState instanceof SelfieState.CountdownToManualCapture) || (selfieState instanceof SelfieState.ShowPoseHint) || (selfieState instanceof SelfieState.StartCapture) || (selfieState instanceof SelfieState.StartCaptureFaceDetected) || (selfieState instanceof SelfieState.WaitForCameraFeed) || (selfieState instanceof SelfieState.WaitForWebRtcSetup) || (selfieState instanceof SelfieState.FinalizeWebRtc) || (selfieState instanceof SelfieState.WebRtcFinished) || (selfieState instanceof SelfieState.FinalizeLocalVideoCapture) || (selfieState instanceof SelfieState.AcquireNextPose)) {
            return true;
        }
        if ((selfieState instanceof SelfieState.ShowInstructions) || (selfieState instanceof SelfieState.RestartCamera) || (selfieState instanceof SelfieState.ReviewCaptures) || (selfieState instanceof SelfieState.Submit)) {
            return false;
        }
        throw new jt.l();
    }

    @Nullable
    public static final SelfieState k(@NotNull r<?, SelfieState, ?>.c cVar, boolean z10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return z10 ? cVar.c() : cVar.c().getBackState();
    }

    public static /* synthetic */ SelfieState l(r.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return k(cVar, z10);
    }

    @NotNull
    public static final Function1<Throwable, Unit> m(@NotNull final ym.k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.b, ? extends Object>.a aVar, final boolean z10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new Function1() { // from class: yp.f5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.selfie.p.o(aVar, z10, (Throwable) obj);
            }
        };
    }

    public static /* synthetic */ Function1 n(ym.k.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return m(aVar, z10);
    }

    public static final Unit o(ym.k.a aVar, final boolean z10, final Throwable cameraError) {
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        if (!(cameraError instanceof fn.h)) {
            aVar.d().a(b0.c(null, new Function1() { // from class: yp.h5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.selfie.p.p(cameraError, (ym.r.c) obj);
                }
            }, 1, null));
            return Unit.f22483a;
        }
        fn.h hVar = (fn.h) cameraError;
        if (!(hVar instanceof h0)) {
            if (hVar instanceof fn.i0) {
                aVar.d().a(b0.c(null, new Function1() { // from class: yp.i5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.selfie.p.q((ym.r.c) obj);
                    }
                }, 1, null));
            } else if (hVar instanceof d0) {
                aVar.d().a(b0.c(null, new Function1() { // from class: yp.j5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.selfie.p.r((ym.r.c) obj);
                    }
                }, 1, null));
            } else if (hVar instanceof m0) {
                aVar.d().a(b0.c(null, new Function1() { // from class: yp.k5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.selfie.p.s(z10, (ym.r.c) obj);
                    }
                }, 1, null));
            } else if (hVar instanceof v) {
                aVar.d().a(b0.c(null, new Function1() { // from class: yp.l5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.selfie.p.t((ym.r.c) obj);
                    }
                }, 1, null));
            } else if (hVar instanceof v0) {
                aVar.d().a(b0.c(null, new Function1() { // from class: yp.m5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.selfie.p.u((ym.r.c) obj);
                    }
                }, 1, null));
            } else {
                if (!(hVar instanceof l0)) {
                    throw new jt.l();
                }
                aVar.d().a(b0.c(null, new Function1() { // from class: yp.n5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.selfie.p.v(z10, (ym.r.c) obj);
                    }
                }, 1, null));
            }
        }
        return Unit.f22483a;
    }

    public static final Unit p(Throwable th2, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + th2.getClass().getCanonicalName())));
        return Unit.f22483a;
    }

    public static final Unit q(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
        return Unit.f22483a;
    }

    public static final Unit r(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
        return Unit.f22483a;
    }

    public static final Unit s(boolean z10, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            l2.c((SelfieState) action.c());
            if (H((SelfieState) action.c())) {
                action.e(new SelfieState.RestartCamera(false, false, k(action, false), ((SelfieState) action.c()).getCameraFacingMode(), 3, null));
            }
        } else {
            action.d(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Recording too long.")));
        }
        return Unit.f22483a;
    }

    public static final Unit t(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
        return Unit.f22483a;
    }

    public static final Unit u(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
        return Unit.f22483a;
    }

    public static final Unit v(boolean z10, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            l2.c((SelfieState) action.c());
            if (H((SelfieState) action.c())) {
                action.e(new SelfieState.RestartCamera(false, false, k(action, false), ((SelfieState) action.c()).getCameraFacingMode(), 3, null));
            }
        } else {
            action.d(new SelfieWorkflow.b.Error(new InternalErrorInfo.CameraErrorInfo("Recording interrupted.")));
        }
        return Unit.f22483a;
    }

    @Nullable
    public static final String w(@NotNull SelfieState.Submit submit) {
        Object obj;
        Intrinsics.checkNotNullParameter(submit, "<this>");
        List<Selfie> listW = submit.w();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listW) {
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
        } while (((Selfie.SelfieImage) obj).getPose() != kn.a.Center);
        Selfie.SelfieImage selfieImage = (Selfie.SelfieImage) obj;
        if (selfieImage != null) {
            return selfieImage.getAbsoluteFilePath();
        }
        return null;
    }

    public static final void x(@NotNull ym.k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.b, ? extends Object>.a aVar, @Nullable final ur.a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.d().a(b0.c(null, new Function1() { // from class: yp.e5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.selfie.p.y(aVar2, (ym.r.c) obj);
            }
        }, 1, null));
    }

    public static final Unit y(ur.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        SelfieState backState = ((SelfieState) action.c()).getBackState();
        if (aVar != null) {
            aVar.d();
        }
        if (backState != null) {
            backState.x(true);
            action.e(backState);
        } else if (((SelfieWorkflow.Input) action.b()).getBackStepEnabled()) {
            action.d(SelfieWorkflow.b.a.f12633a);
        } else {
            action.d(SelfieWorkflow.b.C0231b.f12634a);
        }
        return Unit.f22483a;
    }

    public static final void z(@NotNull Context context, @NotNull ym.k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.b, ? extends Object>.a renderContext, @NotNull SelfieWorkflow.Input renderProps, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        List listP = kotlin.collections.p.p(i0.Camera);
        if (z10 && jq.g.f(context) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
            listP.add(i0.RecordAudio);
        }
        final List<i0> listA = com.withpersona.sdk2.inquiry.permissions.g.a(context, listP);
        if (listA.isEmpty()) {
            return;
        }
        renderContext.d().a(b0.c(null, new Function1() { // from class: yp.g5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.selfie.p.A(listA, (ym.r.c) obj);
            }
        }, 1, null));
    }
}
