.class public final Lvo/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnn/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvo/w$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnn/k<",
        "Lvo/y3$e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006 "
    }
    d2 = {
        "Lvo/w;",
        "Lnn/k;",
        "Lvo/y3$e;",
        "Lap/g;",
        "binding",
        "<init>",
        "(Lap/g;)V",
        "rendering",
        "Lnn/z;",
        "viewEnvironment",
        "",
        "h",
        "(Lvo/y3$e;Lnn/z;)V",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;",
        "styles",
        "f",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lnn/z;)V",
        "b",
        "Lap/g;",
        "",
        "c",
        "Z",
        "shouldHideSeparators",
        "Landroidx/recyclerview/widget/h;",
        "d",
        "Landroidx/recyclerview/widget/h;",
        "dividerItemDecoration",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "e",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
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
.field public static final f:Lvo/w$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Lap/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Z

.field public final d:Landroidx/recyclerview/widget/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvo/w$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvo/w$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvo/w;->f:Lvo/w$a;

    return-void
.end method

.method public constructor <init>(Lap/g;)V
    .locals 10
    .param p1    # Lap/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/w;->b:Lap/g;

    invoke-virtual {p1}, Lap/g;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v0, "getContext(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Ljq/a;->e:I

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lxq/z;->b(Landroid/content/Context;ILandroid/util/TypedValue;ZZILjava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lvo/w;->c:Z

    new-instance v1, Landroidx/recyclerview/widget/h;

    invoke-virtual {p1}, Lap/g;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/h;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lvo/w;->d:Landroidx/recyclerview/widget/h;

    iget-object v2, p1, Lap/g;->h:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p1}, Lap/g;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$q;)V

    if-nez v0, :cond_0

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroidx/recyclerview/widget/RecyclerView$p;)V

    :cond_0
    const-string v0, "apply(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lvo/w;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Lap/g;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v3

    const-string p1, "getRoot(...)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lkr/g;->d(Landroid/view/View;ZZZZILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lvo/y3$e;Lvo/d3;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lvo/w;->i(Lvo/y3$e;Lvo/d3;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lvo/w;D)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lvo/w;->g(Lvo/w;D)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lvo/y3$e;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lvo/w;->k(Lvo/y3$e;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lvo/y3$e;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lvo/w;->j(Lvo/y3$e;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lvo/w;D)Lkotlin/Unit;
    .locals 4

    iget-object v0, p0, Lvo/w;->b:Lap/g;

    iget-object v0, v0, Lap/g;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const-wide/16 v2, 0x0

    cmpl-double v2, p1, v2

    if-lez v2, :cond_0

    invoke-static {p1, p2}, Lxq/j;->a(D)D

    move-result-wide p0

    double-to-int p0, p0

    iput p0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lvo/w;->b:Lap/g;

    iget-object p0, p0, Lap/g;->f:Landroid/view/View;

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final i(Lvo/y3$e;Lvo/d3;)Lkotlin/Unit;
    .locals 1

    const-string v0, "idClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvo/y3$e;->o()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j(Lvo/y3$e;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lvo/y3$e;->k()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final k(Lvo/y3$e;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lvo/y3$e;->l()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lnn/z;)V
    .locals 0

    check-cast p1, Lvo/y3$e;

    invoke-virtual {p0, p1, p2}, Lvo/w;->h(Lvo/y3$e;Lnn/z;)V

    return-void
.end method

.method public final f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lnn/z;)V
    .locals 6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "getContext(...)"

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v2, p0, Lvo/w;->b:Lap/g;

    invoke-virtual {v2}, Lap/g;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v2, p0, Lvo/w;->b:Lap/g;

    invoke-virtual {v2}, Lap/g;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v2, v0}, Ljr/c;->b(Lnn/z;Landroid/content/Context;I)V

    :cond_0
    iget-object p2, p0, Lvo/w;->b:Lap/g;

    invoke-virtual {p2}, Lap/g;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Las/d;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object v0, p0, Lvo/w;->b:Lap/g;

    invoke-virtual {v0}, Lap/g;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getHeaderButtonColorValue()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget-object v0, p0, Lvo/w;->b:Lap/g;

    iget-object v0, v0, Lap/g;->g:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {v0, p2}, Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;->setControlsColor(I)V

    :cond_2
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object p2

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    iget-object v2, p0, Lvo/w;->b:Lap/g;

    iget-object v2, v2, Lap/g;->k:Landroid/widget/TextView;

    const-string v3, "textviewGovernmentidInstructionsTitle"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, p2, v1, v0, v1}, Lyr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_3
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getTextStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object p2

    if-eqz p2, :cond_4

    iget-object v2, p0, Lvo/w;->b:Lap/g;

    iget-object v2, v2, Lap/g;->i:Landroid/widget/TextView;

    const-string v3, "textviewGovernmentidInstructionsBody"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, p2, v1, v0, v1}, Lyr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    iget-object v2, p0, Lvo/w;->b:Lap/g;

    iget-object v2, v2, Lap/g;->l:Landroid/widget/TextView;

    const-string v3, "textviewGovernmentidInstructionslistheader"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, p2, v1, v0, v1}, Lyr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_4
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getDisclaimerStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object p2

    if-eqz p2, :cond_5

    iget-object v2, p0, Lvo/w;->b:Lap/g;

    iget-object v2, v2, Lap/g;->j:Landroid/widget/TextView;

    const-string v3, "textviewGovernmentidInstructionsDisclaimer"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, p2, v1, v0, v1}, Lyr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_5
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getGovernmentIdSelectOptionBorderColorValue()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    filled-new-array {p2, p2}, [I

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->BOTTOM_TOP:Landroid/graphics/drawable/GradientDrawable$Orientation;

    invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-static {v2, v3}, Lxq/j;->a(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v0, v4

    invoke-static {v2, v3}, Lxq/j;->a(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-virtual {v1, v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    iget-object v0, p0, Lvo/w;->d:Landroidx/recyclerview/widget/h;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/h;->m(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lvo/w;->b:Lap/g;

    iget-object v0, v0, Lap/g;->f:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_6
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getGovernmentIdOptionBorderWidthValue()Ljava/lang/Double;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    iget-object p2, p0, Lvo/w;->d:Landroidx/recyclerview/widget/h;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/h;->l()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    check-cast p2, Landroid/graphics/drawable/GradientDrawable;

    if-eqz p2, :cond_7

    invoke-static {v0, v1}, Lxq/j;->a(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-static {v0, v1}, Lxq/j;->a(D)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v3, v3

    invoke-virtual {p2, v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    :cond_7
    iget-object p2, p0, Lvo/w;->b:Lap/g;

    iget-object p2, p2, Lap/g;->f:Landroid/view/View;

    const-string v2, "listDivider"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lvo/v;

    invoke-direct {v2, p0, v0, v1}, Lvo/v;-><init>(Lvo/w;D)V

    invoke-static {p2, v2}, Lkr/a0;->b(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    :cond_8
    iget-object p2, p0, Lvo/w;->b:Lap/g;

    iget-object v0, p2, Lap/g;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string p2, "contentContainer"

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lyr/p;->b(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZZILjava/lang/Object;)V

    return-void
.end method

.method public h(Lvo/y3$e;Lnn/z;)V
    .locals 18
    .param p1    # Lvo/y3$e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnn/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "rendering"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "viewEnvironment"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lvo/w;->b:Lap/g;

    invoke-virtual {v3}, Lap/g;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v3, "getContext(...)"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v5, Ljq/a;->c:I

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lxq/z;->f(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1}, Lvo/y3$e;->c()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;->getHeaderPictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v6

    :goto_0
    const-string v7, "textviewGovernmentidInstructionsTitle"

    const/16 v8, 0x8

    const/4 v9, 0x0

    if-eqz v4, :cond_2

    iget-object v5, v0, Lvo/w;->b:Lap/g;

    iget-object v5, v5, Lap/g;->e:Landroid/widget/ImageView;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v4, v0, Lvo/w;->b:Lap/g;

    iget-object v4, v4, Lap/g;->k:Landroid/widget/TextView;

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    if-eqz v5, :cond_1

    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    iput v9, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v4, v0, Lvo/w;->b:Lap/g;

    iget-object v4, v4, Lap/g;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    iget-object v4, v0, Lvo/w;->b:Lap/g;

    iget-object v4, v4, Lap/g;->e:Landroid/widget/ImageView;

    invoke-virtual {v4, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    if-eqz v5, :cond_3

    iget-object v4, v0, Lvo/w;->b:Lap/g;

    iget-object v4, v4, Lap/g;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v10, "governmentidHeaderImageContainer"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x2

    invoke-static {v5, v4, v9, v10, v6}, Las/c;->f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Landroidx/constraintlayout/widget/ConstraintLayout;ZILjava/lang/Object;)Landroid/view/View;

    iget-object v4, v0, Lvo/w;->b:Lap/g;

    iget-object v4, v4, Lap/g;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v4, v9}, Landroid/view/View;->setVisibility(I)V

    iget-object v4, v0, Lvo/w;->b:Lap/g;

    iget-object v4, v4, Lap/g;->e:Landroid/widget/ImageView;

    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    :cond_3
    iget-object v4, v0, Lvo/w;->b:Lap/g;

    iget-object v4, v4, Lap/g;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    iget-object v4, v0, Lvo/w;->b:Lap/g;

    iget-object v4, v4, Lap/g;->e:Landroid/widget/ImageView;

    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_1
    iget-object v4, v0, Lvo/w;->b:Lap/g;

    iget-object v4, v4, Lap/g;->k:Landroid/widget/TextView;

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lvo/y3$e;->q()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkr/u;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    iget-object v4, v0, Lvo/w;->b:Lap/g;

    iget-object v4, v4, Lap/g;->i:Landroid/widget/TextView;

    const-string v5, "textviewGovernmentidInstructionsBody"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lvo/y3$e;->n()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkr/u;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    iget-object v4, v0, Lvo/w;->b:Lap/g;

    iget-object v4, v4, Lap/g;->l:Landroid/widget/TextView;

    const-string v5, "textviewGovernmentidInstructionslistheader"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lvo/y3$e;->d()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkr/u;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    iget-object v4, v0, Lvo/w;->b:Lap/g;

    iget-object v4, v4, Lap/g;->j:Landroid/widget/TextView;

    const-string v5, "textviewGovernmentidInstructionsDisclaimer"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lvo/y3$e;->e()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkr/u;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lvo/y3$e;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_4

    iget-object v4, v0, Lvo/w;->b:Lap/g;

    iget-object v4, v4, Lap/g;->g:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    sget v5, Lvo/n3;->H0:I

    invoke-virtual {v4, v5}, Landroid/view/View;->setAccessibilityTraversalAfter(I)V

    :cond_4
    iget-object v4, v0, Lvo/w;->b:Lap/g;

    iget-object v4, v4, Lap/g;->f:Landroid/view/View;

    iget-boolean v5, v0, Lvo/w;->c:Z

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    move v8, v9

    :goto_2
    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    iget-object v4, v0, Lvo/w;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object v4

    instance-of v5, v4, Lvo/z;

    if-eqz v5, :cond_6

    check-cast v4, Lvo/z;

    goto :goto_3

    :cond_6
    move-object v4, v6

    :goto_3
    if-nez v4, :cond_7

    new-instance v7, Lvo/z;

    iget-object v4, v0, Lvo/w;->b:Lap/g;

    invoke-virtual {v4}, Lap/g;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lvo/y3$e;->f()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v1}, Lvo/y3$e;->p()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v10

    invoke-virtual {v1}, Lvo/y3$e;->c()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;

    move-result-object v11

    invoke-virtual {v1}, Lvo/y3$e;->h()Lgr/a$c;

    move-result-object v12

    new-instance v13, Lvo/s;

    invoke-direct {v13, v1}, Lvo/s;-><init>(Lvo/y3$e;)V

    invoke-direct/range {v7 .. v13}, Lvo/z;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;Lgr/a$c;Lkotlin/jvm/functions/Function1;)V

    move-object v4, v7

    :cond_7
    iget-object v3, v0, Lvo/w;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object v3

    if-nez v3, :cond_8

    iget-object v3, v0, Lvo/w;->e:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    :cond_8
    invoke-virtual {v1}, Lvo/y3$e;->r()Z

    move-result v3

    invoke-virtual {v4, v3}, Lvo/z;->I(Z)V

    invoke-virtual {v1}, Lvo/y3$e;->j()Lir/a;

    move-result-object v7

    new-instance v8, Lvo/t;

    invoke-direct {v8, v1}, Lvo/t;-><init>(Lvo/y3$e;)V

    new-instance v9, Lvo/u;

    invoke-direct {v9, v1}, Lvo/u;-><init>(Lvo/y3$e;)V

    iget-object v3, v0, Lvo/w;->b:Lap/g;

    iget-object v11, v3, Lap/g;->g:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    const-string v3, "navigationBar"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lvo/w;->b:Lap/g;

    invoke-virtual {v3}, Lap/g;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v12

    const-string v3, "getRoot(...)"

    invoke-static {v12, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lvo/y3$e;->p()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-static {v4}, Lsr/h;->h(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)Landroid/graphics/Rect;

    move-result-object v4

    move-object v13, v4

    goto :goto_4

    :cond_9
    move-object v13, v6

    :goto_4
    invoke-virtual {v1}, Lvo/y3$e;->i()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lvo/y3$e;->p()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getNavBarTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v6

    :cond_a
    move-object v15, v6

    const/16 v16, 0x8

    const/16 v17, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v17}, Lxr/c;->e(Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/view/View;Landroid/graphics/Rect;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;ILjava/lang/Object;)V

    iget-object v4, v0, Lvo/w;->b:Lap/g;

    invoke-virtual {v4}, Lap/g;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lvo/y3$e;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lvo/y3$e;->m()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    const/16 v11, 0x38

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lxq/g0;->b(Landroid/view/View;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroid/view/View;IIILjava/lang/Object;)V

    invoke-virtual {v1}, Lvo/y3$e;->p()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v0, v1, v2}, Lvo/w;->f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lnn/z;)V

    :cond_b
    return-void
.end method
