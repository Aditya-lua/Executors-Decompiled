package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4 f6822a;
    public final y b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f6823c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f6824d = new HashMap();

    public u4(u4 u4Var, y yVar) {
        this.f6822a = u4Var;
        this.b = yVar;
    }

    public final q a(q qVar) {
        return this.b.b(this, qVar);
    }

    public final q b(f fVar) {
        q qVarB = q.f6743zo;
        Iterator itI = fVar.i();
        while (itI.hasNext()) {
            qVarB = this.b.b(this, fVar.m(((Integer) itI.next()).intValue()));
            if (qVarB instanceof h) {
                break;
            }
        }
        return qVarB;
    }

    public final u4 c() {
        return new u4(this, this.b);
    }

    public final boolean d(String str) {
        if (this.f6823c.containsKey(str)) {
            return true;
        }
        u4 u4Var = this.f6822a;
        if (u4Var != null) {
            return u4Var.d(str);
        }
        return false;
    }

    public final void e(String str, q qVar) {
        u4 u4Var;
        Map map = this.f6823c;
        if (!map.containsKey(str) && (u4Var = this.f6822a) != null && u4Var.d(str)) {
            u4Var.e(str, qVar);
        } else {
            if (this.f6824d.containsKey(str)) {
                return;
            }
            if (qVar == null) {
                map.remove(str);
            } else {
                map.put(str, qVar);
            }
        }
    }

    public final void f(String str, q qVar) {
        if (this.f6824d.containsKey(str)) {
            return;
        }
        if (qVar == null) {
            this.f6823c.remove(str);
        } else {
            this.f6823c.put(str, qVar);
        }
    }

    public final void g(String str, q qVar) {
        f(str, qVar);
        this.f6824d.put(str, Boolean.TRUE);
    }

    public final q h(String str) {
        Map map = this.f6823c;
        if (map.containsKey(str)) {
            return (q) map.get(str);
        }
        u4 u4Var = this.f6822a;
        if (u4Var != null) {
            return u4Var.h(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }
}
