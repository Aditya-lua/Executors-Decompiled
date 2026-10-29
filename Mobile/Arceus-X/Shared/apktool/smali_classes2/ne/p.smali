.class public abstract Lne/p;
.super Lne/o;
.source "SourceFile"

# interfaces
.implements Lne/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lne/p$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lne/o<",
        "TV;>;",
        "Lne/x<",
        "TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lne/o;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-virtual {p0}, Lne/p;->d()Lne/x;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public abstract d()Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "+TV;>;"
        }
    .end annotation
.end method
