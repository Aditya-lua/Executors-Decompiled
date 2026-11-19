.class public final Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0008\u0006\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;",
        "",
        "<init>",
        "()V",
        "INSTANCE",
        "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;",
        "INSTANCE$1",
        "getInstance",
        "context",
        "Landroid/content/Context;",
        "serverEndpoint",
        "",
        "newTrackingEventsServiceComponent",
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
.field public static final INSTANCE:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static volatile INSTANCE$1:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;->INSTANCE:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final newTrackingEventsServiceComponent(Landroid/content/Context;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;
    .locals 8

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent;->builder()Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$Builder;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;

    invoke-direct {v1, p1, p2}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$Builder;->trackingEventsServiceModule(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;)Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$Builder;->networkCoreModule(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$Builder;->build()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method


# virtual methods
.method public final getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;->INSTANCE$1:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;->INSTANCE$1:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;

    if-nez v0, :cond_0

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;->INSTANCE:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;

    invoke-direct {v0, p1, p2}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;->newTrackingEventsServiceComponent(Landroid/content/Context;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;->INSTANCE$1:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0

    throw p1

    :cond_1
    return-object v0
.end method
