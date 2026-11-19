package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zzba extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzba() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* synthetic */ Object zzg(zzba zzbaVar, int i10) {
        return zzbaVar.zzB()[i10];
    }

    public static /* synthetic */ Object zzi(zzba zzbaVar) {
        Object obj = zzbaVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object zzj(zzba zzbaVar, int i10) {
        return zzbaVar.zzC()[i10];
    }

    public static /* synthetic */ void zzn(zzba zzbaVar, int i10, Object obj) {
        zzbaVar.zzC()[i10] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(Object obj) {
        if (zzr()) {
            return -1;
        }
        int iZza = zzbc.zza(obj);
        int iZzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzc = zzbb.zzc(obj2, iZza & iZzv);
        if (iZzc != 0) {
            int i10 = ~iZzv;
            int i11 = iZza & i10;
            do {
                int i12 = iZzc - 1;
                int i13 = zzA()[i12];
                if ((i13 & i10) == i11 && zzw.zza(obj, zzB()[i12])) {
                    return i12;
                }
                iZzc = i13 & iZzv;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzx(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objZzd = zzbb.zzd(i11);
        if (i13 != 0) {
            zzbb.zze(objZzd, i12 & i14, i13 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iZzc = zzbb.zzc(obj, i15);
            while (iZzc != 0) {
                int i16 = iZzc - 1;
                int i17 = iArrZzA[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iZzc2 = zzbb.zzc(objZzd, i19);
                zzbb.zze(objZzd, i19, iZzc);
                iArrZzA[i16] = ((~i14) & i18) | (iZzc2 & i14);
                iZzc = i17 & i10;
            }
        }
        this.zze = objZzd;
        zzz(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int iZzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZzb = zzbb.zzb(obj, null, iZzv, obj2, zzA(), zzB(), null);
            if (iZzb != -1) {
                Object obj3 = zzC()[iZzb];
                zzq(iZzb, iZzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i10) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = zzcq.zza(size(), 3, 1073741823);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsKey(obj);
        }
        return zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.zzg; i10++) {
            if (zzw.zza(obj, zzC()[i10])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzau zzauVar = new zzau(this);
        this.zzi = zzauVar;
        return zzauVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzw = zzw(obj);
        if (iZzw == -1) {
            return null;
        }
        return zzC()[iZzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzax zzaxVar = new zzax(this);
        this.zzh = zzaxVar;
        return zzaxVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        if (zzr()) {
            zzx.zzd(zzr(), "Arrays already allocated");
            int i11 = this.zzf;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzbb.zzd(iMax2);
            zzz(iMax2 - 1);
            this.zza = new int[i11];
            this.zzb = new Object[i11];
            this.zzc = new Object[i11];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int i12 = this.zzg;
        int i13 = i12 + 1;
        int iZza = zzbc.zza(obj);
        int iZzv = zzv();
        int i14 = iZza & iZzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzc = zzbb.zzc(obj3, i14);
        if (iZzc == 0) {
            if (i13 > iZzv) {
                iZzv = zzx(iZzv, zzbb.zza(iZzv), iZza, i12);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzbb.zze(obj4, i14, i13);
            }
            i10 = 1;
        } else {
            int i15 = ~iZzv;
            int i16 = iZza & i15;
            int i17 = 0;
            while (true) {
                int i18 = iZzc - 1;
                int i19 = iArrZzA[i18];
                i10 = 1;
                int i20 = i19 & i15;
                if (i20 == i16 && zzw.zza(obj, objArrZzB[i18])) {
                    Object obj5 = objArrZzC[i18];
                    objArrZzC[i18] = obj2;
                    return obj5;
                }
                int i21 = i19 & iZzv;
                i17++;
                if (i21 == 0) {
                    if (i17 < 9) {
                        if (i13 <= iZzv) {
                            iArrZzA[i18] = (i13 & iZzv) | i20;
                            break;
                        }
                        iZzv = zzx(iZzv, zzbb.zza(iZzv), iZza, i12);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                    int iZze = zze();
                    while (iZze >= 0) {
                        linkedHashMap.put(zzB()[iZze], zzC()[iZze]);
                        iZze = zzf(iZze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzo();
                    return linkedHashMap.put(obj, obj2);
                }
                iZzc = i21;
            }
        }
        int length = zzA().length;
        if (i13 > length) {
            int i22 = i10;
            int iMin = Math.min(1073741823, (Math.max(i22, length >>> 1) + length) | i22);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzA(), iMin);
                this.zzb = Arrays.copyOf(zzB(), iMin);
                this.zzc = Arrays.copyOf(zzC(), iMin);
            }
        }
        zzA()[i12] = (~iZzv) & iZza;
        zzB()[i12] = obj;
        zzC()[i12] = obj2;
        this.zzg = i13;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzy = zzy(obj);
        if (objZzy == zzd) {
            return null;
        }
        return objZzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzaz zzazVar = new zzaz(this);
        this.zzj = zzazVar;
        return zzazVar;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.zzg) {
            return i11;
        }
        return -1;
    }

    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzo() {
        this.zzf += 32;
    }

    public final void zzp(int i10) {
        this.zzf = zzcq.zza(i10, 1, 1073741823);
    }

    public final void zzq(int i10, int i11) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrZzB[i10] = null;
            objArrZzC[i10] = null;
            iArrZzA[i10] = 0;
            return;
        }
        int i13 = i10 + 1;
        Object obj2 = objArrZzB[i12];
        objArrZzB[i10] = obj2;
        objArrZzC[i10] = objArrZzC[i12];
        objArrZzB[i12] = null;
        objArrZzC[i12] = null;
        iArrZzA[i10] = iArrZzA[i12];
        iArrZzA[i12] = 0;
        int iZza = zzbc.zza(obj2) & i11;
        int iZzc = zzbb.zzc(obj, iZza);
        if (iZzc == size) {
            zzbb.zze(obj, iZza, i13);
            return;
        }
        while (true) {
            int i14 = iZzc - 1;
            int i15 = iArrZzA[i14];
            int i16 = i15 & i11;
            if (i16 == size) {
                iArrZzA[i14] = (i15 & (~i11)) | (i11 & i13);
                return;
            }
            iZzc = i16;
        }
    }

    public final boolean zzr() {
        return this.zze == null;
    }

    public zzba(int i10) {
        zzp(12);
    }
}
