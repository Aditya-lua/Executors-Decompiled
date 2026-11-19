package ce;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import de.j1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f4972a;
    public final a1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f4973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f4974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f4975e = new Handler(Looper.getMainLooper());

    public h(a0 a0Var, a1 a1Var, v0 v0Var, c0 c0Var) {
        this.f4972a = a0Var;
        this.b = a1Var;
        this.f4973c = v0Var;
        this.f4974d = c0Var;
    }

    public static List i(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    @Override // ce.b
    public final Task<Void> a(List<String> list) {
        this.f4974d.c(list);
        return this.f4972a.d(list);
    }

    @Override // ce.b
    public final Set<String> b() {
        return this.f4973c.c();
    }

    @Override // ce.b
    public final synchronized void c(f fVar) {
        this.b.b(fVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    @Override // ce.b
    public final Task<Integer> d(d dVar) {
        Set setD;
        j1 j1Var = new j1();
        j1Var.b(1);
        dVar.a().isEmpty();
        List<Locale> listA = dVar.a();
        if (!listA.isEmpty() && (setD = this.f4973c.d()) != null) {
            HashSet hashSet = new HashSet();
            Iterator<Locale> it = listA.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getLanguage());
            }
            if (setD.containsAll(hashSet)) {
                if (this.f4973c.c().containsAll(dVar.b()) && Collections.disjoint(dVar.b(), this.f4974d.a())) {
                    this.f4975e.post(new b1(this, dVar));
                    return tb.m.f(0);
                }
            }
        } else if (this.f4973c.c().containsAll(dVar.b())) {
            this.f4975e.post(new b1(this, dVar));
            return tb.m.f(0);
        }
        this.f4974d.d(dVar.b());
        return this.f4972a.e(dVar.b(), i(dVar.a()), j1Var);
    }

    @Override // ce.b
    public final Task<Void> e(List<String> list) {
        return this.f4972a.c(list);
    }

    @Override // ce.b
    public final synchronized void f(f fVar) {
        this.b.d(fVar);
    }
}
