package p281m0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC0494d;
import java.nio.ByteBuffer;
import java.util.Objects;
import p140g0.InterfaceC5895i1;
import p296n0.C8857z3;
import p347p0.C10093i;
import p503w0.C12272b;
import p531x0.AbstractC12578b0;
import p533x2.C12637g;

/* JADX INFO: renamed from: m0.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8335z0 implements InterfaceC0494d {

    /* JADX INFO: renamed from: a */
    public final Object f30738a;

    /* JADX INFO: renamed from: b */
    public final int f30739b;

    /* JADX INFO: renamed from: c */
    public final int f30740c;

    /* JADX INFO: renamed from: d */
    public final Rect f30741d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0494d.a[] f30742e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5895i1 f30743f;

    /* JADX INFO: renamed from: m0.z0$a */
    public class a implements InterfaceC0494d.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f30744a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f30745b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ByteBuffer f30746c;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(int i10, int i11, ByteBuffer byteBuffer) {
            this.f30744a = i10;
            this.f30745b = i11;
            this.f30746c = byteBuffer;
        }

        @Override // androidx.camera.core.InterfaceC0494d.a
        /* JADX INFO: renamed from: k */
        public ByteBuffer mo2188k() {
            return this.f30746c;
        }

        @Override // androidx.camera.core.InterfaceC0494d.a
        /* JADX INFO: renamed from: l */
        public int mo2189l() {
            return this.f30744a;
        }

        @Override // androidx.camera.core.InterfaceC0494d.a
        /* JADX INFO: renamed from: m */
        public int mo2190m() {
            return this.f30745b;
        }
    }

    /* JADX INFO: renamed from: m0.z0$b */
    public class b implements InterfaceC5895i1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f30747a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f30748b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Matrix f30749c;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(long j10, int i10, Matrix matrix) {
            this.f30747a = j10;
            this.f30748b = i10;
            this.f30749c = matrix;
        }

        @Override // p140g0.InterfaceC5895i1
        /* JADX INFO: renamed from: a */
        public void mo26498a(C10093i.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // p140g0.InterfaceC5895i1
        /* JADX INFO: renamed from: c */
        public C8857z3 mo26441c() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // p140g0.InterfaceC5895i1
        /* JADX INFO: renamed from: d */
        public int mo26442d() {
            return this.f30748b;
        }

        @Override // p140g0.InterfaceC5895i1
        /* JADX INFO: renamed from: e */
        public Matrix mo26443e() {
            return new Matrix(this.f30749c);
        }

        @Override // p140g0.InterfaceC5895i1
        public long getTimestamp() {
            return this.f30747a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8335z0(AbstractC12578b0<Bitmap> abstractC12578b0) {
        this(abstractC12578b0.mo46929c(), abstractC12578b0.mo46928b(), abstractC12578b0.mo46932f(), abstractC12578b0.mo46933g(), abstractC12578b0.mo46927a().getTimestamp());
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5895i1 m33885b(long j10, int i10, Matrix matrix) {
        return new b(j10, i10, matrix);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0494d.a m33886c(ByteBuffer byteBuffer, int i10, int i11) {
        return new a(i10, i11, byteBuffer);
    }

    @Override // androidx.camera.core.InterfaceC0494d
    /* JADX INFO: renamed from: H1 */
    public InterfaceC0494d.a[] mo2186H1() {
        InterfaceC0494d.a[] aVarArr;
        synchronized (this.f30738a) {
            m33887a();
            InterfaceC0494d.a[] aVarArr2 = this.f30742e;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    @Override // androidx.camera.core.InterfaceC0494d
    /* JADX INFO: renamed from: H2 */
    public InterfaceC5895i1 mo2192H2() {
        InterfaceC5895i1 interfaceC5895i1;
        synchronized (this.f30738a) {
            m33887a();
            interfaceC5895i1 = this.f30743f;
        }
        return interfaceC5895i1;
    }

    @Override // androidx.camera.core.InterfaceC0494d
    /* JADX INFO: renamed from: M0 */
    public void mo2193M0(Rect rect) {
        synchronized (this.f30738a) {
            try {
                m33887a();
                if (rect != null) {
                    this.f30741d.set(rect);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m33887a() {
        synchronized (this.f30738a) {
            C12637g.m47078j(this.f30742e != null, "The image is closed.");
        }
    }

    @Override // androidx.camera.core.InterfaceC0494d, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f30738a) {
            m33887a();
            this.f30742e = null;
        }
    }

    @Override // androidx.camera.core.InterfaceC0494d
    public int getFormat() {
        synchronized (this.f30738a) {
            m33887a();
        }
        return 1;
    }

    @Override // androidx.camera.core.InterfaceC0494d
    public int getHeight() {
        int i10;
        synchronized (this.f30738a) {
            m33887a();
            i10 = this.f30740c;
        }
        return i10;
    }

    @Override // androidx.camera.core.InterfaceC0494d
    public int getWidth() {
        int i10;
        synchronized (this.f30738a) {
            m33887a();
            i10 = this.f30739b;
        }
        return i10;
    }

    @Override // androidx.camera.core.InterfaceC0494d
    /* JADX INFO: renamed from: p */
    public Image mo2194p() {
        synchronized (this.f30738a) {
            m33887a();
        }
        return null;
    }

    public C8335z0(Bitmap bitmap, Rect rect, int i10, Matrix matrix, long j10) {
        this(C12272b.m45557f(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i10, matrix, j10);
    }

    public C8335z0(ByteBuffer byteBuffer, int i10, int i11, int i12, Rect rect, int i13, Matrix matrix, long j10) {
        this.f30738a = new Object();
        this.f30739b = i11;
        this.f30740c = i12;
        this.f30741d = rect;
        this.f30743f = m33885b(j10, i13, matrix);
        byteBuffer.rewind();
        this.f30742e = new InterfaceC0494d.a[]{m33886c(byteBuffer, i11 * i10, i10)};
    }
}
