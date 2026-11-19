.class public final Lob/vb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/hf;

.field public final synthetic b:Lcom/google/android/gms/internal/measurement/x1;

.field public final synthetic c:Lob/yc;


# direct methods
.method public constructor <init>(Lob/yc;Lob/hf;Lcom/google/android/gms/internal/measurement/x1;)V
    .locals 0

    iput-object p2, p0, Lob/vb;->a:Lob/hf;

    iput-object p3, p0, Lob/vb;->b:Lcom/google/android/gms/internal/measurement/x1;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/vb;->c:Lob/yc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    const-string v0, "Failed to get app instance id"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lob/vb;->c:Lob/yc;

    iget-object v3, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v3}, Lob/l7;->x()Lob/p6;

    move-result-object v4

    invoke-virtual {v4}, Lob/p6;->w()Lob/v8;

    move-result-object v4

    sget-object v5, Lob/u8;->c:Lob/u8;

    invoke-virtual {v4, v5}, Lob/v8;->o(Lob/u8;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Lob/l7;->a()Lob/b6;

    move-result-object v4

    invoke-virtual {v4}, Lob/b6;->t()Lob/z5;

    move-result-object v4

    const-string v5, "Analytics storage consent denied; will not get app instance id"

    invoke-virtual {v4, v5}, Lob/z5;->a(Ljava/lang/String;)V

    iget-object v2, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->B()Lob/va;

    move-result-object v2

    invoke-virtual {v2, v1}, Lob/va;->E(Ljava/lang/String;)V

    invoke-virtual {v3}, Lob/l7;->x()Lob/p6;

    move-result-object v2

    iget-object v2, v2, Lob/p6;->h:Lob/o6;

    invoke-virtual {v2, v1}, Lob/o6;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lob/yc;->N()Lob/i5;

    move-result-object v4

    if-nez v4, :cond_1

    invoke-virtual {v3}, Lob/l7;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->o()Lob/z5;

    move-result-object v2

    invoke-virtual {v2, v0}, Lob/z5;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {v3}, Lob/l7;->C()Lob/ff;

    move-result-object v0

    iget-object v2, p0, Lob/vb;->b:Lcom/google/android/gms/internal/measurement/x1;

    :goto_1
    invoke-virtual {v0, v2, v1}, Lob/ff;->a0(Lcom/google/android/gms/internal/measurement/x1;Ljava/lang/String;)V

    return-void

    :cond_1
    :try_start_1
    iget-object v5, p0, Lob/vb;->a:Lob/hf;

    invoke-static {v5}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v4, v5}, Lob/i5;->Y0(Lob/hf;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v4, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v4}, Lob/l7;->B()Lob/va;

    move-result-object v4

    invoke-virtual {v4, v1}, Lob/va;->E(Ljava/lang/String;)V

    invoke-virtual {v3}, Lob/l7;->x()Lob/p6;

    move-result-object v3

    iget-object v3, v3, Lob/p6;->h:Lob/o6;

    invoke-virtual {v3, v1}, Lob/o6;->b(Ljava/lang/String;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_5

    :catch_0
    move-exception v2

    goto :goto_3

    :cond_2
    :goto_2
    invoke-virtual {v2}, Lob/yc;->J()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :goto_3
    :try_start_2
    iget-object v3, p0, Lob/vb;->c:Lob/yc;

    iget-object v3, v3, Lob/o8;->a:Lob/l7;

    invoke-virtual {v3}, Lob/l7;->a()Lob/b6;

    move-result-object v3

    invoke-virtual {v3}, Lob/b6;->o()Lob/z5;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    iget-object v0, p0, Lob/vb;->c:Lob/yc;

    iget-object v2, p0, Lob/vb;->b:Lcom/google/android/gms/internal/measurement/x1;

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->C()Lob/ff;

    move-result-object v0

    goto :goto_1

    :goto_5
    iget-object v2, p0, Lob/vb;->c:Lob/yc;

    iget-object v3, p0, Lob/vb;->b:Lcom/google/android/gms/internal/measurement/x1;

    iget-object v2, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->C()Lob/ff;

    move-result-object v2

    invoke-virtual {v2, v3, v1}, Lob/ff;->a0(Lcom/google/android/gms/internal/measurement/x1;Ljava/lang/String;)V

    throw v0
.end method
