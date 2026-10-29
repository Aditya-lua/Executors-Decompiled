package sl;

import java.time.Instant;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsl/j;", "", "<init>", "()V", "", "value", "Ljava/time/Instant;", "a", "(Ljava/lang/Long;)Ljava/time/Instant;", "b", "(Ljava/time/Instant;)Ljava/lang/Long;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {
    @Nullable
    public final Instant a(@Nullable Long value) {
        if (value != null) {
            return Instant.ofEpochMilli(value.longValue());
        }
        return null;
    }

    @Nullable
    public final Long b(@Nullable Instant value) {
        if (value != null) {
            return Long.valueOf(value.toEpochMilli());
        }
        return null;
    }
}
