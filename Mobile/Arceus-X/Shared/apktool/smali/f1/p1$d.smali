.class public final Lf1/p1$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/i4$b;
.implements Ln0/i2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/p1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lf1/a2;",
        ">",
        "Ljava/lang/Object;",
        "Ln0/i4$b<",
        "Lf1/p1<",
        "TT;>;",
        "Lg1/a<",
        "TT;>;",
        "Lf1/p1$d<",
        "TT;>;>;",
        "Ln0/i2$a<",
        "Lf1/p1$d<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field public final a:Ln0/x2;


# direct methods
.method public constructor <init>(Lf1/a2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lf1/p1$d;->g(Lf1/a2;)Ln0/x2;

    move-result-object p1

    invoke-direct {p0, p1}, Lf1/p1$d;-><init>(Ln0/x2;)V

    return-void
.end method

.method public constructor <init>(Ln0/x2;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lf1/p1$d;->a:Ln0/x2;

    .line 4
    sget-object v0, Lg1/a;->Q:Ln0/n1$a;

    invoke-virtual {p1, v0}, Ln0/c3;->a(Ln0/n1$a;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5
    sget-object v0, Ls0/q;->N:Ln0/n1$a;

    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, v0, v1}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    .line 7
    const-class v0, Lf1/p1;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 8
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

    .line 9
    :cond_1
    :goto_0
    sget-object p1, Ln0/j4$b;->d:Ln0/j4$b;

    invoke-virtual {p0, p1}, Lf1/p1$d;->j(Ln0/j4$b;)Lf1/p1$d;

    .line 10
    invoke-virtual {p0, v0}, Lf1/p1$d;->p(Ljava/lang/Class;)Lf1/p1$d;

    return-void

    .line 11
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "VideoOutput is required"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static g(Lf1/a2;)Ln0/x2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lf1/a2;",
            ">(TT;)",
            "Ln0/x2;"
        }
    .end annotation

    invoke-static {}, Ln0/x2;->k0()Ln0/x2;

    move-result-object v0

    sget-object v1, Lg1/a;->Q:Ln0/n1$a;

    invoke-virtual {v0, v1, p0}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static h(Ln0/n1;)Lf1/p1$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/n1;",
            ")",
            "Lf1/p1$d<",
            "+",
            "Lf1/a2;",
            ">;"
        }
    .end annotation

    new-instance v0, Lf1/p1$d;

    invoke-static {p0}, Ln0/x2;->l0(Ln0/n1;)Ln0/x2;

    move-result-object p0

    invoke-direct {v0, p0}, Lf1/p1$d;-><init>(Ln0/x2;)V

    return-object v0
.end method


# virtual methods
.method public a()Ln0/w2;
    .locals 1

    iget-object v0, p0, Lf1/p1$d;->a:Ln0/x2;

    return-object v0
.end method

.method public bridge synthetic b(La1/c;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lf1/p1$d;->m(La1/c;)Lf1/p1$d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lf1/p1$d;->t(I)Lf1/p1$d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Landroid/util/Size;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lf1/p1$d;->s(Landroid/util/Size;)Lf1/p1$d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e()Ln0/i4;
    .locals 1

    invoke-virtual {p0}, Lf1/p1$d;->i()Lg1/a;

    move-result-object v0

    return-object v0
.end method

.method public f()Lf1/p1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf1/p1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lf1/p1;

    invoke-virtual {p0}, Lf1/p1$d;->i()Lg1/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lf1/p1;-><init>(Lg1/a;)V

    return-object v0
.end method

.method public i()Lg1/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg1/a<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lg1/a;

    iget-object v1, p0, Lf1/p1$d;->a:Ln0/x2;

    invoke-static {v1}, Ln0/c3;->j0(Ln0/n1;)Ln0/c3;

    move-result-object v1

    invoke-direct {v0, v1}, Lg1/a;-><init>(Ln0/c3;)V

    return-object v0
.end method

.method public j(Ln0/j4$b;)Lf1/p1$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/j4$b;",
            ")",
            "Lf1/p1$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lf1/p1$d;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i4;->G:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public k(Lg0/k0;)Lf1/p1$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/k0;",
            ")",
            "Lf1/p1$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lf1/p1$d;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/h2;->l:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public l(I)Lf1/p1$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lf1/p1$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lf1/p1$d;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->p:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public m(La1/c;)Lf1/p1$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La1/c;",
            ")",
            "Lf1/p1$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lf1/p1$d;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->u:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public n(Ln0/u3;)Lf1/p1$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/u3;",
            ")",
            "Lf1/p1$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lf1/p1$d;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i4;->K:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public o(I)Lf1/p1$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lf1/p1$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lf1/p1$d;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i4;->A:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public p(Ljava/lang/Class;)Lf1/p1$d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Lf1/p1<",
            "TT;>;>;)",
            "Lf1/p1$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lf1/p1$d;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ls0/q;->N:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lf1/p1$d;->a()Ln0/w2;

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

    invoke-virtual {p0, p1}, Lf1/p1$d;->r(Ljava/lang/String;)Lf1/p1$d;

    :cond_0
    return-object p0
.end method

.method public q(Landroid/util/Range;)Lf1/p1$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lf1/p1$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lf1/p1$d;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i4;->C:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public r(Ljava/lang/String;)Lf1/p1$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lf1/p1$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lf1/p1$d;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ls0/q;->M:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public s(Landroid/util/Size;)Lf1/p1$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            ")",
            "Lf1/p1$d<",
            "TT;>;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "setTargetResolution is not supported."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public t(I)Lf1/p1$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lf1/p1$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lf1/p1$d;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->n:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public u(Lm1/r1$a;)Lf1/p1$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm1/r1$a;",
            ")",
            "Lf1/p1$d<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lf1/p1$d;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Lg1/a;->R:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method
