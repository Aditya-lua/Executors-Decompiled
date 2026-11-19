.class public final Lob/pd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lob/qd;


# direct methods
.method public constructor <init>(Lob/qd;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/pd;->a:Lob/qd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lob/pd;->a:Lob/qd;

    invoke-virtual {v0}, Lob/o8;->h()V

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->x()Lob/p6;

    move-result-object v1

    invoke-virtual {v0}, Lob/l7;->e()Lv9/e;

    move-result-object v2

    invoke-interface {v2}, Lv9/e;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lob/p6;->A(J)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lob/l7;->x()Lob/p6;

    move-result-object v1

    iget-object v1, v1, Lob/p6;->m:Lob/k6;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lob/k6;->b(Z)V

    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    iget v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v2, 0x64

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->w()Lob/z5;

    move-result-object v1

    const-string v2, "Detected application was in foreground"

    invoke-virtual {v1, v2}, Lob/z5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lob/l7;->e()Lv9/e;

    move-result-object v0

    invoke-interface {v0}, Lv9/e;->a()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lob/pd;->c(JZ)V

    :cond_0
    return-void
.end method

.method public final b(JZ)V
    .locals 4

    iget-object v0, p0, Lob/pd;->a:Lob/qd;

    invoke-virtual {v0}, Lob/o8;->h()V

    invoke-virtual {v0}, Lob/qd;->q()V

    iget-object v1, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->x()Lob/p6;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Lob/p6;->A(J)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lob/l7;->x()Lob/p6;

    move-result-object v2

    iget-object v2, v2, Lob/p6;->m:Lob/k6;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lob/k6;->b(Z)V

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->L()Lob/p5;

    move-result-object v0

    invoke-virtual {v0}, Lob/p5;->p()V

    :cond_0
    invoke-virtual {v1}, Lob/l7;->x()Lob/p6;

    move-result-object v0

    iget-object v0, v0, Lob/p6;->q:Lob/m6;

    invoke-virtual {v0, p1, p2}, Lob/m6;->b(J)V

    invoke-virtual {v1}, Lob/l7;->x()Lob/p6;

    move-result-object v0

    iget-object v0, v0, Lob/p6;->m:Lob/k6;

    invoke-virtual {v0}, Lob/k6;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2, p3}, Lob/pd;->c(JZ)V

    :cond_1
    return-void
.end method

.method public final c(JZ)V
    .locals 10

    iget-object v0, p0, Lob/pd;->a:Lob/qd;

    invoke-virtual {v0}, Lob/o8;->h()V

    iget-object v1, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->g()Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v6, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v6}, Lob/l7;->x()Lob/p6;

    move-result-object v1

    iget-object v1, v1, Lob/p6;->q:Lob/m6;

    invoke-virtual {v1, p1, p2}, Lob/m6;->b(J)V

    invoke-virtual {v6}, Lob/l7;->e()Lv9/e;

    move-result-object v1

    invoke-interface {v1}, Lv9/e;->b()J

    move-result-wide v1

    invoke-virtual {v6}, Lob/l7;->a()Lob/b6;

    move-result-object v5

    invoke-virtual {v5}, Lob/b6;->w()Lob/z5;

    move-result-object v5

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Session started, time"

    invoke-virtual {v5, v2, v1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v1, 0x3e8

    div-long v7, p1, v1

    iget-object v9, v0, Lob/o8;->a:Lob/l7;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v9}, Lob/l7;->B()Lob/va;

    move-result-object v0

    const-string v1, "auto"

    const-string v2, "_sid"

    move-wide v4, p1

    invoke-virtual/range {v0 .. v5}, Lob/va;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    invoke-virtual {v6}, Lob/l7;->x()Lob/p6;

    move-result-object v0

    iget-object v0, v0, Lob/p6;->r:Lob/m6;

    invoke-virtual {v0, v7, v8}, Lob/m6;->b(J)V

    invoke-virtual {v6}, Lob/l7;->x()Lob/p6;

    move-result-object v0

    iget-object v0, v0, Lob/p6;->m:Lob/k6;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lob/k6;->b(Z)V

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v0, "_sid"

    invoke-virtual {v5, v0, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v9}, Lob/l7;->B()Lob/va;

    move-result-object v0

    const-string v1, "auto"

    const-string v2, "_s"

    move-wide v3, p1

    invoke-virtual/range {v0 .. v5}, Lob/va;->u(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    invoke-virtual {v6}, Lob/l7;->x()Lob/p6;

    move-result-object v0

    iget-object v0, v0, Lob/p6;->w:Lob/o6;

    invoke-virtual {v0}, Lob/o6;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v1, "_ffr"

    invoke-virtual {v5, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9}, Lob/l7;->B()Lob/va;

    move-result-object v0

    const-string v1, "auto"

    const-string v2, "_ssr"

    move-wide v3, p1

    invoke-virtual/range {v0 .. v5}, Lob/va;->u(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    :cond_1
    :goto_0
    return-void
.end method
