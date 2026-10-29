package p036c0;

import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import java.util.ArrayList;
import java.util.List;
import p296n0.C8764h3;
import p296n0.InterfaceC8758g3;

/* JADX INFO: renamed from: c0.f */
/* JADX INFO: loaded from: classes.dex */
public class C1501f {
    /* JADX INFO: renamed from: a */
    public static List<InterfaceC8758g3> m7655a(C8764h3 c8764h3) {
        ArrayList arrayList = new ArrayList();
        if (c8764h3.m35147a(ImageCapturePixelHDRPlusQuirk.class, ImageCapturePixelHDRPlusQuirk.m2106g())) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        if (c8764h3.m35147a(ExtraCroppingQuirk.class, ExtraCroppingQuirk.m2074i())) {
            arrayList.add(new ExtraCroppingQuirk());
        }
        if (c8764h3.m35147a(Nexus4AndroidLTargetAspectRatioQuirk.class, Nexus4AndroidLTargetAspectRatioQuirk.m2129h())) {
            arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (c8764h3.m35147a(ExcludedSupportedSizesQuirk.class, ExcludedSupportedSizesQuirk.m2063x())) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        if (c8764h3.m35147a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.m2054g())) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        if (c8764h3.m35147a(PreviewPixelHDRnetQuirk.class, PreviewPixelHDRnetQuirk.m2134g())) {
            arrayList.add(new PreviewPixelHDRnetQuirk());
        }
        if (c8764h3.m35147a(StillCaptureFlashStopRepeatingQuirk.class, StillCaptureFlashStopRepeatingQuirk.m2147g())) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        if (c8764h3.m35147a(ExtraSupportedSurfaceCombinationsQuirk.class, ExtraSupportedSurfaceCombinationsQuirk.m2083l())) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        if (c8764h3.m35147a(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.m2089h())) {
            arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
        }
        if (c8764h3.m35147a(RepeatingStreamConstraintForVideoRecordingQuirk.class, RepeatingStreamConstraintForVideoRecordingQuirk.m2144h())) {
            arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (c8764h3.m35147a(TextureViewIsClosedQuirk.class, TextureViewIsClosedQuirk.m2150g())) {
            arrayList.add(new TextureViewIsClosedQuirk());
        }
        if (c8764h3.m35147a(CaptureSessionOnClosedNotCalledQuirk.class, CaptureSessionOnClosedNotCalledQuirk.m2048g())) {
            arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
        }
        if (c8764h3.m35147a(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.m2157g())) {
            arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
        }
        if (c8764h3.m35147a(ZslDisablerQuirk.class, ZslDisablerQuirk.m2168j())) {
            arrayList.add(new ZslDisablerQuirk());
        }
        if (c8764h3.m35147a(ExtraSupportedOutputSizeQuirk.class, ExtraSupportedOutputSizeQuirk.m2077j())) {
            arrayList.add(new ExtraSupportedOutputSizeQuirk());
        }
        if (c8764h3.m35147a(InvalidVideoProfilesQuirk.class, InvalidVideoProfilesQuirk.m2123t())) {
            arrayList.add(new InvalidVideoProfilesQuirk());
        }
        if (c8764h3.m35147a(Preview3AThreadCrashQuirk.class, Preview3AThreadCrashQuirk.m2131g())) {
            arrayList.add(new Preview3AThreadCrashQuirk());
        }
        if (c8764h3.m35147a(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.m2145h())) {
            arrayList.add(new SmallDisplaySizeQuirk());
        }
        if (c8764h3.m35147a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.m2142g())) {
            arrayList.add(PreviewUnderExposureQuirk.f1755a);
        }
        if (c8764h3.m35147a(CaptureSessionShouldUseMrirQuirk.class, CaptureSessionShouldUseMrirQuirk.m2049g())) {
            arrayList.add(new CaptureSessionShouldUseMrirQuirk());
        }
        return arrayList;
    }
}
