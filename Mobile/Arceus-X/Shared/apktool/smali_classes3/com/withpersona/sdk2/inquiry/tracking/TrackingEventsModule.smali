.class public final Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001a\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u000c\u00a2\u0006\u0002\u0008\r0\u000bH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;",
        "",
        "",
        "trackingEventServerEndpoint",
        "<init>",
        "(Ljava/lang/String;)V",
        "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;",
        "factory",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "trackingEventsLogger",
        "(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "",
        "Lum/h$e;",
        "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;",
        "provideMoshiJsonAdapterFactory",
        "()Ljava/util/Set;",
        "Ljava/lang/String;",
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


# instance fields
.field private final trackingEventServerEndpoint:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;->trackingEventServerEndpoint:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final provideMoshiJsonAdapterFactory()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lum/h$e;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$Companion;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$Companion;->createAdapter()Lum/h$e;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/p0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final trackingEventsLogger(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;->trackingEventServerEndpoint:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;->create(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;

    move-result-object p1

    return-object p1
.end method
