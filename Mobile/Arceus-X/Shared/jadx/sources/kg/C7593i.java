package kg;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: kg.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C7593i extends AbstractC7596l implements Iterable<AbstractC7596l> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<AbstractC7596l> f29111a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7593i() {
        this.f29111a = new ArrayList<>();
    }

    /* JADX INFO: renamed from: A */
    public AbstractC7596l m31442A(int i10) {
        return this.f29111a.get(i10);
    }

    /* JADX INFO: renamed from: B */
    public final AbstractC7596l m31443B() {
        int size = this.f29111a.size();
        if (size == 1) {
            return this.f29111a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: b */
    public boolean mo31445b() {
        return m31443B().mo31445b();
    }

    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: c */
    public double mo31446c() {
        return m31443B().mo31446c();
    }

    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: d */
    public float mo31447d() {
        return m31443B().mo31447d();
    }

    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: e */
    public int mo31448e() {
        return m31443B().mo31448e();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C7593i) && ((C7593i) obj).f29111a.equals(this.f29111a);
        }
        return true;
    }

    public int hashCode() {
        return this.f29111a.hashCode();
    }

    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: i */
    public long mo31449i() {
        return m31443B().mo31449i();
    }

    public boolean isEmpty() {
        return this.f29111a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC7596l> iterator() {
        return this.f29111a.iterator();
    }

    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: k */
    public Number mo31450k() {
        return m31443B().mo31450k();
    }

    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: l */
    public String mo31451l() {
        return m31443B().mo31451l();
    }

    public int size() {
        return this.f29111a.size();
    }

    /* JADX INFO: renamed from: x */
    public void m31452x(String str) {
        this.f29111a.add(str == null ? C7598n.f29112a : new C7602r(str));
    }

    /* JADX INFO: renamed from: y */
    public void m31453y(AbstractC7596l abstractC7596l) {
        if (abstractC7596l == null) {
            abstractC7596l = C7598n.f29112a;
        }
        this.f29111a.add(abstractC7596l);
    }

    /* JADX DEBUG: Method merged with bridge method: a()Lkg/l; */
    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public C7593i mo31444a() {
        if (this.f29111a.isEmpty()) {
            return new C7593i();
        }
        C7593i c7593i = new C7593i(this.f29111a.size());
        ArrayList<AbstractC7596l> arrayList = this.f29111a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            AbstractC7596l abstractC7596l = arrayList.get(i10);
            i10++;
            c7593i.m31453y(abstractC7596l.mo31444a());
        }
        return c7593i;
    }

    public C7593i(int i10) {
        this.f29111a = new ArrayList<>(i10);
    }
}
