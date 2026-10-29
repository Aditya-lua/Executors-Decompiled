.class public abstract Ll9/i1;
.super Ll9/r0;
.source "SourceFile"


# instance fields
.field public final b:Lsb/k;


# direct methods
.method public constructor <init>(ILsb/k;)V
    .locals 0

    invoke-direct {p0, p1}, Ll9/r0;-><init>(I)V

    iput-object p2, p0, Ll9/i1;->b:Lsb/k;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lk9/b;

    invoke-direct {v0, p1}, Lk9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    iget-object p1, p0, Ll9/i1;->b:Lsb/k;

    invoke-virtual {p1, v0}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ll9/i1;->b:Lsb/k;

    invoke-virtual {v0, p1}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final c(Ll9/j0;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0, p1}, Ll9/i1;->h(Ll9/j0;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Ll9/i1;->b:Lsb/k;

    invoke-virtual {v0, p1}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void

    :catch_1
    move-exception p1

    invoke-static {p1}, Ll9/o1;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/i1;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :catch_2
    move-exception p1

    invoke-static {p1}, Ll9/o1;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll9/i1;->a(Lcom/google/android/gms/common/api/Status;)V

    throw p1
.end method

.method public abstract h(Ll9/j0;)V
.end method
