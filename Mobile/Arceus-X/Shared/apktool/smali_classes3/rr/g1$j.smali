.class public final Lrr/g1$j;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrr/g1;->S(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function1<",
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

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$handleState$6$1"
    f = "UiStepStateManager.kt"
    l = {
        0x128
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;

.field public final synthetic v:Lrr/g1;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/ui/UiState;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;",
            "Lrr/g1;",
            "Lcom/withpersona/sdk2/inquiry/ui/UiState;",
            "Lnt/b<",
            "-",
            "Lrr/g1$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrr/g1$j;->u:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;

    iput-object p2, p0, Lrr/g1$j;->v:Lrr/g1;

    iput-object p3, p0, Lrr/g1$j;->w:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lrr/g1$j;

    iget-object v1, p0, Lrr/g1$j;->u:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;

    iget-object v2, p0, Lrr/g1$j;->v:Lrr/g1;

    iget-object v3, p0, Lrr/g1$j;->w:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    invoke-direct {v0, v1, v2, v3, p1}, Lrr/g1$j;-><init>(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lrr/g1$j;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lrr/g1$j;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iput v3, v0, Lrr/g1$j;->t:I

    const-wide/16 v4, 0x3e8

    invoke-static {v4, v5, v0}, Lku/z0;->b(JLnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    iget-object v1, v0, Lrr/g1$j;->u:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;->f()I

    move-result v1

    sub-int/2addr v1, v3

    iget-object v2, v0, Lrr/g1$j;->v:Lrr/g1;

    iget-object v3, v0, Lrr/g1$j;->w:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    move-object v4, v3

    check-cast v4, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    new-instance v12, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;

    iget-object v3, v0, Lrr/g1$j;->u:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;->a()Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;

    move-result-object v3

    iget-object v5, v0, Lrr/g1$j;->u:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;->a()Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;

    move-result-object v5

    invoke-interface {v5}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;->getAutoSubmitCountdownText()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, "{time}"

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/x;->N(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    :goto_1
    invoke-direct {v12, v3, v1, v5}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;ILjava/lang/String;)V

    const v23, 0x3ff7f

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v4 .. v24}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;->v(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;ZZLjava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    move-result-object v1

    invoke-static {v2, v1}, Lrr/g1;->L(Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1
.end method

.method public final q(Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lrr/g1$j;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lrr/g1$j;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lrr/g1$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
