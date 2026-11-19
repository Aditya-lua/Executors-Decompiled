.class public abstract Lsh/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsh/b$c;
    }
.end annotation


# instance fields
.field public a:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lsh/c;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lsh/b$c;

.field public c:Landroid/os/Handler;

.field public d:Lsh/a;

.field public e:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lsh/b$c;->a:Lsh/b$c;

    iput-object v0, p0, Lsh/b;->b:Lsh/b$c;

    new-instance v0, Lsh/b$a;

    invoke-direct {v0, p0}, Lsh/b$a;-><init>(Lsh/b;)V

    iput-object v0, p0, Lsh/b;->d:Lsh/a;

    new-instance v0, Lsh/b$b;

    invoke-direct {v0, p0}, Lsh/b$b;-><init>(Lsh/b;)V

    iput-object v0, p0, Lsh/b;->e:Ljava/lang/Runnable;

    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lsh/b;->a:Ljava/util/Queue;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/Looper;->prepare()V

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lsh/b;->c:Landroid/os/Handler;

    return-void
.end method

.method public static bridge synthetic a(Lsh/b;Lsh/b$c;)V
    .locals 0

    iput-object p1, p0, Lsh/b;->b:Lsh/b$c;

    return-void
.end method


# virtual methods
.method public b(Lsh/c;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lsh/b;->a:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "RbxBlockingQueue"

    const-string v0, "Queue full! Cannot add more reports."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    invoke-virtual {p0}, Lsh/b;->c()V

    return-void
.end method

.method public c()V
    .locals 4

    iget-object v0, p0, Lsh/b;->b:Lsh/b$c;

    sget-object v1, Lsh/b$c;->a:Lsh/b$c;

    if-ne v0, v1, :cond_2

    sget-object v0, Lsh/b$c;->b:Lsh/b$c;

    iput-object v0, p0, Lsh/b;->b:Lsh/b$c;

    iget-object v0, p0, Lsh/b;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsh/c;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lsh/c;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lsh/b;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsh/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lsh/b;->d:Lsh/a;

    invoke-interface {v0, v1}, Lsh/c;->a(Lsh/a;)V

    return-void

    :cond_0
    iput-object v1, p0, Lsh/b;->b:Lsh/b$c;

    return-void

    :cond_1
    iput-object v1, p0, Lsh/b;->b:Lsh/b$c;

    iget-object v0, p0, Lsh/b;->c:Landroid/os/Handler;

    iget-object v1, p0, Lsh/b;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lsh/b;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lsh/b;->c:Landroid/os/Handler;

    iget-object v1, p0, Lsh/b;->e:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    return-void
.end method
