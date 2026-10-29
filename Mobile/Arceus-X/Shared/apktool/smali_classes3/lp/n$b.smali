.class public final Llp/n$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llp/n;->run()Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lnu/i<",
        "-",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;",
        ">;",
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lnu/i;",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;",
        "",
        "<anonymous>",
        "(Lnu/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.jpmynumber.ScanJpMyNumberNfcWorker$run$1"
    f = "ScanJpMyNumberNfcWorker.kt"
    l = {
        0x41,
        0x45,
        0x4e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Llp/n;


# direct methods
.method public constructor <init>(Llp/n;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llp/n;",
            "Lnt/b<",
            "-",
            "Llp/n$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llp/n$b;->x:Llp/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
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

    new-instance v0, Llp/n$b;

    iget-object v1, p0, Llp/n$b;->x:Llp/n;

    invoke-direct {v0, v1, p2}, Llp/n$b;-><init>(Llp/n;Lnt/b;)V

    iput-object p1, v0, Llp/n$b;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Llp/n$b;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Llp/n$b;->w:Ljava/lang/Object;

    check-cast v0, Lnu/i;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Llp/n$b;->v:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Llp/n$b;->u:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;

    iget-object v0, p0, Llp/n$b;->t:Ljava/lang/Object;

    check-cast v0, Llp/h;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Llp/n$b;->u:Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;

    iget-object v4, p0, Llp/n$b;->t:Ljava/lang/Object;

    check-cast v4, Llp/h;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_3

    :cond_2
    iget-object v2, p0, Llp/n$b;->t:Ljava/lang/Object;

    check-cast v2, Llp/h;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Llp/i;->a:Llp/i;

    new-instance v2, Llp/i$a;

    iget-object v6, p0, Llp/n$b;->x:Llp/n;

    invoke-static {v6}, Llp/n;->m(Llp/n;)Llp/k;

    move-result-object v6

    invoke-virtual {v6}, Llp/k;->d()Ljava/util/List;

    move-result-object v6

    iget-object v7, p0, Llp/n$b;->x:Llp/n;

    invoke-static {v7}, Llp/n;->m(Llp/n;)Llp/k;

    move-result-object v7

    invoke-virtual {v7}, Llp/k;->b()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Llp/n$b;->x:Llp/n;

    invoke-static {v8}, Llp/n;->m(Llp/n;)Llp/k;

    move-result-object v8

    invoke-virtual {v8}, Llp/k;->a()Llp/a;

    move-result-object v8

    invoke-direct {v2, v6, v7, v8}, Llp/i$a;-><init>(Ljava/util/List;Ljava/lang/String;Llp/a;)V

    invoke-virtual {p1, v2}, Llp/i;->a(Llp/i$a;)V

    iget-object p1, p0, Llp/n$b;->x:Llp/n;

    invoke-static {p1}, Llp/n;->h(Llp/n;)Lwp/c;

    move-result-object p1

    invoke-virtual {p1}, Lwp/c;->c()Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, Llp/h;->c:Llp/h;

    :goto_0
    move-object v13, p1

    goto :goto_1

    :cond_4
    iget-object p1, p0, Llp/n$b;->x:Llp/n;

    invoke-static {p1}, Llp/n;->g(Llp/n;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Llp/h;->b:Llp/h;

    goto :goto_0

    :cond_5
    sget-object p1, Llp/h;->a:Llp/h;

    goto :goto_0

    :goto_1
    iget-object p1, p0, Llp/n$b;->x:Llp/n;

    invoke-static {p1}, Llp/n;->f(Llp/n;)Lg/c;

    move-result-object p1

    new-instance v6, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderConfig;

    iget-object v2, p0, Llp/n$b;->x:Llp/n;

    invoke-static {v2}, Llp/n;->m(Llp/n;)Llp/k;

    move-result-object v2

    invoke-virtual {v2}, Llp/k;->c()Llp/b;

    move-result-object v7

    iget-object v2, p0, Llp/n$b;->x:Llp/n;

    invoke-static {v2}, Llp/n;->j(Llp/n;)Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;

    move-result-object v8

    iget-object v2, p0, Llp/n$b;->x:Llp/n;

    invoke-static {v2}, Llp/n;->l(Llp/n;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;

    move-result-object v9

    iget-object v2, p0, Llp/n$b;->x:Llp/n;

    invoke-static {v2}, Llp/n;->d(Llp/n;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;

    move-result-object v10

    iget-object v2, p0, Llp/n$b;->x:Llp/n;

    invoke-static {v2}, Llp/n;->i(Llp/n;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    move-result-object v11

    iget-object v2, p0, Llp/n$b;->x:Llp/n;

    invoke-static {v2}, Llp/n;->k(Llp/n;)Ljava/lang/Integer;

    move-result-object v12

    invoke-direct/range {v6 .. v13}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderConfig;-><init>(Llp/b;Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Llp/h;)V

    invoke-virtual {p1, v6}, Lg/c;->b(Ljava/lang/Object;)V

    new-instance p1, Llp/g;

    invoke-direct {p1}, Llp/g;-><init>()V

    iput-object v0, p0, Llp/n$b;->w:Ljava/lang/Object;

    invoke-static {v13}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Llp/n$b;->t:Ljava/lang/Object;

    iput v5, p0, Llp/n$b;->v:I

    invoke-static {p1, p0}, Lnu/j;->u(Lnu/h;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    move-object v2, v13

    :goto_2
    check-cast p1, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;

    :try_start_1
    iget-object v5, p0, Llp/n$b;->x:Llp/n;

    invoke-static {v5}, Llp/n;->e(Llp/n;)Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Llp/l;->a:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v5

    int-to-long v5, v5

    iput-object v0, p0, Llp/n$b;->w:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Llp/n$b;->t:Ljava/lang/Object;

    iput-object p1, p0, Llp/n$b;->u:Ljava/lang/Object;

    iput v4, p0, Llp/n$b;->v:I

    invoke-static {v5, v6, p0}, Lku/z0;->b(JLnt/b;)Ljava/lang/Object;

    move-result-object v4
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v4, v1, :cond_7

    goto :goto_4

    :catch_0
    :cond_7
    move-object v4, v2

    move-object v2, p1

    :catch_1
    :goto_3
    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Llp/n$b;->w:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Llp/n$b;->t:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Llp/n$b;->u:Ljava/lang/Object;

    iput v3, p0, Llp/n$b;->v:I

    invoke-interface {v0, v2, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_4
    return-object v1

    :cond_8
    :goto_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Llp/n$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Llp/n$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Llp/n$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
