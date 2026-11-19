package mq;

import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import rq.PoseInfo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a×\u0002\u00108\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002&\u0010\b\u001a\"0\u0002R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190\u001cj\u0002`\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\b\b\u0002\u00103\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u00020\u000f2\b\b\u0002\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b8\u00109\u001a½\u0002\u0010;\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050:2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190\u001cj\u0002`\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\b\b\u0002\u00103\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u00020\u000f2\b\b\u0002\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b;\u0010<\u001a\u001f\u0010=\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b=\u0010>\u001a\u001f\u0010?\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b?\u0010>\u001a\u0013\u0010A\u001a\u00020@*\u00020\u0011H\u0002¢\u0006\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lmq/q5$b;", "renderProps", "Lln/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Lln/k;", "Lmq/y0;", "Lmq/q5$c;", BuildConfig.FLAVOR, "context", "Lxn/a;", "pose", BuildConfig.FLAVOR, Title.type, "message", "realTimeHint", BuildConfig.FLAVOR, "isAutoCaptureOn", "Lmq/q5$d$c$b;", "mode", "Lmq/q5$d$c$a;", "assetOverrides", "requireStrictSelfieCapture", "Lir/a;", "navigationState", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onBack", "onCancel", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lzn/a;", "videoCaptureMethod", "Lks/a;", "webRtcManager", "isAudioRequired", "Lsn/a0$a;", "cameraXControllerFactory", "Lun/c$a;", "camera2ControllerFactory", BuildConfig.FLAVOR, "poseScore", "Lxn/b;", "brightnessInfo", "Lsn/v$b;", "facingMode", "isFlashEnabled", "isAutoFlashOnManualCaptureEnabled", "isDimLightConditions", "isFlashOn", "requestingPermissions", "recordingLocallyRequired", "allowSwitchCamera", "Lmq/q5$d;", "m", "(Lmq/q5$b;Lln/k$a;Lxn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLmq/q5$d$c$b;Lmq/q5$d$c$a;ZLir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lzn/a;Lks/a;ZLsn/a0$a;Lun/c$a;FLxn/b;Lsn/v$b;ZZZZZZZ)Lmq/q5$d;", "Lls/g;", "g", "(Lmq/q5$b;Lls/g;Lxn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLmq/q5$d$c$b;Lmq/q5$d$c$a;ZLir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lzn/a;Lks/a;ZLsn/a0$a;Lun/c$a;FLxn/b;Lsn/v$b;ZZZZZZZ)Lmq/q5$d;", "l", "(Lmq/q5$b;Lxn/a;)Ljava/lang/String;", "k", "Lmq/q5$d$a$a;", "s", "(Lmq/q5$d$c$b;)Lmq/q5$d$a$a;", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i1 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23619a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[xn.a.values().length];
            try {
                iArr[xn.a.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xn.a.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xn.a.Center.ordinal()] = 3;
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
            f23619a = iArr;
            int[] iArr2 = new int[c.values().length];
            try {
                iArr2[c.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[c.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[c.K0000.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    @NotNull
    public static final q5.d g(@NotNull q5.Input renderProps, @NotNull final ls.g<y0> context, @Nullable xn.a aVar, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, @NotNull q5.d.c.b mode, @NotNull q5.d.c.AssetOverrides assetOverrides, boolean z11, @NotNull ir.a navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull zn.a videoCaptureMethod, @Nullable ks.a aVar2, boolean z12, @NotNull sn.a0.a cameraXControllerFactory, @NotNull un.c.a camera2ControllerFactory, float f10, @Nullable xn.b bVar, @NotNull sn.v.b facingMode, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        String cameraLoadingTitle;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(assetOverrides, "assetOverrides");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
        Intrinsics.checkNotNullParameter(onPermissionChanged, "onPermissionChanged");
        Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(facingMode, "facingMode");
        int i10 = a.b[renderProps.getDesignVersion().ordinal()];
        if (i10 == 1) {
            return new q5.d.c(str, str2, mode, renderProps.getStyles(), assetOverrides, z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, aVar2, z12, cameraXControllerFactory, camera2ControllerFactory, z18, renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
        }
        if (i10 != 2 && i10 != 3) {
            throw new zt.l();
        }
        if (!(mode instanceof q5.d.c.b.g)) {
            cameraLoadingTitle = mode instanceof q5.d.c.b.i ? renderProps.getStrings().getCameraLoadingTitle() : l(renderProps, aVar);
        } else if (renderProps.getDesignVersion() == c.K0000) {
            PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderProps.z());
            xn.a pose = poseInfo != null ? poseInfo.getPose() : null;
            int i11 = pose == null ? -1 : a.f23619a[pose.ordinal()];
            if (i11 == 1 || i11 == 2) {
                cameraLoadingTitle = l(renderProps, aVar);
            } else {
                cameraLoadingTitle = i11 != 3 ? renderProps.getStrings().getCameraLoadingTitle() : k(renderProps, aVar);
            }
        } else {
            cameraLoadingTitle = renderProps.getStrings().getCameraLoadingTitle();
        }
        String strK = k(renderProps, aVar);
        String autoCaptureOn = z10 ? renderProps.getStrings().getAutoCaptureOn() : null;
        String captureSuccess = renderProps.getStrings().getCaptureSuccess();
        String disclaimer = renderProps.getStrings().getDisclaimer();
        String selfieHintVerifying = renderProps.getStrings().getSelfieHintVerifying();
        return new q5.d.a(str, cameraLoadingTitle, strK, autoCaptureOn, captureSuccess, disclaimer, str3, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), selfieHintVerifying, z10, s(mode), renderProps.getStyles(), z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, aVar2, z12, cameraXControllerFactory, camera2ControllerFactory, new Function1() { // from class: mq.f1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i1.i(context, (sn.v.b) obj);
            }
        }, f10, bVar, facingMode, z13, z14, z16, z15, new Function1() { // from class: mq.g1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i1.j(context, ((Boolean) obj).booleanValue());
            }
        }, aVar, z17, z18, z19, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
    }

    public static final Unit i(ls.g gVar, sn.v.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gVar.p(new y0.RestartCamera(false, false, tq.l2.a(gVar, false), it, 3, null));
        return Unit.f21506a;
    }

    public static final Unit j(ls.g gVar, boolean z10) {
        Parcelable parcelableZ;
        y0 y0Var = (y0) gVar.i();
        if (y0Var instanceof mq.a) {
            if (y0Var instanceof y0.Capture) {
                y0.Capture capture = (y0.Capture) y0Var;
                parcelableZ = capture.y((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & Barcode.FORMAT_ITF) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture.isFlashEnabled : z10, (57343 & 8192) != 0 ? capture.flashState : null, (57343 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false);
            } else if (y0Var instanceof y0.CountdownToManualCapture) {
                y0.CountdownToManualCapture countdownToManualCapture = (y0.CountdownToManualCapture) y0Var;
                parcelableZ = countdownToManualCapture.y((4092 & 1) != 0 ? countdownToManualCapture.countDown : 0, (4092 & 2) != 0 ? countdownToManualCapture.selfieError : null, (4092 & 4) != 0 ? countdownToManualCapture.cameraProperties : null, (4092 & 8) != 0 ? countdownToManualCapture.posesNeeded : null, (4092 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : 0L, (4092 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : false, (4092 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : 0L, (4092 & Barcode.FORMAT_ITF) != 0 ? countdownToManualCapture.backState : null, (4092 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToManualCapture.poseConfigs : null, (4092 & Barcode.FORMAT_UPC_A) != 0 ? countdownToManualCapture.cameraFacingMode : null, (4092 & Barcode.FORMAT_UPC_E) != 0 ? countdownToManualCapture.isFlashEnabled : z10, (4092 & Barcode.FORMAT_PDF417) != 0 ? countdownToManualCapture.isDimLightConditions : false);
            } else if (y0Var instanceof y0.StartCapture) {
                y0.StartCapture startCapture = (y0.StartCapture) y0Var;
                parcelableZ = startCapture.y((16242 & 1) != 0 ? startCapture.centered : false, (16242 & 2) != 0 ? startCapture.selfieError : null, (16242 & 4) != 0 ? startCapture.poseScore : 0.0f, (16242 & 8) != 0 ? startCapture.brightnessInfo : null, (16242 & 16) != 0 ? startCapture.posesNeeded : null, (16242 & 32) != 0 ? startCapture.selfies : null, (16242 & 64) != 0 ? startCapture.startCaptureTimestamp : 0L, (16242 & Barcode.FORMAT_ITF) != 0 ? startCapture.autoCaptureSupported : false, (16242 & Barcode.FORMAT_QR_CODE) != 0 ? startCapture.startSelfieTimestamp : 0L, (16242 & Barcode.FORMAT_UPC_A) != 0 ? startCapture.cameraProperties : null, (16242 & Barcode.FORMAT_UPC_E) != 0 ? startCapture.backState : null, (16242 & Barcode.FORMAT_PDF417) != 0 ? startCapture.poseConfigs : null, (16242 & Barcode.FORMAT_AZTEC) != 0 ? startCapture.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture.isFlashEnabled : z10, (16242 & 16384) != 0 ? startCapture.isDimLightConditions : false);
            } else if (y0Var instanceof y0.CountdownToCapture) {
                y0.CountdownToCapture countdownToCapture = (y0.CountdownToCapture) y0Var;
                parcelableZ = countdownToCapture.y((32764 & 1) != 0 ? countdownToCapture.countDown : 0, (32764 & 2) != 0 ? countdownToCapture.selfieError : null, (32764 & 4) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (32764 & 8) != 0 ? countdownToCapture.cameraProperties : null, (32764 & 16) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (32764 & 32) != 0 ? countdownToCapture.poseScore : 0.0f, (32764 & 64) != 0 ? countdownToCapture.brightnessInfo : null, (32764 & Barcode.FORMAT_ITF) != 0 ? countdownToCapture.posesNeeded : null, (32764 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToCapture.selfies : null, (32764 & Barcode.FORMAT_UPC_A) != 0 ? countdownToCapture.backState : null, (32764 & Barcode.FORMAT_UPC_E) != 0 ? countdownToCapture.poseConfigs : null, (32764 & Barcode.FORMAT_PDF417) != 0 ? countdownToCapture.autoCaptureSupported : false, (32764 & Barcode.FORMAT_AZTEC) != 0 ? countdownToCapture.cameraFacingMode : null, (32764 & 8192) != 0 ? countdownToCapture.isFlashEnabled : z10, (32764 & 16384) != 0 ? countdownToCapture.isDimLightConditions : false);
            } else if (y0Var instanceof y0.ShowPoseHint) {
                parcelableZ = y0.ShowPoseHint.z((y0.ShowPoseHint) y0Var, null, null, false, null, 0L, null, null, null, z10, 255, null);
            } else if (y0Var instanceof y0.StartCaptureFaceDetected) {
                y0.StartCaptureFaceDetected startCaptureFaceDetected = (y0.StartCaptureFaceDetected) y0Var;
                parcelableZ = startCaptureFaceDetected.y((6143 & 1) != 0 ? startCaptureFaceDetected.startCaptureTimestamp : 0L, (6143 & 2) != 0 ? startCaptureFaceDetected.cameraProperties : null, (6143 & 4) != 0 ? startCaptureFaceDetected.startSelfieTimestamp : 0L, (6143 & 8) != 0 ? startCaptureFaceDetected.poseScore : 0.0f, (6143 & 16) != 0 ? startCaptureFaceDetected.brightnessInfo : null, (6143 & 32) != 0 ? startCaptureFaceDetected.posesNeeded : null, (6143 & 64) != 0 ? startCaptureFaceDetected.selfies : null, (6143 & Barcode.FORMAT_ITF) != 0 ? startCaptureFaceDetected.backState : null, (6143 & Barcode.FORMAT_QR_CODE) != 0 ? startCaptureFaceDetected.poseConfigs : null, (6143 & Barcode.FORMAT_UPC_A) != 0 ? startCaptureFaceDetected.autoCaptureSupported : false, (6143 & Barcode.FORMAT_UPC_E) != 0 ? startCaptureFaceDetected.cameraFacingMode : null, (6143 & Barcode.FORMAT_PDF417) != 0 ? startCaptureFaceDetected.isFlashEnabled : z10, (6143 & Barcode.FORMAT_AZTEC) != 0 ? startCaptureFaceDetected.isDimLightConditions : false);
            } else if (y0Var instanceof y0.WaitForWebRtcSetup) {
                parcelableZ = y0.WaitForWebRtcSetup.z((y0.WaitForWebRtcSetup) y0Var, null, null, 0L, null, null, null, false, null, z10, 255, null);
            } else {
                if (!(y0Var instanceof y0.AcquireNextPose)) {
                    throw new zt.l();
                }
                parcelableZ = y0.AcquireNextPose.z((y0.AcquireNextPose) y0Var, null, 0L, null, null, null, z10, null, null, false, 479, null);
            }
        } else {
            if (!(y0Var instanceof y0.WaitForCameraFeed)) {
                return Unit.f21506a;
            }
            parcelableZ = y0.WaitForCameraFeed.z((y0.WaitForCameraFeed) y0Var, false, false, null, null, null, false, null, z10, 127, null);
        }
        gVar.p(parcelableZ);
        return Unit.f21506a;
    }

    public static final String k(q5.Input input, xn.a aVar) {
        int i10 = aVar == null ? -1 : a.f23619a[aVar.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return input.getStrings().getSelfieHintLookLeftDescription();
        }
        if (i10 == 2) {
            return input.getStrings().getSelfieHintLookRightDescription();
        }
        if (i10 == 3) {
            return input.getStrings().getSelfieHintCenterFaceDescription();
        }
        if (i10 == 4) {
            return input.getStrings().getSelfieHintLookUpDescription();
        }
        if (i10 == 5) {
            return input.getStrings().getSelfieHintLookDownDescription();
        }
        throw new zt.l();
    }

    public static final String l(q5.Input input, xn.a aVar) {
        int i10 = aVar == null ? -1 : a.f23619a[aVar.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return input.getStrings().getSelfieHintLookLeft();
        }
        if (i10 == 2) {
            return input.getStrings().getSelfieHintLookRight();
        }
        if (i10 == 3) {
            return input.getStrings().getSelfieHintCenterFace();
        }
        if (i10 == 4) {
            return input.getStrings().getSelfieHintLookUp();
        }
        if (i10 == 5) {
            return input.getStrings().getSelfieHintLookDown();
        }
        throw new zt.l();
    }

    @NotNull
    public static final q5.d m(@NotNull q5.Input renderProps, @NotNull final ln.k<? super q5.Input, y0, ? extends q5.c, ? extends Object>.a context, @Nullable xn.a aVar, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, @NotNull q5.d.c.b mode, @NotNull q5.d.c.AssetOverrides assetOverrides, boolean z11, @NotNull ir.a navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull zn.a videoCaptureMethod, @Nullable ks.a aVar2, boolean z12, @NotNull sn.a0.a cameraXControllerFactory, @NotNull un.c.a camera2ControllerFactory, float f10, @Nullable xn.b bVar, @NotNull sn.v.b facingMode, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        String cameraLoadingTitle;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(assetOverrides, "assetOverrides");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
        Intrinsics.checkNotNullParameter(onPermissionChanged, "onPermissionChanged");
        Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(facingMode, "facingMode");
        int i10 = a.b[renderProps.getDesignVersion().ordinal()];
        if (i10 == 1) {
            return new q5.d.c(str, str2, mode, renderProps.getStyles(), assetOverrides, z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, aVar2, z12, cameraXControllerFactory, camera2ControllerFactory, z18, renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
        }
        if (i10 != 2 && i10 != 3) {
            throw new zt.l();
        }
        if (!(mode instanceof q5.d.c.b.g)) {
            cameraLoadingTitle = mode instanceof q5.d.c.b.i ? renderProps.getStrings().getCameraLoadingTitle() : l(renderProps, aVar);
        } else if (renderProps.getDesignVersion() == c.K0000) {
            PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderProps.z());
            xn.a pose = poseInfo != null ? poseInfo.getPose() : null;
            int i11 = pose == null ? -1 : a.f23619a[pose.ordinal()];
            if (i11 == 1 || i11 == 2) {
                cameraLoadingTitle = l(renderProps, aVar);
            } else {
                cameraLoadingTitle = i11 != 3 ? renderProps.getStrings().getCameraLoadingTitle() : k(renderProps, aVar);
            }
        } else {
            cameraLoadingTitle = renderProps.getStrings().getCameraLoadingTitle();
        }
        String strK = k(renderProps, aVar);
        String autoCaptureOn = z10 ? renderProps.getStrings().getAutoCaptureOn() : null;
        String captureSuccess = renderProps.getStrings().getCaptureSuccess();
        String disclaimer = renderProps.getStrings().getDisclaimer();
        String selfieHintVerifying = renderProps.getStrings().getSelfieHintVerifying();
        return new q5.d.a(str, cameraLoadingTitle, strK, autoCaptureOn, captureSuccess, disclaimer, str3, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), selfieHintVerifying, z10, s(mode), renderProps.getStyles(), z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, aVar2, z12, cameraXControllerFactory, camera2ControllerFactory, new Function1() { // from class: mq.c1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i1.o(context, (sn.v.b) obj);
            }
        }, f10, bVar, facingMode, z13, z14, z16, z15, new Function1() { // from class: mq.d1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i1.q(context, ((Boolean) obj).booleanValue());
            }
        }, aVar, z17, z18, z19, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
    }

    public static final Unit o(ln.k.a aVar, final sn.v.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: mq.h1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i1.p(it, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit p(sn.v.b bVar, ln.r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(new y0.RestartCamera(false, false, j6.k(action, false), bVar, 3, null));
        return Unit.f21506a;
    }

    public static final Unit q(ln.k.a aVar, final boolean z10) {
        aVar.d().a(ln.b0.c(null, new Function1() { // from class: mq.e1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i1.r(z10, (ln.r.c) obj);
            }
        }, 1, null));
        return Unit.f21506a;
    }

    public static final Unit r(boolean z10, ln.r.c action) {
        Parcelable parcelableZ;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        y0 y0Var = (y0) action.c();
        if (y0Var instanceof mq.a) {
            if (y0Var instanceof y0.Capture) {
                y0.Capture capture = (y0.Capture) y0Var;
                parcelableZ = capture.y((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & Barcode.FORMAT_ITF) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture.isFlashEnabled : z10, (57343 & 8192) != 0 ? capture.flashState : null, (57343 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false);
            } else if (y0Var instanceof y0.CountdownToManualCapture) {
                y0.CountdownToManualCapture countdownToManualCapture = (y0.CountdownToManualCapture) y0Var;
                parcelableZ = countdownToManualCapture.y((4092 & 1) != 0 ? countdownToManualCapture.countDown : 0, (4092 & 2) != 0 ? countdownToManualCapture.selfieError : null, (4092 & 4) != 0 ? countdownToManualCapture.cameraProperties : null, (4092 & 8) != 0 ? countdownToManualCapture.posesNeeded : null, (4092 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : 0L, (4092 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : false, (4092 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : 0L, (4092 & Barcode.FORMAT_ITF) != 0 ? countdownToManualCapture.backState : null, (4092 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToManualCapture.poseConfigs : null, (4092 & Barcode.FORMAT_UPC_A) != 0 ? countdownToManualCapture.cameraFacingMode : null, (4092 & Barcode.FORMAT_UPC_E) != 0 ? countdownToManualCapture.isFlashEnabled : z10, (4092 & Barcode.FORMAT_PDF417) != 0 ? countdownToManualCapture.isDimLightConditions : false);
            } else if (y0Var instanceof y0.StartCapture) {
                y0.StartCapture startCapture = (y0.StartCapture) y0Var;
                parcelableZ = startCapture.y((16242 & 1) != 0 ? startCapture.centered : false, (16242 & 2) != 0 ? startCapture.selfieError : null, (16242 & 4) != 0 ? startCapture.poseScore : 0.0f, (16242 & 8) != 0 ? startCapture.brightnessInfo : null, (16242 & 16) != 0 ? startCapture.posesNeeded : null, (16242 & 32) != 0 ? startCapture.selfies : null, (16242 & 64) != 0 ? startCapture.startCaptureTimestamp : 0L, (16242 & Barcode.FORMAT_ITF) != 0 ? startCapture.autoCaptureSupported : false, (16242 & Barcode.FORMAT_QR_CODE) != 0 ? startCapture.startSelfieTimestamp : 0L, (16242 & Barcode.FORMAT_UPC_A) != 0 ? startCapture.cameraProperties : null, (16242 & Barcode.FORMAT_UPC_E) != 0 ? startCapture.backState : null, (16242 & Barcode.FORMAT_PDF417) != 0 ? startCapture.poseConfigs : null, (16242 & Barcode.FORMAT_AZTEC) != 0 ? startCapture.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture.isFlashEnabled : z10, (16242 & 16384) != 0 ? startCapture.isDimLightConditions : false);
            } else if (y0Var instanceof y0.CountdownToCapture) {
                y0.CountdownToCapture countdownToCapture = (y0.CountdownToCapture) y0Var;
                parcelableZ = countdownToCapture.y((32764 & 1) != 0 ? countdownToCapture.countDown : 0, (32764 & 2) != 0 ? countdownToCapture.selfieError : null, (32764 & 4) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (32764 & 8) != 0 ? countdownToCapture.cameraProperties : null, (32764 & 16) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (32764 & 32) != 0 ? countdownToCapture.poseScore : 0.0f, (32764 & 64) != 0 ? countdownToCapture.brightnessInfo : null, (32764 & Barcode.FORMAT_ITF) != 0 ? countdownToCapture.posesNeeded : null, (32764 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToCapture.selfies : null, (32764 & Barcode.FORMAT_UPC_A) != 0 ? countdownToCapture.backState : null, (32764 & Barcode.FORMAT_UPC_E) != 0 ? countdownToCapture.poseConfigs : null, (32764 & Barcode.FORMAT_PDF417) != 0 ? countdownToCapture.autoCaptureSupported : false, (32764 & Barcode.FORMAT_AZTEC) != 0 ? countdownToCapture.cameraFacingMode : null, (32764 & 8192) != 0 ? countdownToCapture.isFlashEnabled : z10, (32764 & 16384) != 0 ? countdownToCapture.isDimLightConditions : false);
            } else if (y0Var instanceof y0.ShowPoseHint) {
                parcelableZ = y0.ShowPoseHint.z((y0.ShowPoseHint) y0Var, null, null, false, null, 0L, null, null, null, z10, 255, null);
            } else if (y0Var instanceof y0.StartCaptureFaceDetected) {
                y0.StartCaptureFaceDetected startCaptureFaceDetected = (y0.StartCaptureFaceDetected) y0Var;
                parcelableZ = startCaptureFaceDetected.y((6143 & 1) != 0 ? startCaptureFaceDetected.startCaptureTimestamp : 0L, (6143 & 2) != 0 ? startCaptureFaceDetected.cameraProperties : null, (6143 & 4) != 0 ? startCaptureFaceDetected.startSelfieTimestamp : 0L, (6143 & 8) != 0 ? startCaptureFaceDetected.poseScore : 0.0f, (6143 & 16) != 0 ? startCaptureFaceDetected.brightnessInfo : null, (6143 & 32) != 0 ? startCaptureFaceDetected.posesNeeded : null, (6143 & 64) != 0 ? startCaptureFaceDetected.selfies : null, (6143 & Barcode.FORMAT_ITF) != 0 ? startCaptureFaceDetected.backState : null, (6143 & Barcode.FORMAT_QR_CODE) != 0 ? startCaptureFaceDetected.poseConfigs : null, (6143 & Barcode.FORMAT_UPC_A) != 0 ? startCaptureFaceDetected.autoCaptureSupported : false, (6143 & Barcode.FORMAT_UPC_E) != 0 ? startCaptureFaceDetected.cameraFacingMode : null, (6143 & Barcode.FORMAT_PDF417) != 0 ? startCaptureFaceDetected.isFlashEnabled : z10, (6143 & Barcode.FORMAT_AZTEC) != 0 ? startCaptureFaceDetected.isDimLightConditions : false);
            } else if (y0Var instanceof y0.WaitForWebRtcSetup) {
                parcelableZ = y0.WaitForWebRtcSetup.z((y0.WaitForWebRtcSetup) y0Var, null, null, 0L, null, null, null, false, null, z10, 255, null);
            } else {
                if (!(y0Var instanceof y0.AcquireNextPose)) {
                    throw new zt.l();
                }
                parcelableZ = y0.AcquireNextPose.z((y0.AcquireNextPose) y0Var, null, 0L, null, null, null, z10, null, null, false, 479, null);
            }
        } else {
            if (!(y0Var instanceof y0.WaitForCameraFeed)) {
                return Unit.f21506a;
            }
            parcelableZ = y0.WaitForCameraFeed.z((y0.WaitForCameraFeed) y0Var, false, false, null, null, null, false, null, z10, 127, null);
        }
        action.e(parcelableZ);
        return Unit.f21506a;
    }

    public static final q5.d.a.AbstractC0467a s(q5.d.c.b bVar) {
        if (bVar instanceof q5.d.c.b.a) {
            q5.d.c.b.a aVar = (q5.d.c.b.a) bVar;
            return new q5.d.a.AbstractC0467a.b(j6.E(aVar.getOverlay()), aVar.getIsCapturing());
        }
        if (bVar instanceof q5.d.c.b.C0470b) {
            q5.d.c.b.C0470b c0470b = (q5.d.c.b.C0470b) bVar;
            return new q5.d.a.AbstractC0467a.c(j6.E(c0470b.getOverlay()), c0470b.getCountDown());
        }
        if (bVar instanceof q5.d.c.b.C0471c) {
            q5.d.c.b.C0471c c0471c = (q5.d.c.b.C0471c) bVar;
            return new q5.d.a.AbstractC0467a.C0469d(j6.E(c0471c.getOverlay()), c0471c.b(), c0471c.c(), c0471c.getStartFinalize());
        }
        if (bVar instanceof q5.d.c.b.C0472d) {
            q5.d.c.b.C0472d c0472d = (q5.d.c.b.C0472d) bVar;
            return new q5.d.a.AbstractC0467a.e(j6.E(c0472d.getOverlay()), c0472d.d(), c0472d.c(), c0472d.getForceCapture(), c0472d.getIsCapturing());
        }
        if (bVar instanceof q5.d.c.b.e) {
            q5.d.c.b.e eVar = (q5.d.c.b.e) bVar;
            return new q5.d.a.AbstractC0467a.f(j6.E(eVar.getOverlay()), eVar.b());
        }
        if (bVar instanceof q5.d.c.b.f) {
            q5.d.c.b.f fVar = (q5.d.c.b.f) bVar;
            return new q5.d.a.AbstractC0467a.g(j6.E(fVar.getOverlay()), fVar.b());
        }
        if (bVar instanceof q5.d.c.b.g) {
            q5.d.c.b.g gVar = (q5.d.c.b.g) bVar;
            return new q5.d.a.AbstractC0467a.h(j6.E(gVar.getOverlay()), gVar.getRecordLocalVideo(), gVar.getMaxRecordingLengthMs(), gVar.d(), gVar.c());
        }
        if (bVar instanceof q5.d.c.b.h) {
            q5.d.c.b.h hVar = (q5.d.c.b.h) bVar;
            return new q5.d.a.AbstractC0467a.i(j6.E(hVar.getOverlay()), hVar.c(), hVar.getImageCaptured());
        }
        if (!(bVar instanceof q5.d.c.b.i)) {
            throw new zt.l();
        }
        q5.d.c.b.i iVar = (q5.d.c.b.i) bVar;
        return new q5.d.a.AbstractC0467a.j(j6.E(iVar.getOverlay()), iVar.getMaxRecordingLengthMs());
    }
}
