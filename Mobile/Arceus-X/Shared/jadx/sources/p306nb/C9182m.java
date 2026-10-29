package p306nb;

import java.util.EnumMap;

/* JADX INFO: renamed from: nb.m */
/* JADX INFO: loaded from: classes.dex */
public final class C9182m {

    /* JADX INFO: renamed from: a */
    public final EnumMap f33194a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C9182m() {
        this.f33194a = new EnumMap(EnumC9239p8.class);
    }

    /* JADX INFO: renamed from: d */
    public static C9182m m36474d(String str) {
        EnumMap enumMap = new EnumMap(EnumC9239p8.class);
        if (str.length() >= EnumC9239p8.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                EnumC9239p8[] enumC9239p8ArrValues = EnumC9239p8.values();
                int length = enumC9239p8ArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put(enumC9239p8ArrValues[i10], EnumC9166l.m36465a(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new C9182m(enumMap);
            }
        }
        return new C9182m();
    }

    /* JADX INFO: renamed from: a */
    public final EnumC9166l m36475a(EnumC9239p8 enumC9239p8) {
        EnumC9166l enumC9166l = (EnumC9166l) this.f33194a.get(enumC9239p8);
        return enumC9166l == null ? EnumC9166l.UNSET : enumC9166l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    /* JADX INFO: renamed from: b */
    public final void m36476b(EnumC9239p8 enumC9239p8, int i10) {
        EnumC9166l enumC9166l = EnumC9166l.UNSET;
        if (i10 == -30) {
            enumC9166l = EnumC9166l.TCF;
        } else if (i10 == -20) {
            enumC9166l = EnumC9166l.API;
        } else if (i10 == -10) {
            enumC9166l = EnumC9166l.MANIFEST;
        } else if (i10 == 0) {
            enumC9166l = EnumC9166l.API;
        } else if (i10 == 30) {
            enumC9166l = EnumC9166l.INITIALIZATION;
        }
        this.f33194a.put(enumC9239p8, enumC9166l);
    }

    /* JADX INFO: renamed from: c */
    public final void m36477c(EnumC9239p8 enumC9239p8, EnumC9166l enumC9166l) {
        this.f33194a.put(enumC9239p8, enumC9166l);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (EnumC9239p8 enumC9239p8 : EnumC9239p8.values()) {
            EnumC9166l enumC9166l = (EnumC9166l) this.f33194a.get(enumC9239p8);
            if (enumC9166l == null) {
                enumC9166l = EnumC9166l.UNSET;
            }
            sb2.append(enumC9166l.m36466b());
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C9182m(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(EnumC9239p8.class);
        this.f33194a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
