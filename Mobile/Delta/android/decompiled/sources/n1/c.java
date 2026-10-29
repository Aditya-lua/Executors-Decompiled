package n1;

import android.util.Range;
import android.util.Size;
import l1.m;
import n0.a2;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static a2.c a(a2.c cVar, Size size, Range<Integer> range) {
        return a2.c.a(cVar.e(), cVar.i(), m.f(cVar.c(), cVar.b(), cVar.b(), cVar.f(), cVar.f(), size.getWidth(), cVar.l(), size.getHeight(), cVar.h(), range), cVar.f(), size.getWidth(), size.getHeight(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    public static a2.c b(a2 a2Var) {
        if (a2Var == null || a2Var.b().isEmpty()) {
            return null;
        }
        return a2Var.b().get(0);
    }
}
