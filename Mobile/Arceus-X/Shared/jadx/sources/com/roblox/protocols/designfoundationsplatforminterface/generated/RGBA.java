package com.roblox.protocols.designfoundationsplatforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RGBA {

    /* JADX INFO: renamed from: a */
    final double f12636a;

    /* JADX INFO: renamed from: b */
    final double f12637b;

    /* JADX INFO: renamed from: g */
    final double f12638g;

    /* JADX INFO: renamed from: r */
    final double f12639r;

    public RGBA(double d10, double d11, double d12, double d13) {
        this.f12639r = d10;
        this.f12638g = d11;
        this.f12637b = d12;
        this.f12636a = d13;
    }

    public double getA() {
        return this.f12636a;
    }

    public double getB() {
        return this.f12637b;
    }

    public double getG() {
        return this.f12638g;
    }

    public double getR() {
        return this.f12639r;
    }

    public String toString() {
        return "RGBA{r=" + this.f12639r + ",g=" + this.f12638g + ",b=" + this.f12637b + ",a=" + this.f12636a + "}";
    }
}
