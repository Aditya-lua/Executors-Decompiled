.class public final Lcom/withpersona/sdk2/inquiry/ui/g$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/ui/g;->H0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Lan/y;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
        "Lnt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.ui.UiScreenRunner$updateRendering$15$1$1"
    f = "UiScreenRunner.kt"
    l = {
        0x34d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Le3/o;

.field public final synthetic v:Landroid/view/View;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;

.field public final synthetic x:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;


# direct methods
.method public constructor <init>(Le3/o;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le3/o;",
            "Landroid/view/View;",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/ui/g$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->u:Le3/o;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->v:Landroid/view/View;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->w:Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->x:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/g$c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->u:Le3/o;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->v:Landroid/view/View;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->w:Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->x:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/ui/g$c;-><init>(Le3/o;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g$c;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/ui/g$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lf3/n; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->u:Le3/o;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->v:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "getContext(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Le3/k0;

    new-instance v3, Le3/n0;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->w:Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;

    check-cast v5, Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata$GoogleWalletRequestMetadata;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata$GoogleWalletRequestMetadata;->a()Ljava/lang/String;

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

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->t:I

    invoke-interface {p1, v1, v4, p0}, Le3/o;->b(Landroid/content/Context;Le3/k0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Le3/l0;

    invoke-virtual {p1}, Le3/l0;->a()Le3/m;

    move-result-object p1

    invoke-static {p1}, Lor/m1;->a(Le3/m;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->x:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;->m()Lan/r;

    move-result-object v0

    invoke-interface {v0, p1}, Lan/r;->c(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->x:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;->k()Lan/r;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->x:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;->g()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lan/r;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Lf3/n; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->x:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;->k()Lan/r;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g$c;->x:Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;->g()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lan/r;->c(Ljava/lang/String;)V

    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
