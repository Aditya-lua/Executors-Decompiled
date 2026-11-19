.class public final Lob/qd;
.super Lob/g5;
.source "SourceFile"


# instance fields
.field public c:Landroid/os/Handler;

.field public d:Z

.field public final e:Lob/pd;

.field public final f:Lob/od;

.field public final g:Lob/ld;


# direct methods
.method public constructor <init>(Lob/l7;)V
    .locals 0

    invoke-direct {p0, p1}, Lob/g5;-><init>(Lob/l7;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lob/qd;->d:Z

    new-instance p1, Lob/pd;

    invoke-direct {p1, p0}, Lob/pd;-><init>(Lob/qd;)V

    iput-object p1, p0, Lob/qd;->e:Lob/pd;

    new-instance p1, Lob/od;

    invoke-direct {p1, p0}, Lob/od;-><init>(Lob/qd;)V

    iput-object p1, p0, Lob/qd;->f:Lob/od;

    new-instance p1, Lob/ld;

    invoke-direct {p1, p0}, Lob/ld;-><init>(Lob/qd;)V

    iput-object p1, p0, Lob/qd;->g:Lob/ld;

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

    invoke-virtual {p0}, Lob/o8;->h()V

    iput-boolean p1, p0, Lob/qd;->d:Z

    return-void
.end method

.method public final p()Z
    .locals 1

    invoke-virtual {p0}, Lob/o8;->h()V

    iget-boolean v0, p0, Lob/qd;->d:Z

    return v0
.end method

.method public final synthetic q()V
    .locals 0

    invoke-virtual {p0}, Lob/qd;->u()V

    return-void
.end method

.method public final synthetic r(J)V
    .locals 4

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/qd;->u()V

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->w()Lob/z5;

    move-result-object v1

    const-string v2, "Activity resumed, time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lob/l7;->w()Lob/m;

    move-result-object v1

    const/4 v2, 0x0

    sget-object v3, Lob/e5;->V0:Lob/d5;

    invoke-virtual {v1, v2, v3}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lob/l7;->w()Lob/m;

    move-result-object v0

    invoke-virtual {v0}, Lob/m;->N()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lob/qd;->d:Z

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p0, Lob/qd;->f:Lob/od;

    invoke-virtual {v0, p1, p2}, Lob/od;->a(J)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lob/l7;->w()Lob/m;

    move-result-object v1

    invoke-virtual {v1}, Lob/m;->N()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lob/l7;->x()Lob/p6;

    move-result-object v0

    iget-object v0, v0, Lob/p6;->t:Lob/k6;

    invoke-virtual {v0}, Lob/k6;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lob/qd;->f:Lob/od;

    invoke-virtual {v0, p1, p2}, Lob/od;->a(J)V

    :cond_3
    :goto_0
    iget-object p1, p0, Lob/qd;->g:Lob/ld;

    invoke-virtual {p1}, Lob/ld;->a()V

    iget-object p1, p0, Lob/qd;->e:Lob/pd;

    iget-object p2, p1, Lob/pd;->a:Lob/qd;

    invoke-virtual {p2}, Lob/o8;->h()V

    iget-object v0, p2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->g()Z

    move-result v0

    if-nez v0, :cond_4

    return-void

    :cond_4
    iget-object p2, p2, Lob/o8;->a:Lob/l7;

    invoke-virtual {p2}, Lob/l7;->e()Lv9/e;

    move-result-object p2

    invoke-interface {p2}, Lv9/e;->a()J

    move-result-wide v0

    const/4 p2, 0x0

    invoke-virtual {p1, v0, v1, p2}, Lob/pd;->b(JZ)V

    return-void
.end method

.method public final synthetic s(J)V
    .locals 4

    invoke-virtual {p0}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/qd;->u()V

    iget-object v0, p0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->w()Lob/z5;

    move-result-object v1

    const-string v2, "Activity paused, time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lob/qd;->g:Lob/ld;

    invoke-virtual {v1, p1, p2}, Lob/ld;->b(J)V

    invoke-virtual {v0}, Lob/l7;->w()Lob/m;

    move-result-object v0

    invoke-virtual {v0}, Lob/m;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lob/qd;->f:Lob/od;

    invoke-virtual {v0, p1, p2}, Lob/od;->b(J)V

    :cond_0
    return-void
.end method

.method public final synthetic t()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lob/qd;->c:Landroid/os/Handler;

    return-object v0
.end method

.method public final u()V
    .locals 2

    invoke-virtual {p0}, Lob/o8;->h()V

    iget-object v0, p0, Lob/qd;->c:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/measurement/q1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/q1;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lob/qd;->c:Landroid/os/Handler;

    :cond_0
    return-void
.end method
