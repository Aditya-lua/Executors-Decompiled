.class public final Lqr/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001b\u0010\u000c\u001a\u00020\u000b*\u00020\u00082\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;",
        "Lqr/z5;",
        "uiComponentHelper",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;",
        "config",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "c",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;)Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Lur/w;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;",
        "styles",
        "",
        "b",
        "(Lur/w;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;)V",
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
.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Lur/w;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lqr/y;->d(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Lur/w;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lur/w;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;)V
    .locals 4

    iget-object v0, p0, Lur/w;->b:Landroid/widget/TextView;

    const-string v1, "addSignatureLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;->getInputTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getPlaceholderTextBasedStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lyr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;->getSignaturePreviewBackgroundColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lur/w;->f:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v1, v0}, Lcom/google/android/material/card/MaterialCardView;->setCardBackgroundColor(I)V

    :cond_0
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;->getFillColorValue()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lur/w;->c:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    :cond_1
    iget-object v0, p0, Lur/w;->d:Landroid/widget/TextView;

    const-string v1, "errorLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;->getInputTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getErrorTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v1

    invoke-static {v0, v1, v2, v3, v2}, Lyr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    iget-object v0, p0, Lur/w;->e:Landroid/widget/TextView;

    const-string v1, "label"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;->getInputTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getLabelTextBasedStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v1

    invoke-static {v0, v1, v2, v3, v2}, Lyr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;->getMargins()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lur/w;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string v2, "getRoot(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, Lbs/d;->c(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;)V

    :cond_2
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;->getInputTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getBaseBorderColorValue()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lur/w;->f:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v1, v0}, Lcom/google/android/material/card/MaterialCardView;->setStrokeColor(I)V

    :cond_3
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;->getInputTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getBorderWidthValue()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lxq/j;->a(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    iget-object v1, p0, Lur/w;->f:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v1, v0}, Lcom/google/android/material/card/MaterialCardView;->setStrokeWidth(I)V

    :cond_4
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;->getInputTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getBorderRadiusValue()Ljava/lang/Double;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lxq/j;->a(D)D

    move-result-wide v0

    double-to-float p1, v0

    iget-object p0, p0, Lur/w;->f:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {p0, p1}, Lcom/google/android/material/card/MaterialCardView;->setRadius(F)V

    :cond_5
    return-void
.end method

.method public static final c(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;)Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 2
    .param p0    # Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lqr/z5;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;
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

    invoke-virtual {p1}, Lqr/z5;->b()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Lur/w;->c(Landroid/view/LayoutInflater;)Lur/w;

    move-result-object v0

    new-instance v1, Lqr/x;

    invoke-direct {v1, p2, v0, p0}, Lqr/x;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Lur/w;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;)V

    invoke-virtual {p1, v1}, Lqr/z5;->d(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0}, Lur/w;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lur/w;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p0

    const-string p1, "getRoot(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final d(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Lur/w;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;)Lkotlin/Unit;
    .locals 5

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$Attributes;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$Attributes;->getPrefill()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ll6/s$a;

    iget-object v2, p1, Lur/w;->g:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ll6/s$a;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ly6/i;->b(Ll6/s$a;Z)Ll6/s$a;

    move-result-object v1

    const/16 v2, 0x64

    invoke-static {v1, v2}, Ly6/j;->c(Ll6/s$a;I)Ll6/s$a;

    move-result-object v1

    invoke-virtual {v1}, Ll6/s$a;->d()Ll6/s;

    move-result-object v1

    new-instance v2, Ly6/g$a;

    iget-object v4, p1, Lur/w;->g:Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v4}, Ly6/g$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v0}, Ly6/g$a;->c(Ljava/lang/Object;)Ly6/g$a;

    move-result-object v0

    new-instance v2, Lqr/y$a;

    invoke-direct {v2, p1, p1, p2, p1}, Lqr/y$a;-><init>(Lur/w;Lur/w;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;Lur/w;)V

    invoke-virtual {v0, v2}, Ly6/g$a;->v(Lc7/c;)Ly6/g$a;

    move-result-object p2

    invoke-virtual {p2}, Ly6/g$a;->b()Ly6/g;

    move-result-object p2

    invoke-interface {v1, p2}, Ll6/s;->d(Ly6/g;)Ly6/d;

    :cond_0
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1, p0}, Lqr/y;->b(Lur/w;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
