package p471um;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import p522wm.C12492a;
import p522wm.C12493b;
import p560xu.C12924e;
import p560xu.InterfaceC12926f;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: um.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11873h<T> {

    /* JADX INFO: renamed from: um.h$a */
    public class a extends AbstractC11873h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC11873h f42099a;

        public a(AbstractC11873h abstractC11873h) {
            this.f42099a = abstractC11873h;
        }

        @Override // p471um.AbstractC11873h
        public T fromJson(AbstractC11878m abstractC11878m) {
            return (T) this.f42099a.fromJson(abstractC11878m);
        }

        @Override // p471um.AbstractC11873h
        public boolean isLenient() {
            return this.f42099a.isLenient();
        }

        @Override // p471um.AbstractC11873h
        public void toJson(AbstractC11885t abstractC11885t, T t8) {
            boolean zM44400j = abstractC11885t.m44400j();
            abstractC11885t.m44394B(true);
            try {
                this.f42099a.toJson(abstractC11885t, t8);
            } finally {
                abstractC11885t.m44394B(zM44400j);
            }
        }

        public String toString() {
            return this.f42099a + ".serializeNulls()";
        }
    }

    /* JADX INFO: renamed from: um.h$b */
    public class b extends AbstractC11873h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC11873h f42101a;

        public b(AbstractC11873h abstractC11873h) {
            this.f42101a = abstractC11873h;
        }

        @Override // p471um.AbstractC11873h
        public T fromJson(AbstractC11878m abstractC11878m) {
            boolean zM44330g = abstractC11878m.m44330g();
            abstractC11878m.m44319L(true);
            try {
                return (T) this.f42101a.fromJson(abstractC11878m);
            } finally {
                abstractC11878m.m44319L(zM44330g);
            }
        }

        @Override // p471um.AbstractC11873h
        public boolean isLenient() {
            return true;
        }

        @Override // p471um.AbstractC11873h
        public void toJson(AbstractC11885t abstractC11885t, T t8) {
            boolean zM44401l = abstractC11885t.m44401l();
            abstractC11885t.m44407y(true);
            try {
                this.f42101a.toJson(abstractC11885t, t8);
            } finally {
                abstractC11885t.m44407y(zM44401l);
            }
        }

        public String toString() {
            return this.f42101a + ".lenient()";
        }
    }

    /* JADX INFO: renamed from: um.h$c */
    public class c extends AbstractC11873h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC11873h f42103a;

        public c(AbstractC11873h abstractC11873h) {
            this.f42103a = abstractC11873h;
        }

        @Override // p471um.AbstractC11873h
        public T fromJson(AbstractC11878m abstractC11878m) {
            boolean zM44328e = abstractC11878m.m44328e();
            abstractC11878m.m44318I(true);
            try {
                return (T) this.f42103a.fromJson(abstractC11878m);
            } finally {
                abstractC11878m.m44318I(zM44328e);
            }
        }

        @Override // p471um.AbstractC11873h
        public boolean isLenient() {
            return this.f42103a.isLenient();
        }

        @Override // p471um.AbstractC11873h
        public void toJson(AbstractC11885t abstractC11885t, T t8) {
            this.f42103a.toJson(abstractC11885t, t8);
        }

        public String toString() {
            return this.f42103a + ".failOnUnknown()";
        }
    }

    /* JADX INFO: renamed from: um.h$d */
    public class d extends AbstractC11873h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC11873h f42105a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f42106b;

        public d(AbstractC11873h abstractC11873h, String str) {
            this.f42105a = abstractC11873h;
            this.f42106b = str;
        }

        @Override // p471um.AbstractC11873h
        public T fromJson(AbstractC11878m abstractC11878m) {
            return (T) this.f42105a.fromJson(abstractC11878m);
        }

        @Override // p471um.AbstractC11873h
        public boolean isLenient() {
            return this.f42105a.isLenient();
        }

        @Override // p471um.AbstractC11873h
        public void toJson(AbstractC11885t abstractC11885t, T t8) {
            String strM44399h = abstractC11885t.m44399h();
            abstractC11885t.mo44382w(this.f42106b);
            try {
                this.f42105a.toJson(abstractC11885t, t8);
            } finally {
                abstractC11885t.mo44382w(strM44399h);
            }
        }

        public String toString() {
            return this.f42105a + ".indent(\"" + this.f42106b + "\")";
        }
    }

    /* JADX INFO: renamed from: um.h$e */
    public interface e {
        AbstractC11873h<?> create(Type type, Set<? extends Annotation> set, C11888w c11888w);
    }

    public final AbstractC11873h<T> failOnUnknown() {
        return new c(this);
    }

    public abstract T fromJson(AbstractC11878m abstractC11878m);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final T fromJson(InterfaceC12928g interfaceC12928g) {
        return fromJson(AbstractC11878m.m44314s(interfaceC12928g));
    }

    public final T fromJsonValue(Object obj) {
        try {
            return fromJson(new C11882q(obj));
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public AbstractC11873h<T> indent(String str) {
        if (str != null) {
            return new d(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    public boolean isLenient() {
        return false;
    }

    public final AbstractC11873h<T> lenient() {
        return new b(this);
    }

    public final AbstractC11873h<T> nonNull() {
        return this instanceof C12492a ? this : new C12492a(this);
    }

    public final AbstractC11873h<T> nullSafe() {
        return this instanceof C12493b ? this : new C12493b(this);
    }

    public final AbstractC11873h<T> serializeNulls() {
        return new a(this);
    }

    public abstract void toJson(AbstractC11885t abstractC11885t, T t8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void toJson(InterfaceC12926f interfaceC12926f, T t8) {
        toJson(AbstractC11885t.m44393q(interfaceC12926f), t8);
    }

    public final Object toJsonValue(T t8) {
        C11884s c11884s = new C11884s();
        try {
            toJson(c11884s, t8);
            return c11884s.m44392a0();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final T fromJson(String str) {
        AbstractC11878m abstractC11878mM44314s = AbstractC11878m.m44314s(new C12924e().mo47992C0(str));
        T tFromJson = fromJson(abstractC11878mM44314s);
        if (isLenient() || abstractC11878mM44314s.mo44339u() == AbstractC11878m.c.END_DOCUMENT) {
            return tFromJson;
        }
        throw new C11875j("JSON document was not fully consumed.");
    }

    public final String toJson(T t8) {
        C12924e c12924e = new C12924e();
        try {
            toJson(c12924e, t8);
            return c12924e.mo48008R2();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
