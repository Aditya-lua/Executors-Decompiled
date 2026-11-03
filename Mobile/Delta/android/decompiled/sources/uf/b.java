package uf;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f32774a = 0;

    public long a() {
        return this.f32774a;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f32774a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f32774a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f32774a += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
