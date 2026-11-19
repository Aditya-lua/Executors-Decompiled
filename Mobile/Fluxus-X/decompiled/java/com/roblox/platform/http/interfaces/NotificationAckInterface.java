package com.roblox.platform.http.interfaces;

import com.github.luben.zstd.BuildConfig;
import eu.b;
import kl.PushReceiveAckPostBody;
import mv.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import vw.a;
import vw.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/roblox/platform/http/interfaces/NotificationAckInterface;", BuildConfig.FLAVOR, "Lkl/c;", "postBody", "Lmv/i0;", "pushReceiveAck", "(Lkl/c;Leu/b;)Ljava/lang/Object;", "robloxplatform_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface NotificationAckInterface {
    @Nullable
    @o("/notifications/v1/push-receive-ack")
    Object pushReceiveAck(@a @NotNull PushReceiveAckPostBody pushReceiveAckPostBody, @NotNull b<? super i0> bVar);
}
