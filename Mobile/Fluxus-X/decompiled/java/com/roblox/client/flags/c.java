package com.roblox.client.flags;

import bi.g;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, a> f8940a = new HashMap<>();

    @Override // bi.g
    public a R0(String str) {
        return this.f8940a.get(str);
    }

    @Override // bi.g
    public Set<Map.Entry<String, a>> b4() {
        return this.f8940a.entrySet();
    }

    public void h6(String str, a aVar) {
        this.f8940a.put(str, aVar);
    }
}
