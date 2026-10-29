package p607zk;

import al.C0356a;
import al.C0357b;
import al.C0359d;
import com.roblox.platform.http.postbody.notifications.SingleOSSearchResultPostBody;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItemsResult;
import com.roblox.platform.http.returntypes.ossearch.SearchSingleItemResult;
import kotlin.Metadata;
import mv.InterfaceC8692a;
import mv.InterfaceC8697f;
import mv.InterfaceC8706o;
import mv.InterfaceC8711t;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p231jv.InterfaceC7376d;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: zk.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u0007J3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0011\u0010\tJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0012H'¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H'¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u0003\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, m31665d2 = {"Lzk/j;", "", "Lal/d;", "postBody", "Ljv/d;", "Lokhttp3/ResponseBody;", "d", "(Lal/d;)Ljv/d;", "h", "()Ljv/d;", "g", "", "platformType", "notificationToken", "notificationId", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljv/d;", "c", "Lal/a;", "e", "(Lal/a;)Ljv/d;", "Lal/b;", "i", "(Lal/b;)Ljv/d;", "Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;", "f", "(Lnt/b;)Ljava/lang/Object;", "Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;", "Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;", "b", "(Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;Lnt/b;)Ljava/lang/Object;", "robloxplatform_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC13830j {
    @InterfaceC8697f("/v2/push-notifications/metadata")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC7376d<ResponseBody> m50310a(@InterfaceC8711t("platformType") @NotNull String platformType, @InterfaceC8711t("notificationToken") @NotNull String notificationToken, @InterfaceC8711t("notificationId") @NotNull String notificationId);

    @InterfaceC8706o("/v2/native-content/hydrate")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m50311b(@InterfaceC8692a @NotNull SingleOSSearchResultPostBody singleOSSearchResultPostBody, @NotNull InterfaceC9557b<? super SearchSingleItemResult> interfaceC9557b);

    @InterfaceC8706o("/v2/stream-notifications/clear-unread")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC7376d<ResponseBody> m50312c();

    @InterfaceC8706o("/v2/push-notifications/register-android-native")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC7376d<ResponseBody> m50313d(@InterfaceC8692a @NotNull C0359d postBody);

    @InterfaceC8706o("/v2/push-notifications/mark-as-read")
    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC7376d<ResponseBody> m50314e(@InterfaceC8692a @NotNull C0356a postBody);

    @InterfaceC8697f("/v2/native-content")
    @Nullable
    /* JADX INFO: renamed from: f */
    Object m50315f(@NotNull InterfaceC9557b<? super SearchIndexItemsResult> interfaceC9557b);

    @InterfaceC8706o("/v2/push-notifications/register-android-amazon")
    @NotNull
    /* JADX INFO: renamed from: g */
    InterfaceC7376d<ResponseBody> m50316g(@InterfaceC8692a @NotNull C0359d postBody);

    @InterfaceC8706o("/v2/push-notifications/deregister-current-device")
    @NotNull
    /* JADX INFO: renamed from: h */
    InterfaceC7376d<ResponseBody> m50317h();

    @InterfaceC8706o("/v2/push-notifications/mark-category-as-read")
    @NotNull
    /* JADX INFO: renamed from: i */
    InterfaceC7376d<ResponseBody> m50318i(@InterfaceC8692a @NotNull C0357b postBody);
}
