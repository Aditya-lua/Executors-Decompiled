package ie;

/* JADX INFO: renamed from: ie.r0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6793r0<E> extends AbstractC6802w<E> {

    /* JADX INFO: renamed from: h */
    public static final Object[] f26700h;

    /* JADX INFO: renamed from: i */
    public static final C6793r0<Object> f26701i;

    /* JADX INFO: renamed from: c */
    public final transient Object[] f26702c;

    /* JADX INFO: renamed from: d */
    public final transient int f26703d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f26704e;

    /* JADX INFO: renamed from: f */
    public final transient int f26705f;

    /* JADX INFO: renamed from: g */
    public final transient int f26706g;

    static {
        Object[] objArr = new Object[0];
        f26700h = objArr;
        f26701i = new C6793r0<>(objArr, 0, objArr, 0, 0);
    }

    public C6793r0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f26702c = objArr;
        this.f26703d = i10;
        this.f26704e = objArr2;
        this.f26705f = i11;
        this.f26706g = i12;
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: b */
    public int mo29031b(Object[] objArr, int i10) {
        System.arraycopy(this.f26702c, 0, objArr, i10, this.f26706g);
        return i10 + this.f26706g;
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: c */
    public Object[] mo29032c() {
        return this.f26702c;
    }

    @Override // ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f26704e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iM29030c = C6788p.m29030c(obj);
        while (true) {
            int i10 = iM29030c & this.f26705f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iM29030c = i10 + 1;
        }
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: d */
    public int mo29033d() {
        return this.f26706g;
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: e */
    public int mo29034e() {
        return 0;
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: f */
    public boolean mo29035f() {
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g */
    public AbstractC6807y0<E> iterator() {
        return mo29064a().iterator();
    }

    @Override // ie.AbstractC6802w, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f26703d;
    }

    @Override // ie.AbstractC6802w
    /* JADX INFO: renamed from: m */
    public AbstractC6796t<E> mo29062m() {
        return AbstractC6796t.m29090i(this.f26702c, this.f26706g);
    }

    @Override // ie.AbstractC6802w
    /* JADX INFO: renamed from: p */
    public boolean mo29072p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f26706g;
    }
}
