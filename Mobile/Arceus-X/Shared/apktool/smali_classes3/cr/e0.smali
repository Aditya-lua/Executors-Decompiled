.class public final Lcr/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;",
        "Lcr/y4;",
        "uiComponentHelper",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;",
        "config",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "g",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Landroidx/constraintlayout/widget/ConstraintLayout;",
        "other",
        "f",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;",
        "",
        "e",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Z",
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
.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;Lgr/d;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcr/e0;->i(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;Lgr/d;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcr/e0;->h(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic c(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Z
    .locals 0

    invoke-static {p0}, Lcr/e0;->e(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic d(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;
    .locals 0

    invoke-static {p0, p1}, Lcr/e0;->f(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getPrefillAddressStreet1()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getPrefillAddressStreet2()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-static {v0}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_3
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getPrefillAddressCity()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_4
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_5

    invoke-static {v0}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_5
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getPrefillAddressPostalCode()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_6
    move-object v0, v1

    :goto_3
    if-eqz v0, :cond_7

    invoke-static {v0}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_7
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;

    move-result-object p0

    if-eqz p0, :cond_8

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getPrefillAddressSubdivision()Ljava/lang/String;

    move-result-object v1

    :cond_8
    if-eqz v1, :cond_a

    invoke-static {v1}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_9

    goto :goto_4

    :cond_9
    const/4 p0, 0x0

    return p0

    :cond_a
    :goto_4
    const/4 p0, 0x1

    return p0
.end method

.method public static final f(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;
    .locals 1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->r()Ler/p;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->L(Ler/p;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->m()Lan/r;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->P(Lan/r;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->n()Lan/r;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->Q(Lan/r;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->a()Lan/r;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->N(Lan/r;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->g()Lan/r;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->R(Lan/r;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->f()Lan/r;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->O(Lan/r;)V

    return-object p0
.end method

.method public static final g(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 5
    .param p0    # Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcr/y4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;
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

    invoke-static {v0}, Lgr/d;->c(Landroid/view/LayoutInflater;)Lgr/d;

    move-result-object v0

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->m()Lan/r;

    move-result-object v2

    iget-object v3, v0, Lgr/d;->d:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lan/s;->b(Lan/r;Landroid/widget/EditText;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->m()Lan/r;

    move-result-object v2

    iget-object v3, v0, Lgr/d;->f:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lan/s;->b(Lan/r;Landroid/widget/EditText;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->n()Lan/r;

    move-result-object v2

    iget-object v3, v0, Lgr/d;->n:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lan/s;->b(Lan/r;Landroid/widget/EditText;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->a()Lan/r;

    move-result-object v2

    iget-object v3, v0, Lgr/d;->b:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lan/s;->b(Lan/r;Landroid/widget/EditText;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->g()Lan/r;

    move-result-object v2

    iget-object v3, v0, Lgr/d;->m:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lan/s;->b(Lan/r;Landroid/widget/EditText;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->f()Lan/r;

    move-result-object v2

    iget-object v3, v0, Lgr/d;->l:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lan/s;->b(Lan/r;Landroid/widget/EditText;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getPlaceholderAutocomplete()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v3, v0, Lgr/d;->d:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getPlaceholderAddressStreet1()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v3, v0, Lgr/d;->f:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    :cond_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getPlaceholderAddressStreet2()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v3, v0, Lgr/d;->n:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    :cond_2
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getPlaceholderAddressCity()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v3, v0, Lgr/d;->b:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    :cond_3
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getSelectedCountryCode()Ljava/lang/String;

    move-result-object v2

    const-string v3, "US"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, Lgr/d;->m:Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getPlaceholderAddressSubdivisionUs()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getPlaceholderAddressSubdivision()Ljava/lang/String;

    move-result-object v4

    :goto_0
    invoke-virtual {v3, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    iget-object v3, v0, Lgr/d;->l:Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getPlaceholderAddressPostalCodeUs()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_5
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getPlaceholderAddressPostalCode()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v3, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getLabel()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    iget-object v3, v0, Lgr/d;->k:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;->getEditAddressManuallyPrompt()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    iget-object v2, v0, Lgr/d;->c:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    invoke-virtual {v0}, Lgr/d;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    new-instance v1, Lcr/c0;

    invoke-direct {v1, p2, v0}, Lcr/c0;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;Lgr/d;)V

    invoke-virtual {p1, v1}, Lcr/y4;->d(Lkotlin/jvm/functions/Function0;)V

    iget-object p1, v0, Lgr/d;->c:Landroid/widget/TextView;

    new-instance p2, Lcr/d0;

    invoke-direct {p2, p0}, Lcr/d0;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0}, Lgr/d;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lgr/d;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p0

    const-string p1, "getRoot(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final h(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Landroid/view/View;)V
    .locals 0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->K(Ljava/lang/Boolean;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->r()Ler/p;

    move-result-object p1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->J()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {p1, p0}, Ler/p;->c(Z)V

    return-void
.end method

.method public static final i(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;Lgr/d;)Lkotlin/Unit;
    .locals 5

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$AddressComponentStyle;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$AddressComponentStyle;->getExpandComponentsButtonStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v3, p1, Lgr/d;->c:Landroid/widget/TextView;

    const-string v4, "addressExpandComponentsButton"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v0, v2, v1, v2}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$AddressComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$AddressComponentStyle;->getInputTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_1

    iget-object v0, p1, Lgr/d;->k:Landroid/widget/TextView;

    const-string v3, "addressLabel"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getLabelTextBasedStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v3

    invoke-static {v0, v3, v2, v1, v2}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    iget-object v0, p1, Lgr/d;->d:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v1, "addressFieldCollapsed"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Ljr/d0;->k(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V

    iget-object v0, p1, Lgr/d;->f:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v1, "addressFieldExpanded"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Ljr/d0;->k(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V

    iget-object v0, p1, Lgr/d;->n:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v1, "addressSuite"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Ljr/d0;->k(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V

    iget-object v0, p1, Lgr/d;->b:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v1, "addressCity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Ljr/d0;->k(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V

    iget-object v0, p1, Lgr/d;->m:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v1, "addressSubdivision"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Ljr/d0;->k(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V

    iget-object p1, p1, Lgr/d;->l:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v0, "addressPostalCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Ljr/d0;->k(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
