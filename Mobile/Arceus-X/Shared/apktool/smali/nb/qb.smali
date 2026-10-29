.class public final Lnb/qb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic b:Lcom/google/android/gms/internal/measurement/x1;

.field public final synthetic c:Lnb/tc;


# direct methods
.method public constructor <init>(Lnb/tc;Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/internal/measurement/x1;)V
    .locals 0

    iput-object p2, p0, Lnb/qb;->a:Lcom/google/android/gms/measurement/internal/zzr;

    iput-object p3, p0, Lnb/qb;->b:Lcom/google/android/gms/internal/measurement/x1;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/qb;->c:Lnb/tc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    const-string v0, "Failed to get app instance id"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lnb/qb;->c:Lnb/tc;

    iget-object v3, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->x()Lnb/k6;

    move-result-object v4

    invoke-virtual {v4}, Lnb/k6;->w()Lnb/q8;

    move-result-object v4

    sget-object v5, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v4, v5}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->t()Lnb/u5;

    move-result-object v4

    const-string v5, "Analytics storage consent denied; will not get app instance id"

    invoke-virtual {v4, v5}, Lnb/u5;->a(Ljava/lang/String;)V

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->B()Lnb/qa;

    move-result-object v2

    invoke-virtual {v2, v1}, Lnb/qa;->E(Ljava/lang/String;)V

    invoke-virtual {v3}, Lnb/g7;->x()Lnb/k6;

    move-result-object v2

    iget-object v2, v2, Lnb/k6;->h:Lnb/j6;

    invoke-virtual {v2, v1}, Lnb/j6;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lnb/tc;->N()Lnb/d5;

    move-result-object v4

    if-nez v4, :cond_1

    invoke-virtual {v3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    invoke-virtual {v2, v0}, Lnb/u5;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {v3}, Lnb/g7;->C()Lnb/ve;

    move-result-object v0

    iget-object v2, p0, Lnb/qb;->b:Lcom/google/android/gms/internal/measurement/x1;

    :goto_1
    invoke-virtual {v0, v2, v1}, Lnb/ve;->a0(Lcom/google/android/gms/internal/measurement/x1;Ljava/lang/String;)V

    return-void

    :cond_1
    :try_start_1
    iget-object v5, p0, Lnb/qb;->a:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-static {v5}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v4, v5}, Lnb/d5;->A0(Lcom/google/android/gms/measurement/internal/zzr;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v4, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->B()Lnb/qa;

    move-result-object v4

    invoke-virtual {v4, v1}, Lnb/qa;->E(Ljava/lang/String;)V

    invoke-virtual {v3}, Lnb/g7;->x()Lnb/k6;

    move-result-object v3

    iget-object v3, v3, Lnb/k6;->h:Lnb/j6;

    invoke-virtual {v3, v1}, Lnb/j6;->b(Ljava/lang/String;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_5

    :catch_0
    move-exception v2

    goto :goto_3

    :cond_2
    :goto_2
    invoke-virtual {v2}, Lnb/tc;->J()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :goto_3
    :try_start_2
    iget-object v3, p0, Lnb/qb;->c:Lnb/tc;

    iget-object v3, v3, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->o()Lnb/u5;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    iget-object v0, p0, Lnb/qb;->c:Lnb/tc;

    iget-object v2, p0, Lnb/qb;->b:Lcom/google/android/gms/internal/measurement/x1;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v0

    goto :goto_1

    :goto_5
    iget-object v2, p0, Lnb/qb;->c:Lnb/tc;

    iget-object v3, p0, Lnb/qb;->b:Lcom/google/android/gms/internal/measurement/x1;

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->C()Lnb/ve;

    move-result-object v2

    invoke-virtual {v2, v3, v1}, Lnb/ve;->a0(Lcom/google/android/gms/internal/measurement/x1;Ljava/lang/String;)V

    throw v0
.end method
