.class public final Ll9/f1;
.super Lqb/c;
.source "SourceFile"

# interfaces
.implements Lk9/f$a;
.implements Lk9/f$b;


# static fields
.field public static final h:Lk9/a$a;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/os/Handler;

.field public final c:Lk9/a$a;

.field public final d:Ljava/util/Set;

.field public final e:Ln9/d;

.field public f:Lpb/f;

.field public g:Ll9/e1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lpb/e;->c:Lk9/a$a;

    sput-object v0, Ll9/f1;->h:Lk9/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ln9/d;)V
    .locals 1
    .param p3    # Ln9/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Ll9/f1;->h:Lk9/a$a;

    invoke-direct {p0}, Lqb/c;-><init>()V

    iput-object p1, p0, Ll9/f1;->a:Landroid/content/Context;

    iput-object p2, p0, Ll9/f1;->b:Landroid/os/Handler;

    const-string p1, "ClientSettings must not be null"

    invoke-static {p3, p1}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln9/d;

    iput-object p1, p0, Ll9/f1;->e:Ln9/d;

    invoke-virtual {p3}, Ln9/d;->h()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Ll9/f1;->d:Ljava/util/Set;

    iput-object v0, p0, Ll9/f1;->c:Lk9/a$a;

    return-void
.end method

.method public static bridge synthetic s2(Ll9/f1;)Ll9/e1;
    .locals 0

    iget-object p0, p0, Ll9/f1;->g:Ll9/e1;

    return-object p0
.end method

.method public static bridge synthetic t2(Ll9/f1;Lcom/google/android/gms/signin/internal/zak;)V
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/signin/internal/zak;->v3()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->A3()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/signin/internal/zak;->w3()Lcom/google/android/gms/common/internal/zav;

    move-result-object p1

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/internal/zav;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/zav;->v3()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->A3()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    const-string v2, "SignInCoordinator"

    const-string v3, "Sign-in succeeded with resolve account failure: "

    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object p1, p0, Ll9/f1;->g:Ll9/e1;

    invoke-interface {p1, v0}, Ll9/e1;->c(Lcom/google/android/gms/common/ConnectionResult;)V

    iget-object p0, p0, Ll9/f1;->f:Lpb/f;

    invoke-interface {p0}, Lk9/a$f;->disconnect()V

    return-void

    :cond_0
    iget-object v0, p0, Ll9/f1;->g:Ll9/e1;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/zav;->w3()Lcom/google/android/gms/common/internal/b;

    move-result-object p1

    iget-object v1, p0, Ll9/f1;->d:Ljava/util/Set;

    invoke-interface {v0, p1, v1}, Ll9/e1;->b(Lcom/google/android/gms/common/internal/b;Ljava/util/Set;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ll9/f1;->g:Ll9/e1;

    invoke-interface {p1, v0}, Ll9/e1;->c(Lcom/google/android/gms/common/ConnectionResult;)V

    :goto_0
    iget-object p0, p0, Ll9/f1;->f:Lpb/f;

    invoke-interface {p0}, Lk9/a$f;->disconnect()V

    return-void
.end method


# virtual methods
.method public final F(Lcom/google/android/gms/signin/internal/zak;)V
    .locals 1

    new-instance v0, Ll9/d1;

    invoke-direct {v0, p0, p1}, Ll9/d1;-><init>(Ll9/f1;Lcom/google/android/gms/signin/internal/zak;)V

    iget-object p1, p0, Ll9/f1;->b:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onConnected(Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Ll9/f1;->f:Lpb/f;

    invoke-interface {p1, p0}, Lpb/f;->c(Lqb/e;)V

    return-void
.end method

.method public final onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ll9/f1;->g:Ll9/e1;

    invoke-interface {v0, p1}, Ll9/e1;->c(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method public final onConnectionSuspended(I)V
    .locals 1

    iget-object v0, p0, Ll9/f1;->g:Ll9/e1;

    invoke-interface {v0, p1}, Ll9/e1;->d(I)V

    return-void
.end method

.method public final u2(Ll9/e1;)V
    .locals 9

    iget-object v0, p0, Ll9/f1;->f:Lpb/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lk9/a$f;->disconnect()V

    :cond_0
    iget-object v0, p0, Ll9/f1;->e:Ln9/d;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln9/d;->m(Ljava/lang/Integer;)V

    iget-object v2, p0, Ll9/f1;->c:Lk9/a$a;

    iget-object v3, p0, Ll9/f1;->a:Landroid/content/Context;

    iget-object v0, p0, Ll9/f1;->b:Landroid/os/Handler;

    iget-object v5, p0, Ll9/f1;->e:Ln9/d;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-virtual {v5}, Ln9/d;->j()Lpb/a;

    move-result-object v6

    move-object v8, p0

    move-object v7, p0

    invoke-virtual/range {v2 .. v8}, Lk9/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Ljava/lang/Object;Lk9/f$a;Lk9/f$b;)Lk9/a$f;

    move-result-object v0

    iput-object v0, v7, Ll9/f1;->f:Lpb/f;

    iput-object p1, v7, Ll9/f1;->g:Ll9/e1;

    iget-object p1, v7, Ll9/f1;->d:Ljava/util/Set;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, v7, Ll9/f1;->f:Lpb/f;

    invoke-interface {p1}, Lpb/f;->a()V

    return-void

    :cond_2
    :goto_0
    iget-object p1, v7, Ll9/f1;->b:Landroid/os/Handler;

    new-instance v0, Ll9/c1;

    invoke-direct {v0, p0}, Ll9/c1;-><init>(Ll9/f1;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final v2()V
    .locals 1

    iget-object v0, p0, Ll9/f1;->f:Lpb/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lk9/a$f;->disconnect()V

    :cond_0
    return-void
.end method
