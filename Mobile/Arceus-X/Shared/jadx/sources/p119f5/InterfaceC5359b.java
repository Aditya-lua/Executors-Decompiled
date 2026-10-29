package p119f5;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p229jt.C7346m;

/* JADX INFO: renamed from: f5.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m31665d2 = {"Lf5/b;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "D", "()Z", "", "sql", "Lf5/d;", "r3", "(Ljava/lang/String;)Lf5/d;", "", "close", "()V", "sqlite"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC5359b extends AutoCloseable {
    /* JADX INFO: renamed from: D */
    default boolean mo24695D() {
        throw new C7346m(this + " does not implement inTransaction().");
    }

    @Override // java.lang.AutoCloseable
    void close();

    @NotNull
    /* JADX INFO: renamed from: r3 */
    InterfaceC5361d mo24696r3(@NotNull String sql);
}
