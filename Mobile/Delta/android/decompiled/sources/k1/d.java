package k1;

import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;
import androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewBlackScreenQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import java.util.ArrayList;
import java.util.List;
import n0.g3;
import n0.h3;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static List<g3> a(h3 h3Var) {
        ArrayList arrayList = new ArrayList();
        if (h3Var.a(MediaFormatMustNotUseFrameRateToFindEncoderQuirk.class, MediaFormatMustNotUseFrameRateToFindEncoderQuirk.g())) {
            arrayList.add(new MediaFormatMustNotUseFrameRateToFindEncoderQuirk());
        }
        if (h3Var.a(MediaCodecInfoReportIncorrectInfoQuirk.class, MediaCodecInfoReportIncorrectInfoQuirk.p())) {
            arrayList.add(new MediaCodecInfoReportIncorrectInfoQuirk());
        }
        if (h3Var.a(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class, DeactivateEncoderSurfaceBeforeStopEncoderQuirk.g())) {
            arrayList.add(new DeactivateEncoderSurfaceBeforeStopEncoderQuirk());
        }
        if (h3Var.a(CameraUseInconsistentTimebaseQuirk.class, CameraUseInconsistentTimebaseQuirk.i())) {
            arrayList.add(new CameraUseInconsistentTimebaseQuirk());
        }
        if (h3Var.a(ReportedVideoQualityNotSupportedQuirk.class, ReportedVideoQualityNotSupportedQuirk.l())) {
            arrayList.add(new ReportedVideoQualityNotSupportedQuirk());
        }
        if (h3Var.a(EncoderNotUsePersistentInputSurfaceQuirk.class, EncoderNotUsePersistentInputSurfaceQuirk.g())) {
            arrayList.add(new EncoderNotUsePersistentInputSurfaceQuirk());
        }
        if (h3Var.a(VideoEncoderCrashQuirk.class, VideoEncoderCrashQuirk.h())) {
            arrayList.add(new VideoEncoderCrashQuirk());
        }
        if (h3Var.a(ExcludeStretchedVideoQualityQuirk.class, ExcludeStretchedVideoQualityQuirk.n())) {
            arrayList.add(new ExcludeStretchedVideoQualityQuirk());
        }
        if (h3Var.a(MediaStoreVideoCannotWrite.class, MediaStoreVideoCannotWrite.i())) {
            arrayList.add(new MediaStoreVideoCannotWrite());
        }
        if (h3Var.a(AudioEncoderIgnoresInputTimestampQuirk.class, AudioEncoderIgnoresInputTimestampQuirk.h())) {
            arrayList.add(new AudioEncoderIgnoresInputTimestampQuirk());
        }
        if (h3Var.a(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class, VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.g())) {
            arrayList.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
        }
        if (h3Var.a(NegativeLatLongSavesIncorrectlyQuirk.class, NegativeLatLongSavesIncorrectlyQuirk.g())) {
            arrayList.add(new NegativeLatLongSavesIncorrectlyQuirk());
        }
        if (h3Var.a(AudioTimestampFramePositionIncorrectQuirk.class, AudioTimestampFramePositionIncorrectQuirk.n())) {
            arrayList.add(new AudioTimestampFramePositionIncorrectQuirk());
        }
        if (h3Var.a(ExtraSupportedResolutionQuirk.class, ExtraSupportedResolutionQuirk.h())) {
            arrayList.add(new ExtraSupportedResolutionQuirk());
        }
        if (h3Var.a(StretchedVideoResolutionQuirk.class, StretchedVideoResolutionQuirk.i())) {
            arrayList.add(new StretchedVideoResolutionQuirk());
        }
        if (h3Var.a(CodecStuckOnFlushQuirk.class, CodecStuckOnFlushQuirk.i())) {
            arrayList.add(new CodecStuckOnFlushQuirk());
        }
        if (h3Var.a(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class, StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.h())) {
            arrayList.add(new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk());
        }
        if (h3Var.a(ExtraSupportedQualityQuirk.class, ExtraSupportedQualityQuirk.k())) {
            arrayList.add(new ExtraSupportedQualityQuirk());
        }
        if (h3Var.a(SignalEosOutputBufferNotComeQuirk.class, SignalEosOutputBufferNotComeQuirk.h())) {
            arrayList.add(new SignalEosOutputBufferNotComeQuirk());
        }
        if (h3Var.a(SizeCannotEncodeVideoQuirk.class, SizeCannotEncodeVideoQuirk.k())) {
            arrayList.add(new SizeCannotEncodeVideoQuirk());
        }
        if (h3Var.a(PreviewBlackScreenQuirk.class, PreviewBlackScreenQuirk.i())) {
            arrayList.add(new PreviewBlackScreenQuirk());
        }
        if (h3Var.a(PrematureEndOfStreamVideoQuirk.class, PrematureEndOfStreamVideoQuirk.g())) {
            arrayList.add(PrematureEndOfStreamVideoQuirk.f1402a);
        }
        if (h3Var.a(MediaCodecDefaultDataSpaceQuirk.class, MediaCodecDefaultDataSpaceQuirk.h())) {
            arrayList.add(new MediaCodecDefaultDataSpaceQuirk());
        }
        if (h3Var.a(HdrRepeatingRequestFailureQuirk.class, HdrRepeatingRequestFailureQuirk.h())) {
            arrayList.add(new HdrRepeatingRequestFailureQuirk());
        }
        if (h3Var.a(PreviewFreezeAfterHighSpeedRecordingQuirk.class, PreviewFreezeAfterHighSpeedRecordingQuirk.g())) {
            arrayList.add(PreviewFreezeAfterHighSpeedRecordingQuirk.f1405a);
        }
        return arrayList;
    }
}
