package c0;

import a0.c0;
import androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk;
import g0.r1;
import java.util.ArrayList;
import n0.h3;
import n0.i3;
import n0.k3;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static k3 a(String str, c0 c0Var) {
        h3 h3VarA = i3.b().a();
        ArrayList arrayList = new ArrayList();
        if (h3VarA.a(AeFpsRangeLegacyQuirk.class, AeFpsRangeLegacyQuirk.h(c0Var))) {
            arrayList.add(new AeFpsRangeLegacyQuirk(c0Var));
        }
        if (h3VarA.a(AspectRatioLegacyApi21Quirk.class, AspectRatioLegacyApi21Quirk.h(c0Var))) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        if (h3VarA.a(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.g(c0Var))) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        if (h3VarA.a(JpegCaptureDownsizingQuirk.class, JpegCaptureDownsizingQuirk.g(c0Var))) {
            arrayList.add(new JpegCaptureDownsizingQuirk());
        }
        if (h3VarA.a(CamcorderProfileResolutionQuirk.class, CamcorderProfileResolutionQuirk.h(c0Var))) {
            arrayList.add(new CamcorderProfileResolutionQuirk(c0Var));
        }
        if (h3VarA.a(CaptureNoResponseQuirk.class, CaptureNoResponseQuirk.g(c0Var))) {
            arrayList.add(new CaptureNoResponseQuirk());
        }
        if (h3VarA.a(LegacyCameraOutputConfigNullPointerQuirk.class, LegacyCameraOutputConfigNullPointerQuirk.g(c0Var))) {
            arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
        }
        if (h3VarA.a(LegacyCameraSurfaceCleanupQuirk.class, LegacyCameraSurfaceCleanupQuirk.h(c0Var))) {
            arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
        }
        if (h3VarA.a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.g(c0Var))) {
            arrayList.add(new ImageCaptureWashedOutImageQuirk());
        }
        if (h3VarA.a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.g(c0Var))) {
            arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
        }
        if (h3VarA.a(YuvImageOnePixelShiftQuirk.class, YuvImageOnePixelShiftQuirk.m(c0Var))) {
            arrayList.add(new YuvImageOnePixelShiftQuirk());
        }
        if (h3VarA.a(FlashTooSlowQuirk.class, FlashTooSlowQuirk.h(c0Var))) {
            arrayList.add(new FlashTooSlowQuirk());
        }
        if (h3VarA.a(AfRegionFlipHorizontallyQuirk.class, AfRegionFlipHorizontallyQuirk.g(c0Var))) {
            arrayList.add(new AfRegionFlipHorizontallyQuirk());
        }
        if (h3VarA.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, ConfigureSurfaceToSecondarySessionFailQuirk.g(c0Var))) {
            arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        if (h3VarA.a(PreviewOrientationIncorrectQuirk.class, PreviewOrientationIncorrectQuirk.g(c0Var))) {
            arrayList.add(new PreviewOrientationIncorrectQuirk());
        }
        if (h3VarA.a(CaptureSessionStuckQuirk.class, CaptureSessionStuckQuirk.g(c0Var))) {
            arrayList.add(new CaptureSessionStuckQuirk());
        }
        if (h3VarA.a(ImageCaptureFlashNotFireQuirk.class, ImageCaptureFlashNotFireQuirk.g(c0Var))) {
            arrayList.add(new ImageCaptureFlashNotFireQuirk());
        }
        if (h3VarA.a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.g(c0Var))) {
            arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (h3VarA.a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.g(c0Var))) {
            arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
        }
        if (h3VarA.a(IncorrectCaptureStateQuirk.class, IncorrectCaptureStateQuirk.g(c0Var))) {
            arrayList.add(new IncorrectCaptureStateQuirk());
        }
        if (h3VarA.a(TorchFlashRequiredFor3aUpdateQuirk.class, TorchFlashRequiredFor3aUpdateQuirk.l(c0Var))) {
            arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(c0Var));
        }
        if (h3VarA.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, PreviewStretchWhenVideoCaptureIsBoundQuirk.m())) {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (h3VarA.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, PreviewDelayWhenVideoCaptureIsBoundQuirk.g())) {
            arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (h3VarA.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.n())) {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (h3VarA.a(TemporalNoiseQuirk.class, TemporalNoiseQuirk.h(c0Var))) {
            arrayList.add(new TemporalNoiseQuirk());
        }
        if (h3VarA.a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.i())) {
            arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
        }
        if (h3VarA.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class, CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.g(c0Var))) {
            arrayList.add(new CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk());
        }
        if (h3VarA.a(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.h())) {
            arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
        }
        k3 k3Var = new k3(arrayList);
        r1.a("CameraQuirks", "camera2 CameraQuirks = " + k3.d(k3Var));
        return k3Var;
    }
}
