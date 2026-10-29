package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1912e implements DynamiteModule.InterfaceC1907b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1907b
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC1907b.b mo9245a(Context context, String str, DynamiteModule.InterfaceC1907b.a aVar) {
        DynamiteModule.InterfaceC1907b.b bVar = new DynamiteModule.InterfaceC1907b.b();
        int iMo9246a = aVar.mo9246a(context, str, false);
        bVar.f7573b = iMo9246a;
        bVar.f7574c = iMo9246a != 0 ? 1 : 0;
        return bVar;
    }
}
