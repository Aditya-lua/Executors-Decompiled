package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j3 extends k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7110a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s3 f7111c;

    public j3(s3 s3Var) {
        Objects.requireNonNull(s3Var);
        this.f7111c = s3Var;
        this.f7110a = 0;
        this.b = s3Var.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7110a < this.b;
    }

    @Override // com.google.android.gms.internal.play_billing.n3
    public final byte zza() {
        int i10 = this.f7110a;
        if (i10 >= this.b) {
            throw new NoSuchElementException();
        }
        this.f7110a = i10 + 1;
        return this.f7111c.b(i10);
    }
}
