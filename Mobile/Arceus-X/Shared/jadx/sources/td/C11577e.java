package td;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* JADX INFO: renamed from: td.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C11577e implements IntegrityManager {

    /* JADX INFO: renamed from: a */
    public final C11601m f40941a;

    public C11577e(C11601m c11601m) {
        this.f40941a = c11601m;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f40941a.m43267b(integrityTokenRequest);
    }
}
