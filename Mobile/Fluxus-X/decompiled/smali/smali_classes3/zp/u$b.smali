.class public final Lzp/u$b;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzp/u;->run()Ldv/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Ldv/i<",
        "-",
        "Lzp/i;",
        ">;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.jpmynumber.ScanJpMyNumberNfcWorker$run$1"
    f = "ScanJpMyNumberNfcWorker.kt"
    l = {
        0x41,
        0x45,
        0x4e
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldv/i;",
        "Lzp/i;",
        "",
        "<anonymous>",
        "(Ldv/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lzp/u;


# direct methods
.method public constructor <init>(Lzp/u;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzp/u;",
            "Leu/b<",
            "-",
            "Lzp/u$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzp/u$b;->x:Lzp/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
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

    new-instance v0, Lzp/u$b;

    iget-object v1, p0, Lzp/u$b;->x:Lzp/u;

    invoke-direct {v0, v1, p2}, Lzp/u$b;-><init>(Lzp/u;Leu/b;)V

    iput-object p1, v0, Lzp/u$b;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldv/i;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lzp/u$b;->m(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lzp/u$b;->w:Ljava/lang/Object;

    check-cast v0, Ldv/i;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lzp/u$b;->v:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lzp/u$b;->u:Ljava/lang/Object;

    check-cast v0, Lzp/i;

    iget-object v0, p0, Lzp/u$b;->t:Ljava/lang/Object;

    check-cast v0, Lzp/m;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Lzp/u$b;->u:Ljava/lang/Object;

    check-cast v2, Lzp/i;

    iget-object v4, p0, Lzp/u$b;->t:Ljava/lang/Object;

    check-cast v4, Lzp/m;

    :try_start_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_3

    :cond_2
    iget-object v2, p0, Lzp/u$b;->t:Ljava/lang/Object;

    check-cast v2, Lzp/m;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Lzp/n;->a:Lzp/n;

    new-instance v2, Lzp/n$a;

    iget-object v6, p0, Lzp/u$b;->x:Lzp/u;

    invoke-static {v6}, Lzp/u;->m(Lzp/u;)Lzp/r;

    move-result-object v6

    invoke-virtual {v6}, Lzp/r;->d()Ljava/util/List;

    move-result-object v6

    iget-object v7, p0, Lzp/u$b;->x:Lzp/u;

    invoke-static {v7}, Lzp/u;->m(Lzp/u;)Lzp/r;

    move-result-object v7

    invoke-virtual {v7}, Lzp/r;->b()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lzp/u$b;->x:Lzp/u;

    invoke-static {v8}, Lzp/u;->m(Lzp/u;)Lzp/r;

    move-result-object v8

    invoke-virtual {v8}, Lzp/r;->a()Lzp/a;

    move-result-object v8

    invoke-direct {v2, v6, v7, v8}, Lzp/n$a;-><init>(Ljava/util/List;Ljava/lang/String;Lzp/a;)V

    invoke-virtual {p1, v2}, Lzp/n;->a(Lzp/n$a;)V

    iget-object p1, p0, Lzp/u$b;->x:Lzp/u;

    invoke-static {p1}, Lzp/u;->h(Lzp/u;)Lkq/c;

    move-result-object p1

    invoke-virtual {p1}, Lkq/c;->c()Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, Lzp/m;->c:Lzp/m;

    :goto_0
    move-object v13, p1

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lzp/u$b;->x:Lzp/u;

    invoke-static {p1}, Lzp/u;->g(Lzp/u;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Lzp/m;->b:Lzp/m;

    goto :goto_0

    :cond_5
    sget-object p1, Lzp/m;->a:Lzp/m;

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lzp/u$b;->x:Lzp/u;

    invoke-static {p1}, Lzp/u;->f(Lzp/u;)Lg/d;

    move-result-object p1

    new-instance v6, Lzp/c;

    iget-object v2, p0, Lzp/u$b;->x:Lzp/u;

    invoke-static {v2}, Lzp/u;->m(Lzp/u;)Lzp/r;

    move-result-object v2

    invoke-virtual {v2}, Lzp/r;->c()Lzp/b;

    move-result-object v7

    iget-object v2, p0, Lzp/u$b;->x:Lzp/u;

    invoke-static {v2}, Lzp/u;->j(Lzp/u;)Lzp/p;

    move-result-object v8

    iget-object v2, p0, Lzp/u$b;->x:Lzp/u;

    invoke-static {v2}, Lzp/u;->l(Lzp/u;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;

    move-result-object v9

    iget-object v2, p0, Lzp/u$b;->x:Lzp/u;

    invoke-static {v2}, Lzp/u;->d(Lzp/u;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;

    move-result-object v10

    iget-object v2, p0, Lzp/u$b;->x:Lzp/u;

    invoke-static {v2}, Lzp/u;->i(Lzp/u;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    move-result-object v11

    iget-object v2, p0, Lzp/u$b;->x:Lzp/u;

    invoke-static {v2}, Lzp/u;->k(Lzp/u;)Ljava/lang/Integer;

    move-result-object v12

    invoke-direct/range {v6 .. v13}, Lzp/c;-><init>(Lzp/b;Lzp/p;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Lzp/m;)V

    invoke-virtual {p1, v6}, Lg/d;->b(Ljava/lang/Object;)V

    new-instance p1, Lzp/j;

    invoke-direct {p1}, Lzp/j;-><init>()V

    iput-object v0, p0, Lzp/u$b;->w:Ljava/lang/Object;

    invoke-static {v13}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lzp/u$b;->t:Ljava/lang/Object;

    iput v5, p0, Lzp/u$b;->v:I

    invoke-static {p1, p0}, Ldv/j;->t(Ldv/h;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    move-object v2, v13

    :goto_2
    check-cast p1, Lzp/i;

    :try_start_1
    iget-object v5, p0, Lzp/u$b;->x:Lzp/u;

    invoke-static {v5}, Lzp/u;->e(Lzp/u;)Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lzp/s;->a:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v5

    int-to-long v5, v5

    iput-object v0, p0, Lzp/u$b;->w:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lzp/u$b;->t:Ljava/lang/Object;

    iput-object p1, p0, Lzp/u$b;->u:Ljava/lang/Object;

    iput v4, p0, Lzp/u$b;->v:I

    invoke-static {v5, v6, p0}, Lav/z0;->b(JLeu/b;)Ljava/lang/Object;

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
    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lzp/u$b;->w:Ljava/lang/Object;

    invoke-static {v4}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lzp/u$b;->t:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lzp/u$b;->u:Ljava/lang/Object;

    iput v3, p0, Lzp/u$b;->v:I

    invoke-interface {v0, v2, p0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_4
    return-object v1

    :cond_8
    :goto_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final m(Ldv/i;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/i<",
            "-",
            "Lzp/i;",
            ">;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lzp/u$b;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lzp/u$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lzp/u$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
