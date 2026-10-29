package p591z1;

/* JADX INFO: renamed from: z1.g */
/* JADX INFO: loaded from: classes.dex */
public class C13685g<T> implements InterfaceC13684f<T> {

    /* JADX INFO: renamed from: a */
    public final Object[] f48015a;

    /* JADX INFO: renamed from: b */
    public int f48016b;

    public C13685g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f48015a = new Object[i10];
    }

    @Override // p591z1.InterfaceC13684f
    /* JADX INFO: renamed from: a */
    public boolean mo49979a(T t8) {
        int i10 = this.f48016b;
        Object[] objArr = this.f48015a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = t8;
        this.f48016b = i10 + 1;
        return true;
    }

    @Override // p591z1.InterfaceC13684f
    /* JADX INFO: renamed from: b */
    public T mo49980b() {
        int i10 = this.f48016b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f48015a;
        T t8 = (T) objArr[i11];
        objArr[i11] = null;
        this.f48016b = i10 - 1;
        return t8;
    }

    @Override // p591z1.InterfaceC13684f
    /* JADX INFO: renamed from: c */
    public void mo49981c(T[] tArr, int i10) {
        if (i10 > tArr.length) {
            i10 = tArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            T t8 = tArr[i11];
            int i12 = this.f48016b;
            Object[] objArr = this.f48015a;
            if (i12 < objArr.length) {
                objArr[i12] = t8;
                this.f48016b = i12 + 1;
            }
        }
    }
}
