package c0;

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
import n0.g3;
import n0.h3;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public static List<g3> a(h3 h3Var) {
        ArrayList arrayList = new ArrayList();
        if (h3Var.a(ImageCapturePixelHDRPlusQuirk.class, ImageCapturePixelHDRPlusQuirk.g())) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        if (h3Var.a(ExtraCroppingQuirk.class, ExtraCroppingQuirk.i())) {
            arrayList.add(new ExtraCroppingQuirk());
        }
        if (h3Var.a(Nexus4AndroidLTargetAspectRatioQuirk.class, Nexus4AndroidLTargetAspectRatioQuirk.h())) {
            arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (h3Var.a(ExcludedSupportedSizesQuirk.class, ExcludedSupportedSizesQuirk.x())) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        if (h3Var.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.g())) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        if (h3Var.a(PreviewPixelHDRnetQuirk.class, PreviewPixelHDRnetQuirk.g())) {
            arrayList.add(new PreviewPixelHDRnetQuirk());
        }
        if (h3Var.a(StillCaptureFlashStopRepeatingQuirk.class, StillCaptureFlashStopRepeatingQuirk.g())) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        if (h3Var.a(ExtraSupportedSurfaceCombinationsQuirk.class, ExtraSupportedSurfaceCombinationsQuirk.l())) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        if (h3Var.a(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.h())) {
            arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
        }
        if (h3Var.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, RepeatingStreamConstraintForVideoRecordingQuirk.h())) {
            arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (h3Var.a(TextureViewIsClosedQuirk.class, TextureViewIsClosedQuirk.g())) {
            arrayList.add(new TextureViewIsClosedQuirk());
        }
        if (h3Var.a(CaptureSessionOnClosedNotCalledQuirk.class, CaptureSessionOnClosedNotCalledQuirk.g())) {
            arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
        }
        if (h3Var.a(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.g())) {
            arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
        }
        if (h3Var.a(ZslDisablerQuirk.class, ZslDisablerQuirk.j())) {
            arrayList.add(new ZslDisablerQuirk());
        }
        if (h3Var.a(ExtraSupportedOutputSizeQuirk.class, ExtraSupportedOutputSizeQuirk.j())) {
            arrayList.add(new ExtraSupportedOutputSizeQuirk());
        }
        if (h3Var.a(InvalidVideoProfilesQuirk.class, InvalidVideoProfilesQuirk.t())) {
            arrayList.add(new InvalidVideoProfilesQuirk());
        }
        if (h3Var.a(Preview3AThreadCrashQuirk.class, Preview3AThreadCrashQuirk.g())) {
            arrayList.add(new Preview3AThreadCrashQuirk());
        }
        if (h3Var.a(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.h())) {
            arrayList.add(new SmallDisplaySizeQuirk());
        }
        if (h3Var.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.g())) {
            arrayList.add(PreviewUnderExposureQuirk.f1344a);
        }
        if (h3Var.a(CaptureSessionShouldUseMrirQuirk.class, CaptureSessionShouldUseMrirQuirk.g())) {
            arrayList.add(new CaptureSessionShouldUseMrirQuirk());
        }
        return arrayList;
    }
}
