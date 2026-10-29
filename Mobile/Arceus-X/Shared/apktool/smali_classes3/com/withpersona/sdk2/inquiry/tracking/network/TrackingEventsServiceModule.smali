.class public final Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0014\u0010\t\u001a\u00070\u0004\u00a2\u0006\u0002\u0008\u0008H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
        "",
        "Landroid/content/Context;",
        "context",
        "",
        "trackingEventsServiceServerEndpoint",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "Lcom/withpersona/sdk2/inquiry/network/core/ServerEndpoint;",
        "serverEndpoint",
        "()Ljava/lang/String;",
        "provideContext",
        "()Landroid/content/Context;",
        "Ljv/y;",
        "retrofit",
        "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;",
        "provideTrackingEventsServiceApi",
        "(Ljv/y;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;",
        "Landroid/content/Context;",
        "Ljava/lang/String;",
        "Companion",
        "tracking-events_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final trackingEventsServiceServerEndpoint:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;->trackingEventsServiceServerEndpoint:Ljava/lang/String;

    return-void
.end method

.method public static final provideMoshiJsonAdapter()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule$Companion;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule$Companion;->provideMoshiJsonAdapter()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static final provideMoshiJsonAdapterBinding()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule$Companion;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule$Companion;->provideMoshiJsonAdapterBinding()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final provideContext()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final provideTrackingEventsServiceApi(Ljv/y;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;
    .locals 1
    .param p1    # Ljv/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;

    invoke-virtual {p1, v0}, Ljv/y;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;

    return-object p1
.end method

.method public final serverEndpoint()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;->trackingEventsServiceServerEndpoint:Ljava/lang/String;

    return-object v0
.end method
