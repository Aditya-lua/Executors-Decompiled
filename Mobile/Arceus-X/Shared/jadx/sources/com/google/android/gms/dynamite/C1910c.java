package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1910c implements DynamiteModule.InterfaceC1907b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1907b
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC1907b.b mo9245a(Context context, String str, DynamiteModule.InterfaceC1907b.a aVar) {
        DynamiteModule.InterfaceC1907b.b bVar = new DynamiteModule.InterfaceC1907b.b();
        int iMo9246a = aVar.mo9246a(context, str, true);
        bVar.f7573b = iMo9246a;
        if (iMo9246a != 0) {
            bVar.f7574c = 1;
            return bVar;
        }
        int iMo9247b = aVar.mo9247b(context, str);
        bVar.f7572a = iMo9247b;
        if (iMo9247b != 0) {
            bVar.f7574c = -1;
        }
        return bVar;
    }
}
