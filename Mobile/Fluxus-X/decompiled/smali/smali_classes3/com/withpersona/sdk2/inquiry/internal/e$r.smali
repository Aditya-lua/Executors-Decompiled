.class public final Lcom/withpersona/sdk2/inquiry/internal/e$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lis/d;


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

.field public c:Leq/q;

.field public d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Leq/p$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lzp/v;

.field public f:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lzp/u$a;",
            ">;"
        }
    .end annotation
.end field

.field public g:Les/p1;

.field public h:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Les/o1$a;",
            ">;"
        }
    .end annotation
.end field

.field public i:Les/y6;

.field public j:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Les/x6$a;",
            ">;"
        }
    .end annotation
.end field

.field public k:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public l:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lgs/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public m:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Les/k4$a;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lhs/e0;",
            ">;"
        }
    .end annotation
.end field

.field public o:Lhq/j;

.field public p:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lhq/i$a;",
            ">;"
        }
    .end annotation
.end field

.field public q:Lhs/h1;

.field public r:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lhs/g1$e;",
            ">;"
        }
    .end annotation
.end field

.field public s:Lis/g;

.field public t:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lis/f$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/e$f;Lis/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->b:Lcom/withpersona/sdk2/inquiry/internal/e$r;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/internal/e$r;->b(Lis/c;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lis/c;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$r;->c(Lis/c;)V

    return-void
.end method

.method public final b(Lis/c;)V
    .locals 13

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->o1:Lwt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lwt/i;

    iget-object v2, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a0:Lwt/i;

    iget-object v3, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->g:Lwt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->x:Lwt/i;

    invoke-static {v0, v1, v2, v3, p1}, Leq/q;->a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Leq/q;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->c:Leq/q;

    invoke-static {p1}, Leq/r;->b(Leq/q;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->d:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->p1:Lwt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lwt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a0:Lwt/i;

    invoke-static {v0, v1, p1}, Lzp/v;->a(Lwt/i;Lwt/i;Lwt/i;)Lzp/v;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->e:Lzp/v;

    invoke-static {p1}, Lzp/w;->b(Lzp/v;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->f:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->q1:Lwt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->V0:Lwt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->r1:Lwt/i;

    invoke-static {v0, v1, p1}, Les/p1;->a(Lwt/i;Lwt/i;Lwt/i;)Les/p1;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->g:Les/p1;

    invoke-static {p1}, Les/q1;->b(Les/p1;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->h:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->r1:Lwt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->q1:Lwt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D:Lwt/i;

    invoke-static {v0, v1, p1}, Les/y6;->a(Lwt/i;Lwt/i;Lwt/i;)Les/y6;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->i:Les/y6;

    invoke-static {p1}, Les/z6;->b(Les/y6;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->j:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->q1:Lwt/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/ui/network/c;->a(Lwt/i;)Lcom/withpersona/sdk2/inquiry/ui/network/c;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->k:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->q1:Lwt/i;

    invoke-static {p1}, Lgs/b;->a(Lwt/i;)Lgs/b;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->l:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->s1:Lwt/i;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->h1:Lwt/i;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lwt/i;

    invoke-static {v0, v1, p1}, Les/l4;->a(Lwt/i;Lwt/i;Lwt/i;)Les/l4;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->m:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lwt/i;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->k:Lwt/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->l:Lwt/i;

    invoke-static {}, Lnr/c;->a()Lnr/c;

    move-result-object v2

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->m:Lwt/i;

    invoke-static {p1, v0, v1, v2, v3}, Lhs/f0;->a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lhs/f0;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->n:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->Q0:Lwt/i;

    invoke-static {p1}, Lhq/j;->a(Lwt/i;)Lhq/j;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->o:Lhq/j;

    invoke-static {p1}, Lhq/k;->b(Lhq/j;)Lwt/i;

    move-result-object v11

    iput-object v11, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->p:Lwt/i;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->v:Lwt/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->d:Lwt/i;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->f:Lwt/i;

    iget-object v3, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a0:Lwt/i;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->h:Lwt/i;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->j:Lwt/i;

    iget-object v6, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->i1:Lwt/i;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->n:Lwt/i;

    iget-object v8, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->F0:Lwt/i;

    iget-object v9, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->x:Lwt/i;

    iget-object v10, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->L:Lwt/i;

    iget-object v12, p1, Lcom/withpersona/sdk2/inquiry/internal/e$f;->E1:Lwt/i;

    invoke-static/range {v0 .. v12}, Lhs/h1;->a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lhs/h1;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->q:Lhs/h1;

    invoke-static {p1}, Lhs/i1;->b(Lhs/h1;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->r:Lwt/i;

    invoke-static {p1}, Lis/g;->a(Lwt/i;)Lis/g;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->s:Lis/g;

    invoke-static {p1}, Lis/h;->b(Lis/g;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->t:Lwt/i;

    return-void
.end method

.method public c(Lis/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/e$r;->d(Lis/c;)Lis/c;

    return-void
.end method

.method public final d(Lis/c;)Lis/c;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/e$f;->a()Lut/b;

    move-result-object v0

    invoke-static {p1, v0}, Lcr/b;->a(Lcr/a;Lut/b;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->t:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lis/f$a;

    invoke-static {p1, v0}, Lis/e;->b(Lis/c;Lis/f$a;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/e$r;->a:Lcom/withpersona/sdk2/inquiry/internal/e$f;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/internal/e$f;->D0:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljr/a;

    invoke-static {p1, v0}, Lis/e;->a(Lis/c;Ljr/a;)V

    return-object p1
.end method
