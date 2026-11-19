package hn;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h<T> {

    public class a extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f18333a;

        public a(h hVar) {
            this.f18333a = hVar;
        }

        @Override // hn.h
        public T fromJson(m mVar) {
            return (T) this.f18333a.fromJson(mVar);
        }

        @Override // hn.h
        public boolean isLenient() {
            return this.f18333a.isLenient();
        }

        @Override // hn.h
        public void toJson(t tVar, T t8) {
            boolean zK = tVar.k();
            tVar.E(true);
            try {
                this.f18333a.toJson(tVar, t8);
            } finally {
                tVar.E(zK);
            }
        }

        public String toString() {
            return this.f18333a + ".serializeNulls()";
        }
    }

    public class b extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f18334a;

        public b(h hVar) {
            this.f18334a = hVar;
        }

        @Override // hn.h
        public T fromJson(m mVar) {
            boolean zG = mVar.g();
            mVar.N(true);
            try {
                return (T) this.f18334a.fromJson(mVar);
            } finally {
                mVar.N(zG);
            }
        }

        @Override // hn.h
        public boolean isLenient() {
            return true;
        }

        @Override // hn.h
        public void toJson(t tVar, T t8) {
            boolean zM = tVar.m();
            tVar.A(true);
            try {
                this.f18334a.toJson(tVar, t8);
            } finally {
                tVar.A(zM);
            }
        }

        public String toString() {
            return this.f18334a + ".lenient()";
        }
    }

    public class c extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f18335a;

        public c(h hVar) {
            this.f18335a = hVar;
        }

        @Override // hn.h
        public T fromJson(m mVar) {
            boolean zE = mVar.e();
            mVar.L(true);
            try {
                return (T) this.f18335a.fromJson(mVar);
            } finally {
                mVar.L(zE);
            }
        }

        @Override // hn.h
        public boolean isLenient() {
            return this.f18335a.isLenient();
        }

        @Override // hn.h
        public void toJson(t tVar, T t8) {
            this.f18335a.toJson(tVar, t8);
        }

        public String toString() {
            return this.f18335a + ".failOnUnknown()";
        }
    }

    public class d extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f18336a;
        public final /* synthetic */ String b;

        public d(h hVar, String str) {
            this.f18336a = hVar;
            this.b = str;
        }

        @Override // hn.h
        public T fromJson(m mVar) {
            return (T) this.f18336a.fromJson(mVar);
        }

        @Override // hn.h
        public boolean isLenient() {
            return this.f18336a.isLenient();
        }

        @Override // hn.h
        public void toJson(t tVar, T t8) {
            String strH = tVar.h();
            tVar.z(this.b);
            try {
                this.f18336a.toJson(tVar, t8);
            } finally {
                tVar.z(strH);
            }
        }

        public String toString() {
            return this.f18336a + ".indent(\"" + this.b + "\")";
        }
    }

    public interface e {
        h<?> create(Type type, Set<? extends Annotation> set, w wVar);
    }

    public final h<T> failOnUnknown() {
        return new c(this);
    }

    public final T fromJson(ew.g gVar) {
        return fromJson(m.u(gVar));
    }

    public abstract T fromJson(m mVar);

    public final T fromJsonValue(Object obj) {
        try {
            return fromJson(new q(obj));
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public h<T> indent(String str) {
        if (str != null) {
            return new d(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    public boolean isLenient() {
        return false;
    }

    public final h<T> lenient() {
        return new b(this);
    }

    public final h<T> nonNull() {
        return this instanceof jn.a ? this : new jn.a(this);
    }

    public final h<T> nullSafe() {
        return this instanceof jn.b ? this : new jn.b(this);
    }

    public final h<T> serializeNulls() {
        return new a(this);
    }

    public final void toJson(ew.f fVar, T t8) {
        toJson(t.r(fVar), t8);
    }

    public abstract void toJson(t tVar, T t8);

    public final Object toJsonValue(T t8) {
        s sVar = new s();
        try {
            toJson(sVar, t8);
            return sVar.d0();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final T fromJson(String str) {
        m mVarU = m.u(new ew.e().D0(str));
        T tFromJson = fromJson(mVarU);
        if (isLenient() || mVarU.w() == m.c.END_DOCUMENT) {
            return tFromJson;
        }
        throw new j("JSON document was not fully consumed.");
    }

    public final String toJson(T t8) {
        ew.e eVar = new ew.e();
        try {
            toJson(eVar, t8);
            return eVar.V2();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
