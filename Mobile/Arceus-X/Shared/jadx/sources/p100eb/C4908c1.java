package p100eb;

import java.util.List;

/* JADX INFO: renamed from: eb.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4908c1 extends AbstractC4920e1 {

    /* JADX INFO: renamed from: c */
    public final transient AbstractC4920e1 f19633c;

    public C4908c1(AbstractC4920e1 abstractC4920e1) {
        this.f19633c = abstractC4920e1;
    }

    @Override // p100eb.AbstractC4920e1, p100eb.AbstractC5044z0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f19633c.contains(obj);
    }

    @Override // p100eb.AbstractC4920e1
    /* JADX INFO: renamed from: f */
    public final AbstractC4920e1 mo23560f() {
        return this.f19633c;
    }

    @Override // p100eb.AbstractC4920e1
    /* JADX INFO: renamed from: g */
    public final AbstractC4920e1 subList(int i10, int i11) {
        C4973n0.m23681e(i10, i11, this.f19633c.size());
        AbstractC4920e1 abstractC4920e1 = this.f19633c;
        return abstractC4920e1.subList(abstractC4920e1.size() - i11, this.f19633c.size() - i10).mo23560f();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C4973n0.m23677a(i10, this.f19633c.size(), "index");
        return this.f19633c.get(m23562m(i10));
    }

    @Override // p100eb.AbstractC4920e1, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f19633c.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return m23562m(iLastIndexOf);
        }
        return -1;
    }

    @Override // p100eb.AbstractC4920e1, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f19633c.indexOf(obj);
        if (iIndexOf >= 0) {
            return m23562m(iIndexOf);
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public final int m23562m(int i10) {
        return (this.f19633c.size() - 1) - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19633c.size();
    }

    @Override // p100eb.AbstractC4920e1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
