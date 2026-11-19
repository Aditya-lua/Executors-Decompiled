package o7;

import android.graphics.Path;
import g7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f26816a;
    public final Path.FillType b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n7.c f26817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n7.d f26818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n7.f f26819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n7.f f26820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f26821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n7.b f26822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n7.b f26823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f26824j;

    public e(String str, g gVar, Path.FillType fillType, n7.c cVar, n7.d dVar, n7.f fVar, n7.f fVar2, n7.b bVar, n7.b bVar2, boolean z10) {
        this.f26816a = gVar;
        this.b = fillType;
        this.f26817c = cVar;
        this.f26818d = dVar;
        this.f26819e = fVar;
        this.f26820f = fVar2;
        this.f26821g = str;
        this.f26822h = bVar;
        this.f26823i = bVar2;
        this.f26824j = z10;
    }

    @Override // o7.c
    public i7.c a(h0 h0Var, g7.i iVar, p7.b bVar) {
        return new i7.h(h0Var, iVar, bVar, this);
    }

    public n7.f b() {
        return this.f26820f;
    }

    public Path.FillType c() {
        return this.b;
    }

    public n7.c d() {
        return this.f26817c;
    }

    public g e() {
        return this.f26816a;
    }

    public String f() {
        return this.f26821g;
    }

    public n7.d g() {
        return this.f26818d;
    }

    public n7.f h() {
        return this.f26819e;
    }

    public boolean i() {
        return this.f26824j;
    }
}
