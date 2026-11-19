package og;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import lg.a0;
import lg.b0;
import lg.t;
import ng.v;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f28132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f28133d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f28134a;
    public final ConcurrentMap<Class<?>, b0> b = new ConcurrentHashMap();

    public static class b implements b0 {
        private b() {
        }

        @Override // lg.b0
        public <T> a0<T> create(lg.f fVar, sg.a<T> aVar) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        f28132c = new b();
        f28133d = new b();
    }

    public e(v vVar) {
        this.f28134a = vVar;
    }

    public static Object a(v vVar, Class<?> cls) {
        return vVar.w(sg.a.a(cls), true).a();
    }

    public static mg.b b(Class<?> cls) {
        return (mg.b) cls.getAnnotation(mg.b.class);
    }

    public a0<?> c(v vVar, lg.f fVar, sg.a<?> aVar, mg.b bVar, boolean z10) {
        a0<?> a0VarCreate;
        Object objA = a(vVar, bVar.value());
        boolean zNullSafe = bVar.nullSafe();
        if (objA instanceof a0) {
            a0VarCreate = (a0) objA;
        } else if (objA instanceof b0) {
            b0 b0VarE = (b0) objA;
            if (z10) {
                b0VarE = e(aVar.c(), b0VarE);
            }
            a0VarCreate = b0VarE.create(fVar, aVar);
        } else {
            boolean z11 = objA instanceof t;
            if (!z11 && !(objA instanceof lg.k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            n nVar = new n(z11 ? (t) objA : null, objA instanceof lg.k ? (lg.k) objA : null, fVar, aVar, z10 ? f28132c : f28133d, zNullSafe);
            zNullSafe = false;
            a0VarCreate = nVar;
        }
        return (a0VarCreate == null || !zNullSafe) ? a0VarCreate : a0VarCreate.nullSafe();
    }

    @Override // lg.b0
    public <T> a0<T> create(lg.f fVar, sg.a<T> aVar) {
        mg.b bVarB = b(aVar.c());
        if (bVarB == null) {
            return null;
        }
        return (a0<T>) c(this.f28134a, fVar, aVar, bVarB, true);
    }

    public boolean d(sg.a<?> aVar, b0 b0Var) {
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(b0Var);
        if (b0Var == f28132c) {
            return true;
        }
        Class<? super Object> clsC = aVar.c();
        b0 b0Var2 = this.b.get(clsC);
        if (b0Var2 != null) {
            return b0Var2 == b0Var;
        }
        mg.b bVarB = b(clsC);
        if (bVarB == null) {
            return false;
        }
        Class<?> clsValue = bVarB.value();
        return b0.class.isAssignableFrom(clsValue) && e(clsC, (b0) a(this.f28134a, clsValue)) == b0Var;
    }

    public final b0 e(Class<?> cls, b0 b0Var) {
        b0 b0VarPutIfAbsent = this.b.putIfAbsent(cls, b0Var);
        return b0VarPutIfAbsent != null ? b0VarPutIfAbsent : b0Var;
    }
}
