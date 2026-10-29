package i5;

import f5.d;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Li5/a;", "Lf5/b;", "Lg5/c;", "db", "<init>", "(Lg5/c;)V", "", "D", "()Z", "", "sql", "Lf5/d;", "r3", "(Ljava/lang/String;)Lf5/d;", "", "close", "()V", "a", "Lg5/c;", "()Lg5/c;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements f5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g5.c db;

    public a(@NotNull g5.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        this.db = db2;
    }

    @Override // f5.b
    public boolean D() {
        return this.db.D();
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final g5.c getDb() {
        return this.db;
    }

    @Override // f5.b, java.lang.AutoCloseable
    public void close() throws IOException {
        this.db.close();
    }

    @Override // f5.b
    @NotNull
    public d r3(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        if (this.db.isOpen()) {
            return c.INSTANCE.a(this.db, sql);
        }
        f5.a.b(21, "connection is closed");
        throw new jt.d();
    }
}
