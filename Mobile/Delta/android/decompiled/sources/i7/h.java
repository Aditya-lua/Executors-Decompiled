package i7;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a<n7.o, Path>> f20306a;
    public final List<a<Integer, Integer>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<n7.i> f20307c;

    public h(List<n7.i> list) {
        this.f20307c = list;
        this.f20306a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f20306a.add(list.get(i10).b().a());
            this.b.add(list.get(i10).c().a());
        }
    }

    public List<a<n7.o, Path>> a() {
        return this.f20306a;
    }

    public List<n7.i> b() {
        return this.f20307c;
    }

    public List<a<Integer, Integer>> c() {
        return this.b;
    }
}
