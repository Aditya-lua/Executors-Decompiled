.class public final Lcom/withpersona/sdk2/inquiry/document/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan/b;
.implements Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lan/b<",
        "Lcom/withpersona/sdk2/inquiry/document/b;",
        ">;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012$\u0010\u000b\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00080\u00060\u0005\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000e\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000e\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J3\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c0\u001bH\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R5\u0010\u000b\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00080\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/R\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u00080\u0010-\u001a\u0004\u00081\u0010/R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u0008$\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u00105\u001a\u0004\u00086\u00107R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u00108\u001a\u0004\u00089\u0010:R&\u0010A\u001a\u0008\u0012\u0004\u0012\u00020\u00000;8\u0016X\u0096\u0004\u00a2\u0006\u0012\n\u0004\u0008<\u0010=\u0012\u0004\u0008?\u0010@\u001a\u0004\u0008 \u0010>\u00a8\u0006B"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/document/b;",
        "Lan/b;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;",
        "uiScreen",
        "",
        "Lkotlin/Pair;",
        "",
        "Lkotlin/Function1;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
        "",
        "componentNamesToActions",
        "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;",
        "navigationState",
        "Lkotlin/Function0;",
        "onBack",
        "onCancel",
        "Lar/p;",
        "bottomSheet",
        "navBarTitle",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;",
        "styles",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lar/p;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V",
        "Lnq/b;",
        "binding",
        "rendering",
        "",
        "Lar/a;",
        "componentNameToComponentView",
        "h",
        "(Lnq/b;Lcom/withpersona/sdk2/inquiry/document/b;Ljava/util/Map;)V",
        "a",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;",
        "g",
        "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;",
        "b",
        "Ljava/util/List;",
        "getComponentNamesToActions",
        "()Ljava/util/List;",
        "c",
        "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;",
        "getNavigationState",
        "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;",
        "d",
        "Lkotlin/jvm/functions/Function0;",
        "getOnBack",
        "()Lkotlin/jvm/functions/Function0;",
        "e",
        "getOnCancel",
        "f",
        "Lar/p;",
        "()Lar/p;",
        "Ljava/lang/String;",
        "getNavBarTitle",
        "()Ljava/lang/String;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;",
        "getStyles",
        "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;",
        "Lan/a0;",
        "i",
        "Lan/a0;",
        "()Lan/a0;",
        "getViewFactory$annotations",
        "()V",
        "viewFactory",
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


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            "Lkotlin/Unit;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lar/p;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final g:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final h:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final i:Lan/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lan/a0<",
            "Lcom/withpersona/sdk2/inquiry/document/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lar/p;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lar/p;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;",
            "Ljava/util/List<",
            "+",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            "Lkotlin/Unit;",
            ">;>;>;",
            "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lar/p;",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;",
            ")V"
        }
    .end annotation

    const-string v0, "uiScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "componentNamesToActions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBack"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCancel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/b;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    .line 3
    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/b;->b:Ljava/util/List;

    .line 4
    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/b;->c:Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    .line 5
    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/document/b;->d:Lkotlin/jvm/functions/Function0;

    .line 6
    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/document/b;->e:Lkotlin/jvm/functions/Function0;

    .line 7
    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/document/b;->f:Lar/p;

    .line 8
    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/document/b;->g:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lcom/withpersona/sdk2/inquiry/document/b;->h:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    .line 10
    sget-object p2, Lar/s;->a:Lar/s;

    .line 11
    new-instance p2, Lzn/f;

    invoke-direct {p2}, Lzn/f;-><init>()V

    .line 12
    new-instance p3, Lcom/withpersona/sdk2/inquiry/document/b$c;

    invoke-direct {p3, p0}, Lcom/withpersona/sdk2/inquiry/document/b$c;-><init>(Ljava/lang/Object;)V

    .line 13
    sget-object p4, Lan/k;->a:Lan/k$a;

    sget-object p4, Lcom/withpersona/sdk2/inquiry/document/b$a;->a:Lcom/withpersona/sdk2/inquiry/document/b$a;

    new-instance p5, Lcom/withpersona/sdk2/inquiry/document/b$b;

    const/4 p6, 0x1

    invoke-direct {p5, p1, p2, p6, p3}, Lcom/withpersona/sdk2/inquiry/document/b$b;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lkotlin/jvm/functions/Function2;ZLzt/n;)V

    .line 14
    new-instance p1, Lan/x;

    const-class p2, Lcom/withpersona/sdk2/inquiry/document/b;

    invoke-static {p2}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object p2

    invoke-direct {p1, p2, p4, p5}, Lan/x;-><init>(Lhu/c;Lzt/n;Lkotlin/jvm/functions/Function1;)V

    .line 15
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/b;->i:Lan/a0;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lar/p;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x20

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p6, v0

    :cond_0
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_1

    move-object p7, v0

    :cond_1
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_2

    move-object p9, v0

    :goto_0
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p9, p8

    goto :goto_0

    .line 16
    :goto_1
    invoke-direct/range {p1 .. p9}, Lcom/withpersona/sdk2/inquiry/document/b;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lar/p;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V

    return-void
.end method

.method public static synthetic c(Lnq/b;Ljava/util/Map;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/b;->l(Lnq/b;Ljava/util/Map;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/withpersona/sdk2/inquiry/document/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/b;->k(Lcom/withpersona/sdk2/inquiry/document/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/withpersona/sdk2/inquiry/document/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/b;->j(Lcom/withpersona/sdk2/inquiry/document/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lar/a;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/b;->i(Lkotlin/jvm/functions/Function1;Lar/a;Landroid/view/View;)V

    return-void
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;Lar/a;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p1}, Lar/a;->c()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final j(Lcom/withpersona/sdk2/inquiry/document/b;)Lkotlin/Unit;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/document/b;->d:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final k(Lcom/withpersona/sdk2/inquiry/document/b;)Lkotlin/Unit;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/document/b;->e:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final l(Lnq/b;Ljava/util/Map;)Lkotlin/Unit;
    .locals 8

    const-string v0, "binding"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lnq/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string p0, "getRoot(...)"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lwq/g;->d(Landroid/view/View;ZZZZILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public a()Lan/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lan/a0<",
            "Lcom/withpersona/sdk2/inquiry/document/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/b;->i:Lan/a0;

    return-object v0
.end method

.method public b()Lar/p;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/b;->f:Lar/p;

    return-object v0
.end method

.method public final g()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/b;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    return-object v0
.end method

.method public final h(Lnq/b;Lcom/withpersona/sdk2/inquiry/document/b;Ljava/util/Map;)V
    .locals 26
    .param p1    # Lnq/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/document/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnq/b;",
            "Lcom/withpersona/sdk2/inquiry/document/b;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lar/a;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "binding"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "rendering"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "componentNameToComponentView"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p0

    iget-object v4, v3, Lcom/withpersona/sdk2/inquiry/document/b;->b:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlin/Pair;

    invoke-virtual {v5}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v5}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lar/a;

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lar/a;->d()Landroid/view/View;

    move-result-object v7

    new-instance v8, Lzn/c;

    invoke-direct {v8, v5, v6}, Lzn/c;-><init>(Lkotlin/jvm/functions/Function1;Lar/a;)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    iget-object v9, v1, Lcom/withpersona/sdk2/inquiry/document/b;->c:Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    new-instance v10, Lzn/d;

    invoke-direct {v10, v1}, Lzn/d;-><init>(Lcom/withpersona/sdk2/inquiry/document/b;)V

    new-instance v11, Lzn/e;

    invoke-direct {v11, v1}, Lzn/e;-><init>(Lcom/withpersona/sdk2/inquiry/document/b;)V

    iget-object v13, v0, Lnq/b;->e:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    const-string v2, "navigationBar"

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lnq/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v14

    const-string v2, "getRoot(...)"

    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/document/b;->h:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    invoke-static {v2}, Ler/h;->h(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)Landroid/graphics/Rect;

    move-result-object v2

    move-object v15, v2

    goto :goto_1

    :cond_2
    move-object v15, v4

    :goto_1
    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/document/b;->g:Ljava/lang/String;

    iget-object v5, v1, Lcom/withpersona/sdk2/inquiry/document/b;->h:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;->getNavBarTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v4

    :cond_3
    move-object/from16 v17, v4

    const/16 v18, 0x8

    const/16 v19, 0x0

    const/4 v12, 0x0

    move-object/from16 v16, v2

    invoke-static/range {v9 .. v19}, Lir/c;->e(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/view/View;Landroid/graphics/Rect;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;ILjava/lang/Object;)V

    iget-object v0, v0, Lnq/b;->b:Landroid/widget/FrameLayout;

    const-string v2, "contentContainer"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/document/b;->h:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    const/16 v24, 0x6

    const/16 v25, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, v0

    move-object/from16 v21, v1

    invoke-static/range {v20 .. v25}, Ljr/p;->b(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZZILjava/lang/Object;)V

    return-void
.end method
