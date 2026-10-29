.class public final Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data$Adapter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Adapter"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data$Adapter;",
        "",
        "<init>",
        "()V",
        "Lum/t;",
        "jsonWriter",
        "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;",
        "data",
        "",
        "toJson",
        "(Lum/t;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;)V",
        "Lum/m;",
        "reader",
        "fromJson",
        "(Lum/m;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;",
        "inquiry-internal_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data$Adapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;
    .locals 14
    .param p1    # Lum/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lum/f;
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lum/m;->b()V

    const-string v0, ""

    move-object v2, v0

    move-object v4, v2

    :goto_0
    invoke-virtual {p1}, Lum/m;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lum/m;->n()Ljava/lang/String;

    move-result-object v0

    const-string v1, "templateId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v3, "nextString(...)"

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lum/m;->r()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v1, "environment"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lum/m;->r()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lum/m;->P()V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lum/m;->d()V

    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;

    const/16 v12, 0x3f2

    const/4 v13, 0x0

    const/4 v3, 0x0

    const-string v5, ""

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v1, v2, v0, v2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public final toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;)V
    .locals 3
    .param p1    # Lum/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lum/z;
    .end annotation

    const-string v0, "jsonWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    const-string v0, "attributes"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;->a()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "inquiryTemplateId"

    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    move-result-object v1

    invoke-virtual {v1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    :cond_0
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;->a()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;->i()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "inquiryTemplateVersionId"

    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    move-result-object v1

    invoke-virtual {v1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    :cond_1
    const-string v0, "environment"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    move-result-object v0

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;->a()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;->a()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "environment_id"

    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    move-result-object v1

    invoke-virtual {v1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    :cond_2
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;->a()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "accountId"

    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    move-result-object v1

    invoke-virtual {v1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    :cond_3
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;->a()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, "referenceId"

    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    move-result-object v1

    invoke-virtual {v1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    :cond_4
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;->a()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v1, "note"

    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    move-result-object v1

    invoke-virtual {v1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    :cond_5
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;->a()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;->d()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v0, "fields"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap$Companion;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;->a()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;->d()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap$Companion;->toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;)V

    :cond_6
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;->a()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;->j()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    const-string v0, "themeSetId"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    move-result-object v0

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;->a()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    :cond_7
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;->a()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    const-string v0, "redirectUri"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    move-result-object v0

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$Data;->a()Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest$a;->f()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    :cond_8
    invoke-virtual {p1}, Lum/t;->g()Lum/t;

    invoke-virtual {p1}, Lum/t;->g()Lum/t;

    return-void
.end method
