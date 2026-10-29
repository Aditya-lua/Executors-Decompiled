.class public final Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan/b;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lan/b<",
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012$\u0010\u0010\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00080\u000e0\u000c0\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ3\u0010#\u001a\u00020\u00082\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00002\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0 H\u0002\u00a2\u0006\u0004\u0008#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u00081\u0010.\u001a\u0004\u00082\u00100R5\u0010\u0010\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00080\u000e0\u000c0\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106R\u0017\u0010\u0012\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u00087\u00108\u001a\u0004\u0008\u0012\u00109R&\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\u00000:8\u0016X\u0096\u0004\u00a2\u0006\u0012\n\u0004\u0008;\u0010<\u0012\u0004\u0008>\u0010?\u001a\u0004\u0008%\u0010=\u00a8\u0006A"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;",
        "Lan/b;",
        "Landroid/os/Parcelable;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;",
        "uiScreen",
        "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;",
        "navigationState",
        "Lkotlin/Function0;",
        "",
        "onBack",
        "onCancel",
        "",
        "Lkotlin/Pair;",
        "",
        "Lkotlin/Function1;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
        "componentNameToAction",
        "",
        "isLoading",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/List;Z)V",
        "",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "Lnq/b;",
        "binding",
        "rendering",
        "",
        "Lar/a;",
        "componentNameToComponentView",
        "m",
        "(Lnq/b;Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;Ljava/util/Map;)V",
        "a",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;",
        "getUiScreen",
        "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;",
        "b",
        "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;",
        "getNavigationState",
        "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;",
        "c",
        "Lkotlin/jvm/functions/Function0;",
        "getOnBack",
        "()Lkotlin/jvm/functions/Function0;",
        "d",
        "getOnCancel",
        "e",
        "Ljava/util/List;",
        "getComponentNameToAction",
        "()Ljava/util/List;",
        "f",
        "Z",
        "()Z",
        "Lan/a0;",
        "g",
        "Lan/a0;",
        "()Lan/a0;",
        "getViewFactory$annotations",
        "()V",
        "viewFactory",
        "integration_release"
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lkotlin/jvm/functions/Function0;
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

.field public final e:Ljava/util/List;
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

.field public final f:Z

.field public final g:Lan/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lan/a0<",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$a;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$a;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/List;Z)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;",
            "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            "Lkotlin/Unit;",
            ">;>;>;Z)V"
        }
    .end annotation

    const-string v0, "uiScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBack"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCancel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "componentNameToAction"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->b:Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->c:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->d:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->e:Ljava/util/List;

    iput-boolean p6, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->f:Z

    sget-object p2, Lar/s;->a:Lar/s;

    new-instance p2, Lxo/f;

    invoke-direct {p2}, Lxo/f;-><init>()V

    new-instance p3, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$d;

    invoke-direct {p3, p0}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$d;-><init>(Ljava/lang/Object;)V

    sget-object p4, Lan/k;->a:Lan/k$a;

    sget-object p4, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$b;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$b;

    new-instance p5, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c;

    const/4 p6, 0x1

    invoke-direct {p5, p1, p2, p6, p3}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lkotlin/jvm/functions/Function2;ZLzt/n;)V

    new-instance p1, Lan/x;

    const-class p2, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;

    invoke-static {p2}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object p2

    invoke-direct {p1, p2, p4, p5}, Lan/x;-><init>(Lhu/c;Lzt/n;Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->g:Lan/a0;

    return-void
.end method

.method public static synthetic f(Lnq/b;Ljava/util/Map;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->q(Lnq/b;Ljava/util/Map;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->o(Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->p(Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Lar/a;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->n(Lkotlin/jvm/functions/Function1;Lar/a;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic k(Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;Lnq/b;Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;Ljava/util/Map;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->m(Lnq/b;Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;Ljava/util/Map;)V

    return-void
.end method

.method public static final n(Lkotlin/jvm/functions/Function1;Lar/a;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p1}, Lar/a;->c()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final o(Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;)Lkotlin/Unit;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->c:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final p(Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;)Lkotlin/Unit;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->d:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final q(Lnq/b;Ljava/util/Map;)Lkotlin/Unit;
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
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->g:Lan/a0;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final m(Lnq/b;Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;Ljava/util/Map;)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnq/b;",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lar/a;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p0

    iget-object v3, v2, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/Pair;

    invoke-virtual {v4}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object/from16 v6, p3

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lar/a;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lar/a;->d()Landroid/view/View;

    move-result-object v7

    new-instance v8, Lxo/g;

    invoke-direct {v8, v4, v5}, Lxo/g;-><init>(Lkotlin/jvm/functions/Function1;Lar/a;)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v5}, Lar/a;->c()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    move-result-object v4

    instance-of v4, v4, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ActionButtonComponent;

    if-eqz v4, :cond_0

    invoke-virtual {v5}, Lar/a;->d()Landroid/view/View;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    iget-boolean v5, v1, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->f:Z

    invoke-virtual {v4, v5}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setIsLoading(Z)V

    goto :goto_0

    :cond_1
    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->b:Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    new-instance v7, Lxo/h;

    invoke-direct {v7, v1}, Lxo/h;-><init>(Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;)V

    new-instance v8, Lxo/i;

    invoke-direct {v8, v1}, Lxo/i;-><init>(Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;)V

    iget-object v10, v0, Lnq/b;->e:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    const-string v3, "navigationBar"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lnq/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v11

    const-string v3, "getRoot(...)"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v3}, Ler/h;->h(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)Landroid/graphics/Rect;

    move-result-object v3

    :goto_1
    move-object v12, v3

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    goto :goto_1

    :goto_2
    const/16 v15, 0x188

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v6 .. v16}, Lir/c;->e(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/view/View;Landroid/graphics/Rect;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;ILjava/lang/Object;)V

    iget-object v0, v0, Lnq/b;->b:Landroid/widget/FrameLayout;

    const-string v3, "contentContainer"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    move-result-object v18

    const/16 v21, 0x6

    const/16 v22, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v0

    invoke-static/range {v17 .. v22}, Ljr/p;->b(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZZILjava/lang/Object;)V

    return-void
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->a:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->b:Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->c:Lkotlin/jvm/functions/Function0;

    check-cast p2, Ljava/io/Serializable;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->d:Lkotlin/jvm/functions/Function0;

    check-cast p2, Ljava/io/Serializable;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->e:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/Serializable;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    goto :goto_0

    :cond_0
    iget-boolean p2, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;->f:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
