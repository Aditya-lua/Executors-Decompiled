package eb;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b4 extends e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15253a;
    public final l1 b;

    public b4(l1 l1Var) throws u3 {
        l1Var.getClass();
        this.b = l1Var;
        c2 c2VarD = l1Var.c().d();
        int i10 = 0;
        while (c2VarD.hasNext()) {
            Map.Entry entry = (Map.Entry) c2VarD.next();
            int iA = ((e4) entry.getKey()).a();
            i10 = i10 < iA ? iA : i10;
            int iA2 = ((e4) entry.getValue()).a();
            if (i10 < iA2) {
                i10 = iA2;
            }
        }
        int i11 = i10 + 1;
        this.f15253a = i11;
        if (i11 > 8) {
            throw new u3("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // eb.e4
    public final int a() {
        return this.f15253a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int iCompareTo;
        int size;
        int size2;
        e4 e4Var = (e4) obj;
        if (e4.c((byte) -96) != e4Var.zza()) {
            size2 = e4Var.zza();
            size = e4.c((byte) -96);
        } else {
            b4 b4Var = (b4) e4Var;
            if (this.b.size() == b4Var.b.size()) {
                c2 c2VarD = this.b.c().d();
                c2 c2VarD2 = b4Var.b.c().d();
                do {
                    if (!c2VarD.hasNext() && !c2VarD2.hasNext()) {
                        return 0;
                    }
                    Map.Entry entry = (Map.Entry) c2VarD.next();
                    Map.Entry entry2 = (Map.Entry) c2VarD2.next();
                    int iCompareTo2 = ((e4) entry.getKey()).compareTo((e4) entry2.getKey());
                    if (iCompareTo2 != 0) {
                        return iCompareTo2;
                    }
                    iCompareTo = ((e4) entry.getValue()).compareTo((e4) entry2.getValue());
                } while (iCompareTo == 0);
                return iCompareTo;
            }
            size = this.b.size();
            size2 = b4Var.b.size();
        }
        return size - size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b4.class == obj.getClass()) {
            return this.b.equals(((b4) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(e4.c((byte) -96)), this.b});
    }

    public final l1 q() {
        return this.b;
    }

    public final String toString() {
        if (this.b.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c2 c2VarD = this.b.c().d();
        while (c2VarD.hasNext()) {
            Map.Entry entry = (Map.Entry) c2VarD.next();
            linkedHashMap.put(((e4) entry.getKey()).toString().replace("\n", "\n  "), ((e4) entry.getValue()).toString().replace("\n", "\n  "));
        }
        e0 e0VarA = e0.a(",\n  ");
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            d0.a(sb2, linkedHashMap.entrySet().iterator(), e0VarA, " : ");
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // eb.e4
    public final int zza() {
        return e4.c((byte) -96);
    }
}
