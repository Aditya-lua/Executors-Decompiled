package p229jt;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jt.o */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"", "exception", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Ljt/n;", "", "b", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7348o {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Object m30469a(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new C7347n.Failure(exception);
    }

    /* JADX INFO: renamed from: b */
    public static final void m30470b(@NotNull Object obj) {
        if (obj instanceof C7347n.Failure) {
            throw ((C7347n.Failure) obj).exception;
        }
    }
}
