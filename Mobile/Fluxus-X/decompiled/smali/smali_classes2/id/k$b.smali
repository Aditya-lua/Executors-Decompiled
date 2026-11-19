.class public final Lid/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lid/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lid/d;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public b:Lid/d;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public c:Lid/d;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public d:Lid/d;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public e:Lid/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public f:Lid/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public g:Lid/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public h:Lid/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public i:Lid/f;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public j:Lid/f;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public k:Lid/f;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public l:Lid/f;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lid/h;->b()Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->a:Lid/d;

    .line 3
    invoke-static {}, Lid/h;->b()Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->b:Lid/d;

    .line 4
    invoke-static {}, Lid/h;->b()Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->c:Lid/d;

    .line 5
    invoke-static {}, Lid/h;->b()Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->d:Lid/d;

    .line 6
    new-instance v0, Lid/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k$b;->e:Lid/c;

    .line 7
    new-instance v0, Lid/a;

    invoke-direct {v0, v1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k$b;->f:Lid/c;

    .line 8
    new-instance v0, Lid/a;

    invoke-direct {v0, v1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k$b;->g:Lid/c;

    .line 9
    new-instance v0, Lid/a;

    invoke-direct {v0, v1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k$b;->h:Lid/c;

    .line 10
    invoke-static {}, Lid/h;->c()Lid/f;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->i:Lid/f;

    .line 11
    invoke-static {}, Lid/h;->c()Lid/f;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->j:Lid/f;

    .line 12
    invoke-static {}, Lid/h;->c()Lid/f;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->k:Lid/f;

    .line 13
    invoke-static {}, Lid/h;->c()Lid/f;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->l:Lid/f;

    return-void
.end method

.method public constructor <init>(Lid/k;)V
    .locals 2
    .param p1    # Lid/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    invoke-static {}, Lid/h;->b()Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->a:Lid/d;

    .line 16
    invoke-static {}, Lid/h;->b()Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->b:Lid/d;

    .line 17
    invoke-static {}, Lid/h;->b()Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->c:Lid/d;

    .line 18
    invoke-static {}, Lid/h;->b()Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->d:Lid/d;

    .line 19
    new-instance v0, Lid/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k$b;->e:Lid/c;

    .line 20
    new-instance v0, Lid/a;

    invoke-direct {v0, v1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k$b;->f:Lid/c;

    .line 21
    new-instance v0, Lid/a;

    invoke-direct {v0, v1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k$b;->g:Lid/c;

    .line 22
    new-instance v0, Lid/a;

    invoke-direct {v0, v1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k$b;->h:Lid/c;

    .line 23
    invoke-static {}, Lid/h;->c()Lid/f;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->i:Lid/f;

    .line 24
    invoke-static {}, Lid/h;->c()Lid/f;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->j:Lid/f;

    .line 25
    invoke-static {}, Lid/h;->c()Lid/f;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->k:Lid/f;

    .line 26
    invoke-static {}, Lid/h;->c()Lid/f;

    move-result-object v0

    iput-object v0, p0, Lid/k$b;->l:Lid/f;

    .line 27
    iget-object v0, p1, Lid/k;->a:Lid/d;

    iput-object v0, p0, Lid/k$b;->a:Lid/d;

    .line 28
    iget-object v0, p1, Lid/k;->b:Lid/d;

    iput-object v0, p0, Lid/k$b;->b:Lid/d;

    .line 29
    iget-object v0, p1, Lid/k;->c:Lid/d;

    iput-object v0, p0, Lid/k$b;->c:Lid/d;

    .line 30
    iget-object v0, p1, Lid/k;->d:Lid/d;

    iput-object v0, p0, Lid/k$b;->d:Lid/d;

    .line 31
    iget-object v0, p1, Lid/k;->e:Lid/c;

    iput-object v0, p0, Lid/k$b;->e:Lid/c;

    .line 32
    iget-object v0, p1, Lid/k;->f:Lid/c;

    iput-object v0, p0, Lid/k$b;->f:Lid/c;

    .line 33
    iget-object v0, p1, Lid/k;->g:Lid/c;

    iput-object v0, p0, Lid/k$b;->g:Lid/c;

    .line 34
    iget-object v0, p1, Lid/k;->h:Lid/c;

    iput-object v0, p0, Lid/k$b;->h:Lid/c;

    .line 35
    iget-object v0, p1, Lid/k;->i:Lid/f;

    iput-object v0, p0, Lid/k$b;->i:Lid/f;

    .line 36
    iget-object v0, p1, Lid/k;->j:Lid/f;

    iput-object v0, p0, Lid/k$b;->j:Lid/f;

    .line 37
    iget-object v0, p1, Lid/k;->k:Lid/f;

    iput-object v0, p0, Lid/k$b;->k:Lid/f;

    .line 38
    iget-object p1, p1, Lid/k;->l:Lid/f;

    iput-object p1, p0, Lid/k$b;->l:Lid/f;

    return-void
.end method

.method public static synthetic a(Lid/k$b;)Lid/d;
    .locals 0

    iget-object p0, p0, Lid/k$b;->a:Lid/d;

    return-object p0
.end method

.method public static synthetic b(Lid/k$b;)Lid/f;
    .locals 0

    iget-object p0, p0, Lid/k$b;->j:Lid/f;

    return-object p0
.end method

.method public static synthetic c(Lid/k$b;)Lid/f;
    .locals 0

    iget-object p0, p0, Lid/k$b;->k:Lid/f;

    return-object p0
.end method

.method public static synthetic d(Lid/k$b;)Lid/f;
    .locals 0

    iget-object p0, p0, Lid/k$b;->l:Lid/f;

    return-object p0
.end method

.method public static synthetic e(Lid/k$b;)Lid/d;
    .locals 0

    iget-object p0, p0, Lid/k$b;->b:Lid/d;

    return-object p0
.end method

.method public static synthetic f(Lid/k$b;)Lid/d;
    .locals 0

    iget-object p0, p0, Lid/k$b;->c:Lid/d;

    return-object p0
.end method

.method public static synthetic g(Lid/k$b;)Lid/d;
    .locals 0

    iget-object p0, p0, Lid/k$b;->d:Lid/d;

    return-object p0
.end method

.method public static synthetic h(Lid/k$b;)Lid/c;
    .locals 0

    iget-object p0, p0, Lid/k$b;->e:Lid/c;

    return-object p0
.end method

.method public static synthetic i(Lid/k$b;)Lid/c;
    .locals 0

    iget-object p0, p0, Lid/k$b;->f:Lid/c;

    return-object p0
.end method

.method public static synthetic j(Lid/k$b;)Lid/c;
    .locals 0

    iget-object p0, p0, Lid/k$b;->g:Lid/c;

    return-object p0
.end method

.method public static synthetic k(Lid/k$b;)Lid/c;
    .locals 0

    iget-object p0, p0, Lid/k$b;->h:Lid/c;

    return-object p0
.end method

.method public static synthetic l(Lid/k$b;)Lid/f;
    .locals 0

    iget-object p0, p0, Lid/k$b;->i:Lid/f;

    return-object p0
.end method

.method public static n(Lid/d;)F
    .locals 1

    instance-of v0, p0, Lid/j;

    if-eqz v0, :cond_0

    check-cast p0, Lid/j;

    iget p0, p0, Lid/j;->a:F

    return p0

    :cond_0
    instance-of v0, p0, Lid/e;

    if-eqz v0, :cond_1

    check-cast p0, Lid/e;

    iget p0, p0, Lid/e;->a:F

    return p0

    :cond_1
    const/high16 p0, -0x40800000    # -1.0f

    return p0
.end method


# virtual methods
.method public A(F)Lid/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lid/a;

    invoke-direct {v0, p1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k$b;->e:Lid/c;

    return-object p0
.end method

.method public B(Lid/c;)Lid/k$b;
    .locals 0
    .param p1    # Lid/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lid/k$b;->e:Lid/c;

    return-object p0
.end method

.method public C(ILid/c;)Lid/k$b;
    .locals 0
    .param p2    # Lid/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lid/h;->a(I)Lid/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lid/k$b;->D(Lid/d;)Lid/k$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lid/k$b;->F(Lid/c;)Lid/k$b;

    move-result-object p1

    return-object p1
.end method

.method public D(Lid/d;)Lid/k$b;
    .locals 1
    .param p1    # Lid/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lid/k$b;->b:Lid/d;

    invoke-static {p1}, Lid/k$b;->n(Lid/d;)F

    move-result p1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lid/k$b;->E(F)Lid/k$b;

    :cond_0
    return-object p0
.end method

.method public E(F)Lid/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lid/a;

    invoke-direct {v0, p1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k$b;->f:Lid/c;

    return-object p0
.end method

.method public F(Lid/c;)Lid/k$b;
    .locals 0
    .param p1    # Lid/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lid/k$b;->f:Lid/c;

    return-object p0
.end method

.method public m()Lid/k;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lid/k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lid/k;-><init>(Lid/k$b;Lid/k$a;)V

    return-object v0
.end method

.method public o(F)Lid/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lid/k$b;->A(F)Lid/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lid/k$b;->E(F)Lid/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lid/k$b;->w(F)Lid/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lid/k$b;->s(F)Lid/k$b;

    move-result-object p1

    return-object p1
.end method

.method public p(Lid/c;)Lid/k$b;
    .locals 1
    .param p1    # Lid/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lid/k$b;->B(Lid/c;)Lid/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lid/k$b;->F(Lid/c;)Lid/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lid/k$b;->x(Lid/c;)Lid/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lid/k$b;->t(Lid/c;)Lid/k$b;

    move-result-object p1

    return-object p1
.end method

.method public q(ILid/c;)Lid/k$b;
    .locals 0
    .param p2    # Lid/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lid/h;->a(I)Lid/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lid/k$b;->r(Lid/d;)Lid/k$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lid/k$b;->t(Lid/c;)Lid/k$b;

    move-result-object p1

    return-object p1
.end method

.method public r(Lid/d;)Lid/k$b;
    .locals 1
    .param p1    # Lid/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lid/k$b;->d:Lid/d;

    invoke-static {p1}, Lid/k$b;->n(Lid/d;)F

    move-result p1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lid/k$b;->s(F)Lid/k$b;

    :cond_0
    return-object p0
.end method

.method public s(F)Lid/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lid/a;

    invoke-direct {v0, p1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k$b;->h:Lid/c;

    return-object p0
.end method

.method public t(Lid/c;)Lid/k$b;
    .locals 0
    .param p1    # Lid/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lid/k$b;->h:Lid/c;

    return-object p0
.end method

.method public u(ILid/c;)Lid/k$b;
    .locals 0
    .param p2    # Lid/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lid/h;->a(I)Lid/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lid/k$b;->v(Lid/d;)Lid/k$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lid/k$b;->x(Lid/c;)Lid/k$b;

    move-result-object p1

    return-object p1
.end method

.method public v(Lid/d;)Lid/k$b;
    .locals 1
    .param p1    # Lid/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lid/k$b;->c:Lid/d;

    invoke-static {p1}, Lid/k$b;->n(Lid/d;)F

    move-result p1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lid/k$b;->w(F)Lid/k$b;

    :cond_0
    return-object p0
.end method

.method public w(F)Lid/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lid/a;

    invoke-direct {v0, p1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k$b;->g:Lid/c;

    return-object p0
.end method

.method public x(Lid/c;)Lid/k$b;
    .locals 0
    .param p1    # Lid/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lid/k$b;->g:Lid/c;

    return-object p0
.end method

.method public y(ILid/c;)Lid/k$b;
    .locals 0
    .param p2    # Lid/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Lid/h;->a(I)Lid/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lid/k$b;->z(Lid/d;)Lid/k$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lid/k$b;->B(Lid/c;)Lid/k$b;

    move-result-object p1

    return-object p1
.end method

.method public z(Lid/d;)Lid/k$b;
    .locals 1
    .param p1    # Lid/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lid/k$b;->a:Lid/d;

    invoke-static {p1}, Lid/k$b;->n(Lid/d;)F

    move-result p1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lid/k$b;->A(F)Lid/k$b;

    :cond_0
    return-object p0
.end method
