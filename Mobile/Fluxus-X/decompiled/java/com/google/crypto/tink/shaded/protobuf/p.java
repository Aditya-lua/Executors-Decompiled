package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class p {
    public static volatile p b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f8435c = new p(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, y.e<?, ?>> f8436a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f8437a;
        public final int b;

        public a(Object obj, int i10) {
            this.f8437a = obj;
            this.b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8437a == aVar.f8437a && this.b == aVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f8437a) * 65535) + this.b;
        }
    }

    public p() {
        this.f8436a = new HashMap();
    }

    public static p b() {
        p pVarA;
        if (c1.f8327d) {
            return f8435c;
        }
        p pVar = b;
        if (pVar != null) {
            return pVar;
        }
        synchronized (p.class) {
            try {
                pVarA = b;
                if (pVarA == null) {
                    pVarA = o.a();
                    b = pVarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVarA;
    }

    public <ContainingType extends s0> y.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (y.e) this.f8436a.get(new a(containingtype, i10));
    }

    public p(boolean z10) {
        this.f8436a = Collections.EMPTY_MAP;
    }
}
