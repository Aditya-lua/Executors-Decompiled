.class public Lmw/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lmw/i;

.field public final b:Lmw/c;


# direct methods
.method public constructor <init>(Lmw/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmw/a;->b:Lmw/c;

    new-instance p1, Lmw/i;

    invoke-direct {p1}, Lmw/i;-><init>()V

    iput-object p1, p0, Lmw/a;->a:Lmw/i;

    return-void
.end method


# virtual methods
.method public a(Lmw/n;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1, p2}, Lmw/h;->a(Lmw/n;Ljava/lang/Object;)Lmw/h;

    move-result-object p1

    iget-object p2, p0, Lmw/a;->a:Lmw/i;

    invoke-virtual {p2, p1}, Lmw/i;->a(Lmw/h;)V

    iget-object p1, p0, Lmw/a;->b:Lmw/c;

    invoke-virtual {p1}, Lmw/c;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lmw/a;->a:Lmw/i;

    invoke-virtual {v0}, Lmw/i;->b()Lmw/h;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lmw/a;->b:Lmw/c;

    invoke-virtual {v1, v0}, Lmw/c;->g(Lmw/h;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No pending post available"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
