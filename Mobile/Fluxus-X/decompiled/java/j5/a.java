package j5;

import com.github.luben.zstd.BuildConfig;
import g5.d;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lj5/a;", "Lg5/b;", "Lh5/c;", "db", "<init>", "(Lh5/c;)V", BuildConfig.FLAVOR, "G", "()Z", BuildConfig.FLAVOR, "sql", "Lg5/d;", "w3", "(Ljava/lang/String;)Lg5/d;", BuildConfig.FLAVOR, "close", "()V", "a", "Lh5/c;", "()Lh5/c;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements g5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h5.c db;

    public a(@NotNull h5.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        this.db = db2;
    }

    @Override // g5.b
    public boolean G() {
        return this.db.G();
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final h5.c getDb() {
        return this.db;
    }

    @Override // g5.b, java.lang.AutoCloseable
    public void close() throws IOException {
        this.db.close();
    }

    @Override // g5.b
    @NotNull
    public d w3(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        if (this.db.isOpen()) {
            return c.INSTANCE.a(this.db, sql);
        }
        g5.a.b(21, "connection is closed");
        throw new zt.d();
    }
}
