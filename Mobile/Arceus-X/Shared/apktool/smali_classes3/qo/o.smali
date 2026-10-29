.class public final Lqo/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lnq/b;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;",
        "rendering",
        "",
        "d",
        "(Lnq/b;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;)V",
        "government-id_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lqo/o;->f(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lqo/o;->e(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lnq/b;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;)V
    .locals 0

    invoke-static {p0, p1}, Lqo/o;->d(Lnq/b;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;)V

    return-void
.end method

.method public static final d(Lnq/b;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;)V
    .locals 11

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;->d()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v0

    new-instance v1, Lqo/m;

    invoke-direct {v1, p1}, Lqo/m;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;)V

    new-instance v2, Lqo/n;

    invoke-direct {v2, p1}, Lqo/n;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;)V

    iget-object v4, p0, Lnq/b;->e:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    const-string v3, "navigationBar"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lnq/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v5

    const-string p0, "getRoot(...)"

    invoke-static {v5, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;->g()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object p0

    const/4 v3, 0x0

    if-eqz p0, :cond_0

    invoke-static {p0}, Ler/h;->h(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)Landroid/graphics/Rect;

    move-result-object p0

    move-object v6, p0

    goto :goto_0

    :cond_0
    move-object v6, v3

    :goto_0
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;->g()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;->getNavBarTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v3

    :cond_1
    move-object v8, v3

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v10}, Lir/c;->e(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/view/View;Landroid/graphics/Rect;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;ILjava/lang/Object;)V

    return-void
.end method

.method public static final e(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;->e()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final f(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;->f()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
