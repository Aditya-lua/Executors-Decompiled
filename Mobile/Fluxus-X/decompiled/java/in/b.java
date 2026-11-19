package in;

import hn.a0;
import hn.h;
import hn.j;
import hn.m;
import hn.t;
import hn.w;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> implements h.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f19636a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f19637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Type> f19638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h<Object> f19639e;

    public class a extends h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f19640a;

        public a(Object obj) {
            this.f19640a = obj;
        }

        @Override // hn.h
        public Object fromJson(m mVar) {
            mVar.Q();
            return this.f19640a;
        }

        @Override // hn.h
        public void toJson(t tVar, Object obj) {
            throw new IllegalArgumentException("Expected one of " + b.this.f19638d + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
        }
    }

    /* JADX INFO: renamed from: in.b$b, reason: collision with other inner class name */
    public static final class C0363b extends h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19641a;
        public final List<String> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<Type> f19642c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<h<Object>> f19643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final h<Object> f19644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final m.b f19645f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final m.b f19646g;

        public C0363b(String str, List<String> list, List<Type> list2, List<h<Object>> list3, h<Object> hVar) {
            this.f19641a = str;
            this.b = list;
            this.f19642c = list2;
            this.f19643d = list3;
            this.f19644e = hVar;
            this.f19645f = m.b.a(str);
            this.f19646g = m.b.a((String[]) list.toArray(new String[0]));
        }

        public final int a(m mVar) {
            mVar.b();
            while (mVar.f()) {
                if (mVar.I(this.f19645f) != -1) {
                    int iK = mVar.K(this.f19646g);
                    if (iK != -1 || this.f19644e != null) {
                        return iK;
                    }
                    throw new j("Expected one of " + this.b + " for key '" + this.f19641a + "' but found '" + mVar.s() + "'. Register a subtype for this label.");
                }
                mVar.O();
                mVar.Q();
            }
            throw new j("Missing label for " + this.f19641a);
        }

        @Override // hn.h
        public Object fromJson(m mVar) throws IOException {
            m mVarY = mVar.y();
            mVarY.L(false);
            try {
                int iA = a(mVarY);
                mVarY.close();
                return iA == -1 ? this.f19644e.fromJson(mVar) : this.f19643d.get(iA).fromJson(mVar);
            } catch (Throwable th2) {
                mVarY.close();
                throw th2;
            }
        }

        @Override // hn.h
        public void toJson(t tVar, Object obj) {
            h<Object> hVar;
            int iIndexOf = this.f19642c.indexOf(obj.getClass());
            if (iIndexOf == -1) {
                hVar = this.f19644e;
                if (hVar == null) {
                    throw new IllegalArgumentException("Expected one of " + this.f19642c + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
                }
            } else {
                hVar = this.f19643d.get(iIndexOf);
            }
            tVar.c();
            if (hVar != this.f19644e) {
                tVar.o(this.f19641a).Q(this.b.get(iIndexOf));
            }
            int iB = tVar.b();
            hVar.toJson(tVar, obj);
            tVar.f(iB);
            tVar.g();
        }

        public String toString() {
            return "PolymorphicJsonAdapter(" + this.f19641a + ")";
        }
    }

    public b(Class<T> cls, String str, List<String> list, List<Type> list2, h<Object> hVar) {
        this.f19636a = cls;
        this.b = str;
        this.f19637c = list;
        this.f19638d = list2;
        this.f19639e = hVar;
    }

    public static <T> b<T> b(Class<T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("baseType == null");
        }
        if (str == null) {
            throw new NullPointerException("labelKey == null");
        }
        List list = Collections.EMPTY_LIST;
        return new b<>(cls, str, list, list, null);
    }

    public final h<Object> a(T t8) {
        return new a(t8);
    }

    public b<T> c(T t8) {
        return d(a(t8));
    }

    @Override // hn.h.e
    public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
        if (a0.g(type) != this.f19636a || !set.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f19638d.size());
        int size = this.f19638d.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(wVar.d(this.f19638d.get(i10)));
        }
        return new C0363b(this.b, this.f19637c, this.f19638d, arrayList, this.f19639e).nullSafe();
    }

    public b<T> d(h<Object> hVar) {
        return new b<>(this.f19636a, this.b, this.f19637c, this.f19638d, hVar);
    }

    public b<T> e(Class<? extends T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("subtype == null");
        }
        if (str == null) {
            throw new NullPointerException("label == null");
        }
        if (this.f19637c.contains(str)) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(this.f19637c);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.f19638d);
        arrayList2.add(cls);
        return new b<>(this.f19636a, this.b, arrayList, arrayList2, this.f19639e);
    }
}
