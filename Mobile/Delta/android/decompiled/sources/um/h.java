package um;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h<T> {

    public class a extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f32388a;

        public a(h hVar) {
            this.f32388a = hVar;
        }

        @Override // um.h
        public T fromJson(m mVar) {
            return (T) this.f32388a.fromJson(mVar);
        }

        @Override // um.h
        public boolean isLenient() {
            return this.f32388a.isLenient();
        }

        @Override // um.h
        public void toJson(t tVar, T t8) {
            boolean zJ = tVar.j();
            tVar.B(true);
            try {
                this.f32388a.toJson(tVar, t8);
            } finally {
                tVar.B(zJ);
            }
        }

        public String toString() {
            return this.f32388a + ".serializeNulls()";
        }
    }

    public class b extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f32389a;

        public b(h hVar) {
            this.f32389a = hVar;
        }

        @Override // um.h
        public T fromJson(m mVar) {
            boolean zG = mVar.g();
            mVar.L(true);
            try {
                return (T) this.f32389a.fromJson(mVar);
            } finally {
                mVar.L(zG);
            }
        }

        @Override // um.h
        public boolean isLenient() {
            return true;
        }

        @Override // um.h
        public void toJson(t tVar, T t8) {
            boolean zL = tVar.l();
            tVar.y(true);
            try {
                this.f32389a.toJson(tVar, t8);
            } finally {
                tVar.y(zL);
            }
        }

        public String toString() {
            return this.f32389a + ".lenient()";
        }
    }

    public class c extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f32390a;

        public c(h hVar) {
            this.f32390a = hVar;
        }

        @Override // um.h
        public T fromJson(m mVar) {
            boolean zE = mVar.e();
            mVar.I(true);
            try {
                return (T) this.f32390a.fromJson(mVar);
            } finally {
                mVar.I(zE);
            }
        }

        @Override // um.h
        public boolean isLenient() {
            return this.f32390a.isLenient();
        }

        @Override // um.h
        public void toJson(t tVar, T t8) {
            this.f32390a.toJson(tVar, t8);
        }

        public String toString() {
            return this.f32390a + ".failOnUnknown()";
        }
    }

    public class d extends h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f32391a;
        public final /* synthetic */ String b;

        public d(h hVar, String str) {
            this.f32391a = hVar;
            this.b = str;
        }

        @Override // um.h
        public T fromJson(m mVar) {
            return (T) this.f32391a.fromJson(mVar);
        }

        @Override // um.h
        public boolean isLenient() {
            return this.f32391a.isLenient();
        }

        @Override // um.h
        public void toJson(t tVar, T t8) {
            String strH = tVar.h();
            tVar.w(this.b);
            try {
                this.f32391a.toJson(tVar, t8);
            } finally {
                tVar.w(strH);
            }
        }

        public String toString() {
            return this.f32391a + ".indent(\"" + this.b + "\")";
        }
    }

    public interface e {
        h<?> create(Type type, Set<? extends Annotation> set, w wVar);
    }

    public final h<T> failOnUnknown() {
        return new c(this);
    }

    public abstract T fromJson(m mVar);

    public final T fromJson(xu.g gVar) {
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
        return this instanceof wm.a ? this : new wm.a(this);
    }

    public final h<T> nullSafe() {
        return this instanceof wm.b ? this : new wm.b(this);
    }

    public final h<T> serializeNulls() {
        return new a(this);
    }

    public abstract void toJson(t tVar, T t8);

    public final void toJson(xu.f fVar, T t8) {
        toJson(t.q(fVar), t8);
    }

    public final Object toJsonValue(T t8) {
        s sVar = new s();
        try {
            toJson(sVar, t8);
            return sVar.a0();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final T fromJson(String str) {
        m mVarS = m.s(new xu.e().C0(str));
        T tFromJson = fromJson(mVarS);
        if (isLenient() || mVarS.u() == m.c.END_DOCUMENT) {
            return tFromJson;
        }
        throw new j("JSON document was not fully consumed.");
    }

    public final String toJson(T t8) {
        xu.e eVar = new xu.e();
        try {
            toJson(eVar, t8);
            return eVar.R2();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
