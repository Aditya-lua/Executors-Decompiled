package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.dd */
/* JADX INFO: loaded from: classes.dex */
public final class C2031dd extends C2107hd {
    public C2031dd() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.C2107hd
    /* JADX INFO: renamed from: a */
    public final void mo9920a() {
        if (!m10201b()) {
            for (int i10 = 0; i10 < m10202c(); i10++) {
                Map.Entry entryM10203d = m10203d(i10);
                if (((InterfaceC2356va) ((C2050ed) entryM10203d).m9947a()).zzd()) {
                    entryM10203d.setValue(Collections.unmodifiableList((List) entryM10203d.getValue()));
                }
            }
            for (Map.Entry entry : m10204e()) {
                if (((InterfaceC2356va) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo9920a();
    }
}
