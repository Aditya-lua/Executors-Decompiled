package g0;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c implements n0.j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageReader f17348a;
    public final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17349c = true;

    public c(ImageReader imageReader) {
        this.f17348a = imageReader;
    }

    public static /* synthetic */ void a(final c cVar, Executor executor, final n0.j2.a aVar, ImageReader imageReader) {
        synchronized (cVar.b) {
            try {
                if (!cVar.f17349c) {
                    executor.execute(new Runnable() { // from class: g0.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.h(this.f17341a, aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void h(c cVar, n0.j2.a aVar) {
        cVar.getClass();
        aVar.a(cVar);
    }

    @Override // n0.j2
    public androidx.camera.core.d b() {
        Image imageAcquireLatestImage;
        synchronized (this.b) {
            try {
                imageAcquireLatestImage = this.f17348a.acquireLatestImage();
            } catch (RuntimeException e10) {
                if (!i(e10)) {
                    throw e10;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new androidx.camera.core.a(imageAcquireLatestImage);
        }
    }

    @Override // n0.j2
    public int c() {
        int imageFormat;
        synchronized (this.b) {
            imageFormat = this.f17348a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // n0.j2
    public void close() {
        synchronized (this.b) {
            this.f17348a.close();
        }
    }

    @Override // n0.j2
    public void d() {
        synchronized (this.b) {
            this.f17349c = true;
            this.f17348a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // n0.j2
    public int e() {
        int maxImages;
        synchronized (this.b) {
            maxImages = this.f17348a.getMaxImages();
        }
        return maxImages;
    }

    @Override // n0.j2
    public void f(final n0.j2.a aVar, final Executor executor) {
        synchronized (this.b) {
            this.f17349c = false;
            this.f17348a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: g0.a
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    c.a(this.f17326a, executor, aVar, imageReader);
                }
            }, p0.o.a());
        }
    }

    @Override // n0.j2
    public androidx.camera.core.d g() {
        Image imageAcquireNextImage;
        synchronized (this.b) {
            try {
                imageAcquireNextImage = this.f17348a.acquireNextImage();
            } catch (RuntimeException e10) {
                if (!i(e10)) {
                    throw e10;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new androidx.camera.core.a(imageAcquireNextImage);
        }
    }

    @Override // n0.j2
    public int getHeight() {
        int height;
        synchronized (this.b) {
            height = this.f17348a.getHeight();
        }
        return height;
    }

    @Override // n0.j2
    public Surface getSurface() {
        Surface surface;
        synchronized (this.b) {
            surface = this.f17348a.getSurface();
        }
        return surface;
    }

    @Override // n0.j2
    public int getWidth() {
        int width;
        synchronized (this.b) {
            width = this.f17348a.getWidth();
        }
        return width;
    }

    public final boolean i(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }
}
