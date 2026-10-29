.class public final Lg0/f1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/i4$b;
.implements Ln0/i2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln0/i4$b<",
        "Lg0/f1;",
        "Ln0/g2;",
        "Lg0/f1$b;",
        ">;",
        "Ln0/i2$a<",
        "Lg0/f1$b;",
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

    invoke-direct {p0, v0}, Lg0/f1$b;-><init>(Ln0/x2;)V

    return-void
.end method

.method public constructor <init>(Ln0/x2;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lg0/f1$b;->a:Ln0/x2;

    .line 4
    sget-object v0, Ls0/q;->N:Ln0/n1$a;

    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, v0, v1}, Ln0/c3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    .line 6
    const-class v0, Lg0/f1;

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
    sget-object p1, Ln0/j4$b;->a:Ln0/j4$b;

    invoke-virtual {p0, p1}, Lg0/f1$b;->j(Ln0/j4$b;)Lg0/f1$b;

    .line 9
    invoke-virtual {p0, v0}, Lg0/f1$b;->r(Ljava/lang/Class;)Lg0/f1$b;

    return-void
.end method

.method public static g(Ln0/n1;)Lg0/f1$b;
    .locals 1

    new-instance v0, Lg0/f1$b;

    invoke-static {p0}, Ln0/x2;->l0(Ln0/n1;)Ln0/x2;

    move-result-object p0

    invoke-direct {v0, p0}, Lg0/f1$b;-><init>(Ln0/x2;)V

    return-object v0
.end method


# virtual methods
.method public a()Ln0/w2;
    .locals 1

    iget-object v0, p0, Lg0/f1$b;->a:Ln0/x2;

    return-object v0
.end method

.method public bridge synthetic b(La1/c;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lg0/f1$b;->n(La1/c;)Lg0/f1$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lg0/f1$b;->u(I)Lg0/f1$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Landroid/util/Size;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lg0/f1$b;->t(Landroid/util/Size;)Lg0/f1$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e()Ln0/i4;
    .locals 1

    invoke-virtual {p0}, Lg0/f1$b;->h()Ln0/g2;

    move-result-object v0

    return-object v0
.end method

.method public f()Lg0/f1;
    .locals 6

    const/16 v0, 0x100

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v2

    sget-object v3, Ln0/g2;->T:Ln0/n1$a;

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/h2;->j:Ln0/n1$a;

    invoke-interface {v0, v1, v2}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v2

    invoke-static {v2}, Lg0/f1;->l0(Ln0/w2;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v2, Ln0/h2;->j:Ln0/n1$a;

    invoke-interface {v0, v2, v1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v2

    invoke-static {v2}, Lg0/f1;->m0(Ln0/w2;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v2

    sget-object v3, Ln0/h2;->j:Ln0/n1$a;

    invoke-interface {v2, v3, v1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v1

    sget-object v2, Ln0/h2;->k:Ln0/n1$a;

    invoke-interface {v1, v2, v0}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v1

    invoke-static {v1}, Lg0/f1;->n0(Ln0/w2;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/h2;->j:Ln0/n1$a;

    const/16 v2, 0x1005

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/h2;->l:Ln0/n1$a;

    sget-object v2, Lg0/k0;->c:Lg0/k0;

    invoke-interface {v0, v1, v2}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v1

    sget-object v2, Ln0/h2;->j:Ln0/n1$a;

    invoke-interface {v1, v2, v0}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p0}, Lg0/f1$b;->h()Ln0/g2;

    move-result-object v0

    invoke-static {v0}, Ln0/i2;->Y(Ln0/i2;)V

    new-instance v1, Lg0/f1;

    invoke-direct {v1, v0}, Lg0/f1;-><init>(Ln0/g2;)V

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v2, Ln0/i2;->q:Ln0/n1$a;

    invoke-interface {v0, v2, v4}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Size;

    if-eqz v0, :cond_4

    new-instance v2, Landroid/util/Rational;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-direct {v2, v3, v0}, Landroid/util/Rational;-><init>(II)V

    invoke-virtual {v1, v2}, Lg0/f1;->M0(Landroid/util/Rational;)V

    :cond_4
    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v2, Ls0/i;->L:Ln0/n1$a;

    invoke-static {}, Lq0/c;->d()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    const-string v2, "The IO executor can\'t be null"

    invoke-static {v0, v2}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v2, Ln0/g2;->R:Ln0/n1$a;

    invoke-interface {v0, v2}, Ln0/n1;->a(Ln0/n1$a;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    invoke-interface {v0, v2}, Ln0/n1;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x3

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v5, 0x1

    if-eq v2, v5, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eq v2, v3, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v5, 0x2

    if-ne v2, v5, :cond_7

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v3, :cond_8

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v2, Ln0/g2;->a0:Ln0/n1$a;

    invoke-interface {v0, v2, v4}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    goto :goto_1

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The flash mode is not allowed to set: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    :goto_1
    return-object v1
.end method

.method public h()Ln0/g2;
    .locals 2

    new-instance v0, Ln0/g2;

    iget-object v1, p0, Lg0/f1$b;->a:Ln0/x2;

    invoke-static {v1}, Ln0/c3;->j0(Ln0/n1;)Ln0/c3;

    move-result-object v1

    invoke-direct {v0, v1}, Ln0/g2;-><init>(Ln0/c3;)V

    return-object v0
.end method

.method public i(I)Lg0/f1$b;
    .locals 2

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/g2;->Q:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public j(Ln0/j4$b;)Lg0/f1$b;
    .locals 2

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i4;->G:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public k(Lg0/k0;)Lg0/f1$b;
    .locals 2

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/h2;->l:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public l(Ljava/util/concurrent/Executor;)Lg0/f1$b;
    .locals 2

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ls0/i;->L:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public m(I)Lg0/f1$b;
    .locals 2

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/g2;->U:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public n(La1/c;)Lg0/f1$b;
    .locals 2

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->u:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public o(Ln0/u3;)Lg0/f1$b;
    .locals 2

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i4;->K:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public p(I)Lg0/f1$b;
    .locals 2

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i4;->A:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public q(I)Lg0/f1$b;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->m:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public r(Ljava/lang/Class;)Lg0/f1$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Lg0/f1;",
            ">;)",
            "Lg0/f1$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ls0/q;->N:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

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

    invoke-virtual {p0, p1}, Lg0/f1$b;->s(Ljava/lang/String;)Lg0/f1$b;

    :cond_0
    return-object p0
.end method

.method public s(Ljava/lang/String;)Lg0/f1$b;
    .locals 2

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ls0/q;->M:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public t(Landroid/util/Size;)Lg0/f1$b;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->q:Ln0/n1$a;

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public u(I)Lg0/f1$b;
    .locals 2

    invoke-virtual {p0}, Lg0/f1$b;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/i2;->n:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-object p0
.end method
