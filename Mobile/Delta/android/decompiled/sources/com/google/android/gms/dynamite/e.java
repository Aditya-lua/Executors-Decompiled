package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class e implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0115b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0115b c0115b = new DynamiteModule.b.C0115b();
        int iA = aVar.a(context, str, false);
        c0115b.b = iA;
        c0115b.f5882c = iA != 0 ? 1 : 0;
        return c0115b;
    }
}
