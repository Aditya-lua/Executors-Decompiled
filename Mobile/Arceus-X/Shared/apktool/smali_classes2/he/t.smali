.class public final Lhe/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhe/t$c;,
        Lhe/t$b;,
        Lhe/t$a;
    }
.end annotation


# direct methods
.method public static a(Lhe/s;)Lhe/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lhe/s<",
            "TT;>;)",
            "Lhe/s<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lhe/t$b;

    if-nez v0, :cond_2

    instance-of v0, p0, Lhe/t$a;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/io/Serializable;

    if-eqz v0, :cond_1

    new-instance v0, Lhe/t$a;

    invoke-direct {v0, p0}, Lhe/t$a;-><init>(Lhe/s;)V

    return-object v0

    :cond_1
    new-instance v0, Lhe/t$b;

    invoke-direct {v0, p0}, Lhe/t$b;-><init>(Lhe/s;)V

    return-object v0

    :cond_2
    return-object p0
.end method

.method public static b(Ljava/lang/Object;)Lhe/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lhe/s<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lhe/t$c;

    invoke-direct {v0, p0}, Lhe/t$c;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
