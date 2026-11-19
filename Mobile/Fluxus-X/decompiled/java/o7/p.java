package o7;

import android.graphics.Path;
import g7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class p implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26895a;
    public final Path.FillType b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n7.a f26897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n7.d f26898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26899f;

    public p(String str, boolean z10, Path.FillType fillType, n7.a aVar, n7.d dVar, boolean z11) {
        this.f26896c = str;
        this.f26895a = z10;
        this.b = fillType;
        this.f26897d = aVar;
        this.f26898e = dVar;
        this.f26899f = z11;
    }

    @Override // o7.c
    public i7.c a(h0 h0Var, g7.i iVar, p7.b bVar) {
        return new i7.g(h0Var, bVar, this);
    }

    public n7.a b() {
        return this.f26897d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.f26896c;
    }

    public n7.d e() {
        return this.f26898e;
    }

    public boolean f() {
        return this.f26899f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f26895a + '}';
    }
}
