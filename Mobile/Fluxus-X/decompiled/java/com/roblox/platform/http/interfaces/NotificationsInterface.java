package com.roblox.platform.http.interfaces;

import com.github.luben.zstd.BuildConfig;
import com.roblox.platform.http.postbody.notifications.SingleOSSearchResultPostBody;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItemsResult;
import com.roblox.platform.http.returntypes.ossearch.SearchSingleItemResult;
import eu.b;
import mv.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import sw.d;
import vw.a;
import vw.f;
import vw.o;
import vw.t;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\u0007J3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\fH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0012\u0010\tJ\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0013\u0010\tJ\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!À\u0006\u0003"}, d2 = {"Lcom/roblox/platform/http/interfaces/NotificationsInterface;", BuildConfig.FLAVOR, "Lkl/d;", "postBody", "Lsw/d;", "Lmv/i0;", "registerPushAndroid", "(Lkl/d;)Lsw/d;", "deregisterCurrentDevice", "()Lsw/d;", "registerPushAmazon", "registerPushTencent", BuildConfig.FLAVOR, "platformType", "notificationToken", "notificationId", "getPushMetadata", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lsw/d;", "getStreamUnreadCount", "clearStreamUnread", "Lkl/a;", "pushMarkAsRead", "(Lkl/a;)Lsw/d;", "Lkl/b;", "pushMarkCategoryAsRead", "(Lkl/b;)Lsw/d;", "Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;", "fetchOSSearchResults", "(Leu/b;)Ljava/lang/Object;", "Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;", "Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;", "fetchSingleOSSearchResult", "(Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;Leu/b;)Ljava/lang/Object;", "robloxplatform_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface NotificationsInterface {
    @NotNull
    @o("/v2/stream-notifications/clear-unread")
    d<i0> clearStreamUnread();

    @NotNull
    @o("/v2/push-notifications/deregister-current-device")
    d<i0> deregisterCurrentDevice();

    @f("/v2/native-content")
    @Nullable
    Object fetchOSSearchResults(@NotNull b<? super SearchIndexItemsResult> bVar);

    @Nullable
    @o("/v2/native-content/hydrate")
    Object fetchSingleOSSearchResult(@a @NotNull SingleOSSearchResultPostBody singleOSSearchResultPostBody, @NotNull b<? super SearchSingleItemResult> bVar);

    @f("/v2/push-notifications/metadata")
    @NotNull
    d<i0> getPushMetadata(@t("platformType") @NotNull String platformType, @t("notificationToken") @NotNull String notificationToken, @t("notificationId") @NotNull String notificationId);

    @f("/v2/stream-notifications/unread-count")
    @NotNull
    d<i0> getStreamUnreadCount();

    @NotNull
    @o("/v2/push-notifications/mark-as-read")
    d<i0> pushMarkAsRead(@a @NotNull kl.a postBody);

    @NotNull
    @o("/v2/push-notifications/mark-category-as-read")
    d<i0> pushMarkCategoryAsRead(@a @NotNull kl.b postBody);

    @NotNull
    @o("/v2/push-notifications/register-android-amazon")
    d<i0> registerPushAmazon(@a @NotNull kl.d postBody);

    @NotNull
    @o("/v2/push-notifications/register-android-native")
    d<i0> registerPushAndroid(@a @NotNull kl.d postBody);

    @NotNull
    @o("/v2/push-notifications/register-android-tencent-service")
    d<i0> registerPushTencent(@a @NotNull kl.d postBody);
}
