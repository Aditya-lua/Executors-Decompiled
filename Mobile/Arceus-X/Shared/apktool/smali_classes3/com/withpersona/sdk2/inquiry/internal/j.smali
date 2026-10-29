.class public final Lcom/withpersona/sdk2/inquiry/internal/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;",
        "uiFramework",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;)Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;",
        "inquiry-internal_release"
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
.method public static final a(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;)Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;
    .locals 20
    .param p0    # Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "uiFramework"

    move-object/from16 v8, p1

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;

    const-string v2, "toLowerCase(...)"

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_5

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;

    move v1, v3

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;->m()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;->n()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;->l0()Lzo/h;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v5

    move-object v5, v6

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;->o()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;->a()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_0

    move v7, v4

    goto :goto_0

    :cond_0
    move v7, v1

    :goto_0
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;->g()Ljava/util/Map;

    move-result-object v10

    if-eqz v10, :cond_1

    invoke-interface {v10}, Ljava/util/Map;->isEmpty()Z

    move-result v10

    xor-int/2addr v10, v4

    if-ne v10, v4, :cond_1

    move v10, v4

    goto :goto_1

    :cond_1
    move v10, v1

    :goto_1
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;->j()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_2

    move v11, v4

    goto :goto_2

    :cond_2
    move v11, v1

    :goto_2
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;->i()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_3

    move v12, v4

    goto :goto_3

    :cond_3
    move v12, v1

    :goto_3
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$TemplateProps;->getTheme()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_4

    move v1, v4

    :cond_4
    move-object v4, v2

    new-instance v2, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    sget-object v16, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v17

    const/16 v18, 0x610

    const/16 v19, 0x0

    move-object v11, v7

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v10, v0

    invoke-direct/range {v2 .. v19}, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_5
    move v1, v3

    instance-of v3, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$InquiryProps;

    if-eqz v3, :cond_7

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$InquiryProps;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$InquiryProps;->l0()Lzo/h;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$InquiryProps;->getTheme()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_6

    move v3, v4

    goto :goto_4

    :cond_6
    move v3, v1

    :goto_4
    new-instance v2, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;

    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v17

    const/16 v18, 0x1ddb

    const/16 v19, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v12

    move-object/from16 v8, p1

    invoke-direct/range {v2 .. v19}, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_7
    instance-of v3, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$OneTimeCodeProps;

    if-eqz v3, :cond_9

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$OneTimeCodeProps;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$OneTimeCodeProps;->l0()Lzo/h;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$OneTimeCodeProps;->getTheme()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_8

    move v3, v4

    goto :goto_5

    :cond_8
    move v3, v1

    :goto_5
    new-instance v2, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;

    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v17

    const/16 v18, 0x1bdb

    const/16 v19, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v13

    move-object/from16 v8, p1

    invoke-direct/range {v2 .. v19}, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_9
    instance-of v3, v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$RelaySessionProps;

    if-eqz v3, :cond_b

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$RelaySessionProps;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$RelaySessionProps;->l0()Lzo/h;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props$RelaySessionProps;->getTheme()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_a

    move v3, v4

    goto :goto_6

    :cond_a
    move v3, v1

    :goto_6
    new-instance v2, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;

    sget-object v16, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v17

    const/16 v18, 0x1fdb

    const/16 v19, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v8, p1

    invoke-direct/range {v2 .. v19}, Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_b
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0
.end method
