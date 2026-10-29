.class public Lus/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lus/o$a;
    }
.end annotation


# instance fields
.field public final a:Lus/g;

.field public final b:Lus/r;

.field public final c:Lus/u;

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lqn/s;",
            ">;",
            "Lus/m$c<",
            "+",
            "Lqn/s;",
            ">;>;"
        }
    .end annotation
.end field

.field public final e:Lus/m$a;


# direct methods
.method public constructor <init>(Lus/g;Lus/r;Lus/u;Ljava/util/Map;Lus/m$a;)V
    .locals 0
    .param p1    # Lus/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lus/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lus/u;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/Map;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lus/m$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lus/g;",
            "Lus/r;",
            "Lus/u;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lqn/s;",
            ">;",
            "Lus/m$c<",
            "+",
            "Lqn/s;",
            ">;>;",
            "Lus/m$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lus/o;->a:Lus/g;

    iput-object p2, p0, Lus/o;->b:Lus/r;

    iput-object p3, p0, Lus/o;->c:Lus/u;

    iput-object p4, p0, Lus/o;->d:Ljava/util/Map;

    iput-object p5, p0, Lus/o;->e:Lus/m$a;

    return-void
.end method


# virtual methods
.method public A(Lqn/x;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public B()V
    .locals 2

    iget-object v0, p0, Lus/o;->c:Lus/u;

    invoke-virtual {v0}, Lus/u;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lus/o;->c:Lus/u;

    invoke-virtual {v0}, Lus/u;->h()C

    move-result v0

    const/16 v1, 0xa

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lus/o;->c:Lus/u;

    invoke-virtual {v0, v1}, Lus/u;->a(C)Lus/u;

    :cond_0
    return-void
.end method

.method public C(Lqn/m;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public D(Lqn/s;)V
    .locals 1
    .param p1    # Lqn/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lus/o;->e:Lus/m$a;

    invoke-interface {v0, p0, p1}, Lus/m$a;->b(Lus/m;Lqn/s;)V

    return-void
.end method

.method public E(Lqn/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public F(Ljava/lang/Class;I)V
    .locals 2
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "Lqn/s;",
            ">(",
            "Ljava/lang/Class<",
            "TN;>;I)V"
        }
    .end annotation

    iget-object v0, p0, Lus/o;->a:Lus/g;

    invoke-virtual {v0}, Lus/g;->c()Lus/k;

    move-result-object v0

    invoke-interface {v0, p1}, Lus/k;->a(Ljava/lang/Class;)Lus/t;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lus/o;->a:Lus/g;

    iget-object v1, p0, Lus/o;->b:Lus/r;

    invoke-interface {p1, v0, v1}, Lus/t;->a(Lus/g;Lus/r;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lus/o;->d(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final G(Lqn/s;)V
    .locals 2
    .param p1    # Lqn/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lus/o;->d:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lus/m$c;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, Lus/m$c;->a(Lus/m;Lqn/s;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lus/o;->h(Lqn/s;)V

    return-void
.end method

.method public a(Lqn/d;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public b(Lqn/n;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public builder()Lus/u;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lus/o;->c:Lus/u;

    return-object v0
.end method

.method public c(Lqn/s;)Z
    .locals 0
    .param p1    # Lqn/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lqn/s;->f()Lqn/s;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public d(ILjava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lus/o;->c:Lus/u;

    invoke-virtual {v0}, Lus/u;->length()I

    move-result v1

    invoke-static {v0, p2, p1, v1}, Lus/u;->j(Lus/u;Ljava/lang/Object;II)V

    return-void
.end method

.method public e(Lqn/k;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public f(Lqn/c0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public g(Lqn/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public h(Lqn/s;)V
    .locals 1
    .param p1    # Lqn/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lqn/s;->d()Lqn/s;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lqn/s;->f()Lqn/s;

    move-result-object v0

    invoke-virtual {p1, p0}, Lqn/s;->a(Lqn/d0;)V

    move-object p1, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i(Lqn/w;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public j(Lqn/l;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public k(Lqn/s;I)V
    .locals 0
    .param p1    # Lqn/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "Lqn/s;",
            ">(TN;I)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lus/o;->F(Ljava/lang/Class;I)V

    return-void
.end method

.method public l(Lqn/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public length()I
    .locals 1

    iget-object v0, p0, Lus/o;->c:Lus/u;

    invoke-virtual {v0}, Lus/u;->length()I

    move-result v0

    return v0
.end method

.method public m(Lqn/j;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public n(Lqn/b0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public o()Lus/r;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lus/o;->b:Lus/r;

    return-object v0
.end method

.method public p(Lqn/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public q(Lqn/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public r(Lqn/r;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public s(Lqn/o;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public t(Lqn/s;)V
    .locals 1
    .param p1    # Lqn/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lus/o;->e:Lus/m$a;

    invoke-interface {v0, p0, p1}, Lus/m$a;->a(Lus/m;Lqn/s;)V

    return-void
.end method

.method public u(Lqn/p;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public v(Lqn/f;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public w()Lus/g;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lus/o;->a:Lus/g;

    return-object v0
.end method

.method public x()V
    .locals 2

    iget-object v0, p0, Lus/o;->c:Lus/u;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lus/u;->a(C)Lus/u;

    return-void
.end method

.method public y(Lqn/a0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method

.method public z(Lqn/v;)V
    .locals 0

    invoke-virtual {p0, p1}, Lus/o;->G(Lqn/s;)V

    return-void
.end method
