package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import ff.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kf.a;
import kf.b;
import mf.c;
import mf.d;
import mf.e0;
import mf.r;
import nf.y;
import wf.i;
import zf.g;
import zf.h;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ h a(d dVar) {
        return new g((e) dVar.a(e.class), dVar.g(i.class), (ExecutorService) dVar.f(e0.a(a.class, ExecutorService.class)), y.a((Executor) dVar.f(e0.a(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(h.class).h(LIBRARY_NAME).b(r.j(e.class)).b(r.h(i.class)).b(r.k(e0.a(a.class, ExecutorService.class))).b(r.k(e0.a(b.class, Executor.class))).f(new mf.g() { // from class: zf.j
            @Override // mf.g
            public final Object create(mf.d dVar) {
                return FirebaseInstallationsRegistrar.a(dVar);
            }
        }).d(), wf.h.a(), hg.h.b(LIBRARY_NAME, "19.0.1"));
    }
}
