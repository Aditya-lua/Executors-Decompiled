package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class a implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0119b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0119b c0119b = new DynamiteModule.b.C0119b();
        int iB = aVar.b(context, str);
        c0119b.f5954a = iB;
        c0119b.f5955c = iB != 0 ? -1 : 0;
        return c0119b;
    }
}
