package b8;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y7.c f4038a;
    public final byte[] b;

    public h(@NonNull y7.c cVar, @NonNull byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f4038a = cVar;
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public y7.c b() {
        return this.f4038a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f4038a.equals(hVar.f4038a)) {
            return Arrays.equals(this.b, hVar.b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4038a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f4038a + ", bytes=[...]}";
    }
}
