.class public final Lnb/dc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic d:Lcom/google/android/gms/internal/measurement/x1;

.field public final synthetic e:Lnb/tc;


# direct methods
.method public constructor <init>(Lnb/tc;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/internal/measurement/x1;)V
    .locals 0

    iput-object p2, p0, Lnb/dc;->a:Ljava/lang/String;

    iput-object p3, p0, Lnb/dc;->b:Ljava/lang/String;

    iput-object p4, p0, Lnb/dc;->c:Lcom/google/android/gms/measurement/internal/zzr;

    iput-object p5, p0, Lnb/dc;->d:Lcom/google/android/gms/internal/measurement/x1;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/dc;->e:Lnb/tc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    iget-object v1, p0, Lnb/dc;->e:Lnb/tc;

    invoke-virtual {v1}, Lnb/tc;->N()Lnb/d5;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Failed to get conditional properties; not connected to service"

    iget-object v4, p0, Lnb/dc;->a:Ljava/lang/String;

    iget-object v5, p0, Lnb/dc;->b:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v5}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lnb/g7;->C()Lnb/ve;

    move-result-object v1

    iget-object v2, p0, Lnb/dc;->d:Lcom/google/android/gms/internal/measurement/x1;

    :goto_0
    invoke-virtual {v1, v2, v0}, Lnb/ve;->g0(Lcom/google/android/gms/internal/measurement/x1;Ljava/util/ArrayList;)V

    return-void

    :cond_0
    :try_start_1
    iget-object v3, p0, Lnb/dc;->c:Lcom/google/android/gms/measurement/internal/zzr;

    invoke-static {v3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, p0, Lnb/dc;->a:Ljava/lang/String;

    iget-object v5, p0, Lnb/dc;->b:Ljava/lang/String;

    invoke-interface {v2, v4, v5, v3}, Lnb/d5;->e2(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lnb/ve;->h0(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v1}, Lnb/tc;->J()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_2
    iget-object v2, p0, Lnb/dc;->e:Lnb/tc;

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Failed to get conditional properties; remote exception"

    iget-object v4, p0, Lnb/dc;->a:Ljava/lang/String;

    iget-object v5, p0, Lnb/dc;->b:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v5, v1}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    iget-object v1, p0, Lnb/dc;->e:Lnb/tc;

    iget-object v2, p0, Lnb/dc;->d:Lcom/google/android/gms/internal/measurement/x1;

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->C()Lnb/ve;

    move-result-object v1

    goto :goto_0

    :goto_2
    iget-object v2, p0, Lnb/dc;->e:Lnb/tc;

    iget-object v3, p0, Lnb/dc;->d:Lcom/google/android/gms/internal/measurement/x1;

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->C()Lnb/ve;

    move-result-object v2

    invoke-virtual {v2, v3, v0}, Lnb/ve;->g0(Lcom/google/android/gms/internal/measurement/x1;Ljava/util/ArrayList;)V

    throw v1
.end method
