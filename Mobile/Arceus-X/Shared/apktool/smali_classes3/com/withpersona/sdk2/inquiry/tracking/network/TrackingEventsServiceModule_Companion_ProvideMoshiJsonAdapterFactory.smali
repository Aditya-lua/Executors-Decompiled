.class public final Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Ljava/util/Set<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory$InstanceHolder;->INSTANCE:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory;

    return-object v0
.end method

.method public static provideMoshiJsonAdapter()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;->Companion:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule$Companion;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule$Companion;->provideMoshiJsonAdapter()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory;->get()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory;->provideMoshiJsonAdapter()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
