package com.google.android.gms.internal.mlkit_vision_face;

import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* JADX INFO: loaded from: classes.dex */
final class zzom extends LazyInstanceMap {
    private zzom() {
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        zznt zzntVar = (zznt) obj;
        MlKitContext mlKitContext = MlKitContext.getInstance();
        return new zzoc(mlKitContext.getApplicationContext(), (SharedPrefManager) mlKitContext.get(SharedPrefManager.class), new zznu(MlKitContext.getInstance().getApplicationContext(), zzntVar), zzntVar.zzb());
    }

    public /* synthetic */ zzom(zzol zzolVar) {
    }
}
