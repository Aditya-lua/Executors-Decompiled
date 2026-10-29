.class public final Ljr/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a1\u0010\u000c\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;",
        "styles",
        "",
        "k",
        "(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V",
        "",
        "hasFocus",
        "",
        "baseBackgroundColor",
        "focusedColor",
        "disabledColor",
        "i",
        "(Lcom/google/android/material/textfield/TextInputLayout;ZIII)V",
        "color",
        "j",
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
.method public static synthetic a(Lcom/google/android/material/textfield/TextInputLayout;ILandroid/content/res/ColorStateList;ILandroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p12}, Ljr/d0;->l(Lcom/google/android/material/textfield/TextInputLayout;ILandroid/content/res/ColorStateList;ILandroid/view/View;IIIIIIII)V

    return-void
.end method

.method public static synthetic b(Lcom/google/android/material/textfield/TextInputLayout;IIIILandroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p13}, Ljr/d0;->r(Lcom/google/android/material/textfield/TextInputLayout;IIIILandroid/view/View;IIIIIIII)V

    return-void
.end method

.method public static synthetic c(Lcom/google/android/material/textfield/TextInputLayout;Lkotlin/jvm/internal/c0;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljr/d0;->o(Lcom/google/android/material/textfield/TextInputLayout;Lkotlin/jvm/internal/c0;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic d(Lcom/google/android/material/textfield/TextInputLayout;Landroid/graphics/Typeface;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Ljr/d0;->s(Lcom/google/android/material/textfield/TextInputLayout;Landroid/graphics/Typeface;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p11}, Ljr/d0;->n(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method public static synthetic f(Lcom/google/android/material/textfield/TextInputLayout;IIIZ)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljr/d0;->q(Lcom/google/android/material/textfield/TextInputLayout;IIIZ)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p11}, Ljr/d0;->m(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method public static synthetic h(Lkotlin/jvm/internal/c0;Z)V
    .locals 0

    invoke-static {p0, p1}, Ljr/d0;->p(Lkotlin/jvm/internal/c0;Z)V

    return-void
.end method

.method public static final i(Lcom/google/android/material/textfield/TextInputLayout;ZIII)V
    .locals 1
    .param p0    # Lcom/google/android/material/textfield/TextInputLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxBackgroundColor(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, p2}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxBackgroundColor(I)V

    return-void

    :cond_1
    invoke-virtual {p0, p4}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxBackgroundColor(I)V

    return-void
.end method

.method public static final j(Lcom/google/android/material/textfield/TextInputLayout;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/EditText;->getTextCursorDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {}, Ljr/t;->a()V

    invoke-static {}, Ljr/u;->a()Landroid/graphics/BlendMode;

    move-result-object v0

    invoke-static {p1, v0}, Ljr/s;->a(ILandroid/graphics/BlendMode;)Landroid/graphics/BlendModeColorFilter;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_0
    return-void
.end method

.method public static final k(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V
    .locals 17
    .param p0    # Lcom/google/android/material/textfield/TextInputLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v1, p0

    const-string v0, "<this>"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "styles"

    move-object/from16 v6, p1

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getBaseBorderColorValue()Ljava/lang/Integer;

    move-result-object v0

    const v7, -0x101009e

    const v8, 0x101009c

    const v9, 0x10100a2

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getFocusedBorderColorValue()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getDisabledBorderColorValue()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    new-instance v4, Landroid/content/res/ColorStateList;

    filled-new-array {v9}, [I

    move-result-object v5

    filled-new-array {v8}, [I

    move-result-object v10

    filled-new-array {v7}, [I

    move-result-object v11

    filled-new-array {v5, v10, v11}, [[I

    move-result-object v5

    filled-new-array {v0, v2, v3}, [I

    move-result-object v2

    invoke-direct {v4, v5, v2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v1, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeColorStateList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getErrorBorderColorValue()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_2
    new-instance v2, Landroid/content/res/ColorStateList;

    filled-new-array {v9}, [I

    move-result-object v3

    filled-new-array {v8}, [I

    move-result-object v4

    filled-new-array {v7}, [I

    move-result-object v5

    filled-new-array {v3, v4, v5}, [[I

    move-result-object v3

    filled-new-array {v0, v0, v0}, [I

    move-result-object v0

    invoke-direct {v2, v3, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeErrorColor(Landroid/content/res/ColorStateList;)V

    :cond_3
    new-instance v10, Lkotlin/jvm/internal/c0;

    invoke-direct {v10}, Lkotlin/jvm/internal/c0;-><init>()V

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getBaseBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getFocusedBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v4, v0

    goto :goto_2

    :cond_4
    move v4, v3

    :goto_2
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getDisabledBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v5, v0

    goto :goto_3

    :cond_5
    move v5, v3

    :goto_3
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getErrorBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v2, v0

    goto :goto_4

    :cond_6
    move v2, v3

    :goto_4
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxBackgroundMode(I)V

    invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z

    move-result v0

    invoke-static {v1, v0, v3, v4, v5}, Ljr/d0;->i(Lcom/google/android/material/textfield/TextInputLayout;ZIII)V

    new-instance v0, Ljr/w;

    invoke-direct {v0, v1, v3, v4, v5}, Ljr/w;-><init>(Lcom/google/android/material/textfield/TextInputLayout;III)V

    iput-object v0, v10, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    new-instance v0, Ljr/x;

    invoke-direct/range {v0 .. v5}, Ljr/x;-><init>(Lcom/google/android/material/textfield/TextInputLayout;IIII)V

    invoke-virtual {v1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_7
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getBorderWidthValue()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljq/j;->a(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v0, v4

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeWidth(I)V

    invoke-static {v2, v3}, Ljq/j;->a(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeWidthFocused(I)V

    :cond_8
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getBorderRadiusValue()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljq/j;->a(D)D

    move-result-wide v4

    double-to-float v0, v4

    invoke-static {v2, v3}, Ljq/j;->a(D)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-static {v2, v3}, Ljq/j;->a(D)D

    move-result-wide v11

    double-to-float v5, v11

    invoke-static {v2, v3}, Ljq/j;->a(D)D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {v1, v0, v4, v5, v2}, Lcom/google/android/material/textfield/TextInputLayout;->a0(FFFF)V

    :cond_9
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getValueFontSizeValue()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_a

    double-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_a
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getValueLetterSpacingValue()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    move-result v0

    goto :goto_5

    :cond_b
    const/high16 v0, 0x41400000    # 12.0f

    :goto_5
    float-to-double v4, v0

    div-double/2addr v2, v4

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_c

    double-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setLetterSpacing(F)V

    :cond_c
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getBaseFontFamilyValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getValueFontWeightValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;

    move-result-object v3

    if-nez v3, :cond_d

    sget-object v3, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;->NORMAL:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;

    :cond_d
    new-instance v4, Ljr/y;

    invoke-direct {v4, v1}, Ljr/y;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-static {v0, v2, v3, v4}, Ljr/h0;->h(Landroid/widget/TextView;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;Lkotlin/jvm/functions/Function1;)V

    :cond_e
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    goto :goto_6

    :cond_f
    const/4 v0, 0x0

    :goto_6
    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v11

    if-eqz v11, :cond_11

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getValueFontFamilyValue()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getValueFontWeightValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;

    move-result-object v0

    if-nez v0, :cond_10

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;->NORMAL:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;

    :cond_10
    move-object v13, v0

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Ljr/h0;->i(Landroid/widget/TextView;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1c

    if-lt v0, v3, :cond_12

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getValueLineHeightValue()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-static {v3, v4}, Ljq/j;->a(D)D

    move-result-wide v3

    double-to-int v3, v3

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setLineHeight(I)V

    :cond_12
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getBaseTextColor()Ljava/lang/Integer;

    move-result-object v0

    const v3, -0x10100a2

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getValueFocusedTextColor()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_13

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_7

    :cond_13
    move v4, v0

    :goto_7
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getValueDisabledTextColor()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_14

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_8

    :cond_14
    move v5, v0

    :goto_8
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getValueErrorTextColor()Ljava/lang/Integer;

    move-result-object v11

    if-eqz v11, :cond_15

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    goto :goto_9

    :cond_15
    move v11, v0

    :goto_9
    new-instance v12, Landroid/content/res/ColorStateList;

    filled-new-array {v9}, [I

    move-result-object v13

    filled-new-array {v8}, [I

    move-result-object v14

    filled-new-array {v7}, [I

    move-result-object v15

    filled-new-array {v3}, [I

    move-result-object v2

    filled-new-array {v13, v14, v15, v2}, [[I

    move-result-object v2

    filled-new-array {v0, v4, v5, v0}, [I

    move-result-object v0

    invoke-direct {v12, v2, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_16
    invoke-static {v1, v4}, Ljr/d0;->j(Lcom/google/android/material/textfield/TextInputLayout;I)V

    new-instance v0, Ljr/z;

    invoke-direct {v0, v1, v11, v12, v4}, Ljr/z;-><init>(Lcom/google/android/material/textfield/TextInputLayout;ILandroid/content/res/ColorStateList;I)V

    invoke-virtual {v1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_17
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getErrorBaseTextColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getErrorErrorTextColor()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_18

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_a

    :cond_18
    move v2, v0

    :goto_a
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getErrorFocusedTextColor()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_19

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_b

    :cond_19
    move v4, v0

    :goto_b
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getErrorDisabledTextColor()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_1a

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_1a
    new-instance v5, Landroid/content/res/ColorStateList;

    filled-new-array {v9}, [I

    move-result-object v11

    filled-new-array {v8}, [I

    move-result-object v12

    filled-new-array {v7}, [I

    move-result-object v13

    filled-new-array {v3}, [I

    move-result-object v14

    filled-new-array {v11, v12, v13, v14}, [[I

    move-result-object v11

    filled-new-array {v2, v4, v0, v2}, [I

    move-result-object v0

    invoke-direct {v5, v11, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v1, v5}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1b
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getLabelBaseTextColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getLabelFocusedTextColor()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1c

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_c

    :cond_1c
    move v2, v0

    :goto_c
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getLabelDisabledTextColor()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_1d

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_d

    :cond_1d
    move v4, v0

    :goto_d
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getLabelErrorTextColor()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_1e

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_e

    :cond_1e
    move v5, v0

    :goto_e
    new-instance v11, Landroid/content/res/ColorStateList;

    filled-new-array {v9}, [I

    move-result-object v12

    filled-new-array {v8}, [I

    move-result-object v13

    filled-new-array {v7}, [I

    move-result-object v14

    filled-new-array {v3}, [I

    move-result-object v15

    filled-new-array {v12, v13, v14, v15}, [[I

    move-result-object v12

    filled-new-array {v0, v2, v4, v0}, [I

    move-result-object v0

    invoke-direct {v11, v12, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    new-instance v0, Landroid/content/res/ColorStateList;

    filled-new-array {v9}, [I

    move-result-object v2

    filled-new-array {v8}, [I

    move-result-object v4

    filled-new-array {v7}, [I

    move-result-object v12

    filled-new-array {v3}, [I

    move-result-object v13

    filled-new-array {v2, v4, v12, v13}, [[I

    move-result-object v2

    filled-new-array {v5, v5, v5, v5}, [I

    move-result-object v4

    invoke-direct {v0, v2, v4}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v1, v11}, Lcom/google/android/material/textfield/TextInputLayout;->setDefaultHintTextColor(Landroid/content/res/ColorStateList;)V

    new-instance v2, Ljr/a0;

    invoke-direct {v2, v1, v0, v11}, Ljr/a0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_1f
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    instance-of v2, v0, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    if-eqz v2, :cond_20

    move-object v2, v0

    check-cast v2, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    goto :goto_f

    :cond_20
    const/4 v2, 0x0

    :goto_f
    if-eqz v2, :cond_21

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getFocusedBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v4, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v2, v4}, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_21
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getInputTextBoxMargins()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;

    move-result-object v0

    if-eqz v0, :cond_22

    invoke-static {v1, v0}, Lmr/d;->c(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;)V

    :cond_22
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getPlaceholderBaseTextColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_26

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getPlaceholderFocusedTextColor()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_23

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_10

    :cond_23
    move v2, v0

    :goto_10
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getPlaceholderErrorTextColor()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_24

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_11

    :cond_24
    move v4, v0

    :goto_11
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getPlaceholderDisabledTextColor()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_25

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_12

    :cond_25
    move v5, v0

    :goto_12
    new-instance v11, Landroid/content/res/ColorStateList;

    filled-new-array {v9}, [I

    move-result-object v12

    filled-new-array {v8}, [I

    move-result-object v13

    filled-new-array {v7}, [I

    move-result-object v14

    filled-new-array {v3}, [I

    move-result-object v15

    filled-new-array {v12, v13, v14, v15}, [[I

    move-result-object v12

    filled-new-array {v0, v2, v5, v0}, [I

    move-result-object v0

    invoke-direct {v11, v12, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    new-instance v0, Landroid/content/res/ColorStateList;

    filled-new-array {v9}, [I

    move-result-object v2

    filled-new-array {v8}, [I

    move-result-object v5

    filled-new-array {v7}, [I

    move-result-object v12

    filled-new-array {v3}, [I

    move-result-object v13

    filled-new-array {v2, v5, v12, v13}, [[I

    move-result-object v2

    filled-new-array {v4, v4, v4, v4}, [I

    move-result-object v4

    invoke-direct {v0, v2, v4}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v1, v11}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextColor(Landroid/content/res/ColorStateList;)V

    new-instance v2, Ljr/b0;

    invoke-direct {v2, v1, v0, v11}, Ljr/b0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_26
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_27

    new-instance v2, Ljr/c0;

    invoke-direct {v2, v1, v10}, Ljr/c0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Lkotlin/jvm/internal/c0;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    :cond_27
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getBaseMaskToggleColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2a

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getFocusedMaskToggleColor()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_28

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_13

    :cond_28
    move v2, v0

    :goto_13
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getDisabledMaskToggleColor()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_29

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_14

    :cond_29
    move v4, v0

    :goto_14
    new-instance v5, Landroid/content/res/ColorStateList;

    filled-new-array {v9}, [I

    move-result-object v6

    filled-new-array {v8}, [I

    move-result-object v8

    filled-new-array {v7}, [I

    move-result-object v7

    filled-new-array {v3}, [I

    move-result-object v3

    filled-new-array {v6, v8, v7, v3}, [[I

    move-result-object v3

    filled-new-array {v0, v2, v4, v0}, [I

    move-result-object v0

    invoke-direct {v5, v3, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v1, v5}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconTintList(Landroid/content/res/ColorStateList;)V

    :cond_2a
    return-void
.end method

.method public static final l(Lcom/google/android/material/textfield/TextInputLayout;ILandroid/content/res/ColorStateList;ILandroid/view/View;IIIIIIII)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    move-result-object p4

    if-eqz p4, :cond_1

    invoke-static {p4}, Lkotlin/text/c0;->t1(Ljava/lang/CharSequence;)Z

    move-result p4

    const/4 p5, 0x1

    if-ne p4, p5, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    invoke-static {p0, p1}, Ljr/d0;->j(Lcom/google/android/material/textfield/TextInputLayout;I)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_2
    invoke-static {p0, p3}, Ljr/d0;->j(Lcom/google/android/material/textfield/TextInputLayout;I)V

    return-void
.end method

.method public static final m(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V
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

.method public static final n(Lcom/google/android/material/textfield/TextInputLayout;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/view/View;IIIIIIII)V
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

.method public static final o(Lcom/google/android/material/textfield/TextInputLayout;Lkotlin/jvm/internal/c0;Landroid/view/View;Z)V
    .locals 0

    new-instance p2, Ljr/v;

    invoke-direct {p2, p1, p3}, Ljr/v;-><init>(Lkotlin/jvm/internal/c0;Z)V

    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static final p(Lkotlin/jvm/internal/c0;Z)V
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

.method public static final q(Lcom/google/android/material/textfield/TextInputLayout;IIIZ)Lkotlin/Unit;
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

.method public static final r(Lcom/google/android/material/textfield/TextInputLayout;IIIILandroid/view/View;IIIIIIII)V
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

.method public static final s(Lcom/google/android/material/textfield/TextInputLayout;Landroid/graphics/Typeface;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setTypeface(Landroid/graphics/Typeface;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
