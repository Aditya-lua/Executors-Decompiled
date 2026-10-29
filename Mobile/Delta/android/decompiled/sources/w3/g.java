package w3;

import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends x<g, a> implements s0 {
    private static final g DEFAULT_INSTANCE;
    private static volatile z0<g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private z.f<String> strings_ = x.B();

    public static final class a extends x.a<g, a> implements s0 {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a E(Iterable<String> iterable) {
            t();
            ((g) this.b).W(iterable);
            return this;
        }

        public a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        x.R(g.class, gVar);
    }

    public static g Y() {
        return DEFAULT_INSTANCE;
    }

    public static a a0() {
        return DEFAULT_INSTANCE.x();
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final Object A(x.f fVar, Object obj, Object obj2) {
        z0 bVar;
        e eVar = null;
        switch (e.f33667a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return x.N(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<g> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (g.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new x.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void W(Iterable<String> iterable) {
        X();
        androidx.datastore.preferences.protobuf.a.g(iterable, this.strings_);
    }

    public final void X() {
        z.f<String> fVar = this.strings_;
        if (fVar.n()) {
            return;
        }
        this.strings_ = x.L(fVar);
    }

    public List<String> Z() {
        return this.strings_;
    }
}
