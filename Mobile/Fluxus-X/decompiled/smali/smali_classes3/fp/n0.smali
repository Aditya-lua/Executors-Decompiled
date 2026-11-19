.class public final Lfp/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lfp/m0;",
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
            "Lvo/o$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcp/a$b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljs/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lsn/a0$a;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lun/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lir/b;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lhq/i$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lvo/o$a;",
            ">;",
            "Lwt/i<",
            "Lcp/a$b;",
            ">;",
            "Lwt/i<",
            "Ljs/b$a;",
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
            ">;",
            "Lwt/i<",
            "Lhq/i$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/n0;->a:Lwt/i;

    iput-object p2, p0, Lfp/n0;->b:Lwt/i;

    iput-object p3, p0, Lfp/n0;->c:Lwt/i;

    iput-object p4, p0, Lfp/n0;->d:Lwt/i;

    iput-object p5, p0, Lfp/n0;->e:Lwt/i;

    iput-object p6, p0, Lfp/n0;->f:Lwt/i;

    iput-object p7, p0, Lfp/n0;->g:Lwt/i;

    iput-object p8, p0, Lfp/n0;->h:Lwt/i;

    iput-object p9, p0, Lfp/n0;->i:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lfp/n0;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lvo/o$a;",
            ">;",
            "Lwt/i<",
            "Lcp/a$b;",
            ">;",
            "Lwt/i<",
            "Ljs/b$a;",
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
            ">;",
            "Lwt/i<",
            "Lhq/i$a;",
            ">;)",
            "Lfp/n0;"
        }
    .end annotation

    new-instance v0, Lfp/n0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lfp/n0;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lvo/o$a;Lcp/a$b;Ljs/b$a;Lsn/a0$a;Lun/c$a;Lir/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lhq/i$a;)Lfp/m0;
    .locals 10

    new-instance v0, Lfp/m0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lfp/m0;-><init>(Landroid/content/Context;Lvo/o$a;Lcp/a$b;Ljs/b$a;Lsn/a0$a;Lun/c$a;Lir/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lhq/i$a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lfp/m0;
    .locals 10

    iget-object v0, p0, Lfp/n0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lfp/n0;->b:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lvo/o$a;

    iget-object v0, p0, Lfp/n0;->c:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcp/a$b;

    iget-object v0, p0, Lfp/n0;->d:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljs/b$a;

    iget-object v0, p0, Lfp/n0;->e:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lsn/a0$a;

    iget-object v0, p0, Lfp/n0;->f:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lun/c$a;

    iget-object v0, p0, Lfp/n0;->g:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lir/b;

    iget-object v0, p0, Lfp/n0;->h:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iget-object v0, p0, Lfp/n0;->i:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lhq/i$a;

    invoke-static/range {v1 .. v9}, Lfp/n0;->c(Landroid/content/Context;Lvo/o$a;Lcp/a$b;Ljs/b$a;Lsn/a0$a;Lun/c$a;Lir/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lhq/i$a;)Lfp/m0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfp/n0;->b()Lfp/m0;

    move-result-object v0

    return-object v0
.end method
