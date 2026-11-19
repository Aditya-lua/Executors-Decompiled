package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import hf.e;
import java.util.Arrays;
import java.util.List;
import jg.h;
import kf.a;
import kf.b;
import of.c;
import of.d;
import of.g;
import of.r;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(d dVar) {
        return b.c((e) dVar.a(e.class), (Context) dVar.a(Context.class), (xf.d) dVar.a(xf.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(a.class).b(r.j(e.class)).b(r.j(Context.class)).b(r.j(xf.d.class)).f(new g() { // from class: lf.a
            @Override // of.g
            public final /* synthetic */ Object create(d dVar) {
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(dVar);
            }
        }).e().d(), h.b("fire-analytics", "23.0.0"));
    }
}
