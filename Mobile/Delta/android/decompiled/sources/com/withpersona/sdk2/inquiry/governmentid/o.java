package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import io.OverlayAssets;
import io.m2;
import io.p2;
import jq.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "overlay", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "captureSide", "Lio/k2;", "b", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lio/k2;", "", "attr", "Landroid/graphics/drawable/GradientDrawable;", "a", "(Landroid/content/Context;I)Landroid/graphics/drawable/GradientDrawable;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {
    @NotNull
    public static final GradientDrawable a(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        float dimension = context.getResources().getDimension(vp.c.f33365c);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(vp.c.f33366d);
        int iC = l2.b.c(context, vp.b.f33363e);
        Integer numF = z.f(context, i10, null, false, 6, null);
        if (numF != null) {
            int iIntValue = numF.intValue();
            int[] Pi2IdFrame = vp.i.f33414a;
            Intrinsics.checkNotNullExpressionValue(Pi2IdFrame, "Pi2IdFrame");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, Pi2IdFrame);
            dimension = typedArrayObtainStyledAttributes.getDimension(vp.i.b, dimension);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(vp.i.f33416d, dimensionPixelSize);
            iC = typedArrayObtainStyledAttributes.getColor(vp.i.f33415c, iC);
            typedArrayObtainStyledAttributes.recycle();
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setStroke(dimensionPixelSize, iC);
        return gradientDrawable;
    }

    @NotNull
    public static final OverlayAssets b(@NotNull Context context, @NotNull Screen.Overlay overlay, @NotNull IdConfig.b captureSide) {
        int resourceId;
        int resourceId2;
        int i10;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter(captureSide, "captureSide");
        Screen.Overlay.Passport passport = Screen.Overlay.Passport.f10713a;
        if (Intrinsics.c(overlay, passport)) {
            resourceId = p2.f20772c;
        } else if (Intrinsics.c(overlay, Screen.Overlay.Barcode.f10709a)) {
            resourceId = p2.f20771a;
        } else {
            if (!Intrinsics.c(overlay, Screen.Overlay.CornersOnly.f10710a) && !(overlay instanceof Screen.Overlay.Custom) && !Intrinsics.c(overlay, Screen.Overlay.GenericFront.f10712a) && !Intrinsics.c(overlay, Screen.Overlay.Rectangle.f10714a)) {
                throw new jt.l();
            }
            resourceId = captureSide == IdConfig.b.Back ? p2.f20771a : p2.b;
        }
        if (Intrinsics.c(overlay, passport)) {
            resourceId2 = m2.f20698j;
        } else if (Intrinsics.c(overlay, Screen.Overlay.Barcode.f10709a)) {
            resourceId2 = m2.f20690a;
        } else if (Intrinsics.c(overlay, Screen.Overlay.Rectangle.f10714a)) {
            resourceId2 = m2.b;
        } else if (Intrinsics.c(overlay, Screen.Overlay.CornersOnly.f10710a)) {
            resourceId2 = m2.f20694f;
        } else {
            if (!(overlay instanceof Screen.Overlay.Custom) && !Intrinsics.c(overlay, Screen.Overlay.GenericFront.f10712a)) {
                throw new jt.l();
            }
            resourceId2 = m2.f20695g;
        }
        if (Intrinsics.c(overlay, passport)) {
            i10 = vp.a.f33349j;
        } else if (Intrinsics.c(overlay, Screen.Overlay.Barcode.f10709a)) {
            i10 = vp.a.f33345f;
        } else {
            if (!Intrinsics.c(overlay, Screen.Overlay.CornersOnly.f10710a) && !(overlay instanceof Screen.Overlay.Custom) && !Intrinsics.c(overlay, Screen.Overlay.GenericFront.f10712a) && !Intrinsics.c(overlay, Screen.Overlay.Rectangle.f10714a)) {
                throw new jt.l();
            }
            i10 = vp.a.f33348i;
        }
        Integer numF = z.f(context, i10, null, false, 6, null);
        if (numF != null) {
            int iIntValue = numF.intValue();
            int[] Pi2IdFrameGuideAssets = vp.i.f33417e;
            Intrinsics.checkNotNullExpressionValue(Pi2IdFrameGuideAssets, "Pi2IdFrameGuideAssets");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, Pi2IdFrameGuideAssets);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(vp.i.f33418f, resourceId);
            resourceId2 = typedArrayObtainStyledAttributes.getResourceId(vp.i.f33419g, resourceId2);
            typedArrayObtainStyledAttributes.recycle();
        }
        return new OverlayAssets(resourceId, resourceId2);
    }
}
