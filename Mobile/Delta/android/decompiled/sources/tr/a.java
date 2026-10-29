package tr;

import com.withpersona.sdk2.inquiry.webrtc.networking.AuthorizeWebRtcResponse;
import jv.x;
import kotlin.Metadata;
import mv.f;
import mv.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ltr/a;", "", "", "jwt", "Ljv/x;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "a", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "webrtc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @f("/server-config")
    @Nullable
    Object a(@t("jwt") @Nullable String str, @NotNull nt.b<? super x<AuthorizeWebRtcResponse>> bVar);
}
