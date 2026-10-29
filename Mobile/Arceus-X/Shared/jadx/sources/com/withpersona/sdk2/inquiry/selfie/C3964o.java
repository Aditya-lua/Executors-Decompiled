package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.selfie.C3964o;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import hn.C6434c;
import kn.EnumC7638a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mn.EnumC8598a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p134fq.C5776l2;
import p229jt.C7345l;
import p476ur.InterfaceC11932a;
import p499vr.C12255f;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13208b0;
import p584yp.EnumC13272a;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.o */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a×\u0002\u00108\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002&\u0010\b\u001a\"0\u0002R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190\u001cj\u0002`\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\b\b\u0002\u00103\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u00020\u000f2\b\b\u0002\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b8\u00109\u001a½\u0002\u0010;\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050:2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00190\u001cj\u0002`\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\b\b\u0002\u00103\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u00020\u000f2\b\b\u0002\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b;\u0010<\u001a\u001f\u0010=\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b=\u0010>\u001a\u001f\u0010?\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b?\u0010>\u001a\u0013\u0010A\u001a\u00020@*\u00020\u0011H\u0002¢\u0006\u0004\bA\u0010B¨\u0006C"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "renderProps", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "", "context", "Lkn/a;", "pose", "", Title.type, "message", "realTimeHint", "", "isAutoCaptureOn", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "mode", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "assetOverrides", "requireStrictSelfieCapture", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "isAudioRequired", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "facingMode", "isFlashEnabled", "isAutoFlashOnManualCaptureEnabled", "isDimLightConditions", "isFlashOn", "requestingPermissions", "recordingLocallyRequired", "allowSwitchCamera", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "m", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZ)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lvr/f;", "g", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lvr/f;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZ)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "l", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lkn/a;)Ljava/lang/String;", "k", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "s", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "selfie_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3964o {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.o$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16686a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f16687b;

        static {
            int[] iArr = new int[EnumC7638a.values().length];
            try {
                iArr[EnumC7638a.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7638a.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7638a.Center.ordinal()] = 3;
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
            f16686a = iArr;
            int[] iArr2 = new int[EnumC13272a.values().length];
            try {
                iArr2[EnumC13272a.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC13272a.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC13272a.K0000.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f16687b = iArr2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final SelfieWorkflow.AbstractC3928c m20148g(@NotNull SelfieWorkflow.Input renderProps, @NotNull final C12255f<SelfieState> context, @Nullable EnumC7638a enumC7638a, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, @NotNull SelfieWorkflow.AbstractC3928c.c.b mode, @NotNull SelfieWorkflow.AbstractC3928c.c.AssetOverrides assetOverrides, boolean z11, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull EnumC8598a videoCaptureMethod, @Nullable InterfaceC11932a interfaceC11932a, boolean z12, @NotNull C3405e.a cameraXControllerFactory, @NotNull C6434c.a camera2ControllerFactory, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, @NotNull CameraProperties.EnumC3397b facingMode, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
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
        int i10 = a.f16687b[renderProps.getDesignVersion().ordinal()];
        if (i10 == 1) {
            return new SelfieWorkflow.AbstractC3928c.c(str, str2, mode, renderProps.getStyles(), assetOverrides, z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, interfaceC11932a, z12, cameraXControllerFactory, camera2ControllerFactory, z18, renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
        }
        if (i10 != 2 && i10 != 3) {
            throw new C7345l();
        }
        if (!(mode instanceof SelfieWorkflow.AbstractC3928c.c.b.g)) {
            cameraLoadingTitle = mode instanceof SelfieWorkflow.AbstractC3928c.c.b.i ? renderProps.getStrings().getCameraLoadingTitle() : m20153l(renderProps, enumC7638a);
        } else if (renderProps.getDesignVersion() == EnumC13272a.K0000) {
            PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderProps.m19683A());
            EnumC7638a pose = poseInfo != null ? poseInfo.getPose() : null;
            int i11 = pose == null ? -1 : a.f16686a[pose.ordinal()];
            if (i11 == 1 || i11 == 2) {
                cameraLoadingTitle = m20153l(renderProps, enumC7638a);
            } else {
                cameraLoadingTitle = i11 != 3 ? renderProps.getStrings().getCameraLoadingTitle() : m20152k(renderProps, enumC7638a);
            }
        } else {
            cameraLoadingTitle = renderProps.getStrings().getCameraLoadingTitle();
        }
        String strM20152k = m20152k(renderProps, enumC7638a);
        String autoCaptureOn = z10 ? renderProps.getStrings().getAutoCaptureOn() : null;
        String captureSuccess = renderProps.getStrings().getCaptureSuccess();
        String disclaimer = renderProps.getStrings().getDisclaimer();
        String selfieHintVerifying = renderProps.getStrings().getSelfieHintVerifying();
        return new SelfieWorkflow.AbstractC3928c.a(str, cameraLoadingTitle, strM20152k, autoCaptureOn, captureSuccess, disclaimer, str3, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), selfieHintVerifying, z10, m20160s(mode), renderProps.getStyles(), z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, interfaceC11932a, z12, cameraXControllerFactory, camera2ControllerFactory, new Function1() { // from class: yp.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3964o.m20150i(context, (CameraProperties.EnumC3397b) obj);
            }
        }, f10, selfieBrightnessInfo, facingMode, z13, z14, z16, z15, new Function1() { // from class: yp.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3964o.m20151j(context, ((Boolean) obj).booleanValue());
            }
        }, enumC7638a, z17, z18, z19, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m20150i(C12255f c12255f, CameraProperties.EnumC3397b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c12255f.m45417p(new SelfieState.RestartCamera(false, false, C5776l2.m26149a(c12255f, false), it, 3, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m20151j(C12255f c12255f, boolean z10) {
        SelfieState selfieStateM19402A;
        SelfieState selfieState = (SelfieState) c12255f.m45411i();
        if (selfieState instanceof InterfaceC3939a) {
            if (selfieState instanceof SelfieState.Capture) {
                SelfieState.Capture capture = (SelfieState.Capture) selfieState;
                selfieStateM19402A = capture.m19322z((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & 256) != 0 ? capture.cameraProperties : null, (57343 & 512) != 0 ? capture.backState : null, (57343 & 1024) != 0 ? capture.poseConfigs : null, (57343 & 2048) != 0 ? capture.cameraFacingMode : null, (57343 & 4096) != 0 ? capture.isFlashEnabled : z10, (57343 & 8192) != 0 ? capture.flashState : null, (57343 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.CountdownToManualCapture) {
                SelfieState.CountdownToManualCapture countdownToManualCapture = (SelfieState.CountdownToManualCapture) selfieState;
                selfieStateM19402A = countdownToManualCapture.m19344z((4092 & 1) != 0 ? countdownToManualCapture.countDown : 0, (4092 & 2) != 0 ? countdownToManualCapture.selfieError : null, (4092 & 4) != 0 ? countdownToManualCapture.cameraProperties : null, (4092 & 8) != 0 ? countdownToManualCapture.posesNeeded : null, (4092 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : 0L, (4092 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : false, (4092 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : 0L, (4092 & 128) != 0 ? countdownToManualCapture.backState : null, (4092 & 256) != 0 ? countdownToManualCapture.poseConfigs : null, (4092 & 512) != 0 ? countdownToManualCapture.cameraFacingMode : null, (4092 & 1024) != 0 ? countdownToManualCapture.isFlashEnabled : z10, (4092 & 2048) != 0 ? countdownToManualCapture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.StartCapture) {
                SelfieState.StartCapture startCapture = (SelfieState.StartCapture) selfieState;
                selfieStateM19402A = startCapture.m19382z((16242 & 1) != 0 ? startCapture.centered : false, (16242 & 2) != 0 ? startCapture.selfieError : null, (16242 & 4) != 0 ? startCapture.poseScore : 0.0f, (16242 & 8) != 0 ? startCapture.brightnessInfo : null, (16242 & 16) != 0 ? startCapture.posesNeeded : null, (16242 & 32) != 0 ? startCapture.selfies : null, (16242 & 64) != 0 ? startCapture.startCaptureTimestamp : 0L, (16242 & 128) != 0 ? startCapture.autoCaptureSupported : false, (16242 & 256) != 0 ? startCapture.startSelfieTimestamp : 0L, (16242 & 512) != 0 ? startCapture.cameraProperties : null, (16242 & 1024) != 0 ? startCapture.backState : null, (16242 & 2048) != 0 ? startCapture.poseConfigs : null, (16242 & 4096) != 0 ? startCapture.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture.isFlashEnabled : z10, (16242 & 16384) != 0 ? startCapture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.CountdownToCapture) {
                SelfieState.CountdownToCapture countdownToCapture = (SelfieState.CountdownToCapture) selfieState;
                selfieStateM19402A = countdownToCapture.m19337z((32764 & 1) != 0 ? countdownToCapture.countDown : 0, (32764 & 2) != 0 ? countdownToCapture.selfieError : null, (32764 & 4) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (32764 & 8) != 0 ? countdownToCapture.cameraProperties : null, (32764 & 16) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (32764 & 32) != 0 ? countdownToCapture.poseScore : 0.0f, (32764 & 64) != 0 ? countdownToCapture.brightnessInfo : null, (32764 & 128) != 0 ? countdownToCapture.posesNeeded : null, (32764 & 256) != 0 ? countdownToCapture.selfies : null, (32764 & 512) != 0 ? countdownToCapture.backState : null, (32764 & 1024) != 0 ? countdownToCapture.poseConfigs : null, (32764 & 2048) != 0 ? countdownToCapture.autoCaptureSupported : false, (32764 & 4096) != 0 ? countdownToCapture.cameraFacingMode : null, (32764 & 8192) != 0 ? countdownToCapture.isFlashEnabled : z10, (32764 & 16384) != 0 ? countdownToCapture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.ShowPoseHint) {
                selfieStateM19402A = SelfieState.ShowPoseHint.m19373A((SelfieState.ShowPoseHint) selfieState, null, null, false, null, 0L, null, null, null, z10, 255, null);
            } else if (selfieState instanceof SelfieState.StartCaptureFaceDetected) {
                SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = (SelfieState.StartCaptureFaceDetected) selfieState;
                selfieStateM19402A = startCaptureFaceDetected.m19390z((6143 & 1) != 0 ? startCaptureFaceDetected.startCaptureTimestamp : 0L, (6143 & 2) != 0 ? startCaptureFaceDetected.cameraProperties : null, (6143 & 4) != 0 ? startCaptureFaceDetected.startSelfieTimestamp : 0L, (6143 & 8) != 0 ? startCaptureFaceDetected.poseScore : 0.0f, (6143 & 16) != 0 ? startCaptureFaceDetected.brightnessInfo : null, (6143 & 32) != 0 ? startCaptureFaceDetected.posesNeeded : null, (6143 & 64) != 0 ? startCaptureFaceDetected.selfies : null, (6143 & 128) != 0 ? startCaptureFaceDetected.backState : null, (6143 & 256) != 0 ? startCaptureFaceDetected.poseConfigs : null, (6143 & 512) != 0 ? startCaptureFaceDetected.autoCaptureSupported : false, (6143 & 1024) != 0 ? startCaptureFaceDetected.cameraFacingMode : null, (6143 & 2048) != 0 ? startCaptureFaceDetected.isFlashEnabled : z10, (6143 & 4096) != 0 ? startCaptureFaceDetected.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.WaitForWebRtcSetup) {
                selfieStateM19402A = SelfieState.WaitForWebRtcSetup.m19410A((SelfieState.WaitForWebRtcSetup) selfieState, null, null, 0L, null, null, null, false, null, z10, 255, null);
            } else {
                if (!(selfieState instanceof SelfieState.AcquireNextPose)) {
                    throw new C7345l();
                }
                selfieStateM19402A = SelfieState.AcquireNextPose.m19299A((SelfieState.AcquireNextPose) selfieState, null, 0L, null, null, null, z10, null, null, false, 479, null);
            }
        } else {
            if (!(selfieState instanceof SelfieState.WaitForCameraFeed)) {
                return Unit.f29331a;
            }
            selfieStateM19402A = SelfieState.WaitForCameraFeed.m19402A((SelfieState.WaitForCameraFeed) selfieState, false, false, null, null, null, false, null, z10, 127, null);
        }
        c12255f.m45417p(selfieStateM19402A);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public static final String m20152k(SelfieWorkflow.Input input, EnumC7638a enumC7638a) {
        int i10 = enumC7638a == null ? -1 : a.f16686a[enumC7638a.ordinal()];
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
        throw new C7345l();
    }

    /* JADX INFO: renamed from: l */
    public static final String m20153l(SelfieWorkflow.Input input, EnumC7638a enumC7638a) {
        int i10 = enumC7638a == null ? -1 : a.f16686a[enumC7638a.ordinal()];
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
        throw new C7345l();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final SelfieWorkflow.AbstractC3928c m20154m(@NotNull SelfieWorkflow.Input renderProps, @NotNull final AbstractC13218k<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.AbstractC3927b, ? extends Object>.a context, @Nullable EnumC7638a enumC7638a, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, @NotNull SelfieWorkflow.AbstractC3928c.c.b mode, @NotNull SelfieWorkflow.AbstractC3928c.c.AssetOverrides assetOverrides, boolean z11, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull EnumC8598a videoCaptureMethod, @Nullable InterfaceC11932a interfaceC11932a, boolean z12, @NotNull C3405e.a cameraXControllerFactory, @NotNull C6434c.a camera2ControllerFactory, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, @NotNull CameraProperties.EnumC3397b facingMode, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
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
        int i10 = a.f16687b[renderProps.getDesignVersion().ordinal()];
        if (i10 == 1) {
            return new SelfieWorkflow.AbstractC3928c.c(str, str2, mode, renderProps.getStyles(), assetOverrides, z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, interfaceC11932a, z12, cameraXControllerFactory, camera2ControllerFactory, z18, renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
        }
        if (i10 != 2 && i10 != 3) {
            throw new C7345l();
        }
        if (!(mode instanceof SelfieWorkflow.AbstractC3928c.c.b.g)) {
            cameraLoadingTitle = mode instanceof SelfieWorkflow.AbstractC3928c.c.b.i ? renderProps.getStrings().getCameraLoadingTitle() : m20153l(renderProps, enumC7638a);
        } else if (renderProps.getDesignVersion() == EnumC13272a.K0000) {
            PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderProps.m19683A());
            EnumC7638a pose = poseInfo != null ? poseInfo.getPose() : null;
            int i11 = pose == null ? -1 : a.f16686a[pose.ordinal()];
            if (i11 == 1 || i11 == 2) {
                cameraLoadingTitle = m20153l(renderProps, enumC7638a);
            } else {
                cameraLoadingTitle = i11 != 3 ? renderProps.getStrings().getCameraLoadingTitle() : m20152k(renderProps, enumC7638a);
            }
        } else {
            cameraLoadingTitle = renderProps.getStrings().getCameraLoadingTitle();
        }
        String strM20152k = m20152k(renderProps, enumC7638a);
        String autoCaptureOn = z10 ? renderProps.getStrings().getAutoCaptureOn() : null;
        String captureSuccess = renderProps.getStrings().getCaptureSuccess();
        String disclaimer = renderProps.getStrings().getDisclaimer();
        String selfieHintVerifying = renderProps.getStrings().getSelfieHintVerifying();
        return new SelfieWorkflow.AbstractC3928c.a(str, cameraLoadingTitle, strM20152k, autoCaptureOn, captureSuccess, disclaimer, str3, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), selfieHintVerifying, z10, m20160s(mode), renderProps.getStyles(), z11, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, interfaceC11932a, z12, cameraXControllerFactory, camera2ControllerFactory, new Function1() { // from class: yp.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3964o.m20156o(context, (CameraProperties.EnumC3397b) obj);
            }
        }, f10, selfieBrightnessInfo, facingMode, z13, z14, z16, z15, new Function1() { // from class: yp.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3964o.m20158q(context, ((Boolean) obj).booleanValue());
            }
        }, enumC7638a, z17, z18, z19, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), renderProps.getStrings().getCapturePageNavBarTitle());
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m20156o(AbstractC13218k.a aVar, final CameraProperties.EnumC3397b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: yp.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3964o.m20157p(it, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m20157p(CameraProperties.EnumC3397b enumC3397b, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(new SelfieState.RestartCamera(false, false, C3965p.m20179k(action, false), enumC3397b, 3, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m20158q(AbstractC13218k.a aVar, final boolean z10) {
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: yp.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3964o.m20159r(z10, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m20159r(boolean z10, AbstractC13225r.c action) {
        SelfieState selfieStateM19402A;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        SelfieState selfieState = (SelfieState) action.m48901c();
        if (selfieState instanceof InterfaceC3939a) {
            if (selfieState instanceof SelfieState.Capture) {
                SelfieState.Capture capture = (SelfieState.Capture) selfieState;
                selfieStateM19402A = capture.m19322z((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & 256) != 0 ? capture.cameraProperties : null, (57343 & 512) != 0 ? capture.backState : null, (57343 & 1024) != 0 ? capture.poseConfigs : null, (57343 & 2048) != 0 ? capture.cameraFacingMode : null, (57343 & 4096) != 0 ? capture.isFlashEnabled : z10, (57343 & 8192) != 0 ? capture.flashState : null, (57343 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.CountdownToManualCapture) {
                SelfieState.CountdownToManualCapture countdownToManualCapture = (SelfieState.CountdownToManualCapture) selfieState;
                selfieStateM19402A = countdownToManualCapture.m19344z((4092 & 1) != 0 ? countdownToManualCapture.countDown : 0, (4092 & 2) != 0 ? countdownToManualCapture.selfieError : null, (4092 & 4) != 0 ? countdownToManualCapture.cameraProperties : null, (4092 & 8) != 0 ? countdownToManualCapture.posesNeeded : null, (4092 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : 0L, (4092 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : false, (4092 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : 0L, (4092 & 128) != 0 ? countdownToManualCapture.backState : null, (4092 & 256) != 0 ? countdownToManualCapture.poseConfigs : null, (4092 & 512) != 0 ? countdownToManualCapture.cameraFacingMode : null, (4092 & 1024) != 0 ? countdownToManualCapture.isFlashEnabled : z10, (4092 & 2048) != 0 ? countdownToManualCapture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.StartCapture) {
                SelfieState.StartCapture startCapture = (SelfieState.StartCapture) selfieState;
                selfieStateM19402A = startCapture.m19382z((16242 & 1) != 0 ? startCapture.centered : false, (16242 & 2) != 0 ? startCapture.selfieError : null, (16242 & 4) != 0 ? startCapture.poseScore : 0.0f, (16242 & 8) != 0 ? startCapture.brightnessInfo : null, (16242 & 16) != 0 ? startCapture.posesNeeded : null, (16242 & 32) != 0 ? startCapture.selfies : null, (16242 & 64) != 0 ? startCapture.startCaptureTimestamp : 0L, (16242 & 128) != 0 ? startCapture.autoCaptureSupported : false, (16242 & 256) != 0 ? startCapture.startSelfieTimestamp : 0L, (16242 & 512) != 0 ? startCapture.cameraProperties : null, (16242 & 1024) != 0 ? startCapture.backState : null, (16242 & 2048) != 0 ? startCapture.poseConfigs : null, (16242 & 4096) != 0 ? startCapture.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture.isFlashEnabled : z10, (16242 & 16384) != 0 ? startCapture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.CountdownToCapture) {
                SelfieState.CountdownToCapture countdownToCapture = (SelfieState.CountdownToCapture) selfieState;
                selfieStateM19402A = countdownToCapture.m19337z((32764 & 1) != 0 ? countdownToCapture.countDown : 0, (32764 & 2) != 0 ? countdownToCapture.selfieError : null, (32764 & 4) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (32764 & 8) != 0 ? countdownToCapture.cameraProperties : null, (32764 & 16) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (32764 & 32) != 0 ? countdownToCapture.poseScore : 0.0f, (32764 & 64) != 0 ? countdownToCapture.brightnessInfo : null, (32764 & 128) != 0 ? countdownToCapture.posesNeeded : null, (32764 & 256) != 0 ? countdownToCapture.selfies : null, (32764 & 512) != 0 ? countdownToCapture.backState : null, (32764 & 1024) != 0 ? countdownToCapture.poseConfigs : null, (32764 & 2048) != 0 ? countdownToCapture.autoCaptureSupported : false, (32764 & 4096) != 0 ? countdownToCapture.cameraFacingMode : null, (32764 & 8192) != 0 ? countdownToCapture.isFlashEnabled : z10, (32764 & 16384) != 0 ? countdownToCapture.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.ShowPoseHint) {
                selfieStateM19402A = SelfieState.ShowPoseHint.m19373A((SelfieState.ShowPoseHint) selfieState, null, null, false, null, 0L, null, null, null, z10, 255, null);
            } else if (selfieState instanceof SelfieState.StartCaptureFaceDetected) {
                SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = (SelfieState.StartCaptureFaceDetected) selfieState;
                selfieStateM19402A = startCaptureFaceDetected.m19390z((6143 & 1) != 0 ? startCaptureFaceDetected.startCaptureTimestamp : 0L, (6143 & 2) != 0 ? startCaptureFaceDetected.cameraProperties : null, (6143 & 4) != 0 ? startCaptureFaceDetected.startSelfieTimestamp : 0L, (6143 & 8) != 0 ? startCaptureFaceDetected.poseScore : 0.0f, (6143 & 16) != 0 ? startCaptureFaceDetected.brightnessInfo : null, (6143 & 32) != 0 ? startCaptureFaceDetected.posesNeeded : null, (6143 & 64) != 0 ? startCaptureFaceDetected.selfies : null, (6143 & 128) != 0 ? startCaptureFaceDetected.backState : null, (6143 & 256) != 0 ? startCaptureFaceDetected.poseConfigs : null, (6143 & 512) != 0 ? startCaptureFaceDetected.autoCaptureSupported : false, (6143 & 1024) != 0 ? startCaptureFaceDetected.cameraFacingMode : null, (6143 & 2048) != 0 ? startCaptureFaceDetected.isFlashEnabled : z10, (6143 & 4096) != 0 ? startCaptureFaceDetected.isDimLightConditions : false);
            } else if (selfieState instanceof SelfieState.WaitForWebRtcSetup) {
                selfieStateM19402A = SelfieState.WaitForWebRtcSetup.m19410A((SelfieState.WaitForWebRtcSetup) selfieState, null, null, 0L, null, null, null, false, null, z10, 255, null);
            } else {
                if (!(selfieState instanceof SelfieState.AcquireNextPose)) {
                    throw new C7345l();
                }
                selfieStateM19402A = SelfieState.AcquireNextPose.m19299A((SelfieState.AcquireNextPose) selfieState, null, 0L, null, null, null, z10, null, null, false, 479, null);
            }
        } else {
            if (!(selfieState instanceof SelfieState.WaitForCameraFeed)) {
                return Unit.f29331a;
            }
            selfieStateM19402A = SelfieState.WaitForCameraFeed.m19402A((SelfieState.WaitForCameraFeed) selfieState, false, false, null, null, null, false, null, z10, 127, null);
        }
        action.m48903e(selfieStateM19402A);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s */
    public static final SelfieWorkflow.AbstractC3928c.a.AbstractC14138a m20160s(SelfieWorkflow.AbstractC3928c.c.b bVar) {
        if (bVar instanceof SelfieWorkflow.AbstractC3928c.c.b.a) {
            SelfieWorkflow.AbstractC3928c.c.b.a aVar = (SelfieWorkflow.AbstractC3928c.c.b.a) bVar;
            return new SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.b(C3965p.m20165E(aVar.getOverlay()), aVar.getIsCapturing());
        }
        if (bVar instanceof SelfieWorkflow.AbstractC3928c.c.b.C14140b) {
            SelfieWorkflow.AbstractC3928c.c.b.C14140b c14140b = (SelfieWorkflow.AbstractC3928c.c.b.C14140b) bVar;
            return new SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.c(C3965p.m20165E(c14140b.getOverlay()), c14140b.getCountDown());
        }
        if (bVar instanceof SelfieWorkflow.AbstractC3928c.c.b.C14141c) {
            SelfieWorkflow.AbstractC3928c.c.b.C14141c c14141c = (SelfieWorkflow.AbstractC3928c.c.b.C14141c) bVar;
            return new SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.d(C3965p.m20165E(c14141c.getOverlay()), c14141c.m19863b(), c14141c.m19864c(), c14141c.getStartFinalize());
        }
        if (bVar instanceof SelfieWorkflow.AbstractC3928c.c.b.d) {
            SelfieWorkflow.AbstractC3928c.c.b.d dVar = (SelfieWorkflow.AbstractC3928c.c.b.d) bVar;
            return new SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.e(C3965p.m20165E(dVar.getOverlay()), dVar.m19869d(), dVar.m19868c(), dVar.getForceCapture(), dVar.getIsCapturing());
        }
        if (bVar instanceof SelfieWorkflow.AbstractC3928c.c.b.e) {
            SelfieWorkflow.AbstractC3928c.c.b.e eVar = (SelfieWorkflow.AbstractC3928c.c.b.e) bVar;
            return new SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.f(C3965p.m20165E(eVar.getOverlay()), eVar.m19872b());
        }
        if (bVar instanceof SelfieWorkflow.AbstractC3928c.c.b.f) {
            SelfieWorkflow.AbstractC3928c.c.b.f fVar = (SelfieWorkflow.AbstractC3928c.c.b.f) bVar;
            return new SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.g(C3965p.m20165E(fVar.getOverlay()), fVar.m19874b());
        }
        if (bVar instanceof SelfieWorkflow.AbstractC3928c.c.b.g) {
            SelfieWorkflow.AbstractC3928c.c.b.g gVar = (SelfieWorkflow.AbstractC3928c.c.b.g) bVar;
            return new SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.h(C3965p.m20165E(gVar.getOverlay()), gVar.getRecordLocalVideo(), gVar.getMaxRecordingLengthMs(), gVar.m19878d(), gVar.m19877c());
        }
        if (bVar instanceof SelfieWorkflow.AbstractC3928c.c.b.h) {
            SelfieWorkflow.AbstractC3928c.c.b.h hVar = (SelfieWorkflow.AbstractC3928c.c.b.h) bVar;
            return new SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.i(C3965p.m20165E(hVar.getOverlay()), hVar.m19882c(), hVar.getImageCaptured());
        }
        if (!(bVar instanceof SelfieWorkflow.AbstractC3928c.c.b.i)) {
            throw new C7345l();
        }
        SelfieWorkflow.AbstractC3928c.c.b.i iVar = (SelfieWorkflow.AbstractC3928c.c.b.i) bVar;
        return new SelfieWorkflow.AbstractC3928c.a.AbstractC14138a.j(C3965p.m20165E(iVar.getOverlay()), iVar.getMaxRecordingLengthMs());
    }
}
