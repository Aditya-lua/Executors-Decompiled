.class public final Lz/a3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(La0/f;)Lg0/x;
    .locals 2

    invoke-virtual {p0}, La0/f;->d()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/16 v1, 0x2711

    if-eq v0, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x6

    :cond_1
    :goto_0
    new-instance v0, Lg0/x;

    invoke-direct {v0, v1, p0}, Lg0/x;-><init>(ILjava/lang/Throwable;)V

    return-object v0
.end method
