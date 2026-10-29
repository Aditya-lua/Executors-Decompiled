package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w9 extends s9 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x9 f7338h;

    public w9(x9 x9Var) {
        Objects.requireNonNull(x9Var);
        this.f7338h = x9Var;
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final String c() {
        t9 t9Var = (t9) this.f7338h.f7343a.get();
        if (t9Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(t9Var.f7322a) + "]";
    }
}
