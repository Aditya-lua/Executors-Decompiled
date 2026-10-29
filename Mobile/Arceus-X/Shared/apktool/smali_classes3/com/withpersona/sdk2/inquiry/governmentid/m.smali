.class public final Lcom/withpersona/sdk2/inquiry/governmentid/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/governmentid/m$a;,
        Lcom/withpersona/sdk2/inquiry/governmentid/m$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lan/k<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \"2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\u0008*\u00020\u00072\u0008\u0008\u0001\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\'\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006$"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/m;",
        "Lan/k;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;",
        "Lno/m;",
        "binding",
        "<init>",
        "(Lno/m;)V",
        "Landroid/content/Context;",
        "",
        "attrColor",
        "Landroid/util/TypedValue;",
        "typedValue",
        "",
        "resolveRefs",
        "f",
        "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I",
        "rendering",
        "Lan/y;",
        "viewEnvironment",
        "",
        "h",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;Lan/y;)V",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;",
        "styles",
        "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;",
        "textPosition",
        "e",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lan/y;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V",
        "b",
        "Lno/m;",
        "Landroid/view/View;",
        "c",
        "Landroid/view/View;",
        "currentLoadingAssetView",
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
.field public static final d:Lcom/withpersona/sdk2/inquiry/governmentid/m$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Lno/m;
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->d:Lcom/withpersona/sdk2/inquiry/governmentid/m$a;

    return-void
.end method

.method public constructor <init>(Lno/m;)V
    .locals 11
    .param p1    # Lno/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    invoke-virtual {p1}, Lno/m;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v0, "getContext(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lvp/a;->n:I

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ljq/z;->f(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p1, Lno/m;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(I)V

    iget-object v0, p1, Lno/m;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    invoke-virtual {v0}, Lcom/airbnb/lottie/LottieAnimationView;->x()V

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lno/m;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    new-instance v1, Ll7/e;

    const-string v2, "scanner"

    const-string v3, "**"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ll7/e;-><init>([Ljava/lang/String;)V

    sget-object v2, Lf7/o0;->a:Ljava/lang/Integer;

    new-instance v3, Lio/v;

    invoke-direct {v3, p0, p1}, Lio/v;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/m;Lno/m;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/airbnb/lottie/LottieAnimationView;->l(Ll7/e;Ljava/lang/Object;Lt7/e;)V

    :goto_0
    invoke-virtual {p1}, Lno/m;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v4

    const-string p1, "getRoot(...)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lwq/g;->d(Landroid/view/View;ZZZZILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/m;->i(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/governmentid/m;Lno/m;Lt7/b;)Ljava/lang/Integer;
    .locals 7

    invoke-virtual {p1}, Lno/m;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string p1, "getContext(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Li/a;->z:I

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/withpersona/sdk2/inquiry/governmentid/m;->g(Lcom/withpersona/sdk2/inquiry/governmentid/m;Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/m;->j(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final f(Landroid/content/Context;ILandroid/util/TypedValue;Z)I
    .locals 0

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    invoke-virtual {p1, p2, p3, p4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p1, p3, Landroid/util/TypedValue;->data:I

    return p1
.end method

.method public static synthetic g(Lcom/withpersona/sdk2/inquiry/governmentid/m;Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    new-instance p3, Landroid/util/TypedValue;

    invoke-direct {p3}, Landroid/util/TypedValue;-><init>()V

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const/4 p4, 0x1

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/governmentid/m;->f(Landroid/content/Context;ILandroid/util/TypedValue;Z)I

    move-result p0

    return p0
.end method

.method public static final i(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;->g()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;->h()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lan/y;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/m;->h(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;Lan/y;)V

    return-void
.end method

.method public final e(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lan/y;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getPendingPageAlignmentValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;

    move-result-object v2

    if-nez v2, :cond_1

    sget-object v2, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;->TOP:Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    if-ne v1, v2, :cond_0

    sget-object v2, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;->START:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;->CENTER:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;

    :cond_1
    :goto_0
    sget-object v3, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;->TOP:Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x3

    const/4 v7, 0x2

    if-ne v1, v3, :cond_2

    new-array v1, v6, [I

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v3, v3, Lno/m;->g:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    aput v3, v1, v4

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v3, v3, Lno/m;->c:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    aput v3, v1, v5

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v3, v3, Lno/m;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    aput v3, v1, v7

    :goto_1
    move-object v13, v1

    goto :goto_2

    :cond_2
    new-array v1, v6, [I

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v3, v3, Lno/m;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    aput v3, v1, v4

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v3, v3, Lno/m;->g:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    aput v3, v1, v5

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v3, v3, Lno/m;->c:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    aput v3, v1, v7

    goto :goto_1

    :goto_2
    new-instance v8, Landroidx/constraintlayout/widget/c;

    invoke-direct {v8}, Landroidx/constraintlayout/widget/c;-><init>()V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v1, v1, Lno/m;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v8, v1}, Landroidx/constraintlayout/widget/c;->f(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    sget-object v1, Lcom/withpersona/sdk2/inquiry/governmentid/m$b;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    if-eq v1, v5, :cond_5

    if-eq v1, v7, :cond_4

    if-ne v1, v6, :cond_3

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_3

    :cond_3
    new-instance v1, Ljt/l;

    invoke-direct {v1}, Ljt/l;-><init>()V

    throw v1

    :cond_4
    const/high16 v1, 0x3f000000    # 0.5f

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    const/4 v14, 0x0

    const/4 v15, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v12, 0x4

    invoke-virtual/range {v8 .. v15}, Landroidx/constraintlayout/widget/c;->q(IIII[I[FI)V

    invoke-static {v13}, Lkotlin/collections/m;->K([I)I

    move-result v2

    invoke-virtual {v8, v2, v1}, Landroidx/constraintlayout/widget/c;->F(IF)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v1, v1, Lno/m;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v8, v1}, Landroidx/constraintlayout/widget/c;->c(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "getContext(...)"

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    invoke-virtual {v3}, Lno/m;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    invoke-virtual {v3}, Lno/m;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p2

    invoke-static {v4, v3, v1}, Lvq/c;->b(Lan/y;Landroid/content/Context;I)V

    :cond_6
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    invoke-virtual {v1}, Lno/m;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Llr/d;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_7

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    invoke-virtual {v3}, Lno/m;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_7
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getProcessingTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_8

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v4, v4, Lno/m;->g:Landroid/widget/TextView;

    const-string v5, "title"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v1, v3, v7, v3}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_8
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getProcessingTextStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v1

    if-eqz v1, :cond_9

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v4, v4, Lno/m;->c:Landroid/widget/TextView;

    const-string v5, "body"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v1, v3, v7, v3}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_9
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getFillColorValue()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v3, v3, Lno/m;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const-string v4, "#AA85FF"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4, v1}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v3, v3, Lno/m;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const-string v4, "#4600EB"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4, v1}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    :cond_a
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getStrokeColorValue()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v3, v3, Lno/m;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const-string v4, "#190052"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4, v1}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    :cond_b
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v2, v2, Lno/m;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const-string v3, "#FFFFFF"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3, v1}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v2, v2, Lno/m;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const-string v3, "#F1EBFF"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3, v1}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    :cond_c
    return-void
.end method

.method public h(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;Lan/y;)V
    .locals 13
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lan/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;->f()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v1

    new-instance v2, Lio/t;

    invoke-direct {v2, p1}, Lio/t;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;)V

    new-instance v3, Lio/u;

    invoke-direct {v3, p1}, Lio/u;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;)V

    iget-object v5, v0, Lno/m;->e:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    const-string v4, "navigationBar"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lno/m;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v6

    const-string v4, "getRoot(...)"

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;->j()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v4

    const/4 v12, 0x0

    if-eqz v4, :cond_0

    invoke-static {v4}, Ler/h;->h(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)Landroid/graphics/Rect;

    move-result-object v4

    move-object v7, v4

    goto :goto_0

    :cond_0
    move-object v7, v12

    :goto_0
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;->e()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;->j()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getNavBarTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v4

    move-object v9, v4

    goto :goto_1

    :cond_1
    move-object v9, v12

    :goto_1
    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v11}, Lir/c;->e(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/view/View;Landroid/graphics/Rect;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;ILjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v1

    const/16 v2, 0x8

    if-eqz v1, :cond_2

    iget-object v1, v0, Lno/m;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_2
    iget-object v1, v0, Lno/m;->g:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lno/m;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lno/m;->g:Landroid/widget/TextView;

    const-string v3, "title"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lwq/z;->f(Landroid/view/View;)V

    :goto_2
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, v0, Lno/m;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_3
    iget-object v1, v0, Lno/m;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;->c()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;->getLoadingPictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v12

    :cond_4
    if-eqz v12, :cond_5

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->c:Landroid/view/View;

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->b:Lno/m;

    iget-object v1, v1, Lno/m;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v3, "animationContainer"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-static {v12, v1, v3}, Llr/c;->e(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Landroidx/constraintlayout/widget/ConstraintLayout;Z)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/m;->c:Landroid/view/View;

    iget-object v0, v0, Lno/m;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_5
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;->j()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;->i()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    move-result-object p1

    invoke-virtual {p0, v0, p2, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/m;->e(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lan/y;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V

    :cond_6
    return-void
.end method
