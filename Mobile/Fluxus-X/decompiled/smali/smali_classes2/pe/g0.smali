.class public Lpe/g0;
.super Lpe/m$a;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/RunnableFuture;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpe/g0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lpe/m$a<",
        "TV;>;",
        "Ljava/util/concurrent/RunnableFuture<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public volatile h:Lpe/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/w<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lpe/m$a;-><init>()V

    new-instance v0, Lpe/g0$a;

    invoke-direct {v0, p0, p1}, Lpe/g0$a;-><init>(Lpe/g0;Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Lpe/g0;->h:Lpe/w;

    return-void
.end method

.method public static M(Ljava/lang/Runnable;Ljava/lang/Object;)Lpe/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TV;)",
            "Lpe/g0<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lpe/g0;

    invoke-static {p0, p1}, Ljava/util/concurrent/Executors;->callable(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Callable;

    move-result-object p0

    invoke-direct {v0, p0}, Lpe/g0;-><init>(Ljava/util/concurrent/Callable;)V

    return-object v0
.end method

.method public static N(Ljava/util/concurrent/Callable;)Lpe/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TV;>;)",
            "Lpe/g0<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lpe/g0;

    invoke-direct {v0, p0}, Lpe/g0;-><init>(Ljava/util/concurrent/Callable;)V

    return-object v0
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lpe/g0;->h:Lpe/w;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x7

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "task=["

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Lpe/b;->A()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public o()V
    .locals 1

    invoke-super {p0}, Lpe/b;->o()V

    invoke-virtual {p0}, Lpe/b;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpe/g0;->h:Lpe/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lpe/w;->c()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lpe/g0;->h:Lpe/w;

    return-void
.end method

.method public run()V
    .locals 1

    iget-object v0, p0, Lpe/g0;->h:Lpe/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lpe/w;->run()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lpe/g0;->h:Lpe/w;

    return-void
.end method
