package ke;

/* JADX INFO: loaded from: classes2.dex */
public final class r0<E> extends w<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f21413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r0<Object> f21414i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f21415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f21416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f21417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f21418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f21419g;

    static {
        Object[] objArr = new Object[0];
        f21413h = objArr;
        f21414i = new r0<>(objArr, 0, objArr, 0, 0);
    }

    public r0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f21415c = objArr;
        this.f21416d = i10;
        this.f21417e = objArr2;
        this.f21418f = i11;
        this.f21419g = i12;
    }

    @Override // ke.r
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.f21415c, 0, objArr, i10, this.f21419g);
        return i10 + this.f21419g;
    }

    @Override // ke.r
    public Object[] c() {
        return this.f21415c;
    }

    @Override // ke.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f21417e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = p.c(obj);
        while (true) {
            int i10 = iC & this.f21418f;
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

    @Override // ke.r
    public int d() {
        return this.f21419g;
    }

    @Override // ke.r
    public int e() {
        return 0;
    }

    @Override // ke.r
    public boolean f() {
        return false;
    }

    @Override // ke.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g */
    public y0<E> iterator() {
        return a().iterator();
    }

    @Override // ke.w, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f21416d;
    }

    @Override // ke.w
    public t<E> m() {
        return t.i(this.f21415c, this.f21419g);
    }

    @Override // ke.w
    public boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f21419g;
    }
}
