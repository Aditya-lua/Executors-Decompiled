package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class aa extends ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6374a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ha f6375c;

    public aa(ha haVar) {
        Objects.requireNonNull(haVar);
        this.f6375c = haVar;
        this.f6374a = 0;
        this.b = haVar.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6374a < this.b;
    }

    @Override // com.google.android.gms.internal.measurement.da
    public final byte zza() {
        int i10 = this.f6374a;
        if (i10 >= this.b) {
            throw new NoSuchElementException();
        }
        this.f6374a = i10 + 1;
        return this.f6375c.c(i10);
    }
}
