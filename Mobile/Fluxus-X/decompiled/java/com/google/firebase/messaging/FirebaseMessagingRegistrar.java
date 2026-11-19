package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(of.e0 e0Var, of.d dVar) {
        return new FirebaseMessaging((hf.e) dVar.a(hf.e.class), (zf.a) dVar.a(zf.a.class), dVar.d(jg.i.class), dVar.d(yf.j.class), (bg.h) dVar.a(bg.h.class), dVar.g(e0Var), (xf.d) dVar.a(xf.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<of.c<?>> getComponents() {
        final of.e0 e0VarA = of.e0.a(rf.b.class, z7.i.class);
        return Arrays.asList(of.c.c(FirebaseMessaging.class).h(LIBRARY_NAME).b(of.r.j(hf.e.class)).b(of.r.g(zf.a.class)).b(of.r.h(jg.i.class)).b(of.r.h(yf.j.class)).b(of.r.j(bg.h.class)).b(of.r.i(e0VarA)).b(of.r.j(xf.d.class)).f(new of.g() { // from class: com.google.firebase.messaging.z
            @Override // of.g
            public final Object create(of.d dVar) {
                return FirebaseMessagingRegistrar.a(e0VarA, dVar);
            }
        }).c().d(), jg.h.b(LIBRARY_NAME, "25.0.1"));
    }
}
