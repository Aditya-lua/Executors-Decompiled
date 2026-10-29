package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2166l0 extends AbstractC2381x {
    @Override // com.google.android.gms.internal.measurement.AbstractC2381x
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9574a(String str, C2332u4 c2332u4, List list) {
        if (str == null || str.isEmpty() || !c2332u4.m10779d(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC2255q interfaceC2255qM10783h = c2332u4.m10783h(str);
        if (interfaceC2255qM10783h instanceof AbstractC2147k) {
            return ((AbstractC2147k) interfaceC2255qM10783h).mo9763h(c2332u4, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
