package p100eb;

import java.util.Iterator;

/* JADX INFO: renamed from: eb.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5016u1 extends AbstractC4938h1 {

    /* JADX INFO: renamed from: h */
    public static final Object[] f19815h;

    /* JADX INFO: renamed from: i */
    public static final C5016u1 f19816i;

    /* JADX INFO: renamed from: c */
    public final transient Object[] f19817c;

    /* JADX INFO: renamed from: d */
    public final transient int f19818d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f19819e;

    /* JADX INFO: renamed from: f */
    public final transient int f19820f;

    /* JADX INFO: renamed from: g */
    public final transient int f19821g;

    static {
        Object[] objArr = new Object[0];
        f19815h = objArr;
        f19816i = new C5016u1(objArr, 0, objArr, 0, 0);
    }

    public C5016u1(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f19817c = objArr;
        this.f19818d = i10;
        this.f19819e = objArr2;
        this.f19820f = i11;
        this.f19821g = i12;
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: a */
    public final int mo23574a(Object[] objArr, int i10) {
        System.arraycopy(this.f19817c, 0, objArr, 0, this.f19821g);
        return this.f19821g;
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: b */
    public final int mo23564b() {
        return this.f19821g;
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: c */
    public final int mo23565c() {
        return 0;
    }

    @Override // p100eb.AbstractC5044z0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f19819e;
            if (objArr.length != 0) {
                int iM23724a = C5039y0.m23724a(obj.hashCode());
                while (true) {
                    int i10 = iM23724a & this.f19820f;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM23724a = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // p100eb.AbstractC4938h1, p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: d */
    public final AbstractC4909c2 mo23575d() {
        return mo23611i().listIterator(0);
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: e */
    public final Object[] mo23566e() {
        return this.f19817c;
    }

    @Override // p100eb.AbstractC4938h1
    /* JADX INFO: renamed from: g */
    public final boolean mo23596g() {
        return true;
    }

    @Override // p100eb.AbstractC4938h1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f19818d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo23611i().listIterator(0);
    }

    @Override // p100eb.AbstractC4938h1
    /* JADX INFO: renamed from: k */
    public final AbstractC4920e1 mo23612k() {
        return AbstractC4920e1.m23571h(this.f19817c, this.f19821g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19821g;
    }
}
