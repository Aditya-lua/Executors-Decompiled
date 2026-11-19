.class public final Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final cacheProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;",
            ">;"
        }
    .end annotation
.end field

.field private final contextProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final coroutineScopeProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lav/p0;",
            ">;"
        }
    .end annotation
.end field

.field private final featureFlagManagerProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lto/e;",
            ">;"
        }
    .end annotation
.end field

.field private final metadataProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final moshiProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lhn/w;",
            ">;"
        }
    .end annotation
.end field

.field private final networkStateManagerProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ">;"
        }
    .end annotation
.end field

.field private final sdkFilesManagerProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ler/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;",
            ">;",
            "Lwt/i<",
            "Lhn/w;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;",
            ">;",
            "Lwt/i<",
            "Ler/c;",
            ">;",
            "Lwt/i<",
            "Lto/e;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->contextProvider:Lwt/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->cacheProvider:Lwt/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->moshiProvider:Lwt/i;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->metadataProvider:Lwt/i;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->sdkFilesManagerProvider:Lwt/i;

    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->featureFlagManagerProvider:Lwt/i;

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->coroutineScopeProvider:Lwt/i;

    iput-object p8, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->networkStateManagerProvider:Lwt/i;

    return-void
.end method

.method public static create(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;",
            ">;",
            "Lwt/i<",
            "Lhn/w;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;",
            ">;",
            "Lwt/i<",
            "Ler/c;",
            ">;",
            "Lwt/i<",
            "Lto/e;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static newInstance(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lhn/w;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Ler/c;Lto/e;Ljava/lang/String;Lav/p0;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;
    .locals 10

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;-><init>(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lhn/w;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Ler/c;Lto/e;Ljava/lang/String;Lav/p0;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)V

    return-object v0
.end method


# virtual methods
.method public get(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;
    .locals 10

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->contextProvider:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->cacheProvider:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->moshiProvider:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lhn/w;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->metadataProvider:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->sdkFilesManagerProvider:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ler/c;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->featureFlagManagerProvider:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lto/e;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->coroutineScopeProvider:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lav/p0;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->networkStateManagerProvider:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;

    move-object v7, p1

    invoke-static/range {v1 .. v9}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->newInstance(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lhn/w;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Ler/c;Lto/e;Ljava/lang/String;Lav/p0;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;

    move-result-object p1

    return-object p1
.end method
