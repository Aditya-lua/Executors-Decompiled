package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p extends k implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u4 f6793e;

    public p(p pVar) {
        super(pVar.f6642a);
        ArrayList arrayList = new ArrayList(pVar.f6791c.size());
        this.f6791c = arrayList;
        arrayList.addAll(pVar.f6791c);
        ArrayList arrayList2 = new ArrayList(pVar.f6792d.size());
        this.f6792d = arrayList2;
        arrayList2.addAll(pVar.f6792d);
        this.f6793e = pVar.f6793e;
    }

    @Override // com.google.android.gms.internal.measurement.k, com.google.android.gms.internal.measurement.q
    public final q a() {
        return new p(this);
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(u4 u4Var, List list) {
        u4 u4VarC = this.f6793e.c();
        int i10 = 0;
        while (true) {
            List list2 = this.f6791c;
            if (i10 >= list2.size()) {
                break;
            }
            if (i10 < list.size()) {
                u4VarC.f((String) list2.get(i10), u4Var.a((q) list.get(i10)));
            } else {
                u4VarC.f((String) list2.get(i10), q.f6816yo);
            }
            i10++;
        }
        for (q qVar : this.f6792d) {
            q qVarA = u4VarC.a(qVar);
            if (qVarA instanceof r) {
                qVarA = u4VarC.a(qVar);
            }
            if (qVarA instanceof h) {
                return ((h) qVarA).b();
            }
        }
        return q.f6816yo;
    }

    public p(String str, List list, List list2, u4 u4Var) {
        super(str);
        this.f6791c = new ArrayList();
        this.f6793e = u4Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f6791c.add(((q) it.next()).zzc());
            }
        }
        this.f6792d = new ArrayList(list2);
    }
}
