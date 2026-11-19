package b5;

import com.github.luben.zstd.BuildConfig;
import h5.c;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lb5/a;", BuildConfig.FLAVOR, "Lh5/c;", "db", BuildConfig.FLAVOR, "a", "(Lh5/c;)V", "Lg5/b;", "connection", "b", "(Lg5/b;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {
    default void a(@NotNull c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
    }

    default void b(@NotNull g5.b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (connection instanceof j5.a) {
            a(((j5.a) connection).getDb());
        }
    }
}
