package p212j8;

import p028b8.AbstractC1261i;
import p028b8.AbstractC1267o;

/* JADX INFO: renamed from: j8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7040b extends AbstractC7058k {

    /* JADX INFO: renamed from: a */
    public final long f27615a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1267o f27616b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1261i f27617c;

    public C7040b(long j10, AbstractC1267o abstractC1267o, AbstractC1261i abstractC1261i) {
        this.f27615a = j10;
        if (abstractC1267o == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f27616b = abstractC1267o;
        if (abstractC1261i == null) {
            throw new NullPointerException("Null event");
        }
        this.f27617c = abstractC1261i;
    }

    @Override // p212j8.AbstractC7058k
    /* JADX INFO: renamed from: b */
    public AbstractC1261i mo29746b() {
        return this.f27617c;
    }

    @Override // p212j8.AbstractC7058k
    /* JADX INFO: renamed from: c */
    public long mo29747c() {
        return this.f27615a;
    }

    @Override // p212j8.AbstractC7058k
    /* JADX INFO: renamed from: d */
    public AbstractC1267o mo29748d() {
        return this.f27616b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7058k) {
            AbstractC7058k abstractC7058k = (AbstractC7058k) obj;
            if (this.f27615a == abstractC7058k.mo29747c() && this.f27616b.equals(abstractC7058k.mo29748d()) && this.f27617c.equals(abstractC7058k.mo29746b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f27615a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f27616b.hashCode()) * 1000003) ^ this.f27617c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f27615a + ", transportContext=" + this.f27616b + ", event=" + this.f27617c + "}";
    }
}
