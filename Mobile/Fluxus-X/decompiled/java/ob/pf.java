package ob;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27723a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.j7 f27724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BitSet f27725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BitSet f27726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f27727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f27728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f27729h;

    public /* synthetic */ pf(e eVar, String str, com.google.android.gms.internal.measurement.j7 j7Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(eVar);
        this.f27729h = eVar;
        this.f27723a = str;
        this.f27725d = bitSet;
        this.f27726e = bitSet2;
        this.f27727f = map;
        this.f27728g = new w1.a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f27728g.put(num, arrayList);
        }
        this.b = false;
        this.f27724c = j7Var;
    }

    public final void a(@NonNull c cVar) {
        int iA = cVar.a();
        if (cVar.f27134c != null) {
            this.f27726e.set(iA, true);
        }
        Boolean bool = cVar.f27135d;
        if (bool != null) {
            this.f27725d.set(iA, bool.booleanValue());
        }
        if (cVar.f27136e != null) {
            Map map = this.f27727f;
            Integer numValueOf = Integer.valueOf(iA);
            Long l10 = (Long) map.get(numValueOf);
            long jLongValue = cVar.f27136e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                this.f27727f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (cVar.f27137f != null) {
            Map map2 = this.f27728g;
            Integer numValueOf2 = Integer.valueOf(iA);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f27728g.put(numValueOf2, arrayList);
            }
            if (cVar.b()) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.cf.a();
            l7 l7Var = this.f27729h.f27641a;
            m mVarW = l7Var.w();
            String str = this.f27723a;
            d5 d5Var = e5.G0;
            if (mVarW.H(str, d5Var) && cVar.c()) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.cf.a();
            if (!l7Var.w().H(this.f27723a, d5Var)) {
                arrayList.add(Long.valueOf(cVar.f27137f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(cVar.f27137f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    @NonNull
    public final com.google.android.gms.internal.measurement.g6 b(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.f6 f6VarM = com.google.android.gms.internal.measurement.g6.M();
        f6VarM.z(i10);
        f6VarM.D(this.b);
        com.google.android.gms.internal.measurement.j7 j7Var = this.f27724c;
        if (j7Var != null) {
            f6VarM.C(j7Var);
        }
        com.google.android.gms.internal.measurement.i7 i7VarN = com.google.android.gms.internal.measurement.j7.N();
        i7VarN.C(af.Q(this.f27725d));
        i7VarN.z(af.Q(this.f27726e));
        Map map = this.f27727f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f27727f.keySet()) {
                int iIntValue = num.intValue();
                Long l10 = (Long) this.f27727f.get(num);
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.p6 p6VarJ = com.google.android.gms.internal.measurement.q6.J();
                    p6VarJ.z(iIntValue);
                    p6VarJ.B(l10.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.q6) p6VarJ.v());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            i7VarN.F(arrayList);
        }
        Map map2 = this.f27728g;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f27728g.keySet()) {
                com.google.android.gms.internal.measurement.k7 k7VarK = com.google.android.gms.internal.measurement.l7.K();
                k7VarK.z(num2.intValue());
                List list2 = (List) this.f27728g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    k7VarK.B(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.l7) k7VarK.v());
            }
            list = arrayList3;
        }
        i7VarN.H(list);
        f6VarM.B(i7VarN);
        return (com.google.android.gms.internal.measurement.g6) f6VarM.v();
    }

    public final /* synthetic */ BitSet c() {
        return this.f27725d;
    }

    public /* synthetic */ pf(e eVar, String str, byte[] bArr) {
        Objects.requireNonNull(eVar);
        this.f27729h = eVar;
        this.f27723a = str;
        this.b = true;
        this.f27725d = new BitSet();
        this.f27726e = new BitSet();
        this.f27727f = new w1.a();
        this.f27728g = new w1.a();
    }
}
