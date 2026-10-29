package com.roblox.client.flags;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import th.InterfaceC11658g;

/* JADX INFO: renamed from: com.roblox.client.flags.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3189c implements InterfaceC11658g {

    /* JADX INFO: renamed from: a */
    public HashMap<String, C3187a> f11816a = new HashMap<>();

    @Override // th.InterfaceC11658g
    /* JADX INFO: renamed from: N0 */
    public C3187a mo15151N0(String str) {
        return this.f11816a.get(str);
    }

    @Override // th.InterfaceC11658g
    /* JADX INFO: renamed from: R3 */
    public Set<Map.Entry<String, C3187a>> mo15152R3() {
        return this.f11816a.entrySet();
    }

    /* JADX INFO: renamed from: f6 */
    public void m15153f6(String str, C3187a c3187a) {
        this.f11816a.put(str, c3187a);
    }
}
