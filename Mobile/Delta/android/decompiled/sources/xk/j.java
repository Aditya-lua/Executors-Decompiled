package xk;

import com.roblox.platform.http.postbody.notifications.SingleOSSearchResultPostBody;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItemsResult;
import com.roblox.platform.http.returntypes.ossearch.SearchSingleItemResult;
import kotlin.Metadata;
import kv.o;
import kv.t;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u0007J3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0011\u0010\tJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0012H'¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H'¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u0003\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lxk/j;", "", "Lyk/d;", "postBody", "Lhv/d;", "Lokhttp3/ResponseBody;", "e", "(Lyk/d;)Lhv/d;", "h", "()Lhv/d;", "i", "", "platformType", "notificationToken", "notificationId", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhv/d;", "d", "Lyk/a;", "b", "(Lyk/a;)Lhv/d;", "Lyk/b;", "f", "(Lyk/b;)Lhv/d;", "Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;", "a", "(Llt/b;)Ljava/lang/Object;", "Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;", "Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;", "g", "(Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;Llt/b;)Ljava/lang/Object;", "robloxplatform_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {
    @kv.f("/v2/native-content")
    @Nullable
    Object a(@NotNull lt.b<? super SearchIndexItemsResult> bVar);

    @o("/v2/push-notifications/mark-as-read")
    @NotNull
    hv.d<ResponseBody> b(@kv.a @NotNull yk.a postBody);

    @kv.f("/v2/push-notifications/metadata")
    @NotNull
    hv.d<ResponseBody> c(@t("platformType") @NotNull String platformType, @t("notificationToken") @NotNull String notificationToken, @t("notificationId") @NotNull String notificationId);

    @o("/v2/stream-notifications/clear-unread")
    @NotNull
    hv.d<ResponseBody> d();

    @o("/v2/push-notifications/register-android-native")
    @NotNull
    hv.d<ResponseBody> e(@kv.a @NotNull yk.d postBody);

    @o("/v2/push-notifications/mark-category-as-read")
    @NotNull
    hv.d<ResponseBody> f(@kv.a @NotNull yk.b postBody);

    @o("/v2/native-content/hydrate")
    @Nullable
    Object g(@kv.a @NotNull SingleOSSearchResultPostBody singleOSSearchResultPostBody, @NotNull lt.b<? super SearchSingleItemResult> bVar);

    @o("/v2/push-notifications/deregister-current-device")
    @NotNull
    hv.d<ResponseBody> h();

    @o("/v2/push-notifications/register-android-amazon")
    @NotNull
    hv.d<ResponseBody> i(@kv.a @NotNull yk.d postBody);
}
