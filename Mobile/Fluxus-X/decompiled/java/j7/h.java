package j7;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a<o7.o, Path>> f20108a;
    public final List<a<Integer, Integer>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<o7.i> f20109c;

    public h(List<o7.i> list) {
        this.f20109c = list;
        this.f20108a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f20108a.add(list.get(i10).b().a());
            this.b.add(list.get(i10).c().a());
        }
    }

    public List<a<o7.o, Path>> a() {
        return this.f20108a;
    }

    public List<o7.i> b() {
        return this.f20109c;
    }

    public List<a<Integer, Integer>> c() {
        return this.b;
    }
}
