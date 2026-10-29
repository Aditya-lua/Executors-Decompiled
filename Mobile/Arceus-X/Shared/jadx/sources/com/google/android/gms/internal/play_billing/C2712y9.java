package com.google.android.gms.internal.play_billing;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2712y9 {
    @NonNull
    /* JADX INFO: renamed from: a */
    public static InterfaceFutureC2529i2 m11848a(@NonNull InterfaceC2679v9 interfaceC2679v9) {
        C2657t9 c2657t9 = new C2657t9();
        C2701x9 c2701x9 = new C2701x9(c2657t9);
        c2657t9.f9392b = c2701x9;
        c2657t9.f9391a = interfaceC2679v9.getClass();
        try {
            c2657t9.f9391a = interfaceC2679v9.mo11811a(c2657t9);
            return c2701x9;
        } catch (Exception e10) {
            c2701x9.m11845d(e10);
            return c2701x9;
        }
    }
}
