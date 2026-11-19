.class public final Lhs/g1$i;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhs/g1;->S(Les/s6$b;Les/i4;Leu/b;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$handleState$5$1"
    f = "UiStepStateManager.kt"
    l = {}
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

.field public final synthetic u:Lhs/g1;

.field public final synthetic v:Les/i4;

.field public final synthetic w:Lqr/i;


# direct methods
.method public constructor <init>(Lhs/g1;Les/i4;Lqr/i;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhs/g1;",
            "Les/i4;",
            "Lqr/i;",
            "Leu/b<",
            "-",
            "Lhs/g1$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhs/g1$i;->u:Lhs/g1;

    iput-object p2, p0, Lhs/g1$i;->v:Les/i4;

    iput-object p3, p0, Lhs/g1$i;->w:Lqr/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Leu/b;)Leu/b;
    .locals 4
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

    new-instance v0, Lhs/g1$i;

    iget-object v1, p0, Lhs/g1$i;->u:Lhs/g1;

    iget-object v2, p0, Lhs/g1$i;->v:Les/i4;

    iget-object v3, p0, Lhs/g1$i;->w:Lqr/i;

    invoke-direct {v0, v1, v2, v3, p1}, Lhs/g1$i;-><init>(Lhs/g1;Les/i4;Lqr/i;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lhs/g1$i;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v1, v0, Lhs/g1$i;->t:I

    if-nez v1, :cond_1

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object v1, v0, Lhs/g1$i;->u:Lhs/g1;

    iget-object v2, v0, Lhs/g1$i;->v:Les/i4;

    move-object v3, v2

    check-cast v3, Les/i4$a;

    new-instance v11, Les/i4$a$a;

    iget-object v2, v0, Lhs/g1$i;->w:Lqr/i;

    invoke-interface {v2}, Lqr/i;->getAutoSubmitIntervalSeconds()Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v5, v0, Lhs/g1$i;->w:Lqr/i;

    invoke-interface {v5}, Lqr/i;->getAutoSubmitCountdownText()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_0

    iget-object v5, v0, Lhs/g1$i;->w:Lqr/i;

    invoke-interface {v5}, Lqr/i;->getAutoSubmitIntervalSeconds()Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v14

    const/16 v16, 0x4

    const/16 v17, 0x0

    const-string v13, "{time}"

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lkotlin/text/x;->N(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    invoke-direct {v11, v2, v4, v5}, Les/i4$a$a;-><init>(Lqr/d;ILjava/lang/String;)V

    const v22, 0x3ff7f

    const/16 v23, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v3 .. v23}, Les/i4$a;->v(Les/i4$a;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Les/i4$a$d;Les/i4$a$c;Les/i4$a$a;Les/i4$b;ZZLjava/util/Map;Lqr/x5;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/Object;)Les/i4$a;

    move-result-object v2

    invoke-static {v1, v2}, Lhs/g1;->L(Lhs/g1;Les/i4;)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
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

    invoke-virtual {p0, p1}, Lhs/g1$i;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lhs/g1$i;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lhs/g1$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
