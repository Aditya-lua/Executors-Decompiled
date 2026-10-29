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
import n9.m;
import p0.a0;

/* JADX INFO: loaded from: classes.dex */
public class c implements u0.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f14980g = new Size(480, 360);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Detector<?>> f14981a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2.a<a> f14982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t1.a f14983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f14984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Matrix f14985f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Detector<?>, Object> f14986a;
        public final Map<Detector<?>, Throwable> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f14987c;

        public a(Map<Detector<?>, Object> map, long j10, Map<Detector<?>, Throwable> map2) {
            this.f14986a = map;
            this.b = map2;
            this.f14987c = j10;
        }

        public final void a(Detector<?> detector) {
            m.b(this.f14986a.containsKey(detector) || this.b.containsKey(detector), "The detector does not exist");
        }

        public Throwable b(Detector<?> detector) {
            a(detector);
            return this.b.get(detector);
        }

        public <T> T c(Detector<T> detector) {
            a(detector);
            return (T) this.f14986a.get(detector);
        }
    }

    public c(List<Detector<?>> list, int i10, Executor executor, x2.a<a> aVar) {
        if (i10 != 0) {
            Iterator<Detector<?>> it = list.iterator();
            while (it.hasNext()) {
                m.b(it.next().getDetectorType() != 7, "Segmentation only works with COORDINATE_SYSTEM_ORIGINAL");
            }
        }
        this.f14981a = new ArrayList(list);
        this.b = i10;
        this.f14982c = aVar;
        this.f14984e = executor;
        t1.a aVar2 = new t1.a();
        this.f14983d = aVar2;
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
        cVar.e(dVar, i10 + 1, matrix, map2, map);
    }

    @Override // g0.u0.a
    public final Size c() {
        Size size = f14980g;
        Iterator<Detector<?>> it = this.f14981a.iterator();
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

    public final void e(final d dVar, final int i10, final Matrix matrix, final Map<Detector<?>, Object> map, final Map<Detector<?>, Throwable> map2) {
        Image imageP = dVar.p();
        if (imageP == null) {
            r1.c("MlKitAnalyzer", "Image is null.");
            dVar.close();
            return;
        }
        if (i10 > this.f14981a.size() - 1) {
            dVar.close();
            this.f14984e.execute(new Runnable() { // from class: e1.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14971a.f14982c.accept(new c.a(map, dVar.H2().getTimestamp(), map2));
                }
            });
            return;
        }
        final Detector<?> detector = this.f14981a.get(i10);
        try {
            detector.process(imageP, dVar.H2().d(), matrix).c(this.f14984e, new OnCompleteListener() { // from class: e1.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    c.a(this.f14974a, map2, detector, map, dVar, i10, matrix, task);
                }
            });
        } catch (Exception e10) {
            map2.put(detector, new RuntimeException("Failed to process the image.", e10));
            e(dVar, i10 + 1, matrix, map, map2);
        }
    }

    @Override // g0.u0.a
    public final void f(Matrix matrix) {
        if (matrix == null) {
            this.f14985f = null;
        } else {
            this.f14985f = new Matrix(matrix);
        }
    }

    public final Size g(int i10) {
        return (i10 == 1 || i10 == 4) ? new Size(1280, 720) : f14980g;
    }

    @Override // g0.u0.a
    public final void k(d dVar) {
        Matrix matrix = new Matrix();
        int i10 = this.b;
        if (i10 != 0) {
            Matrix matrix2 = this.f14985f;
            if (i10 != 2 && matrix2 == null) {
                r1.a("MlKitAnalyzer", "Sensor-to-target transformation is null.");
                dVar.close();
                return;
            }
            Matrix matrix3 = new Matrix(dVar.H2().e());
            RectF rectF = new RectF(0.0f, 0.0f, dVar.getWidth(), dVar.getHeight());
            matrix3.postConcat(a0.d(rectF, a0.p(rectF, dVar.H2().d()), dVar.H2().d()));
            matrix3.invert(matrix);
            if (this.b != 2) {
                matrix.postConcat(matrix2);
            }
        }
        e(dVar, 0, matrix, new HashMap(), new HashMap());
    }
}
