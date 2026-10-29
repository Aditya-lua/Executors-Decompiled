package p466uf;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: renamed from: uf.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C11846b extends OutputStream {

    /* JADX INFO: renamed from: a */
    public long f41608a = 0;

    /* JADX INFO: renamed from: a */
    public long m44247a() {
        return this.f41608a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f41608a++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f41608a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f41608a += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
