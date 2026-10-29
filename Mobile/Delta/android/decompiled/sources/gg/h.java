package gg;

import android.content.Context;
import lf.r;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    public interface a<T> {
        String a(T t8);
    }

    public static lf.c<?> b(String str, String str2) {
        return lf.c.l(f.a(str, str2), f.class);
    }

    public static lf.c<?> c(final String str, final a<Context> aVar) {
        return lf.c.m(f.class).b(r.j(Context.class)).f(new lf.g() { // from class: gg.g
            @Override // lf.g
            public final Object create(lf.d dVar) {
                return f.a(str, aVar.a((Context) dVar.a(Context.class)));
            }
        }).d();
    }
}
