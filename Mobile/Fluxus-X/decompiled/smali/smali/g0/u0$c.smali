.class public final Lg0/u0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/i2$a;
.implements Ln0/i4$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln0/i2$a<",
        "Lg0/u0$c;",
        ">;",
        "Ln0/i4$b<",
        "Lg0/u0;",
        "Ln0/f2;",
        "Lg0/u0$c;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ln0/x2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Ln0/x2;->k0()Ln0/x2;

    move-result-object v0

    invoke-direct {p0, v0}, Lg0/u0$c;-><init>(Ln0/x2;)V

    return-void
.end method

.method public constructor <init>(Ln0/x2;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lg0/u0$c;->a:Ln0/x2;

    .line 4
    sget-object v0, Ls0/q;->N:Ln0/n1$a;

    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, v0, v1}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    .line 6
    const-class v0, Lg0/u0;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid target class configuration for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_1
    :goto_0
    sget-object p1, Ln0/j4$b;->c:Ln0/j4$b;

    invoke-virtual {p0, p1}, Lg0/u0$c;->k(Ln0/j4$b;)Lg0/u0$c;

    .line 9
    invoke-virtual {p0, v0}, Lg0/u0$c;->s(Ljava/lang/Class;)Lg0/u0$c;

    return-void
.end method

.method public static g(Ln0/n1;)Lg0/u0$c;
    .locals 1

    new-instance v0, Lg0/u0$c;

    invoke-static {p0}, Ln0/x2;->l0(Ln0/n1;)Ln0/x2;

    move-result-object p0

    invoke-direct {v0, p0}, Lg0/u0$c;-><init>(Ln0/x2;)V

    return-object v0
.end method


# virtual methods
.method public a()Ln0/w2;
    .locals 1

    iget-object v0, p0, Lg0/u0$c;->a:Ln0/x2;

    return-object v0
.end method

.method public bridge synthetic b(La1/c;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lg0/u0$c;->p(La1/c;)Lg0/u0$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lg0/u0$c;->v(I)Lg0/u0$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Landroid/util/Size;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lg0/u0$c;->u(Landroid/util/Size;)Lg0/u0$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e()Ln0/i4;
    .locals 1

    invoke-virtual {p0}, Lg0/u0$c;->h()Ln0/f2;

    move-result-object v0

    return-object v0
.end method

.method public f()Lg0/u0;
    .locals 2

    invoke-virtual {p0}, Lg0/u0$c;->h()Ln0/f2;

    move-result-object v0

    invoke-static {v0}, Ln0/i2;->Y(Ln0/i2;)V

    new-instance v1, Lg0/u0;

    invoke-direct {v1, v0}, Lg0/u0;-><init>(Ln0/f2;)V

    return-object v1
.end method

.method public h()Ln0/f2;
    .locals 2

    new-instance v0, Ln0/f2;

    iget-object v1, p0, Lg0/u0$c;->a:Ln0/x2;

    invoke-static {v1}, Ln0/c3;->j0(Ln0/n1;)Ln0/c3;

    move-result-object v1

    invoke-direct {v0, v1}, Ln0/f2;-><init>(Ln0/c3;)V

    return-object v0
.end method

.method public i(Ljava/util/concurrent/Executor;)Lg0/u0$c;
    .locals 2

    invoke-virtual {p0}, Lg0/u0$c;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ls0/r;->O:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public j(I)Lg0/u0$c;
    .locals 2

    invoke-virtual {p0}, Lg0/u0$c;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/f2;->Q:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public k(Ln0/j4$b;)Lg0/u0$c;
    .locals 2

    invoke-virtual {p0}, Lg0/u0$c;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i4;->G:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public l(Landroid/util/Size;)Lg0/u0$c;
    .locals 2

    invoke-virtual {p0}, Lg0/u0$c;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->r:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public m(Lg0/k0;)Lg0/u0$c;
    .locals 2

    sget-object v0, Lg0/k0;->d:Lg0/k0;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg0/u0$c;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/h2;->l:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "ImageAnalysis currently only supports SDR"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public n(I)Lg0/u0$c;
    .locals 2

    invoke-virtual {p0}, Lg0/u0$c;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/f2;->R:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public o(I)Lg0/u0$c;
    .locals 2

    invoke-virtual {p0}, Lg0/u0$c;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/f2;->T:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public p(La1/c;)Lg0/u0$c;
    .locals 2

    invoke-virtual {p0}, Lg0/u0$c;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->u:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public q(I)Lg0/u0$c;
    .locals 2

    invoke-virtual {p0}, Lg0/u0$c;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i4;->A:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public r(I)Lg0/u0$c;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0}, Lg0/u0$c;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->m:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public s(Ljava/lang/Class;)Lg0/u0$c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Lg0/u0;",
            ">;)",
            "Lg0/u0$c;"
        }
    .end annotation

    invoke-virtual {p0}, Lg0/u0$c;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ls0/q;->N:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lg0/u0$c;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ls0/q;->M:Ln0/n1$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg0/u0$c;->t(Ljava/lang/String;)Lg0/u0$c;

    :cond_0
    return-object p0
.end method

.method public t(Ljava/lang/String;)Lg0/u0$c;
    .locals 2

    invoke-virtual {p0}, Lg0/u0$c;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ls0/q;->M:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public u(Landroid/util/Size;)Lg0/u0$c;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lg0/u0$c;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->q:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public v(I)Lg0/u0$c;
    .locals 2

    invoke-virtual {p0}, Lg0/u0$c;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->n:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method
