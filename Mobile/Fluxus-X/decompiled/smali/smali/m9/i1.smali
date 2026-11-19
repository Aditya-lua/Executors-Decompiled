.class public abstract Lm9/i1;
.super Lm9/r0;
.source "SourceFile"


# instance fields
.field public final b:Ltb/k;


# direct methods
.method public constructor <init>(ILtb/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lm9/r0;-><init>(I)V

    iput-object p2, p0, Lm9/i1;->b:Ltb/k;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Ll9/b;

    invoke-direct {v0, p1}, Ll9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    iget-object p1, p0, Lm9/i1;->b:Ltb/k;

    invoke-virtual {p1, v0}, Ltb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lm9/i1;->b:Ltb/k;

    invoke-virtual {v0, p1}, Ltb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final c(Lm9/j0;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0, p1}, Lm9/i1;->h(Lm9/j0;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lm9/i1;->b:Ltb/k;

    invoke-virtual {v0, p1}, Ltb/k;->d(Ljava/lang/Exception;)Z

    return-void

    :catch_1
    move-exception p1

    invoke-static {p1}, Lm9/o1;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm9/i1;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :catch_2
    move-exception p1

    invoke-static {p1}, Lm9/o1;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm9/i1;->a(Lcom/google/android/gms/common/api/Status;)V

    throw p1
.end method

.method public abstract h(Lm9/j0;)V
.end method
