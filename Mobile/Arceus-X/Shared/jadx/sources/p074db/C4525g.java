package p074db;

import java.util.List;

/* JADX INFO: renamed from: db.g */
/* JADX INFO: loaded from: classes.dex */
public final class C4525g extends AbstractC4527i {

    /* JADX INFO: renamed from: c */
    public final transient AbstractC4527i f18573c;

    public C4525g(AbstractC4527i abstractC4527i) {
        this.f18573c = abstractC4527i;
    }

    @Override // p074db.AbstractC4527i, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f18573c.contains(obj);
    }

    @Override // p074db.AbstractC4527i
    /* JADX INFO: renamed from: e */
    public final AbstractC4527i mo22491e() {
        return this.f18573c;
    }

    @Override // p074db.AbstractC4527i
    /* JADX INFO: renamed from: f */
    public final AbstractC4527i subList(int i10, int i11) {
        AbstractC4527i abstractC4527i = this.f18573c;
        C4537s.m22512d(i10, i11, abstractC4527i.size());
        return abstractC4527i.subList(abstractC4527i.size() - i11, abstractC4527i.size() - i10).mo22491e();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC4527i abstractC4527i = this.f18573c;
        C4537s.m22510b(i10, abstractC4527i.size(), "index");
        return abstractC4527i.get(m22493p(i10));
    }

    @Override // p074db.AbstractC4527i, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f18573c.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return m22493p(iLastIndexOf);
        }
        return -1;
    }

    @Override // p074db.AbstractC4527i, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f18573c.indexOf(obj);
        if (iIndexOf >= 0) {
            return m22493p(iIndexOf);
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public final int m22493p(int i10) {
        return (this.f18573c.size() - 1) - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18573c.size();
    }

    @Override // p074db.AbstractC4527i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
