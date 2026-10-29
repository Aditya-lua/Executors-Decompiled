package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2544j6 extends C2610p6 {
    public C2544j6() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.C2610p6
    /* JADX INFO: renamed from: a */
    public final void mo11509a() {
        if (!m11658k()) {
            for (int i10 = 0; i10 < m11654c(); i10++) {
                Map.Entry entryM11657g = m11657g(i10);
                if (((InterfaceC2542j4) ((C2555k6) entryM11657g).m11531a()).zze()) {
                    entryM11657g.setValue(Collections.unmodifiableList((List) entryM11657g.getValue()));
                }
            }
            for (Map.Entry entry : m11655d()) {
                if (((InterfaceC2542j4) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo11509a();
    }
}
