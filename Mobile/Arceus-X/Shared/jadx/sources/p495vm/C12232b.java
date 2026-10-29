package p495vm;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11866a0;
import p471um.C11875j;
import p471um.C11888w;

/* JADX INFO: renamed from: vm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C12232b<T> implements AbstractC11873h.e {

    /* JADX INFO: renamed from: a */
    public final Class<T> f43151a;

    /* JADX INFO: renamed from: b */
    public final String f43152b;

    /* JADX INFO: renamed from: c */
    public final List<String> f43153c;

    /* JADX INFO: renamed from: d */
    public final List<Type> f43154d;

    /* JADX INFO: renamed from: e */
    public final AbstractC11873h<Object> f43155e;

    /* JADX INFO: renamed from: vm.b$a */
    public class a extends AbstractC11873h<Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f43156a;

        public a(Object obj) {
            this.f43156a = obj;
        }

        @Override // p471um.AbstractC11873h
        public Object fromJson(AbstractC11878m abstractC11878m) {
            abstractC11878m.mo44321P();
            return this.f43156a;
        }

        @Override // p471um.AbstractC11873h
        public void toJson(AbstractC11885t abstractC11885t, Object obj) {
            throw new IllegalArgumentException("Expected one of " + C12232b.this.f43154d + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
        }
    }

    /* JADX INFO: renamed from: vm.b$b */
    public static final class b extends AbstractC11873h<Object> {

        /* JADX INFO: renamed from: a */
        public final String f43158a;

        /* JADX INFO: renamed from: b */
        public final List<String> f43159b;

        /* JADX INFO: renamed from: c */
        public final List<Type> f43160c;

        /* JADX INFO: renamed from: d */
        public final List<AbstractC11873h<Object>> f43161d;

        /* JADX INFO: renamed from: e */
        public final AbstractC11873h<Object> f43162e;

        /* JADX INFO: renamed from: f */
        public final AbstractC11878m.b f43163f;

        /* JADX INFO: renamed from: g */
        public final AbstractC11878m.b f43164g;

        public b(String str, List<String> list, List<Type> list2, List<AbstractC11873h<Object>> list3, AbstractC11873h<Object> abstractC11873h) {
            this.f43158a = str;
            this.f43159b = list;
            this.f43160c = list2;
            this.f43161d = list3;
            this.f43162e = abstractC11873h;
            this.f43163f = AbstractC11878m.b.m44343a(str);
            this.f43164g = AbstractC11878m.b.m44343a((String[]) list.toArray(new String[0]));
        }

        /* JADX INFO: renamed from: a */
        public final int m45369a(AbstractC11878m abstractC11878m) {
            abstractC11878m.mo44325b();
            while (abstractC11878m.mo44329f()) {
                if (abstractC11878m.mo44316F(this.f43163f) != -1) {
                    int iMo44317H = abstractC11878m.mo44317H(this.f43164g);
                    if (iMo44317H != -1 || this.f43162e != null) {
                        return iMo44317H;
                    }
                    throw new C11875j("Expected one of " + this.f43159b + " for key '" + this.f43158a + "' but found '" + abstractC11878m.mo44338r() + "'. Register a subtype for this label.");
                }
                abstractC11878m.mo44320M();
                abstractC11878m.mo44321P();
            }
            throw new C11875j("Missing label for " + this.f43158a);
        }

        @Override // p471um.AbstractC11873h
        public Object fromJson(AbstractC11878m abstractC11878m) throws IOException {
            AbstractC11878m abstractC11878mMo44340v = abstractC11878m.mo44340v();
            abstractC11878mMo44340v.m44318I(false);
            try {
                int iM45369a = m45369a(abstractC11878mMo44340v);
                abstractC11878mMo44340v.close();
                return iM45369a == -1 ? this.f43162e.fromJson(abstractC11878m) : this.f43161d.get(iM45369a).fromJson(abstractC11878m);
            } catch (Throwable th2) {
                abstractC11878mMo44340v.close();
                throw th2;
            }
        }

        @Override // p471um.AbstractC11873h
        public void toJson(AbstractC11885t abstractC11885t, Object obj) {
            AbstractC11873h<Object> abstractC11873h;
            int iIndexOf = this.f43160c.indexOf(obj.getClass());
            if (iIndexOf == -1) {
                abstractC11873h = this.f43162e;
                if (abstractC11873h == null) {
                    throw new IllegalArgumentException("Expected one of " + this.f43160c + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
                }
            } else {
                abstractC11873h = this.f43161d.get(iIndexOf);
            }
            abstractC11885t.mo44374c();
            if (abstractC11873h != this.f43162e) {
                abstractC11885t.mo44380n(this.f43158a).mo44367M(this.f43159b.get(iIndexOf));
            }
            int iM44396b = abstractC11885t.m44396b();
            abstractC11873h.toJson(abstractC11885t, obj);
            abstractC11885t.m44398f(iM44396b);
            abstractC11885t.mo44378g();
        }

        public String toString() {
            return "PolymorphicJsonAdapter(" + this.f43158a + ")";
        }
    }

    public C12232b(Class<T> cls, String str, List<String> list, List<Type> list2, AbstractC11873h<Object> abstractC11873h) {
        this.f43151a = cls;
        this.f43152b = str;
        this.f43153c = list;
        this.f43154d = list2;
        this.f43155e = abstractC11873h;
    }

    /* JADX INFO: renamed from: b */
    public static <T> C12232b<T> m45364b(Class<T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("baseType == null");
        }
        if (str == null) {
            throw new NullPointerException("labelKey == null");
        }
        List list = Collections.EMPTY_LIST;
        return new C12232b<>(cls, str, list, list, null);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC11873h<Object> m45365a(T t8) {
        return new a(t8);
    }

    /* JADX INFO: renamed from: c */
    public C12232b<T> m45366c(T t8) {
        return m45367d(m45365a(t8));
    }

    @Override // p471um.AbstractC11873h.e
    public AbstractC11873h<?> create(Type type, Set<? extends Annotation> set, C11888w c11888w) {
        if (C11866a0.m44295g(type) != this.f43151a || !set.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f43154d.size());
        int size = this.f43154d.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(c11888w.m44437d(this.f43154d.get(i10)));
        }
        return new b(this.f43152b, this.f43153c, this.f43154d, arrayList, this.f43155e).nullSafe();
    }

    /* JADX INFO: renamed from: d */
    public C12232b<T> m45367d(AbstractC11873h<Object> abstractC11873h) {
        return new C12232b<>(this.f43151a, this.f43152b, this.f43153c, this.f43154d, abstractC11873h);
    }

    /* JADX INFO: renamed from: e */
    public C12232b<T> m45368e(Class<? extends T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("subtype == null");
        }
        if (str == null) {
            throw new NullPointerException("label == null");
        }
        if (this.f43153c.contains(str)) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(this.f43153c);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.f43154d);
        arrayList2.add(cls);
        return new C12232b<>(this.f43151a, this.f43152b, arrayList, arrayList2, this.f43155e);
    }
}
