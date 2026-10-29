package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import nf.C9468y;
import p128ff.C5590e;
import p171hg.C6403h;
import p247kf.InterfaceC7579a;
import p247kf.InterfaceC7580b;
import p292mf.C8492c;
import p292mf.C8497e0;
import p292mf.C8511r;
import p292mf.InterfaceC8494d;
import p292mf.InterfaceC8500g;
import p603zf.C13800g;
import p603zf.InterfaceC13801h;
import wf.C12409h;
import wf.InterfaceC12410i;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
      (wrap ff.e:0x0008: CHECK_CAST (ff.e) (wrap java.lang.Object:0x0004: INVOKE (r6v0 mf.d), (wrap java.lang.Class:0x0002: CONST_CLASS  A[WRAPPED] ff.e.class) INTERFACE call: mf.d.a(java.lang.Class):java.lang.Object A[MD:<T>:(java.lang.Class<T>):T (m), WRAPPED]))
      (wrap yf.b:0x000c: INVOKE (r6v0 mf.d), (wrap java.lang.Class:0x000a: CONST_CLASS  A[WRAPPED] wf.i.class) INTERFACE call: mf.d.g(java.lang.Class):yf.b A[MD:<T>:(java.lang.Class<T>):yf.b<T> (m), WRAPPED])
      (wrap java.util.concurrent.ExecutorService:0x001c: CHECK_CAST (java.util.concurrent.ExecutorService) (wrap java.lang.Object:0x0018: INVOKE 
      (r6v0 mf.d)
      (wrap mf.e0:0x0014: INVOKE 
      (wrap java.lang.Class:0x0010: CONST_CLASS  A[WRAPPED] kf.a.class)
      (wrap java.lang.Class:0x0012: CONST_CLASS  A[WRAPPED] java.util.concurrent.ExecutorService.class)
     STATIC call: mf.e0.a(java.lang.Class, java.lang.Class):mf.e0 A[MD:<T>:(java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.Class<T>):mf.e0<T> (m), WRAPPED])
     INTERFACE call: mf.d.f(mf.e0):java.lang.Object A[MD:<T>:(mf.e0<T>):T (m), WRAPPED]))
      (wrap java.util.concurrent.Executor:0x002c: INVOKE 
      (wrap java.util.concurrent.Executor:0x002a: CHECK_CAST (java.util.concurrent.Executor) (wrap java.lang.Object:0x0026: INVOKE 
      (r6v0 mf.d)
      (wrap mf.e0:0x0022: INVOKE 
      (wrap java.lang.Class:0x001e: CONST_CLASS  A[WRAPPED] kf.b.class)
      (wrap java.lang.Class:0x0020: CONST_CLASS  A[WRAPPED] java.util.concurrent.Executor.class)
     STATIC call: mf.e0.a(java.lang.Class, java.lang.Class):mf.e0 A[MD:<T>:(java.lang.Class<? extends java.lang.annotation.Annotation>, java.lang.Class<T>):mf.e0<T> (m), WRAPPED])
     INTERFACE call: mf.d.f(mf.e0):java.lang.Object A[MD:<T>:(mf.e0<T>):T (m), WRAPPED]))
     STATIC call: nf.y.a(java.util.concurrent.Executor):java.util.concurrent.Executor A[MD:(java.util.concurrent.Executor):java.util.concurrent.Executor (m), WRAPPED])
     A[MD:(ff.e, yf.b<wf.i>, java.util.concurrent.ExecutorService, java.util.concurrent.Executor):void (m)] call: zf.g.<init>(ff.e, yf.b, java.util.concurrent.ExecutorService, java.util.concurrent.Executor):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC13801h m14410a(InterfaceC8494d interfaceC8494d) {
        return new C13800g((C5590e) interfaceC8494d.mo34304a(C5590e.class), interfaceC8494d.mo34310g(InterfaceC12410i.class), (ExecutorService) interfaceC8494d.mo34309f(C8497e0.m34315a(InterfaceC7579a.class, ExecutorService.class)), C9468y.m37296a((Executor) interfaceC8494d.mo34309f(C8497e0.m34315a(InterfaceC7580b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8492c<?>> getComponents() {
        return Arrays.asList(C8492c.m34274c(InterfaceC13801h.class).m34297h(LIBRARY_NAME).m34291b(C8511r.m34359j(C5590e.class)).m34291b(C8511r.m34357h(InterfaceC12410i.class)).m34291b(C8511r.m34360k(C8497e0.m34315a(InterfaceC7579a.class, ExecutorService.class))).m34291b(C8511r.m34360k(C8497e0.m34315a(InterfaceC7580b.class, Executor.class))).m34295f(new InterfaceC8500g() { // from class: zf.j
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return FirebaseInstallationsRegistrar.m14410a(interfaceC8494d);
            }
        }).m34293d(), C12409h.m46490a(), C6403h.m27986b(LIBRARY_NAME, "19.0.1"));
    }
}
