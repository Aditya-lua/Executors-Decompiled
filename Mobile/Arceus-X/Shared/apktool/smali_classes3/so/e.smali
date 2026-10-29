.class public final Lso/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lso/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lan/k<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u0000 &2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJg\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006("
    }
    d2 = {
        "Lso/e;",
        "Lan/k;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;",
        "Lno/d;",
        "binding",
        "<init>",
        "(Lno/d;)V",
        "rendering",
        "Lan/y;",
        "viewEnvironment",
        "",
        "g",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;Lan/y;)V",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;",
        "styles",
        "Landroid/view/View;",
        "root",
        "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;",
        "navigationBar",
        "Landroid/widget/TextView;",
        "title",
        "body",
        "Lcom/google/android/material/button/MaterialButton;",
        "cameraButton",
        "Landroid/widget/Button;",
        "uploadButton",
        "Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;",
        "idImage",
        "idImageContainer",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "contentContainer",
        "f",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/google/android/material/button/MaterialButton;Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Landroid/view/View;Lan/y;Landroidx/constraintlayout/widget/ConstraintLayout;)V",
        "b",
        "Lno/d;",
        "c",
        "Landroid/view/View;",
        "currentPictographAssetView",
        "d",
        "a",
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


# static fields
.field public static final d:Lso/e$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Lno/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lso/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lso/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lso/e;->d:Lso/e$a;

    return-void
.end method

.method public constructor <init>(Lno/d;)V
    .locals 8
    .param p1    # Lno/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lso/e;->b:Lno/d;

    invoke-virtual {p1}, Lno/d;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v1

    const-string p1, "getRoot(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lwq/g;->d(Landroid/view/View;ZZZZILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lso/e;->i(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lso/e;->j(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lso/e;->h(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lso/e;->k(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->k()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static final i(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->n()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static final j(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->j()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final k(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->l()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lan/y;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;

    invoke-virtual {p0, p1, p2}, Lso/e;->g(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;Lan/y;)V

    return-void
.end method

.method public final f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/google/android/material/button/MaterialButton;Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Landroid/view/View;Lan/y;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 18

    move-object/from16 v0, p2

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getContext(...)"

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p10

    invoke-static {v4, v3, v1}, Lvq/c;->b(Lan/y;Landroid/content/Context;I)V

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Llr/d;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getHeaderButtonColorValue()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;->setControlsColor(I)V

    :cond_2
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    move-object/from16 v4, p4

    invoke-static {v4, v0, v3, v1, v3}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_3
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getTextStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v0

    if-eqz v0, :cond_4

    move-object/from16 v4, p5

    invoke-static {v4, v0, v3, v1, v3}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_4
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getButtonPrimaryStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;

    move-result-object v5

    if-eqz v5, :cond_5

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v4, p6

    invoke-static/range {v4 .. v10}, Ljr/e;->h(Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZZILjava/lang/Object;)V

    :cond_5
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getButtonSecondaryStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;

    move-result-object v12

    if-eqz v12, :cond_6

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v11, p7

    invoke-static/range {v11 .. v17}, Ljr/e;->h(Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZZILjava/lang/Object;)V

    :cond_6
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getFillColorValue()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    move-object/from16 v0, p9

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_7
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getStrokeColorValue()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getFillColorValue()Ljava/lang/Integer;

    move-result-object v5

    const-string v0, "#190052"

    const-string v1, "#190051"

    const-string v3, "#000000"

    filled-new-array {v3, v0, v1}, [Ljava/lang/String;

    move-result-object v8

    const-string v0, "#AA85FF"

    const-string v1, "#AA84FF"

    const-string v3, "#8751FF"

    filled-new-array {v3, v0, v1}, [Ljava/lang/String;

    move-result-object v9

    const/4 v0, 0x0

    new-array v11, v0, [Ljava/lang/String;

    const/16 v12, 0x44

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    move-object/from16 v3, p8

    invoke-static/range {v3 .. v13}, Ljr/g;->m(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/Object;)V

    const/4 v0, 0x6

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 p2, p11

    move/from16 p6, v0

    move-object/from16 p7, v1

    move-object/from16 p3, v2

    move/from16 p4, v3

    move/from16 p5, v4

    invoke-static/range {p2 .. p7}, Ljr/p;->b(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZZILjava/lang/Object;)V

    return-void
.end method

.method public g(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;Lan/y;)V
    .locals 31
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lan/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "rendering"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "viewEnvironment"

    move-object/from16 v10, p2

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lso/e;->b:Lno/d;

    invoke-virtual {v2}, Lno/d;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, v2, Lno/d;->j:Landroid/widget/TextView;

    const-string v5, "title"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->q()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lwq/t;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    iget-object v4, v2, Lno/d;->b:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->e()Ljava/util/List;

    move-result-object v4

    sget-object v6, Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;->MOBILE_CAMERA:Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;

    invoke-interface {v4, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v3, v2, Lno/d;->c:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, v2, Lno/d;->c:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    invoke-virtual {v3, v6}, Lcom/google/android/material/button/MaterialButton;->setIcon(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    iget-object v4, v2, Lno/d;->c:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, v2, Lno/d;->c:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    sget v7, Lio/m2;->c:I

    invoke-static {v3, v7}, Lk/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/google/android/material/button/MaterialButton;->setIcon(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    iget-object v3, v2, Lno/d;->c:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    new-instance v4, Lso/a;

    invoke-direct {v4, v1}, Lso/a;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->e()Ljava/util/List;

    move-result-object v3

    sget-object v4, Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;->UPLOAD:Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;

    invoke-interface {v3, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v2, Lno/d;->k:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->r()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, v2, Lno/d;->k:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    new-instance v4, Lso/b;

    invoke-direct {v4, v1}, Lso/b;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->i()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v11

    new-instance v12, Lso/c;

    invoke-direct {v12, v1}, Lso/c;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;)V

    new-instance v13, Lso/d;

    invoke-direct {v13, v1}, Lso/d;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;)V

    iget-object v15, v2, Lno/d;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    const-string v3, "navigationBar"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lno/d;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v4

    const-string v7, "getRoot(...)"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->p()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-static {v8}, Ler/h;->h(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)Landroid/graphics/Rect;

    move-result-object v8

    move-object/from16 v17, v8

    goto :goto_1

    :cond_3
    move-object/from16 v17, v6

    :goto_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->h()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->p()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getNavBarTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v8

    move-object/from16 v19, v8

    goto :goto_2

    :cond_4
    move-object/from16 v19, v6

    :goto_2
    const/16 v20, 0x8

    const/16 v21, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v4

    invoke-static/range {v11 .. v21}, Lir/c;->e(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/view/View;Landroid/graphics/Rect;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;ILjava/lang/Object;)V

    invoke-virtual {v2}, Lno/d;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v4

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->f()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->m()Lkotlin/jvm/functions/Function0;

    move-result-object v24

    const/16 v28, 0x38

    const/16 v29, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v22, v4

    invoke-static/range {v22 .. v29}, Ljq/g0;->b(Landroid/view/View;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroid/view/View;IIILjava/lang/Object;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->o()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v4, v0, Lso/e;->c:Landroid/view/View;

    if-nez v4, :cond_6

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->o()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v4

    iget-object v8, v2, Lno/d;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v9, "imageViewContainer"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x0

    const/4 v11, 0x2

    invoke-static {v4, v8, v9, v11, v6}, Llr/c;->f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Landroidx/constraintlayout/widget/ConstraintLayout;ZILjava/lang/Object;)Landroid/view/View;

    move-result-object v4

    iput-object v4, v0, Lso/e;->c:Landroid/view/View;

    iget-object v4, v2, Lno/d;->h:Landroidx/cardview/widget/CardView;

    const/16 v6, 0x8

    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_5
    iget-object v4, v2, Lno/d;->e:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->g()I

    move-result v6

    invoke-virtual {v4, v6}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(I)V

    :cond_6
    :goto_3
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;->p()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v2}, Lno/d;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v4

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v2, Lno/d;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v4

    iget-object v4, v2, Lno/d;->j:Landroid/widget/TextView;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v2, Lno/d;->b:Landroid/widget/TextView;

    const-string v7, "body"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v3

    move-object v3, v6

    iget-object v6, v2, Lno/d;->c:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    const-string v8, "cameraButton"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, v7

    iget-object v7, v2, Lno/d;->k:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    const-string v9, "uploadButton"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, v8

    iget-object v8, v2, Lno/d;->e:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const-string v11, "idImage"

    invoke-static {v8, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v11, v9

    iget-object v9, v2, Lno/d;->f:Landroid/view/View;

    const-string v12, "idImageContainer"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v2, Lno/d;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v12, "content"

    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v30, v11

    move-object v11, v2

    move-object/from16 v2, v30

    invoke-virtual/range {v0 .. v11}, Lso/e;->f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/google/android/material/button/MaterialButton;Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Landroid/view/View;Lan/y;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_7
    return-void
.end method
