.class public final Lcr/v1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;",
        "Lcr/y4;",
        "uiComponentHelper",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;",
        "config",
        "Landroid/widget/LinearLayout;",
        "f",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;)Landroid/widget/LinearLayout;",
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
.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/n;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcr/v1;->k(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/n;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/n;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcr/v1;->j(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/n;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lgr/b;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcr/v1;->g(Lgr/b;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcr/v1;->i(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic e(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcr/v1;->h(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;)Landroid/widget/LinearLayout;
    .locals 10
    .param p0    # Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcr/y4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiComponentHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcr/y4;->b()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Lgr/n;->c(Landroid/view/LayoutInflater;)Lgr/n;

    move-result-object v0

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$Attributes;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$Attributes;->getOptions()Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_1

    :cond_0
    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/16 v5, 0x8

    const/4 v6, 0x0

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;

    invoke-virtual {p1}, Lcr/y4;->b()Landroid/view/LayoutInflater;

    move-result-object v7

    invoke-virtual {v0}, Lgr/n;->b()Landroid/widget/LinearLayout;

    move-result-object v8

    invoke-static {v7, v8, v6}, Lgr/b;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lgr/b;

    move-result-object v7

    iget-object v8, v7, Lgr/b;->d:Landroid/widget/TextView;

    const-string v9, "radioButtonLabel"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;->getText()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Ler/h;->e(Landroid/widget/TextView;Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;->getDescriptionText()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-static {v8}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_1

    :cond_3
    iget-object v5, v7, Lgr/b;->c:Landroid/widget/TextView;

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    iget-object v5, v7, Lgr/b;->c:Landroid/widget/TextView;

    const-string v6, "radioButtonDescription"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v8}, Ler/h;->e(Landroid/widget/TextView;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    :goto_1
    iget-object v6, v7, Lgr/b;->c:Landroid/widget/TextView;

    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    new-instance v5, Lcr/q1;

    invoke-direct {v5, p2, v7}, Lcr/q1;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/b;)V

    invoke-virtual {p1, v5}, Lcr/y4;->d(Lkotlin/jvm/functions/Function0;)V

    iget-object v5, v7, Lgr/b;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    new-instance v6, Lcr/r1;

    invoke-direct {v6, v2, p2, v4, p0}, Lcr/r1;-><init>(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;)V

    invoke-virtual {v5, v6}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-virtual {v7}, Lgr/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v5

    new-instance v6, Lcr/s1;

    invoke-direct {v6, v7}, Lcr/s1;-><init>(Lgr/b;)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v5, v0, Lgr/n;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v7}, Lgr/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v5, v7, Lgr/b;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    const-string v6, "radioButton"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;->f()Lan/r;

    move-result-object v5

    invoke-interface {v5}, Lan/r;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, v7, Lgr/b;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/widget/CompoundButton;->setChecked(Z)V

    goto/16 :goto_0

    :cond_5
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;

    move-result-object p0

    const/4 v2, 0x0

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;->getErrorTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_6

    iget-object v3, v0, Lgr/n;->c:Landroid/widget/TextView;

    const-string v4, "radioGroupError"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x2

    invoke-static {v3, p0, v2, v4, v2}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_6
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$Attributes;->getLabel()Ljava/lang/String;

    move-result-object v2

    :cond_7
    if-eqz v2, :cond_9

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-nez p0, :cond_8

    goto :goto_3

    :cond_8
    iget-object p0, v0, Lgr/n;->d:Landroid/widget/TextView;

    invoke-virtual {p0, v6}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, v0, Lgr/n;->d:Landroid/widget/TextView;

    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance p0, Lcr/t1;

    invoke-direct {p0, p2, v0}, Lcr/t1;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/n;)V

    invoke-virtual {p1, p0}, Lcr/y4;->d(Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    :cond_9
    :goto_3
    iget-object p0, v0, Lgr/n;->d:Landroid/widget/TextView;

    invoke-virtual {p0, v5}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    new-instance p0, Lcr/u1;

    invoke-direct {p0, p2, v0}, Lcr/u1;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/n;)V

    invoke-virtual {p1, p0}, Lcr/y4;->d(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0}, Lgr/n;->b()Landroid/widget/LinearLayout;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lgr/n;->b()Landroid/widget/LinearLayout;

    move-result-object p0

    const-string p1, "getRoot(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final g(Lgr/b;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lgr/b;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p0, p0, Lgr/b;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :cond_0
    return-void
.end method

.method public static final h(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/b;)Lkotlin/Unit;
    .locals 7

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;->getTextBasedStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v3, p1, Lgr/b;->d:Landroid/widget/TextView;

    const-string v4, "radioButtonLabel"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v0, v2, v1, v2}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;->getDescriptionTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v3, p1, Lgr/b;->c:Landroid/widget/TextView;

    const-string v4, "radioButtonDescription"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v0, v2, v1, v2}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;->getTextColorHighlight()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;->getValue()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;->getTextBasedStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;->getTextColor()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColorValue;->getValue()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_0

    :cond_2
    iget-object p0, p1, Lgr/b;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string p0, "getContext(...)"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lic/b;->j:I

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ljq/z;->d(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)I

    move-result p0

    :goto_0
    iget-object v1, p1, Lgr/b;->d:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lic/d;->A:I

    invoke-static {v1, v2}, Ln2/h;->g(Landroid/content/res/Resources;I)F

    move-result v1

    iget-object p1, p1, Lgr/b;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    new-instance v2, Landroid/content/res/ColorStateList;

    const v3, -0x101009e

    filled-new-array {v3}, [I

    move-result-object v3

    const v4, -0x10100a0

    filled-new-array {v4}, [I

    move-result-object v4

    const v5, 0x10100a0

    filled-new-array {v5}, [I

    move-result-object v5

    filled-new-array {v3, v4, v5}, [[I

    move-result-object v3

    const/16 v4, 0xff

    int-to-float v4, v4

    mul-float/2addr v1, v4

    float-to-int v1, v1

    invoke-static {p0, v1}, Landroidx/core/graphics/c;->l(II)I

    move-result v1

    filled-new-array {v1, p0, v0}, [I

    move-result-object p0

    invoke-direct {v2, v3, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {p1, v2}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_1

    :cond_3
    iget-object p0, p1, Lgr/b;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    iget-object p1, p1, Lgr/b;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result p1

    const/16 v0, 0x96

    invoke-static {p1, v0}, Landroidx/core/graphics/c;->l(II)I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final i(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;Landroid/widget/CompoundButton;Z)V
    .locals 2

    const-string v0, "button"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p5, :cond_3

    check-cast p0, Ljava/lang/Iterable;

    new-instance p5, Ljava/util/ArrayList;

    invoke-direct {p5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/RadioButton;

    invoke-static {v1, p4}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p5}, Ljava/util/ArrayList;->size()I

    move-result p0

    const/4 p4, 0x0

    move v0, p4

    :goto_1
    if-ge v0, p0, :cond_2

    invoke-virtual {p5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    check-cast v1, Landroid/widget/RadioButton;

    invoke-virtual {v1, p4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;->getText()Ljava/lang/String;

    move-result-object p0

    invoke-static {p3, p1, p0}, Lcr/v1;->l(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public static final j(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/n;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;->getTextBasedStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_0

    iget-object p1, p1, Lgr/n;->d:Landroid/widget/TextView;

    const-string v0, "radioGroupLabel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, p0, v1, v0, v1}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final k(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Lgr/n;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;->getMargins()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lgr/n;->b()Landroid/widget/LinearLayout;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lmr/d;->c(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final l(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$Attributes;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$Attributes;->getOptions()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;->getValue()Ljava/lang/String;

    move-result-object v0

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;->f()Lan/r;

    move-result-object p0

    invoke-interface {p0, v0}, Lan/r;->c(Ljava/lang/String;)V

    :cond_3
    return-void
.end method
