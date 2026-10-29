package p184i2;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p504w1.C12286j;
import p533x2.C12635e;
import p533x2.InterfaceC12634d;

/* JADX INFO: renamed from: i2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6632a<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC12634d<ArrayList<T>> f25580a = new C12635e(10);

    /* JADX INFO: renamed from: b */
    public final C12286j<T, ArrayList<T>> f25581b = new C12286j<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<T> f25582c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final HashSet<T> f25583d = new HashSet<>();

    /* JADX INFO: renamed from: a */
    public void m28608a(@NonNull T t8, @NonNull T t10) {
        if (!this.f25581b.containsKey(t8) || !this.f25581b.containsKey(t10)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListM28613f = this.f25581b.get(t8);
        if (arrayListM28613f == null) {
            arrayListM28613f = m28613f();
            this.f25581b.put(t8, arrayListM28613f);
        }
        arrayListM28613f.add(t10);
    }

    /* JADX INFO: renamed from: b */
    public void m28609b(@NonNull T t8) {
        if (this.f25581b.containsKey(t8)) {
            return;
        }
        this.f25581b.put(t8, null);
    }

    /* JADX INFO: renamed from: c */
    public void m28610c() {
        int size = this.f25581b.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListM45629k = this.f25581b.m45629k(i10);
            if (arrayListM45629k != null) {
                m28618k(arrayListM45629k);
            }
        }
        this.f25581b.clear();
    }

    /* JADX INFO: renamed from: d */
    public boolean m28611d(@NonNull T t8) {
        return this.f25581b.containsKey(t8);
    }

    /* JADX INFO: renamed from: e */
    public final void m28612e(T t8, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t8)) {
            return;
        }
        if (hashSet.contains(t8)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t8);
        ArrayList<T> arrayList2 = this.f25581b.get(t8);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                m28612e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(t8);
        arrayList.add(t8);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final ArrayList<T> m28613f() {
        ArrayList<T> arrayListMo47067b = this.f25580a.mo47067b();
        return arrayListMo47067b == null ? new ArrayList<>() : arrayListMo47067b;
    }

    /* JADX INFO: renamed from: g */
    public List m28614g(@NonNull T t8) {
        return this.f25581b.get(t8);
    }

    /* JADX INFO: renamed from: h */
    public List<T> m28615h(@NonNull T t8) {
        int size = this.f25581b.getSize();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListM45629k = this.f25581b.m45629k(i10);
            if (arrayListM45629k != null && arrayListM45629k.contains(t8)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f25581b.m45625f(i10));
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public ArrayList<T> m28616i() {
        this.f25582c.clear();
        this.f25583d.clear();
        int size = this.f25581b.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            m28612e(this.f25581b.m45625f(i10), this.f25582c, this.f25583d);
        }
        return this.f25582c;
    }

    /* JADX INFO: renamed from: j */
    public boolean m28617j(@NonNull T t8) {
        int size = this.f25581b.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListM45629k = this.f25581b.m45629k(i10);
            if (arrayListM45629k != null && arrayListM45629k.contains(t8)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m28618k(@NonNull ArrayList<T> arrayList) {
        arrayList.clear();
        this.f25580a.mo47066a(arrayList);
    }
}
