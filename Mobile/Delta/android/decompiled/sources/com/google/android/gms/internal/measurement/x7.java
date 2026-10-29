package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6897a = new HashMap();

    public final void a(String str, Callable callable) {
        this.f6897a.put(str, callable);
    }
}
