.class public final Lg0/a2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/i4$b;
.implements Ln0/i2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/a2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln0/i4$b<",
        "Lg0/a2;",
        "Ln0/f3;",
        "Lg0/a2$a;",
        ">;",
        "Ln0/i2$a<",
        "Lg0/a2$a;",
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

    invoke-direct {p0, v0}, Lg0/a2$a;-><init>(Ln0/x2;)V

    return-void
.end method

.method public constructor <init>(Ln0/x2;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lg0/a2$a;->a:Ln0/x2;

    .line 4
    sget-object v0, Ls0/q;->N:Ln0/n1$a;

    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, v0, v1}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 6
    const-class v1, Lg0/a2;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid target class configuration for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_1
    :goto_0
    sget-object v0, Ln0/j4$b;->b:Ln0/j4$b;

    invoke-virtual {p0, v0}, Lg0/a2$a;->i(Ln0/j4$b;)Lg0/a2$a;

    .line 9
    invoke-virtual {p0, v1}, Lg0/a2$a;->o(Ljava/lang/Class;)Lg0/a2$a;

    .line 10
    sget-object v0, Ln0/i2;->p:Ln0/n1$a;

    const/4 v1, -0x1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 12
    invoke-virtual {p1, v0, v2}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_2

    const/4 v1, 0x2

    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public static g(Ln0/n1;)Lg0/a2$a;
    .locals 1

    new-instance v0, Lg0/a2$a;

    invoke-static {p0}, Ln0/x2;->l0(Ln0/n1;)Ln0/x2;

    move-result-object p0

    invoke-direct {v0, p0}, Lg0/a2$a;-><init>(Ln0/x2;)V

    return-object v0
.end method


# virtual methods
.method public a()Ln0/w2;
    .locals 1

    iget-object v0, p0, Lg0/a2$a;->a:Ln0/x2;

    return-object v0
.end method

.method public bridge synthetic b(La1/c;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lg0/a2$a;->l(La1/c;)Lg0/a2$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lg0/a2$a;->r(I)Lg0/a2$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Landroid/util/Size;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lg0/a2$a;->q(Landroid/util/Size;)Lg0/a2$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e()Ln0/i4;
    .locals 1

    invoke-virtual {p0}, Lg0/a2$a;->h()Ln0/f3;

    move-result-object v0

    return-object v0
.end method

.method public f()Lg0/a2;
    .locals 2

    invoke-virtual {p0}, Lg0/a2$a;->h()Ln0/f3;

    move-result-object v0

    invoke-static {v0}, Ln0/i2;->Y(Ln0/i2;)V

    new-instance v1, Lg0/a2;

    invoke-direct {v1, v0}, Lg0/a2;-><init>(Ln0/f3;)V

    return-object v1
.end method

.method public h()Ln0/f3;
    .locals 2

    new-instance v0, Ln0/f3;

    iget-object v1, p0, Lg0/a2$a;->a:Ln0/x2;

    invoke-static {v1}, Ln0/c3;->j0(Ln0/n1;)Ln0/c3;

    move-result-object v1

    invoke-direct {v0, v1}, Ln0/f3;-><init>(Ln0/c3;)V

    return-object v0
.end method

.method public i(Ln0/j4$b;)Lg0/a2$a;
    .locals 2

    invoke-virtual {p0}, Lg0/a2$a;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i4;->G:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public j(Lg0/k0;)Lg0/a2$a;
    .locals 2

    invoke-virtual {p0}, Lg0/a2$a;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/h2;->l:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public k(Z)Lg0/a2$a;
    .locals 2

    invoke-virtual {p0}, Lg0/a2$a;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i4;->F:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public l(La1/c;)Lg0/a2$a;
    .locals 2

    invoke-virtual {p0}, Lg0/a2$a;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->u:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public m(I)Lg0/a2$a;
    .locals 2

    invoke-virtual {p0}, Lg0/a2$a;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i4;->A:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public n(I)Lg0/a2$a;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0}, Lg0/a2$a;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->m:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public o(Ljava/lang/Class;)Lg0/a2$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Lg0/a2;",
            ">;)",
            "Lg0/a2$a;"
        }
    .end annotation

    invoke-virtual {p0}, Lg0/a2$a;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ls0/q;->N:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lg0/a2$a;->a()Ln0/w2;

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

    invoke-virtual {p0, p1}, Lg0/a2$a;->p(Ljava/lang/String;)Lg0/a2$a;

    :cond_0
    return-object p0
.end method

.method public p(Ljava/lang/String;)Lg0/a2$a;
    .locals 2

    invoke-virtual {p0}, Lg0/a2$a;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ls0/q;->M:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public q(Landroid/util/Size;)Lg0/a2$a;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lg0/a2$a;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->q:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public r(I)Lg0/a2$a;
    .locals 3

    invoke-virtual {p0}, Lg0/a2$a;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->n:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lg0/a2$a;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->o:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method
