.class public final Ll9/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/c$c;
.implements Ll9/e1;


# instance fields
.field public final a:Lk9/a$f;

.field public final b:Ll9/b;

.field public c:Lcom/google/android/gms/common/internal/b;

.field public d:Ljava/util/Set;

.field public e:Z

.field public final synthetic f:Ll9/f;


# direct methods
.method public constructor <init>(Ll9/f;Lk9/a$f;Ll9/b;)V
    .locals 0

    iput-object p1, p0, Ll9/n0;->f:Ll9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Ll9/n0;->c:Lcom/google/android/gms/common/internal/b;

    iput-object p1, p0, Ll9/n0;->d:Ljava/util/Set;

    const/4 p1, 0x0

    iput-boolean p1, p0, Ll9/n0;->e:Z

    iput-object p2, p0, Ll9/n0;->a:Lk9/a$f;

    iput-object p3, p0, Ll9/n0;->b:Ll9/b;

    return-void
.end method

.method public static bridge synthetic e(Ll9/n0;)Lk9/a$f;
    .locals 0

    iget-object p0, p0, Ll9/n0;->a:Lk9/a$f;

    return-object p0
.end method

.method public static bridge synthetic f(Ll9/n0;)Ll9/b;
    .locals 0

    iget-object p0, p0, Ll9/n0;->b:Ll9/b;

    return-object p0
.end method

.method public static bridge synthetic g(Ll9/n0;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll9/n0;->e:Z

    return-void
.end method

.method public static bridge synthetic h(Ll9/n0;)V
    .locals 0

    invoke-virtual {p0}, Ll9/n0;->i()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ll9/n0;->f:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Ll9/m0;

    invoke-direct {v1, p0, p1}, Ll9/m0;-><init>(Ll9/n0;Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b(Lcom/google/android/gms/common/internal/b;Ljava/util/Set;)V
    .locals 1

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, Ll9/n0;->c:Lcom/google/android/gms/common/internal/b;

    iput-object p2, p0, Ll9/n0;->d:Ljava/util/Set;

    invoke-virtual {p0}, Ll9/n0;->i()V

    return-void

    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    const-string p2, "GoogleApiManager"

    const-string v0, "Received null response from onSignInSuccess"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance p1, Lcom/google/android/gms/common/ConnectionResult;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    invoke-virtual {p0, p1}, Ll9/n0;->c(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    iget-object v0, p0, Ll9/n0;->f:Ll9/f;

    invoke-static {v0}, Ll9/f;->B(Ll9/f;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Ll9/n0;->b:Ll9/b;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll9/j0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll9/j0;->G(Lcom/google/android/gms/common/ConnectionResult;)V

    :cond_0
    return-void
.end method

.method public final d(I)V
    .locals 2

    iget-object v0, p0, Ll9/n0;->f:Ll9/f;

    invoke-static {v0}, Ll9/f;->B(Ll9/f;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Ll9/n0;->b:Ll9/b;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll9/j0;

    if-eqz v0, :cond_1

    invoke-static {v0}, Ll9/j0;->L(Ll9/j0;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v1, 0x11

    invoke-direct {p1, v1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    invoke-virtual {v0, p1}, Ll9/j0;->G(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Ll9/j0;->onConnectionSuspended(I)V

    :cond_1
    return-void
.end method

.method public final i()V
    .locals 3

    iget-boolean v0, p0, Ll9/n0;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll9/n0;->c:Lcom/google/android/gms/common/internal/b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll9/n0;->a:Lk9/a$f;

    iget-object v2, p0, Ll9/n0;->d:Ljava/util/Set;

    invoke-interface {v1, v0, v2}, Lk9/a$f;->getRemoteService(Lcom/google/android/gms/common/internal/b;Ljava/util/Set;)V

    :cond_0
    return-void
.end method
