package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2553k4 {

    /* JADX INFO: renamed from: d */
    public static final C2553k4 f9062d = new C2553k4(true);

    /* JADX INFO: renamed from: a */
    public final C2610p6 f9063a = new C2544j6();

    /* JADX INFO: renamed from: b */
    public boolean f9064b;

    /* JADX INFO: renamed from: c */
    public boolean f9065c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2553k4() {
    }

    /* JADX INFO: renamed from: a */
    public static int m11517a(EnumC2512g7 enumC2512g7, int i10, Object obj) {
        int iM11173v = AbstractC2443a4.m11173v(i10 << 3);
        if (enumC2512g7 == EnumC2512g7.f9009l) {
            iM11173v += iM11173v;
        }
        return iM11173v + m11518b(enumC2512g7, obj);
    }

    /* JADX INFO: renamed from: b */
    public static int m11518b(EnumC2512g7 enumC2512g7, Object obj) {
        int iM11342b;
        int iM11173v;
        EnumC2512g7 enumC2512g8 = EnumC2512g7.f9000c;
        EnumC2523h7 enumC2523h7 = EnumC2523h7.INT;
        switch (enumC2512g7.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                boolean z10 = AbstractC2443a4.f8899b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                boolean z11 = AbstractC2443a4.f8899b;
                return 4;
            case 2:
                return AbstractC2443a4.m11174w(((Long) obj).longValue());
            case 3:
                return AbstractC2443a4.m11174w(((Long) obj).longValue());
            case 4:
                return AbstractC2443a4.m11174w(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                boolean z12 = AbstractC2443a4.f8899b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                boolean z13 = AbstractC2443a4.f8899b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                boolean z14 = AbstractC2443a4.f8899b;
                return 1;
            case 8:
                if (!(obj instanceof AbstractC2640s3)) {
                    boolean z15 = AbstractC2443a4.f8899b;
                    int i10 = C2490e7.f8962a;
                    iM11342b = C2468c7.m11342b((String) obj);
                    iM11173v = AbstractC2443a4.m11173v(iM11342b);
                } else {
                    boolean z16 = AbstractC2443a4.f8899b;
                    iM11342b = ((AbstractC2640s3) obj).mo11587d();
                    iM11173v = AbstractC2443a4.m11173v(iM11342b);
                }
                break;
            case 9:
                return ((InterfaceC2697x5) obj).zzn();
            case 10:
                return obj instanceof C2477d5 ? ((C2477d5) obj).m11362c() : AbstractC2443a4.m11172u((InterfaceC2697x5) obj);
            case 11:
                if (!(obj instanceof AbstractC2640s3)) {
                    boolean z17 = AbstractC2443a4.f8899b;
                    iM11342b = ((byte[]) obj).length;
                    iM11173v = AbstractC2443a4.m11173v(iM11342b);
                } else {
                    boolean z18 = AbstractC2443a4.f8899b;
                    iM11342b = ((AbstractC2640s3) obj).mo11587d();
                    iM11173v = AbstractC2443a4.m11173v(iM11342b);
                }
                break;
            case 12:
                return AbstractC2443a4.m11173v(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC2674v4 ? AbstractC2443a4.m11174w(((InterfaceC2674v4) obj).zza()) : AbstractC2443a4.m11174w(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                boolean z19 = AbstractC2443a4.f8899b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                boolean z20 = AbstractC2443a4.f8899b;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return AbstractC2443a4.m11173v((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return AbstractC2443a4.m11174w((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iM11173v + iM11342b;
    }

    /* JADX INFO: renamed from: c */
    public static int m11519c(InterfaceC2542j4 interfaceC2542j4, Object obj) {
        EnumC2512g7 enumC2512g7Zzb = interfaceC2542j4.zzb();
        int iZza = interfaceC2542j4.zza();
        if (!interfaceC2542j4.zze()) {
            return m11517a(enumC2512g7Zzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!interfaceC2542j4.zzd()) {
            int iM11517a = 0;
            while (i10 < size) {
                iM11517a += m11517a(enumC2512g7Zzb, iZza, list.get(i10));
                i10++;
            }
            return iM11517a;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iM11518b = 0;
        while (i10 < size) {
            iM11518b += m11518b(enumC2512g7Zzb, list.get(i10));
            i10++;
        }
        return AbstractC2443a4.m11173v(iZza << 3) + iM11518b + AbstractC2443a4.m11173v(iM11518b);
    }

    /* JADX INFO: renamed from: e */
    public static C2553k4 m11520e() {
        return f9062d;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m11521j(Map.Entry entry) {
        InterfaceC2542j4 interfaceC2542j4 = (InterfaceC2542j4) entry.getKey();
        if (interfaceC2542j4.zzc() != EnumC2523h7.MESSAGE) {
            return true;
        }
        if (!interfaceC2542j4.zze()) {
            return m11522k(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!m11522k(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m11522k(Object obj) {
        if (obj instanceof InterfaceC2708y5) {
            return ((InterfaceC2708y5) obj).zzo();
        }
        if (obj instanceof C2477d5) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: renamed from: l */
    public static final int m11523l(Map.Entry entry) {
        InterfaceC2542j4 interfaceC2542j4 = (InterfaceC2542j4) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC2542j4.zzc() != EnumC2523h7.MESSAGE || interfaceC2542j4.zze() || interfaceC2542j4.zzd()) {
            return m11519c(interfaceC2542j4, value);
        }
        if (value instanceof C2477d5) {
            return ((C2477d5) value).m11360a(((InterfaceC2542j4) entry.getKey()).zza());
        }
        int iZza = ((InterfaceC2542j4) entry.getKey()).zza();
        int iM11173v = AbstractC2443a4.m11173v(8);
        return iM11173v + iM11173v + AbstractC2443a4.m11173v(16) + AbstractC2443a4.m11173v(iZza) + AbstractC2443a4.m11173v(24) + AbstractC2443a4.m11172u((InterfaceC2697x5) value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0045 A[RETURN] */
    /* JADX INFO: renamed from: m */
    public static final void m11524m(InterfaceC2542j4 interfaceC2542j4, Object obj) {
        boolean z10;
        interfaceC2542j4.zzb();
        obj.getClass();
        EnumC2512g7 enumC2512g7 = EnumC2512g7.f9000c;
        EnumC2523h7 enumC2523h7 = EnumC2523h7.INT;
        switch (r0.m11440a()) {
            case INT:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2542j4.zza()), interfaceC2542j4.zzb().m11440a(), obj.getClass().getName()));
            case LONG:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2542j4.zza()), interfaceC2542j4.zzb().m11440a(), obj.getClass().getName()));
            case FLOAT:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2542j4.zza()), interfaceC2542j4.zzb().m11440a(), obj.getClass().getName()));
            case DOUBLE:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2542j4.zza()), interfaceC2542j4.zzb().m11440a(), obj.getClass().getName()));
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2542j4.zza()), interfaceC2542j4.zzb().m11440a(), obj.getClass().getName()));
            case STRING:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2542j4.zza()), interfaceC2542j4.zzb().m11440a(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof AbstractC2640s3) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2542j4.zza()), interfaceC2542j4.zzb().m11440a(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC2674v4)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2542j4.zza()), interfaceC2542j4.zzb().m11440a(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof InterfaceC2697x5) || (obj instanceof C2477d5)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2542j4.zza()), interfaceC2542j4.zzb().m11440a(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2542j4.zza()), interfaceC2542j4.zzb().m11440a(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C2553k4 c2553k4 = new C2553k4();
        C2610p6 c2610p6 = this.f9063a;
        int iM11654c = c2610p6.m11654c();
        for (int i10 = 0; i10 < iM11654c; i10++) {
            Map.Entry entryM11657g = c2610p6.m11657g(i10);
            c2553k4.m11528h((InterfaceC2542j4) ((C2555k6) entryM11657g).m11531a(), entryM11657g.getValue());
        }
        for (Map.Entry entry : c2610p6.m11655d()) {
            c2553k4.m11528h((InterfaceC2542j4) entry.getKey(), entry.getValue());
        }
        c2553k4.f9065c = this.f9065c;
        return c2553k4;
    }

    /* JADX INFO: renamed from: d */
    public final int m11525d() {
        C2610p6 c2610p6 = this.f9063a;
        int iM11654c = c2610p6.m11654c();
        int iM11523l = 0;
        for (int i10 = 0; i10 < iM11654c; i10++) {
            iM11523l += m11523l(c2610p6.m11657g(i10));
        }
        Iterator it = c2610p6.m11655d().iterator();
        while (it.hasNext()) {
            iM11523l += m11523l((Map.Entry) it.next());
        }
        return iM11523l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2553k4) {
            return this.f9063a.equals(((C2553k4) obj).f9063a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Iterator m11526f() {
        C2610p6 c2610p6 = this.f9063a;
        if (c2610p6.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f9065c ? new C2455b5(c2610p6.entrySet().iterator()) : c2610p6.entrySet().iterator();
    }

    /* JADX INFO: renamed from: g */
    public final void m11527g() {
        if (this.f9064b) {
            return;
        }
        C2610p6 c2610p6 = this.f9063a;
        int iM11654c = c2610p6.m11654c();
        for (int i10 = 0; i10 < iM11654c; i10++) {
            Object value = c2610p6.m11657g(i10).getValue();
            if (value instanceof AbstractC2652t4) {
                ((AbstractC2652t4) value).m11748A();
            }
        }
        Iterator it = c2610p6.m11655d().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC2652t4) {
                ((AbstractC2652t4) value2).m11748A();
            }
        }
        c2610p6.mo11509a();
        this.f9064b = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m11528h(InterfaceC2542j4 interfaceC2542j4, Object obj) {
        if (!interfaceC2542j4.zze()) {
            m11524m(interfaceC2542j4, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                m11524m(interfaceC2542j4, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C2477d5) {
            this.f9065c = true;
        }
        this.f9063a.put(interfaceC2542j4, obj);
    }

    public final int hashCode() {
        return this.f9063a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m11529i() {
        C2610p6 c2610p6 = this.f9063a;
        int iM11654c = c2610p6.m11654c();
        for (int i10 = 0; i10 < iM11654c; i10++) {
            if (!m11521j(c2610p6.m11657g(i10))) {
                return false;
            }
        }
        Iterator it = c2610p6.m11655d().iterator();
        while (it.hasNext()) {
            if (!m11521j((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2553k4(boolean z10) {
        m11527g();
        m11527g();
    }
}
