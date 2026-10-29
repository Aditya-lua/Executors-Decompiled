package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class d implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0115b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0115b c0115b = new DynamiteModule.b.C0115b();
        int iB = aVar.b(context, str);
        c0115b.f5881a = iB;
        if (iB != 0) {
            c0115b.f5882c = -1;
            return c0115b;
        }
        int iA = aVar.a(context, str, true);
        c0115b.b = iA;
        if (iA != 0) {
            c0115b.f5882c = 1;
        }
        return c0115b;
    }
}
