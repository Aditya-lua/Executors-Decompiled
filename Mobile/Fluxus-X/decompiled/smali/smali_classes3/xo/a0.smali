.class public final Lxo/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lxo/z;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lsn/h0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lsn/t;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lto/e;",
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
            "Lsn/h0;",
            ">;",
            "Lwt/i<",
            "Lsn/t;",
            ">;",
            "Lwt/i<",
            "Lto/e;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/a0;->a:Lwt/i;

    iput-object p2, p0, Lxo/a0;->b:Lwt/i;

    iput-object p3, p0, Lxo/a0;->c:Lwt/i;

    iput-object p4, p0, Lxo/a0;->d:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lxo/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lsn/h0;",
            ">;",
            "Lwt/i<",
            "Lsn/t;",
            ">;",
            "Lwt/i<",
            "Lto/e;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lxo/a0;"
        }
    .end annotation

    new-instance v0, Lxo/a0;

    invoke-direct {v0, p0, p1, p2, p3}, Lxo/a0;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lsn/h0;Lsn/t;Lto/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lxo/z;
    .locals 1

    new-instance v0, Lxo/z;

    invoke-direct {v0, p0, p1, p2, p3}, Lxo/z;-><init>(Lsn/h0;Lsn/t;Lto/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b()Lxo/z;
    .locals 4

    iget-object v0, p0, Lxo/a0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsn/h0;

    iget-object v1, p0, Lxo/a0;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsn/t;

    iget-object v2, p0, Lxo/a0;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lto/e;

    iget-object v3, p0, Lxo/a0;->d:Lwt/i;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {v0, v1, v2, v3}, Lxo/a0;->c(Lsn/h0;Lsn/t;Lto/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lxo/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxo/a0;->b()Lxo/z;

    move-result-object v0

    return-object v0
.end method
