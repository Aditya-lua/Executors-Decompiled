package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1998c {

    /* JADX INFO: renamed from: a */
    public C1979b f8121a;

    /* JADX INFO: renamed from: b */
    public C1979b f8122b;

    /* JADX INFO: renamed from: c */
    public final List f8123c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1998c() {
        this.f8121a = new C1979b("", 0L, null);
        this.f8122b = new C1979b("", 0L, null);
        this.f8123c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final C1979b m9832a() {
        return this.f8121a;
    }

    /* JADX INFO: renamed from: b */
    public final void m9833b(C1979b c1979b) {
        this.f8121a = c1979b;
        this.f8122b = c1979b.clone();
        this.f8123c.clear();
    }

    /* JADX INFO: renamed from: c */
    public final C1979b m9834c() {
        return this.f8122b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C1998c c1998c = new C1998c(this.f8121a.clone());
        Iterator it = this.f8123c.iterator();
        while (it.hasNext()) {
            c1998c.f8123c.add(((C1979b) it.next()).clone());
        }
        return c1998c;
    }

    /* JADX INFO: renamed from: d */
    public final void m9835d(C1979b c1979b) {
        this.f8122b = c1979b;
    }

    /* JADX INFO: renamed from: e */
    public final void m9836e(String str, long j10, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, C1979b.m9766h(str2, this.f8121a.m9771e(str2), map.get(str2)));
        }
        this.f8123c.add(new C1979b(str, j10, map2));
    }

    /* JADX INFO: renamed from: f */
    public final List m9837f() {
        return this.f8123c;
    }

    public C1998c(C1979b c1979b) {
        this.f8121a = c1979b;
        this.f8122b = c1979b.clone();
        this.f8123c = new ArrayList();
    }
}
