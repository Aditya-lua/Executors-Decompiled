package p242k9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;
import p242k9.InterfaceC7504n;

/* JADX INFO: renamed from: k9.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7499i<R extends InterfaceC7504n> {

    /* JADX INFO: renamed from: k9.i$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo31159a(@NonNull Status status);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo9171c(@NonNull a aVar);

    @NonNull
    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: d */
    public abstract R mo9172d(long j10, @NonNull TimeUnit timeUnit);
}
