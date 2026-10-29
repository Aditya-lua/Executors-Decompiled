package p306nb;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.C1986b6;
import com.google.android.gms.internal.measurement.C2005c6;
import com.google.android.gms.internal.measurement.C2044e7;
import com.google.android.gms.internal.measurement.C2063f7;
import com.google.android.gms.internal.measurement.C2082g7;
import com.google.android.gms.internal.measurement.C2101h7;
import com.google.android.gms.internal.measurement.C2172l6;
import com.google.android.gms.internal.measurement.C2190m6;
import com.google.android.gms.internal.measurement.C2414ye;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p504w1.C12277a;

/* JADX INFO: renamed from: nb.df */
/* JADX INFO: loaded from: classes.dex */
public final class C9052df {

    /* JADX INFO: renamed from: a */
    public String f32862a;

    /* JADX INFO: renamed from: b */
    public boolean f32863b;

    /* JADX INFO: renamed from: c */
    public C2063f7 f32864c;

    /* JADX INFO: renamed from: d */
    public BitSet f32865d;

    /* JADX INFO: renamed from: e */
    public BitSet f32866e;

    /* JADX INFO: renamed from: f */
    public Map f32867f;

    /* JADX INFO: renamed from: g */
    public Map f32868g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C9053e f32869h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C9052df(C9053e c9053e, String str, C2063f7 c2063f7, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(c9053e);
        this.f32869h = c9053e;
        this.f32862a = str;
        this.f32865d = bitSet;
        this.f32866e = bitSet2;
        this.f32867f = map;
        this.f32868g = new C12277a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f32868g.put(num, arrayList);
        }
        this.f32863b = false;
        this.f32864c = c2063f7;
    }

    /* JADX INFO: renamed from: a */
    public final void m36281a(@NonNull AbstractC9019c abstractC9019c) {
        int iMo36113a = abstractC9019c.mo36113a();
        if (abstractC9019c.f32741c != null) {
            this.f32866e.set(iMo36113a, true);
        }
        Boolean bool = abstractC9019c.f32742d;
        if (bool != null) {
            this.f32865d.set(iMo36113a, bool.booleanValue());
        }
        if (abstractC9019c.f32743e != null) {
            Map map = this.f32867f;
            Integer numValueOf = Integer.valueOf(iMo36113a);
            Long l10 = (Long) map.get(numValueOf);
            long jLongValue = abstractC9019c.f32743e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                this.f32867f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (abstractC9019c.f32744f != null) {
            Map map2 = this.f32868g;
            Integer numValueOf2 = Integer.valueOf(iMo36113a);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f32868g.put(numValueOf2, arrayList);
            }
            if (abstractC9019c.mo36114b()) {
                arrayList.clear();
            }
            C2414ye.m11027a();
            C9094g7 c9094g7 = this.f32869h.f33067a;
            C9150k c9150kM36338w = c9094g7.m36338w();
            String str = this.f32862a;
            C9379y4 c9379y4 = C9395z4.f33718G0;
            if (c9150kM36338w.m36406H(str, c9379y4) && abstractC9019c.mo36115c()) {
                arrayList.clear();
            }
            C2414ye.m11027a();
            if (!c9094g7.m36338w().m36406H(this.f32862a, c9379y4)) {
                arrayList.add(Long.valueOf(abstractC9019c.f32744f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(abstractC9019c.f32744f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public final C2005c6 m36282b(int i10) {
        ArrayList arrayList;
        List list;
        C1986b6 c1986b6M9846O = C2005c6.m9846O();
        c1986b6M9846O.m9788x(i10);
        c1986b6M9846O.m9787C(this.f32863b);
        C2063f7 c2063f7 = this.f32864c;
        if (c2063f7 != null) {
            c1986b6M9846O.m9786A(c2063f7);
        }
        C2044e7 c2044e7M9988P = C2063f7.m9988P();
        c2044e7M9988P.m9937A(C9277re.m36736Q(this.f32865d));
        c2044e7M9988P.m9943x(C9277re.m36736Q(this.f32866e));
        Map map = this.f32867f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f32867f.keySet()) {
                int iIntValue = num.intValue();
                Long l10 = (Long) this.f32867f.get(num);
                if (l10 != null) {
                    C2172l6 c2172l6M10371K = C2190m6.m10371K();
                    c2172l6M10371K.m10359x(iIntValue);
                    c2172l6M10371K.m10360z(l10.longValue());
                    arrayList2.add((C2190m6) c2172l6M10371K.m9882t());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            c2044e7M9988P.m9939D(arrayList);
        }
        Map map2 = this.f32868g;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f32868g.keySet()) {
                C2082g7 c2082g7M10176M = C2101h7.m10176M();
                c2082g7M10176M.m10043x(num2.intValue());
                List list2 = (List) this.f32868g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    c2082g7M10176M.m10044z(list2);
                }
                arrayList3.add((C2101h7) c2082g7M10176M.m9882t());
            }
            list = arrayList3;
        }
        c2044e7M9988P.m9941G(list);
        c1986b6M9846O.m9789z(c2044e7M9988P);
        return (C2005c6) c1986b6M9846O.m9882t();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BitSet m36283c() {
        return this.f32865d;
    }

    public /* synthetic */ C9052df(C9053e c9053e, String str, byte[] bArr) {
        Objects.requireNonNull(c9053e);
        this.f32869h = c9053e;
        this.f32862a = str;
        this.f32863b = true;
        this.f32865d = new BitSet();
        this.f32866e = new BitSet();
        this.f32867f = new C12277a();
        this.f32868g = new C12277a();
    }
}
