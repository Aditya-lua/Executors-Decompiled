.class public final Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent$a;",
        "",
        "<init>",
        "()V",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;",
        "config",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;",
        "ui-step-renderer_release"
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
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;
    .locals 17
    .param p1    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "config"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;->getHidden()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;->getDisabled()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v3

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;->getAutoSubmitCountdownText()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, v3

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;->getAutoSubmitIntervalSeconds()Ljava/lang/Integer;

    move-result-object v6

    goto :goto_3

    :cond_3
    move-object v6, v3

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;

    move-result-object v7

    if-eqz v7, :cond_a

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;->getProvider()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;

    move-result-object v7

    if-eqz v7, :cond_a

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/a;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;)Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;

    move-result-object v7

    if-nez v7, :cond_4

    goto :goto_5

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;

    move-result-object v8

    const-string v9, ""

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;->getErrorRetrievingMdocText()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_6

    :cond_5
    move-object v8, v9

    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;

    move-result-object v10

    if-eqz v10, :cond_8

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;->getNoMdocAvailableText()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_7

    goto :goto_4

    :cond_7
    move-object v9, v10

    :cond_8
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;

    move-result-object v10

    if-eqz v10, :cond_9

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;->getSuccessfulMdocRetrievalTransitionComponentName()Ljava/lang/String;

    move-result-object v3

    :cond_9
    move-object v10, v3

    const/16 v15, 0xe00

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object v3, v0

    invoke-direct/range {v1 .. v16}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_a
    :goto_5
    return-object v3
.end method
