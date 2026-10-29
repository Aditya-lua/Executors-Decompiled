package p239k6;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: k6.v */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\n\u001a\u00020\u0000*\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u000e\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0006*\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0015\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016*\n\u0010\u0017\"\u00020\u00002\u00020\u0000*\n\u0010\u0019\"\u00020\u00182\u00020\u0018¨\u0006\u001a"}, m31665d2 = {"Landroid/graphics/Bitmap;", "", "shareable", "Lk6/a;", "b", "(Landroid/graphics/Bitmap;Z)Lk6/a;", "Lk6/n;", "", "width", "height", "e", "(Lk6/n;II)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "config", "f", "(Lk6/n;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "c", "(Landroid/graphics/drawable/Drawable;)Lk6/n;", "Landroid/content/res/Resources;", "resources", "a", "(Lk6/n;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;", "Bitmap", "Landroid/graphics/Canvas;", "Canvas", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7482v {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Drawable m31086a(@NotNull InterfaceC7474n interfaceC7474n, @NotNull Resources resources) {
        if (interfaceC7474n instanceof DrawableImage) {
            return ((DrawableImage) interfaceC7474n).getDrawable();
        }
        return interfaceC7474n instanceof BitmapImage ? new BitmapDrawable(resources, ((BitmapImage) interfaceC7474n).getBitmap()) : new C7475o(interfaceC7474n);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final BitmapImage m31087b(@NotNull Bitmap bitmap, boolean z10) {
        return new BitmapImage(bitmap, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC7474n m31088c(@NotNull Drawable drawable) {
        return drawable instanceof BitmapDrawable ? m31089d(((BitmapDrawable) drawable).getBitmap(), false, 1, null) : new DrawableImage(drawable, false);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ BitmapImage m31089d(Bitmap bitmap, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return m31087b(bitmap, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final Bitmap m31090e(@NotNull InterfaceC7474n interfaceC7474n, int i10, int i11) {
        Bitmap.Config config = interfaceC7474n instanceof BitmapImage ? ((BitmapImage) interfaceC7474n).getBitmap().getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return m31091f(interfaceC7474n, i10, i11, config);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Bitmap m31091f(@NotNull InterfaceC7474n interfaceC7474n, int i10, int i11, @NotNull Bitmap.Config config) {
        if (interfaceC7474n instanceof BitmapImage) {
            BitmapImage bitmapImage = (BitmapImage) interfaceC7474n;
            if (bitmapImage.getBitmap().getWidth() == i10 && bitmapImage.getBitmap().getHeight() == i11 && bitmapImage.getBitmap().getConfig() == config) {
                return bitmapImage.getBitmap();
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, config);
        interfaceC7474n.mo30969b(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Bitmap m31092g(InterfaceC7474n interfaceC7474n, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = interfaceC7474n.getWidth();
        }
        if ((i12 & 2) != 0) {
            i11 = interfaceC7474n.getHeight();
        }
        return m31090e(interfaceC7474n, i10, i11);
    }
}
