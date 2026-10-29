.class public final Lcr/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;",
        "Lcr/y4;",
        "uiComponentHelper",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;",
        "config",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "b",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;)Lcom/google/android/material/textfield/TextInputLayout;",
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
.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;Lgr/l;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcr/t0;->c(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;Lgr/l;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;)Lcom/google/android/material/textfield/TextInputLayout;
    .locals 8
    .param p0    # Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcr/y4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;
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

    invoke-static {v0}, Lgr/l;->c(Landroid/view/LayoutInflater;)Lgr/l;

    move-result-object v3

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency$Attributes;

    move-result-object v0

    const-string v1, "USD"

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency$Attributes;->getLabel()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v4, v3, Lgr/l;->c:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v4, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency$Attributes;->getPlaceholder()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v4, v3, Lgr/l;->c:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v4, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    iget-object v2, v3, Lgr/l;->c:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v4, "inputLayout"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lwq/s;->a(Lcom/google/android/material/textfield/TextInputLayout;)V

    :cond_1
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency$Attributes;->getCurrencyCode()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    move-object v1, v0

    :cond_3
    :goto_0
    invoke-static {v1}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v4

    invoke-static {}, Ljava/text/NumberFormat;->getCurrencyInstance()Ljava/text/NumberFormat;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/text/NumberFormat;->setCurrency(Ljava/util/Currency;)V

    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v5

    new-instance v2, Lkotlin/jvm/internal/c0;

    invoke-direct {v2}, Lkotlin/jvm/internal/c0;-><init>()V

    iget-object v0, v3, Lgr/l;->b:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v0}, Lq/l;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    iput-object v0, v2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    new-instance v1, Lcr/t0$a;

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lcr/t0$a;-><init>(Lkotlin/jvm/internal/c0;Lgr/l;Ljava/util/Currency;Ljava/text/NumberFormat;Ljava/text/NumberFormat;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;)V

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;->m()Ljava/lang/Number;

    move-result-object p0

    if-eqz p0, :cond_5

    :try_start_0
    iget-object p0, v3, Lgr/l;->b:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;->m()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_5
    iget-object p0, v3, Lgr/l;->b:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    new-instance p0, Lcr/s0;

    invoke-direct {p0, p2, v3}, Lcr/s0;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;Lgr/l;)V

    invoke-virtual {p1, p0}, Lcr/y4;->d(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v3}, Lgr/l;->b()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p0

    const-string p1, "getRoot(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final c(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;Lgr/l;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_0

    iget-object p1, p1, Lgr/l;->c:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v0, "inputLayout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Ljr/d0;->k(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
