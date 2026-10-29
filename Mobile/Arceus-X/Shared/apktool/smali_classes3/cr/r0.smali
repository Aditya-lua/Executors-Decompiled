.class public final Lcr/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\'\u0010\r\u001a\u00020\u000b2\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\u000b2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\u000b*\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\'\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00112\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;",
        "Lcr/y4;",
        "uiComponentHelper",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;",
        "config",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "f",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;)Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Landroid/widget/EditText;",
        "editText",
        "Lkotlin/Function0;",
        "",
        "moveToPreviousEditText",
        "l",
        "(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V",
        "n",
        "(Landroid/widget/EditText;)V",
        "",
        "originalString",
        "k",
        "(Landroid/widget/EditText;Ljava/lang/String;)V",
        "code",
        "",
        "editTexts",
        "j",
        "(Ljava/lang/String;Ljava/util/List;)V",
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
.method public static synthetic a(Landroid/widget/EditText;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcr/r0;->o(Landroid/widget/EditText;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;Lgr/c;Ljava/util/List;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcr/r0;->g(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;Lgr/c;Ljava/util/List;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lgr/c;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcr/r0;->i(Lgr/c;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcr/r0;->m(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Landroid/widget/EditText;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcr/r0;->h(Landroid/widget/EditText;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;Lcr/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;)Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 9
    .param p0    # Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcr/y4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;
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

    invoke-static {v0}, Lgr/c;->c(Landroid/view/LayoutInflater;)Lgr/c;

    move-result-object v3

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;->f()Lan/r;

    move-result-object v0

    invoke-interface {v0}, Lan/r;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, v3, Lgr/c;->b:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    iget-object v2, v3, Lgr/c;->e:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v2

    iget-object v4, v3, Lgr/c;->g:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v4}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v4

    iget-object v5, v3, Lgr/c;->d:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v5}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v5

    filled-new-array {v1, v2, v4, v5}, [Landroid/widget/EditText;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    move-object v1, v4

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->S0(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/collections/IndexedValue;

    invoke-virtual {v1}, Lkotlin/collections/IndexedValue;->a()I

    move-result v2

    invoke-virtual {v1}, Lkotlin/collections/IndexedValue;->b()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/EditText;

    add-int/lit8 v1, v2, -0x1

    invoke-static {v4, v1}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/EditText;

    add-int/lit8 v1, v2, 0x1

    invoke-static {v4, v1}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/EditText;

    invoke-static {v0, v2}, Lkotlin/text/c0;->x1(Ljava/lang/CharSequence;I)Ljava/lang/Character;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v1

    if-eqz v5, :cond_0

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    if-eqz v5, :cond_1

    new-instance v1, Lcr/m0;

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lcr/m0;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;Lgr/c;Ljava/util/List;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V

    invoke-static {v5, v1}, Ljq/h0;->b(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1

    :cond_1
    move-object v2, p0

    :goto_1
    if-eqz v6, :cond_2

    new-instance p0, Lcr/n0;

    invoke-direct {p0, v6}, Lcr/n0;-><init>(Landroid/widget/EditText;)V

    invoke-static {v5, p0}, Lcr/r0;->l(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V

    :cond_2
    invoke-static {v5}, Lcr/r0;->n(Landroid/widget/EditText;)V

    move-object p0, v2

    goto :goto_0

    :cond_3
    new-instance p0, Lcr/o0;

    invoke-direct {p0, v3, p2}, Lcr/o0;-><init>(Lgr/c;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;)V

    invoke-virtual {p1, p0}, Lcr/y4;->d(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v3}, Lgr/c;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p0

    const-string p1, "getRoot(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final g(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;Lgr/c;Ljava/util/List;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Ljava/lang/String;)Lkotlin/Unit;
    .locals 4

    const-string v0, "newText"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;->f()Lan/r;

    move-result-object v0

    sget-object v1, Lfr/a;->a:Lfr/a;

    invoke-virtual {p1}, Lgr/c;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    const-string v3, "getRoot(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lfr/a;->a(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lan/r;->c(Ljava/lang/String;)V

    invoke-virtual {p6}, Ljava/lang/String;->length()I

    move-result v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    invoke-static {p6, p2}, Lcr/r0;->j(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p6}, Ljava/lang/String;->length()I

    move-result p2

    const/4 v0, 0x1

    if-le p2, v0, :cond_1

    invoke-static {p3, p6}, Lcr/r0;->k(Landroid/widget/EditText;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {p6}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    if-eqz p4, :cond_2

    invoke-virtual {p4}, Landroid/view/View;->requestFocus()Z

    invoke-virtual {p4}, Landroid/widget/TextView;->length()I

    move-result p0

    invoke-virtual {p4, p0}, Landroid/widget/EditText;->setSelection(I)V

    goto :goto_0

    :cond_2
    invoke-static {p6}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_3

    if-eqz p5, :cond_3

    invoke-virtual {p5}, Landroid/view/View;->requestFocus()Z

    goto :goto_0

    :cond_3
    invoke-static {p6}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_5

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;->k()Lfr/c;

    move-result-object p0

    invoke-virtual {p0}, Lfr/c;->b()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    iget-object p0, p1, Lgr/c;->d:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-static {p0}, Ljq/g;->d(Landroid/content/Context;)V

    :cond_4
    iget-object p0, p1, Lgr/c;->d:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->clearFocus()V

    :cond_5
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final h(Landroid/widget/EditText;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    invoke-virtual {p0}, Landroid/widget/TextView;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setSelection(I)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final i(Lgr/c;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lgr/c;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p0

    const-string v0, "getRoot(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/core/view/u0;->a(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;

    move-result-object p0

    sget-object v0, Lcr/r0$a;->a:Lcr/r0$a;

    invoke-static {p0, v0}, Liu/p;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0, v1}, Ljr/d0;->k(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V

    goto :goto_0

    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j(Ljava/lang/String;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Landroid/widget/EditText;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v2, v3

    add-int/2addr v2, v1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    if-eqz v3, :cond_0

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final k(Landroid/widget/EditText;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionStart()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lkotlin/text/c0;->w1(Ljava/lang/CharSequence;)C

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    invoke-static {p1}, Lkotlin/text/c0;->y1(Ljava/lang/CharSequence;)C

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static final l(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/EditText;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    new-instance v0, Lcr/q0;

    invoke-direct {v0, p0, p1}, Lcr/q0;-><init>(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    :cond_0
    return-void
.end method

.method public static final m(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/16 p2, 0x43

    if-ne p3, p2, :cond_0

    invoke-virtual {p4}, Landroid/view/KeyEvent;->getAction()I

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    const-string p2, "getText(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-nez p0, :cond_0

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final n(Landroid/widget/EditText;)V
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lcr/p0;

    invoke-direct {v0, p0}, Lcr/p0;-><init>(Landroid/widget/EditText;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    :cond_0
    return-void
.end method

.method public static final o(Landroid/widget/EditText;Landroid/view/View;Z)V
    .locals 0

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setSelection(I)V

    :cond_1
    return-void
.end method
