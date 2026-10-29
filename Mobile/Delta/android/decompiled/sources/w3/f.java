package w3;

import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.s1;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends x<f, a> implements s0 {
    private static final f DEFAULT_INSTANCE;
    private static volatile z0<f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private l0<String, h> preferences_ = l0.e();

    public static final class a extends x.a<f, a> implements s0 {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a E(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            t();
            ((f) this.b).W().put(str, hVar);
            return this;
        }

        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k0<String, h> f33668a = k0.d(s1.b.f2294k, "", s1.b.f2296m, h.f0());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        x.R(f.class, fVar);
    }

    public static a a0() {
        return DEFAULT_INSTANCE.x();
    }

    public static f b0(InputStream inputStream) {
        return (f) x.P(DEFAULT_INSTANCE, inputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final Object A(x.f fVar, Object obj, Object obj2) {
        z0 bVar;
        e eVar = null;
        switch (e.f33667a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return x.N(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f33668a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<f> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (f.class) {
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

    public final Map<String, h> W() {
        return Y();
    }

    public Map<String, h> X() {
        return Collections.unmodifiableMap(Z());
    }

    public final l0<String, h> Y() {
        if (!this.preferences_.k()) {
            this.preferences_ = this.preferences_.p();
        }
        return this.preferences_;
    }

    public final l0<String, h> Z() {
        return this.preferences_;
    }
}
