package td;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32287a;
    public final Long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f32288c = null;

    public /* synthetic */ q(String str, Long l10, Object obj, p pVar) {
        this.f32287a = str;
        this.b = l10;
    }

    public static boolean c() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long a() {
        return this.b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String b() {
        return this.f32287a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final boolean equals(Object obj) {
        boolean z10;
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (!this.f32287a.equals(integrityTokenRequest.b()) || ((l10 = this.b) != null ? !l10.equals(integrityTokenRequest.a()) : integrityTokenRequest.a() != null)) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if ((obj instanceof q) && c()) {
            return z10;
        }
        return z10;
    }

    public final int hashCode() {
        int iHashCode = this.f32287a.hashCode() ^ 1000003;
        Long l10 = this.b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
        return c() ? iHashCode2 * 1000003 : iHashCode2;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f32287a + ", cloudProjectNumber=" + this.b;
        if (c()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
