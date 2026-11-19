.class public Lpe/a0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpe/a0;->c(Ljava/util/concurrent/Executor;Lpe/b;)Ljava/util/concurrent/Executor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Lpe/b;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lpe/b;)V
    .locals 0

    iput-object p1, p0, Lpe/a0$a;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lpe/a0$a;->b:Lpe/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lpe/a0$a;->a:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lpe/a0$a;->b:Lpe/b;

    invoke-virtual {v0, p1}, Lpe/b;->E(Ljava/lang/Throwable;)Z

    return-void
.end method
