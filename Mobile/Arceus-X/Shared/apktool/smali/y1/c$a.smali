.class public final Ly1/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ly1/c$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$d<",
            "TT;>;"
        }
    .end annotation
.end field

.field public c:Ly1/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ly1/f;->B()Ly1/f;

    move-result-object v0

    iput-object v0, p0, Ly1/c$a;->c:Ly1/f;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ly1/c$a;->c:Ly1/f;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Ly1/c$a;->a:Ljava/lang/Object;

    iput-object v0, p0, Ly1/c$a;->b:Ly1/c$d;

    iget-object v1, p0, Ly1/c$a;->c:Ly1/f;

    invoke-virtual {v1, v0}, Ly1/f;->x(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly1/c$a;->d:Z

    iget-object v1, p0, Ly1/c$a;->b:Ly1/c$d;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Ly1/c$d;->d(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ly1/c$a;->e()V

    :cond_1
    return v0
.end method

.method public d()Z
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly1/c$a;->d:Z

    iget-object v1, p0, Ly1/c$a;->b:Ly1/c$d;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Ly1/c$d;->c(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ly1/c$a;->e()V

    :cond_1
    return v0
.end method

.method public final e()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ly1/c$a;->a:Ljava/lang/Object;

    iput-object v0, p0, Ly1/c$a;->b:Ly1/c$d;

    iput-object v0, p0, Ly1/c$a;->c:Ly1/f;

    return-void
.end method

.method public f(Ljava/lang/Throwable;)Z
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly1/c$a;->d:Z

    iget-object v1, p0, Ly1/c$a;->b:Ly1/c$d;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Ly1/c$d;->e(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ly1/c$a;->e()V

    :cond_1
    return v0
.end method

.method public finalize()V
    .locals 4

    iget-object v0, p0, Ly1/c$a;->b:Ly1/c$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly1/c$d;->isDone()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ly1/c$b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The completer object was garbage collected - this future would otherwise never complete. The tag was: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ly1/c$a;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ly1/c$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ly1/c$d;->e(Ljava/lang/Throwable;)Z

    :cond_0
    iget-boolean v0, p0, Ly1/c$a;->d:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ly1/c$a;->c:Ly1/f;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly1/f;->x(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method
