.class public final Lmq/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnn/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmq/v0$a;,
        Lmq/v0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnn/k<",
        "Lmq/q5$d$f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u000c2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#\u0015B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J!\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006$"
    }
    d2 = {
        "Lmq/v0;",
        "Lnn/k;",
        "Lmq/q5$d$f;",
        "Loq/f;",
        "binding",
        "<init>",
        "(Loq/f;)V",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;",
        "styles",
        "Ljr/a;",
        "systemUiController",
        "",
        "f",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Ljr/a;)V",
        "rendering",
        "Lnn/z;",
        "viewEnvironment",
        "h",
        "(Lmq/q5$d$f;Lnn/z;)V",
        "g",
        "(Lmq/q5$d$f;Ljr/a;)V",
        "b",
        "Loq/f;",
        "Lmq/v0$b;",
        "c",
        "Lmq/v0$b;",
        "adapter",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "d",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "singleItemLayoutManager",
        "Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;",
        "e",
        "Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;",
        "multiItemLayoutManager",
        "a",
        "selfie_release"
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
.field public static final f:Lmq/v0$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Loq/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lmq/v0$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Landroidx/recyclerview/widget/LinearLayoutManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmq/v0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmq/v0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmq/v0;->f:Lmq/v0$a;

    return-void
.end method

.method public constructor <init>(Loq/f;)V
    .locals 9
    .param p1    # Loq/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/v0;->b:Loq/f;

    new-instance v0, Lmq/v0$b;

    invoke-direct {v0}, Lmq/v0$b;-><init>()V

    iput-object v0, p0, Lmq/v0;->c:Lmq/v0$b;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p1}, Loq/f;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lmq/v0;->d:Landroidx/recyclerview/widget/LinearLayoutManager;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;

    invoke-virtual {p1}, Loq/f;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Loq/f;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lmq/v;->a:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    invoke-direct {v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lmq/v0;->e:Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;

    iget-object v1, p1, Loq/f;->f:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    iget-object v0, p1, Loq/f;->f:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    iget-object v0, p1, Loq/f;->f:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lkr/d;

    const-wide/high16 v2, 0x4020000000000000L    # 8.0

    invoke-static {v2, v3}, Lxq/j;->a(D)D

    move-result-wide v2

    double-to-int v2, v2

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkr/d;-><init>(IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroidx/recyclerview/widget/RecyclerView$p;)V

    invoke-virtual {p1}, Loq/f;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    const-string p1, "getRoot(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lkr/g;->d(Landroid/view/View;ZZZZILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lmq/q5$d$f;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lmq/v0;->j(Lmq/q5$d$f;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Lmq/q5$d$f;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lmq/v0;->k(Lmq/q5$d$f;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lmq/q5$d$f;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lmq/v0;->l(Lmq/q5$d$f;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lmq/q5$d$f;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lmq/v0;->i(Lmq/q5$d$f;Landroid/view/View;)V

    return-void
.end method

.method private final f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Ljr/a;)V
    .locals 8

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    iget-object v4, p0, Lmq/v0;->b:Loq/f;

    iget-object v4, v4, Loq/f;->i:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    iget-object v6, p0, Lmq/v0;->b:Loq/f;

    iget-object v6, v6, Loq/f;->i:Landroid/widget/TextView;

    invoke-virtual {v6}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    invoke-virtual {v4, v5, v3, v6, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v4, p0, Lmq/v0;->b:Loq/f;

    iget-object v4, v4, Loq/f;->i:Landroid/widget/TextView;

    const-string v5, "title"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v0, v2, v1, v2}, Lyr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getTextStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v4, p0, Lmq/v0;->b:Loq/f;

    iget-object v4, v4, Loq/f;->b:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    iget-object v6, p0, Lmq/v0;->b:Loq/f;

    iget-object v6, v6, Loq/f;->b:Landroid/widget/TextView;

    invoke-virtual {v6}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    invoke-virtual {v4, v5, v3, v6, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v3, p0, Lmq/v0;->b:Loq/f;

    iget-object v3, v3, Loq/f;->b:Landroid/widget/TextView;

    const-string v4, "body"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v0, v2, v1, v2}, Lyr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    iget-object v1, p0, Lmq/v0;->c:Lmq/v0$b;

    invoke-virtual {v1, v0}, Lmq/v0$b;->H(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    :cond_1
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "getContext(...)"

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v2, p0, Lmq/v0;->b:Loq/f;

    invoke-virtual {v2}, Loq/f;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    if-eqz p2, :cond_2

    iget-object v2, p0, Lmq/v0;->b:Loq/f;

    invoke-virtual {v2}, Loq/f;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v2, v0}, Ljr/a;->a(Landroid/content/Context;I)V

    :cond_2
    iget-object p2, p0, Lmq/v0;->b:Loq/f;

    invoke-virtual {p2}, Loq/f;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Las/d;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object v0, p0, Lmq/v0;->b:Loq/f;

    invoke-virtual {v0}, Loq/f;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getHeaderButtonColorValue()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget-object v0, p0, Lmq/v0;->b:Loq/f;

    iget-object v0, v0, Loq/f;->e:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {v0, p2}, Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;->setControlsColor(I)V

    :cond_4
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getButtonPrimaryStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object p2, p0, Lmq/v0;->b:Loq/f;

    iget-object v1, p2, Loq/f;->j:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    const-string p2, "usePhotosButton"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lyr/e;->h(Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZZILjava/lang/Object;)V

    :cond_5
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getButtonSecondaryStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepCancelButtonComponentStyleContainer;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepCancelButtonComponentStyleContainer;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object p2, p0, Lmq/v0;->b:Loq/f;

    iget-object v0, p2, Loq/f;->g:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    const-string p2, "retakeButton"

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lyr/e;->h(Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZZILjava/lang/Object;)V

    :cond_6
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getHeaderButtonColorValue()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget-object v0, p0, Lmq/v0;->b:Loq/f;

    iget-object v0, v0, Loq/f;->e:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {v0, p2}, Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;->setControlsColor(I)V

    :cond_7
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getPadding()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;->getScreen()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyleContainer;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyleContainer;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;->getLeft()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-interface {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;->getDp()Ljava/lang/Double;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lxq/j;->a(D)D

    move-result-wide v0

    iget-object p2, p0, Lmq/v0;->b:Loq/f;

    iget-object p2, p2, Loq/f;->h:Landroidx/constraintlayout/widget/Guideline;

    double-to-int v0, v0

    invoke-virtual {p2, v0}, Landroidx/constraintlayout/widget/Guideline;->setGuidelineBegin(I)V

    :cond_8
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getPadding()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;->getScreen()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyleContainer;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyleContainer;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;->getRight()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-interface {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;->getDp()Ljava/lang/Double;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Lxq/j;->a(D)D

    move-result-wide p1

    iget-object v0, p0, Lmq/v0;->b:Loq/f;

    iget-object v0, v0, Loq/f;->c:Landroidx/constraintlayout/widget/Guideline;

    double-to-int p1, p1

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/widget/Guideline;->setGuidelineEnd(I)V

    :cond_9
    return-void
.end method

.method public static final i(Lmq/q5$d$f;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lmq/q5$d$f;->f()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static final j(Lmq/q5$d$f;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lmq/q5$d$f;->e()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static final k(Lmq/q5$d$f;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lmq/q5$d$f;->c()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final l(Lmq/q5$d$f;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lmq/q5$d$f;->d()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lnn/z;)V
    .locals 0

    check-cast p1, Lmq/q5$d$f;

    invoke-virtual {p0, p1, p2}, Lmq/v0;->h(Lmq/q5$d$f;Lnn/z;)V

    return-void
.end method

.method public final g(Lmq/q5$d$f;Ljr/a;)V
    .locals 12
    .param p1    # Lmq/q5$d$f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljr/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmq/v0;->b:Loq/f;

    invoke-virtual {p1}, Lmq/q5$d$f;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_0

    iget-object v1, v0, Loq/f;->f:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Lmq/v0;->d:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$q;)V

    goto :goto_0

    :cond_0
    iget-object v1, v0, Loq/f;->f:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Lmq/v0;->e:Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$q;)V

    :goto_0
    invoke-virtual {p1}, Lmq/q5$d$f;->h()Lmq/q5$d$f$a;

    move-result-object v1

    invoke-virtual {v1}, Lmq/q5$d$f$a;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Loq/f;->i:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_1
    iget-object v1, v0, Loq/f;->i:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Loq/f;->i:Landroid/widget/TextView;

    const-string v2, "title"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lmq/q5$d$f;->h()Lmq/q5$d$f$a;

    move-result-object v2

    invoke-virtual {v2}, Lmq/q5$d$f$a;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lsr/h;->e(Landroid/widget/TextView;Ljava/lang/String;)V

    :goto_1
    iget-object v1, v0, Loq/f;->b:Landroid/widget/TextView;

    const-string v2, "body"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lmq/q5$d$f;->h()Lmq/q5$d$f$a;

    move-result-object v2

    invoke-virtual {v2}, Lmq/q5$d$f$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lsr/h;->e(Landroid/widget/TextView;Ljava/lang/String;)V

    iget-object v1, v0, Loq/f;->j:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    invoke-virtual {p1}, Lmq/q5$d$f;->h()Lmq/q5$d$f$a;

    move-result-object v2

    invoke-virtual {v2}, Lmq/q5$d$f$a;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Loq/f;->j:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    new-instance v2, Lmq/r0;

    invoke-direct {v2, p1}, Lmq/r0;-><init>(Lmq/q5$d$f;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, v0, Loq/f;->g:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    invoke-virtual {p1}, Lmq/q5$d$f;->h()Lmq/q5$d$f$a;

    move-result-object v2

    invoke-virtual {v2}, Lmq/q5$d$f$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v0, Loq/f;->g:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    new-instance v1, Lmq/s0;

    invoke-direct {v1, p1}, Lmq/s0;-><init>(Lmq/q5$d$f;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p1}, Lmq/q5$d$f;->i()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lmq/q5$d$f;->i()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lmq/v0;->f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Ljr/a;)V

    :cond_2
    iget-object p2, p0, Lmq/v0;->c:Lmq/v0$b;

    invoke-virtual {p1}, Lmq/q5$d$f;->h()Lmq/q5$d$f$a;

    move-result-object v0

    invoke-virtual {p2, v0}, Lmq/v0$b;->J(Lmq/q5$d$f$a;)V

    iget-object p2, p0, Lmq/v0;->c:Lmq/v0$b;

    invoke-virtual {p1}, Lmq/q5$d$f;->g()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lmq/v0$b;->I(Ljava/util/List;)V

    invoke-virtual {p1}, Lmq/q5$d$f;->b()Lir/a;

    move-result-object v1

    new-instance v2, Lmq/t0;

    invoke-direct {v2, p1}, Lmq/t0;-><init>(Lmq/q5$d$f;)V

    new-instance v3, Lmq/u0;

    invoke-direct {v3, p1}, Lmq/u0;-><init>(Lmq/q5$d$f;)V

    iget-object p2, p0, Lmq/v0;->b:Loq/f;

    iget-object v5, p2, Loq/f;->e:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    const-string p2, "navigationBar"

    invoke-static {v5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lmq/v0;->b:Loq/f;

    invoke-virtual {p2}, Loq/f;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v6

    const-string p2, "getRoot(...)"

    invoke-static {v6, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lmq/q5$d$f;->i()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_3

    invoke-static {p2}, Lsr/h;->h(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)Landroid/graphics/Rect;

    move-result-object p2

    move-object v7, p2

    goto :goto_2

    :cond_3
    move-object v7, v0

    :goto_2
    invoke-virtual {p1}, Lmq/q5$d$f;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lmq/q5$d$f;->i()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getNavBarTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v0

    :cond_4
    move-object v9, v0

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v11}, Lxr/c;->e(Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/view/View;Landroid/graphics/Rect;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;ILjava/lang/Object;)V

    return-void
.end method

.method public h(Lmq/q5$d$f;Lnn/z;)V
    .locals 1
    .param p1    # Lmq/q5$d$f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnn/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljr/c;->a(Lnn/z;)Ljr/a;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lmq/v0;->g(Lmq/q5$d$f;Ljr/a;)V

    return-void
.end method
