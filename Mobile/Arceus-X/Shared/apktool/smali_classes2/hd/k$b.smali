.class public final Lhd/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhd/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lhd/d;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public b:Lhd/d;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public c:Lhd/d;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public d:Lhd/d;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public e:Lhd/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public f:Lhd/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public g:Lhd/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public h:Lhd/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public i:Lhd/f;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public j:Lhd/f;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public k:Lhd/f;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public l:Lhd/f;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lhd/h;->b()Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->a:Lhd/d;

    .line 3
    invoke-static {}, Lhd/h;->b()Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->b:Lhd/d;

    .line 4
    invoke-static {}, Lhd/h;->b()Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->c:Lhd/d;

    .line 5
    invoke-static {}, Lhd/h;->b()Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->d:Lhd/d;

    .line 6
    new-instance v0, Lhd/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k$b;->e:Lhd/c;

    .line 7
    new-instance v0, Lhd/a;

    invoke-direct {v0, v1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k$b;->f:Lhd/c;

    .line 8
    new-instance v0, Lhd/a;

    invoke-direct {v0, v1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k$b;->g:Lhd/c;

    .line 9
    new-instance v0, Lhd/a;

    invoke-direct {v0, v1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k$b;->h:Lhd/c;

    .line 10
    invoke-static {}, Lhd/h;->c()Lhd/f;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->i:Lhd/f;

    .line 11
    invoke-static {}, Lhd/h;->c()Lhd/f;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->j:Lhd/f;

    .line 12
    invoke-static {}, Lhd/h;->c()Lhd/f;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->k:Lhd/f;

    .line 13
    invoke-static {}, Lhd/h;->c()Lhd/f;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->l:Lhd/f;

    return-void
.end method

.method public constructor <init>(Lhd/k;)V
    .locals 2
    .param p1    # Lhd/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    invoke-static {}, Lhd/h;->b()Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->a:Lhd/d;

    .line 16
    invoke-static {}, Lhd/h;->b()Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->b:Lhd/d;

    .line 17
    invoke-static {}, Lhd/h;->b()Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->c:Lhd/d;

    .line 18
    invoke-static {}, Lhd/h;->b()Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->d:Lhd/d;

    .line 19
    new-instance v0, Lhd/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k$b;->e:Lhd/c;

    .line 20
    new-instance v0, Lhd/a;

    invoke-direct {v0, v1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k$b;->f:Lhd/c;

    .line 21
    new-instance v0, Lhd/a;

    invoke-direct {v0, v1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k$b;->g:Lhd/c;

    .line 22
    new-instance v0, Lhd/a;

    invoke-direct {v0, v1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k$b;->h:Lhd/c;

    .line 23
    invoke-static {}, Lhd/h;->c()Lhd/f;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->i:Lhd/f;

    .line 24
    invoke-static {}, Lhd/h;->c()Lhd/f;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->j:Lhd/f;

    .line 25
    invoke-static {}, Lhd/h;->c()Lhd/f;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->k:Lhd/f;

    .line 26
    invoke-static {}, Lhd/h;->c()Lhd/f;

    move-result-object v0

    iput-object v0, p0, Lhd/k$b;->l:Lhd/f;

    .line 27
    iget-object v0, p1, Lhd/k;->a:Lhd/d;

    iput-object v0, p0, Lhd/k$b;->a:Lhd/d;

    .line 28
    iget-object v0, p1, Lhd/k;->b:Lhd/d;

    iput-object v0, p0, Lhd/k$b;->b:Lhd/d;

    .line 29
    iget-object v0, p1, Lhd/k;->c:Lhd/d;

    iput-object v0, p0, Lhd/k$b;->c:Lhd/d;

    .line 30
    iget-object v0, p1, Lhd/k;->d:Lhd/d;

    iput-object v0, p0, Lhd/k$b;->d:Lhd/d;

    .line 31
    iget-object v0, p1, Lhd/k;->e:Lhd/c;

    iput-object v0, p0, Lhd/k$b;->e:Lhd/c;

    .line 32
    iget-object v0, p1, Lhd/k;->f:Lhd/c;

    iput-object v0, p0, Lhd/k$b;->f:Lhd/c;

    .line 33
    iget-object v0, p1, Lhd/k;->g:Lhd/c;

    iput-object v0, p0, Lhd/k$b;->g:Lhd/c;

    .line 34
    iget-object v0, p1, Lhd/k;->h:Lhd/c;

    iput-object v0, p0, Lhd/k$b;->h:Lhd/c;

    .line 35
    iget-object v0, p1, Lhd/k;->i:Lhd/f;

    iput-object v0, p0, Lhd/k$b;->i:Lhd/f;

    .line 36
    iget-object v0, p1, Lhd/k;->j:Lhd/f;

    iput-object v0, p0, Lhd/k$b;->j:Lhd/f;

    .line 37
    iget-object v0, p1, Lhd/k;->k:Lhd/f;

    iput-object v0, p0, Lhd/k$b;->k:Lhd/f;

    .line 38
    iget-object p1, p1, Lhd/k;->l:Lhd/f;

    iput-object p1, p0, Lhd/k$b;->l:Lhd/f;

    return-void
.end method

.method public static synthetic a(Lhd/k$b;)Lhd/d;
    .locals 0

    iget-object p0, p0, Lhd/k$b;->a:Lhd/d;

    return-object p0
.end method

.method public static synthetic b(Lhd/k$b;)Lhd/f;
    .locals 0

    iget-object p0, p0, Lhd/k$b;->j:Lhd/f;

    return-object p0
.end method

.method public static synthetic c(Lhd/k$b;)Lhd/f;
    .locals 0

    iget-object p0, p0, Lhd/k$b;->k:Lhd/f;

    return-object p0
.end method

.method public static synthetic d(Lhd/k$b;)Lhd/f;
    .locals 0

    iget-object p0, p0, Lhd/k$b;->l:Lhd/f;

    return-object p0
.end method

.method public static synthetic e(Lhd/k$b;)Lhd/d;
    .locals 0

    iget-object p0, p0, Lhd/k$b;->b:Lhd/d;

    return-object p0
.end method

.method public static synthetic f(Lhd/k$b;)Lhd/d;
    .locals 0

    iget-object p0, p0, Lhd/k$b;->c:Lhd/d;

    return-object p0
.end method

.method public static synthetic g(Lhd/k$b;)Lhd/d;
    .locals 0

    iget-object p0, p0, Lhd/k$b;->d:Lhd/d;

    return-object p0
.end method

.method public static synthetic h(Lhd/k$b;)Lhd/c;
    .locals 0

    iget-object p0, p0, Lhd/k$b;->e:Lhd/c;

    return-object p0
.end method

.method public static synthetic i(Lhd/k$b;)Lhd/c;
    .locals 0

    iget-object p0, p0, Lhd/k$b;->f:Lhd/c;

    return-object p0
.end method

.method public static synthetic j(Lhd/k$b;)Lhd/c;
    .locals 0

    iget-object p0, p0, Lhd/k$b;->g:Lhd/c;

    return-object p0
.end method

.method public static synthetic k(Lhd/k$b;)Lhd/c;
    .locals 0

    iget-object p0, p0, Lhd/k$b;->h:Lhd/c;

    return-object p0
.end method

.method public static synthetic l(Lhd/k$b;)Lhd/f;
    .locals 0

    iget-object p0, p0, Lhd/k$b;->i:Lhd/f;

    return-object p0
.end method

.method public static n(Lhd/d;)F
    .locals 1

    instance-of v0, p0, Lhd/j;

    if-eqz v0, :cond_0

    check-cast p0, Lhd/j;

    iget p0, p0, Lhd/j;->a:F

    return p0

    :cond_0
    instance-of v0, p0, Lhd/e;

    if-eqz v0, :cond_1

    check-cast p0, Lhd/e;

    iget p0, p0, Lhd/e;->a:F

    return p0

    :cond_1
    const/high16 p0, -0x40800000    # -1.0f

    return p0
.end method


# virtual methods
.method public A(F)Lhd/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lhd/a;

    invoke-direct {v0, p1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k$b;->e:Lhd/c;

    return-object p0
.end method

.method public B(Lhd/c;)Lhd/k$b;
    .locals 0
    .param p1    # Lhd/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lhd/k$b;->e:Lhd/c;

    return-object p0
.end method

.method public C(ILhd/c;)Lhd/k$b;
    .locals 0
    .param p2    # Lhd/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lhd/h;->a(I)Lhd/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhd/k$b;->D(Lhd/d;)Lhd/k$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lhd/k$b;->F(Lhd/c;)Lhd/k$b;

    move-result-object p1

    return-object p1
.end method

.method public D(Lhd/d;)Lhd/k$b;
    .locals 1
    .param p1    # Lhd/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lhd/k$b;->b:Lhd/d;

    invoke-static {p1}, Lhd/k$b;->n(Lhd/d;)F

    move-result p1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lhd/k$b;->E(F)Lhd/k$b;

    :cond_0
    return-object p0
.end method

.method public E(F)Lhd/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lhd/a;

    invoke-direct {v0, p1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k$b;->f:Lhd/c;

    return-object p0
.end method

.method public F(Lhd/c;)Lhd/k$b;
    .locals 0
    .param p1    # Lhd/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lhd/k$b;->f:Lhd/c;

    return-object p0
.end method

.method public m()Lhd/k;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lhd/k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lhd/k;-><init>(Lhd/k$b;Lhd/k$a;)V

    return-object v0
.end method

.method public o(F)Lhd/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lhd/k$b;->A(F)Lhd/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhd/k$b;->E(F)Lhd/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhd/k$b;->w(F)Lhd/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhd/k$b;->s(F)Lhd/k$b;

    move-result-object p1

    return-object p1
.end method

.method public p(Lhd/c;)Lhd/k$b;
    .locals 1
    .param p1    # Lhd/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lhd/k$b;->B(Lhd/c;)Lhd/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhd/k$b;->F(Lhd/c;)Lhd/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhd/k$b;->x(Lhd/c;)Lhd/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhd/k$b;->t(Lhd/c;)Lhd/k$b;

    move-result-object p1

    return-object p1
.end method

.method public q(ILhd/c;)Lhd/k$b;
    .locals 0
    .param p2    # Lhd/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lhd/h;->a(I)Lhd/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhd/k$b;->r(Lhd/d;)Lhd/k$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lhd/k$b;->t(Lhd/c;)Lhd/k$b;

    move-result-object p1

    return-object p1
.end method

.method public r(Lhd/d;)Lhd/k$b;
    .locals 1
    .param p1    # Lhd/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lhd/k$b;->d:Lhd/d;

    invoke-static {p1}, Lhd/k$b;->n(Lhd/d;)F

    move-result p1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lhd/k$b;->s(F)Lhd/k$b;

    :cond_0
    return-object p0
.end method

.method public s(F)Lhd/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lhd/a;

    invoke-direct {v0, p1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k$b;->h:Lhd/c;

    return-object p0
.end method

.method public t(Lhd/c;)Lhd/k$b;
    .locals 0
    .param p1    # Lhd/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lhd/k$b;->h:Lhd/c;

    return-object p0
.end method

.method public u(ILhd/c;)Lhd/k$b;
    .locals 0
    .param p2    # Lhd/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lhd/h;->a(I)Lhd/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhd/k$b;->v(Lhd/d;)Lhd/k$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lhd/k$b;->x(Lhd/c;)Lhd/k$b;

    move-result-object p1

    return-object p1
.end method

.method public v(Lhd/d;)Lhd/k$b;
    .locals 1
    .param p1    # Lhd/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lhd/k$b;->c:Lhd/d;

    invoke-static {p1}, Lhd/k$b;->n(Lhd/d;)F

    move-result p1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lhd/k$b;->w(F)Lhd/k$b;

    :cond_0
    return-object p0
.end method

.method public w(F)Lhd/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lhd/a;

    invoke-direct {v0, p1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k$b;->g:Lhd/c;

    return-object p0
.end method

.method public x(Lhd/c;)Lhd/k$b;
    .locals 0
    .param p1    # Lhd/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lhd/k$b;->g:Lhd/c;

    return-object p0
.end method

.method public y(ILhd/c;)Lhd/k$b;
    .locals 0
    .param p2    # Lhd/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lhd/h;->a(I)Lhd/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhd/k$b;->z(Lhd/d;)Lhd/k$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lhd/k$b;->B(Lhd/c;)Lhd/k$b;

    move-result-object p1

    return-object p1
.end method

.method public z(Lhd/d;)Lhd/k$b;
    .locals 1
    .param p1    # Lhd/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lhd/k$b;->a:Lhd/d;

    invoke-static {p1}, Lhd/k$b;->n(Lhd/d;)F

    move-result p1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lhd/k$b;->A(F)Lhd/k$b;

    :cond_0
    return-object p0
.end method
