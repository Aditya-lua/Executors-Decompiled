.class public final Lqr/m2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;",
        "Lqr/z5;",
        "uiComponentHelper",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;",
        "config",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "b",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;)Lcom/google/android/material/textfield/TextInputLayout;",
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
.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;Lur/o;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lqr/m2;->c(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;Lur/o;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;)Lcom/google/android/material/textfield/TextInputLayout;
    .locals 4
    .param p0    # Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lqr/z5;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;
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

    invoke-static {v0}, Lur/o;->c(Landroid/view/LayoutInflater;)Lur/o;

    move-result-object v0

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea$Attributes;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;->f()Lnn/s;

    move-result-object p0

    iget-object v2, v0, Lur/o;->b:Lcom/google/android/material/textfield/TextInputEditText;

    const-string v3, "editText"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v2}, Lnn/t;->b(Lnn/s;Landroid/widget/EditText;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea$Attributes;->getLabel()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    iget-object v2, v0, Lur/o;->c:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v2, p0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea$Attributes;->getPlaceholder()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    iget-object v2, v0, Lur/o;->c:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v2, p0}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    iget-object p0, v0, Lur/o;->c:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v2, "inputLayout"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkr/t;->a(Lcom/google/android/material/textfield/TextInputLayout;)V

    :cond_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea$Attributes;->getRows()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    iget-object v1, v0, Lur/o;->b:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setMaxLines(I)V

    iget-object v1, v0, Lur/o;->b:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setMinLines(I)V

    iget-object p0, v0, Lur/o;->b:Lcom/google/android/material/textfield/TextInputEditText;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    :cond_2
    new-instance p0, Lqr/l2;

    invoke-direct {p0, p2, v0}, Lqr/l2;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;Lur/o;)V

    invoke-virtual {p1, p0}, Lqr/z5;->d(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0}, Lur/o;->b()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p0

    const-string p1, "getRoot(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final c(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;Lur/o;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputTextArea;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_0

    iget-object p1, p1, Lur/o;->c:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v0, "inputLayout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lyr/d0;->k(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
