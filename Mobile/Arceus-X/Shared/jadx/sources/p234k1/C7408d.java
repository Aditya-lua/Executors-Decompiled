package p234k1;

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
import p296n0.C8764h3;
import p296n0.InterfaceC8758g3;

/* JADX INFO: renamed from: k1.d */
/* JADX INFO: loaded from: classes.dex */
public class C7408d {
    /* JADX INFO: renamed from: a */
    public static List<InterfaceC8758g3> m30693a(C8764h3 c8764h3) {
        ArrayList arrayList = new ArrayList();
        if (c8764h3.m35147a(MediaFormatMustNotUseFrameRateToFindEncoderQuirk.class, MediaFormatMustNotUseFrameRateToFindEncoderQuirk.m2311g())) {
            arrayList.add(new MediaFormatMustNotUseFrameRateToFindEncoderQuirk());
        }
        if (c8764h3.m35147a(MediaCodecInfoReportIncorrectInfoQuirk.class, MediaCodecInfoReportIncorrectInfoQuirk.m2310p())) {
            arrayList.add(new MediaCodecInfoReportIncorrectInfoQuirk());
        }
        if (c8764h3.m35147a(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class, DeactivateEncoderSurfaceBeforeStopEncoderQuirk.m2278g())) {
            arrayList.add(new DeactivateEncoderSurfaceBeforeStopEncoderQuirk());
        }
        if (c8764h3.m35147a(CameraUseInconsistentTimebaseQuirk.class, CameraUseInconsistentTimebaseQuirk.m2273i())) {
            arrayList.add(new CameraUseInconsistentTimebaseQuirk());
        }
        if (c8764h3.m35147a(ReportedVideoQualityNotSupportedQuirk.class, ReportedVideoQualityNotSupportedQuirk.m2327l())) {
            arrayList.add(new ReportedVideoQualityNotSupportedQuirk());
        }
        if (c8764h3.m35147a(EncoderNotUsePersistentInputSurfaceQuirk.class, EncoderNotUsePersistentInputSurfaceQuirk.m2279g())) {
            arrayList.add(new EncoderNotUsePersistentInputSurfaceQuirk());
        }
        if (c8764h3.m35147a(VideoEncoderCrashQuirk.class, VideoEncoderCrashQuirk.m2341h())) {
            arrayList.add(new VideoEncoderCrashQuirk());
        }
        if (c8764h3.m35147a(ExcludeStretchedVideoQualityQuirk.class, ExcludeStretchedVideoQualityQuirk.m2287n())) {
            arrayList.add(new ExcludeStretchedVideoQualityQuirk());
        }
        if (c8764h3.m35147a(MediaStoreVideoCannotWrite.class, MediaStoreVideoCannotWrite.m2314i())) {
            arrayList.add(new MediaStoreVideoCannotWrite());
        }
        if (c8764h3.m35147a(AudioEncoderIgnoresInputTimestampQuirk.class, AudioEncoderIgnoresInputTimestampQuirk.m2262h())) {
            arrayList.add(new AudioEncoderIgnoresInputTimestampQuirk());
        }
        if (c8764h3.m35147a(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class, VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.m2342g())) {
            arrayList.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
        }
        if (c8764h3.m35147a(NegativeLatLongSavesIncorrectlyQuirk.class, NegativeLatLongSavesIncorrectlyQuirk.m2315g())) {
            arrayList.add(new NegativeLatLongSavesIncorrectlyQuirk());
        }
        if (c8764h3.m35147a(AudioTimestampFramePositionIncorrectQuirk.class, AudioTimestampFramePositionIncorrectQuirk.m2270n())) {
            arrayList.add(new AudioTimestampFramePositionIncorrectQuirk());
        }
        if (c8764h3.m35147a(ExtraSupportedResolutionQuirk.class, ExtraSupportedResolutionQuirk.m2295h())) {
            arrayList.add(new ExtraSupportedResolutionQuirk());
        }
        if (c8764h3.m35147a(StretchedVideoResolutionQuirk.class, StretchedVideoResolutionQuirk.m2338i())) {
            arrayList.add(new StretchedVideoResolutionQuirk());
        }
        if (c8764h3.m35147a(CodecStuckOnFlushQuirk.class, CodecStuckOnFlushQuirk.m2276i())) {
            arrayList.add(new CodecStuckOnFlushQuirk());
        }
        if (c8764h3.m35147a(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class, StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.m2336h())) {
            arrayList.add(new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk());
        }
        if (c8764h3.m35147a(ExtraSupportedQualityQuirk.class, ExtraSupportedQualityQuirk.m2291k())) {
            arrayList.add(new ExtraSupportedQualityQuirk());
        }
        if (c8764h3.m35147a(SignalEosOutputBufferNotComeQuirk.class, SignalEosOutputBufferNotComeQuirk.m2329h())) {
            arrayList.add(new SignalEosOutputBufferNotComeQuirk());
        }
        if (c8764h3.m35147a(SizeCannotEncodeVideoQuirk.class, SizeCannotEncodeVideoQuirk.m2332k())) {
            arrayList.add(new SizeCannotEncodeVideoQuirk());
        }
        if (c8764h3.m35147a(PreviewBlackScreenQuirk.class, PreviewBlackScreenQuirk.m2319i())) {
            arrayList.add(new PreviewBlackScreenQuirk());
        }
        if (c8764h3.m35147a(PrematureEndOfStreamVideoQuirk.class, PrematureEndOfStreamVideoQuirk.m2316g())) {
            arrayList.add(PrematureEndOfStreamVideoQuirk.f1827a);
        }
        if (c8764h3.m35147a(MediaCodecDefaultDataSpaceQuirk.class, MediaCodecDefaultDataSpaceQuirk.m2299h())) {
            arrayList.add(new MediaCodecDefaultDataSpaceQuirk());
        }
        if (c8764h3.m35147a(HdrRepeatingRequestFailureQuirk.class, HdrRepeatingRequestFailureQuirk.m2297h())) {
            arrayList.add(new HdrRepeatingRequestFailureQuirk());
        }
        if (c8764h3.m35147a(PreviewFreezeAfterHighSpeedRecordingQuirk.class, PreviewFreezeAfterHighSpeedRecordingQuirk.m2321g())) {
            arrayList.add(PreviewFreezeAfterHighSpeedRecordingQuirk.f1832a);
        }
        return arrayList;
    }
}
