package gn;

import android.graphics.Rect;
import fn.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "", "analyzeViewfinderRegionOnly", "a", "(Lfn/z;Landroid/graphics/Rect;Z)Landroid/graphics/Rect;", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    @NotNull
    public static final Rect a(@NotNull z image, @Nullable Rect rect, boolean z10) {
        Intrinsics.checkNotNullParameter(image, "image");
        return (!z10 || rect == null) ? new Rect(0, 0, image.g().getWidth(), image.g().getHeight()) : jn.d.b(rect, image.d());
    }
}
