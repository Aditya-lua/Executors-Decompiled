package ee;

import java.util.Iterator;

/* JADX INFO: renamed from: ee.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C5099v extends AbstractC5095t {

    /* JADX INFO: renamed from: e */
    public static final Object[] f19914e;

    /* JADX INFO: renamed from: f */
    public static final C5099v f19915f;

    /* JADX INFO: renamed from: c */
    public final transient Object[] f19916c;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f19917d;

    static {
        Object[] objArr = new Object[0];
        f19914e = objArr;
        f19915f = new C5099v(objArr, 0, objArr, 0, 0);
    }

    public C5099v(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f19916c = objArr;
        this.f19917d = objArr2;
    }

    @Override // ee.AbstractC5087p
    /* JADX INFO: renamed from: a */
    public final int mo23826a(Object[] objArr, int i10) {
        System.arraycopy(this.f19916c, 0, objArr, 0, 0);
        return 0;
    }

    @Override // ee.AbstractC5087p
    /* JADX INFO: renamed from: b */
    public final int mo23827b() {
        return 0;
    }

    @Override // ee.AbstractC5087p
    /* JADX INFO: renamed from: c */
    public final int mo23828c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f19917d.length;
        return false;
    }

    @Override // ee.AbstractC5087p
    /* JADX INFO: renamed from: d */
    public final Object[] mo23829d() {
        return this.f19916c;
    }

    @Override // ee.AbstractC5095t
    /* JADX INFO: renamed from: f */
    public final AbstractC5093s mo23836f() {
        AbstractC5103x abstractC5103x = AbstractC5093s.f19908b;
        return C5097u.f19911d;
    }

    @Override // ee.AbstractC5095t
    /* JADX INFO: renamed from: h */
    public final boolean mo23837h() {
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m23835e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
