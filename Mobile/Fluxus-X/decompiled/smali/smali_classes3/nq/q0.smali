.class public final Lnq/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lnq/p0;",
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
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lto/e;",
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
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Lwt/i<",
            "Lto/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq/q0;->a:Lwt/i;

    iput-object p2, p0, Lnq/q0;->b:Lwt/i;

    iput-object p3, p0, Lnq/q0;->c:Lwt/i;

    iput-object p4, p0, Lnq/q0;->d:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lnq/q0;
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
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Lwt/i<",
            "Lto/e;",
            ">;)",
            "Lnq/q0;"
        }
    .end annotation

    new-instance v0, Lnq/q0;

    invoke-direct {v0, p0, p1, p2, p3}, Lnq/q0;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lsn/t;Ltt/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lto/e;)Lnq/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsn/t;",
            "Ltt/a<",
            "Lsn/b1;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            "Lto/e;",
            ")",
            "Lnq/p0;"
        }
    .end annotation

    new-instance v0, Lnq/p0;

    invoke-direct {v0, p0, p1, p2, p3}, Lnq/p0;-><init>(Lsn/t;Ltt/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lto/e;)V

    return-object v0
.end method


# virtual methods
.method public b()Lnq/p0;
    .locals 4

    iget-object v0, p0, Lnq/q0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsn/t;

    iget-object v1, p0, Lnq/q0;->b:Lwt/i;

    invoke-static {v1}, Lwt/c;->b(Lwt/i;)Ltt/a;

    move-result-object v1

    iget-object v2, p0, Lnq/q0;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iget-object v3, p0, Lnq/q0;->d:Lwt/i;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lto/e;

    invoke-static {v0, v1, v2, v3}, Lnq/q0;->c(Lsn/t;Ltt/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lto/e;)Lnq/p0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnq/q0;->b()Lnq/p0;

    move-result-object v0

    return-object v0
.end method
