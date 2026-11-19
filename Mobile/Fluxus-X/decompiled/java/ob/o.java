package ob;

import java.util.EnumMap;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f27631a;

    public o() {
        this.f27631a = new EnumMap(u8.class);
    }

    public static o d(String str) {
        EnumMap enumMap = new EnumMap(u8.class);
        if (str.length() >= u8.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                u8[] u8VarArrValues = u8.values();
                int length = u8VarArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put(u8VarArrValues[i10], n.a(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new o(enumMap);
            }
        }
        return new o();
    }

    public final n a(u8 u8Var) {
        n nVar = (n) this.f27631a.get(u8Var);
        return nVar == null ? n.UNSET : nVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void b(u8 u8Var, int i10) {
        n nVar = n.UNSET;
        if (i10 == -30) {
            nVar = n.TCF;
        } else if (i10 == -20) {
            nVar = n.API;
        } else if (i10 == -10) {
            nVar = n.MANIFEST;
        } else if (i10 == 0) {
            nVar = n.API;
        } else if (i10 == 30) {
            nVar = n.INITIALIZATION;
        }
        this.f27631a.put(u8Var, nVar);
    }

    public final void c(u8 u8Var, n nVar) {
        this.f27631a.put(u8Var, nVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (u8 u8Var : u8.values()) {
            n nVar = (n) this.f27631a.get(u8Var);
            if (nVar == null) {
                nVar = n.UNSET;
            }
            sb2.append(nVar.b());
        }
        return sb2.toString();
    }

    public o(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(u8.class);
        this.f27631a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
