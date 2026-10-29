package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p128ff.C5590e;
import p171hg.C6403h;
import p171hg.InterfaceC6404i;
import p292mf.C8492c;
import p292mf.C8497e0;
import p292mf.C8511r;
import p292mf.InterfaceC8494d;
import p292mf.InterfaceC8500g;
import p490vf.InterfaceC12167d;
import p545xf.InterfaceC12829a;
import p569y7.InterfaceC13122i;
import p603zf.InterfaceC13801h;
import pf.InterfaceC10247b;
import wf.InterfaceC12411j;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
      (wrap ff.e:0x0008: CHECK_CAST (ff.e) (wrap java.lang.Object:0x0004: INVOKE (r9v0 mf.d), (wrap java.lang.Class:0x0002: CONST_CLASS  A[WRAPPED] ff.e.class) INTERFACE call: mf.d.a(java.lang.Class):java.lang.Object A[MD:<T>:(java.lang.Class<T>):T (m), WRAPPED]))
      (wrap xf.a:0x0010: CHECK_CAST (xf.a) (wrap java.lang.Object:0x000c: INVOKE (r9v0 mf.d), (wrap java.lang.Class:0x000a: CONST_CLASS  A[WRAPPED] xf.a.class) INTERFACE call: mf.d.a(java.lang.Class):java.lang.Object A[MD:<T>:(java.lang.Class<T>):T (m), WRAPPED]))
      (wrap yf.b:0x0014: INVOKE (r9v0 mf.d), (wrap java.lang.Class:0x0012: CONST_CLASS  A[WRAPPED] hg.i.class) INTERFACE call: mf.d.g(java.lang.Class):yf.b A[MD:<T>:(java.lang.Class<T>):yf.b<T> (m), WRAPPED])
      (wrap yf.b:0x001a: INVOKE (r9v0 mf.d), (wrap java.lang.Class:0x0018: CONST_CLASS  A[WRAPPED] wf.j.class) INTERFACE call: mf.d.g(java.lang.Class):yf.b A[MD:<T>:(java.lang.Class<T>):yf.b<T> (m), WRAPPED])
      (wrap zf.h:0x0024: CHECK_CAST (zf.h) (wrap java.lang.Object:0x0020: INVOKE (r9v0 mf.d), (wrap java.lang.Class:0x001e: CONST_CLASS  A[WRAPPED] zf.h.class) INTERFACE call: mf.d.a(java.lang.Class):java.lang.Object A[MD:<T>:(java.lang.Class<T>):T (m), WRAPPED]))
      (wrap yf.b:0x0026: INVOKE (r9v0 mf.d), (r8v0 mf.e0) INTERFACE call: mf.d.c(mf.e0):yf.b A[MD:<T>:(mf.e0<T>):yf.b<T> (m), WRAPPED])
      (wrap vf.d:0x0031: CHECK_CAST (vf.d) (wrap java.lang.Object:0x002c: INVOKE (r9v0 mf.d), (wrap java.lang.Class:0x002a: CONST_CLASS  A[WRAPPED] vf.d.class) INTERFACE call: mf.d.a(java.lang.Class):java.lang.Object A[MD:<T>:(java.lang.Class<T>):T (m), WRAPPED]))
     A[MD:(ff.e, xf.a, yf.b<hg.i>, yf.b<wf.j>, zf.h, yf.b<y7.i>, vf.d):void (m)] call: com.google.firebase.messaging.FirebaseMessaging.<init>(ff.e, xf.a, yf.b, yf.b, zf.h, yf.b, vf.d):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ FirebaseMessaging m14447a(C8497e0 c8497e0, InterfaceC8494d interfaceC8494d) {
        return new FirebaseMessaging((C5590e) interfaceC8494d.mo34304a(C5590e.class), (InterfaceC12829a) interfaceC8494d.mo34304a(InterfaceC12829a.class), interfaceC8494d.mo34310g(InterfaceC6404i.class), interfaceC8494d.mo34310g(InterfaceC12411j.class), (InterfaceC13801h) interfaceC8494d.mo34304a(InterfaceC13801h.class), interfaceC8494d.mo34306c(c8497e0), (InterfaceC12167d) interfaceC8494d.mo34304a(InterfaceC12167d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C8492c<?>> getComponents() {
        final C8497e0 c8497e0M34315a = C8497e0.m34315a(InterfaceC10247b.class, InterfaceC13122i.class);
        return Arrays.asList(C8492c.m34274c(FirebaseMessaging.class).m34297h(LIBRARY_NAME).m34291b(C8511r.m34359j(C5590e.class)).m34291b(C8511r.m34356g(InterfaceC12829a.class)).m34291b(C8511r.m34357h(InterfaceC6404i.class)).m34291b(C8511r.m34357h(InterfaceC12411j.class)).m34291b(C8511r.m34359j(InterfaceC13801h.class)).m34291b(C8511r.m34358i(c8497e0M34315a)).m34291b(C8511r.m34359j(InterfaceC12167d.class)).m34295f(new InterfaceC8500g() { // from class: com.google.firebase.messaging.z
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return FirebaseMessagingRegistrar.m14447a(c8497e0M34315a, interfaceC8494d);
            }
        }).m34292c().m34293d(), C6403h.m27986b(LIBRARY_NAME, "25.0.1"));
    }
}
