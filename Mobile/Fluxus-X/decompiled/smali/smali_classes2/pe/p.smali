.class public abstract Lpe/p;
.super Lpe/o;
.source "SourceFile"

# interfaces
.implements Lpe/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpe/p$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lpe/o<",
        "TV;>;",
        "Lpe/x<",
        "TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lpe/o;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-virtual {p0}, Lpe/p;->d()Lpe/x;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lpe/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public abstract d()Lpe/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpe/x<",
            "+TV;>;"
        }
    .end annotation
.end method
