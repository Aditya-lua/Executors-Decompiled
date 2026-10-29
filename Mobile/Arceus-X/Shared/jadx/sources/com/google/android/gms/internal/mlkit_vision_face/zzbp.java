package com.google.android.gms.internal.mlkit_vision_face;

import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbp implements Map, Serializable {
    private transient zzbq zza;
    private transient zzbq zzb;
    private transient zzbi zzc;

    public static zzbp zzc(Object obj, Object obj2) {
        zzau.zzb("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
        return zzch.zzg(1, new Object[]{"optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzcj.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzbq zzbqVar = this.zzb;
        if (zzbqVar != null) {
            return zzbqVar;
        }
        zzbq zzbqVarZze = zze();
        this.zzb = zzbqVarZze;
        return zzbqVarZze;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzau.zza(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public abstract zzbi zza();

    /* JADX DEBUG: Method merged with bridge method: values()Ljava/util/Collection; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzbi values() {
        zzbi zzbiVar = this.zzc;
        if (zzbiVar != null) {
            return zzbiVar;
        }
        zzbi zzbiVarZza = zza();
        this.zzc = zzbiVarZza;
        return zzbiVarZza;
    }

    public abstract zzbq zzd();

    public abstract zzbq zze();

    /* JADX DEBUG: Method merged with bridge method: entrySet()Ljava/util/Set; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzbq entrySet() {
        zzbq zzbqVar = this.zza;
        if (zzbqVar != null) {
            return zzbqVar;
        }
        zzbq zzbqVarZzd = zzd();
        this.zza = zzbqVarZzd;
        return zzbqVarZzd;
    }
}
