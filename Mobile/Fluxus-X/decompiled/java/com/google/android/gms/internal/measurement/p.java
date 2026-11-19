package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p extends k implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y4 f6762e;

    public p(p pVar) {
        super(pVar.f6570a);
        ArrayList arrayList = new ArrayList(pVar.f6760c.size());
        this.f6760c = arrayList;
        arrayList.addAll(pVar.f6760c);
        ArrayList arrayList2 = new ArrayList(pVar.f6761d.size());
        this.f6761d = arrayList2;
        arrayList2.addAll(pVar.f6761d);
        this.f6762e = pVar.f6762e;
    }

    @Override // com.google.android.gms.internal.measurement.k, com.google.android.gms.internal.measurement.q
    public final q a() {
        return new p(this);
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(y4 y4Var, List list) {
        y4 y4VarC = this.f6762e.c();
        int i10 = 0;
        while (true) {
            List list2 = this.f6760c;
            if (i10 >= list2.size()) {
                break;
            }
            if (i10 < list.size()) {
                y4VarC.f((String) list2.get(i10), y4Var.a((q) list.get(i10)));
            } else {
                y4VarC.f((String) list2.get(i10), q.Co);
            }
            i10++;
        }
        for (q qVar : this.f6761d) {
            q qVarA = y4VarC.a(qVar);
            if (qVarA instanceof r) {
                qVarA = y4VarC.a(qVar);
            }
            if (qVarA instanceof h) {
                return ((h) qVarA).b();
            }
        }
        return q.Co;
    }

    public p(String str, List list, List list2, y4 y4Var) {
        super(str);
        this.f6760c = new ArrayList();
        this.f6762e = y4Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f6760c.add(((q) it.next()).zzc());
            }
        }
        this.f6761d = new ArrayList(list2);
    }
}
