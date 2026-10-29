.class public final Lnb/r9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/measurement/x1;

.field public final synthetic b:Lnb/qa;


# direct methods
.method public constructor <init>(Lnb/qa;Lcom/google/android/gms/internal/measurement/x1;)V
    .locals 0

    iput-object p2, p0, Lnb/r9;->a:Lcom/google/android/gms/internal/measurement/x1;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/r9;->b:Lnb/qa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lnb/r9;->b:Lnb/qa;

    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->z()Lnb/ld;

    move-result-object v1

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->x()Lnb/k6;

    move-result-object v2

    invoke-virtual {v2}, Lnb/k6;->w()Lnb/q8;

    move-result-object v2

    sget-object v3, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v2, v3}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->t()Lnb/u5;

    move-result-object v1

    const-string v2, "Analytics storage consent denied; will not get session id"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    move-object v1, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lnb/g7;->x()Lnb/k6;

    move-result-object v2

    invoke-virtual {v1}, Lnb/g7;->e()Lu9/e;

    move-result-object v4

    invoke-interface {v4}, Lu9/e;->a()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lnb/k6;->A(J)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lnb/g7;->x()Lnb/k6;

    move-result-object v2

    iget-object v2, v2, Lnb/k6;->r:Lnb/h6;

    invoke-virtual {v2}, Lnb/h6;->a()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    iget-object v1, v1, Lnb/k6;->r:Lnb/h6;

    invoke-virtual {v1}, Lnb/h6;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_3

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    iget-object v2, p0, Lnb/r9;->a:Lcom/google/android/gms/internal/measurement/x1;

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Lnb/ve;->b0(Lcom/google/android/gms/internal/measurement/x1;J)V

    return-void

    :cond_3
    :try_start_0
    iget-object v0, p0, Lnb/r9;->a:Lcom/google/android/gms/internal/measurement/x1;

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/measurement/x1;->l(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lnb/r9;->b:Lnb/qa;

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    const-string v2, "getSessionId failed with exception"

    invoke-virtual {v1, v2, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
