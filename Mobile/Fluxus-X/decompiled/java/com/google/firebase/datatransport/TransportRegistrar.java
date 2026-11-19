package com.google.firebase.datatransport;

import a8.a;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import c8.t;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import jg.h;
import of.c;
import of.d;
import of.e0;
import of.g;
import of.r;
import rf.b;
import z7.i;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ i a(d dVar) {
        t.f((Context) dVar.a(Context.class));
        return t.c().g(a.f304g);
    }

    public static /* synthetic */ i b(d dVar) {
        t.f((Context) dVar.a(Context.class));
        return t.c().g(a.f305h);
    }

    public static /* synthetic */ i c(d dVar) {
        t.f((Context) dVar.a(Context.class));
        return t.c().g(a.f305h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(i.class).h(LIBRARY_NAME).b(r.j(Context.class)).f(new g() { // from class: rf.c
            @Override // of.g
            public final Object create(of.d dVar) {
                return TransportRegistrar.c(dVar);
            }
        }).d(), c.e(e0.a(rf.a.class, i.class)).b(r.j(Context.class)).f(new g() { // from class: rf.d
            @Override // of.g
            public final Object create(of.d dVar) {
                return TransportRegistrar.b(dVar);
            }
        }).d(), c.e(e0.a(b.class, i.class)).b(r.j(Context.class)).f(new g() { // from class: rf.e
            @Override // of.g
            public final Object create(of.d dVar) {
                return TransportRegistrar.a(dVar);
            }
        }).d(), h.b(LIBRARY_NAME, "18.2.0"));
    }
}
