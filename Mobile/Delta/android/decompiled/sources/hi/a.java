package hi;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19316a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f19318d;

    public a(int i10, int i11, float f10) {
        this.f19316a = i10;
        this.f19317c = i11;
        this.f19318d = f10;
    }

    @Override // hi.d
    public boolean a() {
        return this.b < this.f19317c;
    }

    @Override // hi.d
    public int b() {
        return this.f19316a;
    }

    @Override // hi.d
    public void retry() {
        this.b++;
        this.f19316a = (int) (this.f19316a * this.f19318d);
    }
}
