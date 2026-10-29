package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.p */
/* JADX INFO: loaded from: classes2.dex */
public class C2944p {

    /* JADX INFO: renamed from: b */
    public static volatile C2944p f10957b;

    /* JADX INFO: renamed from: c */
    public static final C2944p f10958c = new C2944p(true);

    /* JADX INFO: renamed from: a */
    public final Map<a, AbstractC2967y.e<?, ?>> f10959a;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.p$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Object f10960a;

        /* JADX INFO: renamed from: b */
        public final int f10961b;

        public a(Object obj, int i10) {
            this.f10960a = obj;
            this.f10961b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10960a == aVar.f10960a && this.f10961b == aVar.f10961b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f10960a) * 65535) + this.f10961b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2944p() {
        this.f10959a = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static C2944p m14035b() {
        C2944p c2944pM14012a;
        if (C2907c1.f10823d) {
            return f10958c;
        }
        C2944p c2944p = f10957b;
        if (c2944p != null) {
            return c2944p;
        }
        synchronized (C2944p.class) {
            try {
                c2944pM14012a = f10957b;
                if (c2944pM14012a == null) {
                    c2944pM14012a = C2941o.m14012a();
                    f10957b = c2944pM14012a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2944pM14012a;
    }

    /* JADX INFO: renamed from: a */
    public <ContainingType extends InterfaceC2954s0> AbstractC2967y.e<ContainingType, ?> m14036a(ContainingType containingtype, int i10) {
        return (AbstractC2967y.e) this.f10959a.get(new a(containingtype, i10));
    }

    public C2944p(boolean z10) {
        this.f10959a = Collections.EMPTY_MAP;
    }
}
