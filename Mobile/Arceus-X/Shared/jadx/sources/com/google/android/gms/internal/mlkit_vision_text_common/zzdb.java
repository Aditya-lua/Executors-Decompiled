package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import p410rf.C10867c;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;
import p410rf.InterfaceC10871g;
import p433sf.InterfaceC11292b;

/* JADX INFO: loaded from: classes.dex */
public final class zzdb implements InterfaceC11292b {
    public static final /* synthetic */ int zza = 0;
    private static final InterfaceC10869e zzb = new InterfaceC10869e() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzda
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p410rf.InterfaceC10866b
        public final void encode(Object obj, InterfaceC10870f interfaceC10870f) {
            int i10 = zzdb.zza;
            throw new C10867c("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final InterfaceC10869e zze = zzb;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p433sf.InterfaceC11292b
    @NonNull
    public final /* bridge */ /* synthetic */ InterfaceC11292b registerEncoder(@NonNull Class cls, @NonNull InterfaceC10869e interfaceC10869e) {
        this.zzc.put(cls, interfaceC10869e);
        this.zzd.remove(cls);
        return this;
    }

    public final zzdc zza() {
        return new zzdc(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ InterfaceC11292b registerEncoder(@NonNull Class cls, @NonNull InterfaceC10871g interfaceC10871g) {
        this.zzd.put(cls, interfaceC10871g);
        this.zzc.remove(cls);
        return this;
    }
}
