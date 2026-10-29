package dp;

import gp.InquiryAttributes;
import jt.n;
import jv.x;
import kotlin.Metadata;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, d2 = {"Ldp/a;", "", "Lgp/e;", "attributes", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "b", "(Lgp/e;Lnt/b;)Ljava/lang/Object;", "", "sessionToken", "Lokhttp3/RequestBody;", "body", "Ljv/x;", "c", "(Ljava/lang/String;Lokhttp3/RequestBody;Lnt/b;)Ljava/lang/Object;", "a", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @Nullable
    Object a(@NotNull String str, @NotNull RequestBody requestBody, @NotNull nt.b<? super x<?>> bVar);

    @Nullable
    Object b(@NotNull InquiryAttributes inquiryAttributes, @NotNull nt.b<? super n<com.withpersona.sdk2.inquiry.internal.fallbackmode.i>> bVar);

    @Nullable
    Object c(@NotNull String str, @NotNull RequestBody requestBody, @NotNull nt.b<? super x<?>> bVar);
}
