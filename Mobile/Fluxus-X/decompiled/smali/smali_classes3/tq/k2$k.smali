.class public final Ltq/k2$k;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltq/k2;->o1(Lmq/q5$b;Lmq/y0$b;)Lmq/q5$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function1<",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCapture$4"
    f = "SelfieStepStateManager.kt"
    l = {
        0x609
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ltq/k2;


# direct methods
.method public constructor <init>(Ltq/k2;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltq/k2;",
            "Leu/b<",
            "-",
            "Ltq/k2$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltq/k2$k;->u:Ltq/k2;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Leu/b;)Leu/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Ltq/k2$k;

    iget-object v1, p0, Ltq/k2$k;->u:Ltq/k2;

    invoke-direct {v0, v1, p1}, Ltq/k2$k;-><init>(Ltq/k2;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Ltq/k2$k;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ltq/k2$k;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iput v3, v0, Ltq/k2$k;->t:I

    const-wide/16 v2, 0xbb8

    invoke-static {v2, v3, v0}, Lav/z0;->b(JLeu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    iget-object v1, v0, Ltq/k2$k;->u:Ltq/k2;

    invoke-virtual {v1}, Lls/d;->d()Lls/g;

    move-result-object v1

    invoke-virtual {v1}, Lls/g;->i()Lls/h;

    move-result-object v1

    instance-of v2, v1, Lmq/y0$b;

    if-eqz v2, :cond_3

    check-cast v1, Lmq/y0$b;

    :goto_1
    move-object v2, v1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    goto :goto_1

    :goto_2
    if-nez v2, :cond_4

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1

    :cond_4
    iget-object v1, v0, Ltq/k2$k;->u:Ltq/k2;

    invoke-virtual {v1}, Lls/d;->d()Lls/g;

    move-result-object v1

    sget-object v18, Lmq/y0$h;->b:Lmq/y0$h;

    const v21, 0xdfff

    const/16 v22, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v2 .. v22}, Lmq/y0$b;->z(Lmq/y0$b;Lxn/c;FLxn/b;Ljava/util/List;Ljava/util/List;JZJLsn/v;Lmq/y0;Lmq/t;Lsn/v$b;ZLmq/y0$h;Ljava/lang/Long;ZILjava/lang/Object;)Lmq/y0$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lls/g;->p(Lls/h;)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1
.end method

.method public final m(Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ltq/k2$k;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Ltq/k2$k;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Ltq/k2$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
