package k9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;
import k9.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class i<R extends n> {

    public interface a {
        void a(@NonNull Status status);
    }

    public abstract void c(@NonNull a aVar);

    @NonNull
    @ResultIgnorabilityUnspecified
    public abstract R d(long j10, @NonNull TimeUnit timeUnit);
}
