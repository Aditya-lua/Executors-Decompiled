package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public class o {
    public static volatile o b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f2248c = new o(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, x.e<?, ?>> f2249a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f2250a;
        public final int b;

        public a(Object obj, int i10) {
            this.f2250a = obj;
            this.b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2250a == aVar.f2250a && this.b == aVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f2250a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.b;
        }
    }

    public o() {
        this.f2249a = new HashMap();
    }

    public static o b() {
        o oVarA;
        if (c1.f2152d) {
            return f2248c;
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
        return (x.e) this.f2249a.get(new a(containingtype, i10));
    }

    public o(boolean z10) {
        this.f2249a = Collections.EMPTY_MAP;
    }
}
