package p100eb;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: eb.d3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4916d3 extends AbstractC4928f3 {

    /* JADX INFO: renamed from: a */
    public int f19639a = 0;

    /* JADX INFO: renamed from: b */
    public final int f19640b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC4970m3 f19641c;

    public C4916d3(AbstractC4970m3 abstractC4970m3) {
        this.f19641c = abstractC4970m3;
        this.f19640b = abstractC4970m3.mo23600d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19639a < this.f19640b;
    }

    @Override // p100eb.InterfaceC4940h3
    public final byte zza() {
        int i10 = this.f19639a;
        if (i10 >= this.f19640b) {
            throw new NoSuchElementException();
        }
        this.f19639a = i10 + 1;
        return this.f19641c.mo23599c(i10);
    }
}
