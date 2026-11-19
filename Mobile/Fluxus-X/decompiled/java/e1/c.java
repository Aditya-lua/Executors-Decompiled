package e1;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import android.util.Size;
import androidx.camera.core.d;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.interfaces.Detector;
import g0.r1;
import g0.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import o9.s;
import p0.a0;

/* JADX INFO: loaded from: classes.dex */
public class c implements u0.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f13077g = new Size(480, 360);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Detector<?>> f13078a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2.a<a> f13079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t1.a f13080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f13081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Matrix f13082f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Detector<?>, Object> f13083a;
        public final Map<Detector<?>, Throwable> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f13084c;

        public a(Map<Detector<?>, Object> map, long j10, Map<Detector<?>, Throwable> map2) {
            this.f13083a = map;
            this.b = map2;
            this.f13084c = j10;
        }

        public final void a(Detector<?> detector) {
            s.b(this.f13083a.containsKey(detector) || this.b.containsKey(detector), "The detector does not exist");
        }

        public Throwable b(Detector<?> detector) {
            a(detector);
            return this.b.get(detector);
        }

        public <T> T c(Detector<T> detector) {
            a(detector);
            return (T) this.f13083a.get(detector);
        }
    }

    public c(List<Detector<?>> list, int i10, Executor executor, x2.a<a> aVar) {
        if (i10 != 0) {
            Iterator<Detector<?>> it = list.iterator();
            while (it.hasNext()) {
                s.b(it.next().getDetectorType() != 7, "Segmentation only works with COORDINATE_SYSTEM_ORIGINAL");
            }
        }
        this.f13078a = new ArrayList(list);
        this.b = i10;
        this.f13079c = aVar;
        this.f13081e = executor;
        t1.a aVar2 = new t1.a();
        this.f13080d = aVar2;
        aVar2.a(true);
    }

    public static /* synthetic */ void a(c cVar, Map map, Detector detector, Map map2, d dVar, int i10, Matrix matrix, Task task) {
        cVar.getClass();
        if (task.l()) {
            map.put(detector, new CancellationException("The task is canceled."));
        } else if (task.isSuccessful()) {
            map2.put(detector, task.getResult());
        } else {
            map.put(detector, task.getException());
        }
        cVar.f(dVar, i10 + 1, matrix, map2, map);
    }

    @Override // g0.u0.a
    public final Size c() {
        Size size = f13077g;
        Iterator<Detector<?>> it = this.f13078a.iterator();
        while (it.hasNext()) {
            Size sizeG = g(it.next().getDetectorType());
            if (sizeG.getHeight() * sizeG.getWidth() > size.getWidth() * size.getHeight()) {
                size = sizeG;
            }
        }
        return size;
    }

    @Override // g0.u0.a
    public final int d() {
        return this.b;
    }

    @Override // g0.u0.a
    public final void e(Matrix matrix) {
        if (matrix == null) {
            this.f13082f = null;
        } else {
            this.f13082f = new Matrix(matrix);
        }
    }

    public final void f(final d dVar, final int i10, final Matrix matrix, final Map<Detector<?>, Object> map, final Map<Detector<?>, Throwable> map2) {
        Image imageQ = dVar.q();
        if (imageQ == null) {
            r1.c("MlKitAnalyzer", "Image is null.");
            dVar.close();
            return;
        }
        if (i10 > this.f13078a.size() - 1) {
            dVar.close();
            this.f13081e.execute(new Runnable() { // from class: e1.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13068a.f13079c.accept(new c.a(map, dVar.L2().getTimestamp(), map2));
                }
            });
            return;
        }
        final Detector<?> detector = this.f13078a.get(i10);
        try {
            detector.process(imageQ, dVar.L2().d(), matrix).c(this.f13081e, new OnCompleteListener() { // from class: e1.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    c.a(this.f13071a, map2, detector, map, dVar, i10, matrix, task);
                }
            });
        } catch (Exception e10) {
            map2.put(detector, new RuntimeException("Failed to process the image.", e10));
            f(dVar, i10 + 1, matrix, map, map2);
        }
    }

    public final Size g(int i10) {
        return (i10 == 1 || i10 == 4) ? new Size(1280, 720) : f13077g;
    }

    @Override // g0.u0.a
    public final void j(d dVar) {
        Matrix matrix = new Matrix();
        int i10 = this.b;
        if (i10 != 0) {
            Matrix matrix2 = this.f13082f;
            if (i10 != 2 && matrix2 == null) {
                r1.a("MlKitAnalyzer", "Sensor-to-target transformation is null.");
                dVar.close();
                return;
            }
            Matrix matrix3 = new Matrix(dVar.L2().e());
            RectF rectF = new RectF(0.0f, 0.0f, dVar.getWidth(), dVar.getHeight());
            matrix3.postConcat(a0.d(rectF, a0.p(rectF, dVar.L2().d()), dVar.L2().d()));
            matrix3.invert(matrix);
            if (this.b != 2) {
                matrix.postConcat(matrix2);
            }
        }
        f(dVar, 0, matrix, new HashMap(), new HashMap());
    }
}
