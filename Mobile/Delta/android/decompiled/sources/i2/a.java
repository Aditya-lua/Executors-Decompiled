package i2;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import w1.j;
import x2.d;
import x2.e;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<ArrayList<T>> f20247a = new e(10);
    public final j<T, ArrayList<T>> b = new j<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<T> f20248c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet<T> f20249d = new HashSet<>();

    public void a(@NonNull T t8, @NonNull T t10) {
        if (!this.b.containsKey(t8) || !this.b.containsKey(t10)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.b.get(t8);
        if (arrayListF == null) {
            arrayListF = f();
            this.b.put(t8, arrayListF);
        }
        arrayListF.add(t10);
    }

    public void b(@NonNull T t8) {
        if (this.b.containsKey(t8)) {
            return;
        }
        this.b.put(t8, null);
    }

    public void c() {
        int size = this.b.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListK = this.b.k(i10);
            if (arrayListK != null) {
                k(arrayListK);
            }
        }
        this.b.clear();
    }

    public boolean d(@NonNull T t8) {
        return this.b.containsKey(t8);
    }

    public final void e(T t8, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t8)) {
            return;
        }
        if (hashSet.contains(t8)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t8);
        ArrayList<T> arrayList2 = this.b.get(t8);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(t8);
        arrayList.add(t8);
    }

    @NonNull
    public final ArrayList<T> f() {
        ArrayList<T> arrayListB = this.f20247a.b();
        return arrayListB == null ? new ArrayList<>() : arrayListB;
    }

    public List g(@NonNull T t8) {
        return this.b.get(t8);
    }

    public List<T> h(@NonNull T t8) {
        int size = this.b.getSize();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListK = this.b.k(i10);
            if (arrayListK != null && arrayListK.contains(t8)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.b.f(i10));
            }
        }
        return arrayList;
    }

    @NonNull
    public ArrayList<T> i() {
        this.f20248c.clear();
        this.f20249d.clear();
        int size = this.b.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.b.f(i10), this.f20248c, this.f20249d);
        }
        return this.f20248c;
    }

    public boolean j(@NonNull T t8) {
        int size = this.b.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListK = this.b.k(i10);
            if (arrayListK != null && arrayListK.contains(t8)) {
                return true;
            }
        }
        return false;
    }

    public final void k(@NonNull ArrayList<T> arrayList) {
        arrayList.clear();
        this.f20247a.a(arrayList);
    }
}
