package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j6 extends p6 {
    public j6() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.p6
    public final void a() {
        if (!k()) {
            for (int i10 = 0; i10 < c(); i10++) {
                Map.Entry entryG = g(i10);
                if (((j4) ((k6) entryG).a()).zze()) {
                    entryG.setValue(Collections.unmodifiableList((List) entryG.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((j4) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
