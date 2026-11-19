.class public final Lob/r9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lob/va;


# direct methods
.method public constructor <init>(Lob/va;J)V
    .locals 0

    iput-wide p2, p0, Lob/r9;->a:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/r9;->b:Lob/va;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget-object v0, p0, Lob/r9;->b:Lob/va;

    invoke-virtual {v0}, Lob/o8;->h()V

    invoke-virtual {v0}, Lob/g5;->j()V

    iget-object v1, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->v()Lob/z5;

    move-result-object v2

    const-string v3, "Resetting analytics data (FE)"

    invoke-virtual {v2, v3}, Lob/z5;->a(Ljava/lang/String;)V

    iget-object v2, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->z()Lob/qd;

    move-result-object v3

    invoke-virtual {v3}, Lob/o8;->h()V

    iget-object v3, v3, Lob/qd;->f:Lob/od;

    invoke-virtual {v3}, Lob/od;->c()V

    invoke-virtual {v2}, Lob/l7;->L()Lob/p5;

    move-result-object v3

    invoke-virtual {v3}, Lob/p5;->p()V

    iget-object v3, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v3}, Lob/l7;->g()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    invoke-virtual {v1}, Lob/l7;->x()Lob/p6;

    move-result-object v1

    iget-object v4, v1, Lob/p6;->f:Lob/m6;

    iget-wide v5, p0, Lob/r9;->a:J

    invoke-virtual {v4, v5, v6}, Lob/m6;->b(J)V

    iget-object v4, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v4}, Lob/l7;->x()Lob/p6;

    move-result-object v5

    iget-object v5, v5, Lob/p6;->w:Lob/o6;

    invoke-virtual {v5}, Lob/o6;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_0

    iget-object v5, v1, Lob/p6;->w:Lob/o6;

    invoke-virtual {v5, v6}, Lob/o6;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v5, v1, Lob/p6;->q:Lob/m6;

    const-wide/16 v7, 0x0

    invoke-virtual {v5, v7, v8}, Lob/m6;->b(J)V

    iget-object v5, v1, Lob/p6;->r:Lob/m6;

    invoke-virtual {v5, v7, v8}, Lob/m6;->b(J)V

    invoke-virtual {v4}, Lob/l7;->w()Lob/m;

    move-result-object v4

    invoke-virtual {v4}, Lob/m;->L()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v1, v3}, Lob/p6;->y(Z)V

    :cond_1
    iget-object v4, v1, Lob/p6;->x:Lob/o6;

    invoke-virtual {v4, v6}, Lob/o6;->b(Ljava/lang/String;)V

    iget-object v4, v1, Lob/p6;->y:Lob/m6;

    invoke-virtual {v4, v7, v8}, Lob/m6;->b(J)V

    iget-object v1, v1, Lob/p6;->z:Lob/l6;

    invoke-virtual {v1, v6}, Lob/l6;->b(Landroid/os/Bundle;)V

    invoke-virtual {v2}, Lob/l7;->J()Lob/yc;

    move-result-object v1

    invoke-virtual {v1}, Lob/yc;->p()V

    invoke-virtual {v2}, Lob/l7;->z()Lob/qd;

    move-result-object v1

    iget-object v1, v1, Lob/qd;->e:Lob/pd;

    invoke-virtual {v1}, Lob/pd;->a()V

    iput-boolean v3, v0, Lob/va;->s:Z

    invoke-virtual {v2}, Lob/l7;->J()Lob/yc;

    move-result-object v0

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v0, v1}, Lob/yc;->q(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method
