package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zznu implements zzob {
    final List zza;

    public zznu(Context context, zznt zzntVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzntVar.zzc()) {
            arrayList.add(new zzok(context, zzntVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzob
    public final void zza(zznr zznrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzob) it.next()).zza(zznrVar);
        }
    }
}
