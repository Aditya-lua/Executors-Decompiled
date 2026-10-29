.class public final Lcom/withpersona/sdk2/inquiry/ui/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005*\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;",
        "",
        "componentName",
        "b",
        "(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;",
        "",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
        "d",
        "(Ljava/util/List;)Ljava/util/List;",
        "ui_release"
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
.method public static synthetic a(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/b;->c(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;)Z

    move-result p0

    return p0
.end method

.method public static final b(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;
    .locals 22
    .param p0    # Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;->getComponents()Ljava/util/List;

    move-result-object v2

    new-instance v3, Lor/k1;

    invoke-direct {v3, v0}, Lor/k1;-><init>(Ljava/lang/String;)V

    const-class v0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;

    invoke-static {v0}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v0

    invoke-static {v2, v0, v3}, Ler/h;->a(Ljava/util/List;Lhu/c;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;

    if-nez v0, :cond_2

    return-object v1

    :cond_1
    :goto_0
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;->getComponents()Ljava/util/List;

    move-result-object v0

    sget-object v2, Lcom/withpersona/sdk2/inquiry/ui/b$a;->a:Lcom/withpersona/sdk2/inquiry/ui/b$a;

    const-class v3, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;

    invoke-static {v3}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v3

    invoke-static {v0, v3, v2}, Ler/h;->a(Ljava/util/List;Lhu/c;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    new-instance v9, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v9, v0, v2, v3}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;ILjava/lang/String;)V

    const v20, 0x3ff1f

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v1 .. v21}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;->v(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;ZZLjava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final d(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .param p0    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    :goto_1
    move-object v1, v3

    goto :goto_2

    :cond_1
    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;

    if-eqz v2, :cond_3

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;

    invoke-interface {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;->getChildren()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/ui/b;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v1, v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;->r1(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;

    move-result-object v1

    :cond_3
    :goto_2
    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    return-object v0
.end method
