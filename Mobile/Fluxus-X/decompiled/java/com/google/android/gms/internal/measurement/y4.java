package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y4 f6944a;
    public final y b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f6945c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f6946d = new HashMap();

    public y4(y4 y4Var, y yVar) {
        this.f6944a = y4Var;
        this.b = yVar;
    }

    public final q a(q qVar) {
        return this.b.b(this, qVar);
    }

    public final q b(f fVar) {
        q qVarB = q.Co;
        Iterator itI = fVar.i();
        while (itI.hasNext()) {
            qVarB = this.b.b(this, fVar.m(((Integer) itI.next()).intValue()));
            if (qVarB instanceof h) {
                break;
            }
        }
        return qVarB;
    }

    public final y4 c() {
        return new y4(this, this.b);
    }

    public final boolean d(String str) {
        if (this.f6945c.containsKey(str)) {
            return true;
        }
        y4 y4Var = this.f6944a;
        if (y4Var != null) {
            return y4Var.d(str);
        }
        return false;
    }

    public final void e(String str, q qVar) {
        y4 y4Var;
        Map map = this.f6945c;
        if (!map.containsKey(str) && (y4Var = this.f6944a) != null && y4Var.d(str)) {
            y4Var.e(str, qVar);
        } else {
            if (this.f6946d.containsKey(str)) {
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
        if (this.f6946d.containsKey(str)) {
            return;
        }
        if (qVar == null) {
            this.f6945c.remove(str);
        } else {
            this.f6945c.put(str, qVar);
        }
    }

    public final void g(String str, q qVar) {
        f(str, qVar);
        this.f6946d.put(str, Boolean.TRUE);
    }

    public final q h(String str) {
        Map map = this.f6945c;
        if (map.containsKey(str)) {
            return (q) map.get(str);
        }
        y4 y4Var = this.f6944a;
        if (y4Var != null) {
            return y4Var.h(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }
}
