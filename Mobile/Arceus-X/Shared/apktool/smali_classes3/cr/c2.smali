.class public final Lcr/c2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcr/c2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a+\u0010\u0008\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;",
        "Lcr/y4;",
        "uiComponentHelper",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;",
        "config",
        "Lan/r;",
        "textController",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "b",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;Lan/r;)Lcom/google/android/material/textfield/TextInputLayout;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;",
        "",
        "e",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;)I",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;",
        "",
        "f",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;)Ljava/lang/String;",
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
.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;Lgr/p;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcr/c2;->d(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;Lgr/p;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;Lan/r;)Lcom/google/android/material/textfield/TextInputLayout;
    .locals 2
    .param p0    # Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcr/y4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lan/r;
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

    const-string p0, "textController"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcr/y4;->b()Landroid/view/LayoutInflater;

    move-result-object p0

    invoke-static {p0}, Lgr/p;->c(Landroid/view/LayoutInflater;)Lgr/p;

    move-result-object p0

    iget-object v0, p0, Lgr/p;->b:Lcom/google/android/material/textfield/TextInputEditText;

    const-string v1, "editText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lan/s;->b(Lan/r;Landroid/widget/EditText;)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$Attributes;

    move-result-object p3

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$Attributes;->getLabel()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lgr/p;->c:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$Attributes;->getPlaceholder()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lgr/p;->c:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lgr/p;->c:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v1, "inputLayout"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lwq/s;->a(Lcom/google/android/material/textfield/TextInputLayout;)V

    :cond_1
    iget-object v0, p0, Lgr/p;->b:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$Attributes;->getInputType()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;

    move-result-object v1

    invoke-static {v1}, Lcr/c2;->e(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setInputType(I)V

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$Attributes;->getAutofillHint()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-static {p3}, Lcr/c2;->f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_2
    const/4 p3, 0x0

    :goto_0
    iget-object v0, p0, Lgr/p;->c:Lcom/google/android/material/textfield/TextInputLayout;

    filled-new-array {p3}, [Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/view/View;->setAutofillHints([Ljava/lang/String;)V

    :cond_3
    new-instance p3, Lcr/b2;

    invoke-direct {p3, p2, p0}, Lcr/b2;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;Lgr/p;)V

    invoke-virtual {p1, p3}, Lcr/y4;->d(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0}, Lgr/p;->b()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p0

    const-string p1, "getRoot(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic c(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;Lan/r;ILjava/lang/Object;)Lcom/google/android/material/textfield/TextInputLayout;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;->f()Lan/r;

    move-result-object p3

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcr/c2;->b(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;Lan/r;)Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;Lgr/p;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object p0

    if-eqz p0, :cond_0

    iget-object p1, p1, Lgr/p;->c:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v0, "inputLayout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Ljr/d0;->k(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final e(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;)I
    .locals 2

    sget-object v0, Lcr/c2$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v1, 0x3

    if-ne p0, v1, :cond_0

    return v0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    const/16 p0, 0x20

    return p0

    :cond_2
    return v0
.end method

.method public static final f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lcr/c2$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :pswitch_0
    const-string p0, "postalCode"

    return-object p0

    :pswitch_1
    const-string p0, "addressCountry"

    return-object p0

    :pswitch_2
    const-string p0, "addressLocality"

    return-object p0

    :pswitch_3
    const-string p0, "extendedAddress"

    return-object p0

    :pswitch_4
    const-string p0, "streetAddress"

    return-object p0

    :pswitch_5
    const-string p0, "emailAddress"

    return-object p0

    :pswitch_6
    const-string p0, "personFamilyName"

    return-object p0

    :pswitch_7
    const-string p0, "personMiddleName"

    return-object p0

    :pswitch_8
    const-string p0, "personGivenName"

    return-object p0

    :pswitch_9
    const-string p0, "personName"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
