.class public final Lso/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lso/p$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lan/k<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u001e2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJO\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006 "
    }
    d2 = {
        "Lso/p;",
        "Lan/k;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;",
        "Lno/j;",
        "binding",
        "<init>",
        "(Lno/j;)V",
        "rendering",
        "Lan/y;",
        "viewEnvironment",
        "",
        "g",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;Lan/y;)V",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;",
        "styles",
        "Landroid/view/View;",
        "root",
        "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;",
        "navigationBar",
        "Landroid/widget/TextView;",
        "title",
        "body",
        "Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;",
        "usePhotoButton",
        "Landroid/widget/Button;",
        "chooseNewPhotoButton",
        "f",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/widget/Button;Lan/y;)V",
        "b",
        "Lno/j;",
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
.field public static final c:Lso/p$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Lno/j;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lso/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lso/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lso/p;->c:Lso/p$a;

    return-void
.end method

.method public constructor <init>(Lno/j;)V
    .locals 8
    .param p1    # Lno/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lso/p;->b:Lno/j;

    invoke-virtual {p1}, Lno/j;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

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

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lso/p;->k(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lso/p;->j(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lso/p;->i(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lso/p;->h(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;Landroid/view/View;)V

    return-void
.end method

.method public static final h(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->q()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static final i(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->o()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static final j(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->m()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final k(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->n()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lan/y;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;

    invoke-virtual {p0, p1, p2}, Lso/p;->g(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;Lan/y;)V

    return-void
.end method

.method public final f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/widget/Button;Lan/y;)V
    .locals 7

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getBackgroundColorValue()Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "getContext(...)"

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p8, v2, v0}, Lvq/c;->b(Lan/y;Landroid/content/Context;I)V

    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p8

    invoke-static {p8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p8}, Llr/d;->a(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p8

    if-eqz p8, :cond_1

    invoke-virtual {p2, p8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getHeaderButtonColorValue()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p3, p2}, Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;->setControlsColor(I)V

    :cond_2
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object p2

    const/4 p3, 0x2

    const/4 p8, 0x0

    if-eqz p2, :cond_3

    invoke-static {p4, p2, p8, p3, p8}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_3
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getTextStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-static {p5, p2, p8, p3, p8}, Ljr/h0;->l(Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;Ljava/util/Set;ILjava/lang/Object;)V

    :cond_4
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getButtonPrimaryStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;

    move-result-object p2

    if-eqz p2, :cond_5

    const/4 p4, 0x0

    invoke-static {p6, p2, p4, p3, p8}, Ljr/e;->i(Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZILjava/lang/Object;)V

    :cond_5
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getButtonSecondaryStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;

    move-result-object v1

    if-eqz v1, :cond_6

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p7

    invoke-static/range {v0 .. v6}, Ljr/e;->h(Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZZILjava/lang/Object;)V

    :cond_6
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getPadding()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;

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

    move-result-wide p2

    invoke-static {p2, p3}, Ljq/j;->a(D)D

    move-result-wide p2

    iget-object p4, p0, Lso/p;->b:Lno/j;

    iget-object p4, p4, Lno/j;->j:Landroidx/constraintlayout/widget/Guideline;

    double-to-int p2, p2

    invoke-virtual {p4, p2}, Landroidx/constraintlayout/widget/Guideline;->setGuidelineBegin(I)V

    :cond_7
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getPadding()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;

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

    iget-object p3, p0, Lso/p;->b:Lno/j;

    iget-object p3, p3, Lno/j;->d:Landroidx/constraintlayout/widget/Guideline;

    double-to-int p1, p1

    invoke-virtual {p3, p1}, Landroidx/constraintlayout/widget/Guideline;->setGuidelineEnd(I)V

    :cond_8
    return-void
.end method

.method public g(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;Lan/y;)V
    .locals 23
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;
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

    move-object/from16 v10, p2

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    iget-object v1, v2, Lso/p;->b:Lno/j;

    iget-object v3, v1, Lno/j;->k:Landroid/widget/TextView;

    const-string v4, "title"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->s()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lwq/t;->b(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    iget-object v3, v1, Lno/j;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, v1, Lno/j;->l:Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, v1, Lno/j;->l:Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    new-instance v5, Lso/l;

    invoke-direct {v5, v0}, Lso/l;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;)V

    invoke-virtual {v3, v5}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v3, v1, Lno/j;->c:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, v1, Lno/j;->c:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    new-instance v5, Lso/m;

    invoke-direct {v5, v0}, Lso/m;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;)V

    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v3, Ljava/io/File;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->i()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v6, 0x1

    iput-boolean v6, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->i()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->g()Ljava/lang/String;

    move-result-object v6

    const-string v7, "image/"

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v11, 0x0

    invoke-static {v6, v7, v8, v9, v11}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    iget-object v6, v1, Lno/j;->g:Landroid/widget/ImageView;

    const-string v7, "imageView"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->j()Lk6/s;

    move-result-object v7

    new-instance v9, Lx6/g$a;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-direct {v9, v12}, Lx6/g$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v9, v3}, Lx6/g$a;->c(Ljava/lang/Object;)Lx6/g$a;

    move-result-object v3

    invoke-static {v3, v6}, Lx6/j;->q(Lx6/g$a;Landroid/widget/ImageView;)Lx6/g$a;

    move-result-object v3

    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    iget v9, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v5, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-virtual {v6, v9, v5}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    invoke-virtual {v6, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v6}, Lk6/v;->c(Landroid/graphics/drawable/Drawable;)Lk6/n;

    move-result-object v5

    invoke-virtual {v3, v5}, Lx6/g$a;->n(Lk6/n;)Lx6/g$a;

    invoke-virtual {v3}, Lx6/g$a;->b()Lx6/g;

    move-result-object v3

    invoke-interface {v7, v3}, Lk6/s;->c(Lx6/g;)Lx6/d;

    goto :goto_0

    :cond_0
    iget-object v3, v1, Lno/j;->g:Landroid/widget/ImageView;

    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v3, v1, Lno/j;->e:Landroid/widget/ImageView;

    invoke-virtual {v3, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v3, v1, Lno/j;->f:Landroid/widget/TextView;

    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, v1, Lno/j;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->l()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v12

    new-instance v13, Lso/n;

    invoke-direct {v13, v0}, Lso/n;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;)V

    new-instance v14, Lso/o;

    invoke-direct {v14, v0}, Lso/o;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;)V

    iget-object v3, v1, Lno/j;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    const-string v5, "navigationBar"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lno/j;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v6

    const-string v7, "getRoot(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->r()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-static {v8}, Ler/h;->h(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)Landroid/graphics/Rect;

    move-result-object v8

    move-object/from16 v18, v8

    goto :goto_1

    :cond_1
    move-object/from16 v18, v11

    :goto_1
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->k()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->r()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v8

    if-eqz v8, :cond_2

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getNavBarTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v11

    :cond_2
    move-object/from16 v20, v11

    const/16 v21, 0x8

    const/16 v22, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v3

    move-object/from16 v17, v6

    invoke-static/range {v12 .. v22}, Lir/c;->e(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/view/View;Landroid/graphics/Rect;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;ILjava/lang/Object;)V

    iget-object v3, v1, Lno/j;->l:Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->t()Z

    move-result v6

    invoke-virtual {v3, v6}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setIsLoading(Z)V

    invoke-virtual {v1}, Lno/j;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v11

    invoke-static {v11, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->f()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->p()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    const/16 v17, 0x38

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v11 .. v18}, Ljq/g0;->b(Landroid/view/View;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroid/view/View;IIILjava/lang/Object;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;->r()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v1}, Lno/j;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v0

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v1, Lno/j;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v6

    iget-object v6, v1, Lno/j;->k:Landroid/widget/TextView;

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v1, Lno/j;->b:Landroid/widget/TextView;

    const-string v4, "body"

    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v1, Lno/j;->l:Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    const-string v4, "usePhotoButton"

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v1, Lno/j;->c:Lcom/withpersona/sdk2/inquiry/shared/ui/PersonaMaterialButton;

    const-string v1, "chooseNewPhotoButton"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v0

    invoke-virtual/range {v2 .. v10}, Lso/p;->f(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/widget/Button;Lan/y;)V

    :cond_3
    return-void
.end method
