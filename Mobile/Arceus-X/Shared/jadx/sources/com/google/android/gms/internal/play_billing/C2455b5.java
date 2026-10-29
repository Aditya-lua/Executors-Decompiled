package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2455b5 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f8927a;

    public C2455b5(Iterator it) {
        this.f8927a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8927a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f8927a.next();
        return entry.getValue() instanceof C2477d5 ? new C2444a5(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f8927a.remove();
    }
}
