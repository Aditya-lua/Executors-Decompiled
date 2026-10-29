package nb;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25465a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.f7 f25466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BitSet f25467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BitSet f25468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f25469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f25470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f25471h;

    public /* synthetic */ df(e eVar, String str, com.google.android.gms.internal.measurement.f7 f7Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(eVar);
        this.f25471h = eVar;
        this.f25465a = str;
        this.f25467d = bitSet;
        this.f25468e = bitSet2;
        this.f25469f = map;
        this.f25470g = new w1.a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f25470g.put(num, arrayList);
        }
        this.b = false;
        this.f25466c = f7Var;
    }

    public final void a(@NonNull c cVar) {
        int iA = cVar.a();
        if (cVar.f25378c != null) {
            this.f25468e.set(iA, true);
        }
        Boolean bool = cVar.f25379d;
        if (bool != null) {
            this.f25467d.set(iA, bool.booleanValue());
        }
        if (cVar.f25380e != null) {
            Map map = this.f25469f;
            Integer numValueOf = Integer.valueOf(iA);
            Long l10 = (Long) map.get(numValueOf);
            long jLongValue = cVar.f25380e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                this.f25469f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (cVar.f25381f != null) {
            Map map2 = this.f25470g;
            Integer numValueOf2 = Integer.valueOf(iA);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f25470g.put(numValueOf2, arrayList);
            }
            if (cVar.b()) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.ye.a();
            g7 g7Var = this.f25471h.f25625a;
            k kVarW = g7Var.w();
            String str = this.f25465a;
            y4 y4Var = z4.G0;
            if (kVarW.H(str, y4Var) && cVar.c()) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.ye.a();
            if (!g7Var.w().H(this.f25465a, y4Var)) {
                arrayList.add(Long.valueOf(cVar.f25381f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(cVar.f25381f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    @NonNull
    public final com.google.android.gms.internal.measurement.c6 b(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.b6 b6VarO = com.google.android.gms.internal.measurement.c6.O();
        b6VarO.x(i10);
        b6VarO.C(this.b);
        com.google.android.gms.internal.measurement.f7 f7Var = this.f25466c;
        if (f7Var != null) {
            b6VarO.A(f7Var);
        }
        com.google.android.gms.internal.measurement.e7 e7VarP = com.google.android.gms.internal.measurement.f7.P();
        e7VarP.A(re.Q(this.f25467d));
        e7VarP.x(re.Q(this.f25468e));
        Map map = this.f25469f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f25469f.keySet()) {
                int iIntValue = num.intValue();
                Long l10 = (Long) this.f25469f.get(num);
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.l6 l6VarK = com.google.android.gms.internal.measurement.m6.K();
                    l6VarK.x(iIntValue);
                    l6VarK.z(l10.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.m6) l6VarK.t());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            e7VarP.D(arrayList);
        }
        Map map2 = this.f25470g;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f25470g.keySet()) {
                com.google.android.gms.internal.measurement.g7 g7VarL = com.google.android.gms.internal.measurement.h7.L();
                g7VarL.x(num2.intValue());
                List list2 = (List) this.f25470g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    g7VarL.z(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.h7) g7VarL.t());
            }
            list = arrayList3;
        }
        e7VarP.G(list);
        b6VarO.z(e7VarP);
        return (com.google.android.gms.internal.measurement.c6) b6VarO.t();
    }

    public final /* synthetic */ BitSet c() {
        return this.f25467d;
    }

    public /* synthetic */ df(e eVar, String str, byte[] bArr) {
        Objects.requireNonNull(eVar);
        this.f25471h = eVar;
        this.f25465a = str;
        this.b = true;
        this.f25467d = new BitSet();
        this.f25468e = new BitSet();
        this.f25469f = new w1.a();
        this.f25470g = new w1.a();
    }
}
