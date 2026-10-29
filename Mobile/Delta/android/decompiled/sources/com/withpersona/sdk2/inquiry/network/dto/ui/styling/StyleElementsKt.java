package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"displayMetrics", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "pxToDp", "", "getPxToDp", "(D)D", "network-inquiry_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class StyleElementsKt {
    private static final DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getPxToDp(double d10) {
        return d10 / ((double) displayMetrics.density);
    }
}
