package sm;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h<T> {

    public class a extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f31578a;

        public a(h hVar) {
            this.f31578a = hVar;
        }

        @Override // sm.h
        public T fromJson(m mVar) {
            return (T) this.f31578a.fromJson(mVar);
        }

        @Override // sm.h
        public boolean isLenient() {
            return this.f31578a.isLenient();
        }

        @Override // sm.h
        public void toJson(t tVar, T t8) {
            boolean zJ = tVar.j();
            tVar.A(true);
            try {
                this.f31578a.toJson(tVar, t8);
            } finally {
                tVar.A(zJ);
            }
        }

        public String toString() {
            return this.f31578a + ".serializeNulls()";
        }
    }

    public class b extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f31579a;

        public b(h hVar) {
            this.f31579a = hVar;
        }

        @Override // sm.h
        public T fromJson(m mVar) {
            boolean zG = mVar.g();
            mVar.L(true);
            try {
                return (T) this.f31579a.fromJson(mVar);
            } finally {
                mVar.L(zG);
            }
        }

        @Override // sm.h
        public boolean isLenient() {
            return true;
        }

        @Override // sm.h
        public void toJson(t tVar, T t8) {
            boolean zL = tVar.l();
            tVar.x(true);
            try {
                this.f31579a.toJson(tVar, t8);
            } finally {
                tVar.x(zL);
            }
        }

        public String toString() {
            return this.f31579a + ".lenient()";
        }
    }

    public class c extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f31580a;

        public c(h hVar) {
            this.f31580a = hVar;
        }

        @Override // sm.h
        public T fromJson(m mVar) {
            boolean zE = mVar.e();
            mVar.I(true);
            try {
                return (T) this.f31580a.fromJson(mVar);
            } finally {
                mVar.I(zE);
            }
        }

        @Override // sm.h
        public boolean isLenient() {
            return this.f31580a.isLenient();
        }

        @Override // sm.h
        public void toJson(t tVar, T t8) {
            this.f31580a.toJson(tVar, t8);
        }

        public String toString() {
            return this.f31580a + ".failOnUnknown()";
        }
    }

    public class d extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f31581a;
        public final /* synthetic */ String b;

        public d(h hVar, String str) {
            this.f31581a = hVar;
            this.b = str;
        }

        @Override // sm.h
        public T fromJson(m mVar) {
            return (T) this.f31581a.fromJson(mVar);
        }

        @Override // sm.h
        public boolean isLenient() {
            return this.f31581a.isLenient();
        }

        @Override // sm.h
        public void toJson(t tVar, T t8) {
            String strH = tVar.h();
            tVar.w(this.b);
            try {
                this.f31581a.toJson(tVar, t8);
            } finally {
                tVar.w(strH);
            }
        }

        public String toString() {
            return this.f31581a + ".indent(\"" + this.b + "\")";
        }
    }

    public interface e {
        h<?> create(Type type, Set<? extends Annotation> set, w wVar);
    }

    public final h<T> failOnUnknown() {
        return new c(this);
    }

    public abstract T fromJson(m mVar);

    public final T fromJson(vu.g gVar) {
        return fromJson(m.s(gVar));
    }

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
        return this instanceof um.a ? this : new um.a(this);
    }

    public final h<T> nullSafe() {
        return this instanceof um.b ? this : new um.b(this);
    }

    public final h<T> serializeNulls() {
        return new a(this);
    }

    public abstract void toJson(t tVar, T t8);

    public final void toJson(vu.f fVar, T t8) {
        toJson(t.q(fVar), t8);
    }

    public final Object toJsonValue(T t8) {
        s sVar = new s();
        try {
            toJson(sVar, t8);
            return sVar.Z();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final T fromJson(String str) {
        m mVarS = m.s(new vu.e().y0(str));
        T tFromJson = fromJson(mVarS);
        if (isLenient() || mVarS.u() == m.c.END_DOCUMENT) {
            return tFromJson;
        }
        throw new j("JSON document was not fully consumed.");
    }

    public final String toJson(T t8) {
        vu.e eVar = new vu.e();
        try {
            toJson(eVar, t8);
            return eVar.Q2();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
