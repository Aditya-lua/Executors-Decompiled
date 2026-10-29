package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1916i implements DynamiteModule.InterfaceC1907b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1907b
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC1907b.b mo9245a(Context context, String str, DynamiteModule.InterfaceC1907b.a aVar) {
        int iMo9246a;
        DynamiteModule.InterfaceC1907b.b bVar = new DynamiteModule.InterfaceC1907b.b();
        int iMo9247b = aVar.mo9247b(context, str);
        bVar.f7572a = iMo9247b;
        int i10 = 1;
        int i11 = 0;
        if (iMo9247b != 0) {
            iMo9246a = aVar.mo9246a(context, str, false);
            bVar.f7573b = iMo9246a;
        } else {
            iMo9246a = aVar.mo9246a(context, str, true);
            bVar.f7573b = iMo9246a;
        }
        int i12 = bVar.f7572a;
        if (i12 == 0) {
            if (iMo9246a == 0) {
                i10 = 0;
            }
            bVar.f7574c = i10;
            return bVar;
        }
        i11 = i12;
        if (iMo9246a < i11) {
            i10 = -1;
        }
        bVar.f7574c = i10;
        return bVar;
    }
}
