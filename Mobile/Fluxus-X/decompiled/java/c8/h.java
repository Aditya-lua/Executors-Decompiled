package c8;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7.c f4921a;
    public final byte[] b;

    public h(@NonNull z7.c cVar, @NonNull byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f4921a = cVar;
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public z7.c b() {
        return this.f4921a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f4921a.equals(hVar.f4921a)) {
            return Arrays.equals(this.b, hVar.b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4921a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f4921a + ", bytes=[...]}";
    }
}
