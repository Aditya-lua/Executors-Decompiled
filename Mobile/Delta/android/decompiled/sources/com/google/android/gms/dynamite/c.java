package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0119b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0119b c0119b = new DynamiteModule.b.C0119b();
        int iA = aVar.a(context, str, true);
        c0119b.b = iA;
        if (iA != 0) {
            c0119b.f5955c = 1;
            return c0119b;
        }
        int iB = aVar.b(context, str);
        c0119b.f5954a = iB;
        if (iB != 0) {
            c0119b.f5955c = -1;
        }
        return c0119b;
    }
}
