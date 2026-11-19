package p001kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Object> f21580a;

    public f0(int i10) {
        this.f21580a = new ArrayList<>(i10);
    }

    public void a(Object obj) {
        this.f21580a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f21580a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f21580a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f21580a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f21580a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f21580a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f21580a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f21580a.toArray(objArr);
    }
}
