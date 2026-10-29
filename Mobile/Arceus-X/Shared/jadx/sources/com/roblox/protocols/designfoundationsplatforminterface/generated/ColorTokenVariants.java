package com.roblox.protocols.designfoundationsplatforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class ColorTokenVariants {
    final RGBA dark;
    final RGBA light;

    public ColorTokenVariants(RGBA rgba, RGBA rgba2) {
        this.dark = rgba;
        this.light = rgba2;
    }

    public RGBA getDark() {
        return this.dark;
    }

    public RGBA getLight() {
        return this.light;
    }

    public String toString() {
        return "ColorTokenVariants{dark=" + this.dark + ",light=" + this.light + "}";
    }
}
