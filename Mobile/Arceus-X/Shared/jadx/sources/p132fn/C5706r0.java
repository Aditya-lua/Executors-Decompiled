package p132fn;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC0494d;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetection;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.google.mlkit.vision.face.FaceLandmark;
import com.withpersona.sdk2.camera.ImageLightCondition;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import gn.C6147k;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kn.C7640c;
import kn.EnumC7638a;
import kn.EnumC7639b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7761a;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152go.C6157c0;
import p152go.C6159e;
import p152go.C6178x;
import p225jn.C7213d;
import p225jn.ViewfinderInfo;
import p229jt.C7342i;
import p229jt.C7345l;
import p229jt.InterfaceC7341h;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: fn.r0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u0001:\u0003TC,B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0013\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b'\u0010(J'\u0010,\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0014H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u00100J/\u00108\u001a\u0002072\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u00020 H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010?\u001a\u00020>2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b?\u0010@J+\u0010C\u001a\u0004\u0018\u00010>2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020:2\b\u0010B\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bC\u0010DJ\u001b\u0010F\u001a\u00020\t*\u00020 2\u0006\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020\t*\u00020 2\u0006\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bH\u0010GJ\u001b\u0010I\u001a\u00020\t*\u00020 2\u0006\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bI\u0010GJ\u001b\u0010J\u001a\u00020\t*\u00020 2\u0006\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bJ\u0010GJ#\u0010L\u001a\u00020\t*\u00020 2\u0006\u0010E\u001a\u00020 2\u0006\u0010K\u001a\u000207H\u0002¢\u0006\u0004\bL\u0010MJ\u001b\u0010O\u001a\u00020\t*\u00020N2\u0006\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bO\u0010PJ\u0013\u0010R\u001a\u00020 *\u00020QH\u0002¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010WR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010YR\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010YR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\\R\u0016\u0010`\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010ZR\u0014\u0010b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010ZR\u0016\u0010d\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010cR\u0014\u0010g\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010fR\u001b\u0010l\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bi\u0010k¨\u0006m"}, m31665d2 = {"Lfn/r0;", "", "Lgo/e;", "featureFlagManager", "<init>", "(Lgo/e;)V", "", "minFaceRatio", "maxFaceRatio", "", "analyzeLightConditions", "", "u", "(DDZ)V", "Lfn/r0$c;", "pose", "v", "(Lfn/r0$c;)V", "Landroid/media/Image;", "image", "", "rotationDegrees", "Lkn/c;", "d", "(Landroid/media/Image;I)Lkn/c;", "Landroidx/camera/core/d;", "e", "(Landroidx/camera/core/d;)Lkn/c;", "Lfn/z;", "imageToAnalyze", "f", "(Lfn/z;)Lkn/c;", "Landroid/graphics/Rect;", "rect", "previewRect", "w", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "viewfinderRect", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "k", "(Lfn/z;Landroid/graphics/Rect;)Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "x", "y", "angleInDegrees", "b", "(III)I", "degrees", "i", "(I)I", "h", "Ljava/nio/ByteBuffer;", "yPlaneBuffer", "imageWidth", "imageHeight", "region", "", "n", "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)F", "Lfn/r0$b;", Payload.TYPE, "Landroid/graphics/Bitmap;", "bitmap", "Lfn/p0;", "m", "(Lfn/r0$b;Landroid/graphics/Bitmap;)Lfn/p0;", "poseType", "cropRect", "c", "(Lfn/z;Lfn/r0$b;Landroid/graphics/Rect;)Lfn/p0;", "imageRect", "p", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z", "q", "r", "s", "faceAngleY", "t", "(Landroid/graphics/Rect;Landroid/graphics/Rect;F)Z", "Lcom/google/mlkit/vision/face/Face;", "o", "(Lcom/google/mlkit/vision/face/Face;Landroid/graphics/Rect;)Z", "Lcom/google/mlkit/vision/common/InputImage;", "j", "(Lcom/google/mlkit/vision/common/InputImage;)Landroid/graphics/Rect;", "a", "Lgo/e;", "Lgn/k;", "Lgn/k;", "lightConditionAnalyzer", "D", "Z", "Ljn/c;", "Ljn/c;", "viewfinderInfo", "g", "Lfn/r0$c;", "targetPose", "useOldFaceCenteredDetector", "relaxedSidePoseDistance", "Landroid/graphics/Rect;", "tempRect", "", "[B", "byteArr", "Lcom/google/mlkit/vision/face/FaceDetector;", "l", "Ljt/h;", "()Lcom/google/mlkit/vision/face/FaceDetector;", "faceDetector", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5706r0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C6159e featureFlagManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C6147k lightConditionAnalyzer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public double minFaceRatio;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public double maxFaceRatio;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean analyzeLightConditions;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public ViewfinderInfo viewfinderInfo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public c targetPose;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final boolean useOldFaceCenteredDetector;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final boolean relaxedSidePoseDistance;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public Rect tempRect;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final byte[] byteArr;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h faceDetector;

    /* JADX INFO: renamed from: fn.r0$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31665d2 = {"Lfn/r0$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum b {
        Center,
        Left,
        Right,
        Up,
        Down;


        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ InterfaceC10707a f21928g = C10708b.m40805a(m25875a());
    }

    /* JADX INFO: renamed from: fn.r0$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m31665d2 = {"Lfn/r0$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum c {
        Center,
        Left,
        Right,
        Up,
        Down,
        All,
        None;


        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ InterfaceC10707a f21937i = C10708b.m40805a(m25876a());
    }

    /* JADX INFO: renamed from: fn.r0$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21938a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f21938a = iArr;
        }
    }

    public C5706r0(@NotNull C6159e featureFlagManager) {
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        this.featureFlagManager = featureFlagManager;
        this.lightConditionAnalyzer = new C6147k();
        this.minFaceRatio = 0.35d;
        this.maxFaceRatio = 0.8d;
        this.targetPose = c.All;
        this.useOldFaceCenteredDetector = featureFlagManager.m27145a(C6157c0.f23526a);
        this.relaxedSidePoseDistance = featureFlagManager.m27145a(C6178x.f23561a);
        this.tempRect = new Rect();
        this.byteArr = new byte[32768];
        this.faceDetector = C7342i.m30456b(new Function0() { // from class: fn.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5706r0.m25853g();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final FaceDetector m25853g() {
        FaceDetector client = FaceDetection.getClient(new FaceDetectorOptions.Builder().setMinFaceSize(0.35f).setLandmarkMode(2).build());
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    /* JADX INFO: renamed from: b */
    public final int m25854b(int x10, int y10, int angleInDegrees) {
        int i10 = x10 - 1;
        int i11 = y10 - 1;
        return (((i11 * m25859h(angleInDegrees)) + (i10 * m25860i(angleInDegrees)) + 1) * 3) + ((m25859h(angleInDegrees) * i10) - (m25860i(angleInDegrees) * i11)) + 1;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC5702p0 m25855c(InterfaceC5719z imageToAnalyze, b poseType, Rect cropRect) {
        Bitmap bitmapMo25781f = cropRect != null ? imageToAnalyze.mo25781f(cropRect) : imageToAnalyze.mo25780e();
        if (bitmapMo25781f != null) {
            return m25864m(poseType, bitmapMo25781f);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final C7640c m25856d(@NotNull Image image, int rotationDegrees) {
        Intrinsics.checkNotNullParameter(image, "image");
        return m25858f(C5676c0.m25773e(image, rotationDegrees));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C7640c m25857e(@NotNull InterfaceC0494d image) {
        Intrinsics.checkNotNullParameter(image, "image");
        InterfaceC5719z interfaceC5719zM25774f = C5676c0.m25774f(image);
        return interfaceC5719zM25774f == null ? new C7640c(null, EnumC7639b.Other, 0, false, false, false, 0.0f, 0.0f, 0.0f, null, null, null) : m25858f(interfaceC5719zM25774f);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final C7640c m25858f(@NotNull InterfaceC5719z imageToAnalyze) {
        boolean zM25867p;
        EnumC7639b enumC7639b;
        EnumC7638a enumC7638a;
        AbstractC5702p0 abstractC5702p0M25855c;
        EnumC7639b enumC7639b2;
        EnumC7639b enumC7639b3;
        AbstractC5702p0 abstractC5702p0;
        EnumC7638a enumC7638a2;
        EnumC7638a enumC7638a3;
        EnumC7639b enumC7639b4;
        AbstractC5702p0 abstractC5702p0M25855c2;
        Intrinsics.checkNotNullParameter(imageToAnalyze, "imageToAnalyze");
        ViewfinderInfo viewfinderInfo = this.viewfinderInfo;
        Rect rectM30144a = viewfinderInfo != null ? C7213d.m30144a(viewfinderInfo, imageToAnalyze) : null;
        InputImage inputImageMo25782g = imageToAnalyze.mo25782g();
        Rect rectM25861j = m25861j(inputImageMo25782g);
        SelfieBrightnessInfo selfieBrightnessInfoM25862k = m25862k(imageToAnalyze, rectM30144a);
        Rect rectM30145b = rectM30144a != null ? C7213d.m30145b(rectM30144a, inputImageMo25782g.getRotationDegrees()) : null;
        Task<List<Face>> taskProcess = m25863l().process(inputImageMo25782g);
        Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
        ImageLightCondition imageLightConditionM27136b = this.analyzeLightConditions ? this.lightConditionAnalyzer.m27136b(imageToAnalyze, rectM30144a) : null;
        try {
            List<Face> result = taskProcess.getResult();
            if (result.isEmpty()) {
                return new C7640c(null, EnumC7639b.FaceNotFound, result.size(), false, false, false, 0.0f, 0.0f, 0.0f, selfieBrightnessInfoM25862k, null, imageLightConditionM27136b);
            }
            if (result.size() > 1) {
                return new C7640c(null, EnumC7639b.MultipleFaces, result.size(), false, false, false, 0.0f, 0.0f, 0.0f, selfieBrightnessInfoM25862k, null, imageLightConditionM27136b);
            }
            Intrinsics.checkNotNull(result);
            Face face = (Face) CollectionsKt.m31706d0(result);
            Rect boundingBox = face.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox, "getBoundingBox(...)");
            boolean zM25870s = m25870s(boundingBox, rectM30145b == null ? rectM25861j : rectM30145b);
            Rect boundingBox2 = face.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox2, "getBoundingBox(...)");
            boolean zM25871t = m25871t(boundingBox2, rectM30145b == null ? rectM25861j : rectM30145b, face.getHeadEulerAngleY());
            if (this.useOldFaceCenteredDetector) {
                Rect boundingBox3 = face.getBoundingBox();
                Intrinsics.checkNotNullExpressionValue(boundingBox3, "getBoundingBox(...)");
                zM25867p = m25868q(boundingBox3, rectM30145b == null ? rectM25861j : rectM30145b);
            } else {
                Rect boundingBox4 = face.getBoundingBox();
                Intrinsics.checkNotNullExpressionValue(boundingBox4, "getBoundingBox(...)");
                zM25867p = m25867p(boundingBox4, rectM30145b == null ? rectM25861j : rectM30145b);
            }
            boolean z10 = zM25867p;
            Rect boundingBox5 = face.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox5, "getBoundingBox(...)");
            if (rectM30145b == null) {
                rectM30145b = rectM25861j;
            }
            boolean zM25869r = m25869r(boundingBox5, rectM30145b);
            float headEulerAngleY = face.getHeadEulerAngleY();
            float headEulerAngleX = face.getHeadEulerAngleX();
            float headEulerAngleZ = face.getHeadEulerAngleZ();
            if (zM25870s) {
                enumC7639b = EnumC7639b.FaceTooClose;
            } else if (zM25871t) {
                enumC7639b = EnumC7639b.FaceTooFar;
            } else if (!z10) {
                enumC7639b = EnumC7639b.FaceNotCentered;
            } else {
                if (zM25869r) {
                    if (-10.0f >= headEulerAngleY || headEulerAngleY >= 10.0f) {
                        if (headEulerAngleY < -15.0f) {
                            enumC7638a = EnumC7638a.Right;
                            c cVar = this.targetPose;
                            if (cVar == c.Right || cVar == c.All) {
                                abstractC5702p0M25855c = m25855c(imageToAnalyze, b.Right, rectM30144a);
                                abstractC5702p0 = abstractC5702p0M25855c;
                                enumC7639b3 = null;
                            } else {
                                enumC7639b2 = EnumC7639b.IncorrectPose;
                                enumC7639b3 = enumC7639b2;
                                abstractC5702p0 = null;
                            }
                        } else if (15.0f < headEulerAngleY) {
                            enumC7638a = EnumC7638a.Left;
                            c cVar2 = this.targetPose;
                            if (cVar2 == c.Left || cVar2 == c.All) {
                                abstractC5702p0M25855c = m25855c(imageToAnalyze, b.Left, rectM30144a);
                                abstractC5702p0 = abstractC5702p0M25855c;
                                enumC7639b3 = null;
                            } else {
                                enumC7639b2 = EnumC7639b.IncorrectPose;
                                enumC7639b3 = enumC7639b2;
                                abstractC5702p0 = null;
                            }
                        } else {
                            enumC7639b = EnumC7639b.IncorrectPose;
                        }
                        enumC7638a2 = enumC7638a;
                    } else {
                        Intrinsics.checkNotNull(face);
                        if (m25866o(face, rectM25861j)) {
                            c cVar3 = this.targetPose;
                            if (cVar3 == c.Center || cVar3 == c.All) {
                                enumC7638a = EnumC7638a.Center;
                                abstractC5702p0M25855c = m25855c(imageToAnalyze, b.Center, rectM30144a);
                                abstractC5702p0 = abstractC5702p0M25855c;
                                enumC7639b3 = null;
                                enumC7638a2 = enumC7638a;
                            } else if (headEulerAngleX > 10.0f) {
                                enumC7638a3 = EnumC7638a.Up;
                                if (cVar3 == c.Up) {
                                    abstractC5702p0M25855c2 = m25855c(imageToAnalyze, b.Up, rectM30144a);
                                    abstractC5702p0 = abstractC5702p0M25855c2;
                                    enumC7639b3 = null;
                                    enumC7638a2 = enumC7638a3;
                                } else {
                                    enumC7639b4 = EnumC7639b.IncorrectPose;
                                    enumC7639b3 = enumC7639b4;
                                    abstractC5702p0 = null;
                                    enumC7638a2 = enumC7638a3;
                                }
                            } else if (headEulerAngleX < -5.0f) {
                                enumC7638a3 = EnumC7638a.Down;
                                if (cVar3 == c.Down) {
                                    abstractC5702p0M25855c2 = m25855c(imageToAnalyze, b.Down, rectM30144a);
                                    abstractC5702p0 = abstractC5702p0M25855c2;
                                    enumC7639b3 = null;
                                    enumC7638a2 = enumC7638a3;
                                } else {
                                    enumC7639b4 = EnumC7639b.IncorrectPose;
                                    enumC7639b3 = enumC7639b4;
                                    abstractC5702p0 = null;
                                    enumC7638a2 = enumC7638a3;
                                }
                            } else {
                                enumC7638a2 = EnumC7638a.Center;
                                enumC7639b3 = EnumC7639b.IncorrectPose;
                                abstractC5702p0 = null;
                            }
                        } else {
                            enumC7639b = EnumC7639b.FaceNotCentered;
                        }
                    }
                    return new C7640c(abstractC5702p0, enumC7639b3, result.size(), zM25870s, zM25871t, z10, headEulerAngleY, headEulerAngleX, headEulerAngleZ, selfieBrightnessInfoM25862k, enumC7638a2, imageLightConditionM27136b);
                }
                enumC7639b = EnumC7639b.IncompleteFace;
            }
            enumC7639b3 = enumC7639b;
            abstractC5702p0 = null;
            enumC7638a2 = null;
            return new C7640c(abstractC5702p0, enumC7639b3, result.size(), zM25870s, zM25871t, z10, headEulerAngleY, headEulerAngleX, headEulerAngleZ, selfieBrightnessInfoM25862k, enumC7638a2, imageLightConditionM27136b);
        } catch (ExecutionException unused) {
            return new C7640c(null, EnumC7639b.FaceDetectionUnsupported, 0, false, false, false, 0.0f, 0.0f, 0.0f, selfieBrightnessInfoM25862k, null, imageLightConditionM27136b);
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m25859h(int degrees) {
        return m25860i(degrees + 90);
    }

    /* JADX INFO: renamed from: i */
    public final int m25860i(int degrees) {
        int iAbs = Math.abs(degrees / 90) % 4;
        if (iAbs == 0) {
            return 0;
        }
        if (iAbs == 1) {
            return 1;
        }
        if (iAbs == 2) {
            return 0;
        }
        if (iAbs == 3) {
            return -1;
        }
        throw new IllegalStateException("unreachable");
    }

    /* JADX INFO: renamed from: j */
    public final Rect m25861j(InputImage inputImage) {
        return (inputImage.getRotationDegrees() == 90 || inputImage.getRotationDegrees() == 270) ? new Rect(0, 0, inputImage.getHeight(), inputImage.getWidth()) : new Rect(0, 0, inputImage.getWidth(), inputImage.getHeight());
    }

    /* JADX INFO: renamed from: k */
    public final SelfieBrightnessInfo m25862k(InterfaceC5719z image, Rect viewfinderRect) {
        Image.Plane plane;
        int width = image.getImage().getWidth();
        int height = image.getImage().getHeight();
        Image.Plane[] planes = image.getImage().getPlanes();
        if (width == 0 || height == 0 || planes == null || (plane = planes[0]) == null) {
            return null;
        }
        ByteBuffer buffer = plane.getBuffer();
        if (viewfinderRect == null) {
            viewfinderRect = new Rect(0, 0, width, height);
        }
        viewfinderRect.width();
        int iWidth = viewfinderRect.width() / 3;
        int iHeight = viewfinderRect.height() / 3;
        Rect rect = this.tempRect;
        int i10 = viewfinderRect.left;
        int i11 = viewfinderRect.top;
        rect.set(i10, i11, i10 + iWidth, i11 + iHeight);
        Float[] fArr = new Float[9];
        for (int i12 = 0; i12 < 9; i12++) {
            fArr[i12] = Float.valueOf(0.0f);
        }
        for (int i13 = 0; i13 < 3; i13++) {
            for (int i14 = 0; i14 < 3; i14++) {
                int iM25854b = m25854b(i14, i13, image.getRotationDegrees());
                Intrinsics.checkNotNull(buffer);
                fArr[iM25854b] = Float.valueOf(m25865n(buffer, width, height, this.tempRect));
                Rect rect2 = this.tempRect;
                rect2.left += iWidth;
                rect2.right += iWidth;
            }
            Rect rect3 = this.tempRect;
            rect3.left = viewfinderRect.left;
            rect3.right = viewfinderRect.left + iWidth;
            rect3.top += iHeight;
            rect3.bottom += iHeight;
        }
        buffer.rewind();
        return new SelfieBrightnessInfo(fArr);
    }

    /* JADX INFO: renamed from: l */
    public final FaceDetector m25863l() {
        return (FaceDetector) this.faceDetector.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC5702p0 m25864m(b type, Bitmap bitmap) {
        int i10 = d.f21938a[type.ordinal()];
        if (i10 == 1) {
            return new AbstractC5702p0.a(bitmap);
        }
        if (i10 == 2) {
            return new AbstractC5702p0.c(bitmap);
        }
        if (i10 == 3) {
            return new AbstractC5702p0.d(bitmap);
        }
        if (i10 == 4) {
            return new AbstractC5702p0.e(bitmap);
        }
        if (i10 == 5) {
            return new AbstractC5702p0.b(bitmap);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: n */
    public final float m25865n(ByteBuffer yPlaneBuffer, int imageWidth, int imageHeight, Rect region) {
        yPlaneBuffer.rewind();
        int iWidth = region.width();
        int iHeight = region.height() * iWidth;
        if (iWidth > 32768) {
            return 0.0f;
        }
        C7761a c7761aM32091p = C7764d.m32091p(C7764d.m32092q(region.top, region.bottom), 2);
        int first = c7761aM32091p.getFirst();
        int last = c7761aM32091p.getLast();
        int step = c7761aM32091p.getStep();
        long j10 = 0;
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                yPlaneBuffer.position((first * imageWidth) + region.left);
                yPlaneBuffer.get(this.byteArr, 0, iWidth);
                for (int i10 = 0; i10 < iWidth; i10++) {
                    j10 += (long) (this.byteArr[i10] & 255);
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        return ((j10 / iHeight) / 255.0f) * 2;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m25866o(Face face, Rect rect) {
        int iWidth = rect.width();
        int iHeight = rect.height();
        FaceLandmark landmark = face.getLandmark(6);
        if (landmark == null) {
            return false;
        }
        double d10 = iWidth / 2;
        double dMin = (((double) Math.min(iWidth, iHeight)) * 0.4d) / ((double) 2);
        double d11 = iHeight / 2;
        return new Rect((int) (d10 - dMin), (int) (d11 - dMin), (int) (d10 + dMin), (int) (d11 + dMin)).contains((int) landmark.getPosition().x, (int) landmark.getPosition().y);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m25867p(Rect rect, Rect rect2) {
        return ((double) Math.abs(rect2.centerX() - rect.centerX())) / ((double) rect2.width()) <= 0.3d;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m25868q(Rect rect, Rect rect2) {
        int iWidth = rect2.width();
        int iHeight = rect2.height();
        int i10 = iWidth / 2;
        int i11 = iHeight / 2;
        int iMin = Math.min(iWidth, iHeight) / 2;
        Rect rect3 = new Rect(0, 0, iWidth, iHeight);
        rect3.inset(25, 25);
        return rect3.contains(rect) && ((double) Math.abs(C7764d.m32078c(rect2.width() - rect.right, 1) - C7764d.m32078c(rect.left, 1))) / ((double) rect2.width()) <= 0.3d && rect.left > i10 - iMin && rect.right < i10 + iMin && rect.top > i11 - iMin && rect.bottom < i11 + iMin;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m25869r(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect2);
        rect3.inset(25, 25);
        return rect3.contains(rect);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m25870s(Rect rect, Rect rect2) {
        return ((double) Math.max(rect.width(), rect.height())) > ((double) Math.min(rect2.width(), rect2.height())) * this.maxFaceRatio;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m25871t(Rect rect, Rect rect2, float f10) {
        return ((double) Math.max(rect.width(), rect.height())) < ((double) Math.min(rect2.width(), rect2.height())) * (this.minFaceRatio - ((!this.relaxedSidePoseDistance || !((f10 > (-15.0f) ? 1 : (f10 == (-15.0f) ? 0 : -1)) < 0 || (f10 > 15.0f ? 1 : (f10 == 15.0f ? 0 : -1)) > 0)) ? 0.0d : 0.05d));
    }

    /* JADX INFO: renamed from: u */
    public final void m25872u(double minFaceRatio, double maxFaceRatio, boolean analyzeLightConditions) {
        this.minFaceRatio = minFaceRatio;
        this.maxFaceRatio = maxFaceRatio;
        this.analyzeLightConditions = analyzeLightConditions;
    }

    /* JADX INFO: renamed from: v */
    public final void m25873v(@NotNull c pose) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        this.targetPose = pose;
    }

    /* JADX INFO: renamed from: w */
    public final void m25874w(@NotNull Rect rect, @NotNull Rect previewRect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        this.viewfinderInfo = new ViewfinderInfo(rect, previewRect);
    }
}
