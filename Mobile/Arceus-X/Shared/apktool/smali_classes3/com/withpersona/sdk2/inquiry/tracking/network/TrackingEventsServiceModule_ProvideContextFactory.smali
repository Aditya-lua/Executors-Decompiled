.class public final Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideContextFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Landroid/content/Context;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;


# direct methods
.method private constructor <init>(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideContextFactory;->module:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;

    return-void
.end method

.method public static create(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideContextFactory;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideContextFactory;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideContextFactory;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;)V

    return-object v0
.end method

.method public static provideContext(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;)Landroid/content/Context;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;->provideContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public get()Landroid/content/Context;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideContextFactory;->module:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideContextFactory;->provideContext(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;)Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideContextFactory;->get()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method
