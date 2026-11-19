package r7;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static <T> List<u7.a<T>> a(s7.c cVar, float f10, g7.i iVar, n0<T> n0Var) {
        return u.a(cVar, iVar, f10, n0Var, false);
    }

    public static <T> List<u7.a<T>> b(s7.c cVar, g7.i iVar, n0<T> n0Var) {
        return u.a(cVar, iVar, 1.0f, n0Var, false);
    }

    public static n7.a c(s7.c cVar, g7.i iVar) {
        return new n7.a(b(cVar, iVar, g.f30570a));
    }

    public static n7.j d(s7.c cVar, g7.i iVar) {
        return new n7.j(a(cVar, t7.m.e(), iVar, i.f30574a));
    }

    public static n7.b e(s7.c cVar, g7.i iVar) {
        return f(cVar, iVar, true);
    }

    public static n7.b f(s7.c cVar, g7.i iVar, boolean z10) {
        return new n7.b(a(cVar, z10 ? t7.m.e() : 1.0f, iVar, l.f30588a));
    }

    public static n7.c g(s7.c cVar, g7.i iVar, int i10) {
        return new n7.c(b(cVar, iVar, new o(i10)));
    }

    public static n7.d h(s7.c cVar, g7.i iVar) {
        return new n7.d(b(cVar, iVar, r.f30597a));
    }

    public static n7.f i(s7.c cVar, g7.i iVar) {
        return new n7.f(u.a(cVar, iVar, t7.m.e(), b0.f30562a, true));
    }

    public static n7.g j(s7.c cVar, g7.i iVar) {
        return new n7.g(b(cVar, iVar, g0.f30571a));
    }

    public static n7.h k(s7.c cVar, g7.i iVar) {
        return new n7.h(a(cVar, t7.m.e(), iVar, h0.f30573a));
    }
}
