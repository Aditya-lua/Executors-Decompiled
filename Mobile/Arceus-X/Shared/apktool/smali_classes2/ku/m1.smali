.class public abstract Lku/m1;
.super Lku/l0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008 \u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\tJ\u0019\u0010\u000e\u001a\u00020\r2\n\u0010\u000c\u001a\u0006\u0012\u0002\u0008\u00030\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001bR\"\u0010%\u001a\u000e\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000b\u0018\u00010\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010\'\u001a\u00020\u00048TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\u0006R\u0011\u0010)\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010\tR\u0011\u0010+\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\t\u00a8\u0006,"
    }
    d2 = {
        "Lku/m1;",
        "Lku/l0;",
        "<init>",
        "()V",
        "",
        "r0",
        "()J",
        "",
        "t0",
        "()Z",
        "x0",
        "Lku/d1;",
        "task",
        "",
        "a0",
        "(Lku/d1;)V",
        "unconfined",
        "e0",
        "(Z)V",
        "X",
        "",
        "parallelism",
        "",
        "name",
        "P",
        "(ILjava/lang/String;)Lku/l0;",
        "shutdown",
        "Z",
        "(Z)J",
        "c",
        "J",
        "useCount",
        "d",
        "shared",
        "Lkotlin/collections/i;",
        "e",
        "Lkotlin/collections/i;",
        "unconfinedQueue",
        "b0",
        "nextTime",
        "i0",
        "isUnconfinedLoopActive",
        "l0",
        "isUnconfinedQueueEmpty",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public c:J

.field public d:Z

.field public e:Lkotlin/collections/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/collections/i<",
            "Lku/d1<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lku/l0;-><init>()V

    return-void
.end method

.method public static synthetic Y(Lku/m1;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lku/m1;->X(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: decrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic f0(Lku/m1;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lku/m1;->e0(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: incrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final P(ILjava/lang/String;)Lku/l0;
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p1}, Lqu/m;->a(I)V

    invoke-static {p0, p2}, Lqu/m;->b(Lku/l0;Ljava/lang/String;)Lku/l0;

    move-result-object p1

    return-object p1
.end method

.method public final X(Z)V
    .locals 4

    iget-wide v0, p0, Lku/m1;->c:J

    invoke-virtual {p0, p1}, Lku/m1;->Z(Z)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lku/m1;->c:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Lku/m1;->d:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lku/m1;->shutdown()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final Z(Z)J
    .locals 2

    if-eqz p1, :cond_0

    const-wide v0, 0x100000000L

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x1

    return-wide v0
.end method

.method public final a0(Lku/d1;)V
    .locals 1
    .param p1    # Lku/d1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/d1<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lku/m1;->e:Lkotlin/collections/i;

    if-nez v0, :cond_0

    new-instance v0, Lkotlin/collections/i;

    invoke-direct {v0}, Lkotlin/collections/i;-><init>()V

    iput-object v0, p0, Lku/m1;->e:Lkotlin/collections/i;

    :cond_0
    invoke-virtual {v0, p1}, Lkotlin/collections/i;->addLast(Ljava/lang/Object;)V

    return-void
.end method

.method public b0()J
    .locals 3

    iget-object v0, p0, Lku/m1;->e:Lkotlin/collections/i;

    const-wide v1, 0x7fffffffffffffffL

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    invoke-virtual {v0}, Lkotlin/collections/i;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return-wide v1

    :cond_1
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final e0(Z)V
    .locals 4

    iget-wide v0, p0, Lku/m1;->c:J

    invoke-virtual {p0, p1}, Lku/m1;->Z(Z)J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lku/m1;->c:J

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lku/m1;->d:Z

    :cond_0
    return-void
.end method

.method public final i0()Z
    .locals 5

    iget-wide v0, p0, Lku/m1;->c:J

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lku/m1;->Z(Z)J

    move-result-wide v3

    cmp-long v0, v0, v3

    if-ltz v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l0()Z
    .locals 1

    iget-object v0, p0, Lku/m1;->e:Lkotlin/collections/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkotlin/collections/i;->isEmpty()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public r0()J
    .locals 2

    invoke-virtual {p0}, Lku/m1;->t0()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public shutdown()V
    .locals 0

    return-void
.end method

.method public final t0()Z
    .locals 2

    iget-object v0, p0, Lku/m1;->e:Lkotlin/collections/i;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lkotlin/collections/i;->p()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lku/d1;

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, Lku/d1;->run()V

    const/4 v0, 0x1

    return v0
.end method

.method public x0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
