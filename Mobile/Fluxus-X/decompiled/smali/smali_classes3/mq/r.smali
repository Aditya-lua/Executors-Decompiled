.class public final Lmq/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lmq/p;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lsn/t;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lsn/b1;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lun/i0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lsn/t;",
            ">;",
            "Lwt/i<",
            "Lsn/b1;",
            ">;",
            "Lwt/i<",
            "Lun/i0;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/r;->a:Lwt/i;

    iput-object p2, p0, Lmq/r;->b:Lwt/i;

    iput-object p3, p0, Lmq/r;->c:Lwt/i;

    iput-object p4, p0, Lmq/r;->d:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lmq/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lsn/t;",
            ">;",
            "Lwt/i<",
            "Lsn/b1;",
            ">;",
            "Lwt/i<",
            "Lun/i0;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lmq/r;"
        }
    .end annotation

    new-instance v0, Lmq/r;

    invoke-direct {v0, p0, p1, p2, p3}, Lmq/r;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lsn/t;Ltt/a;Lun/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lmq/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsn/t;",
            "Ltt/a<",
            "Lsn/b1;",
            ">;",
            "Lun/i0;",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ")",
            "Lmq/p;"
        }
    .end annotation

    new-instance v0, Lmq/p;

    invoke-direct {v0, p0, p1, p2, p3}, Lmq/p;-><init>(Lsn/t;Ltt/a;Lun/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b()Lmq/p;
    .locals 4

    iget-object v0, p0, Lmq/r;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsn/t;

    iget-object v1, p0, Lmq/r;->b:Lwt/i;

    invoke-static {v1}, Lwt/c;->b(Lwt/i;)Ltt/a;

    move-result-object v1

    iget-object v2, p0, Lmq/r;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lun/i0;

    iget-object v3, p0, Lmq/r;->d:Lwt/i;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {v0, v1, v2, v3}, Lmq/r;->c(Lsn/t;Ltt/a;Lun/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lmq/p;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmq/r;->b()Lmq/p;

    move-result-object v0

    return-object v0
.end method
