.class public final Lob/ld;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lob/kd;

.field public final synthetic b:Lob/qd;


# direct methods
.method public constructor <init>(Lob/qd;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/ld;->b:Lob/qd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lob/ld;->b:Lob/qd;

    invoke-virtual {v0}, Lob/o8;->h()V

    iget-object v1, p0, Lob/ld;->a:Lob/kd;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lob/qd;->t()Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v1, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->x()Lob/p6;

    move-result-object v2

    iget-object v2, v2, Lob/p6;->t:Lob/k6;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lob/k6;->b(Z)V

    invoke-virtual {v0, v3}, Lob/qd;->o(Z)V

    invoke-virtual {v1}, Lob/l7;->w()Lob/m;

    move-result-object v2

    const/4 v3, 0x0

    sget-object v4, Lob/e5;->U0:Lob/d5;

    invoke-virtual {v2, v3, v4}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->B()Lob/va;

    move-result-object v2

    invoke-virtual {v2}, Lob/va;->v0()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->w()Lob/z5;

    move-result-object v1

    const-string v2, "Retrying trigger URI registration in foreground"

    invoke-virtual {v1, v2}, Lob/z5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lob/l7;->B()Lob/va;

    move-result-object v0

    invoke-virtual {v0}, Lob/va;->x0()V

    :cond_1
    return-void
.end method

.method public final b(J)V
    .locals 7

    new-instance v0, Lob/kd;

    iget-object v6, p0, Lob/ld;->b:Lob/qd;

    iget-object v1, v6, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->e()Lv9/e;

    move-result-object v1

    invoke-interface {v1}, Lv9/e;->a()J

    move-result-wide v2

    move-object v1, p0

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, Lob/kd;-><init>(Lob/ld;JJ)V

    iput-object v0, v1, Lob/ld;->a:Lob/kd;

    invoke-virtual {v6}, Lob/qd;->t()Landroid/os/Handler;

    move-result-object p1

    iget-object p2, v1, Lob/ld;->a:Lob/kd;

    const-wide/16 v2, 0x7d0

    invoke-virtual {p1, p2, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
