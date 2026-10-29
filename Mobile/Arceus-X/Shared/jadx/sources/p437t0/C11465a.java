package p437t0;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: t0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11465a {
    /* JADX INFO: renamed from: a */
    public static void m42939a(ImageWriter imageWriter) {
        C11468d.m42946c(imageWriter);
    }

    /* JADX INFO: renamed from: b */
    public static Image m42940b(ImageWriter imageWriter) {
        return C11468d.m42947d(imageWriter);
    }

    /* JADX INFO: renamed from: c */
    public static ImageWriter m42941c(Surface surface, int i10) {
        return C11468d.m42948e(surface, i10);
    }

    /* JADX INFO: renamed from: d */
    public static void m42942d(ImageWriter imageWriter, Image image) {
        C11468d.m42949f(imageWriter, image);
    }

    /* JADX INFO: renamed from: e */
    public static void m42943e(ImageWriter imageWriter, ImageWriter.OnImageReleasedListener onImageReleasedListener, Executor executor) {
        C11468d.m42950g(imageWriter, onImageReleasedListener, executor);
    }
}
