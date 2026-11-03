package com.roblox.protocols.designfoundationsplatforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RGBA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f9773a;
    final double b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final double f9774g;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final double f9775r;

    public RGBA(double d10, double d11, double d12, double d13) {
        this.f9775r = d10;
        this.f9774g = d11;
        this.b = d12;
        this.f9773a = d13;
    }

    public double getA() {
        return this.f9773a;
    }

    public double getB() {
        return this.b;
    }

    public double getG() {
        return this.f9774g;
    }

    public double getR() {
        return this.f9775r;
    }

    public String toString() {
        return "RGBA{r=" + this.f9775r + ",g=" + this.f9774g + ",b=" + this.b + ",a=" + this.f9773a + "}";
    }
}
