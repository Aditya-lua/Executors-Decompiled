package gn;

import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetection;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.InterfaceC5719z;
import p229jt.C7342i;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: gn.j */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Lgn/j;", "Lgn/e;", "", "analyzeViewfinderRegionOnly", "<init>", "(Z)V", "Lfn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Ljt/n;", "Lgn/a;", "a", "(Lfn/z;Landroid/graphics/Rect;Lnt/b;)Ljava/lang/Object;", "Z", "Lcom/google/mlkit/vision/face/FaceDetector;", "b", "Ljt/h;", "e", "()Lcom/google/mlkit/vision/face/FaceDetector;", "faceDetector", "Lcom/google/mlkit/vision/text/TextRecognizer;", "c", "f", "()Lcom/google/mlkit/vision/text/TextRecognizer;", "textDetector", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6146j implements InterfaceC6141e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean analyzeViewfinderRegionOnly;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h faceDetector = C7342i.m30456b(new Function0() { // from class: gn.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C6146j.m27131d();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h textDetector = C7342i.m30456b(new Function0() { // from class: gn.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C6146j.m27132g();
        }
    });

    public C6146j(boolean z10) {
        this.analyzeViewfinderRegionOnly = z10;
    }

    /* JADX INFO: renamed from: d */
    public static final FaceDetector m27131d() {
        FaceDetector client = FaceDetection.getClient(new FaceDetectorOptions.Builder().setMinFaceSize(0.1f).build());
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    /* JADX INFO: renamed from: g */
    public static final TextRecognizer m27132g() {
        TextRecognizer client = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    @Override // gn.InterfaceC6141e
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo27125a(@NotNull InterfaceC5719z interfaceC5719z, @Nullable Rect rect, @NotNull InterfaceC9557b<? super C7347n<? extends AbstractC6137a>> interfaceC9557b) {
        InputImage inputImageMo25782g = interfaceC5719z.mo25782g();
        Task<List<Face>> taskProcess = m27133e().process(inputImageMo25782g);
        Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
        Task<Text> taskProcess2 = m27134f().process(inputImageMo25782g);
        Intrinsics.checkNotNullExpressionValue(taskProcess2, "process(...)");
        try {
            List<Face> result = taskProcess.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
            Face face = (Face) CollectionsKt.m31708f0(result, 0);
            if (face == null) {
                C7347n.Companion companion = C7347n.INSTANCE;
                return C7347n.m30460b(AbstractC6137a.b.f23474a);
            }
            List<Text.TextBlock> textBlocks = taskProcess2.getResult().getTextBlocks();
            Intrinsics.checkNotNullExpressionValue(textBlocks, "getTextBlocks(...)");
            List<Text.TextBlock> list = textBlocks;
            ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<Text.Line> lines = ((Text.TextBlock) it.next()).getLines();
                Intrinsics.checkNotNullExpressionValue(lines, "getLines(...)");
                List<Text.Line> list2 = lines;
                ArrayList arrayList2 = new ArrayList(C7701q.m31905u(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Text.Line) it2.next()).getText());
                }
                arrayList.add(arrayList2);
            }
            if (C7701q.m31907w(arrayList).size() < 5) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                return C7347n.m30460b(AbstractC6137a.b.f23474a);
            }
            Rect rectM27128a = C6142f.m27128a(interfaceC5719z, rect, this.analyzeViewfinderRegionOnly);
            rectM27128a.inset(1, 1);
            if (!rectM27128a.contains(face.getBoundingBox())) {
                C7347n.Companion companion3 = C7347n.INSTANCE;
                return C7347n.m30460b(AbstractC6137a.b.f23474a);
            }
            C7347n.Companion companion4 = C7347n.INSTANCE;
            String text = taskProcess2.getResult().getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            return C7347n.m30460b(new AbstractC6137a.d(new ImageIdMetadata(text)));
        } catch (ExecutionException unused) {
            C7347n.Companion companion5 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(new AbstractC6138b.a()));
        }
    }

    /* JADX INFO: renamed from: e */
    public final FaceDetector m27133e() {
        return (FaceDetector) this.faceDetector.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final TextRecognizer m27134f() {
        return (TextRecognizer) this.textDetector.getValue();
    }
}
