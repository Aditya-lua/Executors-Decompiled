package t6;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lt6/g;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lt6/q;", Payload.RESPONSE, "<init>", "(Lt6/q;)V", "a", "Lt6/q;", "getResponse", "()Lt6/q;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkResponse response;

    public g(@NotNull NetworkResponse networkResponse) {
        super("HTTP " + networkResponse.getCode());
        this.response = networkResponse;
    }
}
