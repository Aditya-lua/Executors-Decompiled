package eb;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d3 extends f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15260a = 0;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f15261c;

    public d3(m3 m3Var) {
        this.f15261c = m3Var;
        this.b = m3Var.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15260a < this.b;
    }

    @Override // eb.h3
    public final byte zza() {
        int i10 = this.f15260a;
        if (i10 >= this.b) {
            throw new NoSuchElementException();
        }
        this.f15260a = i10 + 1;
        return this.f15261c.c(i10);
    }
}
