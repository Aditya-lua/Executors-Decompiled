.class public final Lyp/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/selfie/g;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lpq/c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lpq/c;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/w;->a:Lft/i;

    iput-object p2, p0, Lyp/w;->b:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;)Lyp/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lpq/c;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lyp/w;"
        }
    .end annotation

    new-instance v0, Lyp/w;

    invoke-direct {v0, p0, p1}, Lyp/w;-><init>(Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lcom/withpersona/sdk2/inquiry/selfie/g;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/g;-><init>(Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/selfie/g;
    .locals 2

    iget-object v0, p0, Lyp/w;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpq/c;

    iget-object v1, p0, Lyp/w;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {v0, v1}, Lyp/w;->c(Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lcom/withpersona/sdk2/inquiry/selfie/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyp/w;->b()Lcom/withpersona/sdk2/inquiry/selfie/g;

    move-result-object v0

    return-object v0
.end method
