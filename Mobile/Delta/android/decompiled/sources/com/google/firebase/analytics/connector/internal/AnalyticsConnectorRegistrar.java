package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import ef.e;
import gf.a;
import gf.b;
import gg.h;
import java.util.Arrays;
import java.util.List;
import lf.c;
import lf.d;
import lf.g;
import lf.r;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(d dVar) {
        return b.c((e) dVar.a(e.class), (Context) dVar.a(Context.class), (uf.d) dVar.a(uf.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(a.class).b(r.j(e.class)).b(r.j(Context.class)).b(r.j(uf.d.class)).f(new g() { // from class: hf.a
            @Override // lf.g
            public final /* synthetic */ Object create(d dVar) {
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(dVar);
            }
        }).e().d(), h.b("fire-analytics", "23.0.0"));
    }
}
