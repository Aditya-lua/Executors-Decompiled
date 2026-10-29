package p028b8;

import androidx.annotation.NonNull;
import java.util.Arrays;
import p569y7.C13116c;

/* JADX INFO: renamed from: b8.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1260h {

    /* JADX INFO: renamed from: a */
    public final C13116c f5277a;

    /* JADX INFO: renamed from: b */
    public final byte[] f5278b;

    public C1260h(@NonNull C13116c c13116c, @NonNull byte[] bArr) {
        if (c13116c == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f5277a = c13116c;
        this.f5278b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m7020a() {
        return this.f5278b;
    }

    /* JADX INFO: renamed from: b */
    public C13116c m7021b() {
        return this.f5277a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1260h)) {
            return false;
        }
        C1260h c1260h = (C1260h) obj;
        if (this.f5277a.equals(c1260h.f5277a)) {
            return Arrays.equals(this.f5278b, c1260h.f5278b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5277a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5278b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f5277a + ", bytes=[...]}";
    }
}
