package com.roblox.protocols.designfoundationsplatforminterface.generated;

import androidx.annotation.Keep;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class DesignTokens {
    final HashMap<String, ColorTokenVariants> colorTokens;

    public DesignTokens(HashMap<String, ColorTokenVariants> map) {
        this.colorTokens = map;
    }

    public HashMap<String, ColorTokenVariants> getColorTokens() {
        return this.colorTokens;
    }

    public String toString() {
        return "DesignTokens{colorTokens=" + this.colorTokens + "}";
    }
}
