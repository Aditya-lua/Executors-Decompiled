.class public final Lpe/h$d;
.super Lpe/h$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lpe/h$b;-><init>(Lpe/h$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lpe/h$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lpe/h$d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lpe/h;Ljava/util/Set;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpe/h<",
            "*>;",
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lpe/h;->H(Lpe/h;)Ljava/util/Set;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Lpe/h;->I(Lpe/h;Ljava/util/Set;)Ljava/util/Set;

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public b(Lpe/h;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpe/h<",
            "*>;)I"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lpe/h;->J(Lpe/h;)I

    move-result v0

    monitor-exit p1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
