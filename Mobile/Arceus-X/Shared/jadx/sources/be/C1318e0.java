package be;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: be.e0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1318e0 extends C1321f0 {
    public C1318e0(Object obj, Field field, Class cls) {
        super(obj, field, Array.newInstance((Class<?>) cls, 0).getClass());
    }

    /* JADX INFO: renamed from: d */
    public final void m7109d(Collection collection) {
        Object[] objArr = (Object[]) m7124a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) m7111f(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        m7126c(objArr2);
    }

    /* JADX INFO: renamed from: e */
    public final void m7110e(Collection collection) {
        Object[] objArr = (Object[]) m7124a();
        int i10 = 0;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) m7111f(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i10] = it.next();
            i10++;
        }
        m7126c(objArr2);
    }

    /* JADX INFO: renamed from: f */
    public final Class m7111f() {
        return m7125b().getType().getComponentType();
    }
}
