package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zzbd extends AbstractMap implements Serializable {
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

    public zzbd() {
        zzo(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzA() {
        Object[] objArr = this.zzb;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr;
    }

    public static /* synthetic */ int zzb(zzbd zzbdVar) {
        int i10 = zzbdVar.zzg;
        zzbdVar.zzg = i10 - 1;
        return i10;
    }

    public static /* synthetic */ Object zzg(zzbd zzbdVar, int i10) {
        return zzbdVar.zzA()[i10];
    }

    public static /* synthetic */ Object zzj(zzbd zzbdVar, int i10) {
        return zzbdVar.zzB()[i10];
    }

    public static /* synthetic */ Object zzk(zzbd zzbdVar) {
        Object obj = zzbdVar.zze;
        obj.getClass();
        return obj;
    }

    public static /* synthetic */ void zzm(zzbd zzbdVar, int i10, Object obj) {
        zzbdVar.zzB()[i10] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzu() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv(Object obj) {
        if (zzq()) {
            return -1;
        }
        int iZza = zzbf.zza(obj);
        int iZzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int iZzc = zzbe.zzc(obj2, iZza & iZzu);
        if (iZzc != 0) {
            int i10 = ~iZzu;
            int i11 = iZza & i10;
            do {
                int i12 = iZzc - 1;
                int i13 = zzz()[i12];
                if ((i13 & i10) == i11 && zzx.zza(obj, zzA()[i12])) {
                    return i12;
                }
                iZzc = i13 & iZzu;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzw(int i10, int i11, int i12, int i13) {
        Object objZzd = zzbe.zzd(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            zzbe.zze(objZzd, i12 & i14, i13 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] iArrZzz = zzz();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iZzc = zzbe.zzc(obj, i15);
            while (iZzc != 0) {
                int i16 = iZzc - 1;
                int i17 = iArrZzz[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iZzc2 = zzbe.zzc(objZzd, i19);
                zzbe.zze(objZzd, i19, iZzc);
                iArrZzz[i16] = ((~i14) & i18) | (iZzc2 & i14);
                iZzc = i17 & i10;
            }
        }
        this.zze = objZzd;
        zzy(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzx(Object obj) {
        if (zzq()) {
            return zzd;
        }
        int iZzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int iZzb = zzbe.zzb(obj, null, iZzu, obj2, zzz(), zzA(), null);
        if (iZzb == -1) {
            return zzd;
        }
        Object obj3 = zzB()[iZzb];
        zzp(iZzb, iZzu);
        this.zzg--;
        zzn();
        return obj3;
    }

    private final void zzy(int i10) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzz() {
        int[] iArr = this.zza;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzq()) {
            return;
        }
        zzn();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = zzcn.zza(size(), 3, 1073741823);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzA(), 0, this.zzg, (Object) null);
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzz(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsKey(obj);
        }
        return zzv(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.zzg; i10++) {
            if (zzx.zza(obj, zzB()[i10])) {
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
        zzay zzayVar = new zzay(this);
        this.zzi = zzayVar;
        return zzayVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzv = zzv(obj);
        if (iZzv == -1) {
            return null;
        }
        return zzB()[iZzv];
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
        zzba zzbaVar = new zzba(this);
        this.zzh = zzbaVar;
        return zzbaVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        if (zzq()) {
            zzab.zzd(zzq(), "Arrays already allocated");
            int i11 = this.zzf;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzbe.zzd(iMax2);
            zzy(iMax2 - 1);
            this.zza = new int[i11];
            this.zzb = new Object[i11];
            this.zzc = new Object[i11];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzz = zzz();
        Object[] objArrZzA = zzA();
        Object[] objArrZzB = zzB();
        int i12 = this.zzg;
        int i13 = i12 + 1;
        int iZza = zzbf.zza(obj);
        int iZzu = zzu();
        int i14 = iZza & iZzu;
        Object obj3 = this.zze;
        obj3.getClass();
        int iZzc = zzbe.zzc(obj3, i14);
        if (iZzc == 0) {
            if (i13 > iZzu) {
                iZzu = zzw(iZzu, zzbe.zza(iZzu), iZza, i12);
            } else {
                Object obj4 = this.zze;
                obj4.getClass();
                zzbe.zze(obj4, i14, i13);
            }
            i10 = 1;
        } else {
            int i15 = ~iZzu;
            int i16 = iZza & i15;
            int i17 = 0;
            while (true) {
                int i18 = iZzc - 1;
                int i19 = iArrZzz[i18];
                i10 = 1;
                int i20 = i19 & i15;
                if (i20 == i16 && zzx.zza(obj, objArrZzA[i18])) {
                    Object obj5 = objArrZzB[i18];
                    objArrZzB[i18] = obj2;
                    return obj5;
                }
                int i21 = i19 & iZzu;
                i17++;
                if (i21 == 0) {
                    if (i17 < 9) {
                        if (i13 <= iZzu) {
                            iArrZzz[i18] = (i13 & iZzu) | i20;
                            break;
                        }
                        iZzu = zzw(iZzu, zzbe.zza(iZzu), iZza, i12);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzu() + 1, 1.0f);
                    int iZze = zze();
                    while (iZze >= 0) {
                        linkedHashMap.put(zzA()[iZze], zzB()[iZze]);
                        iZze = zzf(iZze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzn();
                    return linkedHashMap.put(obj, obj2);
                }
                iZzc = i21;
            }
        }
        int length = zzz().length;
        if (i13 > length) {
            int i22 = i10;
            int iMin = Math.min(1073741823, (Math.max(i22, length >>> 1) + length) | i22);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzz(), iMin);
                this.zzb = Arrays.copyOf(zzA(), iMin);
                this.zzc = Arrays.copyOf(zzB(), iMin);
            }
        }
        zzz()[i12] = (~iZzu) & iZza;
        zzA()[i12] = obj;
        zzB()[i12] = obj2;
        this.zzg = i13;
        zzn();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzx = zzx(obj);
        if (objZzx == zzd) {
            return null;
        }
        return objZzx;
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
        zzbc zzbcVar = new zzbc(this);
        this.zzj = zzbcVar;
        return zzbcVar;
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

    public final void zzn() {
        this.zzf += 32;
    }

    public final void zzo(int i10) {
        this.zzf = zzcn.zza(12, 1, 1073741823);
    }

    public final void zzp(int i10, int i11) {
        Object obj = this.zze;
        obj.getClass();
        int[] iArrZzz = zzz();
        Object[] objArrZzA = zzA();
        Object[] objArrZzB = zzB();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrZzA[i10] = null;
            objArrZzB[i10] = null;
            iArrZzz[i10] = 0;
            return;
        }
        Object obj2 = objArrZzA[i12];
        objArrZzA[i10] = obj2;
        objArrZzB[i10] = objArrZzB[i12];
        objArrZzA[i12] = null;
        objArrZzB[i12] = null;
        iArrZzz[i10] = iArrZzz[i12];
        iArrZzz[i12] = 0;
        int iZza = zzbf.zza(obj2) & i11;
        int iZzc = zzbe.zzc(obj, iZza);
        if (iZzc == size) {
            zzbe.zze(obj, iZza, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iZzc - 1;
            int i14 = iArrZzz[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArrZzz[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                return;
            }
            iZzc = i15;
        }
    }

    public final boolean zzq() {
        return this.zze == null;
    }

    public zzbd(int i10) {
        zzo(12);
    }
}
