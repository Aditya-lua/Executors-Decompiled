package og;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import lg.a0;
import lg.b0;
import ng.x;

/* JADX INFO: loaded from: classes2.dex */
public final class a<E> extends a0<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f28122c = new C0543a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<E> f28123a;
    public final a0<E> b;

    /* JADX INFO: renamed from: og.a$a, reason: collision with other inner class name */
    public class C0543a implements b0 {
        @Override // lg.b0
        public <T> a0<T> create(lg.f fVar, sg.a<T> aVar) {
            Type typeD = aVar.d();
            if (!(typeD instanceof GenericArrayType) && (!(typeD instanceof Class) || !((Class) typeD).isArray())) {
                return null;
            }
            Type typeG = x.g(typeD);
            return new a(fVar, fVar.m(sg.a.b(typeG)), x.k(typeG));
        }
    }

    public a(lg.f fVar, a0<E> a0Var, Class<E> cls) {
        this.b = new o(fVar, a0Var, cls);
        this.f28123a = cls;
    }

    @Override // lg.a0
    public Object read(tg.a aVar) throws IOException {
        if (aVar.Q() == tg.b.NULL) {
            aVar.K();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.p()) {
            arrayList.add(this.b.read(aVar));
        }
        aVar.g();
        int size = arrayList.size();
        if (!this.f28123a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f28123a, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f28123a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // lg.a0
    public void write(tg.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.s();
            return;
        }
        cVar.d();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.b.write(cVar, (E) Array.get(obj, i10));
        }
        cVar.g();
    }
}
