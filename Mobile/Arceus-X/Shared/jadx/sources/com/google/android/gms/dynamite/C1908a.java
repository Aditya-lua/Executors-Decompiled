package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1908a implements DynamiteModule.InterfaceC1907b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1907b
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC1907b.b mo9245a(Context context, String str, DynamiteModule.InterfaceC1907b.a aVar) {
        DynamiteModule.InterfaceC1907b.b bVar = new DynamiteModule.InterfaceC1907b.b();
        int iMo9247b = aVar.mo9247b(context, str);
        bVar.f7572a = iMo9247b;
        bVar.f7574c = iMo9247b != 0 ? -1 : 0;
        return bVar;
    }
}
