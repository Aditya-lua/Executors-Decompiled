.class public final Lto/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lto/q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lan/k<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Lto/q;",
        "Lan/k;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;",
        "Lto/k;",
        "viewController",
        "<init>",
        "(Lto/k;)V",
        "rendering",
        "Lan/y;",
        "viewEnvironment",
        "",
        "f",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;Lan/y;)V",
        "b",
        "Lto/k;",
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
.field public static final c:Lto/q$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Lto/k;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lto/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lto/q$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lto/q;->c:Lto/q$a;

    return-void
.end method

.method public constructor <init>(Lto/k;)V
    .locals 1
    .param p1    # Lto/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lto/q;->b:Lto/k;

    invoke-interface {p1}, Lto/k;->a()V

    return-void
.end method

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lto/q;->i(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lto/q;->j(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lto/q;->g(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lto/q;->h(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->c()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final h(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->u()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final i(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->g()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->s()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lan/y;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;

    invoke-virtual {p0, p1, p2}, Lto/q;->f(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;Lan/y;)V

    return-void
.end method

.method public f(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;Lan/y;)V
    .locals 26
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;
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

    move-object/from16 v4, p2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lto/q;->b:Lto/k;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->m()Lk6/s;

    move-result-object v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->n()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->p()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->j()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->d()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->v()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->h()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->t()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;

    move-result-object v12

    iget-object v2, v0, Lto/q;->b:Lto/k;

    invoke-interface {v2}, Lto/k;->getRoot()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v13, "getContext(...)"

    invoke-static {v2, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->t()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;

    move-result-object v13

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->f()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v14

    invoke-static {v2, v13, v14}, Lcom/withpersona/sdk2/inquiry/governmentid/o;->b(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lio/k2;

    move-result-object v13

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->e()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->l()Lpo/b;

    move-result-object v14

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->f()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v15

    invoke-static {v2, v14, v15}, Lcom/withpersona/sdk2/inquiry/governmentid/a;->a(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;Lpo/b;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v2

    :goto_0
    move-object v14, v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->r()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v15

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->z()Z

    move-result v16

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->y()Z

    move-result v17

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->x()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v18

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->k()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->w()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;

    move-result-object v20

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;->q()Ljava/lang/String;

    move-result-object v21

    new-instance v2, Lto/l;

    invoke-direct {v2, v1}, Lto/l;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)V

    new-instance v0, Lto/m;

    invoke-direct {v0, v1}, Lto/m;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)V

    move-object/from16 v23, v0

    new-instance v0, Lto/n;

    invoke-direct {v0, v1}, Lto/n;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)V

    move-object/from16 v24, v0

    new-instance v0, Lto/o;

    invoke-direct {v0, v1}, Lto/o;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)V

    move-object/from16 v25, v0

    move-object/from16 v22, v2

    invoke-interface/range {v3 .. v25}, Lto/k;->b(Lan/y;Lk6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lio/k2;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;ZZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
