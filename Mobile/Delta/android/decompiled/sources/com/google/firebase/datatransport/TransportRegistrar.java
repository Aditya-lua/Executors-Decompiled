package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import b8.t;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import gg.h;
import java.util.Arrays;
import java.util.List;
import lf.c;
import lf.d;
import lf.e0;
import lf.g;
import lf.r;
import of.b;
import y7.i;
import z7.a;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ i a(d dVar) {
        t.f((Context) dVar.a(Context.class));
        return t.c().g(a.f37333g);
    }

    public static /* synthetic */ i b(d dVar) {
        t.f((Context) dVar.a(Context.class));
        return t.c().g(a.f37334h);
    }

    public static /* synthetic */ i c(d dVar) {
        t.f((Context) dVar.a(Context.class));
        return t.c().g(a.f37334h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(i.class).h(LIBRARY_NAME).b(r.j(Context.class)).f(new g() { // from class: of.c
            @Override // lf.g
            public final Object create(lf.d dVar) {
                return TransportRegistrar.c(dVar);
            }
        }).d(), c.e(e0.a(of.a.class, i.class)).b(r.j(Context.class)).f(new g() { // from class: of.d
            @Override // lf.g
            public final Object create(lf.d dVar) {
                return TransportRegistrar.b(dVar);
            }
        }).d(), c.e(e0.a(b.class, i.class)).b(r.j(Context.class)).f(new g() { // from class: of.e
            @Override // lf.g
            public final Object create(lf.d dVar) {
                return TransportRegistrar.a(dVar);
            }
        }).d(), h.b(LIBRARY_NAME, "18.2.0"));
    }
}
