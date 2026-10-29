.class public final Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final cacheProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;",
            ">;"
        }
    .end annotation
.end field

.field private final contextProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final coroutineScopeProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lku/p0;",
            ">;"
        }
    .end annotation
.end field

.field private final featureFlagManagerProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lgo/e;",
            ">;"
        }
    .end annotation
.end field

.field private final metadataProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final moshiProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lum/w;",
            ">;"
        }
    .end annotation
.end field

.field private final networkStateManagerProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ">;"
        }
    .end annotation
.end field

.field private final sdkFilesManagerProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lqq/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;",
            ">;",
            "Lft/i<",
            "Lum/w;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;",
            ">;",
            "Lft/i<",
            "Lqq/c;",
            ">;",
            "Lft/i<",
            "Lgo/e;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->contextProvider:Lft/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->cacheProvider:Lft/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->moshiProvider:Lft/i;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->metadataProvider:Lft/i;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->sdkFilesManagerProvider:Lft/i;

    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->featureFlagManagerProvider:Lft/i;

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->coroutineScopeProvider:Lft/i;

    iput-object p8, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->networkStateManagerProvider:Lft/i;

    return-void
.end method

.method public static create(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;",
            ">;",
            "Lft/i<",
            "Lum/w;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;",
            ">;",
            "Lft/i<",
            "Lqq/c;",
            ">;",
            "Lft/i<",
            "Lgo/e;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;",
            "Lft/i<",
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

    invoke-direct/range {v0 .. v8}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static newInstance(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lum/w;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Lqq/c;Lgo/e;Ljava/lang/String;Lku/p0;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;
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

    invoke-direct/range {v0 .. v9}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;-><init>(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lum/w;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Lqq/c;Lgo/e;Ljava/lang/String;Lku/p0;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)V

    return-object v0
.end method


# virtual methods
.method public get(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;
    .locals 10

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->contextProvider:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->cacheProvider:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->moshiProvider:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lum/w;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->metadataProvider:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->sdkFilesManagerProvider:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lqq/c;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->featureFlagManagerProvider:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lgo/e;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->coroutineScopeProvider:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lku/p0;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->networkStateManagerProvider:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;

    move-object v7, p1

    invoke-static/range {v1 .. v9}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->newInstance(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lum/w;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Lqq/c;Lgo/e;Ljava/lang/String;Lku/p0;Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;)Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;

    move-result-object p1

    return-object p1
.end method
