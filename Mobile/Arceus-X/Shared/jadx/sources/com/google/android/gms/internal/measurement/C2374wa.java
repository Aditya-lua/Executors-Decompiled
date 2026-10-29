package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.wa */
/* JADX INFO: loaded from: classes.dex */
public final class C2374wa {

    /* JADX INFO: renamed from: d */
    public static final C2374wa f8736d = new C2374wa(true);

    /* JADX INFO: renamed from: a */
    public final C2107hd f8737a = new C2031dd();

    /* JADX INFO: renamed from: b */
    public boolean f8738b;

    /* JADX INFO: renamed from: c */
    public boolean f8739c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2374wa() {
    }

    /* JADX INFO: renamed from: a */
    public static C2374wa m10937a() {
        return f8736d;
    }

    /* JADX INFO: renamed from: f */
    public static void m10938f(AbstractC2194ma abstractC2194ma, EnumC2377wd enumC2377wd, int i10, Object obj) {
        if (enumC2377wd == EnumC2377wd.f8752l) {
            InterfaceC2232oc interfaceC2232oc = (InterfaceC2232oc) obj;
            C2267qb.m10579d(interfaceC2232oc);
            abstractC2194ma.mo10329i(i10, 3);
            interfaceC2232oc.mo10064c(abstractC2194ma);
            abstractC2194ma.mo10329i(i10, 4);
            return;
        }
        abstractC2194ma.mo10329i(i10, enumC2377wd.m10954b());
        EnumC2395xd enumC2395xd = EnumC2395xd.INT;
        switch (enumC2377wd.ordinal()) {
            case 0:
                abstractC2194ma.mo10324C(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                abstractC2194ma.mo10322A(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                abstractC2194ma.mo10323B(((Long) obj).longValue());
                break;
            case 3:
                abstractC2194ma.mo10323B(((Long) obj).longValue());
                break;
            case 4:
                abstractC2194ma.mo10345y(((Integer) obj).intValue());
                break;
            case 5:
                abstractC2194ma.mo10324C(((Long) obj).longValue());
                break;
            case 6:
                abstractC2194ma.mo10322A(((Integer) obj).intValue());
                break;
            case 7:
                abstractC2194ma.mo10344x(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof AbstractC2104ha)) {
                    abstractC2194ma.mo10326E((String) obj);
                } else {
                    abstractC2194ma.mo10338r((AbstractC2104ha) obj);
                }
                break;
            case 9:
                ((InterfaceC2232oc) obj).mo10064c(abstractC2194ma);
                break;
            case 10:
                abstractC2194ma.mo10343w((InterfaceC2232oc) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC2104ha)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC2194ma.mo10339s(bArr, 0, bArr.length);
                } else {
                    abstractC2194ma.mo10338r((AbstractC2104ha) obj);
                }
                break;
            case 12:
                abstractC2194ma.mo10346z(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC2159kb)) {
                    abstractC2194ma.mo10345y(((Integer) obj).intValue());
                } else {
                    abstractC2194ma.mo10345y(((InterfaceC2159kb) obj).zza());
                }
                break;
            case 14:
                abstractC2194ma.mo10322A(((Integer) obj).intValue());
                break;
            case 15:
                abstractC2194ma.mo10324C(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC2194ma.mo10346z((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC2194ma.mo10323B((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m10939h(EnumC2377wd enumC2377wd, int i10, Object obj) {
        int iM10380G = AbstractC2194ma.m10380G(i10 << 3);
        if (enumC2377wd == EnumC2377wd.f8752l) {
            C2267qb.m10579d((InterfaceC2232oc) obj);
            iM10380G += iM10380G;
        }
        return iM10380G + m10940i(enumC2377wd, obj);
    }

    /* JADX INFO: renamed from: i */
    public static int m10940i(EnumC2377wd enumC2377wd, Object obj) {
        int iMo9871d;
        int iM10380G;
        EnumC2377wd enumC2377wd2 = EnumC2377wd.f8743c;
        EnumC2395xd enumC2395xd = EnumC2395xd.INT;
        switch (enumC2377wd.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = AbstractC2194ma.f8418b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = AbstractC2194ma.f8418b;
                return 4;
            case 2:
                return AbstractC2194ma.m10381a(((Long) obj).longValue());
            case 3:
                return AbstractC2194ma.m10381a(((Long) obj).longValue());
            case 4:
                return AbstractC2194ma.m10381a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = AbstractC2194ma.f8418b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = AbstractC2194ma.f8418b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = AbstractC2194ma.f8418b;
                return 1;
            case 8:
                if (!(obj instanceof AbstractC2104ha)) {
                    return AbstractC2194ma.m10382b((String) obj);
                }
                Logger logger6 = AbstractC2194ma.f8418b;
                iMo9871d = ((AbstractC2104ha) obj).mo9871d();
                iM10380G = AbstractC2194ma.m10380G(iMo9871d);
                break;
                break;
            case 9:
                return ((InterfaceC2232oc) obj).mo10063a();
            case 10:
                if (!(obj instanceof C2375wb)) {
                    return AbstractC2194ma.m10383c((InterfaceC2232oc) obj);
                }
                Logger logger7 = AbstractC2194ma.f8418b;
                iMo9871d = ((C2375wb) obj).m10980b();
                iM10380G = AbstractC2194ma.m10380G(iMo9871d);
                break;
                break;
            case 11:
                if (!(obj instanceof AbstractC2104ha)) {
                    Logger logger8 = AbstractC2194ma.f8418b;
                    iMo9871d = ((byte[]) obj).length;
                    iM10380G = AbstractC2194ma.m10380G(iMo9871d);
                } else {
                    Logger logger9 = AbstractC2194ma.f8418b;
                    iMo9871d = ((AbstractC2104ha) obj).mo9871d();
                    iM10380G = AbstractC2194ma.m10380G(iMo9871d);
                }
                break;
            case 12:
                return AbstractC2194ma.m10380G(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC2159kb ? AbstractC2194ma.m10381a(((InterfaceC2159kb) obj).zza()) : AbstractC2194ma.m10381a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = AbstractC2194ma.f8418b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = AbstractC2194ma.f8418b;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return AbstractC2194ma.m10380G((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return AbstractC2194ma.m10381a((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iM10380G + iMo9871d;
    }

    /* JADX INFO: renamed from: j */
    public static int m10941j(InterfaceC2356va interfaceC2356va, Object obj) {
        EnumC2377wd enumC2377wdZzb = interfaceC2356va.zzb();
        int iZza = interfaceC2356va.zza();
        if (!interfaceC2356va.zzd()) {
            return m10939h(enumC2377wdZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!interfaceC2356va.zze()) {
            int iM10939h = 0;
            while (i10 < size) {
                iM10939h += m10939h(enumC2377wdZzb, iZza, list.get(i10));
                i10++;
            }
            return iM10939h;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iM10940i = 0;
        while (i10 < size) {
            iM10940i += m10940i(enumC2377wdZzb, list.get(i10));
            i10++;
        }
        return AbstractC2194ma.m10380G(iZza << 3) + iM10940i + AbstractC2194ma.m10380G(iM10940i);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m10942k(Map.Entry entry) {
        InterfaceC2356va interfaceC2356va = (InterfaceC2356va) entry.getKey();
        if (interfaceC2356va.zzc() != EnumC2395xd.MESSAGE) {
            return true;
        }
        if (!interfaceC2356va.zzd()) {
            return m10943l(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!m10943l(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m10943l(Object obj) {
        if (obj instanceof InterfaceC2250pc) {
            return ((InterfaceC2250pc) obj).mo9875f();
        }
        if (obj instanceof C2375wb) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: renamed from: m */
    public static final int m10944m(Map.Entry entry) {
        int i10;
        int iM10380G;
        int iM10380G2;
        InterfaceC2356va interfaceC2356va = (InterfaceC2356va) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC2356va.zzc() != EnumC2395xd.MESSAGE || interfaceC2356va.zzd() || interfaceC2356va.zze()) {
            return m10941j(interfaceC2356va, value);
        }
        if (value instanceof C2375wb) {
            int iZza = ((InterfaceC2356va) entry.getKey()).zza();
            int iM10380G3 = AbstractC2194ma.m10380G(8);
            i10 = iM10380G3 + iM10380G3;
            iM10380G = AbstractC2194ma.m10380G(16) + AbstractC2194ma.m10380G(iZza);
            int iM10380G4 = AbstractC2194ma.m10380G(24);
            int iM10980b = ((C2375wb) value).m10980b();
            iM10380G2 = iM10380G4 + AbstractC2194ma.m10380G(iM10980b) + iM10980b;
        } else {
            int iZza2 = ((InterfaceC2356va) entry.getKey()).zza();
            int iM10380G5 = AbstractC2194ma.m10380G(8);
            i10 = iM10380G5 + iM10380G5;
            iM10380G = AbstractC2194ma.m10380G(16) + AbstractC2194ma.m10380G(iZza2);
            iM10380G2 = AbstractC2194ma.m10380G(24) + AbstractC2194ma.m10383c((InterfaceC2232oc) value);
        }
        return i10 + iM10380G + iM10380G2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0047 A[RETURN] */
    /* JADX INFO: renamed from: n */
    public static final void m10945n(InterfaceC2356va interfaceC2356va, Object obj) {
        boolean z10;
        interfaceC2356va.zzb();
        Charset charset = C2267qb.f8595a;
        obj.getClass();
        EnumC2377wd enumC2377wd = EnumC2377wd.f8743c;
        EnumC2395xd enumC2395xd = EnumC2395xd.INT;
        switch (r0.m10953a()) {
            case INT:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2356va.zza()), interfaceC2356va.zzb().m10953a(), obj.getClass().getName()));
            case LONG:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2356va.zza()), interfaceC2356va.zzb().m10953a(), obj.getClass().getName()));
            case FLOAT:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2356va.zza()), interfaceC2356va.zzb().m10953a(), obj.getClass().getName()));
            case DOUBLE:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2356va.zza()), interfaceC2356va.zzb().m10953a(), obj.getClass().getName()));
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2356va.zza()), interfaceC2356va.zzb().m10953a(), obj.getClass().getName()));
            case STRING:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2356va.zza()), interfaceC2356va.zzb().m10953a(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof AbstractC2104ha) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2356va.zza()), interfaceC2356va.zzb().m10953a(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC2159kb)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2356va.zza()), interfaceC2356va.zzb().m10953a(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof InterfaceC2232oc) || (obj instanceof C2375wb)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2356va.zza()), interfaceC2356va.zzb().m10953a(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2356va.zza()), interfaceC2356va.zzb().m10953a(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10946b() {
        if (this.f8738b) {
            return;
        }
        C2107hd c2107hd = this.f8737a;
        int iM10202c = c2107hd.m10202c();
        for (int i10 = 0; i10 < iM10202c; i10++) {
            Object value = c2107hd.m10203d(i10).getValue();
            if (value instanceof AbstractC2086gb) {
                ((AbstractC2086gb) value).m10073o();
            }
        }
        Iterator it = c2107hd.m10204e().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC2086gb) {
                ((AbstractC2086gb) value2).m10073o();
            }
        }
        c2107hd.mo9920a();
        this.f8738b = true;
    }

    /* JADX INFO: renamed from: c */
    public final Iterator m10947c() {
        C2107hd c2107hd = this.f8737a;
        if (c2107hd.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f8739c ? new C2357vb(c2107hd.entrySet().iterator()) : c2107hd.entrySet().iterator();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C2374wa c2374wa = new C2374wa();
        C2107hd c2107hd = this.f8737a;
        int iM10202c = c2107hd.m10202c();
        for (int i10 = 0; i10 < iM10202c; i10++) {
            Map.Entry entryM10203d = c2107hd.m10203d(i10);
            c2374wa.m10948d((InterfaceC2356va) ((C2050ed) entryM10203d).m9947a(), entryM10203d.getValue());
        }
        for (Map.Entry entry : c2107hd.m10204e()) {
            c2374wa.m10948d((InterfaceC2356va) entry.getKey(), entry.getValue());
        }
        c2374wa.f8739c = this.f8739c;
        return c2374wa;
    }

    /* JADX INFO: renamed from: d */
    public final void m10948d(InterfaceC2356va interfaceC2356va, Object obj) {
        if (!interfaceC2356va.zzd()) {
            m10945n(interfaceC2356va, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                m10945n(interfaceC2356va, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C2375wb) {
            this.f8739c = true;
        }
        this.f8737a.put(interfaceC2356va, obj);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m10949e() {
        C2107hd c2107hd = this.f8737a;
        int iM10202c = c2107hd.m10202c();
        for (int i10 = 0; i10 < iM10202c; i10++) {
            if (!m10942k(c2107hd.m10203d(i10))) {
                return false;
            }
        }
        Iterator it = c2107hd.m10204e().iterator();
        while (it.hasNext()) {
            if (!m10942k((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2374wa) {
            return this.f8737a.equals(((C2374wa) obj).f8737a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final int m10950g() {
        C2107hd c2107hd = this.f8737a;
        int iM10202c = c2107hd.m10202c();
        int iM10944m = 0;
        for (int i10 = 0; i10 < iM10202c; i10++) {
            iM10944m += m10944m(c2107hd.m10203d(i10));
        }
        Iterator it = c2107hd.m10204e().iterator();
        while (it.hasNext()) {
            iM10944m += m10944m((Map.Entry) it.next());
        }
        return iM10944m;
    }

    public final int hashCode() {
        return this.f8737a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2374wa(boolean z10) {
        m10946b();
        m10946b();
    }
}
