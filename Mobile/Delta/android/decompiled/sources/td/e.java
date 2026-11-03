package td;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements IntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f32231a;

    public e(m mVar) {
        this.f32231a = mVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f32231a.b(integrityTokenRequest);
    }
}
