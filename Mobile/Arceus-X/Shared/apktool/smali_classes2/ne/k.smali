.class public final Lne/k;
.super Lne/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lne/k$a;,
        Lne/k$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lne/g<",
        "Ljava/lang/Object;",
        "TV;>;"
    }
.end annotation


# instance fields
.field public p:Lne/k$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/k<",
            "TV;>.b<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lie/r;ZLjava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie/r<",
            "+",
            "Lne/x<",
            "*>;>;Z",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable<",
            "TV;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lne/g;-><init>(Lie/r;ZZ)V

    new-instance p1, Lne/k$a;

    invoke-direct {p1, p0, p4, p3}, Lne/k$a;-><init>(Lne/k;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Lne/k;->p:Lne/k$b;

    invoke-virtual {p0}, Lne/g;->W()V

    return-void
.end method

.method public static synthetic a0(Lne/k;Lne/k$b;)Lne/k$b;
    .locals 0

    iput-object p1, p0, Lne/k;->p:Lne/k$b;

    return-object p1
.end method


# virtual methods
.method public R(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public U()V
    .locals 1

    iget-object v0, p0, Lne/k;->p:Lne/k$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lne/k$b;->h()V

    :cond_0
    return-void
.end method

.method public Z(Lne/g$a;)V
    .locals 1

    invoke-super {p0, p1}, Lne/g;->Z(Lne/g$a;)V

    sget-object v0, Lne/g$a;->a:Lne/g$a;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lne/k;->p:Lne/k$b;

    :cond_0
    return-void
.end method

.method public y()V
    .locals 1

    iget-object v0, p0, Lne/k;->p:Lne/k$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lne/w;->c()V

    :cond_0
    return-void
.end method
