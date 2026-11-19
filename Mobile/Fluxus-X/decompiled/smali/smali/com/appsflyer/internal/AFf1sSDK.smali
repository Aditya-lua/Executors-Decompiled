.class public final Lcom/appsflyer/internal/AFf1sSDK;
.super Lcom/appsflyer/internal/AFe1kSDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFe1kSDK<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00152\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0015\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0015\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\n\u001a\u00020\u000cH\u0010\u00a2\u0006\u0004\u0008\n\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFf1sSDK;",
        "Lcom/appsflyer/internal/AFe1kSDK;",
        "",
        "Lcom/appsflyer/internal/AFh1nSDK;",
        "p0",
        "Lcom/appsflyer/internal/AFc1bSDK;",
        "p1",
        "<init>",
        "(Lcom/appsflyer/internal/AFh1nSDK;Lcom/appsflyer/internal/AFc1bSDK;)V",
        "Lcom/appsflyer/internal/AFd1pSDK;",
        "AFLogger",
        "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;",
        "",
        "e",
        "()Z",
        "Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;",
        "afWarnLog",
        "()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;",
        "v",
        "Lcom/appsflyer/internal/AFh1nSDK;",
        "registerClient",
        "AFa1vSDK_"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final AFa1vSDK_:Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final v:Lcom/appsflyer/internal/AFh1nSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/appsflyer/internal/AFf1sSDK;->AFa1vSDK_:Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;

    return-void
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFh1nSDK;Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 8
    .param p1    # Lcom/appsflyer/internal/AFh1nSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFc1bSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lcom/appsflyer/internal/AFh1nSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFe1zSDK;

    if-eqz v1, :cond_0

    :goto_0
    move-object v3, v1

    goto :goto_1

    :cond_0
    sget-object v1, Lcom/appsflyer/internal/AFd1bSDK;->AFLogger:Lcom/appsflyer/internal/AFd1bSDK;

    goto :goto_0

    :goto_1
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v4, v0, [Lcom/appsflyer/internal/AFe1zSDK;

    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    const/4 v1, 0x0

    aput-object v0, v4, v1

    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    invoke-static {p1}, Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1nSDK;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p1, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    move-object v2, p0

    move-object v5, p2

    invoke-direct/range {v2 .. v7}, Lcom/appsflyer/internal/AFe1kSDK;-><init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, v2, Lcom/appsflyer/internal/AFf1sSDK;->v:Lcom/appsflyer/internal/AFh1nSDK;

    return-void
.end method


# virtual methods
.method public final AFLogger(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/appsflyer/internal/AFf1sSDK;->v:Lcom/appsflyer/internal/AFh1nSDK;

    .line 2
    iget-object p1, p1, Lcom/appsflyer/internal/AFh1pSDK;->force:[B

    const/4 v0, 0x2

    .line 3
    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    .line 4
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cached data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 5
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->afErrorLog()Lcom/appsflyer/internal/AFd1uSDK;

    move-result-object v0

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1sSDK;->v:Lcom/appsflyer/internal/AFh1nSDK;

    .line 6
    iget-object v1, v1, Lcom/appsflyer/internal/AFh1pSDK;->i:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v1, p1}, Lcom/appsflyer/internal/AFd1uSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->afDebugLog()Lcom/appsflyer/internal/AFd1sSDK;

    move-result-object p1

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1sSDK;->v:Lcom/appsflyer/internal/AFh1nSDK;

    invoke-virtual {p1, v0}, Lcom/appsflyer/internal/AFd1sSDK;->unregisterClient(Lcom/appsflyer/internal/AFh1nSDK;)Lcom/appsflyer/internal/AFd1pSDK;

    move-result-object p1

    return-object p1
.end method

.method public final AFLogger()Z
    .locals 5

    .line 9
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1kSDK;->AFLogger()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_6

    .line 10
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1sSDK;->v:Lcom/appsflyer/internal/AFh1nSDK;

    .line 11
    iget-object v0, v0, Lcom/appsflyer/internal/AFh1nSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFe1zSDK;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->AFLogger:Lcom/appsflyer/internal/AFd1bSDK;

    .line 13
    :goto_0
    sget-object v2, Lcom/appsflyer/internal/AFd1bSDK;->getLevel:Lcom/appsflyer/internal/AFd1bSDK;

    if-ne v0, v2, :cond_1

    .line 14
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    if-eqz v0, :cond_1

    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    move-result v0

    const/16 v2, 0x1a8

    if-ne v0, v2, :cond_1

    goto :goto_4

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    .line 17
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->w:Lcom/appsflyer/internal/AFd1cSDK;

    .line 18
    sget-object v3, Lcom/appsflyer/internal/AFd1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1cSDK;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_2

    if-eqz v0, :cond_2

    .line 19
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    move-result v0

    div-int/lit16 v0, v0, 0x1f4

    if-ne v0, v1, :cond_2

    move v0, v1

    goto :goto_1

    :cond_2
    move v0, v4

    .line 20
    :goto_1
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFe1zSDK;

    .line 21
    sget-object v3, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    if-eq v2, v3, :cond_4

    sget-object v3, Lcom/appsflyer/internal/AFd1bSDK;->w:Lcom/appsflyer/internal/AFd1bSDK;

    if-ne v2, v3, :cond_3

    goto :goto_2

    :cond_3
    move v2, v4

    goto :goto_3

    :cond_4
    :goto_2
    move v2, v1

    :goto_3
    if-eqz v0, :cond_5

    if-eqz v2, :cond_5

    goto :goto_4

    :cond_5
    return v4

    :cond_6
    :goto_4
    return v1
.end method

.method public final afWarnLog()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1sSDK;->v:Lcom/appsflyer/internal/AFh1nSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFh1pSDK;->AFLogger:Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
