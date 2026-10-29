.class public final Lnb/ld;
.super Lnb/b5;
.source "SourceFile"


# instance fields
.field public c:Landroid/os/Handler;

.field public d:Z

.field public final e:Lnb/kd;

.field public final f:Lnb/jd;

.field public final g:Lnb/gd;


# direct methods
.method public constructor <init>(Lnb/g7;)V
    .locals 0

    invoke-direct {p0, p1}, Lnb/b5;-><init>(Lnb/g7;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lnb/ld;->d:Z

    new-instance p1, Lnb/kd;

    invoke-direct {p1, p0}, Lnb/kd;-><init>(Lnb/ld;)V

    iput-object p1, p0, Lnb/ld;->e:Lnb/kd;

    new-instance p1, Lnb/jd;

    invoke-direct {p1, p0}, Lnb/jd;-><init>(Lnb/ld;)V

    iput-object p1, p0, Lnb/ld;->f:Lnb/jd;

    new-instance p1, Lnb/gd;

    invoke-direct {p1, p0}, Lnb/gd;-><init>(Lnb/ld;)V

    iput-object p1, p0, Lnb/ld;->g:Lnb/gd;

    return-void
.end method


# virtual methods
.method public final m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final o(Z)V
    .locals 0

    invoke-virtual {p0}, Lnb/j8;->h()V

    iput-boolean p1, p0, Lnb/ld;->d:Z

    return-void
.end method

.method public final p()Z
    .locals 1

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-boolean v0, p0, Lnb/ld;->d:Z

    return v0
.end method

.method public final synthetic q()V
    .locals 0

    invoke-virtual {p0}, Lnb/ld;->u()V

    return-void
.end method

.method public final synthetic r(J)V
    .locals 4

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/ld;->u()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "Activity resumed, time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v1

    const/4 v2, 0x0

    sget-object v3, Lnb/z4;->V0:Lnb/y4;

    invoke-virtual {v1, v2, v3}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v0

    invoke-virtual {v0}, Lnb/k;->N()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lnb/ld;->d:Z

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p0, Lnb/ld;->f:Lnb/jd;

    invoke-virtual {v0, p1, p2}, Lnb/jd;->a(J)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v1

    invoke-virtual {v1}, Lnb/k;->N()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v0

    iget-object v0, v0, Lnb/k6;->t:Lnb/f6;

    invoke-virtual {v0}, Lnb/f6;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lnb/ld;->f:Lnb/jd;

    invoke-virtual {v0, p1, p2}, Lnb/jd;->a(J)V

    :cond_3
    :goto_0
    iget-object p1, p0, Lnb/ld;->g:Lnb/gd;

    invoke-virtual {p1}, Lnb/gd;->a()V

    iget-object p1, p0, Lnb/ld;->e:Lnb/kd;

    iget-object p2, p1, Lnb/kd;->a:Lnb/ld;

    invoke-virtual {p2}, Lnb/j8;->h()V

    iget-object v0, p2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->g()Z

    move-result v0

    if-nez v0, :cond_4

    return-void

    :cond_4
    iget-object p2, p2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p2}, Lnb/g7;->e()Lu9/e;

    move-result-object p2

    invoke-interface {p2}, Lu9/e;->a()J

    move-result-wide v0

    const/4 p2, 0x0

    invoke-virtual {p1, v0, v1, p2}, Lnb/kd;->b(JZ)V

    return-void
.end method

.method public final synthetic s(J)V
    .locals 4

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/ld;->u()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "Activity paused, time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lnb/ld;->g:Lnb/gd;

    invoke-virtual {v1, p1, p2}, Lnb/gd;->b(J)V

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v0

    invoke-virtual {v0}, Lnb/k;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnb/ld;->f:Lnb/jd;

    invoke-virtual {v0, p1, p2}, Lnb/jd;->b(J)V

    :cond_0
    return-void
.end method

.method public final synthetic t()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lnb/ld;->c:Landroid/os/Handler;

    return-object v0
.end method

.method public final u()V
    .locals 2

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/ld;->c:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/measurement/q1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/q1;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lnb/ld;->c:Landroid/os/Handler;

    :cond_0
    return-void
.end method
