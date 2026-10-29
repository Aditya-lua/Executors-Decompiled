package p140g0;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.C0491a;
import androidx.camera.core.InterfaceC0494d;
import java.util.concurrent.Executor;
import p296n0.InterfaceC8775j2;
import p347p0.C10099o;

/* JADX INFO: renamed from: g0.c */
/* JADX INFO: loaded from: classes.dex */
public class C5869c implements InterfaceC8775j2 {

    /* JADX INFO: renamed from: a */
    public final ImageReader f22384a;

    /* JADX INFO: renamed from: b */
    public final Object f22385b = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f22386c = true;

    public C5869c(ImageReader imageReader) {
        this.f22384a = imageReader;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m26312a(final C5869c c5869c, Executor executor, final InterfaceC8775j2.a aVar, ImageReader imageReader) {
        synchronized (c5869c.f22385b) {
            try {
                if (!c5869c.f22386c) {
                    executor.execute(new Runnable() { // from class: g0.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5869c.m26313h(this.f22375a, aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m26313h(C5869c c5869c, InterfaceC8775j2.a aVar) {
        c5869c.getClass();
        aVar.mo26326a(c5869c);
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: b */
    public InterfaceC0494d mo2208b() {
        Image imageAcquireLatestImage;
        synchronized (this.f22385b) {
            try {
                imageAcquireLatestImage = this.f22384a.acquireLatestImage();
            } catch (RuntimeException e10) {
                if (!m26314i(e10)) {
                    throw e10;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new C0491a(imageAcquireLatestImage);
        }
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: c */
    public int mo2209c() {
        int imageFormat;
        synchronized (this.f22385b) {
            imageFormat = this.f22384a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // p296n0.InterfaceC8775j2
    public void close() {
        synchronized (this.f22385b) {
            this.f22384a.close();
        }
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: d */
    public void mo2210d() {
        synchronized (this.f22385b) {
            this.f22386c = true;
            this.f22384a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: e */
    public int mo2211e() {
        int maxImages;
        synchronized (this.f22385b) {
            maxImages = this.f22384a.getMaxImages();
        }
        return maxImages;
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: f */
    public void mo2212f(final InterfaceC8775j2.a aVar, final Executor executor) {
        synchronized (this.f22385b) {
            this.f22386c = false;
            this.f22384a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: g0.a
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C5869c.m26312a(this.f22355a, executor, aVar, imageReader);
                }
            }, C10099o.m38990a());
        }
    }

    @Override // p296n0.InterfaceC8775j2
    /* JADX INFO: renamed from: g */
    public InterfaceC0494d mo2213g() {
        Image imageAcquireNextImage;
        synchronized (this.f22385b) {
            try {
                imageAcquireNextImage = this.f22384a.acquireNextImage();
            } catch (RuntimeException e10) {
                if (!m26314i(e10)) {
                    throw e10;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new C0491a(imageAcquireNextImage);
        }
    }

    @Override // p296n0.InterfaceC8775j2
    public int getHeight() {
        int height;
        synchronized (this.f22385b) {
            height = this.f22384a.getHeight();
        }
        return height;
    }

    @Override // p296n0.InterfaceC8775j2
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f22385b) {
            surface = this.f22384a.getSurface();
        }
        return surface;
    }

    @Override // p296n0.InterfaceC8775j2
    public int getWidth() {
        int width;
        synchronized (this.f22385b) {
            width = this.f22384a.getWidth();
        }
        return width;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m26314i(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }
}
