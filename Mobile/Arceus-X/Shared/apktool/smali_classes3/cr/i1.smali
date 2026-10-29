.class public final Lcr/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0019\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\n*\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;",
        "Lcr/y4;",
        "uiComponentHelper",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;",
        "config",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "h",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;)Lcom/google/android/material/textfield/TextInputLayout;",
        "Lcr/r3;",
        "newState",
        "",
        "d",
        "(Lcom/google/android/material/textfield/TextInputLayout;Lcr/r3;)V",
        "",
        "mask",
        "",
        "g",
        "(Ljava/lang/String;)Z",
        "Landroid/text/Editable;",
        "f",
        "(Landroid/text/Editable;Ljava/lang/String;)V",
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
.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;Lgr/v;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcr/i1;->i(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;Lgr/v;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcr/i1;->e(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic c(Landroid/text/Editable;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcr/i1;->f(Landroid/text/Editable;Ljava/lang/String;)V

    return-void
.end method

.method public static final d(Lcom/google/android/material/textfield/TextInputLayout;Lcr/r3;)V
    .locals 4
    .param p0    # Lcom/google/android/material/textfield/TextInputLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcr/r3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lar/d;->g0:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcr/r3;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lcr/r3;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p1}, Lcr/r3;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    invoke-virtual {p1}, Lcr/r3;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    :cond_3
    invoke-virtual {p1}, Lcr/r3;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    invoke-static {p0}, Lwq/s;->a(Lcom/google/android/material/textfield/TextInputLayout;)V

    :cond_4
    invoke-virtual {p1}, Lcr/r3;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcr/i1;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_5

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setRawInputType(I)V

    :cond_5
    invoke-virtual {p1}, Lcr/r3;->e()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lcr/r3;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    const/4 v1, -0x1

    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconMode(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lar/c;->c:I

    invoke-static {v1, v2}, Ll2/b;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lvp/g;->b0:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconContentDescription(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v2, Lcr/l4;

    invoke-direct {v2, v0}, Lcr/l4;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    :cond_6
    new-instance v1, Lcr/h1;

    invoke-direct {v1, p0, v0}, Lcr/h1;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    sget v0, Lar/d;->r0:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcr/s3;

    if-eqz v2, :cond_8

    move-object v3, v1

    check-cast v3, Lcr/s3;

    :cond_8
    if-eqz v3, :cond_9

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_9
    invoke-virtual {p1}, Lcr/r3;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-static {v1}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_1

    :cond_a
    new-instance v1, Lcr/s3;

    invoke-virtual {p1}, Lcr/r3;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcr/s3;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_b
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_c
    :goto_1
    return-void
.end method

.method public static final e(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    if-eqz v1, :cond_3

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    new-instance v0, Lcr/l4;

    invoke-direct {v0, p1}, Lcr/l4;-><init>(Ljava/lang/String;)V

    :goto_2
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p2, :cond_4

    sget p2, Lar/c;->b:I

    goto :goto_3

    :cond_4
    sget p2, Lar/c;->c:I

    :goto_3
    invoke-static {p1, p2}, Ll2/b;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static final f(Landroid/text/Editable;Ljava/lang/String;)V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v2, v4, :cond_3

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    sget-object v5, Lcr/q3;->a:Lcr/q3$d;

    invoke-virtual {v5, v4}, Lcr/q3$d;->a(C)Lcr/q3;

    move-result-object v5

    :goto_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ge v3, v6, :cond_2

    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-virtual {v5, v6}, Lcr/q3;->a(C)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_0
    instance-of v6, v5, Lcr/q3$e;

    if-eqz v6, :cond_1

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-interface {p0, v1, p1, v0}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    return-void
.end method

.method public static final g(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    invoke-static {p0}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    move v1, v0

    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    sget-object v3, Lcr/q3;->a:Lcr/q3$d;

    invoke-virtual {v3, v2}, Lcr/q3$d;->a(C)Lcr/q3;

    move-result-object v2

    instance-of v3, v2, Lcr/q3$b;

    if-nez v3, :cond_1

    instance-of v2, v2, Lcr/q3$e;

    if-eqz v2, :cond_3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v0
.end method

.method public static final h(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;)Lcom/google/android/material/textfield/TextInputLayout;
    .locals 11
    .param p0    # Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcr/y4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;
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

    invoke-static {v0}, Lgr/v;->c(Landroid/view/LayoutInflater;)Lgr/v;

    move-result-object v0

    invoke-virtual {v0}, Lgr/v;->b()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v1

    const-string v2, "getRoot(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcr/r3;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText$Attributes;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText$Attributes;->getPrefill()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText$Attributes;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText$Attributes;->getMask()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object v6, v5

    :goto_1
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText$Attributes;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText$Attributes;->getSecure()Ljava/lang/Boolean;

    move-result-object v7

    goto :goto_2

    :cond_2
    move-object v7, v5

    :goto_2
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText$Attributes;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText$Attributes;->getLabel()Ljava/lang/String;

    move-result-object v8

    goto :goto_3

    :cond_3
    move-object v8, v5

    :goto_3
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText$Attributes;

    move-result-object v9

    if-eqz v9, :cond_4

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText$Attributes;->getPlaceholder()Ljava/lang/String;

    move-result-object v5

    :cond_4
    move-object v10, v8

    move-object v8, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v10

    invoke-direct/range {v3 .. v8}, Lcr/r3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lcr/i1;->d(Lcom/google/android/material/textfield/TextInputLayout;Lcr/r3;)V

    invoke-virtual {v0}, Lgr/v;->b()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;->f()Lan/r;

    move-result-object p0

    invoke-static {p0, v1}, Lan/s;->b(Lan/r;Landroid/widget/EditText;)V

    :cond_5
    new-instance p0, Lcr/g1;

    invoke-direct {p0, p2, v0}, Lcr/g1;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;Lgr/v;)V

    invoke-virtual {p1, p0}, Lcr/y4;->d(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0}, Lgr/v;->b()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final i(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;Lgr/v;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lgr/v;->b()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Ljr/d0;->k(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
