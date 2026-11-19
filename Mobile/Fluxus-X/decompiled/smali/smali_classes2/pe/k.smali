.class public final Lpe/k;
.super Lpe/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpe/k$a;,
        Lpe/k$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lpe/g<",
        "Ljava/lang/Object;",
        "TV;>;"
    }
.end annotation


# instance fields
.field public p:Lpe/k$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/k<",
            "TV;>.b<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lke/r;ZLjava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lke/r<",
            "+",
            "Lpe/x<",
            "*>;>;Z",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable<",
            "TV;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lpe/g;-><init>(Lke/r;ZZ)V

    new-instance p1, Lpe/k$a;

    invoke-direct {p1, p0, p4, p3}, Lpe/k$a;-><init>(Lpe/k;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Lpe/k;->p:Lpe/k$b;

    invoke-virtual {p0}, Lpe/g;->W()V

    return-void
.end method

.method public static synthetic a0(Lpe/k;Lpe/k$b;)Lpe/k$b;
    .locals 0

    iput-object p1, p0, Lpe/k;->p:Lpe/k$b;

    return-object p1
.end method


# virtual methods
.method public R(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public U()V
    .locals 1

    iget-object v0, p0, Lpe/k;->p:Lpe/k$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lpe/k$b;->h()V

    :cond_0
    return-void
.end method

.method public Z(Lpe/g$a;)V
    .locals 1

    invoke-super {p0, p1}, Lpe/g;->Z(Lpe/g$a;)V

    sget-object v0, Lpe/g$a;->a:Lpe/g$a;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lpe/k;->p:Lpe/k$b;

    :cond_0
    return-void
.end method

.method public y()V
    .locals 1

    iget-object v0, p0, Lpe/k;->p:Lpe/k$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lpe/w;->c()V

    :cond_0
    return-void
.end method
