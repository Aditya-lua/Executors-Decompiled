.class public final Lnv/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\n\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\u000c*\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u000c*\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u0000*\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a%\u0010\u0018\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lmv/d;",
        "",
        "h",
        "(Lmv/d;)Ljava/lang/String;",
        "",
        "",
        "b",
        "(J)I",
        "Lmv/d$b;",
        "d",
        "(Lmv/d$b;)Lmv/d;",
        "c",
        "Lmv/d$a;",
        "a",
        "(Lmv/d$a;)Lmv/d;",
        "e",
        "(Lmv/d$a;)Lmv/d$a;",
        "f",
        "Lmv/y;",
        "headers",
        "g",
        "(Lmv/d$b;Lmv/y;)Lmv/d;",
        "characters",
        "startIndex",
        "i",
        "(Ljava/lang/String;Ljava/lang/String;I)I",
        "okhttp"
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
.method public static final a(Lmv/d$a;)Lmv/d;
    .locals 15
    .param p0    # Lmv/d$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lmv/d;

    invoke-virtual {p0}, Lmv/d$a;->f()Z

    move-result v2

    invoke-virtual {p0}, Lmv/d$a;->g()Z

    move-result v3

    invoke-virtual {p0}, Lmv/d$a;->c()I

    move-result v4

    invoke-virtual {p0}, Lmv/d$a;->d()I

    move-result v9

    invoke-virtual {p0}, Lmv/d$a;->e()I

    move-result v10

    invoke-virtual {p0}, Lmv/d$a;->i()Z

    move-result v11

    invoke-virtual {p0}, Lmv/d$a;->h()Z

    move-result v12

    invoke-virtual {p0}, Lmv/d$a;->b()Z

    move-result v13

    const/4 v14, 0x0

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v14}, Lmv/d;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    return-object v1
.end method

.method public static final b(J)I
    .locals 2

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p0, v0

    if-lez v0, :cond_0

    const p0, 0x7fffffff

    return p0

    :cond_0
    long-to-int p0, p0

    return p0
.end method

.method public static final c(Lmv/d$b;)Lmv/d;
    .locals 2
    .param p0    # Lmv/d$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lmv/d$a;

    invoke-direct {p0}, Lmv/d$a;-><init>()V

    invoke-virtual {p0}, Lmv/d$a;->l()Lmv/d$a;

    move-result-object p0

    sget-object v0, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    const v0, 0x7fffffff

    sget-object v1, Lzu/b;->e:Lzu/b;

    invoke-static {v0, v1}, Lkotlin/time/b;->p(ILzu/b;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lmv/d$a;->j(J)Lmv/d$a;

    move-result-object p0

    invoke-virtual {p0}, Lmv/d$a;->a()Lmv/d;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lmv/d$b;)Lmv/d;
    .locals 1
    .param p0    # Lmv/d$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lmv/d$a;

    invoke-direct {p0}, Lmv/d$a;-><init>()V

    invoke-virtual {p0}, Lmv/d$a;->k()Lmv/d$a;

    move-result-object p0

    invoke-virtual {p0}, Lmv/d$a;->a()Lmv/d;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lmv/d$a;)Lmv/d$a;
    .locals 1
    .param p0    # Lmv/d$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lmv/d$a;->m(Z)V

    return-object p0
.end method

.method public static final f(Lmv/d$a;)Lmv/d$a;
    .locals 1
    .param p0    # Lmv/d$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lmv/d$a;->n(Z)V

    return-object p0
.end method

.method public static final g(Lmv/d$b;Lmv/y;)Lmv/d;
    .locals 30
    .param p0    # Lmv/d$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lmv/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "headers"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lmv/y;->size()I

    move-result v1

    const/4 v4, 0x1

    move v7, v4

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, -0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, -0x1

    const/16 v17, -0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_0
    if-ge v6, v1, :cond_13

    invoke-virtual {v0, v6}, Lmv/y;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v6}, Lmv/y;->g(I)Ljava/lang/String;

    move-result-object v5

    const-string v3, "Cache-Control"

    invoke-static {v2, v3, v4}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz v8, :cond_0

    :goto_1
    const/4 v7, 0x0

    goto :goto_2

    :cond_0
    move-object v8, v5

    goto :goto_2

    :cond_1
    const-string v3, "Pragma"

    invoke-static {v2, v3, v4}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_1

    :goto_2
    const/4 v2, 0x0

    :goto_3
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_12

    const-string v3, "=,;"

    invoke-static {v5, v3, v2}, Lnv/j;->i(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v5, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    move/from16 v27, v4

    const-string v4, "substring(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/text/StringsKt;->n1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v3, v0, :cond_5

    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    move/from16 v28, v1

    const/16 v1, 0x2c

    if-eq v0, v1, :cond_2

    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x3b

    if-ne v0, v1, :cond_3

    :cond_2
    :goto_4
    move-object v1, v5

    goto :goto_5

    :cond_3
    add-int/lit8 v3, v3, 0x1

    invoke-static {v5, v3}, Lnv/n;->u(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-virtual {v5, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x22

    if-ne v1, v3, :cond_4

    add-int/lit8 v23, v0, 0x1

    const/16 v25, 0x4

    const/16 v26, 0x0

    const/16 v22, 0x22

    const/16 v24, 0x0

    move-object/from16 v21, v5

    invoke-static/range {v21 .. v26}, Lkotlin/text/StringsKt;->m0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    move-object/from16 v1, v21

    move/from16 v3, v23

    invoke-virtual {v1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v29, v3

    move v3, v0

    move-object/from16 v0, v29

    goto :goto_6

    :cond_4
    move-object v1, v5

    const-string v3, ",;"

    invoke-static {v1, v3, v0}, Lnv/j;->i(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/text/StringsKt;->n1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_5
    move/from16 v28, v1

    goto :goto_4

    :goto_5
    add-int/lit8 v3, v3, 0x1

    const/4 v0, 0x0

    :goto_6
    const-string v4, "no-cache"

    move/from16 v5, v27

    invoke-static {v4, v2, v5}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_6

    move-object/from16 v0, p1

    move v2, v3

    move v4, v5

    move v9, v4

    :goto_7
    move-object v5, v1

    move/from16 v1, v28

    goto/16 :goto_3

    :cond_6
    const-string v4, "no-store"

    invoke-static {v4, v2, v5}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_7

    move-object/from16 v0, p1

    move v2, v3

    move v4, v5

    move v10, v4

    goto :goto_7

    :cond_7
    const-string v4, "max-age"

    invoke-static {v4, v2, v5}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    invoke-static {v0, v4}, Lnv/n;->D(Ljava/lang/String;I)I

    move-result v11

    :cond_8
    :goto_8
    move-object/from16 v0, p1

    move v2, v3

    move v4, v5

    goto :goto_7

    :cond_9
    const-string v4, "s-maxage"

    invoke-static {v4, v2, v5}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_a

    const/4 v4, -0x1

    invoke-static {v0, v4}, Lnv/n;->D(Ljava/lang/String;I)I

    move-result v12

    goto :goto_8

    :cond_a
    const-string v4, "private"

    invoke-static {v4, v2, v5}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_b

    move-object/from16 v0, p1

    move v2, v3

    move v4, v5

    move v13, v4

    goto :goto_7

    :cond_b
    const-string v4, "public"

    invoke-static {v4, v2, v5}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_c

    move-object/from16 v0, p1

    move v2, v3

    move v4, v5

    move v14, v4

    goto :goto_7

    :cond_c
    const-string v4, "must-revalidate"

    invoke-static {v4, v2, v5}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_d

    move-object/from16 v0, p1

    move v2, v3

    move v4, v5

    move v15, v4

    goto :goto_7

    :cond_d
    const-string v4, "max-stale"

    invoke-static {v4, v2, v5}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_e

    const v2, 0x7fffffff

    invoke-static {v0, v2}, Lnv/n;->D(Ljava/lang/String;I)I

    move-result v16

    goto :goto_8

    :cond_e
    const-string v4, "min-fresh"

    invoke-static {v4, v2, v5}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_f

    const/4 v4, -0x1

    invoke-static {v0, v4}, Lnv/n;->D(Ljava/lang/String;I)I

    move-result v17

    goto :goto_8

    :cond_f
    const/4 v4, -0x1

    const-string v0, "only-if-cached"

    invoke-static {v0, v2, v5}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_10

    move-object/from16 v0, p1

    move v2, v3

    move v4, v5

    move/from16 v18, v4

    goto/16 :goto_7

    :cond_10
    const-string v0, "no-transform"

    invoke-static {v0, v2, v5}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_11

    move-object/from16 v0, p1

    move v2, v3

    move v4, v5

    move/from16 v19, v4

    goto/16 :goto_7

    :cond_11
    const-string v0, "immutable"

    invoke-static {v0, v2, v5}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_8

    move-object/from16 v0, p1

    move v2, v3

    move v4, v5

    move/from16 v20, v4

    goto/16 :goto_7

    :cond_12
    move/from16 v28, v1

    move v5, v4

    const/4 v4, -0x1

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p1

    move v4, v5

    move/from16 v1, v28

    goto/16 :goto_0

    :cond_13
    if-nez v7, :cond_14

    const/16 v21, 0x0

    goto :goto_9

    :cond_14
    move-object/from16 v21, v8

    :goto_9
    new-instance v8, Lmv/d;

    invoke-direct/range {v8 .. v21}, Lmv/d;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    return-object v8
.end method

.method public static final h(Lmv/d;)Ljava/lang/String;
    .locals 4
    .param p0    # Lmv/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lmv/d;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_d

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lmv/d;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "no-cache, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, Lmv/d;->j()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "no-store, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {p0}, Lmv/d;->e()I

    move-result v1

    const-string v2, ", "

    const/4 v3, -0x1

    if-eq v1, v3, :cond_2

    const-string v1, "max-age="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lmv/d;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {p0}, Lmv/d;->m()I

    move-result v1

    if-eq v1, v3, :cond_3

    const-string v1, "s-maxage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lmv/d;->m()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {p0}, Lmv/d;->c()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "private, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {p0}, Lmv/d;->d()Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "public, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {p0}, Lmv/d;->h()Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "must-revalidate, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    invoke-virtual {p0}, Lmv/d;->f()I

    move-result v1

    if-eq v1, v3, :cond_7

    const-string v1, "max-stale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lmv/d;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    invoke-virtual {p0}, Lmv/d;->g()I

    move-result v1

    if-eq v1, v3, :cond_8

    const-string v1, "min-fresh="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lmv/d;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    invoke-virtual {p0}, Lmv/d;->l()Z

    move-result v1

    if-eqz v1, :cond_9

    const-string v1, "only-if-cached, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    invoke-virtual {p0}, Lmv/d;->k()Z

    move-result v1

    if-eqz v1, :cond_a

    const-string v1, "no-transform, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_a
    invoke-virtual {p0}, Lmv/d;->b()Z

    move-result v1

    if-eqz v1, :cond_b

    const-string v1, "immutable, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_c

    const-string p0, ""

    return-object p0

    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "delete(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lmv/d;->n(Ljava/lang/String;)V

    :cond_d
    return-object v0
.end method

.method public static final i(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    :goto_0
    if-ge p2, v0, :cond_1

    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {p1, v1, v4, v2, v3}, Lkotlin/text/StringsKt;->Z(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return p2

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    return p0
.end method
