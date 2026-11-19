.class public final Les/h4$c;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/h4;->H0(Les/s6$d$a;Lqr/x5;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Lnn/z;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.ui.UiScreenRunner$updateRendering$15$1$1"
    f = "UiScreenRunner.kt"
    l = {
        0x34d
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Le3/o;

.field public final synthetic v:Landroid/view/View;

.field public final synthetic w:Lwr/a;

.field public final synthetic x:Lqr/x5;


# direct methods
.method public constructor <init>(Le3/o;Landroid/view/View;Lwr/a;Lqr/x5;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le3/o;",
            "Landroid/view/View;",
            "Lwr/a;",
            "Lqr/x5;",
            "Leu/b<",
            "-",
            "Les/h4$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Les/h4$c;->u:Le3/o;

    iput-object p2, p0, Les/h4$c;->v:Landroid/view/View;

    iput-object p3, p0, Les/h4$c;->w:Lwr/a;

    iput-object p4, p0, Les/h4$c;->x:Lqr/x5;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Les/h4$c;

    iget-object v1, p0, Les/h4$c;->u:Le3/o;

    iget-object v2, p0, Les/h4$c;->v:Landroid/view/View;

    iget-object v3, p0, Les/h4$c;->w:Lwr/a;

    iget-object v4, p0, Les/h4$c;->x:Lqr/x5;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Les/h4$c;-><init>(Le3/o;Landroid/view/View;Lwr/a;Lqr/x5;Leu/b;)V

    return-object v0
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Les/h4$c;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Les/h4$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Les/h4$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Les/h4$c;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Les/h4$c;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lf3/n; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Les/h4$c;->u:Le3/o;

    iget-object v1, p0, Les/h4$c;->v:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "getContext(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Le3/k0;

    new-instance v3, Le3/n0;

    iget-object v5, p0, Les/h4$c;->w:Lwr/a;

    check-cast v5, Lwr/a$a;

    invoke-virtual {v5}, Lwr/a$a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Le3/n0;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/16 v10, 0x1e

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Le3/k0;-><init>(Ljava/util/List;Ljava/lang/String;ZLandroid/content/ComponentName;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput v2, p0, Les/h4$c;->t:I

    invoke-interface {p1, v1, v4, p0}, Le3/o;->c(Landroid/content/Context;Le3/k0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Le3/l0;

    invoke-virtual {p1}, Le3/l0;->a()Le3/m;

    move-result-object p1

    invoke-static {p1}, Les/r1;->a(Le3/m;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Les/h4$c;->x:Lqr/x5;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;->l()Lnn/s;

    move-result-object v0

    invoke-interface {v0, p1}, Lnn/s;->c(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Les/h4$c;->x:Lqr/x5;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;->k()Lnn/s;

    move-result-object p1

    iget-object v0, p0, Les/h4$c;->x:Lqr/x5;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;->g()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lnn/s;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Lf3/n; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    iget-object p1, p0, Les/h4$c;->x:Lqr/x5;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;->k()Lnn/s;

    move-result-object p1

    iget-object v0, p0, Les/h4$c;->x:Lqr/x5;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;->g()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lnn/s;->c(Ljava/lang/String;)V

    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
