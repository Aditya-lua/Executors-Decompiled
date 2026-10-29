package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public interface c<TResult, TContinuationResult> {
    TContinuationResult then(@NonNull Task<TResult> task);
}
