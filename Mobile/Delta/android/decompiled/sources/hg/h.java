package hg;

import android.content.Context;
import mf.r;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    public interface a<T> {
        String a(T t8);
    }

    public static mf.c<?> b(String str, String str2) {
        return mf.c.l(f.a(str, str2), f.class);
    }

    public static mf.c<?> c(final String str, final a<Context> aVar) {
        return mf.c.m(f.class).b(r.j(Context.class)).f(new mf.g() { // from class: hg.g
            @Override // mf.g
            public final Object create(mf.d dVar) {
                return f.a(str, aVar.a((Context) dVar.a(Context.class)));
            }
        }).d();
    }
}
