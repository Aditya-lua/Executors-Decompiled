package n7;

import f7.h0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25129a;
    public final g b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.c f25130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7.d f25131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m7.f f25132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m7.f f25133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m7.b f25134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s.a f25135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s.b f25136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f25137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<m7.b> f25138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m7.b f25139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f25140m;

    public f(String str, g gVar, m7.c cVar, m7.d dVar, m7.f fVar, m7.f fVar2, m7.b bVar, s.a aVar, s.b bVar2, float f10, List<m7.b> list, m7.b bVar3, boolean z10) {
        this.f25129a = str;
        this.b = gVar;
        this.f25130c = cVar;
        this.f25131d = dVar;
        this.f25132e = fVar;
        this.f25133f = fVar2;
        this.f25134g = bVar;
        this.f25135h = aVar;
        this.f25136i = bVar2;
        this.f25137j = f10;
        this.f25138k = list;
        this.f25139l = bVar3;
        this.f25140m = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.i(h0Var, bVar, this);
    }

    public s.a b() {
        return this.f25135h;
    }

    public m7.b c() {
        return this.f25139l;
    }

    public m7.f d() {
        return this.f25133f;
    }

    public m7.c e() {
        return this.f25130c;
    }

    public g f() {
        return this.b;
    }

    public s.b g() {
        return this.f25136i;
    }

    public List<m7.b> h() {
        return this.f25138k;
    }

    public float i() {
        return this.f25137j;
    }

    public String j() {
        return this.f25129a;
    }

    public m7.d k() {
        return this.f25131d;
    }

    public m7.f l() {
        return this.f25132e;
    }

    public m7.b m() {
        return this.f25134g;
    }

    public boolean n() {
        return this.f25140m;
    }
}
