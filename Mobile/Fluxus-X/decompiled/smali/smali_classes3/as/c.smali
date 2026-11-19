.class public final Las/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001b\u0010\u0008\u001a\u00020\u0007*\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a#\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;",
        "",
        "url",
        "i",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "leadingImageUrl",
        "",
        "h",
        "(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)V",
        "c",
        "(Lcom/google/android/material/textfield/TextInputLayout;)V",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "container",
        "",
        "centerVertical",
        "Landroid/view/View;",
        "e",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Landroidx/constraintlayout/widget/ConstraintLayout;Z)Landroid/view/View;",
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
.method public static synthetic a(Lcom/google/android/material/textfield/TextInputLayout;)Z
    .locals 0

    invoke-static {p0}, Las/c;->d(Lcom/google/android/material/textfield/TextInputLayout;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lqr/z5;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Las/c;->g(Lqr/z5;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 2

    sget v0, Lor/f;->p0:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget v0, Lor/f;->p0:I

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Las/b;

    invoke-direct {v1, p0}, Las/b;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void
.end method

.method public static final d(Lcom/google/android/material/textfield/TextInputLayout;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getStartIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->T()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setStartIconVisible(Z)V

    const/4 p0, 0x0

    return p0

    :cond_0
    return v1
.end method

.method public static final e(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Landroidx/constraintlayout/widget/ConstraintLayout;Z)Landroid/view/View;
    .locals 3
    .param p0    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/constraintlayout/widget/ConstraintLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqr/z5;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lqr/z5;-><init>(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/g;->k(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)Lqr/t4;

    move-result-object v1

    invoke-static {v1, v0, p0}, Lqr/d5;->n(Lqr/t4;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)Landroid/view/View;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    const/4 v2, 0x0

    iput v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->i:I

    iput v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->t:I

    iput v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->v:I

    if-eqz p2, :cond_0

    iput v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->l:I

    :cond_0
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p2, Las/a;

    invoke-direct {p2, v0}, Las/a;-><init>(Lqr/z5;)V

    invoke-static {p1, p2}, Lkr/a0;->b(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Landroidx/constraintlayout/widget/ConstraintLayout;ZILjava/lang/Object;)Landroid/view/View;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Las/c;->e(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Landroidx/constraintlayout/widget/ConstraintLayout;Z)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lqr/z5;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lqr/z5;->c()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final h(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)V
    .locals 9
    .param p0    # Lcom/google/android/material/textfield/TextInputLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    sget v1, Lor/f;->q0:I

    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    sget v1, Lor/f;->q0:I

    invoke-virtual {p0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget v1, Lor/f;->o0:I

    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ly6/d;

    if-eqz v2, :cond_2

    check-cast v1, Ly6/d;

    goto :goto_1

    :cond_2
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_3

    invoke-interface {v1}, Ly6/d;->a()V

    :cond_3
    sget v1, Lor/f;->o0:I

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setStartIconVisible(Z)V

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setStartIconDrawable(Landroid/graphics/drawable/Drawable;)V

    if-nez p1, :cond_4

    :goto_2
    return-void

    :cond_4
    invoke-static {p0}, Las/c;->c(Lcom/google/android/material/textfield/TextInputLayout;)V

    new-instance v0, Ll6/s$a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ll6/s$a;-><init>(Landroid/content/Context;)V

    new-instance v1, Ll6/h$a;

    invoke-direct {v1}, Ll6/h$a;-><init>()V

    new-instance v3, La7/g$b;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, La7/g$b;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v3}, Ll6/h$a;->g(Ln6/i$a;)Ll6/h$a;

    invoke-virtual {v1}, Ll6/h$a;->p()Ll6/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll6/s$a;->h(Ll6/h;)Ll6/s$a;

    move-result-object v0

    invoke-virtual {v0}, Ll6/s$a;->d()Ll6/s;

    move-result-object v0

    new-instance v1, Ly6/g$a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v3}, Ly6/g$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p1}, Ly6/g$a;->c(Ljava/lang/Object;)Ly6/g$a;

    move-result-object v1

    new-instance v2, Las/c$a;

    invoke-direct {v2, p0, p1, p0, p1}, Las/c$a;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ly6/g$a;->v(Lc7/c;)Ly6/g$a;

    move-result-object p1

    invoke-virtual {p1}, Ly6/g$a;->b()Ly6/g;

    move-result-object p1

    sget v1, Lor/f;->o0:I

    invoke-interface {v0, p1}, Ll6/s;->d(Ly6/g;)Ly6/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public static final i(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;
    .locals 11
    .param p0    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;->getLocalAssetName()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;->getLocalAssetContentType()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object v6, v4

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;->getWidth()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_2
    move-object v7, v4

    :goto_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;->getHeight()Ljava/lang/String;

    move-result-object v8

    goto :goto_3

    :cond_3
    move-object v8, v4

    :goto_3
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;->getContentType()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;

    move-result-object v9

    if-nez v9, :cond_5

    :cond_4
    sget-object v9, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;->Image:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;

    :cond_5
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;->getHidden()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;

    move-result-object v4

    :cond_6
    move-object v10, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, p1

    invoke-direct/range {v3 .. v10}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;

    move-result-object p0

    invoke-direct {v1, v2, v3, p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;)V

    return-object v1
.end method
