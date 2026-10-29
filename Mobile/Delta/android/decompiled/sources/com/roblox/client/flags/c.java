package com.roblox.client.flags;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import th.g;

/* JADX INFO: loaded from: classes2.dex */
public class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, a> f9051a = new HashMap<>();

    @Override // th.g
    public a K0(String str) {
        return this.f9051a.get(str);
    }

    @Override // th.g
    public Set<Map.Entry<String, a>> M3() {
        return this.f9051a.entrySet();
    }

    public void Y5(String str, a aVar) {
        this.f9051a.put(str, aVar);
    }
}
