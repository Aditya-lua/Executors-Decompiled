package com.google.android.material.datepicker;

import androidx.fragment.app.ComponentCallbacksC0929c;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.google.android.material.datepicker.m */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2801m<S> extends ComponentCallbacksC0929c {

    /* JADX INFO: renamed from: f0 */
    public final LinkedHashSet<AbstractC2800l<S>> f10159f0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b2 */
    public boolean mo12636b2(AbstractC2800l<S> abstractC2800l) {
        return this.f10159f0.add(abstractC2800l);
    }

    /* JADX INFO: renamed from: c2 */
    public void m12700c2() {
        this.f10159f0.clear();
    }
}
