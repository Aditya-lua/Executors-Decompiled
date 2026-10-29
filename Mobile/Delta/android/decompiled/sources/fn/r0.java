package fn;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
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
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.ExecutionException;
import jn.ViewfinderInfo;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u0001:\u0003TC,B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0013\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b'\u0010(J'\u0010,\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0014H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u00100J/\u00108\u001a\u0002072\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u00020 H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010?\u001a\u00020>2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b?\u0010@J+\u0010C\u001a\u0004\u0018\u00010>2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020:2\b\u0010B\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bC\u0010DJ\u001b\u0010F\u001a\u00020\t*\u00020 2\u0006\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020\t*\u00020 2\u0006\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bH\u0010GJ\u001b\u0010I\u001a\u00020\t*\u00020 2\u0006\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bI\u0010GJ\u001b\u0010J\u001a\u00020\t*\u00020 2\u0006\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bJ\u0010GJ#\u0010L\u001a\u00020\t*\u00020 2\u0006\u0010E\u001a\u00020 2\u0006\u0010K\u001a\u000207H\u0002¢\u0006\u0004\bL\u0010MJ\u001b\u0010O\u001a\u00020\t*\u00020N2\u0006\u0010E\u001a\u00020 H\u0002¢\u0006\u0004\bO\u0010PJ\u0013\u0010R\u001a\u00020 *\u00020QH\u0002¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010WR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010YR\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010YR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\\R\u0016\u0010`\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010ZR\u0014\u0010b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010ZR\u0016\u0010d\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010cR\u0014\u0010g\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010fR\u001b\u0010l\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bi\u0010k¨\u0006m"}, d2 = {"Lfn/r0;", "", "Lgo/e;", "featureFlagManager", "<init>", "(Lgo/e;)V", "", "minFaceRatio", "maxFaceRatio", "", "analyzeLightConditions", "", "u", "(DDZ)V", "Lfn/r0$c;", "pose", "v", "(Lfn/r0$c;)V", "Landroid/media/Image;", "image", "", "rotationDegrees", "Lkn/c;", "d", "(Landroid/media/Image;I)Lkn/c;", "Landroidx/camera/core/d;", "e", "(Landroidx/camera/core/d;)Lkn/c;", "Lfn/z;", "imageToAnalyze", "f", "(Lfn/z;)Lkn/c;", "Landroid/graphics/Rect;", "rect", "previewRect", "w", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "viewfinderRect", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "k", "(Lfn/z;Landroid/graphics/Rect;)Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "x", "y", "angleInDegrees", "b", "(III)I", "degrees", "i", "(I)I", "h", "Ljava/nio/ByteBuffer;", "yPlaneBuffer", "imageWidth", "imageHeight", "region", "", "n", "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)F", "Lfn/r0$b;", Payload.TYPE, "Landroid/graphics/Bitmap;", "bitmap", "Lfn/p0;", "m", "(Lfn/r0$b;Landroid/graphics/Bitmap;)Lfn/p0;", "poseType", "cropRect", "c", "(Lfn/z;Lfn/r0$b;Landroid/graphics/Rect;)Lfn/p0;", "imageRect", "p", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z", "q", "r", "s", "faceAngleY", "t", "(Landroid/graphics/Rect;Landroid/graphics/Rect;F)Z", "Lcom/google/mlkit/vision/face/Face;", "o", "(Lcom/google/mlkit/vision/face/Face;Landroid/graphics/Rect;)Z", "Lcom/google/mlkit/vision/common/InputImage;", "j", "(Lcom/google/mlkit/vision/common/InputImage;)Landroid/graphics/Rect;", "a", "Lgo/e;", "Lgn/k;", "Lgn/k;", "lightConditionAnalyzer", "D", "Z", "Ljn/c;", "Ljn/c;", "viewfinderInfo", "g", "Lfn/r0$c;", "targetPose", "useOldFaceCenteredDetector", "relaxedSidePoseDistance", "Landroid/graphics/Rect;", "tempRect", "", "[B", "byteArr", "Lcom/google/mlkit/vision/face/FaceDetector;", "l", "Ljt/h;", "()Lcom/google/mlkit/vision/face/FaceDetector;", "faceDetector", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final go.e featureFlagManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final gn.k lightConditionAnalyzer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public double minFaceRatio;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public double maxFaceRatio;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean analyzeLightConditions;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ViewfinderInfo viewfinderInfo;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public c targetPose;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean useOldFaceCenteredDetector;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final boolean relaxedSidePoseDistance;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Rect tempRect;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] byteArr;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h faceDetector;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lfn/r0$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        Center,
        Left,
        Right,
        Up,
        Down;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ qt.a f16986g = qt.b.a(a());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lfn/r0$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum c {
        Center,
        Left,
        Right,
        Up,
        Down,
        All,
        None;


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ qt.a f16994i = qt.b.a(a());
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16995a;

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
            f16995a = iArr;
        }
    }

    public r0(@NotNull go.e featureFlagManager) {
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        this.featureFlagManager = featureFlagManager;
        this.lightConditionAnalyzer = new gn.k();
        this.minFaceRatio = 0.35d;
        this.maxFaceRatio = 0.8d;
        this.targetPose = c.All;
        this.useOldFaceCenteredDetector = featureFlagManager.a(go.c0.f18292a);
        this.relaxedSidePoseDistance = featureFlagManager.a(go.x.f18320a);
        this.tempRect = new Rect();
        this.byteArr = new byte[32768];
        this.faceDetector = jt.i.b(new Function0() { // from class: fn.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r0.g();
            }
        });
    }

    public static final FaceDetector g() {
        FaceDetector client = FaceDetection.getClient(new FaceDetectorOptions.Builder().setMinFaceSize(0.35f).setLandmarkMode(2).build());
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    public final int b(int x10, int y10, int angleInDegrees) {
        int i10 = x10 - 1;
        int i11 = y10 - 1;
        return (((i11 * h(angleInDegrees)) + (i10 * i(angleInDegrees)) + 1) * 3) + ((h(angleInDegrees) * i10) - (i(angleInDegrees) * i11)) + 1;
    }

    public final p0 c(z imageToAnalyze, b poseType, Rect cropRect) {
        Bitmap bitmapF = cropRect != null ? imageToAnalyze.f(cropRect) : imageToAnalyze.e();
        if (bitmapF != null) {
            return m(poseType, bitmapF);
        }
        return null;
    }

    @NotNull
    public final kn.c d(@NotNull Image image, int rotationDegrees) {
        Intrinsics.checkNotNullParameter(image, "image");
        return f(c0.e(image, rotationDegrees));
    }

    @NotNull
    public final kn.c e(@NotNull androidx.camera.core.d image) {
        Intrinsics.checkNotNullParameter(image, "image");
        z zVarF = c0.f(image);
        return zVarF == null ? new kn.c(null, kn.b.Other, 0, false, false, false, 0.0f, 0.0f, 0.0f, null, null, null) : f(zVarF);
    }

    @NotNull
    public final kn.c f(@NotNull z imageToAnalyze) {
        boolean zP;
        kn.b bVar;
        kn.a aVar;
        p0 p0VarC;
        kn.b bVar2;
        kn.b bVar3;
        p0 p0Var;
        kn.a aVar2;
        kn.a aVar3;
        kn.b bVar4;
        p0 p0VarC2;
        Intrinsics.checkNotNullParameter(imageToAnalyze, "imageToAnalyze");
        ViewfinderInfo viewfinderInfo = this.viewfinderInfo;
        Rect rectA = viewfinderInfo != null ? jn.d.a(viewfinderInfo, imageToAnalyze) : null;
        InputImage inputImageG = imageToAnalyze.g();
        Rect rectJ = j(inputImageG);
        SelfieBrightnessInfo selfieBrightnessInfoK = k(imageToAnalyze, rectA);
        Rect rectB = rectA != null ? jn.d.b(rectA, inputImageG.getRotationDegrees()) : null;
        Task<List<Face>> taskProcess = l().process(inputImageG);
        Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
        ImageLightCondition imageLightConditionB = this.analyzeLightConditions ? this.lightConditionAnalyzer.b(imageToAnalyze, rectA) : null;
        try {
            List<Face> result = taskProcess.getResult();
            if (result.isEmpty()) {
                return new kn.c(null, kn.b.FaceNotFound, result.size(), false, false, false, 0.0f, 0.0f, 0.0f, selfieBrightnessInfoK, null, imageLightConditionB);
            }
            if (result.size() > 1) {
                return new kn.c(null, kn.b.MultipleFaces, result.size(), false, false, false, 0.0f, 0.0f, 0.0f, selfieBrightnessInfoK, null, imageLightConditionB);
            }
            Intrinsics.checkNotNull(result);
            Face face = (Face) CollectionsKt.d0(result);
            Rect boundingBox = face.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox, "getBoundingBox(...)");
            boolean zS = s(boundingBox, rectB == null ? rectJ : rectB);
            Rect boundingBox2 = face.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox2, "getBoundingBox(...)");
            boolean zT = t(boundingBox2, rectB == null ? rectJ : rectB, face.getHeadEulerAngleY());
            if (this.useOldFaceCenteredDetector) {
                Rect boundingBox3 = face.getBoundingBox();
                Intrinsics.checkNotNullExpressionValue(boundingBox3, "getBoundingBox(...)");
                zP = q(boundingBox3, rectB == null ? rectJ : rectB);
            } else {
                Rect boundingBox4 = face.getBoundingBox();
                Intrinsics.checkNotNullExpressionValue(boundingBox4, "getBoundingBox(...)");
                zP = p(boundingBox4, rectB == null ? rectJ : rectB);
            }
            boolean z10 = zP;
            Rect boundingBox5 = face.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox5, "getBoundingBox(...)");
            if (rectB == null) {
                rectB = rectJ;
            }
            boolean zR = r(boundingBox5, rectB);
            float headEulerAngleY = face.getHeadEulerAngleY();
            float headEulerAngleX = face.getHeadEulerAngleX();
            float headEulerAngleZ = face.getHeadEulerAngleZ();
            if (zS) {
                bVar = kn.b.FaceTooClose;
            } else if (zT) {
                bVar = kn.b.FaceTooFar;
            } else if (!z10) {
                bVar = kn.b.FaceNotCentered;
            } else {
                if (zR) {
                    if (-10.0f >= headEulerAngleY || headEulerAngleY >= 10.0f) {
                        if (headEulerAngleY < -15.0f) {
                            aVar = kn.a.Right;
                            c cVar = this.targetPose;
                            if (cVar == c.Right || cVar == c.All) {
                                p0VarC = c(imageToAnalyze, b.Right, rectA);
                                p0Var = p0VarC;
                                bVar3 = null;
                            } else {
                                bVar2 = kn.b.IncorrectPose;
                                bVar3 = bVar2;
                                p0Var = null;
                            }
                        } else if (15.0f < headEulerAngleY) {
                            aVar = kn.a.Left;
                            c cVar2 = this.targetPose;
                            if (cVar2 == c.Left || cVar2 == c.All) {
                                p0VarC = c(imageToAnalyze, b.Left, rectA);
                                p0Var = p0VarC;
                                bVar3 = null;
                            } else {
                                bVar2 = kn.b.IncorrectPose;
                                bVar3 = bVar2;
                                p0Var = null;
                            }
                        } else {
                            bVar = kn.b.IncorrectPose;
                        }
                        aVar2 = aVar;
                    } else {
                        Intrinsics.checkNotNull(face);
                        if (o(face, rectJ)) {
                            c cVar3 = this.targetPose;
                            if (cVar3 == c.Center || cVar3 == c.All) {
                                aVar = kn.a.Center;
                                p0VarC = c(imageToAnalyze, b.Center, rectA);
                                p0Var = p0VarC;
                                bVar3 = null;
                                aVar2 = aVar;
                            } else if (headEulerAngleX > 10.0f) {
                                aVar3 = kn.a.Up;
                                if (cVar3 == c.Up) {
                                    p0VarC2 = c(imageToAnalyze, b.Up, rectA);
                                    p0Var = p0VarC2;
                                    bVar3 = null;
                                    aVar2 = aVar3;
                                } else {
                                    bVar4 = kn.b.IncorrectPose;
                                    bVar3 = bVar4;
                                    p0Var = null;
                                    aVar2 = aVar3;
                                }
                            } else if (headEulerAngleX < -5.0f) {
                                aVar3 = kn.a.Down;
                                if (cVar3 == c.Down) {
                                    p0VarC2 = c(imageToAnalyze, b.Down, rectA);
                                    p0Var = p0VarC2;
                                    bVar3 = null;
                                    aVar2 = aVar3;
                                } else {
                                    bVar4 = kn.b.IncorrectPose;
                                    bVar3 = bVar4;
                                    p0Var = null;
                                    aVar2 = aVar3;
                                }
                            } else {
                                aVar2 = kn.a.Center;
                                bVar3 = kn.b.IncorrectPose;
                                p0Var = null;
                            }
                        } else {
                            bVar = kn.b.FaceNotCentered;
                        }
                    }
                    return new kn.c(p0Var, bVar3, result.size(), zS, zT, z10, headEulerAngleY, headEulerAngleX, headEulerAngleZ, selfieBrightnessInfoK, aVar2, imageLightConditionB);
                }
                bVar = kn.b.IncompleteFace;
            }
            bVar3 = bVar;
            p0Var = null;
            aVar2 = null;
            return new kn.c(p0Var, bVar3, result.size(), zS, zT, z10, headEulerAngleY, headEulerAngleX, headEulerAngleZ, selfieBrightnessInfoK, aVar2, imageLightConditionB);
        } catch (ExecutionException unused) {
            return new kn.c(null, kn.b.FaceDetectionUnsupported, 0, false, false, false, 0.0f, 0.0f, 0.0f, selfieBrightnessInfoK, null, imageLightConditionB);
        }
    }

    public final int h(int degrees) {
        return i(degrees + 90);
    }

    public final int i(int degrees) {
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

    public final Rect j(InputImage inputImage) {
        return (inputImage.getRotationDegrees() == 90 || inputImage.getRotationDegrees() == 270) ? new Rect(0, 0, inputImage.getHeight(), inputImage.getWidth()) : new Rect(0, 0, inputImage.getWidth(), inputImage.getHeight());
    }

    public final SelfieBrightnessInfo k(z image, Rect viewfinderRect) {
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
                int iB = b(i14, i13, image.getRotationDegrees());
                Intrinsics.checkNotNull(buffer);
                fArr[iB] = Float.valueOf(n(buffer, width, height, this.tempRect));
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

    public final FaceDetector l() {
        return (FaceDetector) this.faceDetector.getValue();
    }

    public final p0 m(b type, Bitmap bitmap) {
        int i10 = d.f16995a[type.ordinal()];
        if (i10 == 1) {
            return new p0.a(bitmap);
        }
        if (i10 == 2) {
            return new p0.c(bitmap);
        }
        if (i10 == 3) {
            return new p0.d(bitmap);
        }
        if (i10 == 4) {
            return new p0.e(bitmap);
        }
        if (i10 == 5) {
            return new p0.b(bitmap);
        }
        throw new jt.l();
    }

    public final float n(ByteBuffer yPlaneBuffer, int imageWidth, int imageHeight, Rect region) {
        yPlaneBuffer.rewind();
        int iWidth = region.width();
        int iHeight = region.height() * iWidth;
        if (iWidth > 32768) {
            return 0.0f;
        }
        kotlin.ranges.a aVarP = kotlin.ranges.d.p(kotlin.ranges.d.q(region.top, region.bottom), 2);
        int first = aVarP.getFirst();
        int last = aVarP.getLast();
        int step = aVarP.getStep();
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

    public final boolean o(Face face, Rect rect) {
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

    public final boolean p(Rect rect, Rect rect2) {
        return ((double) Math.abs(rect2.centerX() - rect.centerX())) / ((double) rect2.width()) <= 0.3d;
    }

    public final boolean q(Rect rect, Rect rect2) {
        int iWidth = rect2.width();
        int iHeight = rect2.height();
        int i10 = iWidth / 2;
        int i11 = iHeight / 2;
        int iMin = Math.min(iWidth, iHeight) / 2;
        Rect rect3 = new Rect(0, 0, iWidth, iHeight);
        rect3.inset(25, 25);
        return rect3.contains(rect) && ((double) Math.abs(kotlin.ranges.d.c(rect2.width() - rect.right, 1) - kotlin.ranges.d.c(rect.left, 1))) / ((double) rect2.width()) <= 0.3d && rect.left > i10 - iMin && rect.right < i10 + iMin && rect.top > i11 - iMin && rect.bottom < i11 + iMin;
    }

    public final boolean r(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect2);
        rect3.inset(25, 25);
        return rect3.contains(rect);
    }

    public final boolean s(Rect rect, Rect rect2) {
        return ((double) Math.max(rect.width(), rect.height())) > ((double) Math.min(rect2.width(), rect2.height())) * this.maxFaceRatio;
    }

    public final boolean t(Rect rect, Rect rect2, float f10) {
        return ((double) Math.max(rect.width(), rect.height())) < ((double) Math.min(rect2.width(), rect2.height())) * (this.minFaceRatio - ((!this.relaxedSidePoseDistance || !((f10 > (-15.0f) ? 1 : (f10 == (-15.0f) ? 0 : -1)) < 0 || (f10 > 15.0f ? 1 : (f10 == 15.0f ? 0 : -1)) > 0)) ? 0.0d : 0.05d));
    }

    public final void u(double minFaceRatio, double maxFaceRatio, boolean analyzeLightConditions) {
        this.minFaceRatio = minFaceRatio;
        this.maxFaceRatio = maxFaceRatio;
        this.analyzeLightConditions = analyzeLightConditions;
    }

    public final void v(@NotNull c pose) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        this.targetPose = pose;
    }

    public final void w(@NotNull Rect rect, @NotNull Rect previewRect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        this.viewfinderInfo = new ViewfinderInfo(rect, previewRect);
    }
}
