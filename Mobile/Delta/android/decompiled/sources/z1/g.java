package z1;

/* JADX INFO: loaded from: classes.dex */
public class g<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f37086a;
    public int b;

    public g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f37086a = new Object[i10];
    }

    @Override // z1.f
    public boolean a(T t8) {
        int i10 = this.b;
        Object[] objArr = this.f37086a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = t8;
        this.b = i10 + 1;
        return true;
    }

    @Override // z1.f
    public T b() {
        int i10 = this.b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f37086a;
        T t8 = (T) objArr[i11];
        objArr[i11] = null;
        this.b = i10 - 1;
        return t8;
    }

    @Override // z1.f
    public void c(T[] tArr, int i10) {
        if (i10 > tArr.length) {
            i10 = tArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            T t8 = tArr[i11];
            int i12 = this.b;
            Object[] objArr = this.f37086a;
            if (i12 < objArr.length) {
                objArr[i12] = t8;
                this.b = i12 + 1;
            }
        }
    }
}
