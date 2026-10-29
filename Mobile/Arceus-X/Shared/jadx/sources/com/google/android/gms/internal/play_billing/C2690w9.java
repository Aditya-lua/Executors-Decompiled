package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2690w9 extends C2646s9 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2701x9 f9411h;

    public C2690w9(C2701x9 c2701x9) {
        Objects.requireNonNull(c2701x9);
        this.f9411h = c2701x9;
    }

    @Override // com.google.android.gms.internal.play_billing.C2646s9
    /* JADX INFO: renamed from: c */
    public final String mo11729c() {
        C2657t9 c2657t9 = (C2657t9) this.f9411h.f9416a.get();
        if (c2657t9 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(c2657t9.f9391a) + "]";
    }
}
