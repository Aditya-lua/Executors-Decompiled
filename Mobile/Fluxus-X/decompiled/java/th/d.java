package th;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lth/d;", "Lb5/b;", "<init>", "()V", "Lg5/b;", "connection", BuildConfig.FLAVOR, "a", "(Lg5/b;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends b5.b {
    public d() {
        super(1, 2);
    }

    @Override // b5.b
    public void a(@NotNull g5.b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        g5.a.a(connection, "CREATE TABLE IF NOT EXISTS `notification_id` (`notification_id` TEXT NOT NULL, `last_received_timestamp_ms` INTEGER NOT NULL, PRIMARY KEY(`notification_id`))");
    }
}
