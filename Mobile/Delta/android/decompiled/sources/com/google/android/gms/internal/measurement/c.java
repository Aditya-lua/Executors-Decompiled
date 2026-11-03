package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f6468a;
    public b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6469c;

    public c() {
        this.f6468a = new b("", 0L, null);
        this.b = new b("", 0L, null);
        this.f6469c = new ArrayList();
    }

    public final b a() {
        return this.f6468a;
    }

    public final void b(b bVar) {
        this.f6468a = bVar;
        this.b = bVar.clone();
        this.f6469c.clear();
    }

    public final b c() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        c cVar = new c(this.f6468a.clone());
        Iterator it = this.f6469c.iterator();
        while (it.hasNext()) {
            cVar.f6469c.add(((b) it.next()).clone());
        }
        return cVar;
    }

    public final void d(b bVar) {
        this.b = bVar;
    }

    public final void e(String str, long j10, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, b.h(str2, this.f6468a.e(str2), map.get(str2)));
        }
        this.f6469c.add(new b(str, j10, map2));
    }

    public final List f() {
        return this.f6469c;
    }

    public c(b bVar) {
        this.f6468a = bVar;
        this.b = bVar.clone();
        this.f6469c = new ArrayList();
    }
}
