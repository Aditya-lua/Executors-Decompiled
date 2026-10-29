package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(lf.e0 e0Var, lf.d dVar) {
        return new FirebaseMessaging((ef.e) dVar.a(ef.e.class), (wf.a) dVar.a(wf.a.class), dVar.d(gg.i.class), dVar.d(vf.j.class), (yf.h) dVar.a(yf.h.class), dVar.c(e0Var), (uf.d) dVar.a(uf.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<lf.c<?>> getComponents() {
        final lf.e0 e0VarA = lf.e0.a(of.b.class, y7.i.class);
        return Arrays.asList(lf.c.c(FirebaseMessaging.class).h(LIBRARY_NAME).b(lf.r.j(ef.e.class)).b(lf.r.g(wf.a.class)).b(lf.r.h(gg.i.class)).b(lf.r.h(vf.j.class)).b(lf.r.j(yf.h.class)).b(lf.r.i(e0VarA)).b(lf.r.j(uf.d.class)).f(new lf.g() { // from class: com.google.firebase.messaging.z
            @Override // lf.g
            public final Object create(lf.d dVar) {
                return FirebaseMessagingRegistrar.a(e0VarA, dVar);
            }
        }).c().d(), gg.h.b(LIBRARY_NAME, "25.0.1"));
    }
}
