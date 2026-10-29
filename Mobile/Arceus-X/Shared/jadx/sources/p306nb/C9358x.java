package p306nb;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: nb.x */
/* JADX INFO: loaded from: classes.dex */
public final class C9358x {

    /* JADX INFO: renamed from: f */
    public static final C9358x f33619f = new C9358x((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a */
    public final int f33620a;

    /* JADX INFO: renamed from: b */
    public final String f33621b;

    /* JADX INFO: renamed from: c */
    public final Boolean f33622c;

    /* JADX INFO: renamed from: d */
    public final String f33623d;

    /* JADX INFO: renamed from: e */
    public final EnumMap f33624e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C9358x(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(EnumC9239p8.class);
        this.f33624e = enumMap;
        enumMap.put(EnumC9239p8.AD_USER_DATA, C9255q8.m36646h(bool));
        this.f33620a = i10;
        this.f33621b = m37026l();
        this.f33622c = bool2;
        this.f33623d = str;
    }

    /* JADX INFO: renamed from: a */
    public static C9358x m37015a(EnumC9207n8 enumC9207n8, int i10) {
        EnumMap enumMap = new EnumMap(EnumC9239p8.class);
        enumMap.put(EnumC9239p8.AD_USER_DATA, enumC9207n8);
        return new C9358x(enumMap, -10, (Boolean) null, (String) null);
    }

    /* JADX INFO: renamed from: g */
    public static C9358x m37016g(String str) {
        if (str == null || str.length() <= 0) {
            return f33619f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(EnumC9239p8.class);
        EnumC9239p8[] enumC9239p8ArrM36598a = EnumC9223o8.DMA.m36598a();
        int length = enumC9239p8ArrM36598a.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put(enumC9239p8ArrM36598a[i12], C9255q8.m36648j(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new C9358x(enumMap, i10, (Boolean) null, (String) null);
    }

    /* JADX INFO: renamed from: h */
    public static C9358x m37017h(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C9358x((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(EnumC9239p8.class);
        for (EnumC9239p8 enumC9239p8 : EnumC9223o8.DMA.m36598a()) {
            enumMap.put(enumC9239p8, C9255q8.m36645g(bundle.getString(enumC9239p8.f33347a)));
        }
        return new C9358x(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* JADX INFO: renamed from: i */
    public static Boolean m37018i(Bundle bundle) {
        EnumC9207n8 enumC9207n8M36645g;
        if (bundle == null || (enumC9207n8M36645g = C9255q8.m36645g(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = enumC9207n8M36645g.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: b */
    public final int m37019b() {
        return this.f33620a;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC9207n8 m37020c() {
        EnumC9207n8 enumC9207n8 = (EnumC9207n8) this.f33624e.get(EnumC9239p8.AD_USER_DATA);
        return enumC9207n8 == null ? EnumC9207n8.UNINITIALIZED : enumC9207n8;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m37021d() {
        Iterator it = this.f33624e.values().iterator();
        while (it.hasNext()) {
            if (((EnumC9207n8) it.next()) != EnumC9207n8.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final String m37022e() {
        return this.f33621b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9358x)) {
            return false;
        }
        C9358x c9358x = (C9358x) obj;
        if (this.f33621b.equalsIgnoreCase(c9358x.f33621b) && Objects.equals(this.f33622c, c9358x.f33622c)) {
            return Objects.equals(this.f33623d, c9358x.f33623d);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Bundle m37023f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f33624e.entrySet()) {
            String strM36647i = C9255q8.m36647i((EnumC9207n8) entry.getValue());
            if (strM36647i != null) {
                bundle.putString(((EnumC9239p8) entry.getKey()).f33347a, strM36647i);
            }
        }
        Boolean bool = this.f33622c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f33623d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final int hashCode() {
        int i10;
        Boolean bool = this.f33622c;
        if (bool == null) {
            i10 = 3;
        } else {
            i10 = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.f33623d;
        return this.f33621b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    /* JADX INFO: renamed from: j */
    public final Boolean m37024j() {
        return this.f33622c;
    }

    /* JADX INFO: renamed from: k */
    public final String m37025k() {
        return this.f33623d;
    }

    /* JADX INFO: renamed from: l */
    public final String m37026l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f33620a);
        for (EnumC9239p8 enumC9239p8 : EnumC9223o8.DMA.m36598a()) {
            sb2.append(":");
            sb2.append(C9255q8.m36649m((EnumC9207n8) this.f33624e.get(enumC9239p8)));
        }
        return sb2.toString();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(C9255q8.m36642d(this.f33620a));
        for (EnumC9239p8 enumC9239p8 : EnumC9223o8.DMA.m36598a()) {
            sb2.append(",");
            sb2.append(enumC9239p8.f33347a);
            sb2.append("=");
            EnumC9207n8 enumC9207n8 = (EnumC9207n8) this.f33624e.get(enumC9239p8);
            if (enumC9207n8 == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = enumC9207n8.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f33622c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f33623d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public C9358x(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(EnumC9239p8.class);
        this.f33624e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f33620a = i10;
        this.f33621b = m37026l();
        this.f33622c = bool;
        this.f33623d = str;
    }
}
