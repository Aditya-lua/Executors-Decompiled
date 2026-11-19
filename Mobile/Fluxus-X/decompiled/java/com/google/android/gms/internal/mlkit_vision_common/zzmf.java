package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzmf implements zzmc {
    final List zza;

    public zzmf(Context context, zzme zzmeVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzmeVar.zzc()) {
            arrayList.add(new zzmp(context, zzmeVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(zzmb zzmbVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzmc) it.next()).zza(zzmbVar);
        }
    }
}
