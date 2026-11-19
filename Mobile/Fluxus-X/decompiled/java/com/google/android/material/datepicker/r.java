package com.google.android.material.datepicker;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r<S> extends f4.q {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final LinkedHashSet<q<S>> f7834f0 = new LinkedHashSet<>();

    public boolean b2(q<S> qVar) {
        return this.f7834f0.add(qVar);
    }

    public void c2() {
        this.f7834f0.clear();
    }
}
