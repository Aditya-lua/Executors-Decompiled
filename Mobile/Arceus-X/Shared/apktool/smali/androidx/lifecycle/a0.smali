.class public abstract Landroidx/lifecycle/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/a0$d;,
        Landroidx/lifecycle/a0$c;,
        Landroidx/lifecycle/a0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final k:Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Ls/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls/b<",
            "Landroidx/lifecycle/e0<",
            "-TT;>;",
            "Landroidx/lifecycle/a0<",
            "TT;>.d;>;"
        }
    .end annotation
.end field

.field public c:I

.field public d:Z

.field public volatile e:Ljava/lang/Object;

.field public volatile f:Ljava/lang/Object;

.field public g:I

.field public h:Z

.field public i:Z

.field public final j:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/lifecycle/a0;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/a0;->a:Ljava/lang/Object;

    .line 11
    new-instance v0, Ls/b;

    invoke-direct {v0}, Ls/b;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/a0;->b:Ls/b;

    const/4 v0, 0x0

    .line 12
    iput v0, p0, Landroidx/lifecycle/a0;->c:I

    .line 13
    sget-object v0, Landroidx/lifecycle/a0;->k:Ljava/lang/Object;

    iput-object v0, p0, Landroidx/lifecycle/a0;->f:Ljava/lang/Object;

    .line 14
    new-instance v1, Landroidx/lifecycle/a0$a;

    invoke-direct {v1, p0}, Landroidx/lifecycle/a0$a;-><init>(Landroidx/lifecycle/a0;)V

    iput-object v1, p0, Landroidx/lifecycle/a0;->j:Ljava/lang/Runnable;

    .line 15
    iput-object v0, p0, Landroidx/lifecycle/a0;->e:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 16
    iput v0, p0, Landroidx/lifecycle/a0;->g:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/a0;->a:Ljava/lang/Object;

    .line 3
    new-instance v0, Ls/b;

    invoke-direct {v0}, Ls/b;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/a0;->b:Ls/b;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Landroidx/lifecycle/a0;->c:I

    .line 5
    sget-object v1, Landroidx/lifecycle/a0;->k:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/lifecycle/a0;->f:Ljava/lang/Object;

    .line 6
    new-instance v1, Landroidx/lifecycle/a0$a;

    invoke-direct {v1, p0}, Landroidx/lifecycle/a0$a;-><init>(Landroidx/lifecycle/a0;)V

    iput-object v1, p0, Landroidx/lifecycle/a0;->j:Ljava/lang/Runnable;

    .line 7
    iput-object p1, p0, Landroidx/lifecycle/a0;->e:Ljava/lang/Object;

    .line 8
    iput v0, p0, Landroidx/lifecycle/a0;->g:I

    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lr/c;->g()Lr/c;

    move-result-object v0

    invoke-virtual {v0}, Lr/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot invoke "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " on a background thread"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public c(I)V
    .locals 4

    iget v0, p0, Landroidx/lifecycle/a0;->c:I

    add-int/2addr p1, v0

    iput p1, p0, Landroidx/lifecycle/a0;->c:I

    iget-boolean p1, p0, Landroidx/lifecycle/a0;->d:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/lifecycle/a0;->d:Z

    :goto_0
    const/4 v1, 0x0

    :try_start_0
    iget v2, p0, Landroidx/lifecycle/a0;->c:I

    if-eq v0, v2, :cond_5

    if-nez v0, :cond_1

    if-lez v2, :cond_1

    move v3, p1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    if-lez v0, :cond_2

    if-nez v2, :cond_2

    move v0, p1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    if-eqz v3, :cond_3

    invoke-virtual {p0}, Landroidx/lifecycle/a0;->k()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroidx/lifecycle/a0;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_3
    move v0, v2

    goto :goto_0

    :cond_5
    iput-boolean v1, p0, Landroidx/lifecycle/a0;->d:Z

    return-void

    :goto_4
    iput-boolean v1, p0, Landroidx/lifecycle/a0;->d:Z

    throw p1
.end method

.method public final d(Landroidx/lifecycle/a0$d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/a0<",
            "TT;>.d;)V"
        }
    .end annotation

    iget-boolean v0, p1, Landroidx/lifecycle/a0$d;->b:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/lifecycle/a0$d;->d()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/a0$d;->a(Z)V

    return-void

    :cond_1
    iget v0, p1, Landroidx/lifecycle/a0$d;->c:I

    iget v1, p0, Landroidx/lifecycle/a0;->g:I

    if-lt v0, v1, :cond_2

    :goto_0
    return-void

    :cond_2
    iput v1, p1, Landroidx/lifecycle/a0$d;->c:I

    iget-object p1, p1, Landroidx/lifecycle/a0$d;->a:Landroidx/lifecycle/e0;

    iget-object v0, p0, Landroidx/lifecycle/a0;->e:Ljava/lang/Object;

    invoke-interface {p1, v0}, Landroidx/lifecycle/e0;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public e(Landroidx/lifecycle/a0$d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/a0<",
            "TT;>.d;)V"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/lifecycle/a0;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Landroidx/lifecycle/a0;->i:Z

    return-void

    :cond_0
    iput-boolean v1, p0, Landroidx/lifecycle/a0;->h:Z

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/a0;->i:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Landroidx/lifecycle/a0;->d(Landroidx/lifecycle/a0$d;)V

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Landroidx/lifecycle/a0;->b:Ls/b;

    invoke-virtual {v1}, Ls/b;->c()Ls/b$d;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/a0$d;

    invoke-virtual {p0, v2}, Landroidx/lifecycle/a0;->d(Landroidx/lifecycle/a0$d;)V

    iget-boolean v2, p0, Landroidx/lifecycle/a0;->i:Z

    if-eqz v2, :cond_3

    :cond_4
    :goto_0
    iget-boolean v1, p0, Landroidx/lifecycle/a0;->i:Z

    if-nez v1, :cond_1

    iput-boolean v0, p0, Landroidx/lifecycle/a0;->h:Z

    return-void
.end method

.method public f()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/lifecycle/a0;->e:Ljava/lang/Object;

    sget-object v1, Landroidx/lifecycle/a0;->k:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Landroidx/lifecycle/a0;->g:I

    return v0
.end method

.method public h()Z
    .locals 1

    iget v0, p0, Landroidx/lifecycle/a0;->c:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public i(Landroidx/lifecycle/s;Landroidx/lifecycle/e0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/s;",
            "Landroidx/lifecycle/e0<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "observe"

    invoke-static {v0}, Landroidx/lifecycle/a0;->b(Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/l;->b()Landroidx/lifecycle/l$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/l$b;->a:Landroidx/lifecycle/l$b;

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Landroidx/lifecycle/a0$c;

    invoke-direct {v0, p0, p1, p2}, Landroidx/lifecycle/a0$c;-><init>(Landroidx/lifecycle/a0;Landroidx/lifecycle/s;Landroidx/lifecycle/e0;)V

    iget-object v1, p0, Landroidx/lifecycle/a0;->b:Ls/b;

    invoke-virtual {v1, p2, v0}, Ls/b;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/lifecycle/a0$d;

    if-eqz p2, :cond_2

    invoke-virtual {p2, p1}, Landroidx/lifecycle/a0$d;->c(Landroidx/lifecycle/s;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot add the same observer with different lifecycles"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    :goto_1
    return-void

    :cond_3
    invoke-interface {p1}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    return-void
.end method

.method public j(Landroidx/lifecycle/e0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/e0<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "observeForever"

    invoke-static {v0}, Landroidx/lifecycle/a0;->b(Ljava/lang/String;)V

    new-instance v0, Landroidx/lifecycle/a0$b;

    invoke-direct {v0, p0, p1}, Landroidx/lifecycle/a0$b;-><init>(Landroidx/lifecycle/a0;Landroidx/lifecycle/e0;)V

    iget-object v1, p0, Landroidx/lifecycle/a0;->b:Ls/b;

    invoke-virtual {v1, p1, v0}, Ls/b;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/a0$d;

    instance-of v1, p1, Landroidx/lifecycle/a0$c;

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroidx/lifecycle/a0$d;->a(Z)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot add the same observer with different lifecycles"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public l()V
    .locals 0

    return-void
.end method

.method public m(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/lifecycle/a0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/lifecycle/a0;->f:Ljava/lang/Object;

    sget-object v2, Landroidx/lifecycle/a0;->k:Ljava/lang/Object;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/a0;->f:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-static {}, Lr/c;->g()Lr/c;

    move-result-object p1

    iget-object v0, p0, Landroidx/lifecycle/a0;->j:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Lr/c;->c(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public n(Landroidx/lifecycle/e0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/e0<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "removeObserver"

    invoke-static {v0}, Landroidx/lifecycle/a0;->b(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/a0;->b:Ls/b;

    invoke-virtual {v0, p1}, Ls/b;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/a0$d;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroidx/lifecycle/a0$d;->b()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/a0$d;->a(Z)V

    return-void
.end method

.method public o(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "setValue"

    invoke-static {v0}, Landroidx/lifecycle/a0;->b(Ljava/lang/String;)V

    iget v0, p0, Landroidx/lifecycle/a0;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/lifecycle/a0;->g:I

    iput-object p1, p0, Landroidx/lifecycle/a0;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/a0;->e(Landroidx/lifecycle/a0$d;)V

    return-void
.end method
