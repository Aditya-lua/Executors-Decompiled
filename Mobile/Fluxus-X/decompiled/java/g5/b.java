package g5;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import zt.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lg5/b;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", BuildConfig.FLAVOR, "G", "()Z", BuildConfig.FLAVOR, "sql", "Lg5/d;", "w3", "(Ljava/lang/String;)Lg5/d;", BuildConfig.FLAVOR, "close", "()V", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b extends AutoCloseable {
    default boolean G() {
        throw new m(this + " does not implement inTransaction().");
    }

    @Override // java.lang.AutoCloseable
    void close();

    @NotNull
    d w3(@NotNull String sql);
}
