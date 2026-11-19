package pi;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29176a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f29178d;

    public a(int i10, int i11, float f10) {
        this.f29176a = i10;
        this.f29177c = i11;
        this.f29178d = f10;
    }

    @Override // pi.d
    public void b() {
        this.b++;
        this.f29176a = (int) (this.f29176a * this.f29178d);
    }

    @Override // pi.d
    public boolean c() {
        return this.b < this.f29177c;
    }

    @Override // pi.d
    public int d() {
        return this.f29176a;
    }
}
