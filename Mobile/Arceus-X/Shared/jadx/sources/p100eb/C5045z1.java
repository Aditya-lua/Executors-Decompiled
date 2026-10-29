package p100eb;

import java.util.Iterator;

/* JADX INFO: renamed from: eb.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5045z1 extends AbstractC4938h1 {

    /* JADX INFO: renamed from: c */
    public final transient Object f19845c;

    public C5045z1(Object obj) {
        obj.getClass();
        this.f19845c = obj;
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: a */
    public final int mo23574a(Object[] objArr, int i10) {
        objArr[0] = this.f19845c;
        return 1;
    }

    @Override // p100eb.AbstractC5044z0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f19845c.equals(obj);
    }

    @Override // p100eb.AbstractC4938h1, p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: d */
    public final AbstractC4909c2 mo23575d() {
        return new C4974n1(this.f19845c);
    }

    @Override // p100eb.AbstractC4938h1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f19845c.hashCode();
    }

    @Override // p100eb.AbstractC4938h1
    /* JADX INFO: renamed from: i */
    public final AbstractC4920e1 mo23611i() {
        return AbstractC4920e1.m23573k(this.f19845c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C4974n1(this.f19845c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f19845c.toString() + "]";
    }
}
