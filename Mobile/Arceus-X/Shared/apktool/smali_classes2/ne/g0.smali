.class public Lne/g0;
.super Lne/m$a;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/RunnableFuture;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lne/g0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lne/m$a<",
        "TV;>;",
        "Ljava/util/concurrent/RunnableFuture<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public volatile h:Lne/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/w<",
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

    invoke-direct {p0}, Lne/m$a;-><init>()V

    new-instance v0, Lne/g0$a;

    invoke-direct {v0, p0, p1}, Lne/g0$a;-><init>(Lne/g0;Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Lne/g0;->h:Lne/w;

    return-void
.end method

.method public static M(Ljava/lang/Runnable;Ljava/lang/Object;)Lne/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TV;)",
            "Lne/g0<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lne/g0;

    invoke-static {p0, p1}, Ljava/util/concurrent/Executors;->callable(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Callable;

    move-result-object p0

    invoke-direct {v0, p0}, Lne/g0;-><init>(Ljava/util/concurrent/Callable;)V

    return-object v0
.end method

.method public static N(Ljava/util/concurrent/Callable;)Lne/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TV;>;)",
            "Lne/g0<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lne/g0;

    invoke-direct {v0, p0}, Lne/g0;-><init>(Ljava/util/concurrent/Callable;)V

    return-object v0
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lne/g0;->h:Lne/w;

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
    invoke-super {p0}, Lne/b;->A()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public o()V
    .locals 1

    invoke-super {p0}, Lne/b;->o()V

    invoke-virtual {p0}, Lne/b;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lne/g0;->h:Lne/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lne/w;->c()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lne/g0;->h:Lne/w;

    return-void
.end method

.method public run()V
    .locals 1

    iget-object v0, p0, Lne/g0;->h:Lne/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lne/w;->run()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lne/g0;->h:Lne/w;

    return-void
.end method
