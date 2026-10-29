.class public final Lnb/m9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lnb/qa;


# direct methods
.method public constructor <init>(Lnb/qa;J)V
    .locals 0

    iput-wide p2, p0, Lnb/m9;->a:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/m9;->b:Lnb/qa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget-object v0, p0, Lnb/m9;->b:Lnb/qa;

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/b5;->j()V

    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->v()Lnb/u5;

    move-result-object v2

    const-string v3, "Resetting analytics data (FE)"

    invoke-virtual {v2, v3}, Lnb/u5;->a(Ljava/lang/String;)V

    iget-object v2, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->z()Lnb/ld;

    move-result-object v3

    invoke-virtual {v3}, Lnb/j8;->h()V

    iget-object v3, v3, Lnb/ld;->f:Lnb/jd;

    invoke-virtual {v3}, Lnb/jd;->c()V

    invoke-virtual {v2}, Lnb/g7;->L()Lnb/k5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/k5;->p()V

    iget-object v3, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->g()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    invoke-virtual {v1}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    iget-object v4, v1, Lnb/k6;->f:Lnb/h6;

    iget-wide v5, p0, Lnb/m9;->a:J

    invoke-virtual {v4, v5, v6}, Lnb/h6;->b(J)V

    iget-object v4, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->x()Lnb/k6;

    move-result-object v5

    iget-object v5, v5, Lnb/k6;->w:Lnb/j6;

    invoke-virtual {v5}, Lnb/j6;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_0

    iget-object v5, v1, Lnb/k6;->w:Lnb/j6;

    invoke-virtual {v5, v6}, Lnb/j6;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v5, v1, Lnb/k6;->q:Lnb/h6;

    const-wide/16 v7, 0x0

    invoke-virtual {v5, v7, v8}, Lnb/h6;->b(J)V

    iget-object v5, v1, Lnb/k6;->r:Lnb/h6;

    invoke-virtual {v5, v7, v8}, Lnb/h6;->b(J)V

    invoke-virtual {v4}, Lnb/g7;->w()Lnb/k;

    move-result-object v4

    invoke-virtual {v4}, Lnb/k;->L()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v1, v3}, Lnb/k6;->y(Z)V

    :cond_1
    iget-object v4, v1, Lnb/k6;->x:Lnb/j6;

    invoke-virtual {v4, v6}, Lnb/j6;->b(Ljava/lang/String;)V

    iget-object v4, v1, Lnb/k6;->y:Lnb/h6;

    invoke-virtual {v4, v7, v8}, Lnb/h6;->b(J)V

    iget-object v1, v1, Lnb/k6;->z:Lnb/g6;

    invoke-virtual {v1, v6}, Lnb/g6;->b(Landroid/os/Bundle;)V

    invoke-virtual {v2}, Lnb/g7;->J()Lnb/tc;

    move-result-object v1

    invoke-virtual {v1}, Lnb/tc;->p()V

    invoke-virtual {v2}, Lnb/g7;->z()Lnb/ld;

    move-result-object v1

    iget-object v1, v1, Lnb/ld;->e:Lnb/kd;

    invoke-virtual {v1}, Lnb/kd;->a()V

    iput-boolean v3, v0, Lnb/qa;->s:Z

    invoke-virtual {v2}, Lnb/g7;->J()Lnb/tc;

    move-result-object v0

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v0, v1}, Lnb/tc;->q(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method
