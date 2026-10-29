package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k4 f7118d = new k4(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p6 f7119a = new j6();
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7120c;

    public k4() {
    }

    public static int a(g7 g7Var, int i10, Object obj) {
        int iV = a4.v(i10 << 3);
        if (g7Var == g7.f7075l) {
            iV += iV;
        }
        return iV + b(g7Var, obj);
    }

    public static int b(g7 g7Var, Object obj) {
        int iB;
        int iV;
        g7 g7Var2 = g7.f7066c;
        h7 h7Var = h7.INT;
        switch (g7Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                boolean z10 = a4.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                boolean z11 = a4.b;
                return 4;
            case 2:
                return a4.w(((Long) obj).longValue());
            case 3:
                return a4.w(((Long) obj).longValue());
            case 4:
                return a4.w(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                boolean z12 = a4.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                boolean z13 = a4.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                boolean z14 = a4.b;
                return 1;
            case 8:
                if (!(obj instanceof s3)) {
                    boolean z15 = a4.b;
                    int i10 = e7.f7036a;
                    iB = c7.b((String) obj);
                    iV = a4.v(iB);
                } else {
                    boolean z16 = a4.b;
                    iB = ((s3) obj).d();
                    iV = a4.v(iB);
                }
                break;
            case 9:
                return ((x5) obj).zzn();
            case 10:
                return obj instanceof d5 ? ((d5) obj).c() : a4.u((x5) obj);
            case 11:
                if (!(obj instanceof s3)) {
                    boolean z17 = a4.b;
                    iB = ((byte[]) obj).length;
                    iV = a4.v(iB);
                } else {
                    boolean z18 = a4.b;
                    iB = ((s3) obj).d();
                    iV = a4.v(iB);
                }
                break;
            case 12:
                return a4.v(((Integer) obj).intValue());
            case 13:
                return obj instanceof v4 ? a4.w(((v4) obj).zza()) : a4.w(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                boolean z19 = a4.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                boolean z20 = a4.b;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return a4.v((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return a4.w((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iV + iB;
    }

    public static int c(j4 j4Var, Object obj) {
        g7 g7VarZzb = j4Var.zzb();
        int iZza = j4Var.zza();
        if (!j4Var.zze()) {
            return a(g7VarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!j4Var.zzd()) {
            int iA = 0;
            while (i10 < size) {
                iA += a(g7VarZzb, iZza, list.get(i10));
                i10++;
            }
            return iA;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iB = 0;
        while (i10 < size) {
            iB += b(g7VarZzb, list.get(i10));
            i10++;
        }
        return a4.v(iZza << 3) + iB + a4.v(iB);
    }

    public static k4 e() {
        return f7118d;
    }

    public static boolean j(Map.Entry entry) {
        j4 j4Var = (j4) entry.getKey();
        if (j4Var.zzc() != h7.MESSAGE) {
            return true;
        }
        if (!j4Var.zze()) {
            return k(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!k(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(Object obj) {
        if (obj instanceof y5) {
            return ((y5) obj).zzo();
        }
        if (obj instanceof d5) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static final int l(Map.Entry entry) {
        j4 j4Var = (j4) entry.getKey();
        Object value = entry.getValue();
        if (j4Var.zzc() != h7.MESSAGE || j4Var.zze() || j4Var.zzd()) {
            return c(j4Var, value);
        }
        if (value instanceof d5) {
            return ((d5) value).a(((j4) entry.getKey()).zza());
        }
        int iZza = ((j4) entry.getKey()).zza();
        int iV = a4.v(8);
        return iV + iV + a4.v(16) + a4.v(iZza) + a4.v(24) + a4.u((x5) value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0045 A[RETURN] */
    public static final void m(j4 j4Var, Object obj) {
        boolean z10;
        j4Var.zzb();
        obj.getClass();
        g7 g7Var = g7.f7066c;
        h7 h7Var = h7.INT;
        switch (r0.a()) {
            case INT:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(j4Var.zza()), j4Var.zzb().a(), obj.getClass().getName()));
            case LONG:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(j4Var.zza()), j4Var.zzb().a(), obj.getClass().getName()));
            case FLOAT:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(j4Var.zza()), j4Var.zzb().a(), obj.getClass().getName()));
            case DOUBLE:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(j4Var.zza()), j4Var.zzb().a(), obj.getClass().getName()));
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(j4Var.zza()), j4Var.zzb().a(), obj.getClass().getName()));
            case STRING:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(j4Var.zza()), j4Var.zzb().a(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof s3) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(j4Var.zza()), j4Var.zzb().a(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof v4)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(j4Var.zza()), j4Var.zzb().a(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof x5) || (obj instanceof d5)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(j4Var.zza()), j4Var.zzb().a(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(j4Var.zza()), j4Var.zzb().a(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        k4 k4Var = new k4();
        p6 p6Var = this.f7119a;
        int iC = p6Var.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Map.Entry entryG = p6Var.g(i10);
            k4Var.h((j4) ((k6) entryG).a(), entryG.getValue());
        }
        for (Map.Entry entry : p6Var.d()) {
            k4Var.h((j4) entry.getKey(), entry.getValue());
        }
        k4Var.f7120c = this.f7120c;
        return k4Var;
    }

    public final int d() {
        p6 p6Var = this.f7119a;
        int iC = p6Var.c();
        int iL = 0;
        for (int i10 = 0; i10 < iC; i10++) {
            iL += l(p6Var.g(i10));
        }
        Iterator it = p6Var.d().iterator();
        while (it.hasNext()) {
            iL += l((Map.Entry) it.next());
        }
        return iL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k4) {
            return this.f7119a.equals(((k4) obj).f7119a);
        }
        return false;
    }

    public final Iterator f() {
        p6 p6Var = this.f7119a;
        if (p6Var.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f7120c ? new b5(p6Var.entrySet().iterator()) : p6Var.entrySet().iterator();
    }

    public final void g() {
        if (this.b) {
            return;
        }
        p6 p6Var = this.f7119a;
        int iC = p6Var.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Object value = p6Var.g(i10).getValue();
            if (value instanceof t4) {
                ((t4) value).A();
            }
        }
        Iterator it = p6Var.d().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof t4) {
                ((t4) value2).A();
            }
        }
        p6Var.a();
        this.b = true;
    }

    public final void h(j4 j4Var, Object obj) {
        if (!j4Var.zze()) {
            m(j4Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                m(j4Var, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof d5) {
            this.f7120c = true;
        }
        this.f7119a.put(j4Var, obj);
    }

    public final int hashCode() {
        return this.f7119a.hashCode();
    }

    public final boolean i() {
        p6 p6Var = this.f7119a;
        int iC = p6Var.c();
        for (int i10 = 0; i10 < iC; i10++) {
            if (!j(p6Var.g(i10))) {
                return false;
            }
        }
        Iterator it = p6Var.d().iterator();
        while (it.hasNext()) {
            if (!j((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public k4(boolean z10) {
        g();
        g();
    }
}
