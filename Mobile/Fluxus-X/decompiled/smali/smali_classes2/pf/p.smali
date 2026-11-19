.class public Lpf/p;
.super Ly1/a;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ScheduledFuture;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpf/p$c;,
        Lpf/p$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ly1/a<",
        "TV;>;",
        "Ljava/util/concurrent/ScheduledFuture<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final h:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpf/p$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpf/p$c<",
            "TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ly1/a;-><init>()V

    new-instance v0, Lpf/p$a;

    invoke-direct {v0, p0}, Lpf/p$a;-><init>(Lpf/p;)V

    invoke-interface {p1, v0}, Lpf/p$c;->a(Lpf/p$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lpf/p;->h:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public static synthetic B(Lpf/p;Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ly1/a;->x(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic C(Lpf/p;Ljava/lang/Throwable;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ly1/a;->y(Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public D(Ljava/util/concurrent/Delayed;)I
    .locals 1

    iget-object v0, p0, Lpf/p;->h:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/util/concurrent/Delayed;

    invoke-virtual {p0, p1}, Lpf/p;->D(Ljava/util/concurrent/Delayed;)I

    move-result p1

    return p1
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lpf/p;->h:Ljava/util/concurrent/ScheduledFuture;

    invoke-virtual {p0}, Ly1/a;->A()Z

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void
.end method

.method public getDelay(Ljava/util/concurrent/TimeUnit;)J
    .locals 2

    iget-object v0, p0, Lpf/p;->h:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Delayed;->getDelay(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method
