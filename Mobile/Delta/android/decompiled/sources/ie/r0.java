package ie;

/* JADX INFO: loaded from: classes2.dex */
public final class r0<E> extends w<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f21091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r0<Object> f21092i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f21093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f21094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f21095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f21096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f21097g;

    static {
        Object[] objArr = new Object[0];
        f21091h = objArr;
        f21092i = new r0<>(objArr, 0, objArr, 0, 0);
    }

    public r0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f21093c = objArr;
        this.f21094d = i10;
        this.f21095e = objArr2;
        this.f21096f = i11;
        this.f21097g = i12;
    }

    @Override // ie.r
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.f21093c, 0, objArr, i10, this.f21097g);
        return i10 + this.f21097g;
    }

    @Override // ie.r
    public Object[] c() {
        return this.f21093c;
    }

    @Override // ie.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f21095e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = p.c(obj);
        while (true) {
            int i10 = iC & this.f21096f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i10 + 1;
        }
    }

    @Override // ie.r
    public int d() {
        return this.f21097g;
    }

    @Override // ie.r
    public int e() {
        return 0;
    }

    @Override // ie.r
    public boolean f() {
        return false;
    }

    @Override // ie.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g */
    public y0<E> iterator() {
        return a().iterator();
    }

    @Override // ie.w, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f21094d;
    }

    @Override // ie.w
    public t<E> m() {
        return t.i(this.f21093c, this.f21097g);
    }

    @Override // ie.w
    public boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f21097g;
    }
}
