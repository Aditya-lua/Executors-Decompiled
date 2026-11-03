package fn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.Image;
import android.media.ImageReader;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.SurfaceHolder;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent$MiscInquiryEvent$VideoCaptureFallback;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import iu.a2;
import iu.g1;
import iu.n2;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ¼\u00012\u00020\u0001:\u0003IMQBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0!H\u0086@¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020$0!H\u0086@¢\u0006\u0004\b%\u0010#J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020$0!H\u0086@¢\u0006\u0004\b&\u0010#J\r\u0010'\u001a\u00020\u001e¢\u0006\u0004\b'\u0010 J\u0015\u0010)\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000e¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u000e¢\u0006\u0004\b,\u0010*J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u001eH\u0083@¢\u0006\u0004\b.\u0010#J\u000f\u0010/\u001a\u00020\u001eH\u0002¢\u0006\u0004\b/\u0010 J\u001c\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u00100\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b4\u0010#J,\u0010<\u001a\u00020;2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\n\b\u0002\u0010:\u001a\u0004\u0018\u000109H\u0083@¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u0004\u0018\u00010$*\u00020AH\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010,R\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010,R\u0017\u0010i\u001a\u00020d8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010r\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010|\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010,R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010,R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u0090\u0001\u001a\u0002098\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0093\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0095\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010,R\u0018\u0010\u0097\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010,R\u0018\u0010\u0099\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010,R\u0018\u0010\u009b\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010,R&\u0010\u009f\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010!0\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001f\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u009e\u0001R#\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010£\u00018\u0006¢\u0006\u000f\n\u0005\by\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010©\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010,R\u001c\u0010\u00ad\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001a\u0010°\u0001\u001a\u00030®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010\u009a\u0001R\u0019\u0010³\u0001\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R \u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020A0´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001a\u0010»\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001¨\u0006½\u0001"}, d2 = {"Lfn/s;", "", "Landroid/content/Context;", "context", "Lfn/h0;", "cameraChoice", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lfn/g;", "analyzer", "Lkn/a;", "videoCaptureMethod", "Lsr/a;", "webRtcManager", "", "isAudioRequired", "Ljn/a;", "cameraStatsManager", "Loq/c;", "sdkFilesManager", "Ljq/a;", "coroutineScopeFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lnq/c;", "externalEventLogger", "isImageReaderRecorderEnabled", "forceImageReaderRecorder", "<init>", "(Landroid/content/Context;Lfn/h0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lfn/g;Lkn/a;Lsr/a;ZLjn/a;Loq/c;Ljq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lnq/c;ZZ)V", "", "r0", "()V", "Lgt/n;", "x0", "(Llt/b;)Ljava/lang/Object;", "Ljava/io/File;", "z0", "o0", "Y", "analyzerEnabled", "q0", "(Z)V", "enable", "Z", "a0", "g0", "j0", "retryOnError", "Lfn/g0;", "V", "(ZLlt/b;)Ljava/lang/Object;", "X", "Landroid/hardware/camera2/CameraManager;", "manager", "", "cameraId", "Landroid/os/Handler;", "handler", "Landroid/hardware/camera2/CameraDevice;", "l0", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Llt/b;)Ljava/lang/Object;", "Landroid/media/ImageReader;", "h0", "()Landroid/media/ImageReader;", "Landroid/media/Image;", "image", "n0", "(Landroid/media/Image;)V", "p0", "(Landroid/media/Image;)Ljava/io/File;", "a", "Landroid/content/Context;", "b", "Lfn/h0;", "b0", "()Lfn/h0;", "c", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "d0", "()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "d", "Lfn/g;", "e", "Lkn/a;", "f", "Lsr/a;", "g", "h", "Ljn/a;", "i", "Loq/c;", "j", "Ljq/a;", "k", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "l", "Lnq/c;", "m", "n", "Lcom/withpersona/sdk2/camera/CameraProperties;", "o", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c0", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Liu/p0;", "p", "Liu/p0;", "coroutineScope", "q", "Ljava/lang/String;", "r", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroid/hardware/camera2/CameraCharacteristics;", "s", "Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", "", "t", "I", "orientation", "u", "recordAudio", "Lfn/r0;", "v", "Lfn/r0;", "mediaRecorderWrapper", "Lgn/f;", "w", "Lgn/f;", "imageReaderVideoRecorder", "x", "useImageReaderRecorder", "y", "Landroid/hardware/camera2/CameraDevice;", "camera", "Landroid/os/HandlerThread;", "z", "Landroid/os/HandlerThread;", "cameraThread", "A", "Landroid/os/Handler;", "cameraHandler", "B", "Lfn/g0;", "session", "C", "recordingStarted", "D", "isAnalyzerEnabled", "E", "isImageCaptureRequested", "F", "isPreviewSurfaceAvailable", "Llu/c0;", "G", "Llu/c0;", "imageCaptureResult", "Lfn/s$d;", "H", "_state", "Llu/p0;", "Llu/p0;", "e0", "()Llu/p0;", "state", "J", "isPreviewStarted", "Landroid/view/SurfaceHolder$Callback;", "K", "Landroid/view/SurfaceHolder$Callback;", "surfaceHolderCallback", "", "L", "analysisSizeScaling", "M", "Landroid/media/ImageReader;", "imageReader", "Lku/g;", "N", "Lku/g;", "imageProcessingChannel", "Landroid/os/ConditionVariable;", "O", "Landroid/os/ConditionVariable;", "processImageHaltedCv", "P", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Handler cameraHandler;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public g0 session;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public volatile boolean recordingStarted;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public volatile boolean isAnalyzerEnabled;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public volatile boolean isImageCaptureRequested;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public volatile boolean isPreviewSurfaceAvailable;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final lu.c0<gt.n<File>> imageCaptureResult;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final lu.c0<d> _state;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public final lu.p0<d> state;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean isPreviewStarted;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    public SurfaceHolder.Callback surfaceHolderCallback;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public float analysisSizeScaling;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public ImageReader imageReader;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public ku.g<Image> imageProcessingChannel;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    public ConditionVariable processImageHaltedCv;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h0 cameraChoice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Camera2PreviewView previewView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fn.g analyzer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kn.a videoCaptureMethod;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final sr.a webRtcManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isAudioRequired;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jn.a cameraStatsManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final oq.c sdkFilesManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jq.a coroutineScopeFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nq.c externalEventLogger;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final boolean isImageReaderRecorderEnabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final boolean forceImageReaderRecorder;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CameraProperties cameraProperties;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iu.p0 coroutineScope;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cameraId;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CameraManager cameraManager;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CameraCharacteristics characteristics;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final int orientation;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final boolean recordAudio;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r0 mediaRecorderWrapper;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gn.f imageReaderVideoRecorder;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public boolean useImageReaderRecorder;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CameraDevice camera;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HandlerThread cameraThread;

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$1", f = "Camera2Manager.kt", l = {183}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17478t;

        /* JADX INFO: renamed from: fn.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0311a<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s f17480a;

            public C0311a(s sVar) {
                this.f17480a = sVar;
            }

            @Override // lu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Image image, lt.b<? super Unit> bVar) throws Exception {
                this.f17480a.n0(image);
                return Unit.f22938a;
            }
        }

        public a(lt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return s.this.new a(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f17478t;
            if (i10 == 0) {
                gt.o.b(obj);
                lu.h hVarH = lu.j.H(s.this.imageProcessingChannel);
                C0311a c0311a = new C0311a(s.this);
                this.f17478t = 1;
                if (hVarH.collect(c0311a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\n\u000bB\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lfn/s$c;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "", "message", "", "cause", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "b", "a", "Lfn/s$c$a;", "Lfn/s$c$b;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c extends Exception {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfn/s$c$a;", "Lfn/s$c;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull String message, @NotNull Throwable cause) {
                super(message, cause, null);
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(cause, "cause");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfn/s$c$b;", "Lfn/s$c;", "<init>", "()V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends c {
            public b() {
                super(null);
            }
        }

        public /* synthetic */ c(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th2);
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }

        public c(String str, Throwable th2) {
            super(str, th2);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lfn/s$d;", "", "a", "d", "b", "c", "Lfn/s$d$a;", "Lfn/s$d$b;", "Lfn/s$d$c;", "Lfn/s$d$d;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfn/s$d$a;", "Lfn/s$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f17481a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1835001754;
            }

            @NotNull
            public String toString() {
                return "Created";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfn/s$d$b;", "Lfn/s$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f17482a = new b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1111701481;
            }

            @NotNull
            public String toString() {
                return "Destroyed";
            }
        }

        /* JADX INFO: renamed from: fn.s$d$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfn/s$d$c;", "Lfn/s$d;", "Lfn/s$c;", "error", "<init>", "(Lfn/s$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfn/s$c;", "()Lfn/s$c;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final c error;

            public Error(@NotNull c error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final c getError() {
                return this.error;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.c(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(error=" + this.error + ")";
            }
        }

        /* JADX INFO: renamed from: fn.s$d$d, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lfn/s$d$d;", "Lfn/s$d;", "", "firstFrameReceived", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Started implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            public final boolean firstFrameReceived;

            public Started(boolean z10) {
                this.firstFrameReceived = z10;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getFirstFrameReceived() {
                return this.firstFrameReceived;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Started) && this.firstFrameReceived == ((Started) other).firstFrameReceived;
            }

            public int hashCode() {
                return Boolean.hashCode(this.firstFrameReceived);
            }

            @NotNull
            public String toString() {
                return "Started(firstFrameReceived=" + this.firstFrameReceived + ")";
            }
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$createCameraCaptureSession$2", f = "Camera2Manager.kt", l = {317, 335, 372}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "Lfn/g0;", "<anonymous>", "(Liu/p0;)Lfn/g0;"}, k = 3, mv = {2, 2, 0})
    public static final class e extends nt.m implements Function2<iu.p0, lt.b<? super g0>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f17485t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f17486u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f17487v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f17488w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ boolean f17490y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, lt.b<? super e> bVar) {
            super(2, bVar);
            this.f17490y = z10;
        }

        public static final Unit q(s sVar) {
            Object value = sVar._state.getValue();
            d.Started started = value instanceof d.Started ? (d.Started) value : null;
            if (started != null && !started.getFirstFrameReceived()) {
                sVar._state.setValue(new d.Started(true));
            }
            return Unit.f22938a;
        }

        public static final String s(s sVar, Exception exc) {
            return "createCaptureSession failed on first attempt for choice " + sVar.getCameraChoice() + " (videoCaptureMethod=" + sVar.videoCaptureMethod + "): " + exc + ". Retrying.";
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return s.this.new e(this.f17490y, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super g0> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0083  */
        /* JADX WARN: Code duplicated, block: B:34:0x0103  */
        /* JADX WARN: Code duplicated, block: B:45:0x0134  */
        /* JADX WARN: Code duplicated, block: B:47:0x013e  */
        /* JADX WARN: Code duplicated, block: B:55:0x017c  */
        /* JADX WARN: Code duplicated, block: B:56:0x017d  */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0176, code lost:
        
            if (r15 == r1) goto L52;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 390
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fn.s.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$destroy$2", f = "Camera2Manager.kt", l = {499}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class f extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17491t;

        public f(lt.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return s.this.new f(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f17491t;
            if (i10 == 0) {
                gt.o.b(obj);
                Object value = s.this._state.getValue();
                d.b bVar = d.b.f17482a;
                if (Intrinsics.c(value, bVar)) {
                    return Unit.f22938a;
                }
                s.this._state.setValue(bVar);
                s.this.getPreviewView().getHolder().removeCallback(s.this.surfaceHolderCallback);
                s.this.processImageHaltedCv.block(2000L);
                r0 r0Var = s.this.mediaRecorderWrapper;
                this.f17491t = 1;
                if (r0Var.h(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            s.this.imageReaderVideoRecorder.i();
            s.this.imageReader.close();
            g0 g0Var = s.this.session;
            if (g0Var != null) {
                g0Var.f();
            }
            s.this.session = null;
            CameraDevice cameraDevice = s.this.camera;
            if (cameraDevice != null) {
                cameraDevice.close();
            }
            s.this.camera = null;
            s.this.cameraStatsManager.c();
            iu.q0.f(s.this.coroutineScope, null, 1, null);
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$destroyAsync$1", f = "Camera2Manager.kt", l = {481}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class g extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17493t;

        public g(lt.b<? super g> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return s.this.new g(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f17493t;
            if (i10 == 0) {
                gt.o.b(obj);
                s sVar = s.this;
                this.f17493t = 1;
                if (sVar.X(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$initializeCamera$2", f = "Camera2Manager.kt", l = {293}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class h extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17495t;

        public h(lt.b<? super h> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return s.this.new h(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f17495t;
            if (i10 == 0) {
                gt.o.b(obj);
                s sVar = s.this;
                this.f17495t = 1;
                obj = s.W(sVar, false, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            g0 g0Var = (g0) obj;
            if (g0Var != null && s.this.useImageReaderRecorder) {
                s.this.j0();
            }
            if (g0Var != null) {
                gt.n.a(g0Var.m());
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {760, 583}, m = "openCamera")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class i extends nt.d {
        public int B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f17497t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f17498u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f17499v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f17500w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f17501x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f17502y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f17503z;

        public i(lt.b<? super i> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17503z = obj;
            this.B |= Integer.MIN_VALUE;
            return s.this.l0(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"fn/s$j", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "Landroid/hardware/camera2/CameraDevice;", "device", "", "onOpened", "(Landroid/hardware/camera2/CameraDevice;)V", "onDisconnected", "", "error", "onError", "(Landroid/hardware/camera2/CameraDevice;I)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class j extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ iu.n<CameraDevice> f17504a;
        public final /* synthetic */ s b;

        /* JADX WARN: Multi-variable type inference failed */
        public j(iu.n<? super CameraDevice> nVar, s sVar) {
            this.f17504a = nVar;
            this.b = sVar;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            this.b.camera = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice device, int error) {
            Intrinsics.checkNotNullParameter(device, "device");
            try {
                device.close();
            } catch (Exception unused) {
            }
            if (this.f17504a.b()) {
                iu.n<CameraDevice> nVar = this.f17504a;
                gt.n.Companion companion = gt.n.INSTANCE;
                nVar.resumeWith(gt.n.b(gt.o.a(new l0(error))));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            this.f17504a.resumeWith(gt.n.b(device));
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {459}, m = "requestImageCapture-IoAF18A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class k extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f17505t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f17507v;

        public k(lt.b<? super k> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17505t = obj;
            this.f17507v |= Integer.MIN_VALUE;
            Object objO0 = s.this.o0(this);
            return objO0 == mt.c.e() ? objO0 : gt.n.a(objO0);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2", f = "Camera2Manager.kt", l = {471}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lgt/n;", "Ljava/io/File;", "<anonymous>", "(Liu/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    public static final class l extends nt.m implements Function2<iu.p0, lt.b<? super gt.n<? extends File>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17508t;

        public l(lt.b<? super l> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return s.this.new l(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super gt.n<? extends File>> bVar) {
            return ((l) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f17508t;
            if (i10 == 0) {
                gt.o.b(obj);
                if (s.this.isImageCaptureRequested) {
                    gt.n.Companion companion = gt.n.INSTANCE;
                    return gt.n.a(gt.n.b(gt.o.a(new o0())));
                }
                s.this.imageCaptureResult.setValue(null);
                s.this.isImageCaptureRequested = true;
                lu.h hVarS = lu.j.s(s.this.imageCaptureResult);
                this.f17508t = 1;
                obj = lu.j.u(hVarS, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            Object value = ((gt.n) obj).getValue();
            s.this.isImageCaptureRequested = false;
            return gt.n.a(value);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"fn/s$m", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/SurfaceHolder;", "holder", "", "surfaceDestroyed", "(Landroid/view/SurfaceHolder;)V", "", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceCreated", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class m implements SurfaceHolder.Callback {

        @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$2$surfaceCreated$1$1", f = "Camera2Manager.kt", l = {265}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class a extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f17511t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ s f17512u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s sVar, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f17512u = sVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new a(this.f17512u, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f17511t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    s sVar = this.f17512u;
                    this.f17511t = 1;
                    if (s.s0(sVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                return Unit.f22938a;
            }
        }

        @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$2$surfaceDestroyed$1", f = "Camera2Manager.kt", l = {243}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class b extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f17513t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ s f17514u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(s sVar, lt.b<? super b> bVar) {
                super(2, bVar);
                this.f17514u = sVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new b(this.f17514u, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f17513t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    s sVar = this.f17514u;
                    this.f17513t = 1;
                    if (sVar.X(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                return Unit.f22938a;
            }
        }

        public m() {
        }

        public static final void b(s sVar) {
            iu.k.d(sVar.coroutineScope, null, null, new a(sVar, null), 3, null);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            s.this.isPreviewSurfaceAvailable = true;
            s.this.getPreviewView().b(s.this.getCameraChoice().getSize().getWidth(), s.this.getCameraChoice().getSize().getHeight(), s.this.orientation);
            Camera2PreviewView previewView = s.this.getPreviewView();
            final s sVar = s.this;
            previewView.post(new Runnable() { // from class: fn.v
                @Override // java.lang.Runnable
                public final void run() {
                    s.m.b(sVar);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            s.this.isPreviewSurfaceAvailable = false;
            iu.k.d(s.this.coroutineScope, null, null, new b(s.this, null), 3, null);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$3$1", f = "Camera2Manager.kt", l = {274}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class n extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17515t;

        public n(lt.b<? super n> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return s.this.new n(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((n) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f17515t;
            if (i10 == 0) {
                gt.o.b(obj);
                s sVar = s.this;
                this.f17515t = 1;
                if (s.s0(sVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {218}, m = "start$initializeCameraAndSetState")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class o extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f17517t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f17518u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f17519v;

        public o(lt.b<? super o> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17518u = obj;
            this.f17519v |= Integer.MIN_VALUE;
            return s.s0(null, this);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {385, HttpStatusCode.UNAUTHORIZED_401}, m = "startVideo-IoAF18A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class p extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f17520t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f17521u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f17522v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f17524x;

        public p(lt.b<? super p> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17522v = obj;
            this.f17524x |= Integer.MIN_VALUE;
            Object objX0 = s.this.x0(this);
            return objX0 == mt.c.e() ? objX0 : gt.n.a(objX0);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$startVideo$2$startResult$1", f = "Camera2Manager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lgt/n;", "", "<anonymous>", "(Liu/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    public static final class q extends nt.m implements Function2<iu.p0, lt.b<? super gt.n<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17525t;

        public q(lt.b<? super q> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return s.this.new q(bVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(iu.p0 p0Var, lt.b<? super gt.n<Unit>> bVar) {
            return ((q) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f17525t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            return gt.n.a(s.this.imageReaderVideoRecorder.o());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(iu.p0 p0Var, lt.b<? super gt.n<? extends Unit>> bVar) {
            return invoke2(p0Var, (lt.b<? super gt.n<Unit>>) bVar);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {HttpStatusCodesKt.HTTP_MISDIRECTED_REQUEST, 449}, m = "stopVideo-IoAF18A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class r extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f17527t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f17529v;

        public r(lt.b<? super r> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f17527t = obj;
            this.f17529v |= Integer.MIN_VALUE;
            Object objZ0 = s.this.z0(this);
            return objZ0 == mt.c.e() ? objZ0 : gt.n.a(objZ0);
        }
    }

    /* JADX INFO: renamed from: fn.s$s, reason: collision with other inner class name */
    @nt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$stopVideo$recording$result$1", f = "Camera2Manager.kt", l = {HttpStatusCode.UNPROCESSABLE_ENTITY_422}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "Lgn/f$e;", "<anonymous>", "(Liu/p0;)Lgn/f$e;"}, k = 3, mv = {2, 2, 0})
    public static final class C0313s extends nt.m implements Function2<iu.p0, lt.b<? super gn.f.e>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17530t;

        public C0313s(lt.b<? super C0313s> bVar) {
            super(2, bVar);
        }

        public static final gn.f.e n(s sVar) {
            return sVar.imageReaderVideoRecorder.s();
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return s.this.new C0313s(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super gn.f.e> bVar) {
            return ((C0313s) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f17530t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            final s sVar = s.this;
            Function0 function0 = new Function0() { // from class: fn.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.C0313s.n(sVar);
                }
            };
            this.f17530t = 1;
            Object objC = a2.c(null, function0, this, 1, null);
            return objC == objE ? objE : objC;
        }
    }

    public s(@NotNull Context context, @NotNull h0 cameraChoice, @NotNull Camera2PreviewView previewView, @NotNull fn.g analyzer, @NotNull kn.a videoCaptureMethod, @Nullable sr.a aVar, boolean z10, @NotNull jn.a cameraStatsManager, @NotNull oq.c sdkFilesManager, @NotNull jq.a coroutineScopeFactory, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull nq.c externalEventLogger, boolean z11, boolean z12) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraChoice, "cameraChoice");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(analyzer, "analyzer");
        Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(coroutineScopeFactory, "coroutineScopeFactory");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        this.context = context;
        this.cameraChoice = cameraChoice;
        this.previewView = previewView;
        this.analyzer = analyzer;
        this.videoCaptureMethod = videoCaptureMethod;
        this.webRtcManager = aVar;
        this.isAudioRequired = z10;
        this.cameraStatsManager = cameraStatsManager;
        this.sdkFilesManager = sdkFilesManager;
        this.coroutineScopeFactory = coroutineScopeFactory;
        this.trackingEventsLogger = trackingEventsLogger;
        this.externalEventLogger = externalEventLogger;
        this.isImageReaderRecorderEnabled = z11;
        this.forceImageReaderRecorder = z12;
        this.cameraProperties = cameraChoice.getCameraProperties();
        iu.p0 p0VarA = coroutineScopeFactory.a();
        this.coroutineScope = p0VarA;
        String id2 = cameraChoice.getId();
        this.cameraId = id2;
        Object systemService = context.getSystemService("camera");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        this.cameraManager = cameraManager;
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(id2);
        Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "getCameraCharacteristics(...)");
        this.characteristics = cameraCharacteristics;
        Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int iIntValue = ((Number) obj).intValue();
        this.orientation = iIntValue;
        boolean z13 = z10 && hq.g.f(context);
        this.recordAudio = z13;
        Object upper = cameraChoice.g().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
        this.mediaRecorderWrapper = new r0(context, cameraChoice, ((Number) upper).intValue(), iIntValue, z13);
        int width = cameraChoice.getSize().getWidth();
        int height = cameraChoice.getSize().getHeight();
        Object upper2 = cameraChoice.g().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper2, "getUpper(...)");
        this.imageReaderVideoRecorder = new gn.f(width, height, ((Number) upper2).intValue(), iIntValue, z13, sdkFilesManager);
        this.useImageReaderRecorder = z12;
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        handlerThread.start();
        this.cameraThread = handlerThread;
        this.cameraHandler = new Handler(handlerThread.getLooper());
        this.isAnalyzerEnabled = true;
        this.imageCaptureResult = lu.r0.a(null);
        lu.c0<d> c0VarA = lu.r0.a(d.a.f17481a);
        this._state = c0VarA;
        this.state = c0VarA;
        this.analysisSizeScaling = 1.0f;
        this.imageReader = h0();
        this.imageProcessingChannel = ku.j.a(1, ku.a.DROP_OLDEST, new Function1() { // from class: fn.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return s.f0((Image) obj2);
            }
        });
        this.processImageHaltedCv = new ConditionVariable();
        iu.k.d(p0VarA, null, null, new a(null), 3, null);
    }

    public static final String A0(Throwable th2) {
        return "stopVideo failed due to reason " + kotlin.jvm.internal.d0.b(th2.getClass()).f() + ": " + kotlin.text.c0.B1(gt.a.b(th2), 4000);
    }

    public static final String B0(Throwable th2) {
        return "stopVideo warning - audio failed to record due to " + kotlin.jvm.internal.d0.b(th2.getClass()).f() + ": " + kotlin.text.c0.B1(gt.a.b(th2), 4000);
    }

    public static /* synthetic */ Object W(s sVar, boolean z10, lt.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return sVar.V(z10, bVar);
    }

    public static final Unit f0(Image it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.close();
        return Unit.f22938a;
    }

    public static final void i0(s sVar, ImageReader imageReader) {
        sr.a aVar;
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        int rotation = sVar.cameraChoice.getRotation();
        if (sVar.videoCaptureMethod == kn.a.Stream && (aVar = sVar.webRtcManager) != null) {
            aVar.b(imageAcquireNextImage, rotation);
        }
        if (imageAcquireNextImage != null) {
            if (sVar.useImageReaderRecorder && sVar.recordingStarted) {
                sVar.imageReaderVideoRecorder.l(imageAcquireNextImage);
            }
            Object objY = sVar.imageProcessingChannel.y(imageAcquireNextImage);
            if (objY instanceof ku.k.c) {
                ku.k.e(objY);
                imageAcquireNextImage.close();
            }
        }
    }

    public static final String k0() {
        return "Unable to setup camera with 3 streams. Falling back to 2 streams instead.";
    }

    public static final String m0(boolean z10, kotlin.jvm.internal.a0 a0Var, String str, l0 l0Var) {
        boolean z11 = !z10 || a0Var.f23004a > 2;
        return "openCamera error for camera " + str + ": code=" + l0Var.getErrorCode() + " (" + e0.b(l0Var.getErrorCode()) + "), attempt=" + (a0Var.f23004a + 1) + ", retriable=" + z10 + ", exhaustedAllRetries=" + z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object s0(final s sVar, lt.b<? super Unit> bVar) {
        o oVar;
        if (bVar instanceof o) {
            oVar = (o) bVar;
            int i10 = oVar.f17519v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f17519v = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(bVar);
            }
        } else {
            oVar = new o(bVar);
        }
        Object obj = oVar.f17518u;
        Object objE = mt.c.e();
        int i11 = oVar.f17519v;
        try {
            if (i11 == 0) {
                gt.o.b(obj);
                oVar.f17517t = sVar;
                oVar.f17519v = 1;
                if (sVar.g0(oVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (s) oVar.f17517t;
                gt.o.b(obj);
            }
            TrackingEventsLogger.logDebugLogEvent$default(sVar.trackingEventsLogger, "camera", new Function0() { // from class: fn.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.t0(this.f17426a);
                }
            }, false, 4, null);
            sVar._state.setValue(new d.Started(false));
        } catch (Exception e10) {
            TrackingEventsLogger.logDebugLogEvent$default(sVar.trackingEventsLogger, "camera", new Function0() { // from class: fn.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.u0(this.f17427a, e10);
                }
            }, false, 4, null);
            sVar._state.setValue(new d.Error(new c.a("Unable to initialize Camera2 classes", e10)));
        }
        return Unit.f22938a;
    }

    public static final String t0(s sVar) {
        return "initializeCamera succeeded for choice " + sVar.cameraChoice;
    }

    public static final String u0(s sVar, Exception exc) {
        return "initializeCamera failed for choice " + sVar.cameraChoice + ": " + kotlin.text.c0.B1(gt.a.b(exc), 4000);
    }

    public static final String v0(s sVar, boolean z10) {
        return "Camera not started for choice " + sVar.cameraChoice + ": missing permission (audioPermissionMissing=" + z10 + ")";
    }

    public static final Unit w0(s sVar) {
        if (sVar.isPreviewSurfaceAvailable) {
            iu.k.d(sVar.coroutineScope, null, null, sVar.new n(null), 3, null);
        }
        return Unit.f22938a;
    }

    public static final String y0(Throwable th2) {
        return "startVideo failed due to reason " + kotlin.jvm.internal.d0.b(th2.getClass()).f() + ": " + kotlin.text.c0.B1(gt.a.b(th2), 4000);
    }

    public final Object V(boolean z10, lt.b<? super g0> bVar) {
        return iu.i.g(g1.c(), new e(z10, null), bVar);
    }

    public final Object X(lt.b<? super Unit> bVar) {
        Object objG = iu.i.g(g1.a(), new f(null), bVar);
        return objG == mt.c.e() ? objG : Unit.f22938a;
    }

    public final void Y() {
        iu.k.d(this.coroutineScope, null, null, new g(null), 3, null);
    }

    public final void Z(boolean enable) {
        g0 g0Var = this.session;
        if (g0Var != null) {
            g0Var.j(enable);
            gt.n.a(g0Var.m());
        }
    }

    public final void a0() {
        g0 g0Var = this.session;
        if (g0Var != null) {
            g0Var.k(this.cameraChoice.getSize().getWidth() / 2, this.cameraChoice.getSize().getHeight() / 2, new Size((int) (((double) this.cameraChoice.getSize().getWidth()) * 0.15d), (int) (((double) this.cameraChoice.getSize().getHeight()) * 0.15d)), 5000L);
            gt.n.a(g0Var.m());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b0, reason: from getter */
    public final h0 getCameraChoice() {
        return this.cameraChoice;
    }

    @NotNull
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final CameraProperties getCameraProperties() {
        return this.cameraProperties;
    }

    @NotNull
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final Camera2PreviewView getPreviewView() {
        return this.previewView;
    }

    @NotNull
    public final lu.p0<d> e0() {
        return this.state;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final Object g0(lt.b<? super Unit> bVar) {
        Object objG = iu.i.g(g1.c(), new h(null), bVar);
        return objG == mt.c.e() ? objG : Unit.f22938a;
    }

    public final ImageReader h0() {
        ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (this.cameraChoice.getSize().getWidth() * this.analysisSizeScaling), (int) (this.cameraChoice.getSize().getHeight() * this.analysisSizeScaling), 35, 3);
        imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: fn.k
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                s.i0(this.f17414a, imageReader);
            }
        }, this.cameraHandler);
        Intrinsics.checkNotNullExpressionValue(imageReaderNewInstance, "also(...)");
        return imageReaderNewInstance;
    }

    public final void j0() {
        TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: fn.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.k0();
            }
        }, false, 4, null);
        this.externalEventLogger.b(InquiryEvent$MiscInquiryEvent$VideoCaptureFallback.f11167a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:12|13|47|22|(1:24)|(1:30)|44) */
    /* JADX WARN: Code duplicated, block: B:24:0x00a7 A[Catch: l0 -> 0x00ab, TRY_LEAVE, TryCatch #0 {l0 -> 0x00ab, blocks: (B:22:0x007a, B:24:0x00a7), top: B:47:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        r18 = r10;
        r10 = r2;
        r2 = r9;
        r9 = r4;
        r4 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        r12 = r12 + 1;
        r4.f23004a = r12;
        r2.f17497t = r10;
        r2.f17498u = r9;
        r2.f17499v = r8;
        r2.f17500w = r4;
        r2.f17501x = nt.l.a(r0);
        r2.f17502y = r11;
        r2.B = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0101, code lost:
    
        if (iu.z0.b(((long) r12) * 2000, r2) == r3) goto L44;
     */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0101 -> B:13:0x0044). Please report as a decompilation issue!!! */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l0(android.hardware.camera2.CameraManager r20, java.lang.String r21, android.os.Handler r22, lt.b<? super android.hardware.camera2.CameraDevice> r23) throws android.hardware.camera2.CameraAccessException {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.s.l0(android.hardware.camera2.CameraManager, java.lang.String, android.os.Handler, lt.b):java.lang.Object");
    }

    public final void n0(Image image) throws Exception {
        try {
            try {
                if (Intrinsics.c(this._state.getValue(), d.b.f17482a)) {
                    this.processImageHaltedCv.open();
                    vt.a.a(image, null);
                    return;
                }
                if (!this.isAnalyzerEnabled && !this.isImageCaptureRequested) {
                    vt.a.a(image, null);
                    return;
                }
                if (this.isImageCaptureRequested) {
                    File fileP0 = p0(image);
                    if (fileP0 != null) {
                        this.imageCaptureResult.setValue(gt.n.a(gt.n.b(fileP0)));
                    }
                } else if (this.isAnalyzerEnabled) {
                    try {
                        this.analyzer.g(image, this.orientation);
                    } catch (Exception unused) {
                    }
                }
                Unit unit = Unit.f22938a;
                vt.a.a(image, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    vt.a.a(image, th2);
                    throw th3;
                }
            }
        } catch (IllegalArgumentException unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object o0(@NotNull lt.b<? super gt.n<? extends File>> bVar) {
        k kVar;
        if (bVar instanceof k) {
            kVar = (k) bVar;
            int i10 = kVar.f17507v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f17507v = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(bVar);
            }
        } else {
            kVar = new k(bVar);
        }
        Object objG = kVar.f17505t;
        Object objE = mt.c.e();
        int i11 = kVar.f17507v;
        if (i11 == 0) {
            gt.o.b(objG);
            n2 n2VarC = g1.c();
            l lVar = new l(null);
            kVar.f17507v = 1;
            objG = iu.i.g(n2VarC, lVar, kVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(objG);
        }
        return ((gt.n) objG).getValue();
    }

    public final File p0(Image image) {
        Bitmap bitmapD = dn.c0.d(image, this.orientation, null, 2, null);
        if (bitmapD == null) {
            return null;
        }
        File fileE = this.sdkFilesManager.e("jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(fileE);
        try {
            bitmapD.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            st.c.a(fileOutputStream, null);
            bitmapD.recycle();
            return fileE;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                st.c.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public final void q0(boolean analyzerEnabled) {
        this.isAnalyzerEnabled = analyzerEnabled;
    }

    public final void r0() {
        final boolean z10 = this.isAudioRequired && l2.b.a(this.context, "android.permission.RECORD_AUDIO") != 0;
        if (l2.b.a(this.context, "android.permission.CAMERA") != 0 || z10) {
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: fn.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.v0(this.f17423a, z10);
                }
            }, false, 4, null);
            this._state.setValue(new d.Error(new c.b()));
        } else {
            if (this.isPreviewStarted) {
                return;
            }
            this.isPreviewStarted = true;
            this.isPreviewSurfaceAvailable = false;
            this.surfaceHolderCallback = new m();
            this.mediaRecorderWrapper.o(new Function0() { // from class: fn.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.w0(this.f17425a);
                }
            });
            this.previewView.a();
            this.previewView.getHolder().addCallback(this.surfaceHolderCallback);
            this.cameraStatsManager.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:40:0x00aa, B:20:0x0041, B:32:0x0076, B:34:0x0082, B:26:0x0058, B:28:0x005e, B:36:0x009a), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object x0(@NotNull lt.b<? super gt.n<Boolean>> bVar) {
        p pVar;
        s sVar;
        final Throwable thE;
        if (bVar instanceof p) {
            pVar = (p) bVar;
            int i10 = pVar.f17524x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.f17524x = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(bVar);
            }
        } else {
            pVar = new p(bVar);
        }
        Object objG = pVar.f17522v;
        Object objE = mt.c.e();
        int i11 = pVar.f17524x;
        try {
            if (i11 == 0) {
                gt.o.b(objG);
                if (this.recordingStarted) {
                    gt.n.Companion companion = gt.n.INSTANCE;
                    return gt.n.b(nt.b.a(false));
                }
                gt.n.Companion companion2 = gt.n.INSTANCE;
                if (this.useImageReaderRecorder) {
                    iu.l0 l0VarA = g1.a();
                    q qVar = new q(null);
                    pVar.f17520t = this;
                    pVar.f17521u = 0;
                    pVar.f17524x = 1;
                    objG = iu.i.g(l0VarA, qVar, pVar);
                    if (objG != objE) {
                        sVar = this;
                        thE = gt.n.e(((gt.n) objG).getValue());
                        if (thE != null) {
                            TrackingEventsLogger.logDebugLogEvent$default(sVar.trackingEventsLogger, "camera", new Function0() { // from class: fn.j
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return s.y0(thE);
                                }
                            }, false, 4, null);
                            return gt.n.b(gt.o.a(thE));
                        }
                    }
                } else {
                    r0 r0Var = this.mediaRecorderWrapper;
                    pVar.f17520t = this;
                    pVar.f17521u = 0;
                    pVar.f17524x = 2;
                    if (r0Var.p(pVar) != objE) {
                        sVar = this;
                    }
                }
                return objE;
            }
            if (i11 == 1) {
                sVar = (s) pVar.f17520t;
                gt.o.b(objG);
                thE = gt.n.e(((gt.n) objG).getValue());
                if (thE != null) {
                    TrackingEventsLogger.logDebugLogEvent$default(sVar.trackingEventsLogger, "camera", new Function0() { // from class: fn.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return s.y0(thE);
                        }
                    }, false, 4, null);
                    return gt.n.b(gt.o.a(thE));
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (s) pVar.f17520t;
                gt.o.b(objG);
            }
            sVar.recordingStarted = true;
            gt.n.Companion companion3 = gt.n.INSTANCE;
            return gt.n.b(nt.b.a(true));
        } catch (Throwable th2) {
            gt.n.Companion companion4 = gt.n.INSTANCE;
            return gt.n.b(gt.o.a(th2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r11 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        if (r11 == r1) goto L38;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z0(@org.jetbrains.annotations.NotNull lt.b<? super gt.n<? extends java.io.File>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof fn.s.r
            if (r0 == 0) goto L13
            r0 = r11
            fn.s$r r0 = (fn.s.r) r0
            int r1 = r0.f17529v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17529v = r1
            goto L18
        L13:
            fn.s$r r0 = new fn.s$r
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f17527t
            java.lang.Object r1 = mt.c.e()
            int r2 = r0.f17529v
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            gt.o.b(r11)
            goto Lac
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L36:
            gt.o.b(r11)
            goto L6a
        L3a:
            gt.o.b(r11)
            boolean r11 = r10.recordingStarted
            if (r11 != 0) goto L51
            gt.n$a r11 = gt.n.INSTANCE
            dn.h0 r11 = new dn.h0
            r11.<init>()
            java.lang.Object r11 = gt.o.a(r11)
            java.lang.Object r11 = gt.n.b(r11)
            return r11
        L51:
            r11 = 0
            r10.recordingStarted = r11
            boolean r11 = r10.useImageReaderRecorder
            if (r11 == 0) goto La1
            iu.l0 r11 = iu.g1.a()
            fn.s$s r2 = new fn.s$s
            r2.<init>(r3)
            r0.f17529v = r5
            java.lang.Object r11 = iu.i.g(r11, r2, r0)
            if (r11 != r1) goto L6a
            goto Lab
        L6a:
            gn.f$e r11 = (gn.f.e) r11
            if (r11 == 0) goto L83
            java.lang.Throwable r0 = r11.getVideoError()
            if (r0 == 0) goto L83
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r4 = r10.trackingEventsLogger
            fn.l r6 = new fn.l
            r6.<init>()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "camera"
            r7 = 0
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logDebugLogEvent$default(r4, r5, r6, r7, r8, r9)
        L83:
            if (r11 == 0) goto L9a
            java.lang.Throwable r0 = r11.getAudioError()
            if (r0 == 0) goto L9a
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r4 = r10.trackingEventsLogger
            fn.m r6 = new fn.m
            r6.<init>()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "camera"
            r7 = 0
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logDebugLogEvent$default(r4, r5, r6, r7, r8, r9)
        L9a:
            if (r11 == 0) goto Laf
            java.io.File r3 = r11.getFile()
            goto Laf
        La1:
            fn.r0 r11 = r10.mediaRecorderWrapper
            r0.f17529v = r4
            java.lang.Object r11 = r11.q(r0)
            if (r11 != r1) goto Lac
        Lab:
            return r1
        Lac:
            r3 = r11
            java.io.File r3 = (java.io.File) r3
        Laf:
            if (r3 != 0) goto Lc3
            gt.n$a r11 = gt.n.INSTANCE
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Recording failed."
            r11.<init>(r0)
            java.lang.Object r11 = gt.o.a(r11)
            java.lang.Object r11 = gt.n.b(r11)
            return r11
        Lc3:
            java.lang.Object r11 = gt.n.b(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.s.z0(lt.b):java.lang.Object");
    }
}
