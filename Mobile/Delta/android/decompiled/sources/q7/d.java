package q7;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static <T> List<t7.a<T>> a(r7.c cVar, float f10, f7.i iVar, n0<T> n0Var) {
        return u.a(cVar, iVar, f10, n0Var, false);
    }

    public static <T> List<t7.a<T>> b(r7.c cVar, f7.i iVar, n0<T> n0Var) {
        return u.a(cVar, iVar, 1.0f, n0Var, false);
    }

    public static m7.a c(r7.c cVar, f7.i iVar) {
        return new m7.a(b(cVar, iVar, g.f29593a));
    }

    public static m7.j d(r7.c cVar, f7.i iVar) {
        return new m7.j(a(cVar, s7.m.e(), iVar, i.f29597a));
    }

    public static m7.b e(r7.c cVar, f7.i iVar) {
        return f(cVar, iVar, true);
    }

    public static m7.b f(r7.c cVar, f7.i iVar, boolean z10) {
        return new m7.b(a(cVar, z10 ? s7.m.e() : 1.0f, iVar, l.f29611a));
    }

    public static m7.c g(r7.c cVar, f7.i iVar, int i10) {
        return new m7.c(b(cVar, iVar, new o(i10)));
    }

    public static m7.d h(r7.c cVar, f7.i iVar) {
        return new m7.d(b(cVar, iVar, r.f29620a));
    }

    public static m7.f i(r7.c cVar, f7.i iVar) {
        return new m7.f(u.a(cVar, iVar, s7.m.e(), b0.f29585a, true));
    }

    public static m7.g j(r7.c cVar, f7.i iVar) {
        return new m7.g(b(cVar, iVar, g0.f29594a));
    }

    public static m7.h k(r7.c cVar, f7.i iVar) {
        return new m7.h(a(cVar, s7.m.e(), iVar, h0.f29596a));
    }
}
