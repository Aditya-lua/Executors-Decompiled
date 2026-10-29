package p005a4;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: a4.c */
/* JADX INFO: loaded from: classes.dex */
public class C0068c {

    /* JADX INFO: renamed from: a */
    public int f140a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f141b;

    /* JADX INFO: renamed from: c */
    public int f142c;

    /* JADX INFO: renamed from: d */
    public int f143d;

    /* JADX INFO: renamed from: e */
    public AbstractC0069d f144e = AbstractC0069d.m172a();

    /* JADX INFO: renamed from: a */
    public int m167a(int i10) {
        return i10 + this.f141b.getInt(i10);
    }

    /* JADX INFO: renamed from: b */
    public int m168b(int i10) {
        if (i10 < this.f143d) {
            return this.f141b.getShort(this.f142c + i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public void m169c(int i10, ByteBuffer byteBuffer) {
        this.f141b = byteBuffer;
        if (byteBuffer == null) {
            this.f140a = 0;
            this.f142c = 0;
            this.f143d = 0;
        } else {
            this.f140a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f142c = i11;
            this.f143d = this.f141b.getShort(i11);
        }
    }

    /* JADX INFO: renamed from: d */
    public int m170d(int i10) {
        int i11 = i10 + this.f140a;
        return i11 + this.f141b.getInt(i11) + 4;
    }

    /* JADX INFO: renamed from: e */
    public int m171e(int i10) {
        int i11 = i10 + this.f140a;
        return this.f141b.getInt(i11 + this.f141b.getInt(i11));
    }
}
