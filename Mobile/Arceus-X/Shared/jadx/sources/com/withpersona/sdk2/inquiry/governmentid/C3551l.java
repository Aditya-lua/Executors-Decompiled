package com.withpersona.sdk2.inquiry.governmentid;

import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import hn.C6434c;
import io.EnumC6852d;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mn.EnumC8598a;
import mo.InterfaceC8607i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p361po.EnumC10302b;
import p476ur.InterfaceC11932a;
import p526wq.EnumC12529l;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.l */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a½\u0003\u0010=\u001a\u00020<2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2 \b\u0002\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2 \b\u0002\u0010$\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00102\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00130%2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00130%j\u0002`(2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020\u00182\b\b\u0002\u0010-\u001a\u00020\u00182\b\b\u0002\u0010.\u001a\u00020\u00182\u001a\b\u0002\u00100\u001a\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00102\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\b\b\u0002\u00103\u001a\u00020\u001e2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\b\b\u0002\u00109\u001a\u00020\u00182\b\b\u0002\u0010;\u001a\u00020:¢\u0006\u0004\b=\u0010>¨\u0006?"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "", Title.type, "description", "message", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "captureButtonState", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlay", "Lpo/b;", "idClass", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "captureSide", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function2;", "", "Lcom/withpersona/sdk2/camera/CameraProperties;", "", "manuallyCapture", "Lkotlin/Function0;", "close", "back", "", "autoCapturing", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "autoCaptureRules", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "state", "", "autoCaptureRulesId", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "autoCapture", "Lkotlin/Function1;", "", "onCaptureError", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "onCameraError", "Lmn/a;", "videoCaptureMethod", "enableAnalyzer", "showFinalizeUi", "finalizeLocalVideo", "Ljava/io/File;", "onLocalVideoFinalized", "manualCaptureClicked", "checkPermissions", "remainingCaptureCount", "hintText", "Lmo/i;", "captureTips", "Lur/a;", "webRtcManager", "holographicTorchEnabled", "Lwq/l;", "transition", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "f", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lpo/b;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lmn/a;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/String;Lmo/i;Lur/a;ZLwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3551l {
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Screen.C3527b m17572f(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull String title, @NotNull String description, @NotNull String message, @NotNull Screen.C3527b.a captureButtonState, @NotNull Screen.Overlay overlay, @NotNull EnumC10302b idClass, @NotNull IdConfig.EnumC3514b captureSide, @NotNull NavigationState navigationState, @NotNull Function2<? super List<String>, ? super CameraProperties, Unit> manuallyCapture, @NotNull Function0<Unit> close, @NotNull Function0<Unit> back, boolean z10, @NotNull List<? extends AutoCaptureRule> autoCaptureRules, @NotNull GovernmentIdState state, int i10, @NotNull C3405e.a cameraXControllerFactory, @NotNull C6434c.a camera2ControllerFactory, @NotNull Function2<? super List<String>, ? super CameraProperties, Unit> autoCapture, @NotNull Function1<? super Throwable, Unit> onCaptureError, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull EnumC8598a videoCaptureMethod, boolean z11, boolean z12, boolean z13, @NotNull Function2<? super File, ? super CameraProperties, Unit> onLocalVideoFinalized, @NotNull Function0<Unit> manualCaptureClicked, @NotNull Function0<Unit> checkPermissions, int i11, @Nullable String str, @Nullable InterfaceC8607i interfaceC8607i, @Nullable InterfaceC11932a interfaceC11932a, boolean z14, @NotNull EnumC12529l transition) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(captureButtonState, "captureButtonState");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter(idClass, "idClass");
        Intrinsics.checkNotNullParameter(captureSide, "captureSide");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(manuallyCapture, "manuallyCapture");
        Intrinsics.checkNotNullParameter(close, "close");
        Intrinsics.checkNotNullParameter(back, "back");
        Intrinsics.checkNotNullParameter(autoCaptureRules, "autoCaptureRules");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(autoCapture, "autoCapture");
        Intrinsics.checkNotNullParameter(onCaptureError, "onCaptureError");
        Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
        Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
        Intrinsics.checkNotNullParameter(onLocalVideoFinalized, "onLocalVideoFinalized");
        Intrinsics.checkNotNullParameter(manualCaptureClicked, "manualCaptureClicked");
        Intrinsics.checkNotNullParameter(checkPermissions, "checkPermissions");
        Intrinsics.checkNotNullParameter(transition, "transition");
        String strM17307a = renderProps.getStrings().getScanInstructions().m17307a(null, null, captureSide);
        if (strM17307a == null) {
            strM17307a = "";
        }
        return new Screen.C3527b(title, description, message, strM17307a, renderProps.getStrings().getCaptureDisclaimer(), captureButtonState, overlay, idClass, captureSide, navigationState, manuallyCapture, close, back, z10, autoCaptureRules, state, i10, renderProps.getStyles(), autoCapture, onCaptureError, onCameraError, i11, manualCaptureClicked, checkPermissions, videoCaptureMethod, z13, onLocalVideoFinalized, z11, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), z12, str, renderProps.getStrings().getCapturePageNavBarTitle(), interfaceC8607i, interfaceC11932a, renderProps.getAssetConfig().getCapturePage(), renderProps.getIsEnabled(), renderProps.getVideoCaptureConfig().getRecordAudio(), cameraXControllerFactory, camera2ControllerFactory, renderProps.getDesignVersion(), videoCaptureMethod != EnumC8598a.None || renderProps.getDesignVersion() == EnumC6852d.K0000, z14, renderProps.getFlowWatermarkText(), transition);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m17574h(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m17575i(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m17576j(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m17577k(File file, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(file, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m17578l() {
        return Unit.f29331a;
    }
}
