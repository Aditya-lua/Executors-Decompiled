.class public final Lcom/withpersona/sdk2/inquiry/internal/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/l;


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

.field public c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lno/c;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lno/y2$b;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/document/network/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/document/network/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/document/network/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lpo/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/document/network/g$a;",
            ">;"
        }
    .end annotation
.end field

.field public j:Lhq/j;

.field public k:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lhq/i$a;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lqo/f1;

.field public m:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lqo/e1$c;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lqo/i1;

.field public o:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lqo/h1$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lqo/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->b:Lcom/withpersona/sdk2/inquiry/internal/e$c;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/e$c;->b(Lqo/g;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lqo/g;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$c;->c(Lqo/g;)V

    return-void
.end method

.method public final b(Lqo/g;)V
    .locals 14

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->t1:Lwt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lwt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Lwt/i;

    invoke-static {v0, v1, p1}, Lno/d;->a(Lwt/i;Lwt/i;Lwt/i;)Lno/d;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->c:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->s1:Lwt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->u1:Lwt/i;

    iget-object v2, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lwt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Lwt/i;

    invoke-static {v0, v1, v2, p1}, Lno/b3;->a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lno/b3;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->d:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v1:Lwt/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/network/b;->a(Lwt/i;)Lcom/withpersona/sdk2/inquiry/document/network/b;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->e:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v1:Lwt/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/network/f;->a(Lwt/i;)Lcom/withpersona/sdk2/inquiry/document/network/f;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->f:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v1:Lwt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->w1:Lwt/i;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/document/network/d;->a(Lwt/i;Lwt/i;)Lcom/withpersona/sdk2/inquiry/document/network/d;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->g:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v1:Lwt/i;

    invoke-static {p1}, Lpo/b;->a(Lwt/i;)Lpo/b;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->h:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v1:Lwt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->C0:Lwt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->d1:Lwt/i;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/document/network/h;->a(Lwt/i;Lwt/i;Lwt/i;)Lcom/withpersona/sdk2/inquiry/document/network/h;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->i:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->Q0:Lwt/i;

    invoke-static {p1}, Lhq/j;->a(Lwt/i;)Lhq/j;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->j:Lhq/j;

    invoke-static {p1}, Lhq/k;->b(Lhq/j;)Lwt/i;

    move-result-object v12

    iput-object v12, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->k:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->r0:Lwt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lwt/i;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->c:Lwt/i;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->d:Lwt/i;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->e:Lwt/i;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->f:Lwt/i;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->g:Lwt/i;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->h:Lwt/i;

    iget-object v8, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->i:Lwt/i;

    iget-object v9, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->i1:Lwt/i;

    iget-object v10, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->F0:Lwt/i;

    iget-object v11, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Lwt/i;

    iget-object v13, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->E1:Lwt/i;

    invoke-static/range {v0 .. v13}, Lqo/f1;->a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lqo/f1;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->l:Lqo/f1;

    invoke-static {p1}, Lqo/g1;->b(Lqo/f1;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->m:Lwt/i;

    invoke-static {p1}, Lqo/i1;->a(Lwt/i;)Lqo/i1;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->n:Lqo/i1;

    invoke-static {p1}, Lqo/j1;->b(Lqo/i1;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->o:Lwt/i;

    return-void
.end method

.method public c(Lqo/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$c;->d(Lqo/g;)Lqo/g;

    return-void
.end method

.method public final d(Lqo/g;)Lqo/g;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a()Lut/b;

    move-result-object v0

    invoke-static {p1, v0}, Lcr/b;->a(Lcr/a;Lut/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->o:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqo/h1$a;

    invoke-static {p1, v0}, Lqo/k;->b(Lqo/g;Lqo/h1$a;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$c;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D0:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljr/a;

    invoke-static {p1, v0}, Lqo/k;->a(Lqo/g;Ljr/a;)V

    return-object p1
.end method
