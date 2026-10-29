package p281m0;

import android.util.Size;

/* JADX INFO: renamed from: m0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8287f extends AbstractC8303k0 {

    /* JADX INFO: renamed from: a */
    public final Size f30609a;

    /* JADX INFO: renamed from: b */
    public final int f30610b;

    public C8287f(Size size, int i10) {
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        this.f30609a = size;
        this.f30610b = i10;
    }

    @Override // p281m0.AbstractC8303k0
    /* JADX INFO: renamed from: b */
    public int mo33714b() {
        return this.f30610b;
    }

    @Override // p281m0.AbstractC8303k0
    /* JADX INFO: renamed from: c */
    public Size mo33715c() {
        return this.f30609a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8303k0) {
            AbstractC8303k0 abstractC8303k0 = (AbstractC8303k0) obj;
            if (this.f30609a.equals(abstractC8303k0.mo33715c()) && this.f30610b == abstractC8303k0.mo33714b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f30609a.hashCode() ^ 1000003) * 1000003) ^ this.f30610b;
    }

    public String toString() {
        return "PostviewSettings{resolution=" + this.f30609a + ", inputFormat=" + this.f30610b + "}";
    }
}
