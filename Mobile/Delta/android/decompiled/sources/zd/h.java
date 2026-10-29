package zd;

import ae.j1;
import android.os.Handler;
import android.os.Looper;
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
    public final a0 f37469a;
    public final a1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f37470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f37471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f37472e = new Handler(Looper.getMainLooper());

    public h(a0 a0Var, a1 a1Var, v0 v0Var, c0 c0Var) {
        this.f37469a = a0Var;
        this.b = a1Var;
        this.f37470c = v0Var;
        this.f37471d = c0Var;
    }

    public static List i(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    @Override // zd.b
    public final synchronized void a(f fVar) {
        this.b.d(fVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    @Override // zd.b
    public final Task<Integer> b(d dVar) {
        Set setD;
        j1 j1Var = new j1();
        j1Var.b(1);
        dVar.a().isEmpty();
        List<Locale> listA = dVar.a();
        if (!listA.isEmpty() && (setD = this.f37470c.d()) != null) {
            HashSet hashSet = new HashSet();
            Iterator<Locale> it = listA.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getLanguage());
            }
            if (setD.containsAll(hashSet)) {
                if (this.f37470c.c().containsAll(dVar.b()) && Collections.disjoint(dVar.b(), this.f37471d.a())) {
                    this.f37472e.post(new b1(this, dVar));
                    return sb.m.f(0);
                }
            }
        } else if (this.f37470c.c().containsAll(dVar.b())) {
            this.f37472e.post(new b1(this, dVar));
            return sb.m.f(0);
        }
        this.f37471d.d(dVar.b());
        return this.f37469a.e(dVar.b(), i(dVar.a()), j1Var);
    }

    @Override // zd.b
    public final synchronized void c(f fVar) {
        this.b.b(fVar);
    }

    @Override // zd.b
    public final Task<Void> d(List<String> list) {
        this.f37471d.c(list);
        return this.f37469a.d(list);
    }

    @Override // zd.b
    public final Set<String> e() {
        return this.f37470c.c();
    }

    @Override // zd.b
    public final Task<Void> f(List<String> list) {
        return this.f37469a.c(list);
    }
}
