package vo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/content/Context;", "Lvo/y3$f;", "overlay", "Lvo/d3$e;", "captureSide", "Lvo/j3;", "b", "(Landroid/content/Context;Lvo/y3$f;Lvo/d3$e;)Lvo/j3;", BuildConfig.FLAVOR, "attr", "Landroid/graphics/drawable/GradientDrawable;", "a", "(Landroid/content/Context;I)Landroid/graphics/drawable/GradientDrawable;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g3 {
    @NotNull
    public static final GradientDrawable a(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        float dimension = context.getResources().getDimension(jq.c.f20850c);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(jq.c.f20851d);
        int iC = l2.b.c(context, jq.b.f20848e);
        Integer numF = xq.z.f(context, i10, null, false, 6, null);
        if (numF != null) {
            int iIntValue = numF.intValue();
            int[] Pi2IdFrame = jq.i.f20899a;
            Intrinsics.checkNotNullExpressionValue(Pi2IdFrame, "Pi2IdFrame");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, Pi2IdFrame);
            dimension = typedArrayObtainStyledAttributes.getDimension(jq.i.b, dimension);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(jq.i.f20901d, dimensionPixelSize);
            iC = typedArrayObtainStyledAttributes.getColor(jq.i.f20900c, iC);
            typedArrayObtainStyledAttributes.recycle();
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setStroke(dimensionPixelSize, iC);
        return gradientDrawable;
    }

    @NotNull
    public static final OverlayAssets b(@NotNull Context context, @NotNull y3.f overlay, @NotNull IdConfig.e captureSide) {
        int resourceId;
        int resourceId2;
        int i10;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter(captureSide, "captureSide");
        y3.f.e eVar = y3.f.e.f35122a;
        if (Intrinsics.c(overlay, eVar)) {
            resourceId = p3.f34950c;
        } else if (Intrinsics.c(overlay, y3.f.a.f35118a)) {
            resourceId = p3.f34949a;
        } else {
            if (!Intrinsics.c(overlay, y3.f.b.f35119a) && !(overlay instanceof y3.f.c) && !Intrinsics.c(overlay, y3.f.d.f35121a) && !Intrinsics.c(overlay, y3.f.C0721f.f35123a)) {
                throw new zt.l();
            }
            resourceId = captureSide == IdConfig.e.Back ? p3.f34949a : p3.b;
        }
        if (Intrinsics.c(overlay, eVar)) {
            resourceId2 = m3.f34835j;
        } else if (Intrinsics.c(overlay, y3.f.a.f35118a)) {
            resourceId2 = m3.f34827a;
        } else if (Intrinsics.c(overlay, y3.f.C0721f.f35123a)) {
            resourceId2 = m3.b;
        } else if (Intrinsics.c(overlay, y3.f.b.f35119a)) {
            resourceId2 = m3.f34831f;
        } else {
            if (!(overlay instanceof y3.f.c) && !Intrinsics.c(overlay, y3.f.d.f35121a)) {
                throw new zt.l();
            }
            resourceId2 = m3.f34832g;
        }
        if (Intrinsics.c(overlay, eVar)) {
            i10 = jq.a.f20834j;
        } else if (Intrinsics.c(overlay, y3.f.a.f35118a)) {
            i10 = jq.a.f20830f;
        } else {
            if (!Intrinsics.c(overlay, y3.f.b.f35119a) && !(overlay instanceof y3.f.c) && !Intrinsics.c(overlay, y3.f.d.f35121a) && !Intrinsics.c(overlay, y3.f.C0721f.f35123a)) {
                throw new zt.l();
            }
            i10 = jq.a.f20833i;
        }
        Integer numF = xq.z.f(context, i10, null, false, 6, null);
        if (numF != null) {
            int iIntValue = numF.intValue();
            int[] Pi2IdFrameGuideAssets = jq.i.f20902e;
            Intrinsics.checkNotNullExpressionValue(Pi2IdFrameGuideAssets, "Pi2IdFrameGuideAssets");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, Pi2IdFrameGuideAssets);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(jq.i.f20903f, resourceId);
            resourceId2 = typedArrayObtainStyledAttributes.getResourceId(jq.i.f20904g, resourceId2);
            typedArrayObtainStyledAttributes.recycle();
        }
        return new OverlayAssets(resourceId, resourceId2);
    }
}
