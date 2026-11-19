package mq;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a1\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00140\u0004R\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001aY\u0010\u0015\u001a\u00020\u0006*\u00160\u0004R\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a=\u0010\u001f\u001a\u00020\u001e*\"0\u0017R\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 \u001aM\u0010%\u001a\u0012\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001e0\"j\u0002`$*\"0\u0017R\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u00182\b\b\u0002\u0010!\u001a\u00020\u0001H\u0000¢\u0006\u0004\b%\u0010&\u001aO\u0010,\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020'2&\u0010)\u001a\"0\u0017R\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019j\u0002`\u00182\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0001H\u0000¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010/\u001a\u00020.*\u00020\nH\u0000¢\u0006\u0004\b/\u00100\u001a\u0013\u00103\u001a\u000202*\u000201H\u0000¢\u0006\u0004\b3\u00104\u001a\u0013\u00107\u001a\u000206*\u000205H\u0000¢\u0006\u0004\b7\u00108\u001a\u0013\u0010;\u001a\u00020:*\u000209H\u0000¢\u0006\u0004\b;\u0010<\u001a\u0013\u0010=\u001a\u00020\u0001*\u00020\u0006H\u0000¢\u0006\u0004\b=\u0010>\"\u001a\u0010B\u001a\u0004\u0018\u00010\u000e*\u00020?8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", BuildConfig.FLAVOR, "B", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Z", "Lln/r$c;", "Lln/r;", "Lmq/y0;", "addCurrentState", "k", "(Lln/r$c;Z)Lmq/y0;", "Lmq/q5$b;", BuildConfig.FLAVOR, "Lmq/b0;", "selfies", BuildConfig.FLAVOR, "webRtcObjectId", "Lsn/v;", "cameraProperties", BuildConfig.FLAVOR, "startSelfieTimestamp", "backState", "D", "(Lln/r$c;Ljava/util/List;Ljava/lang/String;Lsn/v;JLmq/y0;)Lmq/y0;", "Lln/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Lln/k;", "Lmq/q5$c;", BuildConfig.FLAVOR, "Lks/a;", "webRtcManagerBridge", BuildConfig.FLAVOR, "x", "(Lln/k$a;Lks/a;)V", "inRecoverableState", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "m", "(Lln/k$a;Z)Lkotlin/jvm/functions/Function1;", "Landroid/content/Context;", "context", "renderContext", "renderProps", "useVideoCapture", "z", "(Landroid/content/Context;Lln/k$a;Lmq/q5$b;Z)V", "Lmq/q5$d$c$a;", "C", "(Lmq/q5$b;)Lmq/q5$d$c$a;", "Lmq/q5$d$c$c;", "Lmq/q5$d$a$b;", "E", "(Lmq/q5$d$c$c;)Lmq/q5$d$a$b;", "Lxn/a;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "G", "(Lxn/a;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "Lmq/b0$a;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureMethod;", "F", "(Lmq/b0$a;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureMethod;", "H", "(Lmq/y0;)Z", "Lmq/y0$o;", "w", "(Lmq/y0$o;)Ljava/lang/String;", "centerSelfieFilePath", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j6 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23641a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f23642c;

        static {
            int[] iArr = new int[q5.d.c.EnumC0473c.values().length];
            try {
                iArr[q5.d.c.EnumC0473c.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.CENTER_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_LEFT_HINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_LEFT_COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_RIGHT_HINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_RIGHT_COMPLETE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_UP_HINT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_UP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_UP_COMPLETE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_DOWN_HINT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_DOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.LOOK_DOWN_COMPLETE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.FINALIZING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.COMPLETE_WITH_CAPTURE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[q5.d.c.EnumC0473c.COMPLETE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f23641a = iArr;
            int[] iArr2 = new int[xn.a.values().length];
            try {
                iArr2[xn.a.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[xn.a.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[xn.a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[xn.a.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[xn.a.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            b = iArr2;
            int[] iArr3 = new int[b0.a.values().length];
            try {
                iArr3[b0.a.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[b0.a.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            f23642c = iArr3;
        }
    }

    public static final Unit A(List list, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        y0 y0Var = (y0) action.c();
        if (y0Var instanceof y0.WaitForCameraFeed) {
            action.e(y0.WaitForCameraFeed.z((y0.WaitForCameraFeed) y0Var, !list.contains(fq.n0.Camera), !list.contains(fq.n0.RecordAudio), null, null, null, false, null, false, 252, null));
        } else {
            tq.l2.c((y0) action.c());
            action.e(new y0.RestartCamera(false, false, k(action, false), ((y0) action.c()).getCameraFacingMode(), 3, null));
        }
        return Unit.f21506a;
    }

    public static final boolean B(@NotNull InternalErrorInfo internalErrorInfo) {
        Intrinsics.checkNotNullParameter(internalErrorInfo, "<this>");
        return (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) && ((InternalErrorInfo.NetworkErrorInfo) internalErrorInfo).isRecoverable();
    }

    @NotNull
    public static final q5.d.c.AssetOverrides C(@NotNull q5.Input bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        NextStep.Selfie.AssetConfig.RecordPage recordPage = bVar.getAssetConfig().getRecordPage();
        RemoteImage selfieLeftPictograph = recordPage != null ? recordPage.getSelfieLeftPictograph() : null;
        NextStep.Selfie.AssetConfig.RecordPage recordPage2 = bVar.getAssetConfig().getRecordPage();
        return new q5.d.c.AssetOverrides(selfieLeftPictograph, recordPage2 != null ? recordPage2.getSelfieRightPictograph() : null);
    }

    @NotNull
    public static final y0 D(@NotNull ln.r<? super q5.Input, y0, ?>.c cVar, @NotNull List<? extends b0> selfies, @Nullable String str, @NotNull sn.v cameraProperties, long j10, @Nullable y0 y0Var) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(selfies, "selfies");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        ArrayList arrayList = new ArrayList();
        for (Object obj : selfies) {
            b0 b0Var = (b0) obj;
            if (b0Var instanceof b0.SelfieImage ? cVar.b().getPoseConfigs().a(((b0.SelfieImage) b0Var).getPose()).getAllowReview() : false) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return new y0.Submit(selfies, str, cameraProperties, j10, y0Var, cVar.c().getCameraFacingMode(), 0, null, 192, null);
        }
        return new y0.j(selfies, arrayList, str, cameraProperties, j10, y0Var, cVar.c().getCameraFacingMode());
    }

    @NotNull
    public static final q5.d.a.b E(@NotNull q5.d.c.EnumC0473c enumC0473c) {
        Intrinsics.checkNotNullParameter(enumC0473c, "<this>");
        switch (a.f23641a[enumC0473c.ordinal()]) {
            case 1:
                return q5.d.a.b.CLEAR;
            case 2:
            case 3:
                return q5.d.a.b.CENTER;
            case 4:
            case 5:
            case 6:
                return q5.d.a.b.LOOK_LEFT;
            case 7:
            case 8:
            case 9:
                return q5.d.a.b.LOOK_RIGHT;
            case 10:
            case 11:
            case 12:
                return q5.d.a.b.LOOK_UP;
            case 13:
            case 14:
            case 15:
                return q5.d.a.b.LOOK_DOWN;
            case 16:
                return q5.d.a.b.FINALIZING;
            case 17:
                return q5.d.a.b.CLEAR;
            case MlKitException.UNSUPPORTED /* 18 */:
                return q5.d.a.b.CLEAR;
            default:
                throw new zt.l();
        }
    }

    @NotNull
    public static final SelfieCaptureMethod F(@NotNull b0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i10 = a.f23642c[aVar.ordinal()];
        if (i10 == 1) {
            return SelfieCaptureMethod.AUTO;
        }
        if (i10 == 2) {
            return SelfieCaptureMethod.MANUAL;
        }
        throw new zt.l();
    }

    @NotNull
    public static final SelfiePoseType G(@NotNull xn.a aVar) {
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
        throw new zt.l();
    }

    public static final boolean H(@NotNull y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        if ((y0Var instanceof y0.Capture) || (y0Var instanceof y0.c) || (y0Var instanceof y0.CountdownToCapture) || (y0Var instanceof y0.CountdownToManualCapture) || (y0Var instanceof y0.ShowPoseHint) || (y0Var instanceof y0.StartCapture) || (y0Var instanceof y0.StartCaptureFaceDetected) || (y0Var instanceof y0.WaitForCameraFeed) || (y0Var instanceof y0.WaitForWebRtcSetup) || (y0Var instanceof y0.g) || (y0Var instanceof y0.r) || (y0Var instanceof y0.FinalizeLocalVideoCapture) || (y0Var instanceof y0.AcquireNextPose)) {
            return true;
        }
        if ((y0Var instanceof y0.ShowInstructions) || (y0Var instanceof y0.RestartCamera) || (y0Var instanceof y0.j) || (y0Var instanceof y0.Submit)) {
            return false;
        }
        throw new zt.l();
    }

    @Nullable
    public static final y0 k(@NotNull ln.r<?, y0, ?>.c cVar, boolean z10) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return z10 ? cVar.c() : cVar.c().getBackState();
    }

    public static /* synthetic */ y0 l(ln.r.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return k(cVar, z10);
    }

    @NotNull
    public static final Function1<Throwable, Unit> m(@NotNull final ln.k<? super q5.Input, y0, ? extends q5.c, ? extends Object>.a aVar, final boolean z10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new Function1() { // from class: mq.a6
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j6.o(aVar, z10, (Throwable) obj);
            }
        };
    }

    public static /* synthetic */ Function1 n(ln.k.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return m(aVar, z10);
    }

    public static final Unit o(ln.k.a aVar, final boolean z10, final Throwable cameraError) {
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        if (!(cameraError instanceof sn.k)) {
            aVar.d().a(ln.b0.c(null, new Function1() { // from class: mq.c6
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j6.p(cameraError, (ln.r.c) obj);
                }
            }, 1, null));
            return Unit.f21506a;
        }
        sn.k kVar = (sn.k) cameraError;
        if (!(kVar instanceof sn.t0)) {
            if (kVar instanceof sn.v0) {
                aVar.d().a(ln.b0.c(null, new Function1() { // from class: mq.d6
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j6.q((ln.r.c) obj);
                    }
                }, 1, null));
            } else if (kVar instanceof sn.p0) {
                aVar.d().a(ln.b0.c(null, new Function1() { // from class: mq.e6
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j6.r((ln.r.c) obj);
                    }
                }, 1, null));
            } else if (kVar instanceof sn.a1) {
                aVar.d().a(ln.b0.c(null, new Function1() { // from class: mq.f6
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j6.s(z10, (ln.r.c) obj);
                    }
                }, 1, null));
            } else if (kVar instanceof sn.f0) {
                aVar.d().a(ln.b0.c(null, new Function1() { // from class: mq.g6
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j6.t((ln.r.c) obj);
                    }
                }, 1, null));
            } else if (kVar instanceof sn.j1) {
                aVar.d().a(ln.b0.c(null, new Function1() { // from class: mq.h6
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j6.u((ln.r.c) obj);
                    }
                }, 1, null));
            } else {
                if (!(kVar instanceof sn.z0)) {
                    throw new zt.l();
                }
                aVar.d().a(ln.b0.c(null, new Function1() { // from class: mq.i6
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j6.v(z10, (ln.r.c) obj);
                    }
                }, 1, null));
            }
        }
        return Unit.f21506a;
    }

    public static final Unit p(Throwable th2, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new q5.c.Error(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + th2.getClass().getCanonicalName())));
        return Unit.f21506a;
    }

    public static final Unit q(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new q5.c.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
        return Unit.f21506a;
    }

    public static final Unit r(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new q5.c.Error(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
        return Unit.f21506a;
    }

    public static final Unit s(boolean z10, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            tq.l2.c((y0) action.c());
            if (H((y0) action.c())) {
                action.e(new y0.RestartCamera(false, false, k(action, false), ((y0) action.c()).getCameraFacingMode(), 3, null));
            }
        } else {
            action.d(new q5.c.Error(new InternalErrorInfo.CameraErrorInfo("Recording too long.")));
        }
        return Unit.f21506a;
    }

    public static final Unit t(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new q5.c.Error(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
        return Unit.f21506a;
    }

    public static final Unit u(ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new q5.c.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
        return Unit.f21506a;
    }

    public static final Unit v(boolean z10, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z10) {
            tq.l2.c((y0) action.c());
            if (H((y0) action.c())) {
                action.e(new y0.RestartCamera(false, false, k(action, false), ((y0) action.c()).getCameraFacingMode(), 3, null));
            }
        } else {
            action.d(new q5.c.Error(new InternalErrorInfo.CameraErrorInfo("Recording interrupted.")));
        }
        return Unit.f21506a;
    }

    @Nullable
    public static final String w(@NotNull y0.Submit submit) {
        Object obj;
        Intrinsics.checkNotNullParameter(submit, "<this>");
        List<b0> listW = submit.w();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listW) {
            if (obj2 instanceof b0.SelfieImage) {
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
        } while (((b0.SelfieImage) obj).getPose() != xn.a.Center);
        b0.SelfieImage selfieImage = (b0.SelfieImage) obj;
        if (selfieImage != null) {
            return selfieImage.getAbsoluteFilePath();
        }
        return null;
    }

    public static final void x(@NotNull ln.k<? super q5.Input, y0, ? extends q5.c, ? extends Object>.a aVar, @Nullable final ks.a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: mq.z5
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j6.y(aVar2, (ln.r.c) obj);
            }
        }, 1, null));
    }

    public static final Unit y(ks.a aVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        y0 backState = ((y0) action.c()).getBackState();
        if (aVar != null) {
            aVar.e();
        }
        if (backState != null) {
            backState.x(true);
            action.e(backState);
        } else if (((q5.Input) action.b()).getBackStepEnabled()) {
            action.d(q5.c.a.f23851a);
        } else {
            action.d(q5.c.b.f23852a);
        }
        return Unit.f21506a;
    }

    public static final void z(@NotNull Context context, @NotNull ln.k<? super q5.Input, y0, ? extends q5.c, ? extends Object>.a renderContext, @NotNull q5.Input renderProps, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        List listP = p001kotlin.collections.p.p(fq.n0.Camera);
        if (z10 && xq.g.f(context) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
            listP.add(fq.n0.RecordAudio);
        }
        final List<fq.n0> listA = fq.y1.a(context, listP);
        if (listA.isEmpty()) {
            return;
        }
        renderContext.d().a(ln.b0.c(null, new Function1() { // from class: mq.b6
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j6.A(listA, (ln.r.c) obj);
            }
        }, 1, null));
    }
}
