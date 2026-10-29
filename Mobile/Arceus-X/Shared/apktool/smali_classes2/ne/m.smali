.class public abstract Lne/m;
.super Lne/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lne/m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lne/t<",
        "TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lne/t;-><init>()V

    return-void
.end method

.method public static J(Lne/x;)Lne/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lne/x<",
            "TV;>;)",
            "Lne/m<",
            "TV;>;"
        }
    .end annotation

    instance-of v0, p0, Lne/m;

    if-eqz v0, :cond_0

    check-cast p0, Lne/m;

    return-object p0

    :cond_0
    new-instance v0, Lne/n;

    invoke-direct {v0, p0}, Lne/n;-><init>(Lne/x;)V

    return-object v0
.end method


# virtual methods
.method public final H(Ljava/lang/Class;Lhe/f;Ljava/util/concurrent/Executor;)Lne/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class<",
            "TX;>;",
            "Lhe/f<",
            "-TX;+TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lne/m<",
            "TV;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lne/s;->d(Lne/x;Ljava/lang/Class;Lhe/f;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object p1

    check-cast p1, Lne/m;

    return-object p1
.end method

.method public final I(Ljava/lang/Class;Lne/i;Ljava/util/concurrent/Executor;)Lne/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class<",
            "TX;>;",
            "Lne/i<",
            "-TX;+TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lne/m<",
            "TV;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lne/s;->e(Lne/x;Ljava/lang/Class;Lne/i;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object p1

    check-cast p1, Lne/m;

    return-object p1
.end method

.method public final K(Lhe/f;Ljava/util/concurrent/Executor;)Lne/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lhe/f<",
            "-TV;TT;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lne/m<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lne/s;->l(Lne/x;Lhe/f;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object p1

    check-cast p1, Lne/m;

    return-object p1
.end method

.method public final L(Lne/i;Ljava/util/concurrent/Executor;)Lne/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lne/i<",
            "-TV;TT;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lne/m<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lne/s;->m(Lne/x;Lne/i;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object p1

    check-cast p1, Lne/m;

    return-object p1
.end method
