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
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent$MiscInquiryEvent$VideoCaptureFallback;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import in.C6838f;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7725a0;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7776c0;
import mn.EnumC8598a;
import mu.C8675j;
import mu.C8676k;
import mu.EnumC8666a;
import mu.InterfaceC8672g;
import nu.C9579j;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import nu.InterfaceC9592p0;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.C5676c0;
import p132fn.C5686h0;
import p226jq.C7259g;
import p229jt.C7328a;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.AbstractC7900n2;
import p256ku.C7835a2;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.C7905p;
import p256ku.C7910q0;
import p256ku.InterfaceC7897n;
import p256ku.InterfaceC7906p0;
import p261l2.C7975b;
import p276ln.InterfaceC8169a;
import p279lq.C8235a;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p363pq.C10309c;
import p391qq.C10700c;
import p476ur.InterfaceC11932a;
import p477ut.C11958c;
import p559xt.C12915a;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10346h;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: hn.s */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ¼\u00012\u00020\u0001:\u0003IMQBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0!H\u0086@¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020$0!H\u0086@¢\u0006\u0004\b%\u0010#J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020$0!H\u0086@¢\u0006\u0004\b&\u0010#J\r\u0010'\u001a\u00020\u001e¢\u0006\u0004\b'\u0010 J\u0015\u0010)\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u000e¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u000e¢\u0006\u0004\b,\u0010*J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u001eH\u0083@¢\u0006\u0004\b.\u0010#J\u000f\u0010/\u001a\u00020\u001eH\u0002¢\u0006\u0004\b/\u0010 J\u001c\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u00100\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b4\u0010#J,\u0010<\u001a\u00020;2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\n\b\u0002\u0010:\u001a\u0004\u0018\u000109H\u0083@¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u0004\u0018\u00010$*\u00020AH\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010,R\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010,R\u0017\u0010i\u001a\u00020d8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010r\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010|\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010,R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010,R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u0090\u0001\u001a\u0002098\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0093\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0095\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010,R\u0018\u0010\u0097\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010,R\u0018\u0010\u0099\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010,R\u0018\u0010\u009b\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010,R&\u0010\u009f\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010!0\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001f\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010\u009c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u009e\u0001R#\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010£\u00018\u0006¢\u0006\u000f\n\u0005\by\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010©\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010,R\u001c\u0010\u00ad\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001a\u0010°\u0001\u001a\u00030®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010\u009a\u0001R\u0019\u0010³\u0001\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R \u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020A0´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001a\u0010»\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001¨\u0006½\u0001"}, m31665d2 = {"Lhn/s;", "", "Landroid/content/Context;", "context", "Lhn/h0;", "cameraChoice", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lhn/g;", "analyzer", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "", "isAudioRequired", "Lln/a;", "cameraStatsManager", "Lqq/c;", "sdkFilesManager", "Llq/a;", "coroutineScopeFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lpq/c;", "externalEventLogger", "isImageReaderRecorderEnabled", "forceImageReaderRecorder", "<init>", "(Landroid/content/Context;Lhn/h0;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lhn/g;Lmn/a;Lur/a;ZLln/a;Lqq/c;Llq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lpq/c;ZZ)V", "", "r0", "()V", "Ljt/n;", "x0", "(Lnt/b;)Ljava/lang/Object;", "Ljava/io/File;", "z0", "o0", "Y", "analyzerEnabled", "q0", "(Z)V", "enable", "Z", "a0", "g0", "j0", "retryOnError", "Lhn/g0;", "V", "(ZLnt/b;)Ljava/lang/Object;", "X", "Landroid/hardware/camera2/CameraManager;", "manager", "", "cameraId", "Landroid/os/Handler;", "handler", "Landroid/hardware/camera2/CameraDevice;", "l0", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Lnt/b;)Ljava/lang/Object;", "Landroid/media/ImageReader;", "h0", "()Landroid/media/ImageReader;", "Landroid/media/Image;", "image", "n0", "(Landroid/media/Image;)V", "p0", "(Landroid/media/Image;)Ljava/io/File;", "a", "Landroid/content/Context;", "b", "Lhn/h0;", "b0", "()Lhn/h0;", "c", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "d0", "()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "d", "Lhn/g;", "e", "Lmn/a;", "f", "Lur/a;", "g", "h", "Lln/a;", "i", "Lqq/c;", "j", "Llq/a;", "k", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "l", "Lpq/c;", "m", "n", "Lcom/withpersona/sdk2/camera/CameraProperties;", "o", "Lcom/withpersona/sdk2/camera/CameraProperties;", "c0", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lku/p0;", "p", "Lku/p0;", "coroutineScope", "q", "Ljava/lang/String;", "r", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroid/hardware/camera2/CameraCharacteristics;", "s", "Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", "", "t", "I", "orientation", "u", "recordAudio", "Lhn/r0;", "v", "Lhn/r0;", "mediaRecorderWrapper", "Lin/f;", "w", "Lin/f;", "imageReaderVideoRecorder", "x", "useImageReaderRecorder", "y", "Landroid/hardware/camera2/CameraDevice;", "camera", "Landroid/os/HandlerThread;", "z", "Landroid/os/HandlerThread;", "cameraThread", "A", "Landroid/os/Handler;", "cameraHandler", "B", "Lhn/g0;", "session", "C", "recordingStarted", "D", "isAnalyzerEnabled", "E", "isImageCaptureRequested", "F", "isPreviewSurfaceAvailable", "Lnu/c0;", "G", "Lnu/c0;", "imageCaptureResult", "Lhn/s$d;", "H", "_state", "Lnu/p0;", "Lnu/p0;", "e0", "()Lnu/p0;", "state", "J", "isPreviewStarted", "Landroid/view/SurfaceHolder$Callback;", "K", "Landroid/view/SurfaceHolder$Callback;", "surfaceHolderCallback", "", "L", "analysisSizeScaling", "M", "Landroid/media/ImageReader;", "imageReader", "Lmu/g;", "N", "Lmu/g;", "imageProcessingChannel", "Landroid/os/ConditionVariable;", "O", "Landroid/os/ConditionVariable;", "processImageHaltedCv", "P", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6466s {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Handler cameraHandler;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public C6443g0 session;

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
    public final InterfaceC9566c0<C7347n<File>> imageCaptureResult;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<d> _state;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9592p0<d> state;

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
    public InterfaceC8672g<Image> imageProcessingChannel;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    public ConditionVariable processImageHaltedCv;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C6445h0 cameraChoice;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Camera2PreviewView previewView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6442g analyzer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final EnumC8598a videoCaptureMethod;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC11932a webRtcManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean isAudioRequired;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8169a cameraStatsManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C10700c sdkFilesManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C8235a coroutineScopeFactory;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final C10309c externalEventLogger;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final boolean isImageReaderRecorderEnabled;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final boolean forceImageReaderRecorder;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final CameraProperties cameraProperties;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final String cameraId;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final CameraManager cameraManager;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final CameraCharacteristics characteristics;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int orientation;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final boolean recordAudio;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final C6465r0 mediaRecorderWrapper;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final C6838f imageReaderVideoRecorder;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public boolean useImageReaderRecorder;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public CameraDevice camera;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final HandlerThread cameraThread;

    /* JADX INFO: renamed from: hn.s$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$1", m39664f = "Camera2Manager.kt", m39665l = {183}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24568t;

        /* JADX INFO: renamed from: hn.s$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14176a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C6466s f24570a;

            public C14176a(C6466s c6466s) {
                this.f24570a = c6466s;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Image image, InterfaceC9557b<? super Unit> interfaceC9557b) throws Exception {
                this.f24570a.m28207n0(image);
                return Unit.f29331a;
            }
        }

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C6466s.this.new a(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24568t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h interfaceC9575hM37771H = C9579j.m37771H(C6466s.this.imageProcessingChannel);
                C14176a c14176a = new C14176a(C6466s.this);
                this.f24568t = 1;
                if (interfaceC9575hM37771H.collect(c14176a, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: hn.s$c */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\n\u000bB\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m31665d2 = {"Lhn/s$c;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "", "message", "", "cause", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "b", "a", "Lhn/s$c$a;", "Lhn/s$c$b;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class c extends Exception {

        /* JADX INFO: renamed from: hn.s$c$a */
        @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lhn/s$c$a;", "Lhn/s$c;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a extends c {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull String message, @NotNull Throwable cause) {
                super(message, cause, null);
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(cause, "cause");
            }
        }

        /* JADX INFO: renamed from: hn.s$c$b */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lhn/s$c$b;", "Lhn/s$c;", "<init>", "()V", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b extends c {
            public b() {
                super(null);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.Throwable) A[MD:(java.lang.String, java.lang.Throwable):void (m)] (LINE:1) call: hn.s.c.<init>(java.lang.String, java.lang.Throwable):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ c(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th2);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: hn.s.c.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }

        public c(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* JADX INFO: renamed from: hn.s$d */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m31665d2 = {"Lhn/s$d;", "", "a", "d", "b", "c", "Lhn/s$d$a;", "Lhn/s$d$b;", "Lhn/s$d$c;", "Lhn/s$d$d;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface d {

        /* JADX INFO: renamed from: hn.s$d$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lhn/s$d$a;", "Lhn/s$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a implements d {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f24571a = new a();

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

        /* JADX INFO: renamed from: hn.s$d$b */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lhn/s$d$b;", "Lhn/s$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class b implements d {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f24572a = new b();

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
        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lhn/s$d$c;", "Lhn/s$d;", "Lhn/s$c;", "error", "<init>", "(Lhn/s$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhn/s$c;", "()Lhn/s$c;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Error implements d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
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
                return (other instanceof Error) && Intrinsics.m31980c(this.error, ((Error) other).error);
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
        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lhn/s$d$d;", "Lhn/s$d;", "", "firstFrameReceived", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Started implements d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
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

    /* JADX INFO: renamed from: hn.s$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lhn/g0;", "<anonymous>", "(Lku/p0;)Lhn/g0;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$createCameraCaptureSession$2", m39664f = "Camera2Manager.kt", m39665l = {317, 335, 372}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C6443g0>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f24575t;

        /* JADX INFO: renamed from: u */
        public Object f24576u;

        /* JADX INFO: renamed from: v */
        public Object f24577v;

        /* JADX INFO: renamed from: w */
        public int f24578w;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ boolean f24580y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f24580y = z10;
        }

        /* JADX INFO: renamed from: s */
        public static final Unit m28219s(C6466s c6466s) {
            Object value = c6466s._state.getValue();
            d.Started started = value instanceof d.Started ? (d.Started) value : null;
            if (started != null && !started.getFirstFrameReceived()) {
                c6466s._state.setValue(new d.Started(true));
            }
            return Unit.f29331a;
        }

        /* JADX INFO: renamed from: t */
        public static final String m28220t(C6466s c6466s, Exception exc) {
            return "createCaptureSession failed on first attempt for choice " + c6466s.getCameraChoice() + " (videoCaptureMethod=" + c6466s.videoCaptureMethod + "): " + exc + ". Retrying.";
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C6466s.this.new e(this.f24580y, interfaceC9557b);
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
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            C6466s c6466s;
            CameraDevice cameraDevice;
            List<? extends Surface> listM31897p;
            e eVar;
            final Exception exc;
            List<? extends Surface> list;
            CameraDevice cameraDevice2;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24578w;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                if (C6466s.this.camera == null) {
                    c6466s = C6466s.this;
                    CameraManager cameraManager = c6466s.cameraManager;
                    String id2 = C6466s.this.getCameraChoice().getId();
                    Handler handler = C6466s.this.cameraHandler;
                    this.f24575t = c6466s;
                    this.f24578w = 1;
                    obj = c6466s.m28206l0(cameraManager, id2, handler, this);
                    if (obj == objM38805e) {
                    }
                } else {
                    cameraDevice = C6466s.this.camera;
                    if (cameraDevice != null) {
                        throw new IllegalStateException("Unable to open camera");
                    }
                    listM31897p = C7699p.m31897p(C6466s.this.getPreviewView().getHolder().getSurface(), C6466s.this.imageReader.getSurface());
                    if (C6466s.this.videoCaptureMethod == EnumC8598a.Upload && !C6466s.this.useImageReaderRecorder) {
                        C6466s.this.mediaRecorderWrapper.m28129m();
                        listM31897p.add(C6466s.this.mediaRecorderWrapper.m28125i());
                    }
                    try {
                        C6443g0.Companion aVar = C6443g0.INSTANCE;
                        C6445h0 cameraChoice = C6466s.this.getCameraChoice();
                        CameraCharacteristics cameraCharacteristics = C6466s.this.characteristics;
                        Handler handler2 = C6466s.this.cameraHandler;
                        final C6466s c6466s2 = C6466s.this;
                        Function0<Unit> function0 = new Function0() { // from class: hn.t
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C6466s.e.m28219s(c6466s2);
                            }
                        };
                        C8235a c8235a = C6466s.this.coroutineScopeFactory;
                        this.f24575t = C10350l.m39676a(cameraDevice);
                        this.f24576u = C10350l.m39676a(listM31897p);
                        this.f24578w = 2;
                        eVar = this;
                        try {
                            obj = aVar.m28096a(cameraChoice, cameraCharacteristics, listM31897p, cameraDevice, handler2, function0, c8235a, eVar);
                            if (obj != objM38805e) {
                                list = listM31897p;
                                cameraDevice2 = cameraDevice;
                                C6466s.this.session = (C6443g0) obj;
                                return (C6443g0) obj;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            exc = e;
                            list = listM31897p;
                            cameraDevice2 = cameraDevice;
                            TrackingEventsLogger trackingEventsLogger = C6466s.this.trackingEventsLogger;
                            final C6466s c6466s3 = C6466s.this;
                            TrackingEventsLogger.logDebugLogEvent$default(trackingEventsLogger, "camera", new Function0() { // from class: hn.u
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C6466s.e.m28220t(c6466s3, exc);
                                }
                            }, false, 4, null);
                            if (!eVar.f24580y) {
                                throw exc;
                            }
                            if (C6466s.this.videoCaptureMethod == EnumC8598a.Upload) {
                                C6466s.this.useImageReaderRecorder = true;
                            }
                            C6466s.this.analysisSizeScaling = 1.0f;
                            C6466s c6466s4 = C6466s.this;
                            c6466s4.imageReader = c6466s4.m28204h0();
                            C6466s c6466s5 = C6466s.this;
                            eVar.f24575t = C10350l.m39676a(cameraDevice2);
                            eVar.f24576u = C10350l.m39676a(list);
                            eVar.f24577v = C10350l.m39676a(exc);
                            eVar.f24578w = 3;
                            obj = c6466s5.m28194V(false, this);
                        }
                    } catch (Exception e11) {
                        e = e11;
                        eVar = this;
                    }
                }
                return objM38805e;
            }
            if (i10 == 1) {
                c6466s = (C6466s) this.f24575t;
                C7348o.m30470b(obj);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return (C6443g0) obj;
                }
                list = (List) this.f24576u;
                cameraDevice2 = (CameraDevice) this.f24575t;
                try {
                    C7348o.m30470b(obj);
                    eVar = this;
                    try {
                        C6466s.this.session = (C6443g0) obj;
                        return (C6443g0) obj;
                    } catch (Exception e12) {
                        exc = e12;
                        TrackingEventsLogger trackingEventsLogger2 = C6466s.this.trackingEventsLogger;
                        final C6466s c6466s6 = C6466s.this;
                        TrackingEventsLogger.logDebugLogEvent$default(trackingEventsLogger2, "camera", new Function0() { // from class: hn.u
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C6466s.e.m28220t(c6466s6, exc);
                            }
                        }, false, 4, null);
                        if (!eVar.f24580y) {
                            throw exc;
                        }
                        if (C6466s.this.videoCaptureMethod == EnumC8598a.Upload && C6466s.this.isImageReaderRecorderEnabled) {
                            C6466s.this.useImageReaderRecorder = true;
                        }
                        C6466s.this.analysisSizeScaling = 1.0f;
                        C6466s c6466s7 = C6466s.this;
                        c6466s7.imageReader = c6466s7.m28204h0();
                        C6466s c6466s8 = C6466s.this;
                        eVar.f24575t = C10350l.m39676a(cameraDevice2);
                        eVar.f24576u = C10350l.m39676a(list);
                        eVar.f24577v = C10350l.m39676a(exc);
                        eVar.f24578w = 3;
                        obj = c6466s8.m28194V(false, this);
                    }
                } catch (Exception e13) {
                    exc = e13;
                    eVar = this;
                    TrackingEventsLogger trackingEventsLogger3 = C6466s.this.trackingEventsLogger;
                    final C6466s c6466s9 = C6466s.this;
                    TrackingEventsLogger.logDebugLogEvent$default(trackingEventsLogger3, "camera", new Function0() { // from class: hn.u
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C6466s.e.m28220t(c6466s9, exc);
                        }
                    }, false, 4, null);
                    if (!eVar.f24580y) {
                        throw exc;
                    }
                    if (C6466s.this.videoCaptureMethod == EnumC8598a.Upload) {
                        C6466s.this.useImageReaderRecorder = true;
                    }
                    C6466s.this.analysisSizeScaling = 1.0f;
                    C6466s c6466s10 = C6466s.this;
                    c6466s10.imageReader = c6466s10.m28204h0();
                    C6466s c6466s11 = C6466s.this;
                    eVar.f24575t = C10350l.m39676a(cameraDevice2);
                    eVar.f24576u = C10350l.m39676a(list);
                    eVar.f24577v = C10350l.m39676a(exc);
                    eVar.f24578w = 3;
                    obj = c6466s11.m28194V(false, this);
                }
            }
            c6466s.camera = (CameraDevice) obj;
            cameraDevice = C6466s.this.camera;
            if (cameraDevice != null) {
                throw new IllegalStateException("Unable to open camera");
            }
            listM31897p = C7699p.m31897p(C6466s.this.getPreviewView().getHolder().getSurface(), C6466s.this.imageReader.getSurface());
            if (C6466s.this.videoCaptureMethod == EnumC8598a.Upload) {
                C6466s.this.mediaRecorderWrapper.m28129m();
                listM31897p.add(C6466s.this.mediaRecorderWrapper.m28125i());
            }
            C6443g0.Companion aVar2 = C6443g0.INSTANCE;
            C6445h0 cameraChoice2 = C6466s.this.getCameraChoice();
            CameraCharacteristics cameraCharacteristics2 = C6466s.this.characteristics;
            Handler handler3 = C6466s.this.cameraHandler;
            final C6466s c6466s12 = C6466s.this;
            Function0<Unit> function1 = new Function0() { // from class: hn.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C6466s.e.m28219s(c6466s12);
                }
            };
            C8235a c8235a2 = C6466s.this.coroutineScopeFactory;
            this.f24575t = C10350l.m39676a(cameraDevice);
            this.f24576u = C10350l.m39676a(listM31897p);
            this.f24578w = 2;
            eVar = this;
            obj = aVar2.m28096a(cameraChoice2, cameraCharacteristics2, listM31897p, cameraDevice, handler3, function1, c8235a2, eVar);
            if (obj != objM38805e) {
                list = listM31897p;
                cameraDevice2 = cameraDevice;
                C6466s.this.session = (C6443g0) obj;
                return (C6443g0) obj;
            }
            return objM38805e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C6443g0> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: hn.s$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$destroy$2", m39664f = "Camera2Manager.kt", m39665l = {499}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24581t;

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C6466s.this.new f(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24581t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                Object value = C6466s.this._state.getValue();
                d.b bVar = d.b.f24572a;
                if (Intrinsics.m31980c(value, bVar)) {
                    return Unit.f29331a;
                }
                C6466s.this._state.setValue(bVar);
                C6466s.this.getPreviewView().getHolder().removeCallback(C6466s.this.surfaceHolderCallback);
                C6466s.this.processImageHaltedCv.block(2000L);
                C6465r0 c6465r0 = C6466s.this.mediaRecorderWrapper;
                this.f24581t = 1;
                if (c6465r0.m28124h(this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            C6466s.this.imageReaderVideoRecorder.m29254i();
            C6466s.this.imageReader.close();
            C6443g0 c6443g0 = C6466s.this.session;
            if (c6443g0 != null) {
                c6443g0.m28088f();
            }
            C6466s.this.session = null;
            CameraDevice cameraDevice = C6466s.this.camera;
            if (cameraDevice != null) {
                cameraDevice.close();
            }
            C6466s.this.camera = null;
            C6466s.this.cameraStatsManager.mo33443c();
            C7910q0.m32890f(C6466s.this.coroutineScope, null, 1, null);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: hn.s$g */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$destroyAsync$1", m39664f = "Camera2Manager.kt", m39665l = {481}, m39666m = "invokeSuspend")
    public static final class g extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24583t;

        public g(InterfaceC9557b<? super g> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C6466s.this.new g(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24583t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C6466s c6466s = C6466s.this;
                this.f24583t = 1;
                if (c6466s.m28195X(this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((g) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: hn.s$h */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$initializeCamera$2", m39664f = "Camera2Manager.kt", m39665l = {293}, m39666m = "invokeSuspend")
    public static final class h extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24585t;

        public h(InterfaceC9557b<? super h> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C6466s.this.new h(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24585t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C6466s c6466s = C6466s.this;
                this.f24585t = 1;
                obj = C6466s.m28157W(c6466s, false, this, 1, null);
                if (obj == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            C6443g0 c6443g0 = (C6443g0) obj;
            if (c6443g0 != null && C6466s.this.useImageReaderRecorder) {
                C6466s.this.m28205j0();
            }
            if (c6443g0 != null) {
                C7347n.m30459a(c6443g0.m28095m());
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((h) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: hn.s$i */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", m39664f = "Camera2Manager.kt", m39665l = {760, 583}, m39666m = "openCamera")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class i extends AbstractC10342d {

        /* JADX INFO: renamed from: B */
        public int f24588B;

        /* JADX INFO: renamed from: t */
        public Object f24589t;

        /* JADX INFO: renamed from: u */
        public Object f24590u;

        /* JADX INFO: renamed from: v */
        public Object f24591v;

        /* JADX INFO: renamed from: w */
        public Object f24592w;

        /* JADX INFO: renamed from: x */
        public Object f24593x;

        /* JADX INFO: renamed from: y */
        public int f24594y;

        /* JADX INFO: renamed from: z */
        public /* synthetic */ Object f24595z;

        public i(InterfaceC9557b<? super i> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24595z = obj;
            this.f24588B |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C6466s.this.m28206l0(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: hn.s$j */
    @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"hn/s$j", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "Landroid/hardware/camera2/CameraDevice;", "device", "", "onOpened", "(Landroid/hardware/camera2/CameraDevice;)V", "onDisconnected", "", "error", "onError", "(Landroid/hardware/camera2/CameraDevice;I)V", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class j extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7897n<CameraDevice> f24596a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C6466s f24597b;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.n<? super android.hardware.camera2.CameraDevice> */
        /* JADX WARN: Multi-variable type inference failed */
        public j(InterfaceC7897n<? super CameraDevice> interfaceC7897n, C6466s c6466s) {
            this.f24596a = interfaceC7897n;
            this.f24597b = c6466s;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            this.f24597b.camera = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice device, int error) {
            Intrinsics.checkNotNullParameter(device, "device");
            try {
                device.close();
            } catch (Exception unused) {
            }
            if (this.f24596a.mo32811b()) {
                InterfaceC7897n<CameraDevice> interfaceC7897n = this.f24596a;
                C7347n.Companion companion = C7347n.INSTANCE;
                interfaceC7897n.resumeWith(C7347n.m30460b(C7348o.m30469a(new C6453l0(error))));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            this.f24596a.resumeWith(C7347n.m30460b(device));
        }
    }

    /* JADX INFO: renamed from: hn.s$k */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", m39664f = "Camera2Manager.kt", m39665l = {459}, m39666m = "requestImageCapture-IoAF18A")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class k extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f24598t;

        /* JADX INFO: renamed from: v */
        public int f24600v;

        public k(InterfaceC9557b<? super k> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24598t = obj;
            this.f24600v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM28208o0 = C6466s.this.m28208o0(this);
            return objM28208o0 == C10047c.m38805e() ? objM28208o0 : C7347n.m30459a(objM28208o0);
        }
    }

    /* JADX INFO: renamed from: hn.s$l */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Ljt/n;", "Ljava/io/File;", "<anonymous>", "(Lku/p0;)Ljt/n;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2", m39664f = "Camera2Manager.kt", m39665l = {471}, m39666m = "invokeSuspend")
    public static final class l extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C7347n<? extends File>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24601t;

        public l(InterfaceC9557b<? super l> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C6466s.this.new l(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24601t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                if (C6466s.this.isImageCaptureRequested) {
                    C7347n.Companion companion = C7347n.INSTANCE;
                    return C7347n.m30459a(C7347n.m30460b(C7348o.m30469a(new C6459o0())));
                }
                C6466s.this.imageCaptureResult.setValue(null);
                C6466s.this.isImageCaptureRequested = true;
                InterfaceC9575h interfaceC9575hM37802s = C9579j.m37802s(C6466s.this.imageCaptureResult);
                this.f24601t = 1;
                obj = C9579j.m37804u(interfaceC9575hM37802s, this);
                if (obj == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            Object value = ((C7347n) obj).getValue();
            C6466s.this.isImageCaptureRequested = false;
            return C7347n.m30459a(value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<? extends File>> interfaceC9557b) {
            return ((l) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: hn.s$m */
    @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006¨\u0006\u000e"}, m31665d2 = {"hn/s$m", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/SurfaceHolder;", "holder", "", "surfaceDestroyed", "(Landroid/view/SurfaceHolder;)V", "", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceCreated", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class m implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: hn.s$m$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$2$surfaceCreated$1$1", m39664f = "Camera2Manager.kt", m39665l = {265}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f24604t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C6466s f24605u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C6466s c6466s, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f24605u = c6466s;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f24605u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f24604t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C6466s c6466s = this.f24605u;
                    this.f24604t = 1;
                    if (C6466s.m28181s0(c6466s, this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: hn.s$m$b */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$2$surfaceDestroyed$1", m39664f = "Camera2Manager.kt", m39665l = {243}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f24606t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C6466s f24607u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C6466s c6466s, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f24607u = c6466s;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new b(this.f24607u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f24606t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C6466s c6466s = this.f24607u;
                    this.f24606t = 1;
                    if (c6466s.m28195X(this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public m() {
        }

        /* JADX INFO: renamed from: b */
        public static final void m28222b(C6466s c6466s) {
            C7882k.m32780d(c6466s.coroutineScope, null, null, new a(c6466s, null), 3, null);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            C6466s.this.isPreviewSurfaceAvailable = true;
            C6466s.this.getPreviewView().m16211b(C6466s.this.getCameraChoice().getSize().getWidth(), C6466s.this.getCameraChoice().getSize().getHeight(), C6466s.this.orientation);
            Camera2PreviewView previewView = C6466s.this.getPreviewView();
            final C6466s c6466s = C6466s.this;
            previewView.post(new Runnable() { // from class: hn.v
                @Override // java.lang.Runnable
                public final void run() {
                    C6466s.m.m28222b(c6466s);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            C6466s.this.isPreviewSurfaceAvailable = false;
            C7882k.m32780d(C6466s.this.coroutineScope, null, null, new b(C6466s.this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: hn.s$n */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$3$1", m39664f = "Camera2Manager.kt", m39665l = {274}, m39666m = "invokeSuspend")
    public static final class n extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24608t;

        public n(InterfaceC9557b<? super n> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C6466s.this.new n(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24608t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C6466s c6466s = C6466s.this;
                this.f24608t = 1;
                if (C6466s.m28181s0(c6466s, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((n) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: hn.s$o */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", m39664f = "Camera2Manager.kt", m39665l = {218}, m39666m = "start$initializeCameraAndSetState")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class o extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f24610t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f24611u;

        /* JADX INFO: renamed from: v */
        public int f24612v;

        public o(InterfaceC9557b<? super o> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24611u = obj;
            this.f24612v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C6466s.m28181s0(null, this);
        }
    }

    /* JADX INFO: renamed from: hn.s$p */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", m39664f = "Camera2Manager.kt", m39665l = {385, HttpStatusCode.UNAUTHORIZED_401}, m39666m = "startVideo-IoAF18A")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class p extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f24613t;

        /* JADX INFO: renamed from: u */
        public int f24614u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f24615v;

        /* JADX INFO: renamed from: x */
        public int f24617x;

        public p(InterfaceC9557b<? super p> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24615v = obj;
            this.f24617x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM28212x0 = C6466s.this.m28212x0(this);
            return objM28212x0 == C10047c.m38805e() ? objM28212x0 : C7347n.m30459a(objM28212x0);
        }
    }

    /* JADX INFO: renamed from: hn.s$q */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Ljt/n;", "", "<anonymous>", "(Lku/p0;)Ljt/n;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$startVideo$2$startResult$1", m39664f = "Camera2Manager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class q extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C7347n<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24618t;

        public q(InterfaceC9557b<? super q> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C6466s.this.new q(interfaceC9557b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<? extends Unit>> interfaceC9557b) {
            return invoke2(interfaceC7906p0, (InterfaceC9557b<? super C7347n<Unit>>) interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f24618t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return C7347n.m30459a(C6466s.this.imageReaderVideoRecorder.m29260o());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<Unit>> interfaceC9557b) {
            return ((q) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: hn.s$r */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", m39664f = "Camera2Manager.kt", m39665l = {HttpStatusCodesKt.HTTP_MISDIRECTED_REQUEST, 449}, m39666m = "stopVideo-IoAF18A")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class r extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f24620t;

        /* JADX INFO: renamed from: v */
        public int f24622v;

        public r(InterfaceC9557b<? super r> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24620t = obj;
            this.f24622v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM28213z0 = C6466s.this.m28213z0(this);
            return objM28213z0 == C10047c.m38805e() ? objM28213z0 : C7347n.m30459a(objM28213z0);
        }
    }

    /* JADX INFO: renamed from: hn.s$s */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lin/f$e;", "<anonymous>", "(Lku/p0;)Lin/f$e;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$stopVideo$recording$result$1", m39664f = "Camera2Manager.kt", m39665l = {HttpStatusCode.UNPROCESSABLE_ENTITY_422}, m39666m = "invokeSuspend")
    public static final class s extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C6838f.e>, Object> {

        /* JADX INFO: renamed from: t */
        public int f24623t;

        public s(InterfaceC9557b<? super s> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        /* JADX INFO: renamed from: r */
        public static final C6838f.e m28224r(C6466s c6466s) {
            return c6466s.imageReaderVideoRecorder.m29261s();
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C6466s.this.new s(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24623t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            final C6466s c6466s = C6466s.this;
            Function0 function0 = new Function0() { // from class: hn.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C6466s.s.m28224r(c6466s);
                }
            };
            this.f24623t = 1;
            Object objM32563c = C7835a2.m32563c(null, function0, this, 1, null);
            return objM32563c == objM38805e ? objM38805e : objM32563c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C6838f.e> interfaceC9557b) {
            return ((s) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C6466s(@NotNull Context context, @NotNull C6445h0 cameraChoice, @NotNull Camera2PreviewView previewView, @NotNull InterfaceC6442g analyzer, @NotNull EnumC8598a videoCaptureMethod, @Nullable InterfaceC11932a interfaceC11932a, boolean z10, @NotNull InterfaceC8169a cameraStatsManager, @NotNull C10700c sdkFilesManager, @NotNull C8235a coroutineScopeFactory, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull C10309c externalEventLogger, boolean z11, boolean z12) throws CameraAccessException {
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
        this.webRtcManager = interfaceC11932a;
        this.isAudioRequired = z10;
        this.cameraStatsManager = cameraStatsManager;
        this.sdkFilesManager = sdkFilesManager;
        this.coroutineScopeFactory = coroutineScopeFactory;
        this.trackingEventsLogger = trackingEventsLogger;
        this.externalEventLogger = externalEventLogger;
        this.isImageReaderRecorderEnabled = z11;
        this.forceImageReaderRecorder = z12;
        this.cameraProperties = cameraChoice.getCameraProperties();
        InterfaceC7906p0 interfaceC7906p0M33597a = coroutineScopeFactory.m33597a();
        this.coroutineScope = interfaceC7906p0M33597a;
        String id2 = cameraChoice.getId();
        this.cameraId = id2;
        Object systemService = context.getSystemService("camera");
        Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
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
        boolean z13 = z10 && C7259g.m30272f(context);
        this.recordAudio = z13;
        Object upper = cameraChoice.m28103g().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
        this.mediaRecorderWrapper = new C6465r0(context, cameraChoice, ((Number) upper).intValue(), iIntValue, z13);
        int width = cameraChoice.getSize().getWidth();
        int height = cameraChoice.getSize().getHeight();
        Object upper2 = cameraChoice.m28103g().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper2, "getUpper(...)");
        this.imageReaderVideoRecorder = new C6838f(width, height, ((Number) upper2).intValue(), iIntValue, z13, sdkFilesManager);
        this.useImageReaderRecorder = z12;
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        handlerThread.start();
        this.cameraThread = handlerThread;
        this.cameraHandler = new Handler(handlerThread.getLooper());
        this.isAnalyzerEnabled = true;
        this.imageCaptureResult = C9596r0.m37859a(null);
        InterfaceC9566c0<d> interfaceC9566c0M37859a = C9596r0.m37859a(d.a.f24571a);
        this._state = interfaceC9566c0M37859a;
        this.state = interfaceC9566c0M37859a;
        this.analysisSizeScaling = 1.0f;
        this.imageReader = m28204h0();
        this.imageProcessingChannel = C8675j.m34926a(1, EnumC8666a.DROP_OLDEST, new Function1() { // from class: hn.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C6466s.m28164f0((Image) obj2);
            }
        });
        this.processImageHaltedCv = new ConditionVariable();
        C7882k.m32780d(interfaceC7906p0M33597a, null, null, new a(null), 3, null);
    }

    /* JADX INFO: renamed from: A0 */
    public static final String m28135A0(Throwable th2) {
        return "stopVideo failed due to reason " + C7731d0.m32002b(th2.getClass()).mo28426f() + ": " + C7776c0.m32209B1(C7328a.m30430b(th2), 4000);
    }

    /* JADX INFO: renamed from: B0 */
    public static final String m28137B0(Throwable th2) {
        return "stopVideo warning - audio failed to record due to " + C7731d0.m32002b(th2.getClass()).mo28426f() + ": " + C7776c0.m32209B1(C7328a.m30430b(th2), 4000);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ Object m28157W(C6466s c6466s, boolean z10, InterfaceC9557b interfaceC9557b, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return c6466s.m28194V(z10, interfaceC9557b);
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m28164f0(Image it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.close();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m28168i0(C6466s c6466s, ImageReader imageReader) {
        InterfaceC11932a interfaceC11932a;
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        int rotation = c6466s.cameraChoice.getRotation();
        if (c6466s.videoCaptureMethod == EnumC8598a.Stream && (interfaceC11932a = c6466s.webRtcManager) != null) {
            interfaceC11932a.m44536b(imageAcquireNextImage, rotation);
        }
        if (imageAcquireNextImage != null) {
            if (c6466s.useImageReaderRecorder && c6466s.recordingStarted) {
                c6466s.imageReaderVideoRecorder.m29257l(imageAcquireNextImage);
            }
            Object objMo34870w = c6466s.imageProcessingChannel.mo34870w(imageAcquireNextImage);
            if (objMo34870w instanceof C8676k.c) {
                C8676k.m34932e(objMo34870w);
                imageAcquireNextImage.close();
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static final String m28171k0() {
        return "Unable to setup camera with 3 streams. Falling back to 2 streams instead.";
    }

    /* JADX INFO: renamed from: m0 */
    public static final String m28174m0(boolean z10, C7725a0 c7725a0, String str, C6453l0 c6453l0) {
        boolean z11 = !z10 || c7725a0.f29421a > 2;
        return "openCamera error for camera " + str + ": code=" + c6453l0.getErrorCode() + " (" + C6439e0.m28076b(c6453l0.getErrorCode()) + "), attempt=" + (c7725a0.f29421a + 1) + ", retriable=" + z10 + ", exhaustedAllRetries=" + z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s0 */
    public static final Object m28181s0(final C6466s c6466s, InterfaceC9557b<? super Unit> interfaceC9557b) {
        o oVar;
        if (interfaceC9557b instanceof o) {
            oVar = (o) interfaceC9557b;
            int i10 = oVar.f24612v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                oVar.f24612v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                oVar = new o(interfaceC9557b);
            }
        } else {
            oVar = new o(interfaceC9557b);
        }
        Object obj = oVar.f24611u;
        Object objM38805e = C10047c.m38805e();
        int i11 = oVar.f24612v;
        try {
            if (i11 == 0) {
                C7348o.m30470b(obj);
                oVar.f24610t = c6466s;
                oVar.f24612v = 1;
                if (c6466s.m28203g0(oVar) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c6466s = (C6466s) oVar.f24610t;
                C7348o.m30470b(obj);
            }
            TrackingEventsLogger.logDebugLogEvent$default(c6466s.trackingEventsLogger, "camera", new Function0() { // from class: hn.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C6466s.m28183t0(this.f24497a);
                }
            }, false, 4, null);
            c6466s._state.setValue(new d.Started(false));
        } catch (Exception e10) {
            TrackingEventsLogger.logDebugLogEvent$default(c6466s.trackingEventsLogger, "camera", new Function0() { // from class: hn.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C6466s.m28185u0(this.f24498a, e10);
                }
            }, false, 4, null);
            c6466s._state.setValue(new d.Error(new c.a("Unable to initialize Camera2 classes", e10)));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t0 */
    public static final String m28183t0(C6466s c6466s) {
        return "initializeCamera succeeded for choice " + c6466s.cameraChoice;
    }

    /* JADX INFO: renamed from: u0 */
    public static final String m28185u0(C6466s c6466s, Exception exc) {
        return "initializeCamera failed for choice " + c6466s.cameraChoice + ": " + C7776c0.m32209B1(C7328a.m30430b(exc), 4000);
    }

    /* JADX INFO: renamed from: v0 */
    public static final String m28187v0(C6466s c6466s, boolean z10) {
        return "Camera not started for choice " + c6466s.cameraChoice + ": missing permission (audioPermissionMissing=" + z10 + ")";
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m28189w0(C6466s c6466s) {
        if (c6466s.isPreviewSurfaceAvailable) {
            C7882k.m32780d(c6466s.coroutineScope, null, null, c6466s.new n(null), 3, null);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y0 */
    public static final String m28192y0(Throwable th2) {
        return "startVideo failed due to reason " + C7731d0.m32002b(th2.getClass()).mo28426f() + ": " + C7776c0.m32209B1(C7328a.m30430b(th2), 4000);
    }

    /* JADX INFO: renamed from: V */
    public final Object m28194V(boolean z10, InterfaceC9557b<? super C6443g0> interfaceC9557b) {
        return C7872i.m32684g(C7864g1.m32645c(), new e(z10, null), interfaceC9557b);
    }

    /* JADX INFO: renamed from: X */
    public final Object m28195X(InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32684g = C7872i.m32684g(C7864g1.m32643a(), new f(null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y */
    public final void m28196Y() {
        C7882k.m32780d(this.coroutineScope, null, null, new g(null), 3, null);
    }

    /* JADX INFO: renamed from: Z */
    public final void m28197Z(boolean enable) {
        C6443g0 c6443g0 = this.session;
        if (c6443g0 != null) {
            c6443g0.m28092j(enable);
            C7347n.m30459a(c6443g0.m28095m());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m28198a0() {
        C6443g0 c6443g0 = this.session;
        if (c6443g0 != null) {
            c6443g0.m28093k(this.cameraChoice.getSize().getWidth() / 2, this.cameraChoice.getSize().getHeight() / 2, new Size((int) (((double) this.cameraChoice.getSize().getWidth()) * 0.15d), (int) (((double) this.cameraChoice.getSize().getHeight()) * 0.15d)), 5000L);
            C7347n.m30459a(c6443g0.m28095m());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b0, reason: from getter */
    public final C6445h0 getCameraChoice() {
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
    /* JADX INFO: renamed from: e0 */
    public final InterfaceC9592p0<d> m28202e0() {
        return this.state;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: g0 */
    public final Object m28203g0(InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32684g = C7872i.m32684g(C7864g1.m32645c(), new h(null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }

    /* JADX INFO: renamed from: h0 */
    public final ImageReader m28204h0() {
        ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (this.cameraChoice.getSize().getWidth() * this.analysisSizeScaling), (int) (this.cameraChoice.getSize().getHeight() * this.analysisSizeScaling), 35, 3);
        imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: hn.k
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                C6466s.m28168i0(this.f24481a, imageReader);
            }
        }, this.cameraHandler);
        Intrinsics.checkNotNullExpressionValue(imageReaderNewInstance, "also(...)");
        return imageReaderNewInstance;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m28205j0() {
        TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6466s.m28171k0();
            }
        }, false, 4, null);
        this.externalEventLogger.m39606b(InquiryEvent$MiscInquiryEvent$VideoCaptureFallback.f14296a);
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
    
        if (p256ku.C7946z0.m32938b(((long) r12) * 2000, r2) == r3) goto L44;
     */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0101 -> B:13:0x0044). Please report as a decompilation issue!!! */
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m28206l0(CameraManager cameraManager, String str, Handler handler, InterfaceC9557b<? super CameraDevice> interfaceC9557b) throws CameraAccessException {
        i iVar;
        String str2;
        Handler handler2;
        C7725a0 c7725a0;
        i iVar2;
        CameraManager cameraManager2;
        CameraManager cameraManager3;
        final String str3;
        final C7725a0 c7725a1;
        final ?? r11;
        int i10;
        if (interfaceC9557b instanceof i) {
            iVar = (i) interfaceC9557b;
            int i11 = iVar.f24588B;
            if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                iVar.f24588B = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                iVar = new i(interfaceC9557b);
            }
        } else {
            iVar = new i(interfaceC9557b);
        }
        Object objM32857A = iVar.f24595z;
        Object objM38805e = C10047c.m38805e();
        int i12 = iVar.f24588B;
        if (i12 == 0) {
            C7348o.m30470b(objM32857A);
            str2 = str;
            handler2 = handler;
            c7725a0 = new C7725a0();
            iVar2 = iVar;
            cameraManager2 = cameraManager;
            iVar2.f24589t = cameraManager2;
            iVar2.f24590u = str2;
            iVar2.f24591v = handler2;
            iVar2.f24592w = c7725a0;
            iVar2.f24593x = null;
            iVar2.f24594y = 0;
            iVar2.f24588B = 1;
            C7905p c7905p = new C7905p(C10046b.m38803c(iVar2), 1);
            c7905p.m32860H();
            cameraManager2.openCamera(str2, new j(c7905p, this), handler2);
            objM32857A = c7905p.m32857A();
            if (objM32857A == C10047c.m38805e()) {
                C10346h.m39673c(iVar2);
            }
            if (objM32857A != objM38805e) {
                C7725a0 c7725a2 = c7725a0;
                cameraManager3 = cameraManager2;
                iVar = iVar2;
                str3 = str2;
                c7725a1 = c7725a2;
            }
            return objM38805e;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7725a1 = (C7725a0) iVar.f24592w;
            handler2 = (Handler) iVar.f24591v;
            str3 = (String) iVar.f24590u;
            cameraManager3 = (CameraManager) iVar.f24589t;
            C7348o.m30470b(objM32857A);
            String str4 = str3;
            iVar2 = iVar;
            cameraManager2 = cameraManager3;
            c7725a0 = c7725a1;
            str2 = str4;
            iVar2.f24589t = cameraManager2;
            iVar2.f24590u = str2;
            iVar2.f24591v = handler2;
            iVar2.f24592w = c7725a0;
            iVar2.f24593x = null;
            iVar2.f24594y = 0;
            iVar2.f24588B = 1;
            C7905p c7905p2 = new C7905p(C10046b.m38803c(iVar2), 1);
            c7905p2.m32860H();
            cameraManager2.openCamera(str2, new j(c7905p2, this), handler2);
            objM32857A = c7905p2.m32857A();
            if (objM32857A == C10047c.m38805e()) {
                C10346h.m39673c(iVar2);
            }
            if (objM32857A != objM38805e) {
                C7725a0 c7725a3 = c7725a0;
                cameraManager3 = cameraManager2;
                iVar = iVar2;
                str3 = str2;
                c7725a1 = c7725a3;
            }
            return objM38805e;
        }
        c7725a1 = (C7725a0) iVar.f24592w;
        handler2 = (Handler) iVar.f24591v;
        str3 = (String) iVar.f24590u;
        cameraManager3 = (CameraManager) iVar.f24589t;
        try {
            C7348o.m30470b(objM32857A);
        } catch (C6453l0 e10) {
            final C6453l0 e11 = e10;
            int errorCode = e11.getErrorCode();
            if (errorCode != 1 || errorCode == 2) {
                r11 = 1;
            } else {
                r11 = 0;
            }
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C6466s.m28174m0(r11, c7725a1, str3, e11);
                }
            }, false, 4, null);
            if (r11 != 0 || (i10 = c7725a1.f29421a) > 2) {
                throw new RuntimeException("Camera " + str3 + " error: (" + e11.getErrorCode() + ") " + C6439e0.m28076b(e11.getErrorCode()));
            }
            int i13 = i10 + 1;
            c7725a1.f29421a = i13;
            iVar.f24589t = cameraManager3;
            iVar.f24590u = str3;
            iVar.f24591v = handler2;
            iVar.f24592w = c7725a1;
            iVar.f24593x = C10350l.m39676a(e11);
            iVar.f24594y = r11;
            iVar.f24588B = 2;
        }
        return (CameraDevice) objM32857A;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m28207n0(Image image) throws Exception {
        try {
            try {
                if (Intrinsics.m31980c(this._state.getValue(), d.b.f24572a)) {
                    this.processImageHaltedCv.open();
                    C12915a.m47941a(image, null);
                    return;
                }
                if (!this.isAnalyzerEnabled && !this.isImageCaptureRequested) {
                    C12915a.m47941a(image, null);
                    return;
                }
                if (this.isImageCaptureRequested) {
                    File fileM28209p0 = m28209p0(image);
                    if (fileM28209p0 != null) {
                        this.imageCaptureResult.setValue(C7347n.m30459a(C7347n.m30460b(fileM28209p0)));
                    }
                } else if (this.isAnalyzerEnabled) {
                    try {
                        this.analyzer.mo25836h(image, this.orientation);
                    } catch (Exception unused) {
                    }
                }
                Unit unit = Unit.f29331a;
                C12915a.m47941a(image, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C12915a.m47941a(image, th2);
                    throw th3;
                }
            }
        } catch (IllegalArgumentException unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: o0 */
    public final Object m28208o0(@NotNull InterfaceC9557b<? super C7347n<? extends File>> interfaceC9557b) {
        k kVar;
        if (interfaceC9557b instanceof k) {
            kVar = (k) interfaceC9557b;
            int i10 = kVar.f24600v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                kVar.f24600v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                kVar = new k(interfaceC9557b);
            }
        } else {
            kVar = new k(interfaceC9557b);
        }
        Object objM32684g = kVar.f24598t;
        Object objM38805e = C10047c.m38805e();
        int i11 = kVar.f24600v;
        if (i11 == 0) {
            C7348o.m30470b(objM32684g);
            AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
            l lVar = new l(null);
            kVar.f24600v = 1;
            objM32684g = C7872i.m32684g(abstractC7900n2M32645c, lVar, kVar);
            if (objM32684g == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM32684g);
        }
        return ((C7347n) objM32684g).getValue();
    }

    /* JADX INFO: renamed from: p0 */
    public final File m28209p0(Image image) {
        Bitmap bitmapM25772d = C5676c0.m25772d(image, this.orientation, null, 2, null);
        if (bitmapM25772d == null) {
            return null;
        }
        File fileM40782e = this.sdkFilesManager.m40782e("jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(fileM40782e);
        try {
            bitmapM25772d.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            C11958c.m44629a(fileOutputStream, null);
            bitmapM25772d.recycle();
            return fileM40782e;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C11958c.m44629a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m28210q0(boolean analyzerEnabled) {
        this.isAnalyzerEnabled = analyzerEnabled;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m28211r0() {
        final boolean z10 = this.isAudioRequired && C7975b.m33003a(this.context, "android.permission.RECORD_AUDIO") != 0;
        if (C7975b.m33003a(this.context, "android.permission.CAMERA") != 0 || z10) {
            TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C6466s.m28187v0(this.f24492a, z10);
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
            this.mediaRecorderWrapper.m28131o(new Function0() { // from class: hn.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C6466s.m28189w0(this.f24496a);
                }
            });
            this.previewView.m16210a();
            this.previewView.getHolder().addCallback(this.surfaceHolderCallback);
            this.cameraStatsManager.mo33444d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:40:0x00aa, B:20:0x0041, B:32:0x0076, B:34:0x0082, B:26:0x0058, B:28:0x005e, B:36:0x009a), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: x0 */
    public final Object m28212x0(@NotNull InterfaceC9557b<? super C7347n<Boolean>> interfaceC9557b) {
        p pVar;
        C6466s c6466s;
        final Throwable thM30463e;
        if (interfaceC9557b instanceof p) {
            pVar = (p) interfaceC9557b;
            int i10 = pVar.f24617x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                pVar.f24617x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                pVar = new p(interfaceC9557b);
            }
        } else {
            pVar = new p(interfaceC9557b);
        }
        Object objM32684g = pVar.f24615v;
        Object objM38805e = C10047c.m38805e();
        int i11 = pVar.f24617x;
        try {
            if (i11 == 0) {
                C7348o.m30470b(objM32684g);
                if (this.recordingStarted) {
                    C7347n.Companion companion = C7347n.INSTANCE;
                    return C7347n.m30460b(C10340b.m39658a(false));
                }
                C7347n.Companion companion2 = C7347n.INSTANCE;
                if (this.useImageReaderRecorder) {
                    AbstractC7888l0 abstractC7888l0M32643a = C7864g1.m32643a();
                    q qVar = new q(null);
                    pVar.f24613t = this;
                    pVar.f24614u = 0;
                    pVar.f24617x = 1;
                    objM32684g = C7872i.m32684g(abstractC7888l0M32643a, qVar, pVar);
                    if (objM32684g != objM38805e) {
                        c6466s = this;
                        thM30463e = C7347n.m30463e(((C7347n) objM32684g).getValue());
                        if (thM30463e != null) {
                            TrackingEventsLogger.logDebugLogEvent$default(c6466s.trackingEventsLogger, "camera", new Function0() { // from class: hn.j
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C6466s.m28192y0(thM30463e);
                                }
                            }, false, 4, null);
                            return C7347n.m30460b(C7348o.m30469a(thM30463e));
                        }
                    }
                } else {
                    C6465r0 c6465r0 = this.mediaRecorderWrapper;
                    pVar.f24613t = this;
                    pVar.f24614u = 0;
                    pVar.f24617x = 2;
                    if (c6465r0.m28132p(pVar) != objM38805e) {
                        c6466s = this;
                    }
                }
                return objM38805e;
            }
            if (i11 == 1) {
                c6466s = (C6466s) pVar.f24613t;
                C7348o.m30470b(objM32684g);
                thM30463e = C7347n.m30463e(((C7347n) objM32684g).getValue());
                if (thM30463e != null) {
                    TrackingEventsLogger.logDebugLogEvent$default(c6466s.trackingEventsLogger, "camera", new Function0() { // from class: hn.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C6466s.m28192y0(thM30463e);
                        }
                    }, false, 4, null);
                    return C7347n.m30460b(C7348o.m30469a(thM30463e));
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c6466s = (C6466s) pVar.f24613t;
                C7348o.m30470b(objM32684g);
            }
            c6466s.recordingStarted = true;
            C7347n.Companion companion3 = C7347n.INSTANCE;
            return C7347n.m30460b(C10340b.m39658a(true));
        } catch (Throwable th2) {
            C7347n.Companion companion4 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(th2));
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
    /* JADX INFO: renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m28213z0(@NotNull InterfaceC9557b<? super C7347n<? extends File>> interfaceC9557b) {
        r rVar;
        final Throwable thM29296a;
        final Throwable thM29298c;
        if (interfaceC9557b instanceof r) {
            rVar = (r) interfaceC9557b;
            int i10 = rVar.f24622v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                rVar.f24622v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                rVar = new r(interfaceC9557b);
            }
        } else {
            rVar = new r(interfaceC9557b);
        }
        Object objM28133q = rVar.f24620t;
        Object objM38805e = C10047c.m38805e();
        int i11 = rVar.f24622v;
        File fileM29297b = null;
        if (i11 == 0) {
            C7348o.m30470b(objM28133q);
            if (!this.recordingStarted) {
                C7347n.Companion companion = C7347n.INSTANCE;
                return C7347n.m30460b(C7348o.m30469a(new C5686h0()));
            }
            this.recordingStarted = false;
            if (this.useImageReaderRecorder) {
                AbstractC7888l0 abstractC7888l0M32643a = C7864g1.m32643a();
                s sVar = new s(null);
                rVar.f24622v = 1;
                objM28133q = C7872i.m32684g(abstractC7888l0M32643a, sVar, rVar);
            } else {
                C6465r0 c6465r0 = this.mediaRecorderWrapper;
                rVar.f24622v = 2;
                objM28133q = c6465r0.m28133q(rVar);
            }
            return objM38805e;
        }
        if (i11 == 1) {
            C7348o.m30470b(objM28133q);
            C6838f.e eVar = (C6838f.e) objM28133q;
            if (eVar != null && (thM29298c = eVar.getVideoError()) != null) {
                TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C6466s.m28135A0(thM29298c);
                    }
                }, false, 4, null);
            }
            if (eVar != null && (thM29296a = eVar.getAudioError()) != null) {
                TrackingEventsLogger.logDebugLogEvent$default(this.trackingEventsLogger, "camera", new Function0() { // from class: hn.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C6466s.m28137B0(thM29296a);
                    }
                }, false, 4, null);
            }
            if (eVar != null) {
                fileM29297b = eVar.getFile();
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM28133q);
            fileM29297b = (File) objM28133q;
        }
        if (fileM29297b != null) {
            return C7347n.m30460b(fileM29297b);
        }
        C7347n.Companion companion2 = C7347n.INSTANCE;
        return C7347n.m30460b(C7348o.m30469a(new RuntimeException("Recording failed.")));
    }
}
