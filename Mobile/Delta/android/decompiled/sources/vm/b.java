package vm;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import um.a0;
import um.h;
import um.j;
import um.m;
import um.t;
import um.w;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> implements h.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f33327a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f33328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Type> f33329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h<Object> f33330e;

    public class a extends h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f33331a;

        public a(Object obj) {
            this.f33331a = obj;
        }

        @Override // um.h
        public Object fromJson(m mVar) {
            mVar.P();
            return this.f33331a;
        }

        @Override // um.h
        public void toJson(t tVar, Object obj) {
            throw new IllegalArgumentException("Expected one of " + b.this.f33329d + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
        }
    }

    /* JADX INFO: renamed from: vm.b$b, reason: collision with other inner class name */
    public static final class C0603b extends h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33332a;
        public final List<String> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<Type> f33333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<h<Object>> f33334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final h<Object> f33335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final m.b f33336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final m.b f33337g;

        public C0603b(String str, List<String> list, List<Type> list2, List<h<Object>> list3, h<Object> hVar) {
            this.f33332a = str;
            this.b = list;
            this.f33333c = list2;
            this.f33334d = list3;
            this.f33335e = hVar;
            this.f33336f = m.b.a(str);
            this.f33337g = m.b.a((String[]) list.toArray(new String[0]));
        }

        public final int a(m mVar) {
            mVar.b();
            while (mVar.f()) {
                if (mVar.F(this.f33336f) != -1) {
                    int iH = mVar.H(this.f33337g);
                    if (iH != -1 || this.f33335e != null) {
                        return iH;
                    }
                    throw new j("Expected one of " + this.b + " for key '" + this.f33332a + "' but found '" + mVar.r() + "'. Register a subtype for this label.");
                }
                mVar.M();
                mVar.P();
            }
            throw new j("Missing label for " + this.f33332a);
        }

        @Override // um.h
        public Object fromJson(m mVar) throws IOException {
            m mVarV = mVar.v();
            mVarV.I(false);
            try {
                int iA = a(mVarV);
                mVarV.close();
                return iA == -1 ? this.f33335e.fromJson(mVar) : this.f33334d.get(iA).fromJson(mVar);
            } catch (Throwable th2) {
                mVarV.close();
                throw th2;
            }
        }

        @Override // um.h
        public void toJson(t tVar, Object obj) {
            h<Object> hVar;
            int iIndexOf = this.f33333c.indexOf(obj.getClass());
            if (iIndexOf == -1) {
                hVar = this.f33335e;
                if (hVar == null) {
                    throw new IllegalArgumentException("Expected one of " + this.f33333c + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
                }
            } else {
                hVar = this.f33334d.get(iIndexOf);
            }
            tVar.c();
            if (hVar != this.f33335e) {
                tVar.n(this.f33332a).M(this.b.get(iIndexOf));
            }
            int iB = tVar.b();
            hVar.toJson(tVar, obj);
            tVar.f(iB);
            tVar.g();
        }

        public String toString() {
            return "PolymorphicJsonAdapter(" + this.f33332a + ")";
        }
    }

    public b(Class<T> cls, String str, List<String> list, List<Type> list2, h<Object> hVar) {
        this.f33327a = cls;
        this.b = str;
        this.f33328c = list;
        this.f33329d = list2;
        this.f33330e = hVar;
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

    @Override // um.h.e
    public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
        if (a0.g(type) != this.f33327a || !set.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f33329d.size());
        int size = this.f33329d.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(wVar.d(this.f33329d.get(i10)));
        }
        return new C0603b(this.b, this.f33328c, this.f33329d, arrayList, this.f33330e).nullSafe();
    }

    public b<T> d(h<Object> hVar) {
        return new b<>(this.f33327a, this.b, this.f33328c, this.f33329d, hVar);
    }

    public b<T> e(Class<? extends T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("subtype == null");
        }
        if (str == null) {
            throw new NullPointerException("label == null");
        }
        if (this.f33328c.contains(str)) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(this.f33328c);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.f33329d);
        arrayList2.add(cls);
        return new b<>(this.f33327a, this.b, arrayList, arrayList2, this.f33330e);
    }
}
