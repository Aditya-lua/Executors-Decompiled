package com.roblox.protocols.designfoundationsplatforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RGBA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f9692a;
    final double b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final double f9693g;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final double f9694r;

    public RGBA(double d10, double d11, double d12, double d13) {
        this.f9694r = d10;
        this.f9693g = d11;
        this.b = d12;
        this.f9692a = d13;
    }

    public double getA() {
        return this.f9692a;
    }

    public double getB() {
        return this.b;
    }

    public double getG() {
        return this.f9693g;
    }

    public double getR() {
        return this.f9694r;
    }

    public String toString() {
        return "RGBA{r=" + this.f9694r + ",g=" + this.f9693g + ",b=" + this.b + ",a=" + this.f9692a + "}";
    }
}
