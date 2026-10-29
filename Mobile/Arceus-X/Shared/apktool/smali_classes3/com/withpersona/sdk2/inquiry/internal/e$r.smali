.class public final Lcom/withpersona/sdk2/inquiry/internal/e$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsr/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "r"
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

.field public final b:Lcom/withpersona/sdk2/inquiry/internal/e$r;

.field public c:Lqp/k;

.field public d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/nfc/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Llp/o;

.field public f:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Llp/n$a;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lor/l1;

.field public h:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/d$a;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lor/k6;

.field public j:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/k$a;",
            ">;"
        }
    .end annotation
.end field

.field public k:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lqr/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public m:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/h$a;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lrr/e0;",
            ">;"
        }
    .end annotation
.end field

.field public o:Ltp/d;

.field public p:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public q:Lrr/h1;

.field public r:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lrr/g1$e;",
            ">;"
        }
    .end annotation
.end field

.field public s:Lsr/d;

.field public t:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->b:Lcom/withpersona/sdk2/inquiry/internal/e$r;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/e$r;->b(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$r;->c(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;)V

    return-void
.end method

.method public final b(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;)V
    .locals 13

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->o1:Lft/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lft/i;

    iget-object v2, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a0:Lft/i;

    iget-object v3, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Lft/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->x:Lft/i;

    invoke-static {v0, v1, v2, v3, p1}, Lqp/k;->a(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lqp/k;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->c:Lqp/k;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/nfc/c;->b(Lqp/k;)Lft/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->d:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->p1:Lft/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lft/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a0:Lft/i;

    invoke-static {v0, v1, p1}, Llp/o;->a(Lft/i;Lft/i;Lft/i;)Llp/o;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->e:Llp/o;

    invoke-static {p1}, Llp/p;->b(Llp/o;)Lft/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->f:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->q1:Lft/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->V0:Lft/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->r1:Lft/i;

    invoke-static {v0, v1, p1}, Lor/l1;->a(Lft/i;Lft/i;Lft/i;)Lor/l1;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->g:Lor/l1;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/ui/e;->b(Lor/l1;)Lft/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->h:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->r1:Lft/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->q1:Lft/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D:Lft/i;

    invoke-static {v0, v1, p1}, Lor/k6;->a(Lft/i;Lft/i;Lft/i;)Lor/k6;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->i:Lor/k6;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/ui/l;->b(Lor/k6;)Lft/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->j:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->q1:Lft/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/ui/network/c;->a(Lft/i;)Lcom/withpersona/sdk2/inquiry/ui/network/c;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->k:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->q1:Lft/i;

    invoke-static {p1}, Lqr/b;->a(Lft/i;)Lqr/b;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->l:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->s1:Lft/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->h1:Lft/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lft/i;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/ui/i;->a(Lft/i;Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/ui/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->m:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lft/i;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->k:Lft/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->l:Lft/i;

    invoke-static {}, Lzq/b;->a()Lzq/b;

    move-result-object v2

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->m:Lft/i;

    invoke-static {p1, v0, v1, v2, v3}, Lrr/f0;->a(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lrr/f0;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->n:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->Q0:Lft/i;

    invoke-static {p1}, Ltp/d;->a(Lft/i;)Ltp/d;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->o:Ltp/d;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/f;->b(Ltp/d;)Lft/i;

    move-result-object v11

    iput-object v11, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->p:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lft/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->d:Lft/i;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->f:Lft/i;

    iget-object v3, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a0:Lft/i;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->h:Lft/i;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->j:Lft/i;

    iget-object v6, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->i1:Lft/i;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->n:Lft/i;

    iget-object v8, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->F0:Lft/i;

    iget-object v9, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->x:Lft/i;

    iget-object v10, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Lft/i;

    iget-object v12, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->E1:Lft/i;

    invoke-static/range {v0 .. v12}, Lrr/h1;->a(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lrr/h1;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->q:Lrr/h1;

    invoke-static {p1}, Lrr/i1;->b(Lrr/h1;)Lft/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->r:Lft/i;

    invoke-static {p1}, Lsr/d;->a(Lft/i;)Lsr/d;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->s:Lsr/d;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/ui/uiStep/c;->b(Lsr/d;)Lft/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->t:Lft/i;

    return-void
.end method

.method public c(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$r;->d(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;)Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;

    return-void
.end method

.method public final d(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;)Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a()Ldt/b;

    move-result-object v0

    invoke-static {p1, v0}, Loq/b;->a(Loq/a;Ldt/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->t:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/ui/uiStep/a;->b(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D0:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvq/a;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/ui/uiStep/a;->a(Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;Lvq/a;)V

    return-object p1
.end method
