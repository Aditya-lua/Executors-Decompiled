package p437t0;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.concurrent.Executor;
import p347p0.C10099o;

/* JADX INFO: renamed from: t0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C11468d {
    /* JADX INFO: renamed from: c */
    public static void m42946c(ImageWriter imageWriter) {
        imageWriter.close();
    }

    /* JADX INFO: renamed from: d */
    public static Image m42947d(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    /* JADX INFO: renamed from: e */
    public static ImageWriter m42948e(Surface surface, int i10) {
        return ImageWriter.newInstance(surface, i10);
    }

    /* JADX INFO: renamed from: f */
    public static void m42949f(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }

    /* JADX INFO: renamed from: g */
    public static void m42950g(ImageWriter imageWriter, final ImageWriter.OnImageReleasedListener onImageReleasedListener, final Executor executor) {
        imageWriter.setOnImageReleasedListener(new ImageWriter.OnImageReleasedListener() { // from class: t0.b
            @Override // android.media.ImageWriter.OnImageReleasedListener
            public final void onImageReleased(ImageWriter imageWriter2) {
                executor.execute(new Runnable() { // from class: t0.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        onImageReleasedListener.onImageReleased(imageWriter2);
                    }
                });
            }
        }, C10099o.m38990a());
    }
}
