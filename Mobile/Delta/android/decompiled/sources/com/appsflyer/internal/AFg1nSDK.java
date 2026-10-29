package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1nSDK implements AFg1qSDK {

    @NotNull
    private Map<String, String> unregisterClient = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFg1qSDK
    @NotNull
    public final Map<String, String> registerClient(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (this.unregisterClient.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i10 = resources.getConfiguration().screenLayout & 15;
            this.unregisterClient.put("xdp", String.valueOf(displayMetrics.xdpi));
            this.unregisterClient.put("ydp", String.valueOf(displayMetrics.ydpi));
            this.unregisterClient.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.unregisterClient.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.unregisterClient.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.unregisterClient.put("size", String.valueOf(i10));
        }
        return this.unregisterClient;
    }
}
