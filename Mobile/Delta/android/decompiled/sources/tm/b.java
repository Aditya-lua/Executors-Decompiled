package tm;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import sm.a0;
import sm.h;
import sm.j;
import sm.m;
import sm.t;
import sm.w;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> implements h.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f32463a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f32464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Type> f32465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h<Object> f32466e;

    public class a extends h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f32467a;

        public a(Object obj) {
            this.f32467a = obj;
        }

        @Override // sm.h
        public Object fromJson(m mVar) {
            mVar.P();
            return this.f32467a;
        }

        @Override // sm.h
        public void toJson(t tVar, Object obj) {
            throw new IllegalArgumentException("Expected one of " + b.this.f32465d + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
        }
    }

    /* JADX INFO: renamed from: tm.b$b, reason: collision with other inner class name */
    public static final class C0582b extends h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32468a;
        public final List<String> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<Type> f32469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<h<Object>> f32470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final h<Object> f32471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final m.b f32472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final m.b f32473g;

        public C0582b(String str, List<String> list, List<Type> list2, List<h<Object>> list3, h<Object> hVar) {
            this.f32468a = str;
            this.b = list;
            this.f32469c = list2;
            this.f32470d = list3;
            this.f32471e = hVar;
            this.f32472f = m.b.a(str);
            this.f32473g = m.b.a((String[]) list.toArray(new String[0]));
        }

        public final int a(m mVar) {
            mVar.b();
            while (mVar.f()) {
                if (mVar.F(this.f32472f) != -1) {
                    int iH = mVar.H(this.f32473g);
                    if (iH != -1 || this.f32471e != null) {
                        return iH;
                    }
                    throw new j("Expected one of " + this.b + " for key '" + this.f32468a + "' but found '" + mVar.r() + "'. Register a subtype for this label.");
                }
                mVar.M();
                mVar.P();
            }
            throw new j("Missing label for " + this.f32468a);
        }

        @Override // sm.h
        public Object fromJson(m mVar) throws IOException {
            m mVarV = mVar.v();
            mVarV.I(false);
            try {
                int iA = a(mVarV);
                mVarV.close();
                return iA == -1 ? this.f32471e.fromJson(mVar) : this.f32470d.get(iA).fromJson(mVar);
            } catch (Throwable th2) {
                mVarV.close();
                throw th2;
            }
        }

        @Override // sm.h
        public void toJson(t tVar, Object obj) {
            h<Object> hVar;
            int iIndexOf = this.f32469c.indexOf(obj.getClass());
            if (iIndexOf == -1) {
                hVar = this.f32471e;
                if (hVar == null) {
                    throw new IllegalArgumentException("Expected one of " + this.f32469c + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
                }
            } else {
                hVar = this.f32470d.get(iIndexOf);
            }
            tVar.c();
            if (hVar != this.f32471e) {
                tVar.n(this.f32468a).M(this.b.get(iIndexOf));
            }
            int iB = tVar.b();
            hVar.toJson(tVar, obj);
            tVar.f(iB);
            tVar.g();
        }

        public String toString() {
            return "PolymorphicJsonAdapter(" + this.f32468a + ")";
        }
    }

    public b(Class<T> cls, String str, List<String> list, List<Type> list2, h<Object> hVar) {
        this.f32463a = cls;
        this.b = str;
        this.f32464c = list;
        this.f32465d = list2;
        this.f32466e = hVar;
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

    @Override // sm.h.e
    public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
        if (a0.g(type) != this.f32463a || !set.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f32465d.size());
        int size = this.f32465d.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(wVar.d(this.f32465d.get(i10)));
        }
        return new C0582b(this.b, this.f32464c, this.f32465d, arrayList, this.f32466e).nullSafe();
    }

    public b<T> d(h<Object> hVar) {
        return new b<>(this.f32463a, this.b, this.f32464c, this.f32465d, hVar);
    }

    public b<T> e(Class<? extends T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("subtype == null");
        }
        if (str == null) {
            throw new NullPointerException("label == null");
        }
        if (this.f32464c.contains(str)) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(this.f32464c);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.f32465d);
        arrayList2.add(cls);
        return new b<>(this.f32463a, this.b, arrayList, arrayList2, this.f32466e);
    }
}
