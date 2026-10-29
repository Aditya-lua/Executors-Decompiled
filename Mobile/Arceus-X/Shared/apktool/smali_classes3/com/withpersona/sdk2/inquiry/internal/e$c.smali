.class public final Lcom/withpersona/sdk2/inquiry/internal/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzn/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

.field public final b:Lcom/withpersona/sdk2/inquiry/internal/e$c;

.field public c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/document/a;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/document/i$b;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/document/network/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/document/network/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/document/network/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lbo/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/document/network/g$a;",
            ">;"
        }
    .end annotation
.end field

.field public j:Ltp/d;

.field public k:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lco/c1;

.field public m:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/document/step/b$c;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lcom/withpersona/sdk2/inquiry/document/step/e;

.field public o:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/document/step/d$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->b:Lcom/withpersona/sdk2/inquiry/internal/e$c;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/e$c;->b(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$c;->c(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;)V

    return-void
.end method

.method public final b(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;)V
    .locals 14

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->t1:Lft/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lft/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Lft/i;

    invoke-static {v0, v1, p1}, Lzn/b;->a(Lft/i;Lft/i;Lft/i;)Lzn/b;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->c:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->s1:Lft/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->u1:Lft/i;

    iget-object v2, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lft/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Lft/i;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/document/j;->a(Lft/i;Lft/i;Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/document/j;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->d:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v1:Lft/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/network/b;->a(Lft/i;)Lcom/withpersona/sdk2/inquiry/document/network/b;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->e:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v1:Lft/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/network/f;->a(Lft/i;)Lcom/withpersona/sdk2/inquiry/document/network/f;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->f:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v1:Lft/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->w1:Lft/i;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/document/network/d;->a(Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/document/network/d;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->g:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v1:Lft/i;

    invoke-static {p1}, Lbo/b;->a(Lft/i;)Lbo/b;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->h:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v1:Lft/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->C0:Lft/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->d1:Lft/i;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/document/network/h;->a(Lft/i;Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/document/network/h;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->i:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->Q0:Lft/i;

    invoke-static {p1}, Ltp/d;->a(Lft/i;)Ltp/d;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->j:Ltp/d;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/f;->b(Ltp/d;)Lft/i;

    move-result-object v12

    iput-object v12, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->k:Lft/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->r0:Lft/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lft/i;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->c:Lft/i;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->d:Lft/i;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->e:Lft/i;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->f:Lft/i;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->g:Lft/i;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->h:Lft/i;

    iget-object v8, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->i:Lft/i;

    iget-object v9, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->i1:Lft/i;

    iget-object v10, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->F0:Lft/i;

    iget-object v11, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Lft/i;

    iget-object v13, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->E1:Lft/i;

    invoke-static/range {v0 .. v13}, Lco/c1;->a(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lco/c1;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->l:Lco/c1;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/step/c;->b(Lco/c1;)Lft/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->m:Lft/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/step/e;->a(Lft/i;)Lcom/withpersona/sdk2/inquiry/document/step/e;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->n:Lcom/withpersona/sdk2/inquiry/document/step/e;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/step/f;->b(Lcom/withpersona/sdk2/inquiry/document/step/e;)Lft/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->o:Lft/i;

    return-void
.end method

.method public c(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$c;->d(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;)Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;

    return-void
.end method

.method public final d(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;)Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a()Ldt/b;

    move-result-object v0

    invoke-static {p1, v0}, Loq/b;->a(Loq/a;Ldt/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->o:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/step/d$a;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/document/step/a;->b(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;Lcom/withpersona/sdk2/inquiry/document/step/d$a;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D0:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvq/a;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/document/step/a;->a(Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;Lvq/a;)V

    return-object p1
.end method
