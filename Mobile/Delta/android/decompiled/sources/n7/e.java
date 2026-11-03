package n7;

import android.graphics.Path;
import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f25941a;
    public final Path.FillType b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.c f25942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7.d f25943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m7.f f25944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m7.f f25945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m7.b f25947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m7.b f25948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f25949j;

    public e(String str, g gVar, Path.FillType fillType, m7.c cVar, m7.d dVar, m7.f fVar, m7.f fVar2, m7.b bVar, m7.b bVar2, boolean z10) {
        this.f25941a = gVar;
        this.b = fillType;
        this.f25942c = cVar;
        this.f25943d = dVar;
        this.f25944e = fVar;
        this.f25945f = fVar2;
        this.f25946g = str;
        this.f25947h = bVar;
        this.f25948i = bVar2;
        this.f25949j = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.h(h0Var, iVar, bVar, this);
    }

    public m7.f b() {
        return this.f25945f;
    }

    public Path.FillType c() {
        return this.b;
    }

    public m7.c d() {
        return this.f25942c;
    }

    public g e() {
        return this.f25941a;
    }

    public String f() {
        return this.f25946g;
    }

    public m7.d g() {
        return this.f25943d;
    }

    public m7.f h() {
        return this.f25944e;
    }

    public boolean i() {
        return this.f25949j;
    }
}
