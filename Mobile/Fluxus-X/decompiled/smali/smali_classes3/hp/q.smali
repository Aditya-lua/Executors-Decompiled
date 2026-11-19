.class public final Lhp/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnn/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhp/q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnn/k<",
        "Lvo/y3$i;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Lhp/q;",
        "Lnn/k;",
        "Lvo/y3$i;",
        "Lhp/k;",
        "viewController",
        "<init>",
        "(Lhp/k;)V",
        "rendering",
        "Lnn/z;",
        "viewEnvironment",
        "",
        "f",
        "(Lvo/y3$i;Lnn/z;)V",
        "b",
        "Lhp/k;",
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
.field public static final c:Lhp/q$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Lhp/k;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhp/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhp/q$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhp/q;->c:Lhp/q$a;

    return-void
.end method

.method public constructor <init>(Lhp/k;)V
    .locals 1
    .param p1    # Lhp/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhp/q;->b:Lhp/k;

    invoke-interface {p1}, Lhp/k;->a()V

    return-void
.end method

.method public static synthetic b(Lvo/y3$i;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lhp/q;->i(Lvo/y3$i;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lvo/y3$i;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lhp/q;->j(Lvo/y3$i;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lvo/y3$i;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lhp/q;->g(Lvo/y3$i;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lvo/y3$i;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lhp/q;->h(Lvo/y3$i;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lvo/y3$i;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lvo/y3$i;->c()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final h(Lvo/y3$i;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lvo/y3$i;->u()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final i(Lvo/y3$i;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lvo/y3$i;->g()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j(Lvo/y3$i;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lvo/y3$i;->s()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lnn/z;)V
    .locals 0

    check-cast p1, Lvo/y3$i;

    invoke-virtual {p0, p1, p2}, Lhp/q;->f(Lvo/y3$i;Lnn/z;)V

    return-void
.end method

.method public f(Lvo/y3$i;Lnn/z;)V
    .locals 26
    .param p1    # Lvo/y3$i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnn/z;
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

    iget-object v3, v0, Lhp/q;->b:Lhp/k;

    invoke-virtual {v1}, Lvo/y3$i;->m()Ll6/s;

    move-result-object v5

    invoke-virtual {v1}, Lvo/y3$i;->n()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lvo/y3$i;->p()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lvo/y3$i;->j()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lvo/y3$i;->d()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lvo/y3$i;->v()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lvo/y3$i;->h()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lvo/y3$i;->t()Lvo/y3$f;

    move-result-object v12

    iget-object v2, v0, Lhp/q;->b:Lhp/k;

    invoke-interface {v2}, Lhp/k;->getRoot()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v13, "getContext(...)"

    invoke-static {v2, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lvo/y3$i;->t()Lvo/y3$f;

    move-result-object v13

    invoke-virtual {v1}, Lvo/y3$i;->f()Lvo/d3$e;

    move-result-object v14

    invoke-static {v2, v13, v14}, Lvo/g3;->b(Landroid/content/Context;Lvo/y3$f;Lvo/d3$e;)Lvo/j3;

    move-result-object v13

    invoke-virtual {v1}, Lvo/y3$i;->e()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lvo/y3$i;->l()Ldp/e;

    move-result-object v14

    invoke-virtual {v1}, Lvo/y3$i;->f()Lvo/d3$e;

    move-result-object v15

    invoke-static {v2, v14, v15}, Lvo/a;->a(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;Ldp/e;Lvo/d3$e;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v2

    :goto_0
    move-object v14, v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Lvo/y3$i;->r()Lir/a;

    move-result-object v15

    invoke-virtual {v1}, Lvo/y3$i;->z()Z

    move-result v16

    invoke-virtual {v1}, Lvo/y3$i;->y()Z

    move-result v17

    invoke-virtual {v1}, Lvo/y3$i;->x()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v18

    invoke-virtual {v1}, Lvo/y3$i;->k()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Lvo/y3$i;->w()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;

    move-result-object v20

    invoke-virtual {v1}, Lvo/y3$i;->q()Ljava/lang/String;

    move-result-object v21

    new-instance v2, Lhp/l;

    invoke-direct {v2, v1}, Lhp/l;-><init>(Lvo/y3$i;)V

    new-instance v0, Lhp/m;

    invoke-direct {v0, v1}, Lhp/m;-><init>(Lvo/y3$i;)V

    move-object/from16 v23, v0

    new-instance v0, Lhp/n;

    invoke-direct {v0, v1}, Lhp/n;-><init>(Lvo/y3$i;)V

    move-object/from16 v24, v0

    new-instance v0, Lhp/o;

    invoke-direct {v0, v1}, Lhp/o;-><init>(Lvo/y3$i;)V

    move-object/from16 v25, v0

    move-object/from16 v22, v2

    invoke-interface/range {v3 .. v25}, Lhp/k;->b(Lnn/z;Ll6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo/y3$f;Lvo/j3;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lir/a;ZZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
