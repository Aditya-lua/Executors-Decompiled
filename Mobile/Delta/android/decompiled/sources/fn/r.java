package fn;

import com.withpersona.sdk2.camera.CameraProperties;
import g0.f1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018R$\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lfn/r;", "", "Lg0/l;", "camera", "Lg0/f1;", "imageCapture", "Lf1/r0;", "recorder", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "<init>", "(Lg0/l;Lg0/f1;Lf1/r0;Lcom/withpersona/sdk2/camera/CameraProperties;)V", "a", "Lg0/l;", "()Lg0/l;", "b", "Lg0/f1;", "d", "()Lg0/f1;", "c", "Lf1/r0;", "e", "()Lf1/r0;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "Lcom/withpersona/sdk2/camera/h;", "Lcom/withpersona/sdk2/camera/h;", "()Lcom/withpersona/sdk2/camera/h;", "f", "(Lcom/withpersona/sdk2/camera/h;)V", "currentRecordingHelper", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g0.l camera;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final f1 imageCapture;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final f1.r0 recorder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CameraProperties cameraProperties;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public com.withpersona.sdk2.camera.h currentRecordingHelper;

    public r(@NotNull g0.l camera, @Nullable f1 f1Var, @Nullable f1.r0 r0Var, @NotNull CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        this.camera = camera;
        this.imageCapture = f1Var;
        this.recorder = r0Var;
        this.cameraProperties = cameraProperties;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final g0.l getCamera() {
        return this.camera;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final CameraProperties getCameraProperties() {
        return this.cameraProperties;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.withpersona.sdk2.camera.h getCurrentRecordingHelper() {
        return this.currentRecordingHelper;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final f1 getImageCapture() {
        return this.imageCapture;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final f1.r0 getRecorder() {
        return this.recorder;
    }

    public final void f(@Nullable com.withpersona.sdk2.camera.h hVar) {
        this.currentRecordingHelper = hVar;
    }
}
