package p589z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: z.a5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010\f\u001a\u00020\nH\u0017¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, m31665d2 = {"Lz/a5;", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "Landroid/hardware/camera2/CaptureRequest;", "forwardedRequest", "delegate", "<init>", "(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)V", "Landroid/hardware/camera2/CameraCaptureSession;", "session", "request", "", "timestamp", "frameNumber", "", "onCaptureStarted", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V", "onReadoutStarted", "Landroid/hardware/camera2/CaptureResult;", "partialResult", "onCaptureProgressed", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;)V", "Landroid/hardware/camera2/TotalCaptureResult;", "result", "onCaptureCompleted", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V", "Landroid/hardware/camera2/CaptureFailure;", "failure", "onCaptureFailed", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V", "", "sequenceId", "onCaptureSequenceCompleted", "(Landroid/hardware/camera2/CameraCaptureSession;IJ)V", "onCaptureSequenceAborted", "(Landroid/hardware/camera2/CameraCaptureSession;I)V", "Landroid/view/Surface;", "target", "onCaptureBufferLost", "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/view/Surface;J)V", "a", "Landroid/hardware/camera2/CaptureRequest;", "b", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "camera-camera2_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C13481a5 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CaptureRequest forwardedRequest;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CameraCaptureSession.CaptureCallback delegate;

    public C13481a5(@NotNull CaptureRequest forwardedRequest, @NotNull CameraCaptureSession.CaptureCallback delegate) {
        Intrinsics.checkNotNullParameter(forwardedRequest, "forwardedRequest");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.forwardedRequest = forwardedRequest;
        this.delegate = delegate;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(@NotNull CameraCaptureSession session, @NotNull CaptureRequest request, @NotNull Surface target, long frameNumber) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(target, "target");
        this.delegate.onCaptureBufferLost(session, this.forwardedRequest, target, frameNumber);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(@NotNull CameraCaptureSession session, @NotNull CaptureRequest request, @NotNull TotalCaptureResult result) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        this.delegate.onCaptureCompleted(session, this.forwardedRequest, result);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(@NotNull CameraCaptureSession session, @NotNull CaptureRequest request, @NotNull CaptureFailure failure) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(failure, "failure");
        this.delegate.onCaptureFailed(session, this.forwardedRequest, failure);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(@NotNull CameraCaptureSession session, @NotNull CaptureRequest request, @NotNull CaptureResult partialResult) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(partialResult, "partialResult");
        this.delegate.onCaptureProgressed(session, this.forwardedRequest, partialResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(@NotNull CameraCaptureSession session, int sequenceId) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.delegate.onCaptureSequenceAborted(session, sequenceId);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(@NotNull CameraCaptureSession session, int sequenceId, long frameNumber) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.delegate.onCaptureSequenceCompleted(session, sequenceId, frameNumber);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(@NotNull CameraCaptureSession session, @NotNull CaptureRequest request, long timestamp, long frameNumber) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(request, "request");
        this.delegate.onCaptureStarted(session, this.forwardedRequest, timestamp, frameNumber);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(@NotNull CameraCaptureSession session, @NotNull CaptureRequest request, long timestamp, long frameNumber) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(request, "request");
        this.delegate.onReadoutStarted(session, this.forwardedRequest, timestamp, frameNumber);
    }
}
