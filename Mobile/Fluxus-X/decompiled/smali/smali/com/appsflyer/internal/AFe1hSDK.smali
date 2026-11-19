.class public final Lcom/appsflyer/internal/AFe1hSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\t\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u000bj\u0002`\u000c2\u0006\u0010\u0007\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\t\u0010\u000fJ-\u0010\u0011\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u000bj\u0002`\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0010\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFe1hSDK;",
        "",
        "<init>",
        "()V",
        "Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;",
        "p0",
        "Lcom/appsflyer/internal/AFi1vSDK;",
        "p1",
        "",
        "unregisterClient",
        "(Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;Lcom/appsflyer/internal/AFi1vSDK;)Ljava/lang/String;",
        "Ljava/lang/StringBuilder;",
        "Lkotlin/text/StringBuilder;",
        "",
        "",
        "(Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V",
        "p2",
        "AFLogger",
        "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V"
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
.field public static final INSTANCE:Lcom/appsflyer/internal/AFe1hSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/appsflyer/internal/AFe1hSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFe1hSDK;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFe1hSDK;->INSTANCE:Lcom/appsflyer/internal/AFe1hSDK;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AFLogger(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "; "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_0
    return-void
.end method

.method public static final unregisterClient(Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;Lcom/appsflyer/internal/AFi1vSDK;)Ljava/lang/String;
    .locals 5
    .param p0    # Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/appsflyer/internal/AFi1vSDK;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    sget-object v2, Lcom/appsflyer/internal/AFe1hSDK;->INSTANCE:Lcom/appsflyer/internal/AFe1hSDK;

    .line 3
    const-string v3, "Network error: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .line 5
    invoke-direct {v2, v1, v3}, Lcom/appsflyer/internal/AFe1hSDK;->unregisterClient(Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v4

    :goto_0
    if-eqz v2, :cond_2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    :cond_2
    :goto_1
    const-string v2, "; httpLatencyMs="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;->getMetrics()Lcom/appsflyer/internal/AFd1nSDK;

    move-result-object p0

    iget-wide v2, p0, Lcom/appsflyer/internal/AFd1nSDK;->registerClient:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_b

    .line 8
    iget-object p0, p1, Lcom/appsflyer/internal/AFi1vSDK;->d:Lcom/appsflyer/internal/AFi1ySDK;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/appsflyer/internal/AFi1ySDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFi1rSDK;

    move-result-object v4

    :cond_3
    if-nez v4, :cond_4

    goto/16 :goto_3

    .line 9
    :cond_4
    const-string p0, "; networkType="

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    iget-object p0, v4, Lcom/appsflyer/internal/AFi1rSDK;->registerClient:Ljava/lang/String;

    .line 11
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    iget-object p0, v4, Lcom/appsflyer/internal/AFi1rSDK;->AFLogger:Ljava/lang/Boolean;

    .line 13
    const-string p1, "; "

    if-eqz p0, :cond_5

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "hasInternetCapability="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 14
    :cond_5
    iget-object p0, v4, Lcom/appsflyer/internal/AFi1rSDK;->unregisterClient:Ljava/lang/Boolean;

    if-eqz p0, :cond_6

    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "hasValidatedCapability="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 16
    :cond_6
    iget-object p0, v4, Lcom/appsflyer/internal/AFi1rSDK;->d:Ljava/lang/String;

    .line 17
    const-string v2, "dataState="

    invoke-static {v1, p0, v2}, Lcom/appsflyer/internal/AFe1hSDK;->AFLogger(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    iget-boolean p0, v4, Lcom/appsflyer/internal/AFi1rSDK;->AFKeystoreWrapper:Z

    .line 19
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "vpnEnabled="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v2, "null"

    if-nez p0, :cond_7

    move-object p0, v2

    :cond_7
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    iget-object p0, v4, Lcom/appsflyer/internal/AFi1rSDK;->e:Ljava/lang/String;

    .line 22
    const-string v3, "vpnUnderlyingTransport="

    invoke-static {v1, p0, v3}, Lcom/appsflyer/internal/AFe1hSDK;->AFLogger(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    iget-boolean p0, v4, Lcom/appsflyer/internal/AFi1rSDK;->AFKeystoreWrapper:Z

    if-eqz p0, :cond_8

    .line 24
    iget-object p0, v4, Lcom/appsflyer/internal/AFi1rSDK;->w:Ljava/lang/String;

    .line 25
    const-string v3, "devicePrivateVpnAddress="

    invoke-static {v1, p0, v3}, Lcom/appsflyer/internal/AFe1hSDK;->AFLogger(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    :cond_8
    iget-object p0, v4, Lcom/appsflyer/internal/AFi1rSDK;->i:Ljava/lang/Boolean;

    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "customDnsEnabled="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p0, :cond_a

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_9

    goto :goto_2

    :cond_9
    move-object v2, p0

    :cond_a
    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    iget-object p0, v4, Lcom/appsflyer/internal/AFi1rSDK;->i:Ljava/lang/Boolean;

    .line 29
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    .line 30
    iget-object p0, v4, Lcom/appsflyer/internal/AFi1rSDK;->v:Ljava/lang/String;

    .line 31
    const-string p1, "customDnsServerName="

    invoke-static {v1, p0, p1}, Lcom/appsflyer/internal/AFe1hSDK;->AFLogger(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    :cond_b
    :goto_3
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final unregisterClient(Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V
    .locals 2

    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const-string v1, ": "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 36
    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 37
    const-string p2, " (caused by: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    invoke-direct {p0, p1, v0}, Lcom/appsflyer/internal/AFe1hSDK;->unregisterClient(Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    const/16 p2, 0x29

    .line 39
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    return-void
.end method
