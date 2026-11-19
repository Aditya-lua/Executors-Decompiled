.class public final Lqr/w1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/d;",
        "Lqr/z5;",
        "uiComponentHelper",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;",
        "config",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "b",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/d;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;)Lcom/google/android/material/textfield/TextInputLayout;",
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
.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;Lur/s;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lqr/w1;->c(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;Lur/s;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/withpersona/sdk2/inquiry/steps/ui/components/d;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;)Lcom/google/android/material/textfield/TextInputLayout;
    .locals 4
    .param p0    # Lcom/withpersona/sdk2/inquiry/steps/ui/components/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lqr/z5;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "uiComponentHelper"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "config"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lqr/z5;->b()Landroid/view/LayoutInflater;

    move-result-object p0

    invoke-static {p0}, Lur/s;->c(Landroid/view/LayoutInflater;)Lur/s;

    move-result-object p0

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect$Attributes;

    move-result-object v0

    const-string v1, "getRoot(...)"

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect$Attributes;->getPlaceholder()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lur/s;->b()Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;

    move-result-object v2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect$Attributes;->getPlaceholder()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lur/s;->b()Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setExpandedHintEnabled(Z)V

    invoke-virtual {p0}, Lur/s;->b()Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkr/t;->a(Lcom/google/android/material/textfield/TextInputLayout;)V

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect$Attributes;->getLabel()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lur/s;->b()Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    :cond_2
    new-instance v0, Lqr/v1;

    invoke-direct {v0, p2, p0}, Lqr/v1;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;Lur/s;)V

    invoke-virtual {p1, v0}, Lqr/z5;->d(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0}, Lur/s;->b()Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final c(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;Lur/s;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMultiSelect;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_0

    iget-object p1, p1, Lur/s;->b:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaTextInputLayout;

    const-string v0, "listSelector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lyr/o;->i(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
