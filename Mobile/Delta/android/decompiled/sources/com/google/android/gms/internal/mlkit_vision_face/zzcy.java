package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import qf.c;
import qf.e;
import qf.f;
import qf.g;
import rf.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzcy implements b {
    public static final /* synthetic */ int zza = 0;
    private static final e zzb = new e() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzcx
        @Override // qf.b
        public final void encode(Object obj, f fVar) {
            int i10 = zzcy.zza;
            throw new c("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final e zze = zzb;

    @Override // rf.b
    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull e eVar) {
        this.zzc.put(cls, eVar);
        this.zzd.remove(cls);
        return this;
    }

    public final zzcz zza() {
        return new zzcz(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull g gVar) {
        this.zzd.put(cls, gVar);
        this.zzc.remove(cls);
        return this;
    }
}
