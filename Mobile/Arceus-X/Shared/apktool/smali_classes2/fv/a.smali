.class public Lfv/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lfv/i;

.field public final b:Lfv/c;


# direct methods
.method public constructor <init>(Lfv/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfv/a;->b:Lfv/c;

    new-instance p1, Lfv/i;

    invoke-direct {p1}, Lfv/i;-><init>()V

    iput-object p1, p0, Lfv/a;->a:Lfv/i;

    return-void
.end method


# virtual methods
.method public a(Lfv/n;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1, p2}, Lfv/h;->a(Lfv/n;Ljava/lang/Object;)Lfv/h;

    move-result-object p1

    iget-object p2, p0, Lfv/a;->a:Lfv/i;

    invoke-virtual {p2, p1}, Lfv/i;->a(Lfv/h;)V

    iget-object p1, p0, Lfv/a;->b:Lfv/c;

    invoke-virtual {p1}, Lfv/c;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lfv/a;->a:Lfv/i;

    invoke-virtual {v0}, Lfv/i;->b()Lfv/h;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lfv/a;->b:Lfv/c;

    invoke-virtual {v1, v0}, Lfv/c;->g(Lfv/h;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No pending post available"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
