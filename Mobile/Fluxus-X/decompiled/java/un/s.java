package un;

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
import android.view.Surface;
import android.view.SurfaceHolder;
import av.a2;
import av.g1;
import av.n2;
import com.github.luben.zstd.BuildConfig;
import com.roblox.protocols.calling.CallingHandler;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import sn.t0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ¼\u00012\u00020\u0001:\u0003IMQBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0!H\u0086@¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020$0!H\u0086@¢\u0006\u0004\b%\u0010#J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020$0!H\u0086@¢\u0006\u0004\b&\u0010#J\r\u0010'\u001a\u00020\u001e¢\u0006\u0004\b'\u0010 J\u0015\u0010)\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000e¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u000e¢\u0006\u0004\b,\u0010*J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u001eH\u0083@¢\u0006\u0004\b.\u0010#J\u000f\u0010/\u001a\u00020\u001eH\u0002¢\u0006\u0004\b/\u0010 J\u001c\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u00100\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b4\u0010#J,\u0010<\u001a\u00020;2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\n\b\u0002\u0010:\u001a\u0004\u0018\u000109H\u0083@¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u0004\u0018\u00010$*\u00020AH\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010,R\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010,R\u0017\u0010i\u001a\u00020d8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010r\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010|\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010,R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010,R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u0090\u0001\u001a\u0002098\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0093\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0095\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010,R\u0018\u0010\u0097\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010,R\u0018\u0010\u0099\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010,R\u0018\u0010\u009b\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010,R&\u0010\u009f\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010!0\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001f\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u009e\u0001R#\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010£\u00018\u0006¢\u0006\u000f\n\u0005\by\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010©\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010,R\u001c\u0010\u00ad\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001a\u0010°\u0001\u001a\u00030®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010\u009a\u0001R\u0019\u0010³\u0001\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R \u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020A0´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001a\u0010»\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001¨\u0006½\u0001"}, d2 = {"Lun/s;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "Lun/h0;", "cameraChoice", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lun/g;", "analyzer", "Lzn/a;", "videoCaptureMethod", "Lks/a;", "webRtcManager", BuildConfig.FLAVOR, "isAudioRequired", "Lyn/a;", "cameraStatsManager", "Ler/c;", "sdkFilesManager", "Lzq/a;", "coroutineScopeFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Ldr/c;", "externalEventLogger", "isImageReaderRecorderEnabled", "forceImageReaderRecorder", "<init>", "(Landroid/content/Context;Lun/h0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lun/g;Lzn/a;Lks/a;ZLyn/a;Ler/c;Lzq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ldr/c;ZZ)V", BuildConfig.FLAVOR, "r0", "()V", "Lzt/n;", "x0", "(Leu/b;)Ljava/lang/Object;", "Ljava/io/File;", "z0", "o0", "Y", "analyzerEnabled", "q0", "(Z)V", "enable", "Z", "a0", "g0", "j0", "retryOnError", "Lun/g0;", "V", "(ZLeu/b;)Ljava/lang/Object;", "X", "Landroid/hardware/camera2/CameraManager;", "manager", BuildConfig.FLAVOR, "cameraId", "Landroid/os/Handler;", "handler", "Landroid/hardware/camera2/CameraDevice;", "l0", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Leu/b;)Ljava/lang/Object;", "Landroid/media/ImageReader;", "h0", "()Landroid/media/ImageReader;", "Landroid/media/Image;", "image", "n0", "(Landroid/media/Image;)V", "p0", "(Landroid/media/Image;)Ljava/io/File;", "a", "Landroid/content/Context;", "b", "Lun/h0;", "b0", "()Lun/h0;", "c", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "d0", "()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "d", "Lun/g;", "e", "Lzn/a;", "f", "Lks/a;", "g", "h", "Lyn/a;", "i", "Ler/c;", "j", "Lzq/a;", "k", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "l", "Ldr/c;", "m", "n", "Lsn/v;", "o", "Lsn/v;", "c0", "()Lsn/v;", "cameraProperties", "Lav/p0;", "p", "Lav/p0;", "coroutineScope", "q", "Ljava/lang/String;", "r", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroid/hardware/camera2/CameraCharacteristics;", "s", "Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", BuildConfig.FLAVOR, "t", "I", "orientation", "u", "recordAudio", "Lun/r0;", "v", "Lun/r0;", "mediaRecorderWrapper", "Lvn/f;", "w", "Lvn/f;", "imageReaderVideoRecorder", "x", "useImageReaderRecorder", "y", "Landroid/hardware/camera2/CameraDevice;", "camera", "Landroid/os/HandlerThread;", "z", "Landroid/os/HandlerThread;", "cameraThread", "A", "Landroid/os/Handler;", "cameraHandler", "B", "Lun/g0;", "session", "C", "recordingStarted", "D", "isAnalyzerEnabled", "E", "isImageCaptureRequested", "F", "isPreviewSurfaceAvailable", "Ldv/c0;", "G", "Ldv/c0;", "imageCaptureResult", "Lun/s$d;", "H", "_state", "Ldv/p0;", "Ldv/p0;", "e0", "()Ldv/p0;", "state", "J", "isPreviewStarted", "Landroid/view/SurfaceHolder$Callback;", "K", "Landroid/view/SurfaceHolder$Callback;", "surfaceHolderCallback", BuildConfig.FLAVOR, "L", "analysisSizeScaling", "M", "Landroid/media/ImageReader;", "imageReader", "Lcv/g;", "N", "Lcv/g;", "imageProcessingChannel", "Landroid/os/ConditionVariable;", "O", "Landroid/os/ConditionVariable;", "processImageHaltedCv", "P", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public final dv.c0<zt.n<File>> imageCaptureResult;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final dv.c0<d> _state;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public final dv.p0<d> state;

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
    public cv.g<Image> imageProcessingChannel;

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
    public final un.g analyzer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zn.a videoCaptureMethod;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ks.a webRtcManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isAudioRequired;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yn.a cameraStatsManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final er.c sdkFilesManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zq.a coroutineScopeFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dr.c externalEventLogger;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final boolean isImageReaderRecorderEnabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final boolean forceImageReaderRecorder;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sn.v cameraProperties;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final av.p0 coroutineScope;

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
    public final vn.f imageReaderVideoRecorder;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public boolean useImageReaderRecorder;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CameraDevice camera;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HandlerThread cameraThread;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$1", f = "Camera2Manager.kt", l = {183}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33718t;

        /* JADX INFO: renamed from: un.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0685a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s f33720a;

            public C0685a(s sVar) {
                this.f33720a = sVar;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Image image, eu.b<? super Unit> bVar) throws Exception {
                this.f33720a.n0(image);
                return Unit.f21506a;
            }
        }

        public a(eu.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return s.this.new a(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33718t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.h hVarH = dv.j.H(s.this.imageProcessingChannel);
                C0685a c0685a = new C0685a(s.this);
                this.f33718t = 1;
                if (hVarH.collect(c0685a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\n\u000bB\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lun/s$c;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "cause", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "b", "a", "Lun/s$c$a;", "Lun/s$c$b;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c extends Exception {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lun/s$c$a;", "Lun/s$c;", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull String message, @NotNull Throwable cause) {
                super(message, cause, null);
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(cause, "cause");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lun/s$c$b;", "Lun/s$c;", "<init>", "()V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lun/s$d;", BuildConfig.FLAVOR, "a", "d", "b", "c", "Lun/s$d$a;", "Lun/s$d$b;", "Lun/s$d$c;", "Lun/s$d$d;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lun/s$d$a;", "Lun/s$d;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f33721a = new a();

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lun/s$d$b;", "Lun/s$d;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f33722a = new b();

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

        /* JADX INFO: renamed from: un.s$d$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lun/s$d$c;", "Lun/s$d;", "Lun/s$c;", "error", "<init>", "(Lun/s$c;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lun/s$c;", "()Lun/s$c;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: un.s$d$d, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lun/s$d$d;", "Lun/s$d;", BuildConfig.FLAVOR, "firstFrameReceived", "<init>", "(Z)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Lun/g0;", "<anonymous>", "(Lav/p0;)Lun/g0;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$createCameraCaptureSession$2", f = "Camera2Manager.kt", l = {317, 335, 372}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function2<av.p0, eu.b<? super g0>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33725t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33726u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f33727v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f33728w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ boolean f33730y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, eu.b<? super e> bVar) {
            super(2, bVar);
            this.f33730y = z10;
        }

        public static final Unit q(s sVar) {
            Object value = sVar._state.getValue();
            d.Started started = value instanceof d.Started ? (d.Started) value : null;
            if (started != null && !started.getFirstFrameReceived()) {
                sVar._state.setValue(new d.Started(true));
            }
            return Unit.f21506a;
        }

        public static final String r(s sVar, Exception exc) {
            return "createCaptureSession failed on first attempt for choice " + sVar.getCameraChoice() + " (videoCaptureMethod=" + sVar.videoCaptureMethod + "): " + exc + ". Retrying.";
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return s.this.new e(this.f33730y, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super g0> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
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
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            s sVar;
            CameraDevice cameraDevice;
            List<? extends Surface> listP;
            e eVar;
            final Exception exc;
            List<? extends Surface> list;
            CameraDevice cameraDevice2;
            Object objE = fu.c.e();
            int i10 = this.f33728w;
            if (i10 == 0) {
                zt.o.b(obj);
                if (s.this.camera == null) {
                    sVar = s.this;
                    CameraManager cameraManager = sVar.cameraManager;
                    String id2 = s.this.getCameraChoice().getId();
                    Handler handler = s.this.cameraHandler;
                    this.f33725t = sVar;
                    this.f33728w = 1;
                    obj = sVar.l0(cameraManager, id2, handler, this);
                    if (obj == objE) {
                    }
                } else {
                    cameraDevice = s.this.camera;
                    if (cameraDevice != null) {
                        throw new IllegalStateException("Unable to open camera");
                    }
                    listP = p001kotlin.collections.p.p(s.this.getPreviewView().getHolder().getSurface(), s.this.imageReader.getSurface());
                    if (s.this.videoCaptureMethod == zn.a.Upload && !s.this.useImageReaderRecorder) {
                        s.this.mediaRecorderWrapper.m();
                        listP.add(s.this.mediaRecorderWrapper.i());
                    }
                    try {
                        g0.Companion aVar = g0.INSTANCE;
                        h0 cameraChoice = s.this.getCameraChoice();
                        CameraCharacteristics cameraCharacteristics = s.this.characteristics;
                        Handler handler2 = s.this.cameraHandler;
                        final s sVar2 = s.this;
                        Function0<Unit> function0 = new Function0() { // from class: un.t
                            @Override // p001kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return s.e.q(sVar2);
                            }
                        };
                        zq.a aVar2 = s.this.coroutineScopeFactory;
                        this.f33725t = gu.l.a(cameraDevice);
                        this.f33726u = gu.l.a(listP);
                        this.f33728w = 2;
                        eVar = this;
                        try {
                            obj = aVar.a(cameraChoice, cameraCharacteristics, listP, cameraDevice, handler2, function0, aVar2, eVar);
                            if (obj != objE) {
                                list = listP;
                                cameraDevice2 = cameraDevice;
                                s.this.session = (g0) obj;
                                return (g0) obj;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            exc = e;
                            list = listP;
                            cameraDevice2 = cameraDevice;
                            TrackingEventsLogger trackingEventsLogger = s.this.trackingEventsLogger;
                            final s sVar3 = s.this;
                            TrackingEventsLogger.logDebugLogEvent$default(trackingEventsLogger, "camera", new Function0() { // from class: un.u
                                @Override // p001kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return s.e.r(sVar3, exc);
                                }
                            }, false, 4, null);
                            if (!eVar.f33730y) {
                                throw exc;
                            }
                            if (s.this.videoCaptureMethod == zn.a.Upload) {
                                s.this.useImageReaderRecorder = true;
                            }
                            s.this.analysisSizeScaling = 1.0f;
                            s sVar4 = s.this;
                            sVar4.imageReader = sVar4.h0();
                            s sVar5 = s.this;
                            eVar.f33725t = gu.l.a(cameraDevice2);
                            eVar.f33726u = gu.l.a(list);
                            eVar.f33727v = gu.l.a(exc);
                            eVar.f33728w = 3;
                            obj = sVar5.V(false, this);
                        }
                    } catch (Exception e11) {
                        e = e11;
                        eVar = this;
                    }
                }
                return objE;
            }
            if (i10 == 1) {
                sVar = (s) this.f33725t;
                zt.o.b(obj);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return (g0) obj;
                }
                list = (List) this.f33726u;
                cameraDevice2 = (CameraDevice) this.f33725t;
                try {
                    zt.o.b(obj);
                    eVar = this;
                    try {
                        s.this.session = (g0) obj;
                        return (g0) obj;
                    } catch (Exception e12) {
                        exc = e12;
                        TrackingEventsLogger trackingEventsLogger2 = s.this.trackingEventsLogger;
                        final s sVar6 = s.this;
                        TrackingEventsLogger.logDebugLogEvent$default(trackingEventsLogger2, "camera", new Function0() { // from class: un.u
                            @Override // p001kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return s.e.r(sVar6, exc);
                            }
                        }, false, 4, null);
                        if (!eVar.f33730y) {
                            throw exc;
                        }
                        if (s.this.videoCaptureMethod == zn.a.Upload && s.this.isImageReaderRecorderEnabled) {
                            s.this.useImageReaderRecorder = true;
                        }
                        s.this.analysisSizeScaling = 1.0f;
                        s sVar7 = s.this;
                        sVar7.imageReader = sVar7.h0();
                        s sVar8 = s.this;
                        eVar.f33725t = gu.l.a(cameraDevice2);
                        eVar.f33726u = gu.l.a(list);
                        eVar.f33727v = gu.l.a(exc);
                        eVar.f33728w = 3;
                        obj = sVar8.V(false, this);
                    }
                } catch (Exception e13) {
                    exc = e13;
                    eVar = this;
                    TrackingEventsLogger trackingEventsLogger3 = s.this.trackingEventsLogger;
                    final s sVar9 = s.this;
                    TrackingEventsLogger.logDebugLogEvent$default(trackingEventsLogger3, "camera", new Function0() { // from class: un.u
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return s.e.r(sVar9, exc);
                        }
                    }, false, 4, null);
                    if (!eVar.f33730y) {
                        throw exc;
                    }
                    if (s.this.videoCaptureMethod == zn.a.Upload) {
                        s.this.useImageReaderRecorder = true;
                    }
                    s.this.analysisSizeScaling = 1.0f;
                    s sVar10 = s.this;
                    sVar10.imageReader = sVar10.h0();
                    s sVar11 = s.this;
                    eVar.f33725t = gu.l.a(cameraDevice2);
                    eVar.f33726u = gu.l.a(list);
                    eVar.f33727v = gu.l.a(exc);
                    eVar.f33728w = 3;
                    obj = sVar11.V(false, this);
                }
            }
            sVar.camera = (CameraDevice) obj;
            cameraDevice = s.this.camera;
            if (cameraDevice != null) {
                throw new IllegalStateException("Unable to open camera");
            }
            listP = p001kotlin.collections.p.p(s.this.getPreviewView().getHolder().getSurface(), s.this.imageReader.getSurface());
            if (s.this.videoCaptureMethod == zn.a.Upload) {
                s.this.mediaRecorderWrapper.m();
                listP.add(s.this.mediaRecorderWrapper.i());
            }
            g0.Companion aVar3 = g0.INSTANCE;
            h0 cameraChoice2 = s.this.getCameraChoice();
            CameraCharacteristics cameraCharacteristics2 = s.this.characteristics;
            Handler handler3 = s.this.cameraHandler;
            final s sVar12 = s.this;
            Function0<Unit> function1 = new Function0() { // from class: un.t
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.e.q(sVar12);
                }
            };
            zq.a aVar4 = s.this.coroutineScopeFactory;
            this.f33725t = gu.l.a(cameraDevice);
            this.f33726u = gu.l.a(listP);
            this.f33728w = 2;
            eVar = this;
            obj = aVar3.a(cameraChoice2, cameraCharacteristics2, listP, cameraDevice, handler3, function1, aVar4, eVar);
            if (obj != objE) {
                list = listP;
                cameraDevice2 = cameraDevice;
                s.this.session = (g0) obj;
                return (g0) obj;
            }
            return objE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$destroy$2", f = "Camera2Manager.kt", l = {499}, m = "invokeSuspend")
    public static final class f extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33731t;

        public f(eu.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return s.this.new f(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33731t;
            if (i10 == 0) {
                zt.o.b(obj);
                Object value = s.this._state.getValue();
                d.b bVar = d.b.f33722a;
                if (Intrinsics.c(value, bVar)) {
                    return Unit.f21506a;
                }
                s.this._state.setValue(bVar);
                s.this.getPreviewView().getHolder().removeCallback(s.this.surfaceHolderCallback);
                s.this.processImageHaltedCv.block(CallingHandler.AVATAR_TIMEOUT_MS);
                r0 r0Var = s.this.mediaRecorderWrapper;
                this.f33731t = 1;
                if (r0Var.h(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
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
            av.q0.f(s.this.coroutineScope, null, 1, null);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$destroyAsync$1", f = "Camera2Manager.kt", l = {481}, m = "invokeSuspend")
    public static final class g extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33733t;

        public g(eu.b<? super g> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return s.this.new g(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33733t;
            if (i10 == 0) {
                zt.o.b(obj);
                s sVar = s.this;
                this.f33733t = 1;
                if (sVar.X(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$initializeCamera$2", f = "Camera2Manager.kt", l = {293}, m = "invokeSuspend")
    public static final class h extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33735t;

        public h(eu.b<? super h> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return s.this.new h(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33735t;
            if (i10 == 0) {
                zt.o.b(obj);
                s sVar = s.this;
                this.f33735t = 1;
                obj = s.W(sVar, false, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            g0 g0Var = (g0) obj;
            if (g0Var != null && s.this.useImageReaderRecorder) {
                s.this.j0();
            }
            if (g0Var != null) {
                zt.n.a(g0Var.m());
            }
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {760, 583}, m = "openCamera")
    public static final class i extends gu.d {
        public int B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33737t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33738u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f33739v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f33740w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f33741x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f33742y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f33743z;

        public i(eu.b<? super i> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33743z = obj;
            this.B |= Integer.MIN_VALUE;
            return s.this.l0(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"un/s$j", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "Landroid/hardware/camera2/CameraDevice;", "device", BuildConfig.FLAVOR, "onOpened", "(Landroid/hardware/camera2/CameraDevice;)V", "onDisconnected", BuildConfig.FLAVOR, "error", "onError", "(Landroid/hardware/camera2/CameraDevice;I)V", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class j extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ av.n<CameraDevice> f33744a;
        public final /* synthetic */ s b;

        /* JADX WARN: Multi-variable type inference failed */
        public j(av.n<? super CameraDevice> nVar, s sVar) {
            this.f33744a = nVar;
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
            if (this.f33744a.b()) {
                av.n<CameraDevice> nVar = this.f33744a;
                zt.n.Companion companion = zt.n.INSTANCE;
                nVar.resumeWith(zt.n.b(zt.o.a(new l0(error))));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            this.f33744a.resumeWith(zt.n.b(device));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {459}, m = "requestImageCapture-IoAF18A")
    public static final class k extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f33745t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f33747v;

        public k(eu.b<? super k> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33745t = obj;
            this.f33747v |= Integer.MIN_VALUE;
            Object objO0 = s.this.o0(this);
            return objO0 == fu.c.e() ? objO0 : zt.n.a(objO0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lzt/n;", "Ljava/io/File;", "<anonymous>", "(Lav/p0;)Lzt/n;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2", f = "Camera2Manager.kt", l = {471}, m = "invokeSuspend")
    public static final class l extends gu.m implements Function2<av.p0, eu.b<? super zt.n<? extends File>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33748t;

        public l(eu.b<? super l> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return s.this.new l(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super zt.n<? extends File>> bVar) {
            return ((l) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33748t;
            if (i10 == 0) {
                zt.o.b(obj);
                if (s.this.isImageCaptureRequested) {
                    zt.n.Companion companion = zt.n.INSTANCE;
                    return zt.n.a(zt.n.b(zt.o.a(new o0())));
                }
                s.this.imageCaptureResult.setValue(null);
                s.this.isImageCaptureRequested = true;
                dv.h hVarS = dv.j.s(s.this.imageCaptureResult);
                this.f33748t = 1;
                obj = dv.j.t(hVarS, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            Object value = ((zt.n) obj).getValue();
            s.this.isImageCaptureRequested = false;
            return zt.n.a(value);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"un/s$m", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/SurfaceHolder;", "holder", BuildConfig.FLAVOR, "surfaceDestroyed", "(Landroid/view/SurfaceHolder;)V", BuildConfig.FLAVOR, "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceCreated", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class m implements SurfaceHolder.Callback {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$2$surfaceCreated$1$1", f = "Camera2Manager.kt", l = {265}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f33751t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ s f33752u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s sVar, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f33752u = sVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f33752u, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f33751t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    s sVar = this.f33752u;
                    this.f33751t = 1;
                    if (s.s0(sVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$2$surfaceDestroyed$1", f = "Camera2Manager.kt", l = {243}, m = "invokeSuspend")
        public static final class b extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f33753t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ s f33754u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(s sVar, eu.b<? super b> bVar) {
                super(2, bVar);
                this.f33754u = sVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new b(this.f33754u, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f33753t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    s sVar = this.f33754u;
                    this.f33753t = 1;
                    if (sVar.X(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
        }

        public m() {
        }

        public static final void b(s sVar) {
            av.k.d(sVar.coroutineScope, null, null, new a(sVar, null), 3, null);
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
            previewView.post(new Runnable() { // from class: un.v
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
            av.k.d(s.this.coroutineScope, null, null, new b(s.this, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$3$1", f = "Camera2Manager.kt", l = {274}, m = "invokeSuspend")
    public static final class n extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33755t;

        public n(eu.b<? super n> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return s.this.new n(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((n) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33755t;
            if (i10 == 0) {
                zt.o.b(obj);
                s sVar = s.this;
                this.f33755t = 1;
                if (s.s0(sVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {218}, m = "start$initializeCameraAndSetState")
    public static final class o extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33757t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f33758u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f33759v;

        public o(eu.b<? super o> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33758u = obj;
            this.f33759v |= Integer.MIN_VALUE;
            return s.s0(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {385, HttpStatusCode.UNAUTHORIZED_401}, m = "startVideo-IoAF18A")
    public static final class p extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33760t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f33761u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33762v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f33764x;

        public p(eu.b<? super p> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33762v = obj;
            this.f33764x |= Integer.MIN_VALUE;
            Object objX0 = s.this.x0(this);
            return objX0 == fu.c.e() ? objX0 : zt.n.a(objX0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lzt/n;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Lzt/n;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$startVideo$2$startResult$1", f = "Camera2Manager.kt", l = {}, m = "invokeSuspend")
    public static final class q extends gu.m implements Function2<av.p0, eu.b<? super zt.n<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33765t;

        public q(eu.b<? super q> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return s.this.new q(bVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(av.p0 p0Var, eu.b<? super zt.n<Unit>> bVar) {
            return ((q) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f33765t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            return zt.n.a(s.this.imageReaderVideoRecorder.o());
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(av.p0 p0Var, eu.b<? super zt.n<? extends Unit>> bVar) {
            return invoke2(p0Var, (eu.b<? super zt.n<Unit>>) bVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {421, 449}, m = "stopVideo-IoAF18A")
    public static final class r extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f33767t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f33769v;

        public r(eu.b<? super r> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33767t = obj;
            this.f33769v |= Integer.MIN_VALUE;
            Object objZ0 = s.this.z0(this);
            return objZ0 == fu.c.e() ? objZ0 : zt.n.a(objZ0);
        }
    }

    /* JADX INFO: renamed from: un.s$s, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Lvn/f$e;", "<anonymous>", "(Lav/p0;)Lvn/f$e;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$stopVideo$recording$result$1", f = "Camera2Manager.kt", l = {HttpStatusCode.UNPROCESSABLE_ENTITY_422}, m = "invokeSuspend")
    public static final class C0687s extends gu.m implements Function2<av.p0, eu.b<? super vn.f.e>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33770t;

        public C0687s(eu.b<? super C0687s> bVar) {
            super(2, bVar);
        }

        public static final vn.f.e p(s sVar) {
            return sVar.imageReaderVideoRecorder.s();
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return s.this.new C0687s(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super vn.f.e> bVar) {
            return ((C0687s) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33770t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            final s sVar = s.this;
            Function0 function0 = new Function0() { // from class: un.w
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.C0687s.p(sVar);
                }
            };
            this.f33770t = 1;
            Object objC = a2.c(null, function0, this, 1, null);
            return objC == objE ? objE : objC;
        }
    }

    public s(@NotNull Context context, @NotNull h0 cameraChoice, @NotNull Camera2PreviewView previewView, @NotNull un.g analyzer, @NotNull zn.a videoCaptureMethod, @Nullable ks.a aVar, boolean z10, @NotNull yn.a cameraStatsManager, @NotNull er.c sdkFilesManager, @NotNull zq.a coroutineScopeFactory, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull dr.c externalEventLogger, boolean z11, boolean z12) throws CameraAccessException {
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
        av.p0 p0VarA = coroutineScopeFactory.a();
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
        boolean z13 = z10 && xq.g.f(context);
        this.recordAudio = z13;
        Object upper = cameraChoice.g().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
        this.mediaRecorderWrapper = new r0(context, cameraChoice, ((Number) upper).intValue(), iIntValue, z13);
        int width = cameraChoice.getSize().getWidth();
        int height = cameraChoice.getSize().getHeight();
        Object upper2 = cameraChoice.g().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper2, "getUpper(...)");
        this.imageReaderVideoRecorder = new vn.f(width, height, ((Number) upper2).intValue(), iIntValue, z13, sdkFilesManager);
        this.useImageReaderRecorder = z12;
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        handlerThread.start();
        this.cameraThread = handlerThread;
        this.cameraHandler = new Handler(handlerThread.getLooper());
        this.isAnalyzerEnabled = true;
        this.imageCaptureResult = dv.r0.a(null);
        dv.c0<d> c0VarA = dv.r0.a(d.a.f33721a);
        this._state = c0VarA;
        this.state = c0VarA;
        this.analysisSizeScaling = 1.0f;
        this.imageReader = h0();
        this.imageProcessingChannel = cv.j.a(1, cv.a.DROP_OLDEST, new Function1() { // from class: un.h
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return s.f0((Image) obj2);
            }
        });
        this.processImageHaltedCv = new ConditionVariable();
        av.k.d(p0VarA, null, null, new a(null), 3, null);
    }

    public static final String A0(Throwable th2) {
        return "stopVideo failed due to reason " + p001kotlin.jvm.internal.d0.b(th2.getClass()).f() + ": " + p001kotlin.text.c0.z1(zt.a.b(th2), 4000);
    }

    public static final String B0(Throwable th2) {
        return "stopVideo warning - audio failed to record due to " + p001kotlin.jvm.internal.d0.b(th2.getClass()).f() + ": " + p001kotlin.text.c0.z1(zt.a.b(th2), 4000);
    }

    public static /* synthetic */ Object W(s sVar, boolean z10, eu.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return sVar.V(z10, bVar);
    }

    public static final Unit f0(Image it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.close();
        return Unit.f21506a;
    }

    public static final void i0(s sVar, ImageReader imageReader) {
        ks.a aVar;
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        int rotation = sVar.cameraChoice.getRotation();
        if (sVar.videoCaptureMethod == zn.a.Stream && (aVar = sVar.webRtcManager) != null) {
            aVar.c(imageAcquireNextImage, rotation);
        }
        if (imageAcquireNextImage != null) {
            if (sVar.useImageReaderRecorder && sVar.recordingStarted) {
                sVar.imageReaderVideoRecorder.l(imageAcquireNextImage);
            }
            Object objV = sVar.imageProcessingChannel.v(imageAcquireNextImage);
            if (objV instanceof cv.k.c) {
                cv.k.e(objV);
                imageAcquireNextImage.close();
            }
        }
    }

    public static final String k0() {
        return "Unable to setup camera with 3 streams. Falling back to 2 streams instead.";
    }

    public static final String m0(boolean z10, p001kotlin.jvm.internal.a0 a0Var, String str, l0 l0Var) {
        boolean z11 = !z10 || a0Var.f21572a > 2;
        return "openCamera error for camera " + str + ": code=" + l0Var.getErrorCode() + " (" + e0.b(l0Var.getErrorCode()) + "), attempt=" + (a0Var.f21572a + 1) + ", retriable=" + z10 + ", exhaustedAllRetries=" + z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object s0(final s sVar, eu.b<? super Unit> bVar) {
        o oVar;
        if (bVar instanceof o) {
            oVar = (o) bVar;
            int i10 = oVar.f33759v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f33759v = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(bVar);
            }
        } else {
            oVar = new o(bVar);
        }
        Object obj = oVar.f33758u;
        Object objE = fu.c.e();
        int i11 = oVar.f33759v;
        try {
            if (i11 == 0) {
                zt.o.b(obj);
                oVar.f33757t = sVar;
                oVar.f33759v = 1;
                if (sVar.g0(oVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (s) oVar.f33757t;
                zt.o.b(obj);
            }
            TrackingEventsLogger.logDebugLogEvent$default(sVar.trackingEventsLogger, "camera", new Function0() { // from class: un.p
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.t0(this.f33666a);
                }
            }, false, 4, null);
            sVar._state.setValue(new d.Started(false));
        } catch (Exception e10) {
            TrackingEventsLogger.logDebugLogEvent$default(sVar.trackingEventsLogger, "camera", new Function0() { // from class: un.q
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.u0(this.f33667a, e10);
                }
            }, false, 4, null);
            sVar._state.setValue(new d.Error(new c.a("Unable to initialize Camera2 classes", e10)));
        }
        return Unit.f21506a;
    }

    public static final String t0(s sVar) {
        return "initializeCamera succeeded for choice " + sVar.cameraChoice;
    }

    public static final String u0(s sVar, Exception exc) {
        return "initializeCamera failed for choice " + sVar.cameraChoice + ": " + p001kotlin.text.c0.z1(zt.a.b(exc), 4000);
    }

    public static final String v0(s sVar, boolean z10) {
        return "Camera not started for choice " + sVar.cameraChoice + ": missing permission (audioPermissionMissing=" + z10 + ")";
    }

    public static final Unit w0(s sVar) {
        if (sVar.isPreviewSurfaceAvailable) {
            av.k.d(sVar.coroutineScope, null, null, sVar.new n(null), 3, null);
        }
        return Unit.f21506a;
    }

    public static final String y0(Throwable th2) {
        return "startVideo failed due to reason " + p001kotlin.jvm.internal.d0.b(th2.getClass()).f() + ": " + p001kotlin.text.c0.z1(zt.a.b(th2), 4000);
    }

    public final Object V(boolean z10, eu.b<? super g0> bVar) {
        return av.i.g(g1.c(), new e(z10, null), bVar);
    }

    public final Object X(eu.b<? super Unit> bVar) {
        Object objG = av.i.g(g1.a(), new f(null), bVar);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }

    public final void Y() {
        av.k.d(this.coroutineScope, null, null, new g(null), 3, null);
    }

    public final void Z(boolean enable) {
        g0 g0Var = this.session;
        if (g0Var != null) {
            g0Var.j(enable);
            zt.n.a(g0Var.m());
        }
    }

    public final void a0() {
        g0 g0Var = this.session;
        if (g0Var != null) {
            g0Var.k(this.cameraChoice.getSize().getWidth() / 2, this.cameraChoice.getSize().getHeight() / 2, new Size((int) (((double) this.cameraChoice.getSize().getWidth()) * 0.15d), (int) (((double) this.cameraChoice.getSize().getHeight()) * 0.15d)), 5000L);
            zt.n.a(g0Var.m());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b0, reason: from getter */
    public final h0 getCameraChoice() {
        return this.cameraChoice;
    }

    @NotNull
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final sn.v getCameraProperties() {
        return this.cameraProperties;
    }

    @NotNull
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final Camera2PreviewView getPreviewView() {
        return this.previewView;
    }

    @NotNull
    public final dv.p0<d> e0() {
        return this.state;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final Object g0(eu.b<? super Unit> bVar) {
        Object objG = av.i.g(g1.c(), new h(null), bVar);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }

    public final ImageReader h0() {
        ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (this.cameraChoice.getSize().getWidth() * this.analysisSizeScaling), (int) (this.cameraChoice.getSize().getHeight() * this.analysisSizeScaling), 35, 3);
        imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: un.k
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                s.i0(this.f33654a, imageReader);
            }
        }, this.cameraHandler);
        Intrinsics.checkNotNullExpressionValue(imageReaderNewInstance, "also(...)");
        return imageReaderNewInstance;
    }

    public final void j0() {
        TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: un.r
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.k0();
            }
        }, false, 4, null);
        this.externalEventLogger.b(kp.c.f21722a);
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
    
        if (av.z0.b(r12, r2) == r3) goto L44;
     */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0101 -> B:13:0x0044). Please report as a decompilation issue!!! */
    @SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l0(CameraManager cameraManager, String str, Handler handler, eu.b<? super CameraDevice> bVar) throws CameraAccessException {
        i iVar;
        String str2;
        Handler handler2;
        p001kotlin.jvm.internal.a0 a0Var;
        i iVar2;
        CameraManager cameraManager2;
        CameraManager cameraManager3;
        final String str3;
        final p001kotlin.jvm.internal.a0 a0Var2;
        final ?? r11;
        int i10;
        if (bVar instanceof i) {
            iVar = (i) bVar;
            int i11 = iVar.B;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.B = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(bVar);
            }
        } else {
            iVar = new i(bVar);
        }
        Object objY = iVar.f33743z;
        Object objE = fu.c.e();
        int i12 = iVar.B;
        if (i12 == 0) {
            zt.o.b(objY);
            str2 = str;
            handler2 = handler;
            a0Var = new p001kotlin.jvm.internal.a0();
            iVar2 = iVar;
            cameraManager2 = cameraManager;
            iVar2.f33737t = cameraManager2;
            iVar2.f33738u = str2;
            iVar2.f33739v = handler2;
            iVar2.f33740w = a0Var;
            iVar2.f33741x = null;
            iVar2.f33742y = 0;
            iVar2.B = 1;
            av.p pVar = new av.p(fu.b.c(iVar2), 1);
            pVar.G();
            cameraManager2.openCamera(str2, new j(pVar, this), handler2);
            objY = pVar.y();
            if (objY == fu.c.e()) {
                gu.h.c(iVar2);
            }
            if (objY != objE) {
                p001kotlin.jvm.internal.a0 a0Var3 = a0Var;
                cameraManager3 = cameraManager2;
                iVar = iVar2;
                str3 = str2;
                a0Var2 = a0Var3;
            }
            return objE;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var2 = (p001kotlin.jvm.internal.a0) iVar.f33740w;
            handler2 = (Handler) iVar.f33739v;
            str3 = (String) iVar.f33738u;
            cameraManager3 = (CameraManager) iVar.f33737t;
            zt.o.b(objY);
            String str4 = str3;
            iVar2 = iVar;
            cameraManager2 = cameraManager3;
            a0Var = a0Var2;
            str2 = str4;
            iVar2.f33737t = cameraManager2;
            iVar2.f33738u = str2;
            iVar2.f33739v = handler2;
            iVar2.f33740w = a0Var;
            iVar2.f33741x = null;
            iVar2.f33742y = 0;
            iVar2.B = 1;
            av.p pVar2 = new av.p(fu.b.c(iVar2), 1);
            pVar2.G();
            cameraManager2.openCamera(str2, new j(pVar2, this), handler2);
            objY = pVar2.y();
            if (objY == fu.c.e()) {
                gu.h.c(iVar2);
            }
            if (objY != objE) {
                p001kotlin.jvm.internal.a0 a0Var4 = a0Var;
                cameraManager3 = cameraManager2;
                iVar = iVar2;
                str3 = str2;
                a0Var2 = a0Var4;
            }
            return objE;
        }
        a0Var2 = (p001kotlin.jvm.internal.a0) iVar.f33740w;
        handler2 = (Handler) iVar.f33739v;
        str3 = (String) iVar.f33738u;
        cameraManager3 = (CameraManager) iVar.f33737t;
        try {
            zt.o.b(objY);
        } catch (l0 e10) {
            final l0 e11 = e10;
            int errorCode = e11.getErrorCode();
            if (errorCode != 1 || errorCode == 2) {
                r11 = 1;
            } else {
                r11 = 0;
            }
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: un.i
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.m0(r11, a0Var2, str3, e11);
                }
            }, false, 4, null);
            if (r11 != 0 || (i10 = a0Var2.f21572a) > 2) {
                throw new RuntimeException("Camera " + str3 + " error: (" + e11.getErrorCode() + ") " + e0.b(e11.getErrorCode()));
            }
            int i13 = i10 + 1;
            a0Var2.f21572a = i13;
            long j10 = ((long) i13) * CallingHandler.AVATAR_TIMEOUT_MS;
            iVar.f33737t = cameraManager3;
            iVar.f33738u = str3;
            iVar.f33739v = handler2;
            iVar.f33740w = a0Var2;
            iVar.f33741x = gu.l.a(e11);
            iVar.f33742y = r11;
            iVar.B = 2;
        }
        return (CameraDevice) objY;
    }

    public final void n0(Image image) throws Exception {
        try {
            try {
                if (Intrinsics.c(this._state.getValue(), d.b.f33722a)) {
                    this.processImageHaltedCv.open();
                    nu.a.a(image, null);
                    return;
                }
                if (!this.isAnalyzerEnabled && !this.isImageCaptureRequested) {
                    nu.a.a(image, null);
                    return;
                }
                if (this.isImageCaptureRequested) {
                    File fileP0 = p0(image);
                    if (fileP0 != null) {
                        this.imageCaptureResult.setValue(zt.n.a(zt.n.b(fileP0)));
                    }
                } else if (this.isAnalyzerEnabled) {
                    try {
                        this.analyzer.i(image, this.orientation);
                    } catch (Exception unused) {
                    }
                }
                Unit unit = Unit.f21506a;
                nu.a.a(image, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    nu.a.a(image, th2);
                    throw th3;
                }
            }
        } catch (IllegalArgumentException unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object o0(@NotNull eu.b<? super zt.n<? extends File>> bVar) {
        k kVar;
        if (bVar instanceof k) {
            kVar = (k) bVar;
            int i10 = kVar.f33747v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f33747v = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(bVar);
            }
        } else {
            kVar = new k(bVar);
        }
        Object objG = kVar.f33745t;
        Object objE = fu.c.e();
        int i11 = kVar.f33747v;
        if (i11 == 0) {
            zt.o.b(objG);
            n2 n2VarC = g1.c();
            l lVar = new l(null);
            kVar.f33747v = 1;
            objG = av.i.g(n2VarC, lVar, kVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(objG);
        }
        return ((zt.n) objG).getValue();
    }

    public final File p0(Image image) {
        Bitmap bitmapD = sn.o0.d(image, this.orientation, null, 2, null);
        if (bitmapD == null) {
            return null;
        }
        File fileE = this.sdkFilesManager.e("jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(fileE);
        try {
            bitmapD.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            lu.c.a(fileOutputStream, null);
            bitmapD.recycle();
            return fileE;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                lu.c.a(fileOutputStream, th2);
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
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: un.n
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.v0(this.f33663a, z10);
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
            this.mediaRecorderWrapper.o(new Function0() { // from class: un.o
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.w0(this.f33665a);
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
    public final Object x0(@NotNull eu.b<? super zt.n<Boolean>> bVar) {
        p pVar;
        s sVar;
        final Throwable thE;
        if (bVar instanceof p) {
            pVar = (p) bVar;
            int i10 = pVar.f33764x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.f33764x = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(bVar);
            }
        } else {
            pVar = new p(bVar);
        }
        Object objG = pVar.f33762v;
        Object objE = fu.c.e();
        int i11 = pVar.f33764x;
        try {
            if (i11 == 0) {
                zt.o.b(objG);
                if (this.recordingStarted) {
                    zt.n.Companion companion = zt.n.INSTANCE;
                    return zt.n.b(gu.b.a(false));
                }
                zt.n.Companion companion2 = zt.n.INSTANCE;
                if (this.useImageReaderRecorder) {
                    av.l0 l0VarA = g1.a();
                    q qVar = new q(null);
                    pVar.f33760t = this;
                    pVar.f33761u = 0;
                    pVar.f33764x = 1;
                    objG = av.i.g(l0VarA, qVar, pVar);
                    if (objG != objE) {
                        sVar = this;
                        thE = zt.n.e(((zt.n) objG).getValue());
                        if (thE != null) {
                            TrackingEventsLogger.logDebugLogEvent$default(sVar.trackingEventsLogger, "camera", new Function0() { // from class: un.j
                                @Override // p001kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return s.y0(thE);
                                }
                            }, false, 4, null);
                            return zt.n.b(zt.o.a(thE));
                        }
                    }
                } else {
                    r0 r0Var = this.mediaRecorderWrapper;
                    pVar.f33760t = this;
                    pVar.f33761u = 0;
                    pVar.f33764x = 2;
                    if (r0Var.p(pVar) != objE) {
                        sVar = this;
                    }
                }
                return objE;
            }
            if (i11 == 1) {
                sVar = (s) pVar.f33760t;
                zt.o.b(objG);
                thE = zt.n.e(((zt.n) objG).getValue());
                if (thE != null) {
                    TrackingEventsLogger.logDebugLogEvent$default(sVar.trackingEventsLogger, "camera", new Function0() { // from class: un.j
                        @Override // p001kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return s.y0(thE);
                        }
                    }, false, 4, null);
                    return zt.n.b(zt.o.a(thE));
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (s) pVar.f33760t;
                zt.o.b(objG);
            }
            sVar.recordingStarted = true;
            zt.n.Companion companion3 = zt.n.INSTANCE;
            return zt.n.b(gu.b.a(true));
        } catch (Throwable th2) {
            zt.n.Companion companion4 = zt.n.INSTANCE;
            return zt.n.b(zt.o.a(th2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r11 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        if (r11 == r1) goto L38;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z0(@NotNull eu.b<? super zt.n<? extends File>> bVar) {
        r rVar;
        final Throwable thA;
        final Throwable thC;
        if (bVar instanceof r) {
            rVar = (r) bVar;
            int i10 = rVar.f33769v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f33769v = i10 - Integer.MIN_VALUE;
            } else {
                rVar = new r(bVar);
            }
        } else {
            rVar = new r(bVar);
        }
        Object objQ = rVar.f33767t;
        Object objE = fu.c.e();
        int i11 = rVar.f33769v;
        File fileB = null;
        if (i11 == 0) {
            zt.o.b(objQ);
            if (!this.recordingStarted) {
                zt.n.Companion companion = zt.n.INSTANCE;
                return zt.n.b(zt.o.a(new t0()));
            }
            this.recordingStarted = false;
            if (this.useImageReaderRecorder) {
                av.l0 l0VarA = g1.a();
                C0687s c0687s = new C0687s(null);
                rVar.f33769v = 1;
                objQ = av.i.g(l0VarA, c0687s, rVar);
            } else {
                r0 r0Var = this.mediaRecorderWrapper;
                rVar.f33769v = 2;
                objQ = r0Var.q(rVar);
            }
            return objE;
        }
        if (i11 == 1) {
            zt.o.b(objQ);
            vn.f.e eVar = (vn.f.e) objQ;
            if (eVar != null && (thC = eVar.getVideoError()) != null) {
                TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: un.l
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return s.A0(thC);
                    }
                }, false, 4, null);
            }
            if (eVar != null && (thA = eVar.getAudioError()) != null) {
                TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: un.m
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return s.B0(thA);
                    }
                }, false, 4, null);
            }
            if (eVar != null) {
                fileB = eVar.getFile();
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(objQ);
            fileB = (File) objQ;
        }
        if (fileB != null) {
            return zt.n.b(fileB);
        }
        zt.n.Companion companion2 = zt.n.INSTANCE;
        return zt.n.b(zt.o.a(new RuntimeException("Recording failed.")));
    }
}
