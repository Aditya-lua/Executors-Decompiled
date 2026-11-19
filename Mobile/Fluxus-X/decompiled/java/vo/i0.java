package vo;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import java.io.File;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a½\u0003\u0010=\u001a\u00020<2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2 \b\u0002\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2 \b\u0002\u0010$\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00102\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00130%2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00130%j\u0002`(2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020\u00182\b\b\u0002\u0010-\u001a\u00020\u00182\b\b\u0002\u0010.\u001a\u00020\u00182\u001a\b\u0002\u00100\u001a\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00102\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\b\b\u0002\u00103\u001a\u00020\u001e2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\b\b\u0002\u00109\u001a\u00020\u00182\b\b\u0002\u0010;\u001a\u00020:¢\u0006\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lvo/d2$a;", "renderProps", BuildConfig.FLAVOR, Title.type, "description", "message", "Lvo/y3$b$a;", "captureButtonState", "Lvo/y3$f;", "overlay", "Ldp/e;", "idClass", "Lvo/d3$e;", "captureSide", "Lir/a;", "navigationState", "Lkotlin/Function2;", BuildConfig.FLAVOR, "Lsn/v;", BuildConfig.FLAVOR, "manuallyCapture", "Lkotlin/Function0;", "close", "back", BuildConfig.FLAVOR, "autoCapturing", "Lsn/e;", "autoCaptureRules", "Lvo/j0;", "state", BuildConfig.FLAVOR, "autoCaptureRulesId", "Lsn/a0$a;", "cameraXControllerFactory", "Lun/c$a;", "camera2ControllerFactory", "autoCapture", "Lkotlin/Function1;", BuildConfig.FLAVOR, "onCaptureError", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "onCameraError", "Lzn/a;", "videoCaptureMethod", "enableAnalyzer", "showFinalizeUi", "finalizeLocalVideo", "Ljava/io/File;", "onLocalVideoFinalized", "manualCaptureClicked", "checkPermissions", "remainingCaptureCount", "hintText", "Lzo/i;", "captureTips", "Lks/a;", "webRtcManager", "holographicTorchEnabled", "Lkr/l;", "transition", "Lvo/y3$b;", "f", "(Lvo/d2$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo/y3$b$a;Lvo/y3$f;Ldp/e;Lvo/d3$e;Lir/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/util/List;Lvo/j0;ILsn/a0$a;Lun/c$a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lzn/a;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/String;Lzo/i;Lks/a;ZLkr/l;)Lvo/y3$b;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i0 {
    @NotNull
    public static final y3.b f(@NotNull d2.a renderProps, @NotNull String title, @NotNull String description, @NotNull String message, @NotNull y3.b.a captureButtonState, @NotNull y3.f overlay, @NotNull dp.e idClass, @NotNull IdConfig.e captureSide, @NotNull ir.a navigationState, @NotNull Function2<? super List<String>, ? super sn.v, Unit> manuallyCapture, @NotNull Function0<Unit> close, @NotNull Function0<Unit> back, boolean z10, @NotNull List<? extends sn.e> autoCaptureRules, @NotNull j0 state, int i10, @NotNull sn.a0.a cameraXControllerFactory, @NotNull un.c.a camera2ControllerFactory, @NotNull Function2<? super List<String>, ? super sn.v, Unit> autoCapture, @NotNull Function1<? super Throwable, Unit> onCaptureError, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull zn.a videoCaptureMethod, boolean z11, boolean z12, boolean z13, @NotNull Function2<? super File, ? super sn.v, Unit> onLocalVideoFinalized, @NotNull Function0<Unit> manualCaptureClicked, @NotNull Function0<Unit> checkPermissions, int i11, @Nullable String str, @Nullable zo.i iVar, @Nullable ks.a aVar, boolean z14, @NotNull kr.l transition) {
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
        String strA = renderProps.getStrings().getScanInstructions().a(null, null, captureSide);
        if (strA == null) {
            strA = BuildConfig.FLAVOR;
        }
        return new y3.b(title, description, message, strA, renderProps.getStrings().getCaptureDisclaimer(), captureButtonState, overlay, idClass, captureSide, navigationState, manuallyCapture, close, back, z10, autoCaptureRules, state, i10, renderProps.getStyles(), autoCapture, onCaptureError, onCameraError, i11, manualCaptureClicked, checkPermissions, videoCaptureMethod, z13, onLocalVideoFinalized, z11, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), z12, str, renderProps.getStrings().getCapturePageNavBarTitle(), iVar, aVar, renderProps.getAssetConfig().getCapturePage(), renderProps.getIsEnabled(), renderProps.getVideoCaptureConfig().getRecordAudio(), cameraXControllerFactory, camera2ControllerFactory, renderProps.getDesignVersion(), videoCaptureMethod != zn.a.None || renderProps.getDesignVersion() == i.K0000, z14, renderProps.getFlowWatermarkText(), transition);
    }

    public static final Unit h(List list, sn.v vVar) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(vVar, "<unused var>");
        return Unit.f21506a;
    }

    public static final Unit i(List list, sn.v vVar) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(vVar, "<unused var>");
        return Unit.f21506a;
    }

    public static final Unit j(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f21506a;
    }

    public static final Unit k(File file, sn.v vVar) {
        Intrinsics.checkNotNullParameter(file, "<unused var>");
        Intrinsics.checkNotNullParameter(vVar, "<unused var>");
        return Unit.f21506a;
    }

    public static final Unit l() {
        return Unit.f21506a;
    }
}
