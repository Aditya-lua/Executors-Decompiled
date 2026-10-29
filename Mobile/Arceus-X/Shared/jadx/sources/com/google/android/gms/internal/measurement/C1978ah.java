package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ah */
/* JADX INFO: loaded from: classes.dex */
public final class C1978ah extends AbstractC2147k {

    /* JADX INFO: renamed from: c */
    public final boolean f8103c;

    /* JADX INFO: renamed from: d */
    public final boolean f8104d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1997bh f8105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1978ah(C1997bh c1997bh, boolean z10, boolean z11) {
        super("log");
        Objects.requireNonNull(c1997bh);
        this.f8105e = c1997bh;
        this.f8103c = z10;
        this.f8104d = z11;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f A[LOOP:0: B:23:0x0085->B:25:0x008f, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.AbstractC2147k
    /* JADX INFO: renamed from: h */
    public final InterfaceC2255q mo9763h(C2332u4 c2332u4, List list) {
        int i10;
        int i11;
        String strZzc;
        ArrayList arrayList;
        C2351v5.m10829b("log", 1, list);
        if (list.size() == 1) {
            C1997bh c1997bh = this.f8105e;
            c1997bh.m9831j().mo10153a(3, c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzc(), Collections.EMPTY_LIST, this.f8103c, this.f8104d);
            return InterfaceC2255q.f8587zo;
        }
        int iM10834g = C2351v5.m10834g(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue());
        if (iM10834g != 2) {
            i10 = 3;
            if (iM10834g == 3) {
                i11 = 1;
            } else if (iM10834g == 5) {
                i11 = 5;
            } else if (iM10834g == 6) {
                i11 = 2;
            }
            strZzc = c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzc();
            if (list.size() == 2) {
                C1997bh c1997bh2 = this.f8105e;
                c1997bh2.m9831j().mo10153a(i11, strZzc, Collections.EMPTY_LIST, this.f8103c, this.f8104d);
                return InterfaceC2255q.f8587zo;
            }
            arrayList = new ArrayList();
            for (int i12 = 2; i12 < Math.min(list.size(), 5); i12++) {
                arrayList.add(c2332u4.m10776a((InterfaceC2255q) list.get(i12)).zzc());
            }
            this.f8105e.m9831j().mo10153a(i11, strZzc, arrayList, this.f8103c, this.f8104d);
            return InterfaceC2255q.f8587zo;
        }
        i10 = 4;
        i11 = i10;
        strZzc = c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzc();
        if (list.size() == 2) {
            C1997bh c1997bh3 = this.f8105e;
            c1997bh3.m9831j().mo10153a(i11, strZzc, Collections.EMPTY_LIST, this.f8103c, this.f8104d);
            return InterfaceC2255q.f8587zo;
        }
        arrayList = new ArrayList();
        while (i12 < Math.min(list.size(), 5)) {
            arrayList.add(c2332u4.m10776a((InterfaceC2255q) list.get(i12)).zzc());
        }
        this.f8105e.m9831j().mo10153a(i11, strZzc, arrayList, this.f8103c, this.f8104d);
        return InterfaceC2255q.f8587zo;
    }
}
