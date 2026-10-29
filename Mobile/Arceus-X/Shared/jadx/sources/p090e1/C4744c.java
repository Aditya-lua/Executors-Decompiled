package p090e1;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import android.util.Size;
import androidx.camera.core.InterfaceC0494d;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.interfaces.Detector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p140g0.C5931r1;
import p140g0.C5942u0;
import p305n9.C8953m;
import p347p0.C10085a0;
import p438t1.C11469a;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: e1.c */
/* JADX INFO: loaded from: classes.dex */
public class C4744c implements C5942u0.a {

    /* JADX INFO: renamed from: g */
    public static final Size f19291g = new Size(480, 360);

    /* JADX INFO: renamed from: a */
    public final List<Detector<?>> f19292a;

    /* JADX INFO: renamed from: b */
    public final int f19293b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12631a<a> f19294c;

    /* JADX INFO: renamed from: d */
    public final C11469a f19295d;

    /* JADX INFO: renamed from: e */
    public final Executor f19296e;

    /* JADX INFO: renamed from: f */
    public Matrix f19297f;

    /* JADX INFO: renamed from: e1.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Map<Detector<?>, Object> f19298a;

        /* JADX INFO: renamed from: b */
        public final Map<Detector<?>, Throwable> f19299b;

        /* JADX INFO: renamed from: c */
        public final long f19300c;

        public a(Map<Detector<?>, Object> map, long j10, Map<Detector<?>, Throwable> map2) {
            this.f19298a = map;
            this.f19299b = map2;
            this.f19300c = j10;
        }

        /* JADX INFO: renamed from: a */
        public final void m23128a(Detector<?> detector) {
            C8953m.m36037b(this.f19298a.containsKey(detector) || this.f19299b.containsKey(detector), "The detector does not exist");
        }

        /* JADX INFO: renamed from: b */
        public Throwable m23129b(Detector<?> detector) {
            m23128a(detector);
            return this.f19299b.get(detector);
        }

        /* JADX INFO: renamed from: c */
        public <T> T m23130c(Detector<T> detector) {
            m23128a(detector);
            return (T) this.f19298a.get(detector);
        }
    }

    public C4744c(List<Detector<?>> list, int i10, Executor executor, InterfaceC12631a<a> interfaceC12631a) {
        if (i10 != 0) {
            Iterator<Detector<?>> it = list.iterator();
            while (it.hasNext()) {
                C8953m.m36037b(it.next().getDetectorType() != 7, "Segmentation only works with COORDINATE_SYSTEM_ORIGINAL");
            }
        }
        this.f19292a = new ArrayList(list);
        this.f19293b = i10;
        this.f19294c = interfaceC12631a;
        this.f19296e = executor;
        C11469a c11469a = new C11469a();
        this.f19295d = c11469a;
        c11469a.m42951a(true);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m23120a(C4744c c4744c, Map map, Detector detector, Map map2, InterfaceC0494d interfaceC0494d, int i10, Matrix matrix, Task task) {
        c4744c.getClass();
        if (task.mo11898l()) {
            map.put(detector, new CancellationException("The task is canceled."));
        } else if (task.isSuccessful()) {
            map2.put(detector, task.getResult());
        } else {
            map.put(detector, task.getException());
        }
        c4744c.m23124e(interfaceC0494d, i10 + 1, matrix, map2, map);
    }

    @Override // p140g0.C5942u0.a
    /* JADX INFO: renamed from: c */
    public final Size mo23122c() {
        Size size = f19291g;
        Iterator<Detector<?>> it = this.f19292a.iterator();
        while (it.hasNext()) {
            Size sizeM23126g = m23126g(it.next().getDetectorType());
            if (sizeM23126g.getHeight() * sizeM23126g.getWidth() > size.getWidth() * size.getHeight()) {
                size = sizeM23126g;
            }
        }
        return size;
    }

    @Override // p140g0.C5942u0.a
    /* JADX INFO: renamed from: d */
    public final int mo23123d() {
        return this.f19293b;
    }

    /* JADX INFO: renamed from: e */
    public final void m23124e(final InterfaceC0494d interfaceC0494d, final int i10, final Matrix matrix, final Map<Detector<?>, Object> map, final Map<Detector<?>, Throwable> map2) {
        Image imageMo2194p = interfaceC0494d.mo2194p();
        if (imageMo2194p == null) {
            C5931r1.m26563c("MlKitAnalyzer", "Image is null.");
            interfaceC0494d.close();
            return;
        }
        if (i10 > this.f19292a.size() - 1) {
            interfaceC0494d.close();
            this.f19296e.execute(new Runnable() { // from class: e1.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19280a.f19294c.accept(new C4744c.a(map, interfaceC0494d.mo2192H2().getTimestamp(), map2));
                }
            });
            return;
        }
        final Detector<?> detector = this.f19292a.get(i10);
        try {
            detector.process(imageMo2194p, interfaceC0494d.mo2192H2().mo26442d(), matrix).mo11889c(this.f19296e, new OnCompleteListener() { // from class: e1.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C4744c.m23120a(this.f19284a, map2, detector, map, interfaceC0494d, i10, matrix, task);
                }
            });
        } catch (Exception e10) {
            map2.put(detector, new RuntimeException("Failed to process the image.", e10));
            m23124e(interfaceC0494d, i10 + 1, matrix, map, map2);
        }
    }

    @Override // p140g0.C5942u0.a
    /* JADX INFO: renamed from: f */
    public final void mo23125f(Matrix matrix) {
        if (matrix == null) {
            this.f19297f = null;
        } else {
            this.f19297f = new Matrix(matrix);
        }
    }

    /* JADX INFO: renamed from: g */
    public final Size m23126g(int i10) {
        return (i10 == 1 || i10 == 4) ? new Size(1280, 720) : f19291g;
    }

    @Override // p140g0.C5942u0.a
    /* JADX INFO: renamed from: k */
    public final void mo23127k(InterfaceC0494d interfaceC0494d) {
        Matrix matrix = new Matrix();
        int i10 = this.f19293b;
        if (i10 != 0) {
            Matrix matrix2 = this.f19297f;
            if (i10 != 2 && matrix2 == null) {
                C5931r1.m26561a("MlKitAnalyzer", "Sensor-to-target transformation is null.");
                interfaceC0494d.close();
                return;
            }
            Matrix matrix3 = new Matrix(interfaceC0494d.mo2192H2().mo26443e());
            RectF rectF = new RectF(0.0f, 0.0f, interfaceC0494d.getWidth(), interfaceC0494d.getHeight());
            matrix3.postConcat(C10085a0.m38876d(rectF, C10085a0.m38888p(rectF, interfaceC0494d.mo2192H2().mo26442d()), interfaceC0494d.mo2192H2().mo26442d()));
            matrix3.invert(matrix);
            if (this.f19293b != 2) {
                matrix.postConcat(matrix2);
            }
        }
        m23124e(interfaceC0494d, 0, matrix, new HashMap(), new HashMap());
    }
}
