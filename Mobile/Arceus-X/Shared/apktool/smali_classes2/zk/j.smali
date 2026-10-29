.class public interface abstract Lzk/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\'\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\n\u0010\u0007J3\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000bH\'\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\'\u00a2\u0006\u0004\u0008\u0011\u0010\tJ\u001f\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0012H\'\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0015H\'\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u00a7@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f\u00c0\u0006\u0003"
    }
    d2 = {
        "Lzk/j;",
        "",
        "Lal/d;",
        "postBody",
        "Ljv/d;",
        "Lokhttp3/ResponseBody;",
        "d",
        "(Lal/d;)Ljv/d;",
        "h",
        "()Ljv/d;",
        "g",
        "",
        "platformType",
        "notificationToken",
        "notificationId",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljv/d;",
        "c",
        "Lal/a;",
        "e",
        "(Lal/a;)Ljv/d;",
        "Lal/b;",
        "i",
        "(Lal/b;)Ljv/d;",
        "Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;",
        "f",
        "(Lnt/b;)Ljava/lang/Object;",
        "Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;",
        "Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;",
        "b",
        "(Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;Lnt/b;)Ljava/lang/Object;",
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
.method public abstract a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljv/d;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lmv/t;
            value = "platformType"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lmv/t;
            value = "notificationToken"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lmv/t;
            value = "notificationId"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljv/d<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmv/f;
        value = "/v2/push-notifications/metadata"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract b(Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;Lnt/b;)Ljava/lang/Object;
    .param p1    # Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;
        .annotation runtime Lmv/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/platform/http/returntypes/ossearch/SearchSingleItemResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lmv/o;
        value = "/v2/native-content/hydrate"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract c()Ljv/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljv/d<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmv/o;
        value = "/v2/stream-notifications/clear-unread"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract d(Lal/d;)Ljv/d;
    .param p1    # Lal/d;
        .annotation runtime Lmv/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lal/d;",
            ")",
            "Ljv/d<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmv/o;
        value = "/v2/push-notifications/register-android-native"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract e(Lal/a;)Ljv/d;
    .param p1    # Lal/a;
        .annotation runtime Lmv/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lal/a;",
            ")",
            "Ljv/d<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmv/o;
        value = "/v2/push-notifications/mark-as-read"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract f(Lnt/b;)Ljava/lang/Object;
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lmv/f;
        value = "/v2/native-content"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract g(Lal/d;)Ljv/d;
    .param p1    # Lal/d;
        .annotation runtime Lmv/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lal/d;",
            ")",
            "Ljv/d<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmv/o;
        value = "/v2/push-notifications/register-android-amazon"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract h()Ljv/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljv/d<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmv/o;
        value = "/v2/push-notifications/deregister-current-device"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract i(Lal/b;)Ljv/d;
    .param p1    # Lal/b;
        .annotation runtime Lmv/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lal/b;",
            ")",
            "Ljv/d<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmv/o;
        value = "/v2/push-notifications/mark-category-as-read"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
