package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ea extends fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6490a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ la f6491c;

    public ea(la laVar) {
        Objects.requireNonNull(laVar);
        this.f6491c = laVar;
        this.f6490a = 0;
        this.b = laVar.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6490a < this.b;
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final byte zza() {
        int i10 = this.f6490a;
        if (i10 >= this.b) {
            throw new NoSuchElementException();
        }
        this.f6490a = i10 + 1;
        return this.f6491c.c(i10);
    }
}
