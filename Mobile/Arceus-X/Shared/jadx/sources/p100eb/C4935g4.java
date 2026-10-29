package p100eb;

/* JADX INFO: renamed from: eb.g4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4935g4 {

    /* JADX INFO: renamed from: a */
    public final byte f19653a;

    /* JADX INFO: renamed from: b */
    public final byte f19654b;

    public C4935g4(int i10) {
        this.f19653a = (byte) (i10 & 224);
        this.f19654b = (byte) (i10 & 31);
    }

    /* JADX INFO: renamed from: a */
    public final byte m23603a() {
        return this.f19654b;
    }

    /* JADX INFO: renamed from: b */
    public final byte m23604b() {
        return this.f19653a;
    }

    /* JADX INFO: renamed from: c */
    public final int m23605c() {
        return (this.f19653a >> 5) & 7;
    }
}
