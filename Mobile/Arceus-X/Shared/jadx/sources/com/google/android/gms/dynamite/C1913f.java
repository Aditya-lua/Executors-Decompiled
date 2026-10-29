package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1913f implements DynamiteModule.InterfaceC1907b {
    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC1907b
    /* JADX INFO: renamed from: a */
    public final DynamiteModule.InterfaceC1907b.b mo9245a(Context context, String str, DynamiteModule.InterfaceC1907b.a aVar) {
        DynamiteModule.InterfaceC1907b.b bVar = new DynamiteModule.InterfaceC1907b.b();
        bVar.f7572a = aVar.mo9247b(context, str);
        int i10 = 1;
        int iMo9246a = aVar.mo9246a(context, str, true);
        bVar.f7573b = iMo9246a;
        int i11 = bVar.f7572a;
        if (i11 == 0) {
            i11 = 0;
            if (iMo9246a == 0) {
                i10 = 0;
            } else if (i11 >= iMo9246a) {
                i10 = -1;
            }
        } else if (i11 >= iMo9246a) {
            i10 = -1;
        }
        bVar.f7574c = i10;
        return bVar;
    }
}
