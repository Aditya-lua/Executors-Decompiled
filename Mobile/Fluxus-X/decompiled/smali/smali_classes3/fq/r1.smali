.class public final Lfq/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lfq/n1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lfq/o0$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lfq/u;",
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
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lfq/o0$a;",
            ">;",
            "Lwt/i<",
            "Lfq/u;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/r1;->a:Lwt/i;

    iput-object p2, p0, Lfq/r1;->b:Lwt/i;

    iput-object p3, p0, Lfq/r1;->c:Lwt/i;

    iput-object p4, p0, Lfq/r1;->d:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lfq/r1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lfq/o0$a;",
            ">;",
            "Lwt/i<",
            "Lfq/u;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lfq/r1;"
        }
    .end annotation

    new-instance v0, Lfq/r1;

    invoke-direct {v0, p0, p1, p2, p3}, Lfq/r1;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lfq/o0$a;Lfq/u;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lfq/n1;
    .locals 1

    new-instance v0, Lfq/n1;

    invoke-direct {v0, p0, p1, p2, p3}, Lfq/n1;-><init>(Landroid/content/Context;Lfq/o0$a;Lfq/u;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b()Lfq/n1;
    .locals 4

    iget-object v0, p0, Lfq/r1;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lfq/r1;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfq/o0$a;

    iget-object v2, p0, Lfq/r1;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfq/u;

    iget-object v3, p0, Lfq/r1;->d:Lwt/i;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {v0, v1, v2, v3}, Lfq/r1;->c(Landroid/content/Context;Lfq/o0$a;Lfq/u;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lfq/n1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfq/r1;->b()Lfq/n1;

    move-result-object v0

    return-object v0
.end method
