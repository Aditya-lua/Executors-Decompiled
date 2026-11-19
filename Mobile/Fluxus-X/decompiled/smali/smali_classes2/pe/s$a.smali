.class public final Lpe/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final b:Lpe/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/q<",
            "-TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Future;Lpe/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "TV;>;",
            "Lpe/q<",
            "-TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpe/s$a;->a:Ljava/util/concurrent/Future;

    iput-object p2, p0, Lpe/s$a;->b:Lpe/q;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lpe/s$a;->a:Ljava/util/concurrent/Future;

    instance-of v1, v0, Lqe/a;

    if-eqz v1, :cond_0

    check-cast v0, Lqe/a;

    invoke-static {v0}, Lqe/b;->a(Lqe/a;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lpe/s$a;->b:Lpe/q;

    invoke-interface {v1, v0}, Lpe/q;->onFailure(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lpe/s$a;->a:Ljava/util/concurrent/Future;

    invoke-static {v0}, Lpe/s;->f(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lpe/s$a;->b:Lpe/q;

    invoke-interface {v1, v0}, Lpe/q;->onSuccess(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_1

    :goto_0
    iget-object v1, p0, Lpe/s$a;->b:Lpe/q;

    invoke-interface {v1, v0}, Lpe/q;->onFailure(Ljava/lang/Throwable;)V

    return-void

    :goto_1
    iget-object v1, p0, Lpe/s$a;->b:Lpe/q;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v1, v0}, Lpe/q;->onFailure(Ljava/lang/Throwable;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Lje/h;->b(Ljava/lang/Object;)Lje/h$b;

    move-result-object v0

    iget-object v1, p0, Lpe/s$a;->b:Lpe/q;

    invoke-virtual {v0, v1}, Lje/h$b;->c(Ljava/lang/Object;)Lje/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lje/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
