package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2237p extends AbstractC2147k implements InterfaceC2183m {

    /* JADX INFO: renamed from: c */
    public final List f8550c;

    /* JADX INFO: renamed from: d */
    public final List f8551d;

    /* JADX INFO: renamed from: e */
    public C2332u4 f8552e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2237p(C2237p c2237p) {
        super(c2237p.f8356a);
        ArrayList arrayList = new ArrayList(c2237p.f8550c.size());
        this.f8550c = arrayList;
        arrayList.addAll(c2237p.f8550c);
        ArrayList arrayList2 = new ArrayList(c2237p.f8551d.size());
        this.f8551d = arrayList2;
        arrayList2.addAll(c2237p.f8551d);
        this.f8552e = c2237p.f8552e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2147k, com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9950a() {
        return new C2237p(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2147k
    /* JADX INFO: renamed from: h */
    public final InterfaceC2255q mo9763h(C2332u4 c2332u4, List list) {
        C2332u4 c2332u4M10778c = this.f8552e.m10778c();
        int i10 = 0;
        while (true) {
            List list2 = this.f8550c;
            if (i10 >= list2.size()) {
                break;
            }
            if (i10 < list.size()) {
                c2332u4M10778c.m10781f((String) list2.get(i10), c2332u4.m10776a((InterfaceC2255q) list.get(i10)));
            } else {
                c2332u4M10778c.m10781f((String) list2.get(i10), InterfaceC2255q.f8587zo);
            }
            i10++;
        }
        for (InterfaceC2255q interfaceC2255q : this.f8551d) {
            InterfaceC2255q interfaceC2255qM10776a = c2332u4M10778c.m10776a(interfaceC2255q);
            if (interfaceC2255qM10776a instanceof C2273r) {
                interfaceC2255qM10776a = c2332u4M10778c.m10776a(interfaceC2255q);
            }
            if (interfaceC2255qM10776a instanceof C2093h) {
                return ((C2093h) interfaceC2255qM10776a).m10154b();
            }
        }
        return InterfaceC2255q.f8587zo;
    }

    public C2237p(String str, List list, List list2, C2332u4 c2332u4) {
        super(str);
        this.f8550c = new ArrayList();
        this.f8552e = c2332u4;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f8550c.add(((InterfaceC2255q) it.next()).zzc());
            }
        }
        this.f8551d = new ArrayList(list2);
    }
}
