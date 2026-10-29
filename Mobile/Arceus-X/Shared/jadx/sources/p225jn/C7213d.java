package p225jn;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.InterfaceC5719z;

/* JADX INFO: renamed from: jn.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Ljn/c;", "Lfn/z;", "imageToAnalyze", "Landroid/graphics/Rect;", "a", "(Ljn/c;Lfn/z;)Landroid/graphics/Rect;", "", "degrees", "b", "(Landroid/graphics/Rect;I)Landroid/graphics/Rect;", "camera_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7213d {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Rect m30144a(@NotNull ViewfinderInfo viewfinderInfo, @NotNull InterfaceC5719z imageToAnalyze) {
        int height;
        int width;
        double d10;
        Intrinsics.checkNotNullParameter(viewfinderInfo, "<this>");
        Intrinsics.checkNotNullParameter(imageToAnalyze, "imageToAnalyze");
        int iWidth = viewfinderInfo.getViewport().width();
        int iHeight = viewfinderInfo.getViewport().height();
        if (iWidth == 0 || iHeight == 0) {
            return null;
        }
        if (imageToAnalyze.mo25779d() == 90 || imageToAnalyze.mo25779d() == 270) {
            height = imageToAnalyze.getHeight();
            width = imageToAnalyze.getWidth();
        } else {
            height = imageToAnalyze.getWidth();
            width = imageToAnalyze.getHeight();
        }
        double d11 = height;
        double d12 = iWidth;
        double d13 = d11 / d12;
        double d14 = width;
        double d15 = iHeight;
        double d16 = d14 / d15;
        double dMin = Math.min(d13, d16);
        double d17 = 0.0d;
        if (d13 > d16) {
            d10 = 0.0d;
            d17 = (d11 - (d12 * dMin)) / 2.0d;
        } else {
            d10 = (d14 - (d15 * dMin)) / 2.0d;
        }
        double d18 = d17 + (((double) (viewfinderInfo.getRegion().left - viewfinderInfo.getViewport().left)) * dMin);
        double d19 = d10 + (((double) (viewfinderInfo.getRegion().top - viewfinderInfo.getViewport().top)) * dMin);
        double dWidth = ((double) viewfinderInfo.getRegion().width()) * dMin;
        double dHeight = ((double) viewfinderInfo.getRegion().height()) * dMin;
        return (imageToAnalyze.mo25779d() == 90 || imageToAnalyze.mo25779d() == 270) ? new Rect((int) d19, (int) d18, (int) (d19 + dHeight), (int) (d18 + dWidth)) : new Rect((int) d18, (int) d19, (int) (d18 + dWidth), (int) (d19 + dHeight));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Rect m30145b(@NotNull Rect rect, int i10) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return (i10 == 90 || i10 == 270) ? new Rect(rect.top, rect.left, rect.bottom, rect.right) : rect;
    }
}
