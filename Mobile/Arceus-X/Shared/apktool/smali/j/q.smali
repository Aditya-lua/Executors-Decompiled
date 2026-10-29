.class public final Lj/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lu2/j;Lu2/j;)Lu2/j;
    .locals 4

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lu2/j;->f()I

    move-result v2

    invoke-virtual {p1}, Lu2/j;->f()I

    move-result v3

    add-int/2addr v2, v3

    if-ge v1, v2, :cond_2

    invoke-virtual {p0}, Lu2/j;->f()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p0, v1}, Lu2/j;->c(I)Ljava/util/Locale;

    move-result-object v2

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lu2/j;->f()I

    move-result v2

    sub-int v2, v1, v2

    invoke-virtual {p1, v2}, Lu2/j;->c(I)Ljava/util/Locale;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_1

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result p0

    new-array p0, p0, [Ljava/util/Locale;

    invoke-interface {v0, p0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/util/Locale;

    invoke-static {p0}, Lu2/j;->a([Ljava/util/Locale;)Lu2/j;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lu2/j;Lu2/j;)Lu2/j;
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lu2/j;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lj/q;->a(Lu2/j;Lu2/j;)Lu2/j;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    invoke-static {}, Lu2/j;->d()Lu2/j;

    move-result-object p0

    return-object p0
.end method
