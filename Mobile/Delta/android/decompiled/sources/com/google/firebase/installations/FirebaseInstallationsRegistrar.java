package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import ef.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import jf.a;
import jf.b;
import lf.c;
import lf.d;
import lf.e0;
import lf.r;
import mf.y;
import vf.i;
import yf.g;
import yf.h;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ h a(d dVar) {
        return new g((e) dVar.a(e.class), dVar.d(i.class), (ExecutorService) dVar.f(e0.a(a.class, ExecutorService.class)), y.a((Executor) dVar.f(e0.a(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(h.class).h(LIBRARY_NAME).b(r.j(e.class)).b(r.h(i.class)).b(r.k(e0.a(a.class, ExecutorService.class))).b(r.k(e0.a(b.class, Executor.class))).f(new lf.g() { // from class: yf.j
            @Override // lf.g
            public final Object create(lf.d dVar) {
                return FirebaseInstallationsRegistrar.a(dVar);
            }
        }).d(), vf.h.a(), gg.h.b(LIBRARY_NAME, "19.0.1"));
    }
}
