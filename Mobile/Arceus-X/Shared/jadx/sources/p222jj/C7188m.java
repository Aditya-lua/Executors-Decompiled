package p222jj;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.roblox.client.datastructures.NameValuePair;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.Intrinsics;
import om.C9817r;
import om.InterfaceC9814o;
import org.jetbrains.annotations.NotNull;
import th.C11659h;
import vg.C12183m;

/* JADX INFO: renamed from: jj.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m31665d2 = {"Ljj/m;", "Lom/o;", "<init>", "()V", "", "g", "", "requestId", "statusBefore", "", "shouldRequestAuthorization", "b", "(Ljava/lang/String;Ljava/lang/String;Z)V", "granted", "d", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", NotificationCompat.CATEGORY_SERVICE, "c", "(Ljava/lang/String;Ljava/lang/String;)V", "error", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "eventName", "", "Lcom/roblox/client/datastructures/NameValuePair;", "params", "e", "(Ljava/lang/String;Ljava/util/List;)V", "f", "(Ljava/lang/String;)Ljava/lang/String;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7188m implements InterfaceC9814o {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C7188m f27870a = new C7188m();

    /* JADX INFO: renamed from: g */
    public static final void m30054g() {
        C9817r.m38675k(f27870a);
    }

    @Override // om.InterfaceC9814o
    /* JADX INFO: renamed from: a */
    public void mo30055a(@NotNull String requestId, @NotNull String service, @NotNull String error) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(error, "error");
        m30059e("pushTokenRegistrationFailed", C7699p.m31895n(new NameValuePair("uuid", requestId), new NameValuePair(NotificationCompat.CATEGORY_SERVICE, service), new NameValuePair("error", m30060f(error))));
    }

    @Override // om.InterfaceC9814o
    /* JADX INFO: renamed from: b */
    public void mo30056b(@NotNull String requestId, @NotNull String statusBefore, boolean shouldRequestAuthorization) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(statusBefore, "statusBefore");
        m30059e("pushAuthorizationRequest", C7699p.m31895n(new NameValuePair("uuid", requestId), new NameValuePair("statusBefore", statusBefore), new NameValuePair("shouldRequestAuthorization", String.valueOf(shouldRequestAuthorization))));
    }

    @Override // om.InterfaceC9814o
    /* JADX INFO: renamed from: c */
    public void mo30057c(@NotNull String requestId, @NotNull String service) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(service, "service");
        m30059e("pushTokenRegistrationSucceeded", C7699p.m31895n(new NameValuePair("uuid", requestId), new NameValuePair(NotificationCompat.CATEGORY_SERVICE, service)));
    }

    @Override // om.InterfaceC9814o
    /* JADX INFO: renamed from: d */
    public void mo30058d(@NotNull String requestId, @NotNull String statusBefore, boolean shouldRequestAuthorization, boolean granted) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(statusBefore, "statusBefore");
        m30059e("pushAuthorizationResponse", C7699p.m31895n(new NameValuePair("uuid", requestId), new NameValuePair("statusBefore", statusBefore), new NameValuePair("shouldRequestAuthorization", String.valueOf(shouldRequestAuthorization)), new NameValuePair("granted", String.valueOf(granted))));
    }

    /* JADX INFO: renamed from: e */
    public final void m30059e(String eventName, List<? extends NameValuePair> params) {
        C12183m.m45108c(eventName, "pushAuthorization", params, false);
    }

    /* JADX INFO: renamed from: f */
    public final String m30060f(String error) {
        if (C11659h.m43403a().mo43407A2()) {
            return error;
        }
        String strEncode = Uri.encode(error);
        return strEncode == null ? "" : strEncode;
    }
}
