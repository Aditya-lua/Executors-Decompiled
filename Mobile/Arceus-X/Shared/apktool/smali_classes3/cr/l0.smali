.class public final Lcr/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;",
        "Lcr/y4;",
        "uiComponentHelper",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;",
        "config",
        "Landroid/widget/LinearLayout;",
        "c",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;)Landroid/widget/LinearLayout;",
        "ui-step-renderer_release"
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
.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;Ljava/util/List;Lcom/google/android/material/checkbox/MaterialCheckBox;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcr/l0;->d(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;Ljava/util/List;Lcom/google/android/material/checkbox/MaterialCheckBox;I)V

    return-void
.end method

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;Lgr/j;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcr/l0;->e(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;Lgr/j;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;)Landroid/widget/LinearLayout;
    .locals 20
    .param p0    # Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcr/y4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "<this>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "uiComponentHelper"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "config"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcr/y4;->b()Landroid/view/LayoutInflater;

    move-result-object v3

    invoke-static {v3}, Lgr/j;->c(Landroid/view/LayoutInflater;)Lgr/j;

    move-result-object v3

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$Attributes;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$Attributes;->getPrefill()Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_0

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->Q0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v7

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$Attributes;->getOptions()Ljava/util/List;

    move-result-object v8

    if-nez v8, :cond_2

    :cond_1
    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v8

    :cond_2
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;

    new-instance v11, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;->getValue()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$Attributes;

    const/4 v14, 0x1

    if-eqz v7, :cond_3

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;->getValue()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v7, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-ne v15, v14, :cond_3

    move v15, v14

    goto :goto_2

    :cond_3
    move v15, v10

    :goto_2
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    move/from16 v16, v14

    move-object v14, v15

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;->getText()Ljava/lang/String;

    move-result-object v15

    move/from16 v17, v16

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;->getDescriptionText()Ljava/lang/String;

    move-result-object v16

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$Attributes;->getHidden()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;

    move-result-object v18

    goto :goto_3

    :cond_4
    const/16 v18, 0x0

    :goto_3
    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$Attributes;->getDisabled()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;

    move-result-object v19

    move/from16 v6, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    goto :goto_4

    :cond_5
    move/from16 v6, v17

    move-object/from16 v17, v18

    const/16 v18, 0x0

    :goto_4
    invoke-direct/range {v13 .. v18}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$Attributes;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$InputCheckboxComponentStyle;

    move-result-object v14

    invoke-direct {v11, v12, v13, v14}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$InputCheckboxComponentStyle;)V

    new-instance v12, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;

    if-eqz v7, :cond_6

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;->getValue()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v7, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-ne v13, v6, :cond_6

    move v14, v6

    goto :goto_5

    :cond_6
    move v14, v10

    :goto_5
    invoke-direct {v12, v11, v14}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;Z)V

    invoke-virtual {v1}, Lcr/y4;->b()Landroid/view/LayoutInflater;

    move-result-object v13

    iget-object v14, v3, Lgr/j;->b:Landroid/widget/LinearLayout;

    invoke-static {v13, v14, v10}, Lgr/i;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lgr/i;

    move-result-object v10

    const-string v13, "inflate(...)"

    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v12, v1, v10, v11}, Lcr/i0;->e(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;Lcr/y4;Lgr/i;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;)Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v11

    iget-object v12, v3, Lgr/j;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v12, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v11, v10, Lgr/i;->b:Lcom/google/android/material/checkbox/MaterialCheckBox;

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;->getValue()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;->f()Ler/n;

    move-result-object v11

    invoke-virtual {v11}, Ler/n;->b()Ljava/util/Set;

    move-result-object v11

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;->getValue()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v11, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    iget-object v9, v10, Lgr/i;->b:Lcom/google/android/material/checkbox/MaterialCheckBox;

    invoke-virtual {v9, v6}, Lcom/google/android/material/checkbox/MaterialCheckBox;->setChecked(Z)V

    :cond_7
    iget-object v6, v10, Lgr/i;->b:Lcom/google/android/material/checkbox/MaterialCheckBox;

    const-string v9, "checkbox"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_8
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v7, v10

    :goto_6
    if-ge v7, v6, :cond_9

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    check-cast v8, Lcom/google/android/material/checkbox/MaterialCheckBox;

    new-instance v9, Lcr/j0;

    invoke-direct {v9, v0, v5}, Lcr/j0;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;Ljava/util/List;)V

    invoke-virtual {v8, v9}, Lcom/google/android/material/checkbox/MaterialCheckBox;->c(Lcom/google/android/material/checkbox/MaterialCheckBox$b;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$InputCheckboxComponentStyle;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$InputCheckboxComponentStyle;->getErrorTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v5, v3, Lgr/j;->c:Landroid/widget/TextView;

    const-string v6, "checkboxGroupError"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static {v5, v0, v7, v6, v7}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    goto :goto_7

    :cond_a
    const/4 v7, 0x0

    :goto_7
    if-eqz v4, :cond_b

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$Attributes;->getLabel()Ljava/lang/String;

    move-result-object v6

    goto :goto_8

    :cond_b
    move-object v6, v7

    :goto_8
    if-eqz v6, :cond_d

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_c

    goto :goto_9

    :cond_c
    iget-object v0, v3, Lgr/j;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v3, Lgr/j;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Lcr/k0;

    invoke-direct {v0, v2, v3}, Lcr/k0;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;Lgr/j;)V

    invoke-virtual {v1, v0}, Lcr/y4;->d(Lkotlin/jvm/functions/Function0;)V

    goto :goto_a

    :cond_d
    :goto_9
    iget-object v0, v3, Lgr/j;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_a
    invoke-virtual {v3}, Lgr/j;->b()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lgr/j;->b()Landroid/widget/LinearLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final d(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;Ljava/util/List;Lcom/google/android/material/checkbox/MaterialCheckBox;I)V
    .locals 0

    const-string p3, "checkBox"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcr/l0;->f(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;Ljava/util/List;)V

    return-void
.end method

.method public static final e(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;Lgr/j;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$InputCheckboxComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$InputCheckboxComponentStyle;->getTextBasedStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_0

    iget-object p1, p1, Lgr/j;->d:Landroid/widget/TextView;

    const-string v0, "checkboxGroupLabel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, p0, v1, v0, v1}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final f(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;",
            "Ljava/util/List<",
            "Lcom/google/android/material/checkbox/MaterialCheckBox;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;->f()Ler/n;

    move-result-object p0

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/checkbox/MaterialCheckBox;

    invoke-virtual {v1}, Lcom/google/android/material/checkbox/MaterialCheckBox;->isChecked()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Ler/n;->c(Ljava/util/Set;)V

    return-void
.end method
