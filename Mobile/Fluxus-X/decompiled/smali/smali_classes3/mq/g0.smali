.class public final Lmq/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lmq/f0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ldr/c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Ldr/c;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/g0;->a:Lwt/i;

    iput-object p2, p0, Lmq/g0;->b:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;)Lmq/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Ldr/c;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lmq/g0;"
        }
    .end annotation

    new-instance v0, Lmq/g0;

    invoke-direct {v0, p0, p1}, Lmq/g0;-><init>(Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Ldr/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lmq/f0;
    .locals 1

    new-instance v0, Lmq/f0;

    invoke-direct {v0, p0, p1}, Lmq/f0;-><init>(Ldr/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b()Lmq/f0;
    .locals 2

    iget-object v0, p0, Lmq/g0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr/c;

    iget-object v1, p0, Lmq/g0;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {v0, v1}, Lmq/g0;->c(Ldr/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lmq/f0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmq/g0;->b()Lmq/f0;

    move-result-object v0

    return-object v0
.end method
