package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import g0.i1;
import g0.o1;
import java.nio.ByteBuffer;
import n0.z3;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f1204a;
    public final C0015a[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f1205c;

    /* JADX INFO: renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    public static final class C0015a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image.Plane f1206a;

        public C0015a(Image.Plane plane) {
            this.f1206a = plane;
        }

        @Override // androidx.camera.core.d.a
        public ByteBuffer k() {
            return this.f1206a.getBuffer();
        }

        @Override // androidx.camera.core.d.a
        public int l() {
            return this.f1206a.getRowStride();
        }

        @Override // androidx.camera.core.d.a
        public int m() {
            return this.f1206a.getPixelStride();
        }
    }

    public a(Image image) {
        this.f1204a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new C0015a[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.b[i10] = new C0015a(planes[i10]);
            }
        } else {
            this.b = new C0015a[0];
        }
        this.f1205c = o1.f(z3.b(), image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // androidx.camera.core.d
    public d.a[] E1() {
        return this.b;
    }

    @Override // androidx.camera.core.d
    public void I0(Rect rect) {
        this.f1204a.setCropRect(rect);
    }

    @Override // androidx.camera.core.d
    public i1 I2() {
        return this.f1205c;
    }

    @Override // androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        this.f1204a.close();
    }

    @Override // androidx.camera.core.d
    public int getFormat() {
        return this.f1204a.getFormat();
    }

    @Override // androidx.camera.core.d
    public int getHeight() {
        return this.f1204a.getHeight();
    }

    @Override // androidx.camera.core.d
    public int getWidth() {
        return this.f1204a.getWidth();
    }

    @Override // androidx.camera.core.d
    public Image p() {
        return this.f1204a;
    }
}
