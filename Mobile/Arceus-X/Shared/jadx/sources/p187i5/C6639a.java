package p187i5;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p119f5.C5358a;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p145g5.InterfaceC6008c;
import p229jt.C7334d;

/* JADX INFO: renamed from: i5.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Li5/a;", "Lf5/b;", "Lg5/c;", "db", "<init>", "(Lg5/c;)V", "", "D", "()Z", "", "sql", "Lf5/d;", "r3", "(Ljava/lang/String;)Lf5/d;", "", "close", "()V", "a", "Lg5/c;", "()Lg5/c;", "sqlite-framework"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6639a implements InterfaceC5359b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6008c db;

    public C6639a(@NotNull InterfaceC6008c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        this.db = db2;
    }

    @Override // p119f5.InterfaceC5359b
    /* JADX INFO: renamed from: D */
    public boolean mo24695D() {
        return this.db.mo6894D();
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC6008c getDb() {
        return this.db;
    }

    @Override // p119f5.InterfaceC5359b, java.lang.AutoCloseable
    public void close() throws IOException {
        this.db.close();
    }

    @Override // p119f5.InterfaceC5359b
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public InterfaceC5361d mo24696r3(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        if (this.db.isOpen()) {
            return AbstractC6641c.INSTANCE.m28640a(this.db, sql);
        }
        C5358a.m24694b(21, "connection is closed");
        throw new C7334d();
    }
}
