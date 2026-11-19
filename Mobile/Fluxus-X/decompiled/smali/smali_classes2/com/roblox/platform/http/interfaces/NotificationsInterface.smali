.class public interface abstract Lcom/roblox/platform/http/interfaces/NotificationsInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\'\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\n\u0010\u0007J\u001f\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u000b\u0010\u0007J3\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000cH\'\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\'\u00a2\u0006\u0004\u0008\u0012\u0010\tJ\u0015\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\'\u00a2\u0006\u0004\u0008\u0013\u0010\tJ\u001f\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0014H\'\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0017H\'\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u00a7@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u001dH\u00a7@\u00a2\u0006\u0004\u0008\u001f\u0010 \u00a8\u0006!\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/roblox/platform/http/interfaces/NotificationsInterface;",
        "",
        "Lkl/d;",
        "postBody",
        "Lsw/d;",
        "Lmv/i0;",
        "registerPushAndroid",
        "(Lkl/d;)Lsw/d;",
        "deregisterCurrentDevice",
        "()Lsw/d;",
        "registerPushAmazon",
        "registerPushTencent",
        "",
        "platformType",
        "notificationToken",
        "notificationId",
        "getPushMetadata",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lsw/d;",
        "getStreamUnreadCount",
        "clearStreamUnread",
        "Lkl/a;",
        "pushMarkAsRead",
        "(Lkl/a;)Lsw/d;",
        "Lkl/b;",
        "pushMarkCategoryAsRead",
        "(Lkl/b;)Lsw/d;",
        "Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;",
        "fetchOSSearchResults",
        "(Leu/b;)Ljava/lang/Object;",
        "Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;",
        "Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;",
        "fetchSingleOSSearchResult",
        "(Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;Leu/b;)Ljava/lang/Object;",
        "robloxplatform_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract clearStreamUnread()Lsw/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v2/stream-notifications/clear-unread"
    .end annotation
.end method

.method public abstract deregisterCurrentDevice()Lsw/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v2/push-notifications/deregister-current-device"
    .end annotation
.end method

.method public abstract fetchOSSearchResults(Leu/b;)Ljava/lang/Object;
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lvw/f;
        value = "/v2/native-content"
    .end annotation
.end method

.method public abstract fetchSingleOSSearchResult(Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;Leu/b;)Ljava/lang/Object;
    .param p1    # Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;",
            "Leu/b<",
            "-",
            "Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v2/native-content/hydrate"
    .end annotation
.end method

.method public abstract getPushMetadata(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lsw/d;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lvw/t;
            value = "platformType"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lvw/t;
            value = "notificationToken"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lvw/t;
            value = "notificationId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lvw/f;
        value = "/v2/push-notifications/metadata"
    .end annotation
.end method

.method public abstract getStreamUnreadCount()Lsw/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lvw/f;
        value = "/v2/stream-notifications/unread-count"
    .end annotation
.end method

.method public abstract pushMarkAsRead(Lkl/a;)Lsw/d;
    .param p1    # Lkl/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkl/a;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v2/push-notifications/mark-as-read"
    .end annotation
.end method

.method public abstract pushMarkCategoryAsRead(Lkl/b;)Lsw/d;
    .param p1    # Lkl/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkl/b;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v2/push-notifications/mark-category-as-read"
    .end annotation
.end method

.method public abstract registerPushAmazon(Lkl/d;)Lsw/d;
    .param p1    # Lkl/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkl/d;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v2/push-notifications/register-android-amazon"
    .end annotation
.end method

.method public abstract registerPushAndroid(Lkl/d;)Lsw/d;
    .param p1    # Lkl/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkl/d;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v2/push-notifications/register-android-native"
    .end annotation
.end method

.method public abstract registerPushTencent(Lkl/d;)Lsw/d;
    .param p1    # Lkl/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkl/d;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v2/push-notifications/register-android-tencent-service"
    .end annotation
.end method
