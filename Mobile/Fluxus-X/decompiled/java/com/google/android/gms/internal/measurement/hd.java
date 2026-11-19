package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hd extends ld {
    public hd() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final void a() {
        if (!b()) {
            for (int i10 = 0; i10 < c(); i10++) {
                Map.Entry entryD = d(i10);
                if (((za) ((id) entryD).a()).zzd()) {
                    entryD.setValue(Collections.unmodifiableList((List) entryD.getValue()));
                }
            }
            for (Map.Entry entry : e()) {
                if (((za) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
