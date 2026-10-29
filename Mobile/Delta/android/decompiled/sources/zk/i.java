package zk;

import al.PushReceiveAckPostBody;
import kotlin.Metadata;
import mv.o;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lzk/i;", "", "Lal/c;", "postBody", "Lokhttp3/ResponseBody;", "a", "(Lal/c;Lnt/b;)Ljava/lang/Object;", "robloxplatform_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {
    @o("/notifications/v1/push-receive-ack")
    @Nullable
    Object a(@mv.a @NotNull PushReceiveAckPostBody pushReceiveAckPostBody, @NotNull nt.b<? super ResponseBody> bVar);
}
