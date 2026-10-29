package p607zk;

import al.PushReceiveAckPostBody;
import kotlin.Metadata;
import mv.InterfaceC8692a;
import mv.InterfaceC8706o;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: zk.i */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m31665d2 = {"Lzk/i;", "", "Lal/c;", "postBody", "Lokhttp3/ResponseBody;", "a", "(Lal/c;Lnt/b;)Ljava/lang/Object;", "robloxplatform_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC13829i {
    @InterfaceC8706o("/notifications/v1/push-receive-ack")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m50309a(@InterfaceC8692a @NotNull PushReceiveAckPostBody pushReceiveAckPostBody, @NotNull InterfaceC9557b<? super ResponseBody> interfaceC9557b);
}
