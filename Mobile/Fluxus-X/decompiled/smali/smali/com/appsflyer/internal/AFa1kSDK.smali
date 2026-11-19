.class public final Lcom/appsflyer/internal/AFa1kSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B+\u0008\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000f"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFa1kSDK;",
        "",
        "",
        "",
        "p0",
        "Lcom/appsflyer/internal/AFa1lSDK;",
        "p1",
        "<init>",
        "(Ljava/util/Map;Lcom/appsflyer/internal/AFa1lSDK;)V",
        "",
        "unregisterClient",
        "(Ljava/lang/String;Ljava/lang/Object;)V",
        "registerClient",
        "Ljava/util/Map;",
        "d",
        "Lcom/appsflyer/internal/AFa1lSDK;",
        "AFKeystoreWrapper",
        "AFa1zSDK"
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
.field public static final AFa1zSDK:Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field final registerClient:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field final unregisterClient:Lcom/appsflyer/internal/AFa1lSDK;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/appsflyer/internal/AFa1kSDK;->AFa1zSDK:Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;

    return-void
.end method

.method private constructor <init>(Ljava/util/Map;Lcom/appsflyer/internal/AFa1lSDK;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/appsflyer/internal/AFa1lSDK;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/appsflyer/internal/AFa1kSDK;->registerClient:Ljava/util/Map;

    .line 3
    iput-object p2, p0, Lcom/appsflyer/internal/AFa1kSDK;->unregisterClient:Lcom/appsflyer/internal/AFa1lSDK;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Lcom/appsflyer/internal/AFa1lSDK;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/AFa1kSDK;-><init>(Ljava/util/Map;Lcom/appsflyer/internal/AFa1lSDK;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Lcom/appsflyer/internal/AFa1lSDK;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/AFa1kSDK;-><init>(Ljava/util/Map;Lcom/appsflyer/internal/AFa1lSDK;)V

    return-void
.end method

.method public static final unregisterClient(Lcom/appsflyer/internal/AFa1lSDK;)Lcom/appsflyer/internal/AFa1kSDK;
    .locals 0
    .param p0    # Lcom/appsflyer/internal/AFa1lSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;->d(Lcom/appsflyer/internal/AFa1lSDK;)Lcom/appsflyer/internal/AFa1kSDK;

    move-result-object p0

    return-object p0
.end method

.method public static final unregisterClient(Ljava/util/Map;)Lcom/appsflyer/internal/AFa1kSDK;
    .locals 0
    .param p0    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/appsflyer/internal/AFa1kSDK;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-static {p0}, Lcom/appsflyer/internal/AFa1kSDK$AFa1zSDK;->AFLogger(Ljava/util/Map;)Lcom/appsflyer/internal/AFa1kSDK;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final unregisterClient(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/appsflyer/internal/AFa1kSDK;->registerClient:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object p1, p0, Lcom/appsflyer/internal/AFa1kSDK;->unregisterClient:Lcom/appsflyer/internal/AFa1lSDK;

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/appsflyer/internal/AFa1kSDK;->registerClient:Ljava/util/Map;

    invoke-interface {p1, p2}, Lcom/appsflyer/internal/AFa1lSDK;->d(Ljava/util/Map;)V

    :cond_0
    return-void
.end method
