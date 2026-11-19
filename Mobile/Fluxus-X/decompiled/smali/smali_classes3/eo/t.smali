.class public Leo/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leo/t$a;,
        Leo/t$b;
    }
.end annotation


# direct methods
.method public static a(Leo/s;Leo/s;)Ljava/lang/Iterable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leo/s;",
            "Leo/s;",
            ")",
            "Ljava/lang/Iterable<",
            "Leo/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Leo/t$a;

    invoke-virtual {p0}, Leo/s;->f()Leo/s;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Leo/t$a;-><init>(Leo/s;Leo/s;Leo/u;)V

    return-object v0
.end method
