.class public final Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent$a;",
        "",
        "<init>",
        "()V",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;",
        "config",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;",
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
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;
    .locals 18
    .param p1    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "config"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;->getOptions()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/16 v3, 0xa

    if-eqz v0, :cond_5

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Option;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Option;->getValue()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;->getPrefill()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_2
    move-object v7, v2

    :goto_2
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v5, :cond_4

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    check-cast v7, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Option;

    new-instance v8, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Option;->getText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Option;->getValue()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Option;->getLeadingImageUrl()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v8, v9, v10, v7}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    :goto_4
    move-object v7, v0

    goto :goto_5

    :cond_5
    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v0

    goto :goto_4

    :goto_5
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;

    move-result-object v6

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;->getHidden()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;

    move-result-object v0

    move-object v8, v0

    goto :goto_6

    :cond_6
    move-object v8, v2

    :goto_6
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;->getDisabled()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;

    move-result-object v0

    move-object v9, v0

    goto :goto_7

    :cond_7
    move-object v9, v2

    :goto_7
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;->getLabel()Ljava/lang/String;

    move-result-object v0

    move-object v10, v0

    goto :goto_8

    :cond_8
    move-object v10, v2

    :goto_8
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;->getPlaceholder()Ljava/lang/String;

    move-result-object v0

    move-object v11, v0

    goto :goto_9

    :cond_9
    move-object v11, v2

    :goto_9
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;->getOptions()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_b

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v0, v3}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Option;

    new-instance v12, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Option;->getText()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Option;->getValue()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Option;->getLeadingImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v12, v13, v14, v3}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_a
    :goto_b
    move-object v12, v4

    goto :goto_c

    :cond_b
    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v4

    goto :goto_b

    :goto_c
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect$Attributes;->getLeadingImageTemplate()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v2

    :cond_c
    move-object v13, v2

    new-instance v4, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;

    const-wide/16 v14, 0x0

    const/16 v16, 0x200

    const/16 v17, 0x0

    invoke-direct/range {v4 .. v17}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method
