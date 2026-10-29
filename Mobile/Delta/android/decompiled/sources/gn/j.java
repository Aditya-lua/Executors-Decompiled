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
import fn.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lgn/j;", "Lgn/e;", "", "analyzeViewfinderRegionOnly", "<init>", "(Z)V", "Lfn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Ljt/n;", "Lgn/a;", "a", "(Lfn/z;Landroid/graphics/Rect;Lnt/b;)Ljava/lang/Object;", "Z", "Lcom/google/mlkit/vision/face/FaceDetector;", "b", "Ljt/h;", "e", "()Lcom/google/mlkit/vision/face/FaceDetector;", "faceDetector", "Lcom/google/mlkit/vision/text/TextRecognizer;", "c", "f", "()Lcom/google/mlkit/vision/text/TextRecognizer;", "textDetector", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean analyzeViewfinderRegionOnly;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final jt.h faceDetector = jt.i.b(new Function0() { // from class: gn.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return j.d();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h textDetector = jt.i.b(new Function0() { // from class: gn.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return j.g();
        }
    });

    public j(boolean z10) {
        this.analyzeViewfinderRegionOnly = z10;
    }

    public static final FaceDetector d() {
        FaceDetector client = FaceDetection.getClient(new FaceDetectorOptions.Builder().setMinFaceSize(0.1f).build());
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    public static final TextRecognizer g() {
        TextRecognizer client = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    @Override // gn.e
    @Nullable
    public Object a(@NotNull z zVar, @Nullable Rect rect, @NotNull nt.b<? super jt.n<? extends a>> bVar) {
        InputImage inputImageG = zVar.g();
        Task<List<Face>> taskProcess = e().process(inputImageG);
        Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
        Task<Text> taskProcess2 = f().process(inputImageG);
        Intrinsics.checkNotNullExpressionValue(taskProcess2, "process(...)");
        try {
            List<Face> result = taskProcess.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
            Face face = (Face) CollectionsKt.f0(result, 0);
            if (face == null) {
                jt.n.Companion companion = jt.n.INSTANCE;
                return jt.n.b(a.b.f18253a);
            }
            List<Text.TextBlock> textBlocks = taskProcess2.getResult().getTextBlocks();
            Intrinsics.checkNotNullExpressionValue(textBlocks, "getTextBlocks(...)");
            List<Text.TextBlock> list = textBlocks;
            ArrayList arrayList = new ArrayList(q.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<Text.Line> lines = ((Text.TextBlock) it.next()).getLines();
                Intrinsics.checkNotNullExpressionValue(lines, "getLines(...)");
                List<Text.Line> list2 = lines;
                ArrayList arrayList2 = new ArrayList(q.u(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Text.Line) it2.next()).getText());
                }
                arrayList.add(arrayList2);
            }
            if (q.w(arrayList).size() < 5) {
                jt.n.Companion companion2 = jt.n.INSTANCE;
                return jt.n.b(a.b.f18253a);
            }
            Rect rectA = f.a(zVar, rect, this.analyzeViewfinderRegionOnly);
            rectA.inset(1, 1);
            if (!rectA.contains(face.getBoundingBox())) {
                jt.n.Companion companion3 = jt.n.INSTANCE;
                return jt.n.b(a.b.f18253a);
            }
            jt.n.Companion companion4 = jt.n.INSTANCE;
            String text = taskProcess2.getResult().getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            return jt.n.b(new a.d(new ImageIdMetadata(text)));
        } catch (ExecutionException unused) {
            jt.n.Companion companion5 = jt.n.INSTANCE;
            return jt.n.b(jt.o.a(new b.a()));
        }
    }

    public final FaceDetector e() {
        return (FaceDetector) this.faceDetector.getValue();
    }

    public final TextRecognizer f() {
        return (TextRecognizer) this.textDetector.getValue();
    }
}
