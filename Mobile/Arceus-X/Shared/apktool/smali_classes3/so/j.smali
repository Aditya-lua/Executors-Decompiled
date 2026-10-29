.class public final Lso/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lso/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lan/k<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u001f2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJO\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006!"
    }
    d2 = {
        "Lso/j;",
        "Lan/k;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;",
        "Lno/a;",
        "binding",
        "<init>",
        "(Lno/a;)V",
        "rendering",
        "Lan/y;",
        "viewEnvironment",
        "",
        "g",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;Lan/y;)V",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;",
        "styles",
        "Landroid/view/View;",
        "root",
        "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;",
        "navigationBar",
        "Landroid/widget/TextView;",
        "title",
        "Landroid/widget/Button;",
        "continueButton",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "contentContainer",
        "Landroid/widget/LinearLayout;",
        "footer",
        "f",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/Button;Lan/y;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;)V",
        "b",
        "Lno/a;",
        "c",
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
.field public static final c:Lso/j$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Lno/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lso/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lso/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lso/j;->c:Lso/j$a;

    return-void
.end method

.method public constructor <init>(Lno/a;)V
    .locals 8
    .param p1    # Lno/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lso/j;->b:Lno/a;

    invoke-virtual {p1}, Lno/a;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

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

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lso/j;->h(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lso/j;->k(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lso/j;->i(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lno/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lso/j;->j(Lno/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;->f()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final i(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;->g()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j(Lno/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;)Lkotlin/Unit;
    .locals 8

    iget-object v0, p0, Lno/a;->e:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const-string p0, "illustration"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "#190051"

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object v2

    const-string p0, "#AA84FF"

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object v3

    const/4 p0, 0x0

    new-array v5, p0, [Ljava/lang/String;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, Ljr/g;->e(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final k(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;->h()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lan/y;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;

    invoke-virtual {p0, p1, p2}, Lso/j;->g(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;Lan/y;)V

    return-void
.end method

.method public final f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/Button;Lan/y;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;)V
    .locals 7

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getBackgroundColorValue()Ljava/lang/Integer;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string p8, "getContext(...)"

    invoke-static {p2, p8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p6, p2, p3}, Lvq/c;->b(Lan/y;Landroid/content/Context;I)V

    :cond_0
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getTitleStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTitleComponentStyle;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTitleComponentStyle;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object p2

    if-eqz p2, :cond_1

    const/4 p3, 0x2

    const/4 p6, 0x0

    invoke-static {p4, p2, p6, p3, p6}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_1
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getButtonPrimaryStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepPrimaryButtonComponentStyle;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepPrimaryButtonComponentStyle;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSubmitButtonComponentStyleContainer;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSubmitButtonComponentStyleContainer;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;

    move-result-object v1

    if-eqz v1, :cond_2

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p5

    invoke-static/range {v0 .. v6}, Ljr/e;->h(Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZZILjava/lang/Object;)V

    :cond_2
    const/4 p5, 0x6

    const/4 p6, 0x0

    const/4 p3, 0x0

    const/4 p4, 0x0

    move-object p2, p1

    move-object p1, p7

    invoke-static/range {p1 .. p6}, Ljr/p;->b(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZZILjava/lang/Object;)V

    return-void
.end method

.method public g(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;Lan/y;)V
    .locals 20
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lan/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p1

    const-string v1, "rendering"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "viewEnvironment"

    move-object/from16 v8, p2

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    iget-object v1, v2, Lso/j;->b:Lno/a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;->e()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v9

    new-instance v10, Lso/f;

    invoke-direct {v10, v0}, Lso/f;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;)V

    new-instance v11, Lso/g;

    invoke-direct {v11, v0}, Lso/g;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;)V

    iget-object v13, v1, Lno/a;->g:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    const-string v3, "navigationBar"

    invoke-static {v13, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lno/a;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v14

    const-string v4, "getRoot(...)"

    invoke-static {v14, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;->i()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-static {v5}, Ler/h;->h(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)Landroid/graphics/Rect;

    move-result-object v5

    move-object v15, v5

    goto :goto_0

    :cond_0
    move-object v15, v6

    :goto_0
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;->d()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;->i()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getNavBarTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v5

    move-object/from16 v17, v5

    goto :goto_1

    :cond_1
    move-object/from16 v17, v6

    :goto_1
    const/16 v18, 0x8

    const/16 v19, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v19}, Lir/c;->e(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/view/View;Landroid/graphics/Rect;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;ILjava/lang/Object;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;->i()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getImageLocalStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepImageLocalStyle;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepImageLocalStyle;->getIllustration()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepImageLocalStyleContainer;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepImageLocalStyleContainer;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;

    move-result-object v6

    :cond_2
    iget-object v5, v1, Lno/a;->e:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    sget v7, Ljq/v;->l:I

    invoke-virtual {v5, v7}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(I)V

    if-eqz v6, :cond_3

    invoke-virtual {v1}, Lno/a;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lso/h;

    invoke-direct {v7, v1, v6}, Lso/h;-><init>(Lno/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;)V

    invoke-static {v5, v7}, Lwq/z;->b(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    :cond_3
    iget-object v5, v1, Lno/a;->h:Landroid/widget/TextView;

    const-string v6, "title"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;->j()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lwq/t;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    iget-object v5, v1, Lno/a;->c:Landroid/widget/Button;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, v1, Lno/a;->c:Landroid/widget/Button;

    new-instance v7, Lso/i;

    invoke-direct {v7, v0}, Lso/i;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;)V

    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;->i()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Lno/a;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v5

    iget-object v5, v1, Lno/a;->g:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lno/a;->h:Landroid/widget/TextView;

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v1, Lno/a;->c:Landroid/widget/Button;

    const-string v6, "continueButton"

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v1, Lno/a;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v6, "innerContent"

    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, v1, Lno/a;->d:Landroid/widget/LinearLayout;

    const-string v1, "footer"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v3

    move-object v3, v0

    invoke-virtual/range {v2 .. v10}, Lso/j;->f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/Button;Lan/y;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;)V

    :cond_4
    return-void
.end method
