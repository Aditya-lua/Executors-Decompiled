.class public abstract Ltn/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltn/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e(Lqn/a;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public f(Lrn/b;)V
    .locals 0

    return-void
.end method

.method public g(Lrn/i;)V
    .locals 0

    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i(Lqn/y;)V
    .locals 1

    invoke-interface {p0}, Ltn/d;->d()Lqn/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lqn/s;->b(Lqn/y;)V

    return-void
.end method

.method public j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lqn/e<",
            "*>;>;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method
