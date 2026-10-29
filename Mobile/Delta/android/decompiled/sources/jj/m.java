package jj;

import android.net.Uri;
import com.roblox.client.datastructures.NameValuePair;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ljj/m;", "Lom/o;", "<init>", "()V", "", "g", "", "requestId", "statusBefore", "", "shouldRequestAuthorization", "b", "(Ljava/lang/String;Ljava/lang/String;Z)V", "granted", "d", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "service", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "error", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "eventName", "", "Lcom/roblox/client/datastructures/NameValuePair;", "params", "e", "(Ljava/lang/String;Ljava/util/List;)V", "f", "(Ljava/lang/String;)Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements om.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f21502a = new m();

    public static final void g() {
        om.r.k(f21502a);
    }

    @Override // om.o
    public void a(@NotNull String requestId, @NotNull String service, @NotNull String error) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(error, "error");
        e("pushTokenRegistrationFailed", kotlin.collections.p.n(new NameValuePair("uuid", requestId), new NameValuePair("service", service), new NameValuePair("error", f(error))));
    }

    @Override // om.o
    public void b(@NotNull String requestId, @NotNull String statusBefore, boolean shouldRequestAuthorization) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(statusBefore, "statusBefore");
        e("pushAuthorizationRequest", kotlin.collections.p.n(new NameValuePair("uuid", requestId), new NameValuePair("statusBefore", statusBefore), new NameValuePair("shouldRequestAuthorization", String.valueOf(shouldRequestAuthorization))));
    }

    @Override // om.o
    public void c(@NotNull String requestId, @NotNull String service) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(service, "service");
        e("pushTokenRegistrationSucceeded", kotlin.collections.p.n(new NameValuePair("uuid", requestId), new NameValuePair("service", service)));
    }

    @Override // om.o
    public void d(@NotNull String requestId, @NotNull String statusBefore, boolean shouldRequestAuthorization, boolean granted) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(statusBefore, "statusBefore");
        e("pushAuthorizationResponse", kotlin.collections.p.n(new NameValuePair("uuid", requestId), new NameValuePair("statusBefore", statusBefore), new NameValuePair("shouldRequestAuthorization", String.valueOf(shouldRequestAuthorization)), new NameValuePair("granted", String.valueOf(granted))));
    }

    public final void e(String eventName, List<? extends NameValuePair> params) {
        vg.m.c(eventName, "pushAuthorization", params, false);
    }

    public final String f(String error) {
        if (th.h.a().u2()) {
            return error;
        }
        String strEncode = Uri.encode(error);
        return strEncode == null ? "" : strEncode;
    }
}
