.class public final Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->n1(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;)V
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
    c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$runGovIdNfcWork$1"
    f = "UiWorkflow.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic A:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;

.field public final synthetic B:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

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

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/util/Date;

.field public final synthetic z:Ljava/util/Date;


# direct methods
.method public constructor <init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lnt/b;)V
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
            "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;",
            "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->u:Lym/k$a;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->v:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->w:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->x:Ljava/lang/String;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->y:Ljava/util/Date;

    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->z:Ljava/util/Date;

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->A:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;

    iput-object p8, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->B:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method

.method public static synthetic q(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->r(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lym/r$c;)Lkotlin/Unit;
    .locals 22

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    if-eqz p0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;->getRequiredText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->m0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lvp/g;->F:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-static/range {p2 .. p2}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "document_number"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-nez p3, :cond_3

    const-string v2, "date_of_birth"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    if-nez p4, :cond_4

    const-string v2, "expiration_date"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    new-instance v1, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    new-instance v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;

    invoke-virtual/range {p5 .. p5}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;->a()Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 p3, v0

    move-object/from16 p0, v2

    move-object/from16 p1, v3

    move/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p2, v6

    invoke-direct/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p0

    const/4 v2, 0x2

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object/from16 p1, v0

    move-object/from16 p0, v1

    move/from16 p4, v2

    move-object/from16 p5, v3

    move-wide/from16 p2, v4

    invoke-direct/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p0

    invoke-static {v0}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const v20, 0x3ffdb

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

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

    move-object/from16 v1, p6

    invoke-static/range {v1 .. v21}, Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;->v(Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$JpMyNumberNfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$AutoSubmit;Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;ZZLjava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    move-result-object v0

    move-object/from16 v1, p7

    invoke-virtual {v1, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 10
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->u:Lym/k$a;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->v:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->w:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->x:Ljava/lang/String;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->y:Ljava/util/Date;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->z:Ljava/util/Date;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->A:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;

    iget-object v8, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->B:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->u:Lym/k$a;

    invoke-virtual {p1}, Lym/k$a;->d()Lym/h;

    move-result-object p1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->v:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->w:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->x:Ljava/lang/String;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->y:Ljava/util/Date;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->z:Ljava/util/Date;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->A:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$h;->B:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    new-instance v0, Lor/j6;

    invoke-direct/range {v0 .. v7}, Lor/j6;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying$NfcScan;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V

    const/4 v1, 0x1

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1, v3}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
