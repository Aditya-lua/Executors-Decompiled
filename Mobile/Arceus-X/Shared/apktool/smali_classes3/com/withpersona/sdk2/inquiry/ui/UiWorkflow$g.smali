.class public final Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->G0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lym/k$a;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$4$1"
    f = "UiWorkflow.kt"
    l = {
        0xbc
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lym/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lym/k<",
            "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/ui/UiState;",
            "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;",
            "Ljava/lang/Object;",
            ">.a;"
        }
    .end annotation
.end field

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;

.field public final synthetic x:Lcom/withpersona/sdk2/inquiry/ui/UiState;


# direct methods
.method public constructor <init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/ui/UiState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;",
            "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;",
            "Lcom/withpersona/sdk2/inquiry/ui/UiState;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->u:Lym/k$a;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->v:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->w:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->x:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method

.method public static synthetic q(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->r(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lym/r$c;)Lkotlin/Unit;
    .locals 22

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;->f()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move-object/from16 v1, p1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    new-instance v9, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;->a()Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;->a()Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;

    move-result-object v3

    invoke-interface {v3}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;->getAutoSubmitCountdownText()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x4

    const/4 v15, 0x0

    const-string v11, "{time}"

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lkotlin/text/x;->N(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-direct {v9, v2, v0, v3}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;ILjava/lang/String;)V

    const v20, 0x3ff7f

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v1 .. v21}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;->v(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;ZZLjava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->u:Lym/k$a;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->v:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->w:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->x:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->t:I

    const-wide/16 v3, 0x3e8

    invoke-static {v3, v4, p0}, Lku/z0;->b(JLnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->u:Lym/k$a;

    invoke-virtual {p1}, Lym/k$a;->d()Lym/h;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->v:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->w:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$g;->x:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    new-instance v4, Lor/i6;

    invoke-direct {v4, v1, v3}, Lor/i6;-><init>(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState;)V

    const/4 v1, 0x0

    invoke-static {v0, v1, v4, v2, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
