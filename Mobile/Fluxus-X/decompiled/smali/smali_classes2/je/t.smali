.class public final Lje/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lje/t$c;,
        Lje/t$b;,
        Lje/t$a;
    }
.end annotation


# direct methods
.method public static a(Lje/s;)Lje/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lje/s<",
            "TT;>;)",
            "Lje/s<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lje/t$b;

    if-nez v0, :cond_2

    instance-of v0, p0, Lje/t$a;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/io/Serializable;

    if-eqz v0, :cond_1

    new-instance v0, Lje/t$a;

    invoke-direct {v0, p0}, Lje/t$a;-><init>(Lje/s;)V

    return-object v0

    :cond_1
    new-instance v0, Lje/t$b;

    invoke-direct {v0, p0}, Lje/t$b;-><init>(Lje/s;)V

    return-object v0

    :cond_2
    return-object p0
.end method

.method public static b(Ljava/lang/Object;)Lje/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lje/s<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lje/t$c;

    invoke-direct {v0, p0}, Lje/t$c;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
