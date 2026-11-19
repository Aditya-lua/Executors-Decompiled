package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class o {
    public static volatile o b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f2054c = new o(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, x.e<?, ?>> f2055a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f2056a;
        public final int b;

        public a(Object obj, int i10) {
            this.f2056a = obj;
            this.b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2056a == aVar.f2056a && this.b == aVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f2056a) * 65535) + this.b;
        }
    }

    public o() {
        this.f2055a = new HashMap();
    }

    public static o b() {
        o oVarA;
        if (c1.f1958d) {
            return f2054c;
        }
        o oVar = b;
        if (oVar != null) {
            return oVar;
        }
        synchronized (o.class) {
            try {
                oVarA = b;
                if (oVarA == null) {
                    oVarA = n.a();
                    b = oVarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVarA;
    }

    public <ContainingType extends r0> x.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (x.e) this.f2055a.get(new a(containingtype, i10));
    }

    public o(boolean z10) {
        this.f2055a = Collections.EMPTY_MAP;
    }
}
