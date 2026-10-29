package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class g implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0115b a(Context context, String str, DynamiteModule.b.a aVar) {
        int iA;
        DynamiteModule.b.C0115b c0115b = new DynamiteModule.b.C0115b();
        int iB = aVar.b(context, str);
        c0115b.f5881a = iB;
        int i10 = 1;
        int i11 = 0;
        if (iB != 0) {
            iA = aVar.a(context, str, false);
            c0115b.b = iA;
        } else {
            iA = aVar.a(context, str, true);
            c0115b.b = iA;
        }
        int i12 = c0115b.f5881a;
        if (i12 == 0) {
            if (iA == 0) {
                i10 = 0;
            }
            c0115b.f5882c = i10;
            return c0115b;
        }
        i11 = i12;
        if (i11 >= iA) {
            i10 = -1;
        }
        c0115b.f5882c = i10;
        return c0115b;
    }
}
