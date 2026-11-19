.class public final Lm9/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/d$c;
.implements Lm9/e1;


# instance fields
.field public final a:Ll9/a$f;

.field public final b:Lm9/b;

.field public c:Lo9/l;

.field public d:Ljava/util/Set;

.field public e:Z

.field public final synthetic f:Lm9/f;


# direct methods
.method public constructor <init>(Lm9/f;Ll9/a$f;Lm9/b;)V
    .locals 0

    iput-object p1, p0, Lm9/n0;->f:Lm9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lm9/n0;->c:Lo9/l;

    iput-object p1, p0, Lm9/n0;->d:Ljava/util/Set;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lm9/n0;->e:Z

    iput-object p2, p0, Lm9/n0;->a:Ll9/a$f;

    iput-object p3, p0, Lm9/n0;->b:Lm9/b;

    return-void
.end method

.method public static bridge synthetic e(Lm9/n0;)Ll9/a$f;
    .locals 0

    iget-object p0, p0, Lm9/n0;->a:Ll9/a$f;

    return-object p0
.end method

.method public static bridge synthetic f(Lm9/n0;)Lm9/b;
    .locals 0

    iget-object p0, p0, Lm9/n0;->b:Lm9/b;

    return-object p0
.end method

.method public static bridge synthetic g(Lm9/n0;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lm9/n0;->e:Z

    return-void
.end method

.method public static bridge synthetic h(Lm9/n0;)V
    .locals 0

    invoke-virtual {p0}, Lm9/n0;->i()V

    return-void
.end method


# virtual methods
.method public final a(Lk9/b;)V
    .locals 2

    iget-object v0, p0, Lm9/n0;->f:Lm9/f;

    invoke-static {v0}, Lm9/f;->B(Lm9/f;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lm9/n0;->b:Lm9/b;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/j0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lm9/j0;->G(Lk9/b;)V

    :cond_0
    return-void
.end method

.method public final b(Lo9/l;Ljava/util/Set;)V
    .locals 1

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lm9/n0;->c:Lo9/l;

    iput-object p2, p0, Lm9/n0;->d:Ljava/util/Set;

    invoke-virtual {p0}, Lm9/n0;->i()V

    return-void

    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    const-string p2, "GoogleApiManager"

    const-string v0, "Received null response from onSignInSuccess"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance p1, Lk9/b;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Lk9/b;-><init>(I)V

    invoke-virtual {p0, p1}, Lm9/n0;->a(Lk9/b;)V

    return-void
.end method

.method public final c(Lk9/b;)V
    .locals 2
    .param p1    # Lk9/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lm9/n0;->f:Lm9/f;

    invoke-static {v0}, Lm9/f;->o(Lm9/f;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lm9/m0;

    invoke-direct {v1, p0, p1}, Lm9/m0;-><init>(Lm9/n0;Lk9/b;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final d(I)V
    .locals 2

    iget-object v0, p0, Lm9/n0;->f:Lm9/f;

    invoke-static {v0}, Lm9/f;->B(Lm9/f;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lm9/n0;->b:Lm9/b;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/j0;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lm9/j0;->L(Lm9/j0;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, Lk9/b;

    const/16 v1, 0x11

    invoke-direct {p1, v1}, Lk9/b;-><init>(I)V

    invoke-virtual {v0, p1}, Lm9/j0;->G(Lk9/b;)V

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lm9/j0;->onConnectionSuspended(I)V

    :cond_1
    return-void
.end method

.method public final i()V
    .locals 3

    iget-boolean v0, p0, Lm9/n0;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm9/n0;->c:Lo9/l;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lm9/n0;->a:Ll9/a$f;

    iget-object v2, p0, Lm9/n0;->d:Ljava/util/Set;

    invoke-interface {v1, v0, v2}, Ll9/a$f;->getRemoteService(Lo9/l;Ljava/util/Set;)V

    :cond_0
    return-void
.end method
