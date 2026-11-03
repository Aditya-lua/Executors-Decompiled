package ae;

import android.os.Handler;
import android.os.Looper;
import be.j1;
import com.google.android.gms.tasks.Task;
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
    public final a0 f425a;
    public final a1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f428e = new Handler(Looper.getMainLooper());

    public h(a0 a0Var, a1 a1Var, v0 v0Var, c0 c0Var) {
        this.f425a = a0Var;
        this.b = a1Var;
        this.f426c = v0Var;
        this.f427d = c0Var;
    }

    public static List i(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    @Override // ae.b
    public final Task<Integer> a(d dVar) {
        Set setD;
        j1 j1Var = new j1();
        j1Var.b(1);
        dVar.a().isEmpty();
        List<Locale> listA = dVar.a();
        if (!listA.isEmpty() && (setD = this.f426c.d()) != null) {
            HashSet hashSet = new HashSet();
            Iterator<Locale> it = listA.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getLanguage());
            }
            if (setD.containsAll(hashSet)) {
                if (this.f426c.c().containsAll(dVar.b()) && Collections.disjoint(dVar.b(), this.f427d.a())) {
                    this.f428e.post(new b1(this, dVar));
                    return sb.m.f(0);
                }
            }
        } else if (this.f426c.c().containsAll(dVar.b())) {
            this.f428e.post(new b1(this, dVar));
            return sb.m.f(0);
        }
        this.f427d.d(dVar.b());
        return this.f425a.e(dVar.b(), i(dVar.a()), j1Var);
    }

    @Override // ae.b
    public final synchronized void b(f fVar) {
        this.b.d(fVar);
    }

    @Override // ae.b
    public final synchronized void c(f fVar) {
        this.b.b(fVar);
    }

    @Override // ae.b
    public final Task<Void> d(List<String> list) {
        this.f427d.c(list);
        return this.f425a.d(list);
    }

    @Override // ae.b
    public final Set<String> e() {
        return this.f426c.c();
    }

    @Override // ae.b
    public final Task<Void> f(List<String> list) {
        return this.f425a.c(list);
    }
}
