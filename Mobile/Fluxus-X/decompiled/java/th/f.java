package th;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lth/f;", "Lb5/b;", "<init>", "()V", "Lg5/b;", "connection", BuildConfig.FLAVOR, "a", "(Lg5/b;)V", "Lb5/a;", "c", "Lb5/a;", "callback", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends b5.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b5.a callback;

    public f() {
        super(3, 4);
        this.callback = new a();
    }

    @Override // b5.b
    public void a(@NotNull g5.b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        g5.a.a(connection, "ALTER TABLE `analytic_event` ADD COLUMN `event_name` TEXT DEFAULT NULL");
        g5.a.a(connection, "ALTER TABLE `analytic_event` ADD COLUMN `event_context` TEXT DEFAULT NULL");
        g5.a.a(connection, "ALTER TABLE `analytic_event` ADD COLUMN `serialized_params` TEXT DEFAULT NULL");
        this.callback.b(connection);
    }
}
