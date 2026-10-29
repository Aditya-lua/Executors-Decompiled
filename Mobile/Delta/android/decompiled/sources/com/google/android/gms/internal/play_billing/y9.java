package com.google.android.gms.internal.play_billing;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class y9 {
    @NonNull
    public static i2 a(@NonNull v9 v9Var) {
        t9 t9Var = new t9();
        x9 x9Var = new x9(t9Var);
        t9Var.b = x9Var;
        t9Var.f7322a = v9Var.getClass();
        try {
            t9Var.f7322a = v9Var.a(t9Var);
            return x9Var;
        } catch (Exception e10) {
            x9Var.d(e10);
            return x9Var;
        }
    }
}
