package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import p028b8.C1272t;
import p171hg.C6403h;
import p292mf.C8492c;
import p292mf.C8497e0;
import p292mf.C8511r;
import p292mf.InterfaceC8494d;
import p292mf.InterfaceC8500g;
import p569y7.InterfaceC13122i;
import p597z7.C13732a;
import pf.InterfaceC10246a;
import pf.InterfaceC10247b;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC13122i m14404a(InterfaceC8494d interfaceC8494d) {
        C1272t.m7051f((Context) interfaceC8494d.mo34304a(Context.class));
        return C1272t.m7049c().m7054g(C13732a.f48305g);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC13122i m14405b(InterfaceC8494d interfaceC8494d) {
        C1272t.m7051f((Context) interfaceC8494d.mo34304a(Context.class));
        return C1272t.m7049c().m7054g(C13732a.f48306h);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC13122i m14406c(InterfaceC8494d interfaceC8494d) {
        C1272t.m7051f((Context) interfaceC8494d.mo34304a(Context.class));
        return C1272t.m7049c().m7054g(C13732a.f48306h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<C8492c<?>> getComponents() {
        return Arrays.asList(C8492c.m34274c(InterfaceC13122i.class).m34297h(LIBRARY_NAME).m34291b(C8511r.m34359j(Context.class)).m34295f(new InterfaceC8500g() { // from class: pf.c
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return TransportRegistrar.m14406c(interfaceC8494d);
            }
        }).m34293d(), C8492c.m34276e(C8497e0.m34315a(InterfaceC10246a.class, InterfaceC13122i.class)).m34291b(C8511r.m34359j(Context.class)).m34295f(new InterfaceC8500g() { // from class: pf.d
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return TransportRegistrar.m14405b(interfaceC8494d);
            }
        }).m34293d(), C8492c.m34276e(C8497e0.m34315a(InterfaceC10247b.class, InterfaceC13122i.class)).m34291b(C8511r.m34359j(Context.class)).m34295f(new InterfaceC8500g() { // from class: pf.e
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return TransportRegistrar.m14404a(interfaceC8494d);
            }
        }).m34293d(), C6403h.m27986b(LIBRARY_NAME, "18.2.0"));
    }
}
