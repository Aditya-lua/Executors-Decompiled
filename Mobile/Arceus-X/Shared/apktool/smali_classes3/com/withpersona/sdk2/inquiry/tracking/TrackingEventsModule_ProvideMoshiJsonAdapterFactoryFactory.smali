.class public final Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Ljava/util/Set<",
        "Lum/h$e;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final module:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;


# direct methods
.method private constructor <init>(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory;->module:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    return-void
.end method

.method public static create(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;)V

    return-object v0
.end method

.method public static provideMoshiJsonAdapterFactory(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;",
            ")",
            "Ljava/util/Set<",
            "Lum/h$e;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;->provideMoshiJsonAdapterFactory()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory;->get()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lum/h$e;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory;->module:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory;->provideMoshiJsonAdapterFactory(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
