.class public final Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;

.field private final retrofitProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljv/y;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lft/i<",
            "Ljv/y;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;->module:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;->retrofitProvider:Lft/i;

    return-void
.end method

.method public static create(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lft/i;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lft/i<",
            "Ljv/y;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lft/i;)V

    return-object v0
.end method

.method public static provideTrackingEventsServiceApi(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Ljv/y;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;->provideTrackingEventsServiceApi(Ljv/y;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;->module:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;->retrofitProvider:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljv/y;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;->provideTrackingEventsServiceApi(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Ljv/y;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;->get()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;

    move-result-object v0

    return-object v0
.end method
