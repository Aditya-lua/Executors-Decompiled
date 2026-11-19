.class public final Lcom/appsflyer/internal/AFd1jSDK$AFa1tSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFd1jSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AFa1tSDK"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000c\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000c\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0006R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\n8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006@\u0007X\u0087\u000e\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u0008\u0010\u000f"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFd1jSDK$AFa1tSDK;",
        "",
        "<init>",
        "()V",
        "",
        "AFLogger",
        "Ljava/lang/String;",
        "AFKeystoreWrapper",
        "unregisterClient",
        "registerClient",
        "",
        "Ljava/util/List;",
        "Lcom/appsflyer/internal/AFd1gSDK;",
        "d",
        "Lcom/appsflyer/internal/AFd1gSDK;",
        "(Lcom/appsflyer/internal/AFd1gSDK;)V"
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
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1jSDK$AFa1tSDK;-><init>()V

    return-void
.end method

.method public static unregisterClient(Lcom/appsflyer/internal/AFd1gSDK;)V
    .locals 0
    .param p0    # Lcom/appsflyer/internal/AFd1gSDK;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-static {p0}, Lcom/appsflyer/internal/AFd1jSDK;->registerClient(Lcom/appsflyer/internal/AFd1gSDK;)V

    return-void
.end method
