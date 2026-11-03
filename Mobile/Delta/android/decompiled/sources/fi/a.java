package fi;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17290a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f17292d;

    public a(int i10, int i11, float f10) {
        this.f17290a = i10;
        this.f17291c = i11;
        this.f17292d = f10;
    }

    @Override // fi.d
    public boolean a() {
        return this.b < this.f17291c;
    }

    @Override // fi.d
    public int b() {
        return this.f17290a;
    }

    @Override // fi.d
    public void retry() {
        this.b++;
        this.f17290a = (int) (this.f17290a * this.f17292d);
    }
}
