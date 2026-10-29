.class public final Ll9/m1;
.super Ll9/r0;
.source "SourceFile"


# instance fields
.field public final b:Ll9/u;

.field public final c:Lsb/k;

.field public final d:Ll9/s;


# direct methods
.method public constructor <init>(ILl9/u;Lsb/k;Ll9/s;)V
    .locals 0

    invoke-direct {p0, p1}, Ll9/r0;-><init>(I)V

    iput-object p3, p0, Ll9/m1;->c:Lsb/k;

    iput-object p2, p0, Ll9/m1;->b:Ll9/u;

    iput-object p4, p0, Ll9/m1;->d:Ll9/s;

    const/4 p3, 0x2

    if-ne p1, p3, :cond_1

    invoke-virtual {p2}, Ll9/u;->e()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Best-effort write calls cannot pass methods that should auto-resolve missing features."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ll9/m1;->d:Ll9/s;

    iget-object v1, p0, Ll9/m1;->c:Lsb/k;

    invoke-interface {v0, p1}, Ll9/s;->a(Lcom/google/android/gms/common/api/Status;)Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v1, p1}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ll9/m1;->c:Lsb/k;

    invoke-virtual {v0, p1}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final c(Ll9/j0;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Ll9/m1;->b:Ll9/u;

    invoke-virtual {p1}, Ll9/j0;->t()Lk9/a$f;

    move-result-object p1

    iget-object v1, p0, Ll9/m1;->c:Lsb/k;

    invoke-virtual {v0, p1, v1}, Ll9/u;->d(Lk9/a$b;Lsb/k;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :goto_0
    iget-object v0, p0, Ll9/m1;->c:Lsb/k;

    invoke-virtual {v0, p1}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void

    :goto_1
    invoke-static {p1}, Ll9/o1;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/m1;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :goto_2
    throw p1
.end method

.method public final d(Ll9/z;Z)V
    .locals 1
    .param p1    # Ll9/z;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ll9/m1;->c:Lsb/k;

    invoke-virtual {p1, v0, p2}, Ll9/z;->d(Lsb/k;Z)V

    return-void
.end method

.method public final f(Ll9/j0;)Z
    .locals 0

    iget-object p1, p0, Ll9/m1;->b:Ll9/u;

    invoke-virtual {p1}, Ll9/u;->e()Z

    move-result p1

    return p1
.end method

.method public final g(Ll9/j0;)[Lcom/google/android/gms/common/Feature;
    .locals 0

    iget-object p1, p0, Ll9/m1;->b:Ll9/u;

    invoke-virtual {p1}, Ll9/u;->g()[Lcom/google/android/gms/common/Feature;

    move-result-object p1

    return-object p1
.end method
