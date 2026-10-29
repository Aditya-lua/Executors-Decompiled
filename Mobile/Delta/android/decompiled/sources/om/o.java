package om;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lom/o;", "", "", "requestId", "statusBefore", "", "shouldRequestAuthorization", "", "b", "(Ljava/lang/String;Ljava/lang/String;Z)V", "granted", "d", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "service", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "error", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface o {
    void a(@NotNull String requestId, @NotNull String service, @NotNull String error);

    void b(@NotNull String requestId, @NotNull String statusBefore, boolean shouldRequestAuthorization);

    void c(@NotNull String requestId, @NotNull String service);

    void d(@NotNull String requestId, @NotNull String statusBefore, boolean shouldRequestAuthorization, boolean granted);
}
