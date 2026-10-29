package n7;

import android.graphics.Path;
import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class p implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25199a;
    public final Path.FillType b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7.a f25201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m7.d f25202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25203f;

    public p(String str, boolean z10, Path.FillType fillType, m7.a aVar, m7.d dVar, boolean z11) {
        this.f25200c = str;
        this.f25199a = z10;
        this.b = fillType;
        this.f25201d = aVar;
        this.f25202e = dVar;
        this.f25203f = z11;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.g(h0Var, bVar, this);
    }

    public m7.a b() {
        return this.f25201d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.f25200c;
    }

    public m7.d e() {
        return this.f25202e;
    }

    public boolean f() {
        return this.f25203f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f25199a + '}';
    }
}
