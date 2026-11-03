package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(mf.e0 e0Var, mf.d dVar) {
        return new FirebaseMessaging((ff.e) dVar.a(ff.e.class), (xf.a) dVar.a(xf.a.class), dVar.g(hg.i.class), dVar.g(wf.j.class), (zf.h) dVar.a(zf.h.class), dVar.c(e0Var), (vf.d) dVar.a(vf.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<mf.c<?>> getComponents() {
        final mf.e0 e0VarA = mf.e0.a(pf.b.class, y7.i.class);
        return Arrays.asList(mf.c.c(FirebaseMessaging.class).h(LIBRARY_NAME).b(mf.r.j(ff.e.class)).b(mf.r.g(xf.a.class)).b(mf.r.h(hg.i.class)).b(mf.r.h(wf.j.class)).b(mf.r.j(zf.h.class)).b(mf.r.i(e0VarA)).b(mf.r.j(vf.d.class)).f(new mf.g() { // from class: com.google.firebase.messaging.z
            @Override // mf.g
            public final Object create(mf.d dVar) {
                return FirebaseMessagingRegistrar.a(e0VarA, dVar);
            }
        }).c().d(), hg.h.b(LIBRARY_NAME, "25.0.1"));
    }
}
