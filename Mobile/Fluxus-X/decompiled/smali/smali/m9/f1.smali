.class public final Lm9/f1;
.super Lrb/d;
.source "SourceFile"

# interfaces
.implements Ll9/h$a;
.implements Ll9/h$b;


# static fields
.field public static final h:Ll9/a$a;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/os/Handler;

.field public final c:Ll9/a$a;

.field public final d:Ljava/util/Set;

.field public final e:Lo9/f;

.field public f:Lqb/f;

.field public g:Lm9/e1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lqb/e;->c:Ll9/a$a;

    sput-object v0, Lm9/f1;->h:Ll9/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lo9/f;)V
    .locals 1
    .param p3    # Lo9/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lm9/f1;->h:Ll9/a$a;

    invoke-direct {p0}, Lrb/d;-><init>()V

    iput-object p1, p0, Lm9/f1;->a:Landroid/content/Context;

    iput-object p2, p0, Lm9/f1;->b:Landroid/os/Handler;

    const-string p1, "ClientSettings must not be null"

    invoke-static {p3, p1}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo9/f;

    iput-object p1, p0, Lm9/f1;->e:Lo9/f;

    invoke-virtual {p3}, Lo9/f;->h()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lm9/f1;->d:Ljava/util/Set;

    iput-object v0, p0, Lm9/f1;->c:Ll9/a$a;

    return-void
.end method

.method public static bridge synthetic s2(Lm9/f1;)Lm9/e1;
    .locals 0

    iget-object p0, p0, Lm9/f1;->g:Lm9/e1;

    return-object p0
.end method

.method public static bridge synthetic t2(Lm9/f1;Lrb/l;)V
    .locals 4

    invoke-virtual {p1}, Lrb/l;->A3()Lk9/b;

    move-result-object v0

    invoke-virtual {v0}, Lk9/b;->F3()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lrb/l;->B3()Lo9/t0;

    move-result-object p1

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo9/t0;

    invoke-virtual {p1}, Lo9/t0;->A3()Lk9/b;

    move-result-object v0

    invoke-virtual {v0}, Lk9/b;->F3()Z

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

    iget-object p1, p0, Lm9/f1;->g:Lm9/e1;

    invoke-interface {p1, v0}, Lm9/e1;->a(Lk9/b;)V

    iget-object p0, p0, Lm9/f1;->f:Lqb/f;

    invoke-interface {p0}, Ll9/a$f;->disconnect()V

    return-void

    :cond_0
    iget-object v0, p0, Lm9/f1;->g:Lm9/e1;

    invoke-virtual {p1}, Lo9/t0;->B3()Lo9/l;

    move-result-object p1

    iget-object v1, p0, Lm9/f1;->d:Ljava/util/Set;

    invoke-interface {v0, p1, v1}, Lm9/e1;->b(Lo9/l;Ljava/util/Set;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lm9/f1;->g:Lm9/e1;

    invoke-interface {p1, v0}, Lm9/e1;->a(Lk9/b;)V

    :goto_0
    iget-object p0, p0, Lm9/f1;->f:Lqb/f;

    invoke-interface {p0}, Ll9/a$f;->disconnect()V

    return-void
.end method


# virtual methods
.method public final o0(Lrb/l;)V
    .locals 1

    new-instance v0, Lm9/d1;

    invoke-direct {v0, p0, p1}, Lm9/d1;-><init>(Lm9/f1;Lrb/l;)V

    iget-object p1, p0, Lm9/f1;->b:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onConnected(Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Lm9/f1;->f:Lqb/f;

    invoke-interface {p1, p0}, Lqb/f;->a(Lrb/f;)V

    return-void
.end method

.method public final onConnectionFailed(Lk9/b;)V
    .locals 1
    .param p1    # Lk9/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lm9/f1;->g:Lm9/e1;

    invoke-interface {v0, p1}, Lm9/e1;->a(Lk9/b;)V

    return-void
.end method

.method public final onConnectionSuspended(I)V
    .locals 1

    iget-object v0, p0, Lm9/f1;->g:Lm9/e1;

    invoke-interface {v0, p1}, Lm9/e1;->d(I)V

    return-void
.end method

.method public final u2(Lm9/e1;)V
    .locals 9

    iget-object v0, p0, Lm9/f1;->f:Lqb/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll9/a$f;->disconnect()V

    :cond_0
    iget-object v0, p0, Lm9/f1;->e:Lo9/f;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo9/f;->m(Ljava/lang/Integer;)V

    iget-object v2, p0, Lm9/f1;->c:Ll9/a$a;

    iget-object v3, p0, Lm9/f1;->a:Landroid/content/Context;

    iget-object v0, p0, Lm9/f1;->b:Landroid/os/Handler;

    iget-object v5, p0, Lm9/f1;->e:Lo9/f;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-virtual {v5}, Lo9/f;->j()Lqb/a;

    move-result-object v6

    move-object v8, p0

    move-object v7, p0

    invoke-virtual/range {v2 .. v8}, Ll9/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Ljava/lang/Object;Ll9/h$a;Ll9/h$b;)Ll9/a$f;

    move-result-object v0

    iput-object v0, v7, Lm9/f1;->f:Lqb/f;

    iput-object p1, v7, Lm9/f1;->g:Lm9/e1;

    iget-object p1, v7, Lm9/f1;->d:Ljava/util/Set;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, v7, Lm9/f1;->f:Lqb/f;

    invoke-interface {p1}, Lqb/f;->b()V

    return-void

    :cond_2
    :goto_0
    iget-object p1, v7, Lm9/f1;->b:Landroid/os/Handler;

    new-instance v0, Lm9/c1;

    invoke-direct {v0, p0}, Lm9/c1;-><init>(Lm9/f1;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final v2()V
    .locals 1

    iget-object v0, p0, Lm9/f1;->f:Lqb/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll9/a$f;->disconnect()V

    :cond_0
    return-void
.end method
