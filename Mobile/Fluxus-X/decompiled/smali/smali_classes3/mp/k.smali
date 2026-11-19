.class public final Lmp/k;
.super Ljava/lang/Object;
.source "SourceFile"


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
            "Lir/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Llp/c$a;",
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

.field public final e:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lav/p0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lir/b;",
            ">;",
            "Lwt/i<",
            "Llp/c$a;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp/k;->a:Lwt/i;

    iput-object p2, p0, Lmp/k;->b:Lwt/i;

    iput-object p3, p0, Lmp/k;->c:Lwt/i;

    iput-object p4, p0, Lmp/k;->d:Lwt/i;

    iput-object p5, p0, Lmp/k;->e:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lmp/k;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lir/b;",
            ">;",
            "Lwt/i<",
            "Llp/c$a;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;",
            "Lwt/i<",
            "Lav/p0;",
            ">;)",
            "Lmp/k;"
        }
    .end annotation

    new-instance v0, Lmp/k;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lmp/k;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Llp/v$b;Landroidx/lifecycle/l0;Landroid/content/Context;Lir/b;Llp/c$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lav/p0;)Lmp/j;
    .locals 8

    new-instance v0, Lmp/j;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lmp/j;-><init>(Llp/v$b;Landroidx/lifecycle/l0;Landroid/content/Context;Lir/b;Llp/c$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lav/p0;)V

    return-object v0
.end method


# virtual methods
.method public b(Llp/v$b;Landroidx/lifecycle/l0;)Lmp/j;
    .locals 8

    iget-object v0, p0, Lmp/k;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/content/Context;

    iget-object v0, p0, Lmp/k;->b:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lir/b;

    iget-object v0, p0, Lmp/k;->c:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Llp/c$a;

    iget-object v0, p0, Lmp/k;->d:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iget-object v0, p0, Lmp/k;->e:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lav/p0;

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v1 .. v7}, Lmp/k;->c(Llp/v$b;Landroidx/lifecycle/l0;Landroid/content/Context;Lir/b;Llp/c$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lav/p0;)Lmp/j;

    move-result-object p1

    return-object p1
.end method
