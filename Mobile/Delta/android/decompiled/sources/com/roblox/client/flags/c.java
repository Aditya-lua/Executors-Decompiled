package com.roblox.client.flags;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import rh.g;

/* JADX INFO: loaded from: classes2.dex */
public class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, a> f9124a = new HashMap<>();

    @Override // rh.g
    public a P0(String str) {
        return this.f9124a.get(str);
    }

    @Override // rh.g
    public Set<Map.Entry<String, a>> X3() {
        return this.f9124a.entrySet();
    }

    public void i6(String str, a aVar) {
        this.f9124a.put(str, aVar);
    }
}
