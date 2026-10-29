.class public final Ljq/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0006\n\u0002\u0008\u0004\u001a)\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a!\u0010\u000c\u001a\u00020\u000b*\u00020\u00072\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a!\u0010\u000f\u001a\u00020\u000b*\u00020\u000e2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a%\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00072\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\r\u001a-\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u00020\u0017*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a+\u0010\u001d\u001a\u00020\u000b*\u00020\u000e2\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00032\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u0016\u001a\u001b\u0010 \u001a\u00020\u0017*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "",
        "json",
        "",
        "",
        "colorMap",
        "j",
        "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;",
        "Lorg/json/JSONObject;",
        "",
        "Ljq/f;",
        "mappings",
        "",
        "h",
        "(Lorg/json/JSONObject;Ljava/util/List;)V",
        "Lorg/json/JSONArray;",
        "f",
        "(Lorg/json/JSONArray;Ljava/util/List;)V",
        "gradientJson",
        "i",
        "data",
        "colorStops",
        "g",
        "(Lorg/json/JSONArray;ILjava/util/List;)V",
        "",
        "b",
        "(Lorg/json/JSONArray;)Z",
        "startIndex",
        "c",
        "(Lorg/json/JSONArray;I)Z",
        "d",
        "",
        "other",
        "a",
        "(DD)Z",
        "shared_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(DD)Z
    .locals 4

    const-wide v0, 0x3f847ae147ae147bL    # 0.01

    add-double v2, p2, v0

    cmpg-double v2, p0, v2

    if-gez v2, :cond_0

    sub-double/2addr p2, v0

    cmpl-double p0, p0, p2

    if-lez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final b(Lorg/json/JSONArray;)Z
    .locals 3

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    invoke-static {p0, v2}, Ljq/n;->c(Lorg/json/JSONArray;I)Z

    move-result p0

    return p0
.end method

.method public static final c(Lorg/json/JSONArray;I)Z
    .locals 7

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    add-int/lit8 v1, p1, 0x3

    const/4 v2, 0x0

    if-le v1, v0, :cond_0

    return v2

    :cond_0
    :goto_0
    if-ge p1, v1, :cond_3

    const-wide/high16 v3, 0x7ff8000000000000L    # Double.NaN

    invoke-virtual {p0, p1, v3, v4}, Lorg/json/JSONArray;->optDouble(ID)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_2

    const-wide/16 v5, 0x0

    cmpg-double v0, v3, v5

    if-ltz v0, :cond_2

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, v3, v5

    if-lez v0, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v2

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method public static final d(Lorg/json/JSONArray;ILjava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            "I",
            "Ljava/util/List<",
            "Ljq/f;",
            ">;)V"
        }
    .end annotation

    add-int/lit8 v0, p1, 0x3

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-le v0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v0

    add-int/lit8 v2, p1, 0x1

    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v3

    add-int/lit8 v5, p1, 0x2

    invoke-virtual {p0, v5}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v6

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Ljq/f;

    invoke-virtual {v9}, Ljq/f;->f()D

    move-result-wide v10

    invoke-static {v0, v1, v10, v11}, Ljq/n;->a(DD)Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-virtual {v9}, Ljq/f;->e()D

    move-result-wide v10

    invoke-static {v3, v4, v10, v11}, Ljq/n;->a(DD)Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-virtual {v9}, Ljq/f;->d()D

    move-result-wide v9

    invoke-static {v6, v7, v9, v10}, Ljq/n;->a(DD)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_0

    :cond_2
    const/4 v8, 0x0

    :goto_0
    check-cast v8, Ljq/f;

    if-nez v8, :cond_3

    :goto_1
    return-void

    :cond_3
    invoke-virtual {v8}, Ljq/f;->c()D

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lorg/json/JSONArray;->put(ID)Lorg/json/JSONArray;

    invoke-virtual {v8}, Ljq/f;->b()D

    move-result-wide p1

    invoke-virtual {p0, v2, p1, p2}, Lorg/json/JSONArray;->put(ID)Lorg/json/JSONArray;

    invoke-virtual {v8}, Ljq/f;->a()D

    move-result-wide p1

    invoke-virtual {p0, v5, p1, p2}, Lorg/json/JSONArray;->put(ID)Lorg/json/JSONArray;

    return-void
.end method

.method public static synthetic e(Lorg/json/JSONArray;ILjava/util/List;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Ljq/n;->d(Lorg/json/JSONArray;ILjava/util/List;)V

    return-void
.end method

.method public static final f(Lorg/json/JSONArray;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            "Ljava/util/List<",
            "Ljq/f;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0}, Ljq/n;->b(Lorg/json/JSONArray;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {p0, v1, p1, v2, v0}, Ljq/n;->e(Lorg/json/JSONArray;ILjava/util/List;ILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lorg/json/JSONObject;

    if-eqz v3, :cond_1

    check-cast v2, Lorg/json/JSONObject;

    invoke-static {v2, p1}, Ljq/n;->h(Lorg/json/JSONObject;Ljava/util/List;)V

    goto :goto_1

    :cond_1
    instance-of v3, v2, Lorg/json/JSONArray;

    if-eqz v3, :cond_2

    check-cast v2, Lorg/json/JSONArray;

    invoke-static {v2, p1}, Ljq/n;->f(Lorg/json/JSONArray;Ljava/util/List;)V

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static final g(Lorg/json/JSONArray;ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            "I",
            "Ljava/util/List<",
            "Ljq/f;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    mul-int/lit8 v1, v0, 0x4

    add-int/lit8 v1, v1, 0x1

    invoke-static {p0, v1}, Ljq/n;->c(Lorg/json/JSONArray;I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p0, v1, p2}, Ljq/n;->d(Lorg/json/JSONArray;ILjava/util/List;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final h(Lorg/json/JSONObject;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/util/List<",
            "Ljq/f;",
            ">;)V"
        }
    .end annotation

    const-string v0, "ty"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "gf"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "g"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0, p1}, Ljq/n;->i(Lorg/json/JSONObject;Ljava/util/List;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "keys(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lorg/json/JSONObject;

    if-eqz v2, :cond_3

    check-cast v1, Lorg/json/JSONObject;

    invoke-static {v1, p1}, Ljq/n;->h(Lorg/json/JSONObject;Ljava/util/List;)V

    goto :goto_0

    :cond_3
    instance-of v2, v1, Lorg/json/JSONArray;

    if-eqz v2, :cond_2

    check-cast v1, Lorg/json/JSONArray;

    invoke-static {v1, p1}, Ljq/n;->f(Lorg/json/JSONArray;Ljava/util/List;)V

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method public static final i(Lorg/json/JSONObject;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/util/List<",
            "Ljq/f;",
            ">;)V"
        }
    .end annotation

    const-string v0, "p"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "k"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_2

    :cond_0
    const-string v3, "a"

    invoke-virtual {p0, v3, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_6

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "s"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-static {v4, v0, p1}, Ljq/n;->g(Lorg/json/JSONArray;ILjava/util/List;)V

    :cond_3
    const-string v4, "e"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-static {v3, v0, p1}, Ljq/n;->g(Lorg/json/JSONArray;ILjava/util/List;)V

    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    if-nez p0, :cond_7

    :cond_6
    :goto_2
    return-void

    :cond_7
    invoke-static {p0, v0, p1}, Ljq/n;->g(Lorg/json/JSONArray;ILjava/util/List;)V

    return-void
.end method

.method public static final j(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 20
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "json"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "colorMap"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    new-instance v5, Ljq/f;

    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    move-result v6

    int-to-double v6, v6

    const-wide v8, 0x406fe00000000000L    # 255.0

    div-double/2addr v6, v8

    invoke-static {v4}, Landroid/graphics/Color;->green(I)I

    move-result v10

    int-to-double v10, v10

    div-double/2addr v10, v8

    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    int-to-double v12, v4

    div-double/2addr v12, v8

    invoke-static {v3}, Landroid/graphics/Color;->red(I)I

    move-result v4

    int-to-double v14, v4

    div-double/2addr v14, v8

    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    move-result v4

    move-wide/from16 v16, v8

    int-to-double v8, v4

    div-double v8, v8, v16

    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    int-to-double v3, v3

    div-double v16, v3, v16

    move-wide/from16 v18, v14

    move-wide v14, v8

    move-wide v8, v10

    move-wide v10, v12

    move-wide/from16 v12, v18

    invoke-direct/range {v5 .. v17}, Ljq/f;-><init>(DDDDDD)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v1}, Ljq/n;->h(Lorg/json/JSONObject;Ljava/util/List;)V

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
