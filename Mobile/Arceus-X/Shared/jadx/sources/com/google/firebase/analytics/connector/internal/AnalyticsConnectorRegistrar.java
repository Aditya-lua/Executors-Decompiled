package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p128ff.C5590e;
import p170hf.C6393b;
import p170hf.InterfaceC6392a;
import p171hg.C6403h;
import p292mf.C8492c;
import p292mf.C8511r;
import p292mf.InterfaceC8494d;
import p292mf.InterfaceC8500g;
import p490vf.InterfaceC12167d;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC6392a lambda$getComponents$0(InterfaceC8494d interfaceC8494d) {
        return C6393b.m27973c((C5590e) interfaceC8494d.mo34304a(C5590e.class), (Context) interfaceC8494d.mo34304a(Context.class), (InterfaceC12167d) interfaceC8494d.mo34304a(InterfaceC12167d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C8492c<?>> getComponents() {
        return Arrays.asList(C8492c.m34274c(InterfaceC6392a.class).m34291b(C8511r.m34359j(C5590e.class)).m34291b(C8511r.m34359j(Context.class)).m34291b(C8511r.m34359j(InterfaceC12167d.class)).m34295f(new InterfaceC8500g() { // from class: jf.a
            @Override // p292mf.InterfaceC8500g
            public final /* synthetic */ Object create(InterfaceC8494d interfaceC8494d) {
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(interfaceC8494d);
            }
        }).m34294e().m34293d(), C6403h.m27986b("fire-analytics", "23.0.0"));
    }
}
