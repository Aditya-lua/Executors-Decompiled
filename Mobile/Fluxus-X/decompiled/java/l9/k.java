package l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;
import l9.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class k<R extends p> {

    public interface a {
        void a(@NonNull Status status);
    }

    public abstract void c(@NonNull a aVar);

    @NonNull
    @ResultIgnorabilityUnspecified
    public abstract R d(long j10, @NonNull TimeUnit timeUnit);
}
