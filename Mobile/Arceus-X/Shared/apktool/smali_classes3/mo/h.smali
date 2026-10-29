.class public final Lmo/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmo/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J)\u0010\r\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001bR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lmo/h;",
        "",
        "Landroid/view/ViewGroup;",
        "contentView",
        "<init>",
        "(Landroid/view/ViewGroup;)V",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;",
        "styles",
        "Lmo/a;",
        "viewModel",
        "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;",
        "assetConfig",
        "",
        "l",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lmo/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;)V",
        "o",
        "()V",
        "h",
        "a",
        "Landroid/view/ViewGroup;",
        "Lno/c;",
        "b",
        "Lno/c;",
        "binding",
        "",
        "value",
        "c",
        "Z",
        "g",
        "(Z)V",
        "isShowing",
        "d",
        "setup",
        "Landroid/view/View;",
        "e",
        "Landroid/view/View;",
        "currentAssetIllustrationView",
        "government-id_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Landroid/view/ViewGroup;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lno/c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public c:Z

.field public d:Z

.field public e:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo/h;->a:Landroid/view/ViewGroup;

    return-void
.end method

.method public static synthetic a(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lmo/h;->k(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lmo/h;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lmo/h;->i(Lmo/h;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lmo/h;->j(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lno/c;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lmo/h;->m(Lno/c;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 0

    invoke-static {p0}, Lmo/h;->n(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    return-void
.end method

.method public static synthetic f(Lno/c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lmo/h;->p(Lno/c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lmo/h;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lmo/h;->g(Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x5

    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X0(I)V

    return-void
.end method

.method public static final k(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x5

    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X0(I)V

    return-void
.end method

.method public static final m(Lno/c;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;
    .locals 1

    const-string v0, "insets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->getInsetsIgnoringVisibility(I)Landroidx/core/graphics/Insets;

    move-result-object p1

    const-string v0, "getInsetsIgnoringVisibility(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lno/c;->b:Landroid/widget/Space;

    const-string v0, "bottomInset"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    iget p1, p1, Landroidx/core/graphics/Insets;->bottom:I

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final n(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X0(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Z0(Z)V

    return-void
.end method

.method public static final p(Lno/c;)Lkotlin/Unit;
    .locals 2

    iget-object v0, p0, Lno/c;->c:Landroid/widget/FrameLayout;

    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q0(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    const-string v1, "from(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X0(I)V

    invoke-virtual {p0}, Lno/c;->b()Landroid/widget/FrameLayout;

    move-result-object p0

    const-string v0, "getRoot(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lan/e;->c(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final g(Z)V
    .locals 0

    iput-boolean p1, p0, Lmo/h;->c:Z

    invoke-virtual {p0}, Lmo/h;->o()V

    return-void
.end method

.method public final h()V
    .locals 7

    iget-object v0, p0, Lmo/h;->b:Lno/c;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lmo/h;->d:Z

    if-eqz v1, :cond_1

    :goto_0
    return-void

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Lmo/h;->d:Z

    iget-object v2, v0, Lno/c;->c:Landroid/widget/FrameLayout;

    invoke-static {v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q0(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v2

    const-string v3, "from(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lmo/e;

    invoke-direct {v3, p0}, Lmo/e;-><init>(Lmo/h;)V

    iget-object v4, v0, Lno/c;->c:Landroid/widget/FrameLayout;

    const-string v5, "bottomSheet"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, Lno/c;->d:Landroid/widget/LinearLayout;

    iget-object v6, v0, Lno/c;->j:Landroid/view/View;

    invoke-static {v2, v3, v4, v5, v6}, Lwq/b;->b(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lkotlin/jvm/functions/Function0;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    iget-object v3, v0, Lno/c;->j:Landroid/view/View;

    new-instance v4, Lmo/f;

    invoke-direct {v4, v2}, Lmo/f;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, v0, Lno/c;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    new-instance v3, Lmo/g;

    invoke-direct {v3, v2}, Lmo/g;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v2, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Z0(Z)V

    return-void
.end method

.method public final l(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lmo/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;)V
    .locals 34
    .param p1    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lmo/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    move-object/from16 v0, p0

    const-string v1, "viewModel"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lmo/h;->b:Lno/c;

    const/4 v3, 0x1

    if-nez v1, :cond_0

    iget-object v1, v0, Lmo/h;->a:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    iget-object v4, v0, Lmo/h;->a:Landroid/view/ViewGroup;

    invoke-static {v1, v4, v3}, Lno/c;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lno/c;

    move-result-object v1

    const-string v4, "inflate(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iput-object v1, v0, Lmo/h;->b:Lno/c;

    invoke-virtual {v0}, Lmo/h;->h()V

    invoke-virtual {v0, v3}, Lmo/h;->g(Z)V

    iget-object v4, v1, Lno/c;->l:Landroid/widget/TextView;

    const-string v5, "title"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lmo/a;->f()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Ler/h;->e(Landroid/widget/TextView;Ljava/lang/String;)V

    iget-object v4, v1, Lno/c;->i:Landroid/widget/TextView;

    const-string v6, "prompt"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lmo/a;->c()Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Ler/h;->e(Landroid/widget/TextView;Ljava/lang/String;)V

    iget-object v4, v1, Lno/c;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    invoke-virtual {v2}, Lmo/a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, v1, Lno/c;->k:Landroid/widget/LinearLayout;

    const-string v7, "tipsContainer"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lmo/a;->e()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    if-eqz p1, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTextBasedComponentStyle;

    move-result-object v9

    if-eqz v9, :cond_1

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTextBasedComponentStyle;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;

    move-result-object v9

    if-eqz v9, :cond_1

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v9

    goto :goto_0

    :cond_1
    move-object v9, v8

    :goto_0
    invoke-static {v4, v7, v9}, Ler/a;->e(Landroid/widget/LinearLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    iget-object v4, v1, Lno/c;->c:Landroid/widget/FrameLayout;

    invoke-static {v4}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q0(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v4

    const-string v7, "from(...)"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x2

    if-eqz p1, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getTitleStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTitleComponentStyle;

    move-result-object v9

    if-eqz v9, :cond_2

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTitleComponentStyle;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;

    move-result-object v9

    if-eqz v9, :cond_2

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v9

    if-eqz v9, :cond_2

    iget-object v10, v1, Lno/c;->l:Landroid/widget/TextView;

    invoke-static {v10, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v9, v8, v7, v8}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTextBasedComponentStyle;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTextBasedComponentStyle;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v5

    if-eqz v5, :cond_3

    iget-object v9, v1, Lno/c;->i:Landroid/widget/TextView;

    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9, v5, v8, v7, v8}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_3
    const-string v5, "continueButton"

    if-eqz p1, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getButtonPrimaryStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepPrimaryButtonComponentStyle;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepPrimaryButtonComponentStyle;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSubmitButtonComponentStyleContainer;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSubmitButtonComponentStyleContainer;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;

    move-result-object v10

    if-eqz v10, :cond_4

    iget-object v9, v1, Lno/c;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v9 .. v15}, Ljr/e;->h(Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZZILjava/lang/Object;)V

    :cond_4
    iget-object v6, v1, Lno/c;->d:Landroid/widget/LinearLayout;

    const-string v9, "bottomSheetContent"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, p1

    move-object/from16 v16, v6

    invoke-static/range {v16 .. v22}, Ljr/c;->c(Landroid/view/ViewGroup;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Landroid/view/View;Landroid/graphics/Rect;ZILjava/lang/Object;)V

    if-eqz p1, :cond_7

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getModalPaddingValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;

    move-result-object v6

    if-eqz v6, :cond_7

    iget-object v9, v1, Lno/c;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    if-eqz v5, :cond_6

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;->getTop()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-interface {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;->getDp()Ljava/lang/Double;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    invoke-static {v10, v11}, Ljq/j;->a(D)D

    move-result-wide v10

    double-to-int v6, v10

    iput v6, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    :cond_5
    invoke-virtual {v9, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    :cond_6
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    :goto_1
    invoke-virtual {v2}, Lmo/a;->d()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v5

    sget-object v6, Lmo/h$a;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    const/4 v9, 0x3

    if-eq v5, v3, :cond_b

    if-eq v5, v7, :cond_a

    if-eq v5, v9, :cond_9

    if-eqz p3, :cond_8

    invoke-virtual/range {p3 .. p3}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;->getIdFrontHelpModalPictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v5

    goto :goto_2

    :cond_8
    move-object v5, v8

    goto :goto_2

    :cond_9
    if-eqz p3, :cond_8

    invoke-virtual/range {p3 .. p3}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;->getBarcodeHelpModalPictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v5

    goto :goto_2

    :cond_a
    if-eqz p3, :cond_8

    invoke-virtual/range {p3 .. p3}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;->getIdBackHelpModalPictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v5

    goto :goto_2

    :cond_b
    if-eqz p3, :cond_8

    invoke-virtual/range {p3 .. p3}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;->getIdFrontHelpModalPictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v5

    :goto_2
    const/4 v10, 0x0

    if-eqz v5, :cond_c

    iget-object v2, v0, Lmo/h;->e:Landroid/view/View;

    if-nez v2, :cond_18

    iget-object v2, v1, Lno/c;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v3, "illustrationContainer"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v2, v10, v7, v8}, Llr/c;->f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Landroidx/constraintlayout/widget/ConstraintLayout;ZILjava/lang/Object;)Landroid/view/View;

    move-result-object v2

    iput-object v2, v0, Lmo/h;->e:Landroid/view/View;

    iget-object v2, v1, Lno/c;->g:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_7

    :cond_c
    invoke-virtual {v2}, Lmo/a;->d()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    if-eq v5, v3, :cond_f

    if-eq v5, v7, :cond_e

    if-eq v5, v9, :cond_d

    sget v3, Lvp/f;->c:I

    goto :goto_3

    :cond_d
    sget v3, Lvp/f;->b:I

    goto :goto_3

    :cond_e
    sget v3, Lvp/f;->a:I

    goto :goto_3

    :cond_f
    sget v3, Lvp/f;->c:I

    :goto_3
    iget-object v5, v1, Lno/c;->g:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    invoke-virtual {v5, v3}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(I)V

    invoke-virtual {v2}, Lmo/a;->d()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v6, v2

    const-string v3, "#000000"

    const-string v5, "#AA84FF"

    const-string v6, "#190051"

    const-string v11, "illustration"

    if-eq v2, v7, :cond_15

    if-eq v2, v9, :cond_12

    iget-object v12, v1, Lno/c;->g:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_10

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getCaptureHintIconStrokeColor()Ljava/lang/Integer;

    move-result-object v2

    move-object v13, v2

    goto :goto_4

    :cond_10
    move-object v13, v8

    :goto_4
    if-eqz p1, :cond_11

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getCaptureHintIconFillColor()Ljava/lang/Integer;

    move-result-object v8

    :cond_11
    move-object v14, v8

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v17

    const-string v2, "#8751FF"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v18

    new-array v2, v10, [Ljava/lang/String;

    const/16 v21, 0x44

    const/16 v22, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v2

    invoke-static/range {v12 .. v22}, Ljr/g;->m(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_7

    :cond_12
    iget-object v2, v1, Lno/c;->g:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_13

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getCaptureHintIconStrokeColor()Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v24, v3

    goto :goto_5

    :cond_13
    move-object/from16 v24, v8

    :goto_5
    if-eqz p1, :cond_14

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getCaptureHintIconFillColor()Ljava/lang/Integer;

    move-result-object v8

    :cond_14
    move-object/from16 v25, v8

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v28

    const-string v3, "#AA85FF"

    filled-new-array {v5, v3}, [Ljava/lang/String;

    move-result-object v29

    new-array v3, v10, [Ljava/lang/String;

    const/16 v32, 0x44

    const/16 v33, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v30, 0x0

    move-object/from16 v23, v2

    move-object/from16 v31, v3

    invoke-static/range {v23 .. v33}, Ljr/g;->m(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_7

    :cond_15
    move-object v2, v5

    iget-object v5, v1, Lno/c;->g:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_16

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getCaptureHintIconStrokeColor()Ljava/lang/Integer;

    move-result-object v7

    goto :goto_6

    :cond_16
    move-object v7, v8

    :goto_6
    if-eqz p1, :cond_17

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getCaptureHintIconFillColor()Ljava/lang/Integer;

    move-result-object v8

    :cond_17
    filled-new-array {v3, v6}, [Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v11

    new-array v13, v10, [Ljava/lang/String;

    const/16 v14, 0x44

    const/4 v15, 0x0

    move-object v6, v7

    move-object v7, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    move-object v10, v3

    invoke-static/range {v5 .. v15}, Ljr/g;->m(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/Object;)V

    :cond_18
    :goto_7
    iget-object v2, v1, Lno/c;->b:Landroid/widget/Space;

    const-string v3, "bottomInset"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lmo/b;

    invoke-direct {v3, v1}, Lmo/b;-><init>(Lno/c;)V

    invoke-static {v2, v3}, Lwq/g;->g(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1}, Lno/c;->b()Landroid/widget/FrameLayout;

    move-result-object v1

    new-instance v2, Lmo/c;

    invoke-direct {v2, v4}, Lmo/c;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    const-wide/16 v3, 0xc8

    invoke-virtual {v1, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final o()V
    .locals 3

    iget-object v0, p0, Lmo/h;->b:Lno/c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, p0, Lmo/h;->c:Z

    const-string v2, "getRoot(...)"

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lno/c;->b()Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lmo/d;

    invoke-direct {v2, v0}, Lmo/d;-><init>(Lno/c;)V

    invoke-static {v1, v2}, Lan/e;->c(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    return-void

    :cond_1
    invoke-virtual {v0}, Lno/c;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lan/e;->c(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
