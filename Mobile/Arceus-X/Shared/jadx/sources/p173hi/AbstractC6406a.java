package p173hi;

/* JADX INFO: renamed from: hi.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6406a<T> implements InterfaceC6409d<T> {

    /* JADX INFO: renamed from: a */
    public int f24336a;

    /* JADX INFO: renamed from: b */
    public int f24337b;

    /* JADX INFO: renamed from: c */
    public int f24338c;

    /* JADX INFO: renamed from: d */
    public final float f24339d;

    public AbstractC6406a(int i10, int i11, float f10) {
        this.f24336a = i10;
        this.f24338c = i11;
        this.f24339d = f10;
    }

    @Override // p173hi.InterfaceC6409d
    /* JADX INFO: renamed from: a */
    public boolean mo27989a() {
        return this.f24337b < this.f24338c;
    }

    @Override // p173hi.InterfaceC6409d
    /* JADX INFO: renamed from: b */
    public int mo27990b() {
        return this.f24336a;
    }

    @Override // p173hi.InterfaceC6409d
    public void retry() {
        this.f24337b++;
        this.f24336a = (int) (this.f24336a * this.f24339d);
    }
}
