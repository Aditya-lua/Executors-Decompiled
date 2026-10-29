package p471um;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: um.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C11867b extends AbstractC11873h<Object> {

    /* JADX INFO: renamed from: c */
    public static final AbstractC11873h.e f42077c = new a();

    /* JADX INFO: renamed from: a */
    public final Class<?> f42078a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11873h<Object> f42079b;

    /* JADX INFO: renamed from: um.b$a */
    public class a implements AbstractC11873h.e {
        @Override // p471um.AbstractC11873h.e
        public AbstractC11873h<?> create(Type type, Set<? extends Annotation> set, C11888w c11888w) {
            Type typeM44289a = C11866a0.m44289a(type);
            if (typeM44289a != null && set.isEmpty()) {
                return new C11867b(C11866a0.m44295g(typeM44289a), c11888w.m44437d(typeM44289a)).nullSafe();
            }
            return null;
        }
    }

    public C11867b(Class<?> cls, AbstractC11873h<Object> abstractC11873h) {
        this.f42078a = cls;
        this.f42079b = abstractC11873h;
    }

    @Override // p471um.AbstractC11873h
    public Object fromJson(AbstractC11878m abstractC11878m) {
        ArrayList arrayList = new ArrayList();
        abstractC11878m.mo44324a();
        while (abstractC11878m.mo44329f()) {
            arrayList.add(this.f42079b.fromJson(abstractC11878m));
        }
        abstractC11878m.mo44326c();
        Object objNewInstance = Array.newInstance(this.f42078a, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // p471um.AbstractC11873h
    public void toJson(AbstractC11885t abstractC11885t, Object obj) {
        abstractC11885t.mo44371a();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f42079b.toJson(abstractC11885t, Array.get(obj, i10));
        }
        abstractC11885t.mo44375e();
    }

    public String toString() {
        return this.f42079b + ".array()";
    }
}
