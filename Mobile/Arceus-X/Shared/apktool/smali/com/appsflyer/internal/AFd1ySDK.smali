.class public final Lcom/appsflyer/internal/AFd1ySDK;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static registerClient(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 17
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p1

    const-string v1, ""

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/appsflyer/internal/AFj1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)I

    move-result v2

    invoke-static {v0}, Lcom/appsflyer/internal/AFj1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)I

    move-result v3

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lkotlin/text/Regex;

    const-string v5, "(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)"

    invoke-direct {v4, v5}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Lkotlin/text/Regex;->e(Ljava/lang/CharSequence;)Lkotlin/text/MatchResult;

    move-result-object v4

    const/4 v5, 0x4

    const/4 v6, 0x3

    const v7, 0xf4240

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v4, :cond_6

    invoke-interface {v4}, Lkotlin/text/MatchResult;->d()Lkotlin/text/i;

    move-result-object v10

    invoke-interface {v10, v8}, Lkotlin/text/i;->get(I)Lkotlin/text/MatchGroup;

    move-result-object v10

    if-eqz v10, :cond_0

    invoke-virtual {v10}, Lkotlin/text/MatchGroup;->a()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_0

    invoke-static {v10}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v10

    move-object v11, v10

    goto :goto_0

    :cond_0
    move-object v11, v9

    :goto_0
    invoke-interface {v4}, Lkotlin/text/MatchResult;->d()Lkotlin/text/i;

    move-result-object v10

    const/4 v12, 0x2

    invoke-interface {v10, v12}, Lkotlin/text/i;->get(I)Lkotlin/text/MatchGroup;

    move-result-object v10

    if-eqz v10, :cond_1

    invoke-virtual {v10}, Lkotlin/text/MatchGroup;->a()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_1

    invoke-static {v10}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v10

    move-object v12, v10

    goto :goto_1

    :cond_1
    move-object v12, v9

    :goto_1
    invoke-interface {v4}, Lkotlin/text/MatchResult;->d()Lkotlin/text/i;

    move-result-object v10

    invoke-interface {v10, v6}, Lkotlin/text/i;->get(I)Lkotlin/text/MatchGroup;

    move-result-object v10

    if-eqz v10, :cond_2

    invoke-virtual {v10}, Lkotlin/text/MatchGroup;->a()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_2

    invoke-static {v10}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v10

    move-object v13, v10

    goto :goto_2

    :cond_2
    move-object v13, v9

    :goto_2
    invoke-interface {v4}, Lkotlin/text/MatchResult;->d()Lkotlin/text/i;

    move-result-object v10

    invoke-interface {v10, v5}, Lkotlin/text/i;->get(I)Lkotlin/text/MatchGroup;

    move-result-object v10

    if-eqz v10, :cond_3

    invoke-virtual {v10}, Lkotlin/text/MatchGroup;->a()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_3

    invoke-static {v10}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v10

    move-object v14, v10

    goto :goto_3

    :cond_3
    move-object v14, v9

    :goto_3
    invoke-interface {v4}, Lkotlin/text/MatchResult;->d()Lkotlin/text/i;

    move-result-object v10

    const/4 v15, 0x5

    invoke-interface {v10, v15}, Lkotlin/text/i;->get(I)Lkotlin/text/MatchGroup;

    move-result-object v10

    if-eqz v10, :cond_4

    invoke-virtual {v10}, Lkotlin/text/MatchGroup;->a()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_4

    invoke-static {v10}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v10

    move-object v15, v10

    goto :goto_4

    :cond_4
    move-object v15, v9

    :goto_4
    invoke-interface {v4}, Lkotlin/text/MatchResult;->d()Lkotlin/text/i;

    move-result-object v4

    const/4 v10, 0x6

    invoke-interface {v4, v10}, Lkotlin/text/i;->get(I)Lkotlin/text/MatchGroup;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lkotlin/text/MatchGroup;->a()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-static {v4}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v16, v4

    goto :goto_5

    :cond_5
    move-object/from16 v16, v9

    :goto_5
    filled-new-array/range {v11 .. v16}, [Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v10, v16

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v9}, Lkotlin/collections/m;->G([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v4

    mul-int/2addr v4, v7

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v11

    mul-int/lit16 v11, v11, 0x3e8

    add-int/2addr v4, v11

    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    move-result v11

    add-int/2addr v4, v11

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v11

    mul-int/2addr v11, v7

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v12

    mul-int/lit16 v12, v12, 0x3e8

    add-int/2addr v11, v12

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    add-int/2addr v11, v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v4, v10}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    goto :goto_6

    :cond_6
    move-object v4, v9

    :goto_6
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkotlin/text/Regex;

    const-string v10, "^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$"

    invoke-direct {v1, v10}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lkotlin/text/Regex;->e(Ljava/lang/CharSequence;)Lkotlin/text/MatchResult;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-interface {v0}, Lkotlin/text/MatchResult;->d()Lkotlin/text/i;

    move-result-object v1

    invoke-interface {v1, v8}, Lkotlin/text/i;->get(I)Lkotlin/text/MatchGroup;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lkotlin/text/MatchGroup;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-static {v1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_7

    :cond_7
    move-object v1, v9

    :goto_7
    invoke-interface {v0}, Lkotlin/text/MatchResult;->d()Lkotlin/text/i;

    move-result-object v10

    invoke-interface {v10, v6}, Lkotlin/text/i;->get(I)Lkotlin/text/MatchGroup;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lkotlin/text/MatchGroup;->a()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-static {v6}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_8

    :cond_8
    move-object v6, v9

    :goto_8
    invoke-interface {v0}, Lkotlin/text/MatchResult;->d()Lkotlin/text/i;

    move-result-object v0

    invoke-interface {v0, v5}, Lkotlin/text/i;->get(I)Lkotlin/text/MatchGroup;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lkotlin/text/MatchGroup;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_9

    :cond_9
    move-object v0, v9

    :goto_9
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v0

    mul-int/2addr v0, v7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    add-int/2addr v1, v8

    mul-int/2addr v1, v7

    sub-int/2addr v1, v8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    goto :goto_a

    :cond_a
    if-eqz v6, :cond_b

    if-eqz v0, :cond_b

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v1

    mul-int/2addr v1, v7

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v5

    mul-int/lit16 v5, v5, 0x3e8

    add-int/2addr v1, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v5

    mul-int/2addr v5, v7

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    add-int/2addr v0, v8

    mul-int/lit16 v0, v0, 0x3e8

    add-int/2addr v5, v0

    sub-int/2addr v5, v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    :cond_b
    :goto_a
    const/4 v0, -0x1

    const/4 v1, 0x0

    if-eq v3, v0, :cond_d

    if-nez v4, :cond_d

    if-ne v3, v2, :cond_c

    return v8

    :cond_c
    return v1

    :cond_d
    if-eqz v9, :cond_f

    invoke-virtual {v9}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-gt v0, v2, :cond_e

    invoke-virtual {v9}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-gt v2, v0, :cond_e

    return v8

    :cond_e
    return v1

    :cond_f
    if-eqz v4, :cond_10

    invoke-virtual {v4}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-gt v0, v2, :cond_10

    invoke-virtual {v4}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-gt v2, v0, :cond_10

    return v8

    :cond_10
    return v1
.end method
