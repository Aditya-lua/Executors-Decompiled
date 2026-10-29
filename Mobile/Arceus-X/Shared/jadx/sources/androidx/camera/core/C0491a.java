package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
import p140g0.AbstractC5919o1;
import p140g0.InterfaceC5895i1;
import p296n0.C8857z3;

/* JADX INFO: renamed from: androidx.camera.core.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0491a implements InterfaceC0494d {

    /* JADX INFO: renamed from: a */
    public final Image f1776a;

    /* JADX INFO: renamed from: b */
    public final a[] f1777b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5895i1 f1778c;

    /* JADX INFO: renamed from: androidx.camera.core.a$a */
    public static final class a implements InterfaceC0494d.a {

        /* JADX INFO: renamed from: a */
        public final Image.Plane f1779a;

        public a(Image.Plane plane) {
            this.f1779a = plane;
        }

        @Override // androidx.camera.core.InterfaceC0494d.a
        /* JADX INFO: renamed from: k */
        public ByteBuffer mo2188k() {
            return this.f1779a.getBuffer();
        }

        @Override // androidx.camera.core.InterfaceC0494d.a
        /* JADX INFO: renamed from: l */
        public int mo2189l() {
            return this.f1779a.getRowStride();
        }

        @Override // androidx.camera.core.InterfaceC0494d.a
        /* JADX INFO: renamed from: m */
        public int mo2190m() {
            return this.f1779a.getPixelStride();
        }
    }

    public C0491a(Image image) {
        this.f1776a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f1777b = new a[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.f1777b[i10] = new a(planes[i10]);
            }
        } else {
            this.f1777b = new a[0];
        }
        this.f1778c = AbstractC5919o1.m26552f(C8857z3.m35562b(), image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // androidx.camera.core.InterfaceC0494d
    /* JADX INFO: renamed from: H1 */
    public InterfaceC0494d.a[] mo2186H1() {
        return this.f1777b;
    }

    @Override // androidx.camera.core.InterfaceC0494d
    /* JADX INFO: renamed from: H2 */
    public InterfaceC5895i1 mo2192H2() {
        return this.f1778c;
    }

    @Override // androidx.camera.core.InterfaceC0494d
    /* JADX INFO: renamed from: M0 */
    public void mo2193M0(Rect rect) {
        this.f1776a.setCropRect(rect);
    }

    @Override // androidx.camera.core.InterfaceC0494d, java.lang.AutoCloseable
    public void close() {
        this.f1776a.close();
    }

    @Override // androidx.camera.core.InterfaceC0494d
    public int getFormat() {
        return this.f1776a.getFormat();
    }

    @Override // androidx.camera.core.InterfaceC0494d
    public int getHeight() {
        return this.f1776a.getHeight();
    }

    @Override // androidx.camera.core.InterfaceC0494d
    public int getWidth() {
        return this.f1776a.getWidth();
    }

    @Override // androidx.camera.core.InterfaceC0494d
    /* JADX INFO: renamed from: p */
    public Image mo2194p() {
        return this.f1776a;
    }
}
