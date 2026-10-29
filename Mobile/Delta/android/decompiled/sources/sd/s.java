package sd;

import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30684a;
    public final r1 b;

    public s(String str, r1 r1Var) {
        this.f30684a = str;
        this.b = r1Var;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f30684a;
    }
}
