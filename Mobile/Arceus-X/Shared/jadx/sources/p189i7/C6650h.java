package p189i7;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p303n7.C8903i;
import p303n7.C8909o;

/* JADX INFO: renamed from: i7.h */
/* JADX INFO: loaded from: classes3.dex */
public class C6650h {

    /* JADX INFO: renamed from: a */
    public final List<AbstractC6643a<C8909o, Path>> f25648a;

    /* JADX INFO: renamed from: b */
    public final List<AbstractC6643a<Integer, Integer>> f25649b;

    /* JADX INFO: renamed from: c */
    public final List<C8903i> f25650c;

    public C6650h(List<C8903i> list) {
        this.f25650c = list;
        this.f25648a = new ArrayList(list.size());
        this.f25649b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f25648a.add(list.get(i10).m35875b().mo34233a());
            this.f25649b.add(list.get(i10).m35876c().mo34233a());
        }
    }

    /* JADX INFO: renamed from: a */
    public List<AbstractC6643a<C8909o, Path>> m28699a() {
        return this.f25648a;
    }

    /* JADX INFO: renamed from: b */
    public List<C8903i> m28700b() {
        return this.f25650c;
    }

    /* JADX INFO: renamed from: c */
    public List<AbstractC6643a<Integer, Integer>> m28701c() {
        return this.f25649b;
    }
}
