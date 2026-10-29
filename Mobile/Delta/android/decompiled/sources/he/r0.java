package he;

/* JADX INFO: loaded from: classes2.dex */
public final class r0<E> extends w<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f19269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r0<Object> f19270i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f19271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f19272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f19273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f19274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f19275g;

    static {
        Object[] objArr = new Object[0];
        f19269h = objArr;
        f19270i = new r0<>(objArr, 0, objArr, 0, 0);
    }

    public r0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f19271c = objArr;
        this.f19272d = i10;
        this.f19273e = objArr2;
        this.f19274f = i11;
        this.f19275g = i12;
    }

    @Override // he.r
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.f19271c, 0, objArr, i10, this.f19275g);
        return i10 + this.f19275g;
    }

    @Override // he.r
    public Object[] c() {
        return this.f19271c;
    }

    @Override // he.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f19273e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = p.c(obj);
        while (true) {
            int i10 = iC & this.f19274f;
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

    @Override // he.r
    public int d() {
        return this.f19275g;
    }

    @Override // he.r
    public int e() {
        return 0;
    }

    @Override // he.r
    public boolean f() {
        return false;
    }

    @Override // he.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g */
    public y0<E> iterator() {
        return a().iterator();
    }

    @Override // he.w, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f19272d;
    }

    @Override // he.w
    public t<E> m() {
        return t.i(this.f19271c, this.f19275g);
    }

    @Override // he.w
    public boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f19275g;
    }
}
