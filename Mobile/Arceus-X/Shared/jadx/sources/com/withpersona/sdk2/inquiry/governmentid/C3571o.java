package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import io.C6891m2;
import io.C6903p2;
import io.OverlayAssets;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p226jq.C7288z;
import p229jt.C7345l;
import p261l2.C7975b;
import p497vp.C12238a;
import p497vp.C12239b;
import p497vp.C12240c;
import p497vp.C12246i;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.o */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlay", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "captureSide", "Lio/k2;", "b", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lio/k2;", "", "attr", "Landroid/graphics/drawable/GradientDrawable;", "a", "(Landroid/content/Context;I)Landroid/graphics/drawable/GradientDrawable;", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3571o {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final GradientDrawable m17729a(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        float dimension = context.getResources().getDimension(C12240c.f43195c);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C12240c.f43196d);
        int iM33005c = C7975b.m33005c(context, C12239b.f43192e);
        Integer numM30330f = C7288z.m30330f(context, i10, null, false, 6, null);
        if (numM30330f != null) {
            int iIntValue = numM30330f.intValue();
            int[] Pi2IdFrame = C12246i.f43274a;
            Intrinsics.checkNotNullExpressionValue(Pi2IdFrame, "Pi2IdFrame");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, Pi2IdFrame);
            dimension = typedArrayObtainStyledAttributes.getDimension(C12246i.f43275b, dimension);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C12246i.f43277d, dimensionPixelSize);
            iM33005c = typedArrayObtainStyledAttributes.getColor(C12246i.f43276c, iM33005c);
            typedArrayObtainStyledAttributes.recycle();
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setStroke(dimensionPixelSize, iM33005c);
        return gradientDrawable;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final OverlayAssets m17730b(@NotNull Context context, @NotNull Screen.Overlay overlay, @NotNull IdConfig.EnumC3514b captureSide) {
        int resourceId;
        int resourceId2;
        int i10;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter(captureSide, "captureSide");
        Screen.Overlay.Passport passport = Screen.Overlay.Passport.f13851a;
        if (Intrinsics.m31980c(overlay, passport)) {
            resourceId = C6903p2.f27128c;
        } else if (Intrinsics.m31980c(overlay, Screen.Overlay.Barcode.f13846a)) {
            resourceId = C6903p2.f27126a;
        } else {
            if (!Intrinsics.m31980c(overlay, Screen.Overlay.CornersOnly.f13847a) && !(overlay instanceof Screen.Overlay.Custom) && !Intrinsics.m31980c(overlay, Screen.Overlay.GenericFront.f13850a) && !Intrinsics.m31980c(overlay, Screen.Overlay.Rectangle.f13852a)) {
                throw new C7345l();
            }
            resourceId = captureSide == IdConfig.EnumC3514b.Back ? C6903p2.f27126a : C6903p2.f27127b;
        }
        if (Intrinsics.m31980c(overlay, passport)) {
            resourceId2 = C6891m2.f27006j;
        } else if (Intrinsics.m31980c(overlay, Screen.Overlay.Barcode.f13846a)) {
            resourceId2 = C6891m2.f26997a;
        } else if (Intrinsics.m31980c(overlay, Screen.Overlay.Rectangle.f13852a)) {
            resourceId2 = C6891m2.f26998b;
        } else if (Intrinsics.m31980c(overlay, Screen.Overlay.CornersOnly.f13847a)) {
            resourceId2 = C6891m2.f27002f;
        } else {
            if (!(overlay instanceof Screen.Overlay.Custom) && !Intrinsics.m31980c(overlay, Screen.Overlay.GenericFront.f13850a)) {
                throw new C7345l();
            }
            resourceId2 = C6891m2.f27003g;
        }
        if (Intrinsics.m31980c(overlay, passport)) {
            i10 = C12238a.f43177j;
        } else if (Intrinsics.m31980c(overlay, Screen.Overlay.Barcode.f13846a)) {
            i10 = C12238a.f43173f;
        } else {
            if (!Intrinsics.m31980c(overlay, Screen.Overlay.CornersOnly.f13847a) && !(overlay instanceof Screen.Overlay.Custom) && !Intrinsics.m31980c(overlay, Screen.Overlay.GenericFront.f13850a) && !Intrinsics.m31980c(overlay, Screen.Overlay.Rectangle.f13852a)) {
                throw new C7345l();
            }
            i10 = C12238a.f43176i;
        }
        Integer numM30330f = C7288z.m30330f(context, i10, null, false, 6, null);
        if (numM30330f != null) {
            int iIntValue = numM30330f.intValue();
            int[] Pi2IdFrameGuideAssets = C12246i.f43278e;
            Intrinsics.checkNotNullExpressionValue(Pi2IdFrameGuideAssets, "Pi2IdFrameGuideAssets");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, Pi2IdFrameGuideAssets);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(C12246i.f43279f, resourceId);
            resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C12246i.f43280g, resourceId2);
            typedArrayObtainStyledAttributes.recycle();
        }
        return new OverlayAssets(resourceId, resourceId2);
    }
}
