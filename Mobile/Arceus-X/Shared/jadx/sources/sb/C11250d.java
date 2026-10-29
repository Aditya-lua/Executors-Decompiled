package sb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: sb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C11250d extends IllegalStateException {
    public C11250d(String str, Throwable th2) {
        super(str, th2);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static IllegalStateException m42317a(@NonNull Task<?> task) {
        String strConcat;
        if (!task.mo11899m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = task.getException();
        if (exception != null) {
            strConcat = "failure";
        } else if (task.isSuccessful()) {
            strConcat = "result ".concat(String.valueOf(task.getResult()));
        } else {
            strConcat = task.mo11898l() ? "cancellation" : "unknown issue";
        }
        return new C11250d("Complete with: ".concat(strConcat), exception);
    }
}
