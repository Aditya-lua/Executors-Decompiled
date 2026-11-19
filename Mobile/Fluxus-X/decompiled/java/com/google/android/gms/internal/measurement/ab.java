package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class ab {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ab f6372d = new ab(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ld f6373a = new hd();
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6374c;

    public ab() {
    }

    public static ab a() {
        return f6372d;
    }

    public static void f(qa qaVar, ae aeVar, int i10, Object obj) {
        if (aeVar == ae.f6386l) {
            sc scVar = (sc) obj;
            ub.d(scVar);
            qaVar.i(i10, 3);
            scVar.c(qaVar);
            qaVar.i(i10, 4);
            return;
        }
        qaVar.i(i10, aeVar.b());
        be beVar = be.INT;
        switch (aeVar.ordinal()) {
            case 0:
                qaVar.C(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                qaVar.A(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                qaVar.B(((Long) obj).longValue());
                break;
            case 3:
                qaVar.B(((Long) obj).longValue());
                break;
            case 4:
                qaVar.y(((Integer) obj).intValue());
                break;
            case 5:
                qaVar.C(((Long) obj).longValue());
                break;
            case 6:
                qaVar.A(((Integer) obj).intValue());
                break;
            case 7:
                qaVar.x(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof la)) {
                    qaVar.E((String) obj);
                } else {
                    qaVar.r((la) obj);
                }
                break;
            case 9:
                ((sc) obj).c(qaVar);
                break;
            case 10:
                qaVar.w((sc) obj);
                break;
            case 11:
                if (!(obj instanceof la)) {
                    byte[] bArr = (byte[]) obj;
                    qaVar.s(bArr, 0, bArr.length);
                } else {
                    qaVar.r((la) obj);
                }
                break;
            case 12:
                qaVar.z(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof ob)) {
                    qaVar.y(((Integer) obj).intValue());
                } else {
                    qaVar.y(((ob) obj).zza());
                }
                break;
            case 14:
                qaVar.A(((Integer) obj).intValue());
                break;
            case 15:
                qaVar.C(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                qaVar.z((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                qaVar.B((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static int h(ae aeVar, int i10, Object obj) {
        int iG = qa.G(i10 << 3);
        if (aeVar == ae.f6386l) {
            ub.d((sc) obj);
            iG += iG;
        }
        return iG + i(aeVar, obj);
    }

    public static int i(ae aeVar, Object obj) {
        int iD;
        int iG;
        ae aeVar2 = ae.f6377c;
        be beVar = be.INT;
        switch (aeVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = qa.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = qa.b;
                return 4;
            case 2:
                return qa.a(((Long) obj).longValue());
            case 3:
                return qa.a(((Long) obj).longValue());
            case 4:
                return qa.a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = qa.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = qa.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = qa.b;
                return 1;
            case 8:
                if (!(obj instanceof la)) {
                    return qa.b((String) obj);
                }
                Logger logger6 = qa.b;
                iD = ((la) obj).d();
                iG = qa.G(iD);
                break;
                break;
            case 9:
                return ((sc) obj).a();
            case 10:
                if (!(obj instanceof ac)) {
                    return qa.c((sc) obj);
                }
                Logger logger7 = qa.b;
                iD = ((ac) obj).b();
                iG = qa.G(iD);
                break;
                break;
            case 11:
                if (!(obj instanceof la)) {
                    Logger logger8 = qa.b;
                    iD = ((byte[]) obj).length;
                    iG = qa.G(iD);
                } else {
                    Logger logger9 = qa.b;
                    iD = ((la) obj).d();
                    iG = qa.G(iD);
                }
                break;
            case 12:
                return qa.G(((Integer) obj).intValue());
            case 13:
                return obj instanceof ob ? qa.a(((ob) obj).zza()) : qa.a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = qa.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = qa.b;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return qa.G((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return qa.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iG + iD;
    }

    public static int j(za zaVar, Object obj) {
        ae aeVarZzb = zaVar.zzb();
        int iZza = zaVar.zza();
        if (!zaVar.zzd()) {
            return h(aeVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!zaVar.zze()) {
            int iH = 0;
            while (i10 < size) {
                iH += h(aeVarZzb, iZza, list.get(i10));
                i10++;
            }
            return iH;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i11 = 0;
        while (i10 < size) {
            i11 += i(aeVarZzb, list.get(i10));
            i10++;
        }
        return qa.G(iZza << 3) + i11 + qa.G(i11);
    }

    public static boolean k(Map.Entry entry) {
        za zaVar = (za) entry.getKey();
        if (zaVar.zzc() != be.MESSAGE) {
            return true;
        }
        if (!zaVar.zzd()) {
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
        if (obj instanceof tc) {
            return ((tc) obj).f();
        }
        if (obj instanceof ac) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static final int m(Map.Entry entry) {
        int i10;
        int iG;
        int iG2;
        za zaVar = (za) entry.getKey();
        Object value = entry.getValue();
        if (zaVar.zzc() != be.MESSAGE || zaVar.zzd() || zaVar.zze()) {
            return j(zaVar, value);
        }
        if (value instanceof ac) {
            int iZza = ((za) entry.getKey()).zza();
            int iG3 = qa.G(8);
            i10 = iG3 + iG3;
            iG = qa.G(16) + qa.G(iZza);
            int iG4 = qa.G(24);
            int iB = ((ac) value).b();
            iG2 = iG4 + qa.G(iB) + iB;
        } else {
            int iZza2 = ((za) entry.getKey()).zza();
            int iG5 = qa.G(8);
            i10 = iG5 + iG5;
            iG = qa.G(16) + qa.G(iZza2);
            iG2 = qa.G(24) + qa.c((sc) value);
        }
        return i10 + iG + iG2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0047 A[RETURN] */
    public static final void n(za zaVar, Object obj) {
        boolean z10;
        zaVar.zzb();
        Charset charset = ub.f6869a;
        obj.getClass();
        ae aeVar = ae.f6377c;
        be beVar = be.INT;
        switch (r0.a()) {
            case INT:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zaVar.zza()), zaVar.zzb().a(), obj.getClass().getName()));
            case LONG:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zaVar.zza()), zaVar.zzb().a(), obj.getClass().getName()));
            case FLOAT:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zaVar.zza()), zaVar.zzb().a(), obj.getClass().getName()));
            case DOUBLE:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zaVar.zza()), zaVar.zzb().a(), obj.getClass().getName()));
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zaVar.zza()), zaVar.zzb().a(), obj.getClass().getName()));
            case STRING:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zaVar.zza()), zaVar.zzb().a(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof la) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zaVar.zza()), zaVar.zzb().a(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof ob)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zaVar.zza()), zaVar.zzb().a(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof sc) || (obj instanceof ac)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zaVar.zza()), zaVar.zzb().a(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zaVar.zza()), zaVar.zzb().a(), obj.getClass().getName()));
        }
    }

    public final void b() {
        if (this.b) {
            return;
        }
        ld ldVar = this.f6373a;
        int iC = ldVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Object value = ldVar.d(i10).getValue();
            if (value instanceof kb) {
                ((kb) value).o();
            }
        }
        Iterator it = ldVar.e().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof kb) {
                ((kb) value2).o();
            }
        }
        ldVar.a();
        this.b = true;
    }

    public final Iterator c() {
        ld ldVar = this.f6373a;
        if (ldVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f6374c ? new zb(ldVar.entrySet().iterator()) : ldVar.entrySet().iterator();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        ab abVar = new ab();
        ld ldVar = this.f6373a;
        int iC = ldVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Map.Entry entryD = ldVar.d(i10);
            abVar.d((za) ((id) entryD).a(), entryD.getValue());
        }
        for (Map.Entry entry : ldVar.e()) {
            abVar.d((za) entry.getKey(), entry.getValue());
        }
        abVar.f6374c = this.f6374c;
        return abVar;
    }

    public final void d(za zaVar, Object obj) {
        if (!zaVar.zzd()) {
            n(zaVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                n(zaVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof ac) {
            this.f6374c = true;
        }
        this.f6373a.put(zaVar, obj);
    }

    public final boolean e() {
        ld ldVar = this.f6373a;
        int iC = ldVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            if (!k(ldVar.d(i10))) {
                return false;
            }
        }
        Iterator it = ldVar.e().iterator();
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
        if (obj instanceof ab) {
            return this.f6373a.equals(((ab) obj).f6373a);
        }
        return false;
    }

    public final int g() {
        ld ldVar = this.f6373a;
        int iC = ldVar.c();
        int iM = 0;
        for (int i10 = 0; i10 < iC; i10++) {
            iM += m(ldVar.d(i10));
        }
        Iterator it = ldVar.e().iterator();
        while (it.hasNext()) {
            iM += m((Map.Entry) it.next());
        }
        return iM;
    }

    public final int hashCode() {
        return this.f6373a.hashCode();
    }

    public ab(boolean z10) {
        b();
        b();
    }
}
