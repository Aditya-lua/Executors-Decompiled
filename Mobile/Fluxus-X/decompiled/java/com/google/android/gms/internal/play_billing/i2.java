package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public interface i2<V> extends Future<V> {
    void b(Runnable runnable, Executor executor);
}
