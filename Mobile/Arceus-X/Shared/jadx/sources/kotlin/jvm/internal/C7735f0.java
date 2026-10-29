package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: kotlin.jvm.internal.f0 */
/* JADX INFO: loaded from: classes2.dex */
public class C7735f0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Object> f29432a;

    public C7735f0(int i10) {
        this.f29432a = new ArrayList<>(i10);
    }

    /* JADX INFO: renamed from: a */
    public void m32030a(Object obj) {
        this.f29432a.add(obj);
    }

    /* JADX INFO: renamed from: b */
    public void m32031b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f29432a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f29432a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f29432a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f29432a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f29432a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    /* JADX INFO: renamed from: c */
    public int m32032c() {
        return this.f29432a.size();
    }

    /* JADX INFO: renamed from: d */
    public Object[] m32033d(Object[] objArr) {
        return this.f29432a.toArray(objArr);
    }
}
