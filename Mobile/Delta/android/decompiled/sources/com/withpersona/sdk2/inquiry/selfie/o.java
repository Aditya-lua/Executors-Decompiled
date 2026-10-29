package com.withpersona.sdk2.inquiry.selfie;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import fq.l2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.b0;
import ym.r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a×\u0002\u00108\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002&\u0010\b\u001a\"0\u0002R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190\u001cj\u0002`\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\b\b\u0002\u00103\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u00020\u000f2\b\b\u0002\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b8\u00109\u001a½\u0002\u0010;\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050:2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190\u001cj\u0002`\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\b\b\u0002\u00103\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u00020\u000f2\b\b\u0002\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b;\u0010<\u001a\u001f\u0010=\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b=\u0010>\u001a\u001f\u0010?\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b?\u0010>\u001a\u0013\u0010A\u001a\u00020@*\u00020\u0011H\u0002¢\u0006\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "renderProps", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "", "context", "Lkn/a;", "pose", "", Title.type, "message", "realTimeHint", "", "isAutoCaptureOn", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "mode", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "assetOverrides", "requireStrictSelfieCapture", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "isAudioRequired", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "facingMode", "isFlashEnabled", "isAutoFlashOnManualCaptureEnabled", "isDimLightConditions", "isFlashOn", "requestingPermissions", "recordingLocallyRequired", "allowSwitchCamera", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "m", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZ)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lvr/f;", "g", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lvr/f;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZ)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "l", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lkn/a;)Ljava/lang/String;", "k", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "s", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13013a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[kn.a.values().length];
            try {
                iArr[kn.a.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kn.a.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kn.a.Center.ordinal()] = 3;
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
            f13013a = iArr;
            int[] iArr2 = new int[yp.a.values().length];
            try {
                iArr2[yp.a.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[yp.a.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[yp.a.K0000.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    @NotNull
    public static final SelfieWorkflow.c g(@NotNull SelfieWorkflow.Input renderProps, @NotNull final vr.f<SelfieState> context, @Nullable kn.a aVar, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, @NotNull SelfieWorkflow.c.C0235c.b mode, @NotNull SelfieWorkflow.c.C0235c.AssetOverrides assetOverrides, boolean z11, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull mn.a videoCaptureMethod, @Nullable ur.a aVar2, boolean z12, @NotNull com.withpersona.sdk2.camera.e.a cameraXControllerFactory, @NotNull hn.c.a camera2ControllerFactory, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, @NotNull CameraProperties.b facingMode, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
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
            return new SelfieWorkflow.c.C0235c(str, str2, mode, renderProps.getStyles(), assetOverrides, z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, aVar2, z12, cameraXControllerFactory, camera2ControllerFactory, z18, renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
        }
        if (i10 != 2 && i10 != 3) {
            throw new jt.l();
        }
        if (!(mode instanceof SelfieWorkflow.c.C0235c.b.g)) {
            cameraLoadingTitle = mode instanceof SelfieWorkflow.c.C0235c.b.i ? renderProps.getStrings().getCameraLoadingTitle() : l(renderProps, aVar);
        } else if (renderProps.getDesignVersion() == yp.a.K0000) {
            PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderProps.A());
            kn.a pose = poseInfo != null ? poseInfo.getPose() : null;
            int i11 = pose == null ? -1 : a.f13013a[pose.ordinal()];
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
        return new SelfieWorkflow.c.a(str, cameraLoadingTitle, strK, autoCaptureOn, captureSuccess, disclaimer, str3, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), selfieHintVerifying, z10, s(mode), renderProps.getStyles(), z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, aVar2, z12, cameraXControllerFactory, camera2ControllerFactory, new Function1() { // from class: yp.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.selfie.o.i(context, (CameraProperties.b) obj);
            }
        }, f10, selfieBrightnessInfo, facingMode, z13, z14, z16, z15, new Function1() { // from class: yp.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.selfie.o.j(context, ((Boolean) obj).booleanValue());
            }
        }, aVar, z17, z18, z19, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
    }

    public static final Unit i(vr.f fVar, CameraProperties.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fVar.p(new SelfieState.RestartCamera(false, false, l2.a(fVar, false), it, 3, null));
        return Unit.f22483a;
    }

    public static final Unit j(vr.f fVar, boolean z10) {
        SelfieState selfieStateA;
        SelfieState selfieState = (SelfieState) fVar.i();
        if (selfieState instanceof com.withpersona.sdk2.inquiry.selfie.a) {
            if (selfieState instanceof SelfieState.Capture) {
                SelfieState.Capture capture = (SelfieState.Capture) selfieState;
                selfieStateA = capture.z((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture.isFlashEnabled : z10, (57343 & 8192) != 0 ? capture.flashState : null, (57343 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.CountdownToManualCapture) {
                SelfieState.CountdownToManualCapture countdownToManualCapture = (SelfieState.CountdownToManualCapture) selfieState;
                selfieStateA = countdownToManualCapture.z((4092 & 1) != 0 ? countdownToManualCapture.countDown : 0, (4092 & 2) != 0 ? countdownToManualCapture.selfieError : null, (4092 & 4) != 0 ? countdownToManualCapture.cameraProperties : null, (4092 & 8) != 0 ? countdownToManualCapture.posesNeeded : null, (4092 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : 0L, (4092 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : false, (4092 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : 0L, (4092 & 128) != 0 ? countdownToManualCapture.backState : null, (4092 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToManualCapture.poseConfigs : null, (4092 & Barcode.FORMAT_UPC_A) != 0 ? countdownToManualCapture.cameraFacingMode : null, (4092 & Barcode.FORMAT_UPC_E) != 0 ? countdownToManualCapture.isFlashEnabled : z10, (4092 & Barcode.FORMAT_PDF417) != 0 ? countdownToManualCapture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.StartCapture) {
                SelfieState.StartCapture startCapture = (SelfieState.StartCapture) selfieState;
                selfieStateA = startCapture.z((16242 & 1) != 0 ? startCapture.centered : false, (16242 & 2) != 0 ? startCapture.selfieError : null, (16242 & 4) != 0 ? startCapture.poseScore : 0.0f, (16242 & 8) != 0 ? startCapture.brightnessInfo : null, (16242 & 16) != 0 ? startCapture.posesNeeded : null, (16242 & 32) != 0 ? startCapture.selfies : null, (16242 & 64) != 0 ? startCapture.startCaptureTimestamp : 0L, (16242 & 128) != 0 ? startCapture.autoCaptureSupported : false, (16242 & Barcode.FORMAT_QR_CODE) != 0 ? startCapture.startSelfieTimestamp : 0L, (16242 & Barcode.FORMAT_UPC_A) != 0 ? startCapture.cameraProperties : null, (16242 & Barcode.FORMAT_UPC_E) != 0 ? startCapture.backState : null, (16242 & Barcode.FORMAT_PDF417) != 0 ? startCapture.poseConfigs : null, (16242 & Barcode.FORMAT_AZTEC) != 0 ? startCapture.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture.isFlashEnabled : z10, (16242 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? startCapture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.CountdownToCapture) {
                SelfieState.CountdownToCapture countdownToCapture = (SelfieState.CountdownToCapture) selfieState;
                selfieStateA = countdownToCapture.z((32764 & 1) != 0 ? countdownToCapture.countDown : 0, (32764 & 2) != 0 ? countdownToCapture.selfieError : null, (32764 & 4) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (32764 & 8) != 0 ? countdownToCapture.cameraProperties : null, (32764 & 16) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (32764 & 32) != 0 ? countdownToCapture.poseScore : 0.0f, (32764 & 64) != 0 ? countdownToCapture.brightnessInfo : null, (32764 & 128) != 0 ? countdownToCapture.posesNeeded : null, (32764 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToCapture.selfies : null, (32764 & Barcode.FORMAT_UPC_A) != 0 ? countdownToCapture.backState : null, (32764 & Barcode.FORMAT_UPC_E) != 0 ? countdownToCapture.poseConfigs : null, (32764 & Barcode.FORMAT_PDF417) != 0 ? countdownToCapture.autoCaptureSupported : false, (32764 & Barcode.FORMAT_AZTEC) != 0 ? countdownToCapture.cameraFacingMode : null, (32764 & 8192) != 0 ? countdownToCapture.isFlashEnabled : z10, (32764 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? countdownToCapture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.ShowPoseHint) {
                selfieStateA = SelfieState.ShowPoseHint.A((SelfieState.ShowPoseHint) selfieState, null, null, false, null, 0L, null, null, null, z10, 255, null);
            } else if (selfieState instanceof SelfieState.StartCaptureFaceDetected) {
                SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = (SelfieState.StartCaptureFaceDetected) selfieState;
                selfieStateA = startCaptureFaceDetected.z((6143 & 1) != 0 ? startCaptureFaceDetected.startCaptureTimestamp : 0L, (6143 & 2) != 0 ? startCaptureFaceDetected.cameraProperties : null, (6143 & 4) != 0 ? startCaptureFaceDetected.startSelfieTimestamp : 0L, (6143 & 8) != 0 ? startCaptureFaceDetected.poseScore : 0.0f, (6143 & 16) != 0 ? startCaptureFaceDetected.brightnessInfo : null, (6143 & 32) != 0 ? startCaptureFaceDetected.posesNeeded : null, (6143 & 64) != 0 ? startCaptureFaceDetected.selfies : null, (6143 & 128) != 0 ? startCaptureFaceDetected.backState : null, (6143 & Barcode.FORMAT_QR_CODE) != 0 ? startCaptureFaceDetected.poseConfigs : null, (6143 & Barcode.FORMAT_UPC_A) != 0 ? startCaptureFaceDetected.autoCaptureSupported : false, (6143 & Barcode.FORMAT_UPC_E) != 0 ? startCaptureFaceDetected.cameraFacingMode : null, (6143 & Barcode.FORMAT_PDF417) != 0 ? startCaptureFaceDetected.isFlashEnabled : z10, (6143 & Barcode.FORMAT_AZTEC) != 0 ? startCaptureFaceDetected.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.WaitForWebRtcSetup) {
                selfieStateA = SelfieState.WaitForWebRtcSetup.A((SelfieState.WaitForWebRtcSetup) selfieState, null, null, 0L, null, null, null, false, null, z10, 255, null);
            } else {
                if (!(selfieState instanceof SelfieState.AcquireNextPose)) {
                    throw new jt.l();
                }
                selfieStateA = SelfieState.AcquireNextPose.A((SelfieState.AcquireNextPose) selfieState, null, 0L, null, null, null, z10, null, null, false, 479, null);
            }
        } else {
            if (!(selfieState instanceof SelfieState.WaitForCameraFeed)) {
                return Unit.f22483a;
            }
            selfieStateA = SelfieState.WaitForCameraFeed.A((SelfieState.WaitForCameraFeed) selfieState, false, false, null, null, null, false, null, z10, 127, null);
        }
        fVar.p(selfieStateA);
        return Unit.f22483a;
    }

    public static final String k(SelfieWorkflow.Input input, kn.a aVar) {
        int i10 = aVar == null ? -1 : a.f13013a[aVar.ordinal()];
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
        throw new jt.l();
    }

    public static final String l(SelfieWorkflow.Input input, kn.a aVar) {
        int i10 = aVar == null ? -1 : a.f13013a[aVar.ordinal()];
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
        throw new jt.l();
    }

    @NotNull
    public static final SelfieWorkflow.c m(@NotNull SelfieWorkflow.Input renderProps, @NotNull final ym.k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.b, ? extends Object>.a context, @Nullable kn.a aVar, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, @NotNull SelfieWorkflow.c.C0235c.b mode, @NotNull SelfieWorkflow.c.C0235c.AssetOverrides assetOverrides, boolean z11, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull mn.a videoCaptureMethod, @Nullable ur.a aVar2, boolean z12, @NotNull com.withpersona.sdk2.camera.e.a cameraXControllerFactory, @NotNull hn.c.a camera2ControllerFactory, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, @NotNull CameraProperties.b facingMode, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
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
            return new SelfieWorkflow.c.C0235c(str, str2, mode, renderProps.getStyles(), assetOverrides, z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, aVar2, z12, cameraXControllerFactory, camera2ControllerFactory, z18, renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
        }
        if (i10 != 2 && i10 != 3) {
            throw new jt.l();
        }
        if (!(mode instanceof SelfieWorkflow.c.C0235c.b.g)) {
            cameraLoadingTitle = mode instanceof SelfieWorkflow.c.C0235c.b.i ? renderProps.getStrings().getCameraLoadingTitle() : l(renderProps, aVar);
        } else if (renderProps.getDesignVersion() == yp.a.K0000) {
            PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderProps.A());
            kn.a pose = poseInfo != null ? poseInfo.getPose() : null;
            int i11 = pose == null ? -1 : a.f13013a[pose.ordinal()];
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
        return new SelfieWorkflow.c.a(str, cameraLoadingTitle, strK, autoCaptureOn, captureSuccess, disclaimer, str3, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), selfieHintVerifying, z10, s(mode), renderProps.getStyles(), z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, aVar2, z12, cameraXControllerFactory, camera2ControllerFactory, new Function1() { // from class: yp.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.selfie.o.o(context, (CameraProperties.b) obj);
            }
        }, f10, selfieBrightnessInfo, facingMode, z13, z14, z16, z15, new Function1() { // from class: yp.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.selfie.o.q(context, ((Boolean) obj).booleanValue());
            }
        }, aVar, z17, z18, z19, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
    }

    public static final Unit o(ym.k.a aVar, final CameraProperties.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(b0.c(null, new Function1() { // from class: yp.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.selfie.o.p(it, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit p(CameraProperties.b bVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(new SelfieState.RestartCamera(false, false, p.k(action, false), bVar, 3, null));
        return Unit.f22483a;
    }

    public static final Unit q(ym.k.a aVar, final boolean z10) {
        aVar.d().a(b0.c(null, new Function1() { // from class: yp.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.selfie.o.r(z10, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit r(boolean z10, r.c action) {
        SelfieState selfieStateA;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        SelfieState selfieState = (SelfieState) action.c();
        if (selfieState instanceof com.withpersona.sdk2.inquiry.selfie.a) {
            if (selfieState instanceof SelfieState.Capture) {
                SelfieState.Capture capture = (SelfieState.Capture) selfieState;
                selfieStateA = capture.z((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture.isFlashEnabled : z10, (57343 & 8192) != 0 ? capture.flashState : null, (57343 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.CountdownToManualCapture) {
                SelfieState.CountdownToManualCapture countdownToManualCapture = (SelfieState.CountdownToManualCapture) selfieState;
                selfieStateA = countdownToManualCapture.z((4092 & 1) != 0 ? countdownToManualCapture.countDown : 0, (4092 & 2) != 0 ? countdownToManualCapture.selfieError : null, (4092 & 4) != 0 ? countdownToManualCapture.cameraProperties : null, (4092 & 8) != 0 ? countdownToManualCapture.posesNeeded : null, (4092 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : 0L, (4092 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : false, (4092 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : 0L, (4092 & 128) != 0 ? countdownToManualCapture.backState : null, (4092 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToManualCapture.poseConfigs : null, (4092 & Barcode.FORMAT_UPC_A) != 0 ? countdownToManualCapture.cameraFacingMode : null, (4092 & Barcode.FORMAT_UPC_E) != 0 ? countdownToManualCapture.isFlashEnabled : z10, (4092 & Barcode.FORMAT_PDF417) != 0 ? countdownToManualCapture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.StartCapture) {
                SelfieState.StartCapture startCapture = (SelfieState.StartCapture) selfieState;
                selfieStateA = startCapture.z((16242 & 1) != 0 ? startCapture.centered : false, (16242 & 2) != 0 ? startCapture.selfieError : null, (16242 & 4) != 0 ? startCapture.poseScore : 0.0f, (16242 & 8) != 0 ? startCapture.brightnessInfo : null, (16242 & 16) != 0 ? startCapture.posesNeeded : null, (16242 & 32) != 0 ? startCapture.selfies : null, (16242 & 64) != 0 ? startCapture.startCaptureTimestamp : 0L, (16242 & 128) != 0 ? startCapture.autoCaptureSupported : false, (16242 & Barcode.FORMAT_QR_CODE) != 0 ? startCapture.startSelfieTimestamp : 0L, (16242 & Barcode.FORMAT_UPC_A) != 0 ? startCapture.cameraProperties : null, (16242 & Barcode.FORMAT_UPC_E) != 0 ? startCapture.backState : null, (16242 & Barcode.FORMAT_PDF417) != 0 ? startCapture.poseConfigs : null, (16242 & Barcode.FORMAT_AZTEC) != 0 ? startCapture.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture.isFlashEnabled : z10, (16242 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? startCapture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.CountdownToCapture) {
                SelfieState.CountdownToCapture countdownToCapture = (SelfieState.CountdownToCapture) selfieState;
                selfieStateA = countdownToCapture.z((32764 & 1) != 0 ? countdownToCapture.countDown : 0, (32764 & 2) != 0 ? countdownToCapture.selfieError : null, (32764 & 4) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (32764 & 8) != 0 ? countdownToCapture.cameraProperties : null, (32764 & 16) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (32764 & 32) != 0 ? countdownToCapture.poseScore : 0.0f, (32764 & 64) != 0 ? countdownToCapture.brightnessInfo : null, (32764 & 128) != 0 ? countdownToCapture.posesNeeded : null, (32764 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToCapture.selfies : null, (32764 & Barcode.FORMAT_UPC_A) != 0 ? countdownToCapture.backState : null, (32764 & Barcode.FORMAT_UPC_E) != 0 ? countdownToCapture.poseConfigs : null, (32764 & Barcode.FORMAT_PDF417) != 0 ? countdownToCapture.autoCaptureSupported : false, (32764 & Barcode.FORMAT_AZTEC) != 0 ? countdownToCapture.cameraFacingMode : null, (32764 & 8192) != 0 ? countdownToCapture.isFlashEnabled : z10, (32764 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? countdownToCapture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.ShowPoseHint) {
                selfieStateA = SelfieState.ShowPoseHint.A((SelfieState.ShowPoseHint) selfieState, null, null, false, null, 0L, null, null, null, z10, 255, null);
            } else if (selfieState instanceof SelfieState.StartCaptureFaceDetected) {
                SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = (SelfieState.StartCaptureFaceDetected) selfieState;
                selfieStateA = startCaptureFaceDetected.z((6143 & 1) != 0 ? startCaptureFaceDetected.startCaptureTimestamp : 0L, (6143 & 2) != 0 ? startCaptureFaceDetected.cameraProperties : null, (6143 & 4) != 0 ? startCaptureFaceDetected.startSelfieTimestamp : 0L, (6143 & 8) != 0 ? startCaptureFaceDetected.poseScore : 0.0f, (6143 & 16) != 0 ? startCaptureFaceDetected.brightnessInfo : null, (6143 & 32) != 0 ? startCaptureFaceDetected.posesNeeded : null, (6143 & 64) != 0 ? startCaptureFaceDetected.selfies : null, (6143 & 128) != 0 ? startCaptureFaceDetected.backState : null, (6143 & Barcode.FORMAT_QR_CODE) != 0 ? startCaptureFaceDetected.poseConfigs : null, (6143 & Barcode.FORMAT_UPC_A) != 0 ? startCaptureFaceDetected.autoCaptureSupported : false, (6143 & Barcode.FORMAT_UPC_E) != 0 ? startCaptureFaceDetected.cameraFacingMode : null, (6143 & Barcode.FORMAT_PDF417) != 0 ? startCaptureFaceDetected.isFlashEnabled : z10, (6143 & Barcode.FORMAT_AZTEC) != 0 ? startCaptureFaceDetected.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.WaitForWebRtcSetup) {
                selfieStateA = SelfieState.WaitForWebRtcSetup.A((SelfieState.WaitForWebRtcSetup) selfieState, null, null, 0L, null, null, null, false, null, z10, 255, null);
            } else {
                if (!(selfieState instanceof SelfieState.AcquireNextPose)) {
                    throw new jt.l();
                }
                selfieStateA = SelfieState.AcquireNextPose.A((SelfieState.AcquireNextPose) selfieState, null, 0L, null, null, null, z10, null, null, false, 479, null);
            }
        } else {
            if (!(selfieState instanceof SelfieState.WaitForCameraFeed)) {
                return Unit.f22483a;
            }
            selfieStateA = SelfieState.WaitForCameraFeed.A((SelfieState.WaitForCameraFeed) selfieState, false, false, null, null, null, false, null, z10, 127, null);
        }
        action.e(selfieStateA);
        return Unit.f22483a;
    }

    public static final SelfieWorkflow.c.a.AbstractC0232a s(SelfieWorkflow.c.C0235c.b bVar) {
        if (bVar instanceof SelfieWorkflow.c.C0235c.b.a) {
            SelfieWorkflow.c.C0235c.b.a aVar = (SelfieWorkflow.c.C0235c.b.a) bVar;
            return new SelfieWorkflow.c.a.AbstractC0232a.b(p.E(aVar.getOverlay()), aVar.getIsCapturing());
        }
        if (bVar instanceof SelfieWorkflow.c.C0235c.b.C0236b) {
            SelfieWorkflow.c.C0235c.b.C0236b c0236b = (SelfieWorkflow.c.C0235c.b.C0236b) bVar;
            return new SelfieWorkflow.c.a.AbstractC0232a.C0234c(p.E(c0236b.getOverlay()), c0236b.getCountDown());
        }
        if (bVar instanceof SelfieWorkflow.c.C0235c.b.C0237c) {
            SelfieWorkflow.c.C0235c.b.C0237c c0237c = (SelfieWorkflow.c.C0235c.b.C0237c) bVar;
            return new SelfieWorkflow.c.a.AbstractC0232a.d(p.E(c0237c.getOverlay()), c0237c.b(), c0237c.c(), c0237c.getStartFinalize());
        }
        if (bVar instanceof SelfieWorkflow.c.C0235c.b.d) {
            SelfieWorkflow.c.C0235c.b.d dVar = (SelfieWorkflow.c.C0235c.b.d) bVar;
            return new SelfieWorkflow.c.a.AbstractC0232a.e(p.E(dVar.getOverlay()), dVar.d(), dVar.c(), dVar.getForceCapture(), dVar.getIsCapturing());
        }
        if (bVar instanceof SelfieWorkflow.c.C0235c.b.e) {
            SelfieWorkflow.c.C0235c.b.e eVar = (SelfieWorkflow.c.C0235c.b.e) bVar;
            return new SelfieWorkflow.c.a.AbstractC0232a.f(p.E(eVar.getOverlay()), eVar.b());
        }
        if (bVar instanceof SelfieWorkflow.c.C0235c.b.f) {
            SelfieWorkflow.c.C0235c.b.f fVar = (SelfieWorkflow.c.C0235c.b.f) bVar;
            return new SelfieWorkflow.c.a.AbstractC0232a.g(p.E(fVar.getOverlay()), fVar.b());
        }
        if (bVar instanceof SelfieWorkflow.c.C0235c.b.g) {
            SelfieWorkflow.c.C0235c.b.g gVar = (SelfieWorkflow.c.C0235c.b.g) bVar;
            return new SelfieWorkflow.c.a.AbstractC0232a.h(p.E(gVar.getOverlay()), gVar.getRecordLocalVideo(), gVar.getMaxRecordingLengthMs(), gVar.d(), gVar.c());
        }
        if (bVar instanceof SelfieWorkflow.c.C0235c.b.h) {
            SelfieWorkflow.c.C0235c.b.h hVar = (SelfieWorkflow.c.C0235c.b.h) bVar;
            return new SelfieWorkflow.c.a.AbstractC0232a.i(p.E(hVar.getOverlay()), hVar.c(), hVar.getImageCaptured());
        }
        if (!(bVar instanceof SelfieWorkflow.c.C0235c.b.i)) {
            throw new jt.l();
        }
        SelfieWorkflow.c.C0235c.b.i iVar = (SelfieWorkflow.c.C0235c.b.i) bVar;
        return new SelfieWorkflow.c.a.AbstractC0232a.j(p.E(iVar.getOverlay()), iVar.getMaxRecordingLengthMs());
    }
}
