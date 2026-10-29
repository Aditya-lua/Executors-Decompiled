.class public final Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;


# instance fields
.field private final delegateFactory:Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory_Impl;->delegateFactory:Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;

    return-void
.end method

.method public static create(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;)Lht/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;",
            ")",
            "Lht/a<",
            "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory_Impl;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory_Impl;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method

.method public static createFactoryProvider(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Factory;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory_Impl;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory_Impl;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory_Impl;->delegateFactory:Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;

    invoke-virtual {v0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger_Factory;->get(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;

    move-result-object p1

    return-object p1
.end method
