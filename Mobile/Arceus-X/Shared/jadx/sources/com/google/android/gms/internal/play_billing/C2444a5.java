package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2444a5 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Map.Entry f8901a;

    /* JADX INFO: renamed from: a */
    public final C2477d5 m11194a() {
        return (C2477d5) this.f8901a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8901a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C2477d5 c2477d5 = (C2477d5) this.f8901a.getValue();
        if (c2477d5 == null) {
            return null;
        }
        return c2477d5.m11365f();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof InterfaceC2697x5)) {
            throw new IllegalArgumentException("Lazy field only supports MessageLite values.");
        }
        Map.Entry entry = this.f8901a;
        InterfaceC2697x5 interfaceC2697x5 = ((C2477d5) entry.getValue()).f8950c;
        entry.setValue(new C2477d5((InterfaceC2697x5) obj));
        return interfaceC2697x5;
    }
}
