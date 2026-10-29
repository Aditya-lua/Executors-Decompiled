package gp;

import com.withpersona.sdk2.inquiry.internal.network.CurrentRelaySessionResponse;
import kotlin.Metadata;
import mv.InterfaceC8697f;
import mv.InterfaceC8700i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: gp.y */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m31665d2 = {"Lgp/y;", "", "", "relayToken", "Ljv/x;", "Lcom/withpersona/sdk2/inquiry/internal/network/CurrentRelaySessionResponse;", "a", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC6205y {
    @InterfaceC8697f("/api/internal/relay/v1/current-relay-session")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m27326a(@InterfaceC8700i("Authorization") @NotNull String str, @NotNull InterfaceC9557b<? super C7396x<CurrentRelaySessionResponse>> interfaceC9557b);
}
