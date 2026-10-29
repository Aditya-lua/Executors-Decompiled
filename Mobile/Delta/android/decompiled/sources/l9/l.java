package l9;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class l {
    @NonNull
    public static <L> k<L> a(@NonNull L l10, @NonNull Looper looper, @NonNull String str) {
        n9.m.m(l10, "Listener must not be null");
        n9.m.m(looper, "Looper must not be null");
        n9.m.m(str, "Listener type must not be null");
        return new k<>(looper, l10, str);
    }

    @NonNull
    public static <L> k<L> b(@NonNull L l10, @NonNull Executor executor, @NonNull String str) {
        n9.m.m(l10, "Listener must not be null");
        n9.m.m(executor, "Executor must not be null");
        n9.m.m(str, "Listener type must not be null");
        return new k<>(executor, l10, str);
    }

    @NonNull
    public static <L> k.a<L> c(@NonNull L l10, @NonNull String str) {
        n9.m.m(l10, "Listener must not be null");
        n9.m.m(str, "Listener type must not be null");
        n9.m.g(str, "Listener type must not be empty");
        return new k.a<>(l10, str);
    }
}
