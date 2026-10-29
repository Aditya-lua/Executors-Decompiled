.class public final Lnb/wb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzbg;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/google/android/gms/internal/measurement/x1;

.field public final synthetic d:Lnb/tc;


# direct methods
.method public constructor <init>(Lnb/tc;Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/x1;)V
    .locals 0

    iput-object p2, p0, Lnb/wb;->a:Lcom/google/android/gms/measurement/internal/zzbg;

    iput-object p3, p0, Lnb/wb;->b:Ljava/lang/String;

    iput-object p4, p0, Lnb/wb;->c:Lcom/google/android/gms/internal/measurement/x1;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/wb;->d:Lnb/tc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnb/wb;->d:Lnb/tc;

    invoke-virtual {v1}, Lnb/tc;->N()Lnb/d5;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Discarding data. Failed to send event to service to bundle"

    invoke-virtual {v2, v3}, Lnb/u5;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lnb/g7;->C()Lnb/ve;

    move-result-object v1

    iget-object v2, p0, Lnb/wb;->c:Lcom/google/android/gms/internal/measurement/x1;

    :goto_0
    invoke-virtual {v1, v2, v0}, Lnb/ve;->d0(Lcom/google/android/gms/internal/measurement/x1;[B)V

    return-void

    :cond_0
    :try_start_1
    iget-object v3, p0, Lnb/wb;->a:Lcom/google/android/gms/measurement/internal/zzbg;

    iget-object v4, p0, Lnb/wb;->b:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lnb/d5;->e0(Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)[B

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
    iget-object v2, p0, Lnb/wb;->d:Lnb/tc;

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Failed to send event to the service to bundle"

    invoke-virtual {v2, v3, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    iget-object v1, p0, Lnb/wb;->d:Lnb/tc;

    iget-object v2, p0, Lnb/wb;->c:Lcom/google/android/gms/internal/measurement/x1;

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->C()Lnb/ve;

    move-result-object v1

    goto :goto_0

    :goto_2
    iget-object v2, p0, Lnb/wb;->d:Lnb/tc;

    iget-object v3, p0, Lnb/wb;->c:Lcom/google/android/gms/internal/measurement/x1;

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->C()Lnb/ve;

    move-result-object v2

    invoke-virtual {v2, v3, v0}, Lnb/ve;->d0(Lcom/google/android/gms/internal/measurement/x1;[B)V

    throw v1
.end method
