.class public final Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFf1sSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AFa1vSDK_"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;",
        "",
        "<init>",
        "()V",
        "Lcom/appsflyer/internal/AFh1nSDK;",
        "p0",
        "",
        "AFLogger",
        "(Lcom/appsflyer/internal/AFh1nSDK;)Ljava/lang/String;"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;-><init>()V

    return-void
.end method

.method public static final synthetic AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1nSDK;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;->AFLogger(Lcom/appsflyer/internal/AFh1nSDK;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static AFLogger(Lcom/appsflyer/internal/AFh1nSDK;)Ljava/lang/String;
    .locals 1

    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object p0, p0, Lcom/appsflyer/internal/AFh1pSDK;->i:Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string p0, ""

    return-object p0
.end method
