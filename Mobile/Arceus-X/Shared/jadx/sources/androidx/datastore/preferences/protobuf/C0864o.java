package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o */
/* JADX INFO: loaded from: classes.dex */
public class C0864o {

    /* JADX INFO: renamed from: b */
    public static volatile C0864o f2957b;

    /* JADX INFO: renamed from: c */
    public static final C0864o f2958c = new C0864o(true);

    /* JADX INFO: renamed from: a */
    public final Map<a, AbstractC0888x.e<?, ?>> f2959a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Object f2960a;

        /* JADX INFO: renamed from: b */
        public final int f2961b;

        public a(Object obj, int i10) {
            this.f2960a = obj;
            this.f2961b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2960a == aVar.f2960a && this.f2961b == aVar.f2961b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f2960a) * 65535) + this.f2961b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0864o() {
        this.f2959a = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static C0864o m3911b() {
        C0864o c0864oM3886a;
        if (C0830c1.f2837d) {
            return f2958c;
        }
        C0864o c0864o = f2957b;
        if (c0864o != null) {
            return c0864o;
        }
        synchronized (C0864o.class) {
            try {
                c0864oM3886a = f2957b;
                if (c0864oM3886a == null) {
                    c0864oM3886a = C0861n.m3886a();
                    f2957b = c0864oM3886a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0864oM3886a;
    }

    /* JADX INFO: renamed from: a */
    public <ContainingType extends InterfaceC0874r0> AbstractC0888x.e<ContainingType, ?> m3912a(ContainingType containingtype, int i10) {
        return (AbstractC0888x.e) this.f2959a.get(new a(containingtype, i10));
    }

    public C0864o(boolean z10) {
        this.f2959a = Collections.EMPTY_MAP;
    }
}
