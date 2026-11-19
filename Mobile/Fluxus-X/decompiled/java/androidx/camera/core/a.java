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
    public final Image f1166a;
    public final C0027a[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f1167c;

    /* JADX INFO: renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    public static final class C0027a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image.Plane f1168a;

        public C0027a(Image.Plane plane) {
            this.f1168a = plane;
        }

        @Override // androidx.camera.core.d.a
        public ByteBuffer l() {
            return this.f1168a.getBuffer();
        }

        @Override // androidx.camera.core.d.a
        public int m() {
            return this.f1168a.getRowStride();
        }

        @Override // androidx.camera.core.d.a
        public int n() {
            return this.f1168a.getPixelStride();
        }
    }

    public a(Image image) {
        this.f1166a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new C0027a[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.b[i10] = new C0027a(planes[i10]);
            }
        } else {
            this.b = new C0027a[0];
        }
        this.f1167c = o1.f(z3.b(), image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // androidx.camera.core.d
    public d.a[] H1() {
        return this.b;
    }

    @Override // androidx.camera.core.d
    public i1 L2() {
        return this.f1167c;
    }

    @Override // androidx.camera.core.d
    public void N0(Rect rect) {
        this.f1166a.setCropRect(rect);
    }

    @Override // androidx.camera.core.d, java.lang.AutoCloseable
    public void close() {
        this.f1166a.close();
    }

    @Override // androidx.camera.core.d
    public int getFormat() {
        return this.f1166a.getFormat();
    }

    @Override // androidx.camera.core.d
    public int getHeight() {
        return this.f1166a.getHeight();
    }

    @Override // androidx.camera.core.d
    public int getWidth() {
        return this.f1166a.getWidth();
    }

    @Override // androidx.camera.core.d
    public Image q() {
        return this.f1166a;
    }
}
