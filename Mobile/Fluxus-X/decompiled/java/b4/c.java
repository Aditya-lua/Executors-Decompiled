package b4;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3638a;
    public ByteBuffer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f3641e = d.a();

    public int a(int i10) {
        return i10 + this.b.getInt(i10);
    }

    public int b(int i10) {
        if (i10 < this.f3640d) {
            return this.b.getShort(this.f3639c + i10);
        }
        return 0;
    }

    public void c(int i10, ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        if (byteBuffer == null) {
            this.f3638a = 0;
            this.f3639c = 0;
            this.f3640d = 0;
        } else {
            this.f3638a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f3639c = i11;
            this.f3640d = this.b.getShort(i11);
        }
    }

    public int d(int i10) {
        int i11 = i10 + this.f3638a;
        return i11 + this.b.getInt(i11) + 4;
    }

    public int e(int i10) {
        int i11 = i10 + this.f3638a;
        return this.b.getInt(i11 + this.b.getInt(i11));
    }
}
