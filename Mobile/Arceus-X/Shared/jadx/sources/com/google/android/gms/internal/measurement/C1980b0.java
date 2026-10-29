package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1980b0 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC2147k f8110a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2332u4 f8111b;

    public C1980b0(AbstractC2147k abstractC2147k, C2332u4 c2332u4) {
        this.f8110a = abstractC2147k;
        this.f8111b = c2332u4;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC2255q interfaceC2255q = (InterfaceC2255q) obj;
        InterfaceC2255q interfaceC2255q2 = (InterfaceC2255q) obj2;
        if (interfaceC2255q instanceof C2345v) {
            return !(interfaceC2255q2 instanceof C2345v) ? 1 : 0;
        }
        if (interfaceC2255q2 instanceof C2345v) {
            return -1;
        }
        AbstractC2147k abstractC2147k = this.f8110a;
        return abstractC2147k == null ? interfaceC2255q.zzc().compareTo(interfaceC2255q2.zzc()) : (int) C2351v5.m10836i(abstractC2147k.mo9763h(this.f8111b, Arrays.asList(interfaceC2255q, interfaceC2255q2)).zzd().doubleValue());
    }
}
