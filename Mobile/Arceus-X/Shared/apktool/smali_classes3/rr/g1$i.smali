.class public final Lrr/g1$i;
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
    c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$handleState$5$1"
    f = "UiStepStateManager.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lrr/g1;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/ui/UiState;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;


# direct methods
.method public constructor <init>(Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrr/g1;",
            "Lcom/withpersona/sdk2/inquiry/ui/UiState;",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;",
            "Lnt/b<",
            "-",
            "Lrr/g1$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrr/g1$i;->u:Lrr/g1;

    iput-object p2, p0, Lrr/g1$i;->v:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iput-object p3, p0, Lrr/g1$i;->w:Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;

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

    new-instance v0, Lrr/g1$i;

    iget-object v1, p0, Lrr/g1$i;->u:Lrr/g1;

    iget-object v2, p0, Lrr/g1$i;->v:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    iget-object v3, p0, Lrr/g1$i;->w:Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;

    invoke-direct {v0, v1, v2, v3, p1}, Lrr/g1$i;-><init>(Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lrr/g1$i;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v1, v0, Lrr/g1$i;->t:I

    if-nez v1, :cond_1

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v1, v0, Lrr/g1$i;->u:Lrr/g1;

    iget-object v2, v0, Lrr/g1$i;->v:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    move-object v3, v2

    check-cast v3, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    new-instance v11, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;

    iget-object v2, v0, Lrr/g1$i;->w:Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;->getAutoSubmitIntervalSeconds()Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v5, v0, Lrr/g1$i;->w:Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;

    invoke-interface {v5}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;->getAutoSubmitCountdownText()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_0

    iget-object v5, v0, Lrr/g1$i;->w:Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;

    invoke-interface {v5}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;->getAutoSubmitIntervalSeconds()Ljava/lang/Integer;

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
    invoke-direct {v11, v2, v4, v5}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;ILjava/lang/String;)V

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

    invoke-static/range {v3 .. v23}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;->v(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;ZZLjava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    move-result-object v2

    invoke-static {v1, v2}, Lrr/g1;->L(Lrr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState;)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
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

    invoke-virtual {p0, p1}, Lrr/g1$i;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lrr/g1$i;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lrr/g1$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
