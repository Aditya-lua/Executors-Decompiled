package m0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
import java.util.Objects;
import n0.z3;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements androidx.camera.core.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24339a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f24341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.camera.core.d.a[] f24342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0.i1 f24343f;

    public class a implements androidx.camera.core.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f24344a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f24345c;

        public a(int i10, int i11, ByteBuffer byteBuffer) {
            this.f24344a = i10;
            this.b = i11;
            this.f24345c = byteBuffer;
        }

        @Override // androidx.camera.core.d.a
        public ByteBuffer k() {
            return this.f24345c;
        }

        @Override // androidx.camera.core.d.a
        public int l() {
            return this.f24344a;
        }

        @Override // androidx.camera.core.d.a
        public int m() {
            return this.b;
        }
    }

    public class b implements g0.i1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f24346a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Matrix f24347c;

        public b(long j10, int i10, Matrix matrix) {
            this.f24346a = j10;
            this.b = i10;
            this.f24347c = matrix;
        }

        @Override // g0.i1
        public void a(p0.i.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // g0.i1
        public z3 c() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // g0.i1
        public int d() {
            return this.b;
        }

        @Override // g0.i1
        public Matrix e() {
            return new Matrix(this.f24347c);
        }

        @Override // g0.i1
        public long getTimestamp() {
            return this.f24346a;
        }
    }

    public z0(x0.b0<Bitmap> b0Var) {
        this(b0Var.c(), b0Var.b(), b0Var.f(), b0Var.g(), b0Var.a().getTimestamp());
    }

    public static g0.i1 b(long j10, int i10, Matrix matrix) {
        return new b(j10, i10, matrix);
    }

    public static androidx.camera.core.d.a c(ByteBuffer byteBuffer, int i10, int i11) {
        return new a(i10, i11, byteBuffer);
    }

    @Override // androidx.camera.core.d
    public androidx.camera.core.d.a[] E1() {
        androidx.camera.core.d.a[] aVarArr;
        synchronized (this.f24339a) {
            a();
            androidx.camera.core.d.a[] aVarArr2 = this.f24342e;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    @Override // androidx.camera.core.d
    public void I0(Rect rect) {
        synchronized (this.f24339a) {
            try {
                a();
                if (rect != null) {
                    this.f24341d.set(rect);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.d
    public g0.i1 I2() {
        g0.i1 i1Var;
        synchronized (this.f24339a) {
            a();
            i1Var = this.f24343f;
        }
        return i1Var;
    }

    public final void a() {
        synchronized (this.f24339a) {
            x2.g.j(this.f24342e != null, "The image is closed.");
        }
    }

    @Override // androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f24339a) {
            a();
            this.f24342e = null;
        }
    }

    @Override // androidx.camera.core.d
    public int getFormat() {
        synchronized (this.f24339a) {
            a();
        }
        return 1;
    }

    @Override // androidx.camera.core.d
    public int getHeight() {
        int i10;
        synchronized (this.f24339a) {
            a();
            i10 = this.f24340c;
        }
        return i10;
    }

    @Override // androidx.camera.core.d
    public int getWidth() {
        int i10;
        synchronized (this.f24339a) {
            a();
            i10 = this.b;
        }
        return i10;
    }

    @Override // androidx.camera.core.d
    public Image p() {
        synchronized (this.f24339a) {
            a();
        }
        return null;
    }

    public z0(Bitmap bitmap, Rect rect, int i10, Matrix matrix, long j10) {
        this(w0.b.f(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i10, matrix, j10);
    }

    public z0(ByteBuffer byteBuffer, int i10, int i11, int i12, Rect rect, int i13, Matrix matrix, long j10) {
        this.f24339a = new Object();
        this.b = i11;
        this.f24340c = i12;
        this.f24341d = rect;
        this.f24343f = b(j10, i13, matrix);
        byteBuffer.rewind();
        this.f24342e = new androidx.camera.core.d.a[]{c(byteBuffer, i11 * i10, i10)};
    }
}
