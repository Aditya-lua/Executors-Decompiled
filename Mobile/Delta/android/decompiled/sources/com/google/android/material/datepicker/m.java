package com.google.android.material.datepicker;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m<S> extends androidx.fragment.app.c {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final LinkedHashSet<l<S>> f7916f0 = new LinkedHashSet<>();

    public boolean b2(l<S> lVar) {
        return this.f7916f0.add(lVar);
    }

    public void c2() {
        this.f7916f0.clear();
    }
}
