package n7;

import android.graphics.Path;
import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f25120a;
    public final Path.FillType b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.c f25121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7.d f25122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m7.f f25123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m7.f f25124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m7.b f25126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m7.b f25127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f25128j;

    public e(String str, g gVar, Path.FillType fillType, m7.c cVar, m7.d dVar, m7.f fVar, m7.f fVar2, m7.b bVar, m7.b bVar2, boolean z10) {
        this.f25120a = gVar;
        this.b = fillType;
        this.f25121c = cVar;
        this.f25122d = dVar;
        this.f25123e = fVar;
        this.f25124f = fVar2;
        this.f25125g = str;
        this.f25126h = bVar;
        this.f25127i = bVar2;
        this.f25128j = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.h(h0Var, iVar, bVar, this);
    }

    public m7.f b() {
        return this.f25124f;
    }

    public Path.FillType c() {
        return this.b;
    }

    public m7.c d() {
        return this.f25121c;
    }

    public g e() {
        return this.f25120a;
    }

    public String f() {
        return this.f25125g;
    }

    public m7.d g() {
        return this.f25122d;
    }

    public m7.f h() {
        return this.f25123e;
    }

    public boolean i() {
        return this.f25128j;
    }
}
