.class public final Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;",
        ">;"
    }
.end annotation


# instance fields
.field private final trackingEventsServiceApiProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService_Factory;->trackingEventsServiceApiProvider:Lft/i;

    return-void
.end method

.method public static create(Lft/i;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService_Factory;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService_Factory;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static newInstance(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService_Factory;->trackingEventsServiceApiProvider:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService_Factory;->newInstance(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService_Factory;->get()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;

    move-result-object v0

    return-object v0
.end method
