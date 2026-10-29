package gn;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.InterfaceC5719z;
import p225jn.C7213d;

/* JADX INFO: renamed from: gn.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lfn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "", "analyzeViewfinderRegionOnly", "a", "(Lfn/z;Landroid/graphics/Rect;Z)Landroid/graphics/Rect;", "camera_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6142f {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Rect m27128a(@NotNull InterfaceC5719z image, @Nullable Rect rect, boolean z10) {
        Intrinsics.checkNotNullParameter(image, "image");
        return (!z10 || rect == null) ? new Rect(0, 0, image.mo25782g().getWidth(), image.mo25782g().getHeight()) : C7213d.m30145b(rect, image.mo25779d());
    }
}
