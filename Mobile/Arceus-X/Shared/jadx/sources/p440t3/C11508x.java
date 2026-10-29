package p440t3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: t3.x */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lt3/x;", "T", "Lt3/d0;", "", "readException", "", "version", "<init>", "(Ljava/lang/Throwable;I)V", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C11508x<T> extends AbstractC11481d0<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Throwable readException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11508x(@NotNull Throwable readException, int i10) {
        super(i10, null);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.readException = readException;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Throwable getReadException() {
        return this.readException;
    }
}
