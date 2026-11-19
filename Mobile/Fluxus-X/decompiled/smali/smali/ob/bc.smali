.class public final Lob/bc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/i0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/google/android/gms/internal/measurement/x1;

.field public final synthetic d:Lob/yc;


# direct methods
.method public constructor <init>(Lob/yc;Lob/i0;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/x1;)V
    .locals 0

    iput-object p2, p0, Lob/bc;->a:Lob/i0;

    iput-object p3, p0, Lob/bc;->b:Ljava/lang/String;

    iput-object p4, p0, Lob/bc;->c:Lcom/google/android/gms/internal/measurement/x1;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/bc;->d:Lob/yc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lob/bc;->d:Lob/yc;

    invoke-virtual {v1}, Lob/yc;->N()Lob/i5;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v1, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->o()Lob/z5;

    move-result-object v2

    const-string v3, "Discarding data. Failed to send event to service to bundle"

    invoke-virtual {v2, v3}, Lob/z5;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lob/l7;->C()Lob/ff;

    move-result-object v1

    iget-object v2, p0, Lob/bc;->c:Lcom/google/android/gms/internal/measurement/x1;

    :goto_0
    invoke-virtual {v1, v2, v0}, Lob/ff;->d0(Lcom/google/android/gms/internal/measurement/x1;[B)V

    return-void

    :cond_0
    :try_start_1
    iget-object v3, p0, Lob/bc;->a:Lob/i0;

    iget-object v4, p0, Lob/bc;->b:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lob/i5;->V1(Lob/i0;Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v1}, Lob/yc;->J()V
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
    iget-object v2, p0, Lob/bc;->d:Lob/yc;

    iget-object v2, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->o()Lob/z5;

    move-result-object v2

    const-string v3, "Failed to send event to the service to bundle"

    invoke-virtual {v2, v3, v1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    iget-object v1, p0, Lob/bc;->d:Lob/yc;

    iget-object v2, p0, Lob/bc;->c:Lcom/google/android/gms/internal/measurement/x1;

    iget-object v1, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->C()Lob/ff;

    move-result-object v1

    goto :goto_0

    :goto_2
    iget-object v2, p0, Lob/bc;->d:Lob/yc;

    iget-object v3, p0, Lob/bc;->c:Lcom/google/android/gms/internal/measurement/x1;

    iget-object v2, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->C()Lob/ff;

    move-result-object v2

    invoke-virtual {v2, v3, v0}, Lob/ff;->d0(Lcom/google/android/gms/internal/measurement/x1;[B)V

    throw v1
.end method
