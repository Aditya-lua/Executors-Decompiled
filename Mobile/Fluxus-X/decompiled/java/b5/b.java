package b5;

import com.github.luben.zstd.BuildConfig;
import h5.c;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import zt.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb5/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "startVersion", "endVersion", "<init>", "(II)V", "Lh5/c;", "db", BuildConfig.FLAVOR, "b", "(Lh5/c;)V", "Lg5/b;", "connection", "a", "(Lg5/b;)V", "I", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int startVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int endVersion;

    public b(int i10, int i11) {
        this.startVersion = i10;
        this.endVersion = i11;
    }

    public void a(@NotNull g5.b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!(connection instanceof j5.a)) {
            throw new m("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        b(((j5.a) connection).getDb());
    }

    public void b(@NotNull c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        throw new m("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
