package p096e7;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e7.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u0015\u0010\u0001\u001a\u00020\u0000*\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\" \u0010\b\u001a\u00020\u0003*\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\f\u001a\u00020\u0003*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001e\u0010\u0011\u001a\u00020\r*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0014\u001a\u00020\u0000*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Landroid/graphics/Bitmap$Config;", "e", "(Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap$Config;", "", "b", "(Landroid/graphics/Bitmap$Config;)I", "getBytesPerPixel$annotations", "(Landroid/graphics/Bitmap$Config;)V", "bytesPerPixel", "Landroid/graphics/Bitmap;", "a", "(Landroid/graphics/Bitmap;)I", "allocationByteCountCompat", "", "d", "(Landroid/graphics/Bitmap$Config;)Z", "isHardware$annotations", "isHardware", "c", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap$Config;", "safeConfig", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4848b {
    /* JADX INFO: renamed from: a */
    public static final int m23409a(@NotNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                return bitmap.getWidth() * bitmap.getHeight() * m23410b(bitmap.getConfig());
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    /* JADX INFO: renamed from: b */
    public static final int m23410b(@Nullable Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        return config == Bitmap.Config.RGBA_F16 ? 8 : 4;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Bitmap.Config m23411c(@NotNull Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m23412d(@NotNull Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final Bitmap.Config m23413e(@Nullable Bitmap.Config config) {
        return (config == null || m23412d(config)) ? Bitmap.Config.ARGB_8888 : config;
    }
}
