package td;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: renamed from: td.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C11613q extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a */
    public final String f41008a;

    /* JADX INFO: renamed from: b */
    public final Long f41009b;

    /* JADX INFO: renamed from: c */
    public final Object f41010c = null;

    public /* synthetic */ C11613q(String str, Long l10, Object obj, C11610p c11610p) {
        this.f41008a = str;
        this.f41009b = l10;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m43281c() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    /* JADX INFO: renamed from: a */
    public final Long mo13347a() {
        return this.f41009b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    /* JADX INFO: renamed from: b */
    public final String mo13348b() {
        return this.f41008a;
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
            if (!this.f41008a.equals(integrityTokenRequest.mo13348b()) || ((l10 = this.f41009b) != null ? !l10.equals(integrityTokenRequest.mo13347a()) : integrityTokenRequest.mo13347a() != null)) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if ((obj instanceof C11613q) && m43281c()) {
            return z10;
        }
        return z10;
    }

    public final int hashCode() {
        int iHashCode = this.f41008a.hashCode() ^ 1000003;
        Long l10 = this.f41009b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
        return m43281c() ? iHashCode2 * 1000003 : iHashCode2;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f41008a + ", cloudProjectNumber=" + this.f41009b;
        if (m43281c()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
