package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2541j3 extends AbstractC2552k3 {

    /* JADX INFO: renamed from: a */
    public int f9052a;

    /* JADX INFO: renamed from: b */
    public final int f9053b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC2640s3 f9054c;

    public C2541j3(AbstractC2640s3 abstractC2640s3) {
        Objects.requireNonNull(abstractC2640s3);
        this.f9054c = abstractC2640s3;
        this.f9052a = 0;
        this.f9053b = abstractC2640s3.mo11587d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9052a < this.f9053b;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2585n3
    public final byte zza() {
        int i10 = this.f9052a;
        if (i10 >= this.f9053b) {
            throw new NoSuchElementException();
        }
        this.f9052a = i10 + 1;
        return this.f9054c.mo11585b(i10);
    }
}
