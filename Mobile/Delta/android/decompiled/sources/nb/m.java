package nb;

import java.util.EnumMap;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f25738a;

    public m() {
        this.f25738a = new EnumMap(p8.class);
    }

    public static m d(String str) {
        EnumMap enumMap = new EnumMap(p8.class);
        if (str.length() >= p8.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                p8[] p8VarArrValues = p8.values();
                int length = p8VarArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put(p8VarArrValues[i10], l.a(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new m(enumMap);
            }
        }
        return new m();
    }

    public final l a(p8 p8Var) {
        l lVar = (l) this.f25738a.get(p8Var);
        return lVar == null ? l.UNSET : lVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void b(p8 p8Var, int i10) {
        l lVar = l.UNSET;
        if (i10 == -30) {
            lVar = l.TCF;
        } else if (i10 == -20) {
            lVar = l.API;
        } else if (i10 == -10) {
            lVar = l.MANIFEST;
        } else if (i10 == 0) {
            lVar = l.API;
        } else if (i10 == 30) {
            lVar = l.INITIALIZATION;
        }
        this.f25738a.put(p8Var, lVar);
    }

    public final void c(p8 p8Var, l lVar) {
        this.f25738a.put(p8Var, lVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (p8 p8Var : p8.values()) {
            l lVar = (l) this.f25738a.get(p8Var);
            if (lVar == null) {
                lVar = l.UNSET;
            }
            sb2.append(lVar.b());
        }
        return sb2.toString();
    }

    public m(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(p8.class);
        this.f25738a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
