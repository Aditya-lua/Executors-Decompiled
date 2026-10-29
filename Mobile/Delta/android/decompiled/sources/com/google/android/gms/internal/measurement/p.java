package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p extends k implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u4 f6720e;

    public p(p pVar) {
        super(pVar.f6569a);
        ArrayList arrayList = new ArrayList(pVar.f6718c.size());
        this.f6718c = arrayList;
        arrayList.addAll(pVar.f6718c);
        ArrayList arrayList2 = new ArrayList(pVar.f6719d.size());
        this.f6719d = arrayList2;
        arrayList2.addAll(pVar.f6719d);
        this.f6720e = pVar.f6720e;
    }

    @Override // com.google.android.gms.internal.measurement.k, com.google.android.gms.internal.measurement.q
    public final q a() {
        return new p(this);
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(u4 u4Var, List list) {
        u4 u4VarC = this.f6720e.c();
        int i10 = 0;
        while (true) {
            List list2 = this.f6718c;
            if (i10 >= list2.size()) {
                break;
            }
            if (i10 < list.size()) {
                u4VarC.f((String) list2.get(i10), u4Var.a((q) list.get(i10)));
            } else {
                u4VarC.f((String) list2.get(i10), q.f6743zo);
            }
            i10++;
        }
        for (q qVar : this.f6719d) {
            q qVarA = u4VarC.a(qVar);
            if (qVarA instanceof r) {
                qVarA = u4VarC.a(qVar);
            }
            if (qVarA instanceof h) {
                return ((h) qVarA).b();
            }
        }
        return q.f6743zo;
    }

    public p(String str, List list, List list2, u4 u4Var) {
        super(str);
        this.f6718c = new ArrayList();
        this.f6720e = u4Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f6718c.add(((q) it.next()).zzc());
            }
        }
        this.f6719d = new ArrayList(list2);
    }
}
