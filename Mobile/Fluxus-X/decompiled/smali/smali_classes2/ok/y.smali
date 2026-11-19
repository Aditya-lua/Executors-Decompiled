.class public Lok/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lsw/x;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/x<",
            "Lmv/i0;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lsw/x;->a()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lsw/x;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmv/i0;

    invoke-virtual {p0}, Lmv/i0;->h()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lsw/x;->e()Lmv/i0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lsw/x;->e()Lmv/i0;

    move-result-object p0

    invoke-virtual {p0}, Lmv/i0;->h()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_1
    const-string p0, ""

    return-object p0
.end method
