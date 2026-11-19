package tn;

import android.graphics.Rect;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import sn.l0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsn/l0;", "image", "Landroid/graphics/Rect;", "viewfinderRect", BuildConfig.FLAVOR, "analyzeViewfinderRegionOnly", "a", "(Lsn/l0;Landroid/graphics/Rect;Z)Landroid/graphics/Rect;", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    @NotNull
    public static final Rect a(@NotNull l0 image, @Nullable Rect rect, boolean z10) {
        Intrinsics.checkNotNullParameter(image, "image");
        return (!z10 || rect == null) ? new Rect(0, 0, image.c().getWidth(), image.c().getHeight()) : wn.d.b(rect, image.d());
    }
}
