package m9;

import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23059d;
    public final w1.a b = new w1.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tb.k f23058c = new tb.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23060e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.a f23057a = new w1.a();

    public p1(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f23057a.put(((l9.i) it.next()).v(), null);
        }
        this.f23059d = this.f23057a.keySet().size();
    }

    public final Task a() {
        return this.f23058c.a();
    }

    public final Set b() {
        return this.f23057a.keySet();
    }

    public final void c(b bVar, k9.b bVar2, String str) {
        this.f23057a.put(bVar, bVar2);
        this.b.put(bVar, str);
        this.f23059d--;
        if (!bVar2.F3()) {
            this.f23060e = true;
        }
        if (this.f23059d == 0) {
            if (!this.f23060e) {
                this.f23058c.c(this.b);
            } else {
                this.f23058c.b(new l9.d(this.f23057a));
            }
        }
    }
}
