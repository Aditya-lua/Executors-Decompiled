.class public final Lnb/gd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lnb/fd;

.field public final synthetic b:Lnb/ld;


# direct methods
.method public constructor <init>(Lnb/ld;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/gd;->b:Lnb/ld;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lnb/gd;->b:Lnb/ld;

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-object v1, p0, Lnb/gd;->a:Lnb/fd;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lnb/ld;->t()Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->x()Lnb/k6;

    move-result-object v2

    iget-object v2, v2, Lnb/k6;->t:Lnb/f6;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lnb/f6;->b(Z)V

    invoke-virtual {v0, v3}, Lnb/ld;->o(Z)V

    invoke-virtual {v1}, Lnb/g7;->w()Lnb/k;

    move-result-object v2

    const/4 v3, 0x0

    sget-object v4, Lnb/z4;->U0:Lnb/y4;

    invoke-virtual {v2, v3, v4}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->B()Lnb/qa;

    move-result-object v2

    invoke-virtual {v2}, Lnb/qa;->v0()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "Retrying trigger URI registration in foreground"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnb/g7;->B()Lnb/qa;

    move-result-object v0

    invoke-virtual {v0}, Lnb/qa;->x0()V

    :cond_1
    return-void
.end method

.method public final b(J)V
    .locals 7

    new-instance v0, Lnb/fd;

    iget-object v6, p0, Lnb/gd;->b:Lnb/ld;

    iget-object v1, v6, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v2

    move-object v1, p0

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, Lnb/fd;-><init>(Lnb/gd;JJ)V

    iput-object v0, v1, Lnb/gd;->a:Lnb/fd;

    invoke-virtual {v6}, Lnb/ld;->t()Landroid/os/Handler;

    move-result-object p1

    iget-object p2, v1, Lnb/gd;->a:Lnb/fd;

    const-wide/16 v2, 0x7d0

    invoke-virtual {p1, p2, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
