package p333oi;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: oi.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, m31665d2 = {"Loi/e;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "resultType", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9739e extends Exception {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String resultType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9739e(@NotNull String resultType, @NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        Intrinsics.checkNotNullParameter(message, "message");
        this.resultType = resultType;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getResultType() {
        return this.resultType;
    }
}
