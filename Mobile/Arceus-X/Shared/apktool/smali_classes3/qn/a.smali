.class public abstract Lqn/a;
.super Lqn/s;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lqn/s;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic g()Lqn/s;
    .locals 1

    invoke-virtual {p0}, Lqn/a;->o()Lqn/a;

    move-result-object v0

    return-object v0
.end method

.method public k(Lqn/s;)V
    .locals 1

    instance-of v0, p1, Lqn/a;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lqn/s;->k(Lqn/s;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Parent of block must also be block (can not be inline)"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public o()Lqn/a;
    .locals 1

    invoke-super {p0}, Lqn/s;->g()Lqn/s;

    move-result-object v0

    check-cast v0, Lqn/a;

    return-object v0
.end method
