package de;

import ae.v0;
import be.y0;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f14637a;
    public final y0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f14638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f14639d;

    public t(y0 y0Var, y0 y0Var2, y0 y0Var3, y0 y0Var4) {
        this.f14637a = y0Var;
        this.b = y0Var2;
        this.f14638c = y0Var3;
        this.f14639d = y0Var4;
    }

    @Override // be.y0
    public final /* bridge */ /* synthetic */ Object zza() {
        return new a(((ae.k) this.f14637a).a(), (File) this.b.zza(), (v0) this.f14638c.zza(), be.v0.a(this.f14639d));
    }
}
