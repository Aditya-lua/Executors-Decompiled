package hn;

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
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.a2;
import ku.g1;
import ku.n2;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ¼\u00012\u00020\u0001:\u0003IMQBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0!H\u0086@¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020$0!H\u0086@¢\u0006\u0004\b%\u0010#J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020$0!H\u0086@¢\u0006\u0004\b&\u0010#J\r\u0010'\u001a\u00020\u001e¢\u0006\u0004\b'\u0010 J\u0015\u0010)\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000e¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u000e¢\u0006\u0004\b,\u0010*J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u001eH\u0083@¢\u0006\u0004\b.\u0010#J\u000f\u0010/\u001a\u00020\u001eH\u0002¢\u0006\u0004\b/\u0010 J\u001c\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u00100\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b4\u0010#J,\u0010<\u001a\u00020;2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\n\b\u0002\u0010:\u001a\u0004\u0018\u000109H\u0083@¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u0004\u0018\u00010$*\u00020AH\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010,R\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010,R\u0017\u0010i\u001a\u00020d8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010r\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010|\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010,R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010,R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u0090\u0001\u001a\u0002098\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0093\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0095\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010,R\u0018\u0010\u0097\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010,R\u0018\u0010\u0099\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010,R\u0018\u0010\u009b\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010,R&\u0010\u009f\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010!0\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001f\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u009e\u0001R#\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010£\u00018\u0006¢\u0006\u000f\n\u0005\by\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010©\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010,R\u001c\u0010\u00ad\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001a\u0010°\u0001\u001a\u00030®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010\u009a\u0001R\u0019\u0010³\u0001\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R \u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020A0´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001a\u0010»\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001¨\u0006½\u0001"}, d2 = {"Lhn/s;", "", "Landroid/content/Context;", "context", "Lhn/h0;", "cameraChoice", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lhn/g;", "analyzer", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "", "isAudioRequired", "Lln/a;", "cameraStatsManager", "Lqq/c;", "sdkFilesManager", "Llq/a;", "coroutineScopeFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lpq/c;", "externalEventLogger", "isImageReaderRecorderEnabled", "forceImageReaderRecorder", "<init>", "(Landroid/content/Context;Lhn/h0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;ZLln/a;Lqq/c;Llq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lpq/c;ZZ)V", "", "r0", "()V", "Ljt/n;", "x0", "(Lnt/b;)Ljava/lang/Object;", "Ljava/io/File;", "z0", "o0", "Y", "analyzerEnabled", "q0", "(Z)V", "enable", "Z", "a0", "g0", "j0", "retryOnError", "Lhn/g0;", "V", "(ZLnt/b;)Ljava/lang/Object;", "X", "Landroid/hardware/camera2/CameraManager;", "manager", "", "cameraId", "Landroid/os/Handler;", "handler", "Landroid/hardware/camera2/CameraDevice;", "l0", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Lnt/b;)Ljava/lang/Object;", "Landroid/media/ImageReader;", "h0", "()Landroid/media/ImageReader;", "Landroid/media/Image;", "image", "n0", "(Landroid/media/Image;)V", "p0", "(Landroid/media/Image;)Ljava/io/File;", "a", "Landroid/content/Context;", "b", "Lhn/h0;", "b0", "()Lhn/h0;", "c", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "d0", "()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "d", "Lhn/g;", "e", "Lmn/a;", "f", "Lur/a;", "g", "h", "Lln/a;", "i", "Lqq/c;", "j", "Llq/a;", "k", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "l", "Lpq/c;", "m", "n", "Lcom/withpersona/sdk2/camera/CameraProperties;", "o", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c0", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lku/p0;", "p", "Lku/p0;", "coroutineScope", "q", "Ljava/lang/String;", "r", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroid/hardware/camera2/CameraCharacteristics;", "s", "Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", "", "t", "I", "orientation", "u", "recordAudio", "Lhn/r0;", "v", "Lhn/r0;", "mediaRecorderWrapper", "Lin/f;", "w", "Lin/f;", "imageReaderVideoRecorder", "x", "useImageReaderRecorder", "y", "Landroid/hardware/camera2/CameraDevice;", "camera", "Landroid/os/HandlerThread;", "z", "Landroid/os/HandlerThread;", "cameraThread", "A", "Landroid/os/Handler;", "cameraHandler", "B", "Lhn/g0;", "session", "C", "recordingStarted", "D", "isAnalyzerEnabled", "E", "isImageCaptureRequested", "F", "isPreviewSurfaceAvailable", "Lnu/c0;", "G", "Lnu/c0;", "imageCaptureResult", "Lhn/s$d;", "H", "_state", "Lnu/p0;", "Lnu/p0;", "e0", "()Lnu/p0;", "state", "J", "isPreviewStarted", "Landroid/view/SurfaceHolder$Callback;", "K", "Landroid/view/SurfaceHolder$Callback;", "surfaceHolderCallback", "", "L", "analysisSizeScaling", "M", "Landroid/media/ImageReader;", "imageReader", "Lmu/g;", "N", "Lmu/g;", "imageProcessingChannel", "Landroid/os/ConditionVariable;", "O", "Landroid/os/ConditionVariable;", "processImageHaltedCv", "P", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public final nu.c0<jt.n<File>> imageCaptureResult;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final nu.c0<d> _state;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public final nu.p0<d> state;

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
    public mu.g<Image> imageProcessingChannel;

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
    public final hn.g analyzer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mn.a videoCaptureMethod;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ur.a webRtcManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isAudioRequired;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ln.a cameraStatsManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qq.c sdkFilesManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lq.a coroutineScopeFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pq.c externalEventLogger;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final boolean isImageReaderRecorderEnabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final boolean forceImageReaderRecorder;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CameraProperties cameraProperties;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ku.p0 coroutineScope;

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
    public final in.f imageReaderVideoRecorder;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public boolean useImageReaderRecorder;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CameraDevice camera;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HandlerThread cameraThread;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$1", f = "Camera2Manager.kt", l = {183}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19503t;

        /* JADX INFO: renamed from: hn.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0346a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s f19505a;

            public C0346a(s sVar) {
                this.f19505a = sVar;
            }

            @Override // nu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Image image, nt.b<? super Unit> bVar) throws Exception {
                this.f19505a.n0(image);
                return Unit.f22483a;
            }
        }

        public a(nt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return s.this.new a(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f19503t;
            if (i10 == 0) {
                jt.o.b(obj);
                nu.h hVarH = nu.j.H(s.this.imageProcessingChannel);
                C0346a c0346a = new C0346a(s.this);
                this.f19503t = 1;
                if (hVarH.collect(c0346a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\n\u000bB\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lhn/s$c;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "", "message", "", "cause", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "b", "a", "Lhn/s$c$a;", "Lhn/s$c$b;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c extends Exception {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhn/s$c$a;", "Lhn/s$c;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull String message, @NotNull Throwable cause) {
                super(message, cause, null);
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(cause, "cause");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhn/s$c$b;", "Lhn/s$c;", "<init>", "()V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lhn/s$d;", "", "a", "d", "b", "c", "Lhn/s$d$a;", "Lhn/s$d$b;", "Lhn/s$d$c;", "Lhn/s$d$d;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhn/s$d$a;", "Lhn/s$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f19506a = new a();

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhn/s$d$b;", "Lhn/s$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f19507a = new b();

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

        /* JADX INFO: renamed from: hn.s$d$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhn/s$d$c;", "Lhn/s$d;", "Lhn/s$c;", "error", "<init>", "(Lhn/s$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhn/s$c;", "()Lhn/s$c;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: hn.s$d$d, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lhn/s$d$d;", "Lhn/s$d;", "", "firstFrameReceived", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Lhn/g0;", "<anonymous>", "(Lku/p0;)Lhn/g0;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$createCameraCaptureSession$2", f = "Camera2Manager.kt", l = {317, 335, 372}, m = "invokeSuspend")
    public static final class e extends pt.m implements Function2<ku.p0, nt.b<? super g0>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f19510t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f19511u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f19512v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f19513w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ boolean f19515y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, nt.b<? super e> bVar) {
            super(2, bVar);
            this.f19515y = z10;
        }

        public static final Unit s(s sVar) {
            Object value = sVar._state.getValue();
            d.Started started = value instanceof d.Started ? (d.Started) value : null;
            if (started != null && !started.getFirstFrameReceived()) {
                sVar._state.setValue(new d.Started(true));
            }
            return Unit.f22483a;
        }

        public static final String t(s sVar, Exception exc) {
            return "createCaptureSession failed on first attempt for choice " + sVar.getCameraChoice() + " (videoCaptureMethod=" + sVar.videoCaptureMethod + "): " + exc + ". Retrying.";
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return s.this.new e(this.f19515y, bVar);
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
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 390
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: hn.s.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super g0> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$destroy$2", f = "Camera2Manager.kt", l = {499}, m = "invokeSuspend")
    public static final class f extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19516t;

        public f(nt.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return s.this.new f(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f19516t;
            if (i10 == 0) {
                jt.o.b(obj);
                Object value = s.this._state.getValue();
                d.b bVar = d.b.f19507a;
                if (Intrinsics.c(value, bVar)) {
                    return Unit.f22483a;
                }
                s.this._state.setValue(bVar);
                s.this.getPreviewView().getHolder().removeCallback(s.this.surfaceHolderCallback);
                s.this.processImageHaltedCv.block(2000L);
                r0 r0Var = s.this.mediaRecorderWrapper;
                this.f19516t = 1;
                if (r0Var.h(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
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
            ku.q0.f(s.this.coroutineScope, null, 1, null);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$destroyAsync$1", f = "Camera2Manager.kt", l = {481}, m = "invokeSuspend")
    public static final class g extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19518t;

        public g(nt.b<? super g> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return s.this.new g(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f19518t;
            if (i10 == 0) {
                jt.o.b(obj);
                s sVar = s.this;
                this.f19518t = 1;
                if (sVar.X(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$initializeCamera$2", f = "Camera2Manager.kt", l = {293}, m = "invokeSuspend")
    public static final class h extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19520t;

        public h(nt.b<? super h> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return s.this.new h(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f19520t;
            if (i10 == 0) {
                jt.o.b(obj);
                s sVar = s.this;
                this.f19520t = 1;
                obj = s.W(sVar, false, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            g0 g0Var = (g0) obj;
            if (g0Var != null && s.this.useImageReaderRecorder) {
                s.this.j0();
            }
            if (g0Var != null) {
                jt.n.a(g0Var.m());
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {760, 583}, m = "openCamera")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class i extends pt.d {
        public int B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f19522t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f19523u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f19524v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f19525w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f19526x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f19527y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f19528z;

        public i(nt.b<? super i> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19528z = obj;
            this.B |= Integer.MIN_VALUE;
            return s.this.l0(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"hn/s$j", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "Landroid/hardware/camera2/CameraDevice;", "device", "", "onOpened", "(Landroid/hardware/camera2/CameraDevice;)V", "onDisconnected", "", "error", "onError", "(Landroid/hardware/camera2/CameraDevice;I)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class j extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ku.n<CameraDevice> f19529a;
        public final /* synthetic */ s b;

        /* JADX WARN: Multi-variable type inference failed */
        public j(ku.n<? super CameraDevice> nVar, s sVar) {
            this.f19529a = nVar;
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
            if (this.f19529a.b()) {
                ku.n<CameraDevice> nVar = this.f19529a;
                jt.n.Companion companion = jt.n.INSTANCE;
                nVar.resumeWith(jt.n.b(jt.o.a(new l0(error))));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            this.f19529a.resumeWith(jt.n.b(device));
        }
    }

    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {459}, m = "requestImageCapture-IoAF18A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class k extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f19530t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f19532v;

        public k(nt.b<? super k> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19530t = obj;
            this.f19532v |= Integer.MIN_VALUE;
            Object objO0 = s.this.o0(this);
            return objO0 == ot.c.e() ? objO0 : jt.n.a(objO0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Ljt/n;", "Ljava/io/File;", "<anonymous>", "(Lku/p0;)Ljt/n;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2", f = "Camera2Manager.kt", l = {471}, m = "invokeSuspend")
    public static final class l extends pt.m implements Function2<ku.p0, nt.b<? super jt.n<? extends File>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19533t;

        public l(nt.b<? super l> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return s.this.new l(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f19533t;
            if (i10 == 0) {
                jt.o.b(obj);
                if (s.this.isImageCaptureRequested) {
                    jt.n.Companion companion = jt.n.INSTANCE;
                    return jt.n.a(jt.n.b(jt.o.a(new o0())));
                }
                s.this.imageCaptureResult.setValue(null);
                s.this.isImageCaptureRequested = true;
                nu.h hVarS = nu.j.s(s.this.imageCaptureResult);
                this.f19533t = 1;
                obj = nu.j.u(hVarS, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            Object value = ((jt.n) obj).getValue();
            s.this.isImageCaptureRequested = false;
            return jt.n.a(value);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super jt.n<? extends File>> bVar) {
            return ((l) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"hn/s$m", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/SurfaceHolder;", "holder", "", "surfaceDestroyed", "(Landroid/view/SurfaceHolder;)V", "", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceCreated", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class m implements SurfaceHolder.Callback {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$2$surfaceCreated$1$1", f = "Camera2Manager.kt", l = {265}, m = "invokeSuspend")
        public static final class a extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f19536t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ s f19537u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s sVar, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f19537u = sVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f19537u, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f19536t;
                if (i10 == 0) {
                    jt.o.b(obj);
                    s sVar = this.f19537u;
                    this.f19536t = 1;
                    if (s.s0(sVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                }
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$2$surfaceDestroyed$1", f = "Camera2Manager.kt", l = {243}, m = "invokeSuspend")
        public static final class b extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f19538t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ s f19539u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(s sVar, nt.b<? super b> bVar) {
                super(2, bVar);
                this.f19539u = sVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new b(this.f19539u, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f19538t;
                if (i10 == 0) {
                    jt.o.b(obj);
                    s sVar = this.f19539u;
                    this.f19538t = 1;
                    if (sVar.X(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                }
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        public m() {
        }

        public static final void b(s sVar) {
            ku.k.d(sVar.coroutineScope, null, null, new a(sVar, null), 3, null);
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
            previewView.post(new Runnable() { // from class: hn.v
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
            ku.k.d(s.this.coroutineScope, null, null, new b(s.this, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$3$1", f = "Camera2Manager.kt", l = {274}, m = "invokeSuspend")
    public static final class n extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19540t;

        public n(nt.b<? super n> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return s.this.new n(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f19540t;
            if (i10 == 0) {
                jt.o.b(obj);
                s sVar = s.this;
                this.f19540t = 1;
                if (s.s0(sVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((n) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {218}, m = "start$initializeCameraAndSetState")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class o extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f19542t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f19543u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f19544v;

        public o(nt.b<? super o> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19543u = obj;
            this.f19544v |= Integer.MIN_VALUE;
            return s.s0(null, this);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {385, HttpStatusCode.UNAUTHORIZED_401}, m = "startVideo-IoAF18A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class p extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f19545t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f19546u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f19547v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f19549x;

        public p(nt.b<? super p> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19547v = obj;
            this.f19549x |= Integer.MIN_VALUE;
            Object objX0 = s.this.x0(this);
            return objX0 == ot.c.e() ? objX0 : jt.n.a(objX0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Ljt/n;", "", "<anonymous>", "(Lku/p0;)Ljt/n;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$startVideo$2$startResult$1", f = "Camera2Manager.kt", l = {}, m = "invokeSuspend")
    public static final class q extends pt.m implements Function2<ku.p0, nt.b<? super jt.n<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19550t;

        public q(nt.b<? super q> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return s.this.new q(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ku.p0 p0Var, nt.b<? super jt.n<? extends Unit>> bVar) {
            return invoke2(p0Var, (nt.b<? super jt.n<Unit>>) bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f19550t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            return jt.n.a(s.this.imageReaderVideoRecorder.o());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ku.p0 p0Var, nt.b<? super jt.n<Unit>> bVar) {
            return ((q) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {HttpStatusCodesKt.HTTP_MISDIRECTED_REQUEST, 449}, m = "stopVideo-IoAF18A")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class r extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f19552t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f19554v;

        public r(nt.b<? super r> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19552t = obj;
            this.f19554v |= Integer.MIN_VALUE;
            Object objZ0 = s.this.z0(this);
            return objZ0 == ot.c.e() ? objZ0 : jt.n.a(objZ0);
        }
    }

    /* JADX INFO: renamed from: hn.s$s, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Lin/f$e;", "<anonymous>", "(Lku/p0;)Lin/f$e;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$stopVideo$recording$result$1", f = "Camera2Manager.kt", l = {HttpStatusCode.UNPROCESSABLE_ENTITY_422}, m = "invokeSuspend")
    public static final class C0348s extends pt.m implements Function2<ku.p0, nt.b<? super in.f.e>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19555t;

        public C0348s(nt.b<? super C0348s> bVar) {
            super(2, bVar);
        }

        public static final in.f.e r(s sVar) {
            return sVar.imageReaderVideoRecorder.s();
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return s.this.new C0348s(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f19555t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            final s sVar = s.this;
            Function0 function0 = new Function0() { // from class: hn.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.C0348s.r(sVar);
                }
            };
            this.f19555t = 1;
            Object objC = a2.c(null, function0, this, 1, null);
            return objC == objE ? objE : objC;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super in.f.e> bVar) {
            return ((C0348s) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public s(@NotNull Context context, @NotNull h0 cameraChoice, @NotNull Camera2PreviewView previewView, @NotNull hn.g analyzer, @NotNull mn.a videoCaptureMethod, @Nullable ur.a aVar, boolean z10, @NotNull ln.a cameraStatsManager, @NotNull qq.c sdkFilesManager, @NotNull lq.a coroutineScopeFactory, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull pq.c externalEventLogger, boolean z11, boolean z12) throws CameraAccessException {
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
        ku.p0 p0VarA = coroutineScopeFactory.a();
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
        boolean z13 = z10 && jq.g.f(context);
        this.recordAudio = z13;
        Object upper = cameraChoice.g().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
        this.mediaRecorderWrapper = new r0(context, cameraChoice, ((Number) upper).intValue(), iIntValue, z13);
        int width = cameraChoice.getSize().getWidth();
        int height = cameraChoice.getSize().getHeight();
        Object upper2 = cameraChoice.g().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper2, "getUpper(...)");
        this.imageReaderVideoRecorder = new in.f(width, height, ((Number) upper2).intValue(), iIntValue, z13, sdkFilesManager);
        this.useImageReaderRecorder = z12;
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        handlerThread.start();
        this.cameraThread = handlerThread;
        this.cameraHandler = new Handler(handlerThread.getLooper());
        this.isAnalyzerEnabled = true;
        this.imageCaptureResult = nu.r0.a(null);
        nu.c0<d> c0VarA = nu.r0.a(d.a.f19506a);
        this._state = c0VarA;
        this.state = c0VarA;
        this.analysisSizeScaling = 1.0f;
        this.imageReader = h0();
        this.imageProcessingChannel = mu.j.a(1, mu.a.DROP_OLDEST, new Function1() { // from class: hn.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return s.f0((Image) obj2);
            }
        });
        this.processImageHaltedCv = new ConditionVariable();
        ku.k.d(p0VarA, null, null, new a(null), 3, null);
    }

    public static final String A0(Throwable th2) {
        return "stopVideo failed due to reason " + kotlin.jvm.internal.d0.b(th2.getClass()).f() + ": " + kotlin.text.c0.B1(jt.a.b(th2), 4000);
    }

    public static final String B0(Throwable th2) {
        return "stopVideo warning - audio failed to record due to " + kotlin.jvm.internal.d0.b(th2.getClass()).f() + ": " + kotlin.text.c0.B1(jt.a.b(th2), 4000);
    }

    public static /* synthetic */ Object W(s sVar, boolean z10, nt.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return sVar.V(z10, bVar);
    }

    public static final Unit f0(Image it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.close();
        return Unit.f22483a;
    }

    public static final void i0(s sVar, ImageReader imageReader) {
        ur.a aVar;
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        int rotation = sVar.cameraChoice.getRotation();
        if (sVar.videoCaptureMethod == mn.a.Stream && (aVar = sVar.webRtcManager) != null) {
            aVar.b(imageAcquireNextImage, rotation);
        }
        if (imageAcquireNextImage != null) {
            if (sVar.useImageReaderRecorder && sVar.recordingStarted) {
                sVar.imageReaderVideoRecorder.l(imageAcquireNextImage);
            }
            Object objW = sVar.imageProcessingChannel.w(imageAcquireNextImage);
            if (objW instanceof mu.k.c) {
                mu.k.e(objW);
                imageAcquireNextImage.close();
            }
        }
    }

    public static final String k0() {
        return "Unable to setup camera with 3 streams. Falling back to 2 streams instead.";
    }

    public static final String m0(boolean z10, kotlin.jvm.internal.a0 a0Var, String str, l0 l0Var) {
        boolean z11 = !z10 || a0Var.f22549a > 2;
        return "openCamera error for camera " + str + ": code=" + l0Var.getErrorCode() + " (" + e0.b(l0Var.getErrorCode()) + "), attempt=" + (a0Var.f22549a + 1) + ", retriable=" + z10 + ", exhaustedAllRetries=" + z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object s0(final s sVar, nt.b<? super Unit> bVar) {
        o oVar;
        if (bVar instanceof o) {
            oVar = (o) bVar;
            int i10 = oVar.f19544v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f19544v = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(bVar);
            }
        } else {
            oVar = new o(bVar);
        }
        Object obj = oVar.f19543u;
        Object objE = ot.c.e();
        int i11 = oVar.f19544v;
        try {
            if (i11 == 0) {
                jt.o.b(obj);
                oVar.f19542t = sVar;
                oVar.f19544v = 1;
                if (sVar.g0(oVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (s) oVar.f19542t;
                jt.o.b(obj);
            }
            TrackingEventsLogger.logDebugLogEvent$default(sVar.trackingEventsLogger, "camera", new Function0() { // from class: hn.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.t0(this.f19451a);
                }
            }, false, 4, null);
            sVar._state.setValue(new d.Started(false));
        } catch (Exception e10) {
            TrackingEventsLogger.logDebugLogEvent$default(sVar.trackingEventsLogger, "camera", new Function0() { // from class: hn.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.u0(this.f19452a, e10);
                }
            }, false, 4, null);
            sVar._state.setValue(new d.Error(new c.a("Unable to initialize Camera2 classes", e10)));
        }
        return Unit.f22483a;
    }

    public static final String t0(s sVar) {
        return "initializeCamera succeeded for choice " + sVar.cameraChoice;
    }

    public static final String u0(s sVar, Exception exc) {
        return "initializeCamera failed for choice " + sVar.cameraChoice + ": " + kotlin.text.c0.B1(jt.a.b(exc), 4000);
    }

    public static final String v0(s sVar, boolean z10) {
        return "Camera not started for choice " + sVar.cameraChoice + ": missing permission (audioPermissionMissing=" + z10 + ")";
    }

    public static final Unit w0(s sVar) {
        if (sVar.isPreviewSurfaceAvailable) {
            ku.k.d(sVar.coroutineScope, null, null, sVar.new n(null), 3, null);
        }
        return Unit.f22483a;
    }

    public static final String y0(Throwable th2) {
        return "startVideo failed due to reason " + kotlin.jvm.internal.d0.b(th2.getClass()).f() + ": " + kotlin.text.c0.B1(jt.a.b(th2), 4000);
    }

    public final Object V(boolean z10, nt.b<? super g0> bVar) {
        return ku.i.g(g1.c(), new e(z10, null), bVar);
    }

    public final Object X(nt.b<? super Unit> bVar) {
        Object objG = ku.i.g(g1.a(), new f(null), bVar);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }

    public final void Y() {
        ku.k.d(this.coroutineScope, null, null, new g(null), 3, null);
    }

    public final void Z(boolean enable) {
        g0 g0Var = this.session;
        if (g0Var != null) {
            g0Var.j(enable);
            jt.n.a(g0Var.m());
        }
    }

    public final void a0() {
        g0 g0Var = this.session;
        if (g0Var != null) {
            g0Var.k(this.cameraChoice.getSize().getWidth() / 2, this.cameraChoice.getSize().getHeight() / 2, new Size((int) (((double) this.cameraChoice.getSize().getWidth()) * 0.15d), (int) (((double) this.cameraChoice.getSize().getHeight()) * 0.15d)), 5000L);
            jt.n.a(g0Var.m());
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
    public final nu.p0<d> e0() {
        return this.state;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final Object g0(nt.b<? super Unit> bVar) {
        Object objG = ku.i.g(g1.c(), new h(null), bVar);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }

    public final ImageReader h0() {
        ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (this.cameraChoice.getSize().getWidth() * this.analysisSizeScaling), (int) (this.cameraChoice.getSize().getHeight() * this.analysisSizeScaling), 35, 3);
        imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: hn.k
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                s.i0(this.f19439a, imageReader);
            }
        }, this.cameraHandler);
        Intrinsics.checkNotNullExpressionValue(imageReaderNewInstance, "also(...)");
        return imageReaderNewInstance;
    }

    public final void j0() {
        TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.k0();
            }
        }, false, 4, null);
        this.externalEventLogger.b(InquiryEvent$MiscInquiryEvent$VideoCaptureFallback.f11086a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:12|13|49|22|(1:24)|(1:30)|44) */
    /* JADX WARN: Code duplicated, block: B:24:0x00a7 A[Catch: l0 -> 0x00ab, TRY_LEAVE, TryCatch #1 {l0 -> 0x00ab, blocks: (B:22:0x007a, B:24:0x00a7), top: B:49:0x007a }] */
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
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0101, code lost:
    
        if (ku.z0.b(((long) r12) * 2000, r2) == r3) goto L44;
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
    public final java.lang.Object l0(android.hardware.camera2.CameraManager r20, java.lang.String r21, android.os.Handler r22, nt.b<? super android.hardware.camera2.CameraDevice> r23) throws android.hardware.camera2.CameraAccessException {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.s.l0(android.hardware.camera2.CameraManager, java.lang.String, android.os.Handler, nt.b):java.lang.Object");
    }

    public final void n0(Image image) throws Exception {
        try {
            try {
                if (Intrinsics.c(this._state.getValue(), d.b.f19507a)) {
                    this.processImageHaltedCv.open();
                    xt.a.a(image, null);
                    return;
                }
                if (!this.isAnalyzerEnabled && !this.isImageCaptureRequested) {
                    xt.a.a(image, null);
                    return;
                }
                if (this.isImageCaptureRequested) {
                    File fileP0 = p0(image);
                    if (fileP0 != null) {
                        this.imageCaptureResult.setValue(jt.n.a(jt.n.b(fileP0)));
                    }
                } else if (this.isAnalyzerEnabled) {
                    try {
                        this.analyzer.h(image, this.orientation);
                    } catch (Exception unused) {
                    }
                }
                Unit unit = Unit.f22483a;
                xt.a.a(image, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    xt.a.a(image, th2);
                    throw th3;
                }
            }
        } catch (IllegalArgumentException unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object o0(@NotNull nt.b<? super jt.n<? extends File>> bVar) {
        k kVar;
        if (bVar instanceof k) {
            kVar = (k) bVar;
            int i10 = kVar.f19532v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f19532v = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(bVar);
            }
        } else {
            kVar = new k(bVar);
        }
        Object objG = kVar.f19530t;
        Object objE = ot.c.e();
        int i11 = kVar.f19532v;
        if (i11 == 0) {
            jt.o.b(objG);
            n2 n2VarC = g1.c();
            l lVar = new l(null);
            kVar.f19532v = 1;
            objG = ku.i.g(n2VarC, lVar, kVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(objG);
        }
        return ((jt.n) objG).getValue();
    }

    public final File p0(Image image) {
        Bitmap bitmapD = fn.c0.d(image, this.orientation, null, 2, null);
        if (bitmapD == null) {
            return null;
        }
        File fileE = this.sdkFilesManager.e("jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(fileE);
        try {
            bitmapD.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            ut.c.a(fileOutputStream, null);
            bitmapD.recycle();
            return fileE;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ut.c.a(fileOutputStream, th2);
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
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.v0(this.f19448a, z10);
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
            this.mediaRecorderWrapper.o(new Function0() { // from class: hn.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.w0(this.f19450a);
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
    public final Object x0(@NotNull nt.b<? super jt.n<Boolean>> bVar) {
        p pVar;
        s sVar;
        final Throwable thE;
        if (bVar instanceof p) {
            pVar = (p) bVar;
            int i10 = pVar.f19549x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.f19549x = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(bVar);
            }
        } else {
            pVar = new p(bVar);
        }
        Object objG = pVar.f19547v;
        Object objE = ot.c.e();
        int i11 = pVar.f19549x;
        try {
            if (i11 == 0) {
                jt.o.b(objG);
                if (this.recordingStarted) {
                    jt.n.Companion companion = jt.n.INSTANCE;
                    return jt.n.b(pt.b.a(false));
                }
                jt.n.Companion companion2 = jt.n.INSTANCE;
                if (this.useImageReaderRecorder) {
                    ku.l0 l0VarA = g1.a();
                    q qVar = new q(null);
                    pVar.f19545t = this;
                    pVar.f19546u = 0;
                    pVar.f19549x = 1;
                    objG = ku.i.g(l0VarA, qVar, pVar);
                    if (objG != objE) {
                        sVar = this;
                        thE = jt.n.e(((jt.n) objG).getValue());
                        if (thE != null) {
                            TrackingEventsLogger.logDebugLogEvent$default(sVar.trackingEventsLogger, "camera", new Function0() { // from class: hn.j
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return s.y0(thE);
                                }
                            }, false, 4, null);
                            return jt.n.b(jt.o.a(thE));
                        }
                    }
                } else {
                    r0 r0Var = this.mediaRecorderWrapper;
                    pVar.f19545t = this;
                    pVar.f19546u = 0;
                    pVar.f19549x = 2;
                    if (r0Var.p(pVar) != objE) {
                        sVar = this;
                    }
                }
                return objE;
            }
            if (i11 == 1) {
                sVar = (s) pVar.f19545t;
                jt.o.b(objG);
                thE = jt.n.e(((jt.n) objG).getValue());
                if (thE != null) {
                    TrackingEventsLogger.logDebugLogEvent$default(sVar.trackingEventsLogger, "camera", new Function0() { // from class: hn.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return s.y0(thE);
                        }
                    }, false, 4, null);
                    return jt.n.b(jt.o.a(thE));
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (s) pVar.f19545t;
                jt.o.b(objG);
            }
            sVar.recordingStarted = true;
            jt.n.Companion companion3 = jt.n.INSTANCE;
            return jt.n.b(pt.b.a(true));
        } catch (Throwable th2) {
            jt.n.Companion companion4 = jt.n.INSTANCE;
            return jt.n.b(jt.o.a(th2));
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
    public final java.lang.Object z0(@org.jetbrains.annotations.NotNull nt.b<? super jt.n<? extends java.io.File>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof hn.s.r
            if (r0 == 0) goto L13
            r0 = r11
            hn.s$r r0 = (hn.s.r) r0
            int r1 = r0.f19554v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19554v = r1
            goto L18
        L13:
            hn.s$r r0 = new hn.s$r
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f19552t
            java.lang.Object r1 = ot.c.e()
            int r2 = r0.f19554v
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            jt.o.b(r11)
            goto Lac
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L36:
            jt.o.b(r11)
            goto L6a
        L3a:
            jt.o.b(r11)
            boolean r11 = r10.recordingStarted
            if (r11 != 0) goto L51
            jt.n$a r11 = jt.n.INSTANCE
            fn.h0 r11 = new fn.h0
            r11.<init>()
            java.lang.Object r11 = jt.o.a(r11)
            java.lang.Object r11 = jt.n.b(r11)
            return r11
        L51:
            r11 = 0
            r10.recordingStarted = r11
            boolean r11 = r10.useImageReaderRecorder
            if (r11 == 0) goto La1
            ku.l0 r11 = ku.g1.a()
            hn.s$s r2 = new hn.s$s
            r2.<init>(r3)
            r0.f19554v = r5
            java.lang.Object r11 = ku.i.g(r11, r2, r0)
            if (r11 != r1) goto L6a
            goto Lab
        L6a:
            in.f$e r11 = (in.f.e) r11
            if (r11 == 0) goto L83
            java.lang.Throwable r0 = r11.getVideoError()
            if (r0 == 0) goto L83
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r4 = r10.trackingEventsLogger
            hn.l r6 = new hn.l
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
            hn.m r6 = new hn.m
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
            hn.r0 r11 = r10.mediaRecorderWrapper
            r0.f19554v = r4
            java.lang.Object r11 = r11.q(r0)
            if (r11 != r1) goto Lac
        Lab:
            return r1
        Lac:
            r3 = r11
            java.io.File r3 = (java.io.File) r3
        Laf:
            if (r3 != 0) goto Lc3
            jt.n$a r11 = jt.n.INSTANCE
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Recording failed."
            r11.<init>(r0)
            java.lang.Object r11 = jt.o.a(r11)
            java.lang.Object r11 = jt.n.b(r11)
            return r11
        Lc3:
            java.lang.Object r11 = jt.n.b(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.s.z0(nt.b):java.lang.Object");
    }
}
