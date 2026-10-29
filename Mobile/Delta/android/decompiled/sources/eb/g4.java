package eb;

/* JADX INFO: loaded from: classes.dex */
public final class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f15270a;
    public final byte b;

    public g4(int i10) {
        this.f15270a = (byte) (i10 & 224);
        this.b = (byte) (i10 & 31);
    }

    public final byte a() {
        return this.b;
    }

    public final byte b() {
        return this.f15270a;
    }

    public final int c() {
        return (this.f15270a >> 5) & 7;
    }
}
