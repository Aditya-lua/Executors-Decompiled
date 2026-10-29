package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.aa */
/* JADX INFO: loaded from: classes.dex */
public final class C1971aa extends AbstractC1990ba {

    /* JADX INFO: renamed from: a */
    public int f8094a;

    /* JADX INFO: renamed from: b */
    public final int f8095b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC2104ha f8096c;

    public C1971aa(AbstractC2104ha abstractC2104ha) {
        Objects.requireNonNull(abstractC2104ha);
        this.f8096c = abstractC2104ha;
        this.f8094a = 0;
        this.f8095b = abstractC2104ha.mo9871d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8094a < this.f8095b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2028da
    public final byte zza() {
        int i10 = this.f8094a;
        if (i10 >= this.f8095b) {
            throw new NoSuchElementException();
        }
        this.f8094a = i10 + 1;
        return this.f8096c.mo9870c(i10);
    }
}
