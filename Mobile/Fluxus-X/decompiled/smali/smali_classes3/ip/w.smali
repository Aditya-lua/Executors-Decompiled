.class public final Lip/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lip/v;",
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
            "Lsn/a0$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lun/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lir/b;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
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
            "Lsn/a0$a;",
            ">;",
            "Lwt/i<",
            "Lun/c$a;",
            ">;",
            "Lwt/i<",
            "Lir/b;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lip/w;->a:Lwt/i;

    iput-object p2, p0, Lip/w;->b:Lwt/i;

    iput-object p3, p0, Lip/w;->c:Lwt/i;

    iput-object p4, p0, Lip/w;->d:Lwt/i;

    iput-object p5, p0, Lip/w;->e:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lip/w;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lsn/a0$a;",
            ">;",
            "Lwt/i<",
            "Lun/c$a;",
            ">;",
            "Lwt/i<",
            "Lir/b;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lip/w;"
        }
    .end annotation

    new-instance v0, Lip/w;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lip/w;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lsn/a0$a;Lun/c$a;Lir/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lip/v;
    .locals 6

    new-instance v0, Lip/v;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lip/v;-><init>(Landroid/content/Context;Lsn/a0$a;Lun/c$a;Lir/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b()Lip/v;
    .locals 5

    iget-object v0, p0, Lip/w;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lip/w;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsn/a0$a;

    iget-object v2, p0, Lip/w;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lun/c$a;

    iget-object v3, p0, Lip/w;->d:Lwt/i;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lir/b;

    iget-object v4, p0, Lip/w;->e:Lwt/i;

    invoke-interface {v4}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {v0, v1, v2, v3, v4}, Lip/w;->c(Landroid/content/Context;Lsn/a0$a;Lun/c$a;Lir/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lip/v;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lip/w;->b()Lip/v;

    move-result-object v0

    return-object v0
.end method
