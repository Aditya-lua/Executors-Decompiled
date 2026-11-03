package n7;

import android.graphics.Path;
import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class p implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26020a;
    public final Path.FillType b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7.a f26022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m7.d f26023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26024f;

    public p(String str, boolean z10, Path.FillType fillType, m7.a aVar, m7.d dVar, boolean z11) {
        this.f26021c = str;
        this.f26020a = z10;
        this.b = fillType;
        this.f26022d = aVar;
        this.f26023e = dVar;
        this.f26024f = z11;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.g(h0Var, bVar, this);
    }

    public m7.a b() {
        return this.f26022d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.f26021c;
    }

    public m7.d e() {
        return this.f26023e;
    }

    public boolean f() {
        return this.f26024f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f26020a + '}';
    }
}
