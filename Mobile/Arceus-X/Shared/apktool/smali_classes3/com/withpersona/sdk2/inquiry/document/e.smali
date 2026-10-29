.class public final Lcom/withpersona/sdk2/inquiry/document/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan/k;
.implements Lar/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/document/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lan/k<",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;",
        ">;",
        "Lar/f<",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u00182\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0019B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00022\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000b2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/document/e;",
        "Lan/k;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;",
        "Lar/f;",
        "Lao/c;",
        "binding",
        "<init>",
        "(Lao/c;)V",
        "rendering",
        "Lan/y;",
        "viewEnvironment",
        "",
        "m",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lan/y;)V",
        "Lvq/a;",
        "systemUiController",
        "h",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lvq/a;)V",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;",
        "styles",
        "g",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lvq/a;)V",
        "b",
        "Lao/c;",
        "c",
        "a",
        "document_release"
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
.field public static final c:Lcom/withpersona/sdk2/inquiry/document/e$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Lao/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/document/e;->c:Lcom/withpersona/sdk2/inquiry/document/e$a;

    return-void
.end method

.method public constructor <init>(Lao/c;)V
    .locals 8
    .param p1    # Lao/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    invoke-virtual {p1}, Lao/c;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v1

    const-string v0, "getRoot(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lwq/g;->d(Landroid/view/View;ZZZZILjava/lang/Object;)V

    iget-object p1, p1, Lao/c;->g:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Lwq/d;

    const-wide/high16 v1, 0x4020000000000000L    # 8.0

    invoke-static {v1, v2}, Ljq/j;->a(D)D

    move-result-wide v1

    double-to-int v1, v1

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v6}, Lwq/d;-><init>(IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroidx/recyclerview/widget/RecyclerView$p;)V

    return-void
.end method

.method public static synthetic c(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/e;->i(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/e;->l(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/e;->k(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/e;->j(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Landroid/view/View;)V

    return-void
.end method

.method public static final i(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->m()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->n()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static final k(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->j()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final l(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->k()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lan/y;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/e;->m(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lan/y;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lvq/a;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/e;->h(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lvq/a;)V

    return-void
.end method

.method public final g(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lvq/a;)V
    .locals 11

    const-string v0, "getContext(...)"

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;->getBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    invoke-virtual {v2}, Lao/c;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    if-eqz p2, :cond_0

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    invoke-virtual {v2}, Lao/c;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v2, v1}, Lvq/a;->a(Landroid/content/Context;I)V

    :cond_0
    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    invoke-virtual {p2}, Lao/c;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Llr/d;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    invoke-virtual {v0}, Lao/c;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;->getHeaderButtonColorValue()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    iget-object v0, v0, Lao/c;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {v0, p2}, Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;->setControlsColor(I)V

    :cond_2
    const/4 p2, 0x2

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;->getTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    iget-object v2, v2, Lao/c;->j:Landroid/widget/TextView;

    const-string v3, "title"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v1, v0, p2, v0}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;->getTextStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    iget-object v2, v2, Lao/c;->b:Landroid/widget/TextView;

    const-string v3, "body"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v1, v0, p2, v0}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_4
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;->getDisclaimerStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    iget-object v2, v2, Lao/c;->d:Landroid/widget/TextView;

    const-string v3, "disclaimer"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v1, v0, p2, v0}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_5
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;->getButtonPrimaryStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;

    move-result-object v5

    if-eqz v5, :cond_6

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    iget-object v4, p2, Lao/c;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    const-string p2, "submitButton"

    invoke-static {v4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Ljr/e;->h(Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZZILjava/lang/Object;)V

    :cond_6
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;->getPadding()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;->getScreen()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyleContainer;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyleContainer;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;->getLeft()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-interface {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;->getDp()Ljava/lang/Double;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljq/j;->a(D)D

    move-result-wide v0

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    iget-object p2, p2, Lao/c;->h:Landroidx/constraintlayout/widget/Guideline;

    double-to-int v0, v0

    invoke-virtual {p2, v0}, Landroidx/constraintlayout/widget/Guideline;->setGuidelineBegin(I)V

    :cond_7
    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;->getPadding()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;->getScreen()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyleContainer;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyleContainer;->getBase()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;->getRight()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-interface {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;->getDp()Ljava/lang/Double;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljq/j;->a(D)D

    move-result-wide p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    iget-object v0, v0, Lao/c;->e:Landroidx/constraintlayout/widget/Guideline;

    double-to-int p1, p1

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/widget/Guideline;->setGuidelineEnd(I)V

    :cond_8
    return-void
.end method

.method public h(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lvq/a;)V
    .locals 16
    .param p1    # Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lvq/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "rendering"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    iget-object v3, v2, Lao/c;->j:Landroid/widget/TextView;

    const-string v4, "title"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->t()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lwq/t;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->p()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    invoke-virtual {v4}, Lao/c;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lus/e;->b(Landroid/content/Context;)Lus/e;

    move-result-object v4

    iget-object v5, v2, Lao/c;->b:Landroid/widget/TextView;

    invoke-virtual {v4, v5, v3}, Lus/e;->c(Landroid/widget/TextView;Ljava/lang/String;)V

    :cond_0
    iget-object v3, v2, Lao/c;->d:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, v2, Lao/c;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object v3

    if-nez v3, :cond_1

    new-instance v3, Lcom/withpersona/sdk2/inquiry/document/f;

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    invoke-virtual {v4}, Lao/c;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "getContext(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->g()Lk6/s;

    move-result-object v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->o()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->q()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v7

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/withpersona/sdk2/inquiry/document/f;-><init>(Landroid/content/Context;Lk6/s;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V

    iget-object v4, v2, Lao/c;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    goto :goto_0

    :cond_1
    iget-object v3, v2, Lao/c;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentTileAdapter"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/withpersona/sdk2/inquiry/document/f;

    :goto_0
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->c()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->a()Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->e()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/withpersona/sdk2/inquiry/document/f;->K(ZLjava/util/List;)V

    new-instance v4, Lzn/k;

    invoke-direct {v4, v1}, Lzn/k;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;)V

    invoke-virtual {v3, v4}, Lcom/withpersona/sdk2/inquiry/document/f;->J(Lkotlin/jvm/functions/Function1;)V

    iget-object v3, v2, Lao/c;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->s()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, v2, Lao/c;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->r()Z

    move-result v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setEnabled(Z)V

    iget-object v3, v2, Lao/c;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    new-instance v4, Lzn/l;

    invoke-direct {v4, v1}, Lzn/l;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->i()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v5

    new-instance v6, Lzn/m;

    invoke-direct {v6, v1}, Lzn/m;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;)V

    new-instance v7, Lzn/n;

    invoke-direct {v7, v1}, Lzn/n;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;)V

    iget-object v9, v2, Lao/c;->f:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    const-string v3, "navigationBar"

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lao/c;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v10

    const-string v2, "getRoot(...)"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->q()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-static {v3}, Ler/h;->h(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)Landroid/graphics/Rect;

    move-result-object v3

    move-object v11, v3

    goto :goto_2

    :cond_3
    move-object v11, v4

    :goto_2
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->h()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->q()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;->getNavBarTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v4

    :cond_4
    move-object v13, v4

    const/16 v14, 0x8

    const/4 v15, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v15}, Lir/c;->e(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/view/View;Landroid/graphics/Rect;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;ILjava/lang/Object;)V

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    invoke-virtual {v3}, Lao/c;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->l()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/document/e;->b:Lao/c;

    iget-object v7, v2, Lao/c;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    const/4 v8, 0x4

    const/16 v9, 0x2710

    invoke-static/range {v4 .. v9}, Ljq/g0;->a(Landroid/view/View;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroid/view/View;II)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;->q()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v1

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/document/e;->g(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lvq/a;)V

    return-void
.end method

.method public m(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lan/y;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;
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

    invoke-static {p2}, Lvq/c;->a(Lan/y;)Lvq/a;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/e;->h(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lvq/a;)V

    return-void
.end method
