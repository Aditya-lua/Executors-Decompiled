package m9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
public class t extends BasePendingResult<Status> {
    public t(@NonNull l9.h hVar) {
        super(hVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @NonNull
    public final /* bridge */ /* synthetic */ l9.p e(@NonNull Status status) {
        return status;
    }
}
