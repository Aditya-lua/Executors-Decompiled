package z8;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public interface a extends k9.g<e> {
    @NonNull
    @Deprecated
    Task<SavePasswordResult> m(@NonNull SavePasswordRequest savePasswordRequest);
}
