package p036c0;

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
import java.util.ArrayList;
import p001a0.C0008c0;
import p140g0.C5931r1;
import p296n0.C8764h3;
import p296n0.C8770i3;
import p296n0.C8782k3;

/* JADX INFO: renamed from: c0.a */
/* JADX INFO: loaded from: classes.dex */
public class C1496a {
    /* JADX INFO: renamed from: a */
    public static C8782k3 m7646a(String str, C0008c0 c0008c0) {
        C8764h3 c8764h3M35196a = C8770i3.m35195b().m35196a();
        ArrayList arrayList = new ArrayList();
        if (c8764h3M35196a.m35147a(AeFpsRangeLegacyQuirk.class, AeFpsRangeLegacyQuirk.m2036h(c0008c0))) {
            arrayList.add(new AeFpsRangeLegacyQuirk(c0008c0));
        }
        if (c8764h3M35196a.m35147a(AspectRatioLegacyApi21Quirk.class, AspectRatioLegacyApi21Quirk.m2041h(c0008c0))) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        if (c8764h3M35196a.m35147a(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.m2125g(c0008c0))) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        if (c8764h3M35196a.m35147a(JpegCaptureDownsizingQuirk.class, JpegCaptureDownsizingQuirk.m2124g(c0008c0))) {
            arrayList.add(new JpegCaptureDownsizingQuirk());
        }
        if (c8764h3M35196a.m35147a(CamcorderProfileResolutionQuirk.class, CamcorderProfileResolutionQuirk.m2043h(c0008c0))) {
            arrayList.add(new CamcorderProfileResolutionQuirk(c0008c0));
        }
        if (c8764h3M35196a.m35147a(CaptureNoResponseQuirk.class, CaptureNoResponseQuirk.m2047g(c0008c0))) {
            arrayList.add(new CaptureNoResponseQuirk());
        }
        if (c8764h3M35196a.m35147a(LegacyCameraOutputConfigNullPointerQuirk.class, LegacyCameraOutputConfigNullPointerQuirk.m2126g(c0008c0))) {
            arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
        }
        if (c8764h3M35196a.m35147a(LegacyCameraSurfaceCleanupQuirk.class, LegacyCameraSurfaceCleanupQuirk.m2128h(c0008c0))) {
            arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
        }
        if (c8764h3M35196a.m35147a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.m2107g(c0008c0))) {
            arrayList.add(new ImageCaptureWashedOutImageQuirk());
        }
        if (c8764h3M35196a.m35147a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.m2045g(c0008c0))) {
            arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
        }
        if (c8764h3M35196a.m35147a(YuvImageOnePixelShiftQuirk.class, YuvImageOnePixelShiftQuirk.m2164m(c0008c0))) {
            arrayList.add(new YuvImageOnePixelShiftQuirk());
        }
        if (c8764h3M35196a.m35147a(FlashTooSlowQuirk.class, FlashTooSlowQuirk.m2091h(c0008c0))) {
            arrayList.add(new FlashTooSlowQuirk());
        }
        if (c8764h3M35196a.m35147a(AfRegionFlipHorizontallyQuirk.class, AfRegionFlipHorizontallyQuirk.m2040g(c0008c0))) {
            arrayList.add(new AfRegionFlipHorizontallyQuirk());
        }
        if (c8764h3M35196a.m35147a(ConfigureSurfaceToSecondarySessionFailQuirk.class, ConfigureSurfaceToSecondarySessionFailQuirk.m2053g(c0008c0))) {
            arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        if (c8764h3M35196a.m35147a(PreviewOrientationIncorrectQuirk.class, PreviewOrientationIncorrectQuirk.m2133g(c0008c0))) {
            arrayList.add(new PreviewOrientationIncorrectQuirk());
        }
        if (c8764h3M35196a.m35147a(CaptureSessionStuckQuirk.class, CaptureSessionStuckQuirk.m2050g(c0008c0))) {
            arrayList.add(new CaptureSessionStuckQuirk());
        }
        if (c8764h3M35196a.m35147a(ImageCaptureFlashNotFireQuirk.class, ImageCaptureFlashNotFireQuirk.m2105g(c0008c0))) {
            arrayList.add(new ImageCaptureFlashNotFireQuirk());
        }
        if (c8764h3M35196a.m35147a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.m2108g(c0008c0))) {
            arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (c8764h3M35196a.m35147a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.m2092g(c0008c0))) {
            arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
        }
        if (c8764h3M35196a.m35147a(IncorrectCaptureStateQuirk.class, IncorrectCaptureStateQuirk.m2109g(c0008c0))) {
            arrayList.add(new IncorrectCaptureStateQuirk());
        }
        if (c8764h3M35196a.m35147a(TorchFlashRequiredFor3aUpdateQuirk.class, TorchFlashRequiredFor3aUpdateQuirk.m2155l(c0008c0))) {
            arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(c0008c0));
        }
        if (c8764h3M35196a.m35147a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, PreviewStretchWhenVideoCaptureIsBoundQuirk.m2141m())) {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (c8764h3M35196a.m35147a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, PreviewDelayWhenVideoCaptureIsBoundQuirk.m2132g())) {
            arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (c8764h3M35196a.m35147a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.m2103n())) {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (c8764h3M35196a.m35147a(TemporalNoiseQuirk.class, TemporalNoiseQuirk.m2149h(c0008c0))) {
            arrayList.add(new TemporalNoiseQuirk());
        }
        if (c8764h3M35196a.m35147a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.m2095i())) {
            arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
        }
        if (c8764h3M35196a.m35147a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class, CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.m2051g(c0008c0))) {
            arrayList.add(new CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk());
        }
        if (c8764h3M35196a.m35147a(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.m2034h())) {
            arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
        }
        C8782k3 c8782k3 = new C8782k3(arrayList);
        C5931r1.m26561a("CameraQuirks", "camera2 CameraQuirks = " + C8782k3.m35232d(c8782k3));
        return c8782k3;
    }
}
