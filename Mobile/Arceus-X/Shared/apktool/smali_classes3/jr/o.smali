.class public final Ljr/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001b\u0010\u0008\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;",
        "styles",
        "",
        "i",
        "(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;)V",
        "",
        "bottomBorderWidth",
        "h",
        "(Lcom/google/android/material/textfield/TextInputLayout;I)V",
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
.method public static synthetic a(Lkotlin/jvm/internal/c0;Z)V
    .locals 0

    invoke-static {p0, p1}, Ljr/o;->m(Lkotlin/jvm/internal/c0;Z)V

    return-void
.end method

.method public static synthetic b(Lcom/google/android/material/textfield/TextInputLayout;IIIILandroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p13}, Ljr/o;->o(Lcom/google/android/material/textfield/TextInputLayout;IIIILandroid/view/View;IIIIIIII)V

    return-void
.end method

.method public static synthetic c(Lcom/google/android/material/textfield/TextInputLayout;IIIZ)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljr/o;->n(Lcom/google/android/material/textfield/TextInputLayout;IIIZ)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/google/android/material/textfield/TextInputLayout;ILandroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p11}, Ljr/o;->p(Lcom/google/android/material/textfield/TextInputLayout;ILandroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method public static synthetic e(Lcom/google/android/material/textfield/TextInputLayout;Lkotlin/jvm/internal/c0;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljr/o;->l(Lcom/google/android/material/textfield/TextInputLayout;Lkotlin/jvm/internal/c0;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic f(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p11}, Ljr/o;->j(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method public static synthetic g(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p11}, Ljr/o;->k(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method public static final h(Lcom/google/android/material/textfield/TextInputLayout;I)V
    .locals 9

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxStrokeColor()I

    move-result v2

    invoke-virtual {v0, p1, v2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    new-instance v3, Landroid/graphics/drawable/LayerDrawable;

    const/4 v2, 0x1

    new-array v2, v2, [Landroid/graphics/drawable/Drawable;

    aput-object v0, v2, v1

    invoke-direct {v3, v2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    neg-int v5, p1

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :cond_1
    move v8, v1

    const/4 v4, 0x0

    move v6, v5

    move v7, v5

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    invoke-virtual {p0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static final i(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;)V
    .locals 18
    .param p0    # Lcom/google/android/material/textfield/TextInputLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v1, p0

    const-string v0, "<this>"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "styles"

    move-object/from16 v6, p1

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lkotlin/jvm/internal/c0;

    invoke-direct {v7}, Lkotlin/jvm/internal/c0;-><init>()V

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getBaseBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v0

    const/4 v8, 0x2

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getFocusedBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getDisabledBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v5, v0

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getErrorBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v2, v0

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    invoke-virtual {v1, v8}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxBackgroundMode(I)V

    invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z

    move-result v0

    invoke-static {v1, v0, v3, v4, v5}, Ljr/d0;->i(Lcom/google/android/material/textfield/TextInputLayout;ZIII)V

    new-instance v0, Ljr/h;

    invoke-direct {v0, v1, v3, v4, v5}, Ljr/h;-><init>(Lcom/google/android/material/textfield/TextInputLayout;III)V

    iput-object v0, v7, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    new-instance v0, Ljr/i;

    invoke-direct/range {v0 .. v5}, Ljr/i;-><init>(Lcom/google/android/material/textfield/TextInputLayout;IIII)V

    invoke-virtual {v1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_3
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getBaseBorderColorValue()Ljava/lang/Integer;

    move-result-object v0

    const v2, -0x101009e

    const v3, 0x101009c

    const v4, 0x10100a2

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getFocusedBorderColorValue()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_3

    :cond_4
    move v5, v0

    :goto_3
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getDisabledBorderColorValue()Ljava/lang/Integer;

    move-result-object v9

    if-eqz v9, :cond_5

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_4

    :cond_5
    move v9, v0

    :goto_4
    new-instance v10, Landroid/content/res/ColorStateList;

    filled-new-array {v4}, [I

    move-result-object v11

    filled-new-array {v3}, [I

    move-result-object v12

    filled-new-array {v2}, [I

    move-result-object v13

    filled-new-array {v11, v12, v13}, [[I

    move-result-object v11

    filled-new-array {v0, v5, v9}, [I

    move-result-object v5

    invoke-direct {v10, v11, v5}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v1, v10}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeColorStateList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getErrorBorderColorValue()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_6
    new-instance v5, Landroid/content/res/ColorStateList;

    filled-new-array {v4}, [I

    move-result-object v9

    filled-new-array {v3}, [I

    move-result-object v10

    filled-new-array {v2}, [I

    move-result-object v11

    filled-new-array {v9, v10, v11}, [[I

    move-result-object v9

    filled-new-array {v0, v0, v0}, [I

    move-result-object v0

    invoke-direct {v5, v9, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v1, v5}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeErrorColor(Landroid/content/res/ColorStateList;)V

    :cond_7
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getTopBorderWidthValue()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v9

    invoke-static {v9, v10}, Ljq/j;->a(D)D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    double-to-int v0, v11

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeWidth(I)V

    invoke-static {v9, v10}, Ljq/j;->a(D)D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    double-to-int v0, v9

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeWidthFocused(I)V

    :cond_8
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxStrokeWidth()I

    move-result v0

    const-wide/16 v9, 0x0

    if-nez v0, :cond_b

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getBottomBorderWidthValue()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    goto :goto_5

    :cond_9
    move-wide v11, v9

    :goto_5
    cmpl-double v0, v11, v9

    if-lez v0, :cond_b

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getBottomBorderWidthValue()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    invoke-static {v11, v12}, Ljq/j;->a(D)D

    move-result-wide v11

    goto :goto_6

    :cond_a
    move-wide v11, v9

    :goto_6
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    double-to-int v0, v11

    invoke-static {v1, v0}, Ljr/o;->h(Lcom/google/android/material/textfield/TextInputLayout;I)V

    :cond_b
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getChevronColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v11

    new-instance v0, Landroid/content/res/ColorStateList;

    filled-new-array {v4}, [I

    move-result-object v12

    filled-new-array {v3}, [I

    move-result-object v13

    const v5, -0x101009c

    filled-new-array {v5}, [I

    move-result-object v14

    const v5, 0x1010367

    filled-new-array {v5}, [I

    move-result-object v15

    const v5, 0x101009e

    filled-new-array {v5}, [I

    move-result-object v16

    filled-new-array {v2}, [I

    move-result-object v17

    filled-new-array/range {v12 .. v17}, [[I

    move-result-object v5

    move v12, v11

    move v13, v11

    move v14, v11

    move v15, v11

    move/from16 v16, v11

    filled-new-array/range {v11 .. v16}, [I

    move-result-object v11

    invoke-direct {v0, v5, v11}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconTintList(Landroid/content/res/ColorStateList;)V

    :cond_c
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getBorderRadiusValue()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v11

    invoke-static {v11, v12}, Ljq/j;->a(D)D

    move-result-wide v13

    double-to-float v0, v13

    invoke-static {v11, v12}, Ljq/j;->a(D)D

    move-result-wide v13

    double-to-float v5, v13

    invoke-static {v11, v12}, Ljq/j;->a(D)D

    move-result-wide v13

    double-to-float v13, v13

    invoke-static {v11, v12}, Ljq/j;->a(D)D

    move-result-wide v11

    double-to-float v11, v11

    invoke-virtual {v1, v0, v5, v13, v11}, Lcom/google/android/material/textfield/TextInputLayout;->a0(FFFF)V

    :cond_d
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getInputSelectBoxMargins()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-static {v1, v0}, Lmr/d;->c(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;)V

    :cond_e
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getTextBasedStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v5

    const/4 v11, 0x0

    invoke-static {v0, v5, v11, v8, v11}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_f
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_10

    new-instance v5, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;

    new-instance v8, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;

    invoke-direct {v8, v9, v10}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;-><init>(D)V

    new-instance v11, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;

    invoke-direct {v11, v9, v10}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;-><init>(D)V

    new-instance v12, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;

    invoke-direct {v12, v9, v10}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;-><init>(D)V

    new-instance v13, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;

    invoke-direct {v13, v9, v10}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$DPSize;-><init>(D)V

    invoke-direct {v5, v8, v11, v12, v13}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;)V

    invoke-static {v0, v5}, Lmr/d;->c(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;)V

    :cond_10
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getBaseTextColor()Ljava/lang/Integer;

    move-result-object v0

    const v5, -0x10100a2

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getValueFocusedTextColor()Ljava/lang/Integer;

    move-result-object v8

    if-eqz v8, :cond_11

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_7

    :cond_11
    move v8, v0

    :goto_7
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getValueDisabledTextColor()Ljava/lang/Integer;

    move-result-object v9

    if-eqz v9, :cond_12

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_8

    :cond_12
    move v9, v0

    :goto_8
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getValueErrorTextColor()Ljava/lang/Integer;

    move-result-object v10

    if-eqz v10, :cond_13

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    goto :goto_9

    :cond_13
    move v10, v0

    :goto_9
    new-instance v11, Landroid/content/res/ColorStateList;

    filled-new-array {v4}, [I

    move-result-object v12

    filled-new-array {v3}, [I

    move-result-object v13

    filled-new-array {v2}, [I

    move-result-object v14

    filled-new-array {v5}, [I

    move-result-object v15

    filled-new-array {v12, v13, v14, v15}, [[I

    move-result-object v12

    filled-new-array {v0, v8, v9, v0}, [I

    move-result-object v0

    invoke-direct {v11, v12, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_14
    new-instance v0, Ljr/j;

    invoke-direct {v0, v1, v10, v11}, Ljr/j;-><init>(Lcom/google/android/material/textfield/TextInputLayout;ILandroid/content/res/ColorStateList;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_15
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getErrorBaseTextColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getErrorErrorTextColor()Ljava/lang/Integer;

    move-result-object v8

    if-eqz v8, :cond_16

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_a

    :cond_16
    move v8, v0

    :goto_a
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getErrorFocusedTextColor()Ljava/lang/Integer;

    move-result-object v9

    if-eqz v9, :cond_17

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_b

    :cond_17
    move v9, v0

    :goto_b
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getErrorDisabledTextColor()Ljava/lang/Integer;

    move-result-object v10

    if-eqz v10, :cond_18

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_18
    new-instance v10, Landroid/content/res/ColorStateList;

    filled-new-array {v4}, [I

    move-result-object v11

    filled-new-array {v3}, [I

    move-result-object v12

    filled-new-array {v2}, [I

    move-result-object v13

    filled-new-array {v5}, [I

    move-result-object v14

    filled-new-array {v11, v12, v13, v14}, [[I

    move-result-object v11

    filled-new-array {v8, v9, v0, v8}, [I

    move-result-object v0

    invoke-direct {v10, v11, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v1, v10}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorTextColor(Landroid/content/res/ColorStateList;)V

    :cond_19
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getLabelBaseTextColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getLabelFocusedTextColor()Ljava/lang/Integer;

    move-result-object v8

    if-eqz v8, :cond_1a

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_c

    :cond_1a
    move v8, v0

    :goto_c
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getLabelDisabledTextColor()Ljava/lang/Integer;

    move-result-object v9

    if-eqz v9, :cond_1b

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_d

    :cond_1b
    move v9, v0

    :goto_d
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getLabelErrorTextColor()Ljava/lang/Integer;

    move-result-object v10

    if-eqz v10, :cond_1c

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    goto :goto_e

    :cond_1c
    move v10, v0

    :goto_e
    new-instance v11, Landroid/content/res/ColorStateList;

    filled-new-array {v4}, [I

    move-result-object v12

    filled-new-array {v3}, [I

    move-result-object v13

    filled-new-array {v2}, [I

    move-result-object v14

    filled-new-array {v5}, [I

    move-result-object v15

    filled-new-array {v12, v13, v14, v15}, [[I

    move-result-object v12

    filled-new-array {v0, v8, v9, v0}, [I

    move-result-object v0

    invoke-direct {v11, v12, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    new-instance v0, Landroid/content/res/ColorStateList;

    filled-new-array {v4}, [I

    move-result-object v8

    filled-new-array {v3}, [I

    move-result-object v9

    filled-new-array {v2}, [I

    move-result-object v12

    filled-new-array {v5}, [I

    move-result-object v13

    filled-new-array {v8, v9, v12, v13}, [[I

    move-result-object v8

    filled-new-array {v10, v10, v10, v10}, [I

    move-result-object v9

    invoke-direct {v0, v8, v9}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v1, v11}, Lcom/google/android/material/textfield/TextInputLayout;->setDefaultHintTextColor(Landroid/content/res/ColorStateList;)V

    new-instance v8, Ljr/k;

    invoke-direct {v8, v1, v0, v11}, Ljr/k;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V

    invoke-virtual {v1, v8}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_1d
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getPlaceholderBaseTextColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getPlaceholderFocusedTextColor()Ljava/lang/Integer;

    move-result-object v8

    if-eqz v8, :cond_1e

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_f

    :cond_1e
    move v8, v0

    :goto_f
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getPlaceholderErrorTextColor()Ljava/lang/Integer;

    move-result-object v9

    if-eqz v9, :cond_1f

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_10

    :cond_1f
    move v9, v0

    :goto_10
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;->getPlaceholderDisabledTextColor()Ljava/lang/Integer;

    move-result-object v6

    if-eqz v6, :cond_20

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_11

    :cond_20
    move v6, v0

    :goto_11
    new-instance v10, Landroid/content/res/ColorStateList;

    filled-new-array {v4}, [I

    move-result-object v11

    filled-new-array {v3}, [I

    move-result-object v12

    filled-new-array {v2}, [I

    move-result-object v13

    filled-new-array {v5}, [I

    move-result-object v14

    filled-new-array {v11, v12, v13, v14}, [[I

    move-result-object v11

    filled-new-array {v0, v8, v6, v0}, [I

    move-result-object v0

    invoke-direct {v10, v11, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    new-instance v0, Landroid/content/res/ColorStateList;

    filled-new-array {v4}, [I

    move-result-object v4

    filled-new-array {v3}, [I

    move-result-object v3

    filled-new-array {v2}, [I

    move-result-object v2

    filled-new-array {v5}, [I

    move-result-object v5

    filled-new-array {v4, v3, v2, v5}, [[I

    move-result-object v2

    filled-new-array {v9, v9, v9, v9}, [I

    move-result-object v3

    invoke-direct {v0, v2, v3}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v1, v10}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextColor(Landroid/content/res/ColorStateList;)V

    new-instance v2, Ljr/l;

    invoke-direct {v2, v1, v0, v10}, Ljr/l;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_21
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_22

    new-instance v2, Ljr/m;

    invoke-direct {v2, v1, v7}, Ljr/m;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Lkotlin/jvm/internal/c0;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    :cond_22
    return-void
.end method

.method public static final j(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-static {p3}, Lkotlin/text/c0;->t1(Ljava/lang/CharSequence;)Z

    move-result p3

    const/4 p4, 0x1

    if-ne p3, p4, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setDefaultHintTextColor(Landroid/content/res/ColorStateList;)V

    return-void

    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/android/material/textfield/TextInputLayout;->setDefaultHintTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static final k(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-static {p3}, Lkotlin/text/c0;->t1(Ljava/lang/CharSequence;)Z

    move-result p3

    const/4 p4, 0x1

    if-ne p3, p4, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextColor(Landroid/content/res/ColorStateList;)V

    return-void

    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static final l(Lcom/google/android/material/textfield/TextInputLayout;Lkotlin/jvm/internal/c0;Landroid/view/View;Z)V
    .locals 0

    new-instance p2, Ljr/n;

    invoke-direct {p2, p1, p3}, Ljr/n;-><init>(Lkotlin/jvm/internal/c0;Z)V

    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static final m(Lkotlin/jvm/internal/c0;Z)V
    .locals 0

    iget-object p0, p0, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/functions/Function1;

    if-eqz p0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static final n(Lcom/google/android/material/textfield/TextInputLayout;IIIZ)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/text/c0;->t1(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p4, p1, p2, p3}, Ljr/d0;->i(Lcom/google/android/material/textfield/TextInputLayout;ZIII)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final o(Lcom/google/android/material/textfield/TextInputLayout;IIIILandroid/view/View;IIIIIIII)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    move-result-object p5

    if-eqz p5, :cond_0

    invoke-static {p5}, Lkotlin/text/c0;->t1(Ljava/lang/CharSequence;)Z

    move-result p5

    const/4 p6, 0x1

    if-ne p5, p6, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxBackgroundColor(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result p1

    invoke-static {p0, p1, p2, p3, p4}, Ljr/d0;->i(Lcom/google/android/material/textfield/TextInputLayout;ZIII)V

    return-void
.end method

.method public static final p(Lcom/google/android/material/textfield/TextInputLayout;ILandroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-static {p3}, Lkotlin/text/c0;->t1(Ljava/lang/CharSequence;)Z

    move-result p3

    const/4 p4, 0x1

    if-ne p3, p4, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1
    return-void
.end method
