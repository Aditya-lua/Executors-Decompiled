package eb;

import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public final class v3 extends e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f15419a;
    public final int b;

    public v3(e1 e1Var) throws u3 {
        e1Var.getClass();
        this.f15419a = e1Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            e1 e1Var2 = this.f15419a;
            if (i10 >= e1Var2.size()) {
                break;
            }
            int iA = ((e4) e1Var2.get(i10)).a();
            if (i11 < iA) {
                i11 = iA;
            }
            i10++;
        }
        int i12 = i11 + 1;
        this.b = i12;
        if (i12 > 8) {
            throw new u3("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // eb.e4
    public final int a() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        e4 e4Var = (e4) obj;
        if (e4.c((byte) -128) != e4Var.zza()) {
            return e4.c((byte) -128) - e4Var.zza();
        }
        v3 v3Var = (v3) e4Var;
        e1 e1Var = this.f15419a;
        int size = e1Var.size();
        e1 e1Var2 = v3Var.f15419a;
        if (size != e1Var2.size()) {
            return e1Var.size() - e1Var2.size();
        }
        int i10 = 0;
        while (true) {
            e1 e1Var3 = this.f15419a;
            if (i10 >= e1Var3.size()) {
                return 0;
            }
            int iCompareTo = ((e4) e1Var3.get(i10)).compareTo((e4) v3Var.f15419a.get(i10));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v3.class == obj.getClass()) {
            return this.f15419a.equals(((v3) obj).f15419a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(e4.c((byte) -128)), this.f15419a});
    }

    public final String toString() {
        if (this.f15419a.isEmpty()) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        ArrayList arrayList = new ArrayList();
        e1 e1Var = this.f15419a;
        int size = e1Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((e4) e1Var.get(i10)).toString().replace("\n", "\n  "));
        }
        e0 e0VarA = e0.a(",\n  ");
        StringBuilder sb2 = new StringBuilder("[\n  ");
        e0VarA.c(sb2, arrayList.iterator());
        sb2.append("\n]");
        return sb2.toString();
    }

    @Override // eb.e4
    public final int zza() {
        return e4.c((byte) -128);
    }
}
