.class public final Lup/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
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
            "Lup/w;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lup/y;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lrp/i;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lkq/c;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmo/a;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lsp/a;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lup/w;",
            ">;",
            "Lwt/i<",
            "Lup/y;",
            ">;",
            "Lwt/i<",
            "Lrp/i;",
            ">;",
            "Lwt/i<",
            "Lkq/c;",
            ">;",
            "Lwt/i<",
            "Lmo/a;",
            ">;",
            "Lwt/i<",
            "Lsp/a;",
            ">;",
            "Lwt/i<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lup/d;->a:Lwt/i;

    iput-object p2, p0, Lup/d;->b:Lwt/i;

    iput-object p3, p0, Lup/d;->c:Lwt/i;

    iput-object p4, p0, Lup/d;->d:Lwt/i;

    iput-object p5, p0, Lup/d;->e:Lwt/i;

    iput-object p6, p0, Lup/d;->f:Lwt/i;

    iput-object p7, p0, Lup/d;->g:Lwt/i;

    iput-object p8, p0, Lup/d;->h:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lup/d;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lup/w;",
            ">;",
            "Lwt/i<",
            "Lup/y;",
            ">;",
            "Lwt/i<",
            "Lrp/i;",
            ">;",
            "Lwt/i<",
            "Lkq/c;",
            ">;",
            "Lwt/i<",
            "Lmo/a;",
            ">;",
            "Lwt/i<",
            "Lsp/a;",
            ">;",
            "Lwt/i<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lup/d;"
        }
    .end annotation

    new-instance v0, Lup/d;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lup/d;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lup/w;Lup/y;Lrp/i;Lkq/c;Lmo/a;Lsp/a;Z)Lcom/withpersona/sdk2/inquiry/internal/network/e;
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

    invoke-direct/range {v0 .. v8}, Lcom/withpersona/sdk2/inquiry/internal/network/e;-><init>(Landroid/content/Context;Lup/w;Lup/y;Lrp/i;Lkq/c;Lmo/a;Lsp/a;Z)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/internal/network/e;
    .locals 9

    iget-object v0, p0, Lup/d;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lup/d;->b:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lup/w;

    iget-object v0, p0, Lup/d;->c:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lup/y;

    iget-object v0, p0, Lup/d;->d:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lrp/i;

    iget-object v0, p0, Lup/d;->e:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lkq/c;

    iget-object v0, p0, Lup/d;->f:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lmo/a;

    iget-object v0, p0, Lup/d;->g:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lsp/a;

    iget-object v0, p0, Lup/d;->h:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-static/range {v1 .. v8}, Lup/d;->c(Landroid/content/Context;Lup/w;Lup/y;Lrp/i;Lkq/c;Lmo/a;Lsp/a;Z)Lcom/withpersona/sdk2/inquiry/internal/network/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lup/d;->b()Lcom/withpersona/sdk2/inquiry/internal/network/e;

    move-result-object v0

    return-object v0
.end method
