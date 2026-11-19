package jg;

import android.content.Context;
import of.r;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    public interface a<T> {
        String a(T t8);
    }

    public static of.c<?> b(String str, String str2) {
        return of.c.l(f.a(str, str2), f.class);
    }

    public static of.c<?> c(final String str, final a<Context> aVar) {
        return of.c.m(f.class).b(r.j(Context.class)).f(new of.g() { // from class: jg.g
            @Override // of.g
            public final Object create(of.d dVar) {
                return f.a(str, aVar.a((Context) dVar.a(Context.class)));
            }
        }).d();
    }
}
