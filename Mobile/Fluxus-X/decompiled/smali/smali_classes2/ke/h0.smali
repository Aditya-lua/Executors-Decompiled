.class public final Lke/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lke/g0;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lke/g0<",
            "**>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    instance-of v0, p1, Lke/g0;

    if-eqz v0, :cond_1

    check-cast p1, Lke/g0;

    invoke-interface {p0}, Lke/g0;->a()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1}, Lke/g0;->a()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
