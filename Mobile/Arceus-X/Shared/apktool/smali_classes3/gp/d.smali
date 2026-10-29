.class public final Lgp/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
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
            "Lgp/w;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lgp/y;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ldp/i;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lwp/c;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lyn/a;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lep/a;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lgp/w;",
            ">;",
            "Lft/i<",
            "Lgp/y;",
            ">;",
            "Lft/i<",
            "Ldp/i;",
            ">;",
            "Lft/i<",
            "Lwp/c;",
            ">;",
            "Lft/i<",
            "Lyn/a;",
            ">;",
            "Lft/i<",
            "Lep/a;",
            ">;",
            "Lft/i<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgp/d;->a:Lft/i;

    iput-object p2, p0, Lgp/d;->b:Lft/i;

    iput-object p3, p0, Lgp/d;->c:Lft/i;

    iput-object p4, p0, Lgp/d;->d:Lft/i;

    iput-object p5, p0, Lgp/d;->e:Lft/i;

    iput-object p6, p0, Lgp/d;->f:Lft/i;

    iput-object p7, p0, Lgp/d;->g:Lft/i;

    iput-object p8, p0, Lgp/d;->h:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lgp/d;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lgp/w;",
            ">;",
            "Lft/i<",
            "Lgp/y;",
            ">;",
            "Lft/i<",
            "Ldp/i;",
            ">;",
            "Lft/i<",
            "Lwp/c;",
            ">;",
            "Lft/i<",
            "Lyn/a;",
            ">;",
            "Lft/i<",
            "Lep/a;",
            ">;",
            "Lft/i<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lgp/d;"
        }
    .end annotation

    new-instance v0, Lgp/d;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lgp/d;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lgp/w;Lgp/y;Ldp/i;Lwp/c;Lyn/a;Lep/a;Z)Lcom/withpersona/sdk2/inquiry/internal/network/e;
    .locals 9

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/e;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/withpersona/sdk2/inquiry/internal/network/e;-><init>(Landroid/content/Context;Lgp/w;Lgp/y;Ldp/i;Lwp/c;Lyn/a;Lep/a;Z)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/internal/network/e;
    .locals 9

    iget-object v0, p0, Lgp/d;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lgp/d;->b:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lgp/w;

    iget-object v0, p0, Lgp/d;->c:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lgp/y;

    iget-object v0, p0, Lgp/d;->d:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ldp/i;

    iget-object v0, p0, Lgp/d;->e:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lwp/c;

    iget-object v0, p0, Lgp/d;->f:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lyn/a;

    iget-object v0, p0, Lgp/d;->g:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lep/a;

    iget-object v0, p0, Lgp/d;->h:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-static/range {v1 .. v8}, Lgp/d;->c(Landroid/content/Context;Lgp/w;Lgp/y;Ldp/i;Lwp/c;Lyn/a;Lep/a;Z)Lcom/withpersona/sdk2/inquiry/internal/network/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgp/d;->b()Lcom/withpersona/sdk2/inquiry/internal/network/e;

    move-result-object v0

    return-object v0
.end method
