package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class d extends IllegalStateException {
    public d(String str, Throwable th2) {
        super(str, th2);
    }

    @NonNull
    public static IllegalStateException a(@NonNull Task<?> task) {
        String strConcat;
        if (!task.m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = task.getException();
        if (exception != null) {
            strConcat = "failure";
        } else if (task.isSuccessful()) {
            strConcat = "result ".concat(String.valueOf(task.getResult()));
        } else {
            strConcat = task.l() ? "cancellation" : "unknown issue";
        }
        return new d("Complete with: ".concat(strConcat), exception);
    }
}
