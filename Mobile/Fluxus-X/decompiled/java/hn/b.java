package hn;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends h<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h.e f18319c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f18320a;
    public final h<Object> b;

    public class a implements h.e {
        @Override // hn.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
            Type typeA = a0.a(type);
            if (typeA != null && set.isEmpty()) {
                return new b(a0.g(typeA), wVar.d(typeA)).nullSafe();
            }
            return null;
        }
    }

    public b(Class<?> cls, h<Object> hVar) {
        this.f18320a = cls;
        this.b = hVar;
    }

    @Override // hn.h
    public Object fromJson(m mVar) {
        ArrayList arrayList = new ArrayList();
        mVar.a();
        while (mVar.f()) {
            arrayList.add(this.b.fromJson(mVar));
        }
        mVar.c();
        Object objNewInstance = Array.newInstance(this.f18320a, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // hn.h
    public void toJson(t tVar, Object obj) {
        tVar.a();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.b.toJson(tVar, Array.get(obj, i10));
        }
        tVar.e();
    }

    public String toString() {
        return this.b + ".array()";
    }
}
