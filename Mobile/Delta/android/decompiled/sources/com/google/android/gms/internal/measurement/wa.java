package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class wa {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wa f6866d = new wa(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd f6867a = new dd();
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6868c;

    public wa() {
    }

    public static wa a() {
        return f6866d;
    }

    public static void f(ma maVar, wd wdVar, int i10, Object obj) {
        if (wdVar == wd.f6880l) {
            oc ocVar = (oc) obj;
            qb.d(ocVar);
            maVar.i(i10, 3);
            ocVar.c(maVar);
            maVar.i(i10, 4);
            return;
        }
        maVar.i(i10, wdVar.b());
        xd xdVar = xd.INT;
        switch (wdVar.ordinal()) {
            case 0:
                maVar.C(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                maVar.A(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                maVar.B(((Long) obj).longValue());
                break;
            case 3:
                maVar.B(((Long) obj).longValue());
                break;
            case 4:
                maVar.y(((Integer) obj).intValue());
                break;
            case 5:
                maVar.C(((Long) obj).longValue());
                break;
            case 6:
                maVar.A(((Integer) obj).intValue());
                break;
            case 7:
                maVar.x(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ha)) {
                    maVar.E((String) obj);
                } else {
                    maVar.r((ha) obj);
                }
                break;
            case 9:
                ((oc) obj).c(maVar);
                break;
            case 10:
                maVar.w((oc) obj);
                break;
            case 11:
                if (!(obj instanceof ha)) {
                    byte[] bArr = (byte[]) obj;
                    maVar.s(bArr, 0, bArr.length);
                } else {
                    maVar.r((ha) obj);
                }
                break;
            case 12:
                maVar.z(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof kb)) {
                    maVar.y(((Integer) obj).intValue());
                } else {
                    maVar.y(((kb) obj).zza());
                }
                break;
            case 14:
                maVar.A(((Integer) obj).intValue());
                break;
            case 15:
                maVar.C(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                maVar.z((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                maVar.B((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static int h(wd wdVar, int i10, Object obj) {
        int iG = ma.G(i10 << 3);
        if (wdVar == wd.f6880l) {
            qb.d((oc) obj);
            iG += iG;
        }
        return iG + i(wdVar, obj);
    }

    public static int i(wd wdVar, Object obj) {
        int iD;
        int iG;
        wd wdVar2 = wd.f6871c;
        xd xdVar = xd.INT;
        switch (wdVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = ma.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = ma.b;
                return 4;
            case 2:
                return ma.a(((Long) obj).longValue());
            case 3:
                return ma.a(((Long) obj).longValue());
            case 4:
                return ma.a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = ma.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = ma.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = ma.b;
                return 1;
            case 8:
                if (!(obj instanceof ha)) {
                    return ma.b((String) obj);
                }
                Logger logger6 = ma.b;
                iD = ((ha) obj).d();
                iG = ma.G(iD);
                break;
                break;
            case 9:
                return ((oc) obj).a();
            case 10:
                if (!(obj instanceof wb)) {
                    return ma.c((oc) obj);
                }
                Logger logger7 = ma.b;
                iD = ((wb) obj).b();
                iG = ma.G(iD);
                break;
                break;
            case 11:
                if (!(obj instanceof ha)) {
                    Logger logger8 = ma.b;
                    iD = ((byte[]) obj).length;
                    iG = ma.G(iD);
                } else {
                    Logger logger9 = ma.b;
                    iD = ((ha) obj).d();
                    iG = ma.G(iD);
                }
                break;
            case 12:
                return ma.G(((Integer) obj).intValue());
            case 13:
                return obj instanceof kb ? ma.a(((kb) obj).zza()) : ma.a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = ma.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = ma.b;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return ma.G((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return ma.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iG + iD;
    }

    public static int j(va vaVar, Object obj) {
        wd wdVarZzb = vaVar.zzb();
        int iZza = vaVar.zza();
        if (!vaVar.zzd()) {
            return h(wdVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!vaVar.zze()) {
            int iH = 0;
            while (i10 < size) {
                iH += h(wdVarZzb, iZza, list.get(i10));
                i10++;
            }
            return iH;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i11 = 0;
        while (i10 < size) {
            i11 += i(wdVarZzb, list.get(i10));
            i10++;
        }
        return ma.G(iZza << 3) + i11 + ma.G(i11);
    }

    public static boolean k(Map.Entry entry) {
        va vaVar = (va) entry.getKey();
        if (vaVar.zzc() != xd.MESSAGE) {
            return true;
        }
        if (!vaVar.zzd()) {
            return l(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!l(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(Object obj) {
        if (obj instanceof pc) {
            return ((pc) obj).f();
        }
        if (obj instanceof wb) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static final int m(Map.Entry entry) {
        int i10;
        int iG;
        int iG2;
        va vaVar = (va) entry.getKey();
        Object value = entry.getValue();
        if (vaVar.zzc() != xd.MESSAGE || vaVar.zzd() || vaVar.zze()) {
            return j(vaVar, value);
        }
        if (value instanceof wb) {
            int iZza = ((va) entry.getKey()).zza();
            int iG3 = ma.G(8);
            i10 = iG3 + iG3;
            iG = ma.G(16) + ma.G(iZza);
            int iG4 = ma.G(24);
            int iB = ((wb) value).b();
            iG2 = iG4 + ma.G(iB) + iB;
        } else {
            int iZza2 = ((va) entry.getKey()).zza();
            int iG5 = ma.G(8);
            i10 = iG5 + iG5;
            iG = ma.G(16) + ma.G(iZza2);
            iG2 = ma.G(24) + ma.c((oc) value);
        }
        return i10 + iG + iG2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0047 A[RETURN] */
    public static final void n(va vaVar, Object obj) {
        boolean z10;
        vaVar.zzb();
        Charset charset = qb.f6750a;
        obj.getClass();
        wd wdVar = wd.f6871c;
        xd xdVar = xd.INT;
        switch (r0.a()) {
            case INT:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(vaVar.zza()), vaVar.zzb().a(), obj.getClass().getName()));
            case LONG:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(vaVar.zza()), vaVar.zzb().a(), obj.getClass().getName()));
            case FLOAT:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(vaVar.zza()), vaVar.zzb().a(), obj.getClass().getName()));
            case DOUBLE:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(vaVar.zza()), vaVar.zzb().a(), obj.getClass().getName()));
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(vaVar.zza()), vaVar.zzb().a(), obj.getClass().getName()));
            case STRING:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(vaVar.zza()), vaVar.zzb().a(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof ha) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(vaVar.zza()), vaVar.zzb().a(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof kb)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(vaVar.zza()), vaVar.zzb().a(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof oc) || (obj instanceof wb)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(vaVar.zza()), vaVar.zzb().a(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(vaVar.zza()), vaVar.zzb().a(), obj.getClass().getName()));
        }
    }

    public final void b() {
        if (this.b) {
            return;
        }
        hd hdVar = this.f6867a;
        int iC = hdVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Object value = hdVar.d(i10).getValue();
            if (value instanceof gb) {
                ((gb) value).p();
            }
        }
        Iterator it = hdVar.e().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof gb) {
                ((gb) value2).p();
            }
        }
        hdVar.a();
        this.b = true;
    }

    public final Iterator c() {
        hd hdVar = this.f6867a;
        if (hdVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f6868c ? new vb(hdVar.entrySet().iterator()) : hdVar.entrySet().iterator();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        wa waVar = new wa();
        hd hdVar = this.f6867a;
        int iC = hdVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Map.Entry entryD = hdVar.d(i10);
            waVar.d((va) ((ed) entryD).a(), entryD.getValue());
        }
        for (Map.Entry entry : hdVar.e()) {
            waVar.d((va) entry.getKey(), entry.getValue());
        }
        waVar.f6868c = this.f6868c;
        return waVar;
    }

    public final void d(va vaVar, Object obj) {
        if (!vaVar.zzd()) {
            n(vaVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                n(vaVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof wb) {
            this.f6868c = true;
        }
        this.f6867a.put(vaVar, obj);
    }

    public final boolean e() {
        hd hdVar = this.f6867a;
        int iC = hdVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            if (!k(hdVar.d(i10))) {
                return false;
            }
        }
        Iterator it = hdVar.e().iterator();
        while (it.hasNext()) {
            if (!k((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wa) {
            return this.f6867a.equals(((wa) obj).f6867a);
        }
        return false;
    }

    public final int g() {
        hd hdVar = this.f6867a;
        int iC = hdVar.c();
        int iM = 0;
        for (int i10 = 0; i10 < iC; i10++) {
            iM += m(hdVar.d(i10));
        }
        Iterator it = hdVar.e().iterator();
        while (it.hasNext()) {
            iM += m((Map.Entry) it.next());
        }
        return iM;
    }

    public final int hashCode() {
        return this.f6867a.hashCode();
    }

    public wa(boolean z10) {
        b();
        b();
    }
}
