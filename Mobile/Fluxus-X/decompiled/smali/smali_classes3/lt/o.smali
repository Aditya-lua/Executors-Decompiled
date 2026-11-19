.class public Llt/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llt/o$a;
    }
.end annotation


# instance fields
.field public final a:Llt/g;

.field public final b:Llt/r;

.field public final c:Llt/u;

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Leo/s;",
            ">;",
            "Llt/m$c<",
            "+",
            "Leo/s;",
            ">;>;"
        }
    .end annotation
.end field

.field public final e:Llt/m$a;


# direct methods
.method public constructor <init>(Llt/g;Llt/r;Llt/u;Ljava/util/Map;Llt/m$a;)V
    .locals 0
    .param p1    # Llt/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Llt/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Llt/u;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/Map;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Llt/m$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llt/g;",
            "Llt/r;",
            "Llt/u;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Leo/s;",
            ">;",
            "Llt/m$c<",
            "+",
            "Leo/s;",
            ">;>;",
            "Llt/m$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llt/o;->a:Llt/g;

    iput-object p2, p0, Llt/o;->b:Llt/r;

    iput-object p3, p0, Llt/o;->c:Llt/u;

    iput-object p4, p0, Llt/o;->d:Ljava/util/Map;

    iput-object p5, p0, Llt/o;->e:Llt/m$a;

    return-void
.end method


# virtual methods
.method public A(Leo/c0;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public B(Leo/m;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public C(Leo/f;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public D(Leo/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public E(Leo/s;)V
    .locals 1
    .param p1    # Leo/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Leo/s;->d()Leo/s;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Leo/s;->f()Leo/s;

    move-result-object v0

    invoke-virtual {p1, p0}, Leo/s;->a(Leo/d0;)V

    move-object p1, v0

    goto :goto_0

    :cond_0
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
            "Leo/s;",
            ">(",
            "Ljava/lang/Class<",
            "TN;>;I)V"
        }
    .end annotation

    iget-object v0, p0, Llt/o;->a:Llt/g;

    invoke-virtual {v0}, Llt/g;->c()Llt/k;

    move-result-object v0

    invoke-interface {v0, p1}, Llt/k;->a(Ljava/lang/Class;)Llt/t;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Llt/o;->a:Llt/g;

    iget-object v1, p0, Llt/o;->b:Llt/r;

    invoke-interface {p1, v0, v1}, Llt/t;->a(Llt/g;Llt/r;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Llt/o;->c(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final G(Leo/s;)V
    .locals 2
    .param p1    # Leo/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Llt/o;->d:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llt/m$c;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, Llt/m$c;->a(Llt/m;Leo/s;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Llt/o;->E(Leo/s;)V

    return-void
.end method

.method public a(Leo/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public b(Leo/k;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public builder()Llt/u;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Llt/o;->c:Llt/u;

    return-object v0
.end method

.method public c(ILjava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Llt/o;->c:Llt/u;

    invoke-virtual {v0}, Llt/u;->length()I

    move-result v1

    invoke-static {v0, p2, p1, v1}, Llt/u;->j(Llt/u;Ljava/lang/Object;II)V

    return-void
.end method

.method public d(Leo/s;)Z
    .locals 0
    .param p1    # Leo/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Leo/s;->f()Leo/s;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public e(Leo/n;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public f(Leo/d;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public g(Leo/j;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public h(Leo/b0;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public i(Leo/s;I)V
    .locals 0
    .param p1    # Leo/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "Leo/s;",
            ">(TN;I)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Llt/o;->F(Ljava/lang/Class;I)V

    return-void
.end method

.method public j(Leo/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public k()Llt/r;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Llt/o;->b:Llt/r;

    return-object v0
.end method

.method public l(Leo/x;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public length()I
    .locals 1

    iget-object v0, p0, Llt/o;->c:Llt/u;

    invoke-virtual {v0}, Llt/u;->length()I

    move-result v0

    return v0
.end method

.method public m(Leo/w;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public n(Leo/s;)V
    .locals 1
    .param p1    # Leo/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Llt/o;->e:Llt/m$a;

    invoke-interface {v0, p0, p1}, Llt/m$a;->b(Llt/m;Leo/s;)V

    return-void
.end method

.method public o(Leo/a0;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public p(Leo/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public q(Leo/o;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public r(Leo/l;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public s(Leo/s;)V
    .locals 1
    .param p1    # Leo/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Llt/o;->e:Llt/m$a;

    invoke-interface {v0, p0, p1}, Llt/m$a;->a(Llt/m;Leo/s;)V

    return-void
.end method

.method public t(Leo/r;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public u()Llt/g;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Llt/o;->a:Llt/g;

    return-object v0
.end method

.method public v()V
    .locals 2

    iget-object v0, p0, Llt/o;->c:Llt/u;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Llt/u;->a(C)Llt/u;

    return-void
.end method

.method public w(Leo/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public x(Leo/p;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method

.method public y()V
    .locals 2

    iget-object v0, p0, Llt/o;->c:Llt/u;

    invoke-virtual {v0}, Llt/u;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Llt/o;->c:Llt/u;

    invoke-virtual {v0}, Llt/u;->h()C

    move-result v0

    const/16 v1, 0xa

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Llt/o;->c:Llt/u;

    invoke-virtual {v0, v1}, Llt/u;->a(C)Llt/u;

    :cond_0
    return-void
.end method

.method public z(Leo/v;)V
    .locals 0

    invoke-virtual {p0, p1}, Llt/o;->G(Leo/s;)V

    return-void
.end method
