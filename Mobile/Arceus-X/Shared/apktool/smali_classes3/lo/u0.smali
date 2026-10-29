.class public final Llo/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Llo/t0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Loo/a$b;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ltr/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/camera/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lhn/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Luq/a;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;",
            ">;",
            "Lft/i<",
            "Loo/a$b;",
            ">;",
            "Lft/i<",
            "Ltr/b$a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/camera/e$a;",
            ">;",
            "Lft/i<",
            "Lhn/c$a;",
            ">;",
            "Lft/i<",
            "Luq/a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo/u0;->a:Lft/i;

    iput-object p2, p0, Llo/u0;->b:Lft/i;

    iput-object p3, p0, Llo/u0;->c:Lft/i;

    iput-object p4, p0, Llo/u0;->d:Lft/i;

    iput-object p5, p0, Llo/u0;->e:Lft/i;

    iput-object p6, p0, Llo/u0;->f:Lft/i;

    iput-object p7, p0, Llo/u0;->g:Lft/i;

    iput-object p8, p0, Llo/u0;->h:Lft/i;

    iput-object p9, p0, Llo/u0;->i:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Llo/u0;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;",
            ">;",
            "Lft/i<",
            "Loo/a$b;",
            ">;",
            "Lft/i<",
            "Ltr/b$a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/camera/e$a;",
            ">;",
            "Lft/i<",
            "Lhn/c$a;",
            ">;",
            "Lft/i<",
            "Luq/a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Llo/u0;"
        }
    .end annotation

    new-instance v0, Llo/u0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Llo/u0;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/f$a;Loo/a$b;Ltr/b$a;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Llo/t0;
    .locals 10

    new-instance v0, Llo/t0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Llo/t0;-><init>(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/f$a;Loo/a$b;Ltr/b$a;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b()Llo/t0;
    .locals 10

    iget-object v0, p0, Llo/u0;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Llo/u0;->b:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iget-object v0, p0, Llo/u0;->c:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/f$a;

    iget-object v0, p0, Llo/u0;->d:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Loo/a$b;

    iget-object v0, p0, Llo/u0;->e:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ltr/b$a;

    iget-object v0, p0, Llo/u0;->f:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/withpersona/sdk2/camera/e$a;

    iget-object v0, p0, Llo/u0;->g:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lhn/c$a;

    iget-object v0, p0, Llo/u0;->h:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Luq/a;

    iget-object v0, p0, Llo/u0;->i:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static/range {v1 .. v9}, Llo/u0;->c(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/f$a;Loo/a$b;Ltr/b$a;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Llo/t0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llo/u0;->b()Llo/t0;

    move-result-object v0

    return-object v0
.end method
