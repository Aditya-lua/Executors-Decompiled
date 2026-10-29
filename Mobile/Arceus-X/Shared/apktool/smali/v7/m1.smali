.class public final Lv7/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/i1;


# instance fields
.field public b:Lcom/google/android/gms/internal/play_billing/h8;

.field public final c:Lv7/o1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/h8;)V
    .locals 1

    new-instance v0, Lv7/o1;

    invoke-direct {v0, p1}, Lv7/o1;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lv7/m1;->c:Lv7/o1;

    iput-object p2, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/play_billing/m9;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/x8;->D()Lcom/google/android/gms/internal/play_billing/v8;

    move-result-object v0

    iget-object v1, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/v8;->t(Lcom/google/android/gms/internal/play_billing/h8;)Lcom/google/android/gms/internal/play_billing/v8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/v8;->w(Lcom/google/android/gms/internal/play_billing/m9;)Lcom/google/android/gms/internal/play_billing/v8;

    iget-object p1, p0, Lv7/m1;->c:Lv7/o1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/x8;

    invoke-virtual {p1, v0}, Lv7/o1;->a(Lcom/google/android/gms/internal/play_billing/x8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingLogger"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/play_billing/l7;IJZ)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/e8;->q(I)Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/h8;

    iput-object p2, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/j7;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/l7;->H()Lcom/google/android/gms/internal/play_billing/u8;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/p8;

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/play_billing/p8;->o(Z)Lcom/google/android/gms/internal/play_billing/p8;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/play_billing/j7;->r(Lcom/google/android/gms/internal/play_billing/p8;)Lcom/google/android/gms/internal/play_billing/j7;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/l7;

    const-wide/16 v0, 0x0

    cmp-long p2, p3, v0

    if-nez p2, :cond_0

    iget-object p2, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object p2, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {p2, p3, p4}, Lcom/google/android/gms/internal/play_billing/e8;->s(J)Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/h8;

    :goto_0
    invoke-virtual {p0, p1, p2}, Lv7/m1;->o(Lcom/google/android/gms/internal/play_billing/l7;Lcom/google/android/gms/internal/play_billing/h8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_1
    const-string p2, "BillingLogger"

    const-string p3, "Unable to log."

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/play_billing/p7;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {p0, p1, v0}, Lv7/m1;->p(Lcom/google/android/gms/internal/play_billing/p7;Lcom/google/android/gms/internal/play_billing/h8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingLogger"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final d(Lcom/google/android/gms/internal/play_billing/e9;)V
    .locals 3

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/x8;->D()Lcom/google/android/gms/internal/play_billing/v8;

    move-result-object v0

    iget-object v1, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/v8;->t(Lcom/google/android/gms/internal/play_billing/h8;)Lcom/google/android/gms/internal/play_billing/v8;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/d8;->B()Lcom/google/android/gms/internal/play_billing/a8;

    move-result-object v1

    const-string v2, "ProxyBillingBroadcastReceiver"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/a8;->q(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/a8;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/a8;->s(I)Lcom/google/android/gms/internal/play_billing/a8;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/a8;->r(Lcom/google/android/gms/internal/play_billing/e9;)Lcom/google/android/gms/internal/play_billing/a8;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/v8;->r(Lcom/google/android/gms/internal/play_billing/a8;)Lcom/google/android/gms/internal/play_billing/v8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/x8;

    iget-object v0, p0, Lv7/m1;->c:Lv7/o1;

    invoke-virtual {v0, p1}, Lv7/o1;->a(Lcom/google/android/gms/internal/play_billing/x8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingLogger"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/play_billing/p7;I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/e8;->q(I)Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/h8;

    iput-object p2, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {p0, p1}, Lv7/m1;->c(Lcom/google/android/gms/internal/play_billing/p7;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingLogger"

    const-string v0, "Unable to log."

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final f(Lcom/android/billingclient/api/d;J)V
    .locals 3

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/d8;->B()Lcom/google/android/gms/internal/play_billing/a8;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/a8;->s(I)Lcom/google/android/gms/internal/play_billing/a8;

    sget-object v1, Lcom/google/android/gms/internal/play_billing/z7;->f:Lcom/google/android/gms/internal/play_billing/z7;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/a8;->o(Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/a8;

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/u7;->C()Lcom/google/android/gms/internal/play_billing/q7;

    move-result-object v1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/q7;->t(I)Lcom/google/android/gms/internal/play_billing/q7;

    invoke-virtual {p1}, Lcom/android/billingclient/api/d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/q7;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/q7;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/a8;->p(Lcom/google/android/gms/internal/play_billing/q7;)Lcom/google/android/gms/internal/play_billing/a8;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/x8;->D()Lcom/google/android/gms/internal/play_billing/v8;

    move-result-object p1

    const-wide/16 v1, 0x0

    cmp-long v1, p2, v1

    if-nez v1, :cond_1

    iget-object p2, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/play_billing/e8;->s(J)Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/h8;

    :goto_1
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/play_billing/v8;->t(Lcom/google/android/gms/internal/play_billing/h8;)Lcom/google/android/gms/internal/play_billing/v8;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/play_billing/v8;->r(Lcom/google/android/gms/internal/play_billing/a8;)Lcom/google/android/gms/internal/play_billing/v8;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/x8;

    iget-object p2, p0, Lv7/m1;->c:Lv7/o1;

    invoke-virtual {p2, p1}, Lv7/o1;->a(Lcom/google/android/gms/internal/play_billing/x8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_2
    const-string p2, "BillingLogger"

    const-string p3, "Unable to log."

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final g(Lcom/google/android/gms/internal/play_billing/p7;JZ)V
    .locals 2

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/n7;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/p7;->E()Lcom/google/android/gms/internal/play_billing/u8;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/p8;

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/play_billing/p8;->o(Z)Lcom/google/android/gms/internal/play_billing/p8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/n7;->q(Lcom/google/android/gms/internal/play_billing/p8;)Lcom/google/android/gms/internal/play_billing/n7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/p7;

    const-wide/16 v0, 0x0

    cmp-long p4, p2, v0

    if-nez p4, :cond_0

    iget-object p2, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object p4, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object p4

    check-cast p4, Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {p4, p2, p3}, Lcom/google/android/gms/internal/play_billing/e8;->s(J)Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/h8;

    :goto_0
    invoke-virtual {p0, p1, p2}, Lv7/m1;->p(Lcom/google/android/gms/internal/play_billing/p7;Lcom/google/android/gms/internal/play_billing/h8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_1
    const-string p2, "BillingLogger"

    const-string p3, "Unable to log."

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final h(J)V
    .locals 4

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/d8;->B()Lcom/google/android/gms/internal/play_billing/a8;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/a8;->s(I)Lcom/google/android/gms/internal/play_billing/a8;

    sget-object v1, Lcom/google/android/gms/internal/play_billing/z7;->g:Lcom/google/android/gms/internal/play_billing/z7;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/a8;->o(Lcom/google/android/gms/internal/play_billing/z7;)Lcom/google/android/gms/internal/play_billing/a8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/d8;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/x8;->D()Lcom/google/android/gms/internal/play_billing/v8;

    move-result-object v1

    const-wide/16 v2, 0x0

    cmp-long v2, p1, v2

    if-nez v2, :cond_0

    iget-object p1, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/play_billing/e8;->s(J)Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/h8;

    :goto_0
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/v8;->t(Lcom/google/android/gms/internal/play_billing/h8;)Lcom/google/android/gms/internal/play_billing/v8;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/play_billing/v8;->s(Lcom/google/android/gms/internal/play_billing/d8;)Lcom/google/android/gms/internal/play_billing/v8;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/x8;

    iget-object p2, p0, Lv7/m1;->c:Lv7/o1;

    invoke-virtual {p2, p1}, Lv7/o1;->a(Lcom/google/android/gms/internal/play_billing/x8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_1
    const-string p2, "BillingLogger"

    const-string v0, "Unable to log."

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final i(Lcom/google/android/gms/internal/play_billing/i9;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lv7/m1;->c:Lv7/o1;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/x8;->D()Lcom/google/android/gms/internal/play_billing/v8;

    move-result-object v1

    iget-object v2, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/v8;->t(Lcom/google/android/gms/internal/play_billing/h8;)Lcom/google/android/gms/internal/play_billing/v8;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/v8;->v(Lcom/google/android/gms/internal/play_billing/i9;)Lcom/google/android/gms/internal/play_billing/v8;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/x8;

    invoke-virtual {v0, p1}, Lv7/o1;->a(Lcom/google/android/gms/internal/play_billing/x8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingLogger"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final j(Lcom/google/android/gms/internal/play_billing/l7;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {p0, p1, v0}, Lv7/m1;->o(Lcom/google/android/gms/internal/play_billing/l7;Lcom/google/android/gms/internal/play_billing/h8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingLogger"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final k(Lcom/google/android/gms/internal/play_billing/l7;I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/e8;->q(I)Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/h8;

    iput-object p2, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {p0, p1}, Lv7/m1;->j(Lcom/google/android/gms/internal/play_billing/l7;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingLogger"

    const-string v0, "Unable to log."

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final l(Lcom/google/android/gms/internal/play_billing/l7;JZ)V
    .locals 2

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/j7;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/l7;->H()Lcom/google/android/gms/internal/play_billing/u8;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/p8;

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/play_billing/p8;->o(Z)Lcom/google/android/gms/internal/play_billing/p8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/j7;->r(Lcom/google/android/gms/internal/play_billing/p8;)Lcom/google/android/gms/internal/play_billing/j7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/l7;

    const-wide/16 v0, 0x0

    cmp-long p4, p2, v0

    if-nez p4, :cond_0

    iget-object p2, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object p4, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object p4

    check-cast p4, Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {p4, p2, p3}, Lcom/google/android/gms/internal/play_billing/e8;->s(J)Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/h8;

    :goto_0
    invoke-virtual {p0, p1, p2}, Lv7/m1;->o(Lcom/google/android/gms/internal/play_billing/l7;Lcom/google/android/gms/internal/play_billing/h8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_1
    const-string p2, "BillingLogger"

    const-string p3, "Unable to log."

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final m(Lcom/google/android/gms/internal/play_billing/x7;)V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/x8;->D()Lcom/google/android/gms/internal/play_billing/v8;

    move-result-object v0

    iget-object v1, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/v8;->t(Lcom/google/android/gms/internal/play_billing/h8;)Lcom/google/android/gms/internal/play_billing/v8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/v8;->q(Lcom/google/android/gms/internal/play_billing/x7;)Lcom/google/android/gms/internal/play_billing/v8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/x8;

    iget-object v0, p0, Lv7/m1;->c:Lv7/o1;

    invoke-virtual {v0, p1}, Lv7/o1;->a(Lcom/google/android/gms/internal/play_billing/x8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "BillingLogger"

    const-string v1, "Unable to log."

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final n(Lcom/google/android/gms/internal/play_billing/l7;IJ)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/e8;->q(I)Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/h8;

    iput-object p2, p0, Lv7/m1;->b:Lcom/google/android/gms/internal/play_billing/h8;

    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/t4;->s()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {p2, p3, p4}, Lcom/google/android/gms/internal/play_billing/e8;->s(J)Lcom/google/android/gms/internal/play_billing/e8;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/h8;

    :goto_0
    invoke-virtual {p0, p1, p2}, Lv7/m1;->o(Lcom/google/android/gms/internal/play_billing/l7;Lcom/google/android/gms/internal/play_billing/h8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingLogger"

    const-string p3, "Unable to log."

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final o(Lcom/google/android/gms/internal/play_billing/l7;Lcom/google/android/gms/internal/play_billing/h8;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/x8;->D()Lcom/google/android/gms/internal/play_billing/v8;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/v8;->t(Lcom/google/android/gms/internal/play_billing/h8;)Lcom/google/android/gms/internal/play_billing/v8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/v8;->o(Lcom/google/android/gms/internal/play_billing/l7;)Lcom/google/android/gms/internal/play_billing/v8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/x8;

    iget-object p2, p0, Lv7/m1;->c:Lv7/o1;

    invoke-virtual {p2, p1}, Lv7/o1;->a(Lcom/google/android/gms/internal/play_billing/x8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingLogger"

    const-string v0, "Unable to log."

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final p(Lcom/google/android/gms/internal/play_billing/p7;Lcom/google/android/gms/internal/play_billing/h8;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/x8;->D()Lcom/google/android/gms/internal/play_billing/v8;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/v8;->t(Lcom/google/android/gms/internal/play_billing/h8;)Lcom/google/android/gms/internal/play_billing/v8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/v8;->p(Lcom/google/android/gms/internal/play_billing/p7;)Lcom/google/android/gms/internal/play_billing/v8;

    iget-object p1, p0, Lv7/m1;->c:Lv7/o1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/p4;->i()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/x8;

    invoke-virtual {p1, p2}, Lv7/o1;->a(Lcom/google/android/gms/internal/play_billing/x8;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const-string p2, "BillingLogger"

    const-string v0, "Unable to log."

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
