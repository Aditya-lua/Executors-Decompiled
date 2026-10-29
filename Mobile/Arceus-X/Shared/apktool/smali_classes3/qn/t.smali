.class public Lqn/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqn/t$a;,
        Lqn/t$b;
    }
.end annotation


# direct methods
.method public static a(Lqn/s;Lqn/s;)Ljava/lang/Iterable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqn/s;",
            "Lqn/s;",
            ")",
            "Ljava/lang/Iterable<",
            "Lqn/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Lqn/t$a;

    invoke-virtual {p0}, Lqn/s;->f()Lqn/s;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lqn/t$a;-><init>(Lqn/s;Lqn/s;Lqn/u;)V

    return-object v0
.end method
