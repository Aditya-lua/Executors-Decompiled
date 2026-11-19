.class public abstract Lpe/m;
.super Lpe/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpe/m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lpe/t<",
        "TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lpe/t;-><init>()V

    return-void
.end method

.method public static J(Lpe/x;)Lpe/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lpe/x<",
            "TV;>;)",
            "Lpe/m<",
            "TV;>;"
        }
    .end annotation

    instance-of v0, p0, Lpe/m;

    if-eqz v0, :cond_0

    check-cast p0, Lpe/m;

    return-object p0

    :cond_0
    new-instance v0, Lpe/n;

    invoke-direct {v0, p0}, Lpe/n;-><init>(Lpe/x;)V

    return-object v0
.end method


# virtual methods
.method public final H(Ljava/lang/Class;Lje/f;Ljava/util/concurrent/Executor;)Lpe/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class<",
            "TX;>;",
            "Lje/f<",
            "-TX;+TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lpe/m<",
            "TV;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lpe/s;->d(Lpe/x;Ljava/lang/Class;Lje/f;Ljava/util/concurrent/Executor;)Lpe/x;

    move-result-object p1

    check-cast p1, Lpe/m;

    return-object p1
.end method

.method public final I(Ljava/lang/Class;Lpe/i;Ljava/util/concurrent/Executor;)Lpe/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class<",
            "TX;>;",
            "Lpe/i<",
            "-TX;+TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lpe/m<",
            "TV;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lpe/s;->e(Lpe/x;Ljava/lang/Class;Lpe/i;Ljava/util/concurrent/Executor;)Lpe/x;

    move-result-object p1

    check-cast p1, Lpe/m;

    return-object p1
.end method

.method public final K(Lje/f;Ljava/util/concurrent/Executor;)Lpe/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lje/f<",
            "-TV;TT;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lpe/m<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lpe/s;->l(Lpe/x;Lje/f;Ljava/util/concurrent/Executor;)Lpe/x;

    move-result-object p1

    check-cast p1, Lpe/m;

    return-object p1
.end method

.method public final L(Lpe/i;Ljava/util/concurrent/Executor;)Lpe/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lpe/i<",
            "-TV;TT;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lpe/m<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lpe/s;->m(Lpe/x;Lpe/i;Ljava/util/concurrent/Executor;)Lpe/x;

    move-result-object p1

    check-cast p1, Lpe/m;

    return-object p1
.end method
