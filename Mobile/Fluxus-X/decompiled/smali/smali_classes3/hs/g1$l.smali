.class public final Lhs/g1$l;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhs/g1;->p0(Les/s6$b;Les/i4$a;Les/i4$a$d;)V
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
    c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$runGovIdNfcWork$1"
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
.field public final synthetic A:Les/i4$a;

.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;

.field public final synthetic v:Lhs/g1;

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/util/Date;

.field public final synthetic y:Ljava/util/Date;

.field public final synthetic z:Les/i4$a$d;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Lhs/g1;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Les/i4$a$d;Les/i4$a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;",
            "Lhs/g1;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Les/i4$a$d;",
            "Les/i4$a;",
            "Leu/b<",
            "-",
            "Lhs/g1$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhs/g1$l;->u:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;

    iput-object p2, p0, Lhs/g1$l;->v:Lhs/g1;

    iput-object p3, p0, Lhs/g1$l;->w:Ljava/lang/String;

    iput-object p4, p0, Lhs/g1$l;->x:Ljava/util/Date;

    iput-object p5, p0, Lhs/g1$l;->y:Ljava/util/Date;

    iput-object p6, p0, Lhs/g1$l;->z:Les/i4$a$d;

    iput-object p7, p0, Lhs/g1$l;->A:Les/i4$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p8}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Leu/b;)Leu/b;
    .locals 9
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

    new-instance v0, Lhs/g1$l;

    iget-object v1, p0, Lhs/g1$l;->u:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;

    iget-object v2, p0, Lhs/g1$l;->v:Lhs/g1;

    iget-object v3, p0, Lhs/g1$l;->w:Ljava/lang/String;

    iget-object v4, p0, Lhs/g1$l;->x:Ljava/util/Date;

    iget-object v5, p0, Lhs/g1$l;->y:Ljava/util/Date;

    iget-object v6, p0, Lhs/g1$l;->z:Les/i4$a$d;

    iget-object v7, p0, Lhs/g1$l;->A:Les/i4$a;

    move-object v8, p1

    invoke-direct/range {v0 .. v8}, Lhs/g1$l;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Lhs/g1;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Les/i4$a$d;Les/i4$a;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lhs/g1$l;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v1, v0, Lhs/g1$l;->t:I

    if-nez v1, :cond_5

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v1, v0, Lhs/g1$l;->u:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;->getRequiredText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    iget-object v1, v0, Lhs/g1$l;->v:Lhs/g1;

    invoke-static {v1}, Lhs/g1;->H(Lhs/g1;)Landroid/content/Context;

    move-result-object v1

    sget v2, Ljq/g;->F:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    iget-object v2, v0, Lhs/g1$l;->w:Ljava/lang/String;

    invoke-static {v2}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "document_number"

    invoke-interface {v5, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v2, v0, Lhs/g1$l;->x:Ljava/util/Date;

    if-nez v2, :cond_3

    const-string v2, "date_of_birth"

    invoke-interface {v5, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v2, v0, Lhs/g1$l;->y:Ljava/util/Date;

    if-nez v2, :cond_4

    const-string v2, "expiration_date"

    invoke-interface {v5, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v1, v0, Lhs/g1$l;->v:Lhs/g1;

    new-instance v8, Les/g2;

    new-instance v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;

    iget-object v3, v0, Lhs/g1$l;->z:Les/i4$a$d;

    invoke-virtual {v3}, Les/i4$a$d;->a()Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x2

    const/4 v11, 0x0

    move-object v6, v8

    const-wide/16 v8, 0x0

    move-object v7, v2

    invoke-direct/range {v6 .. v11}, Les/g2;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v6}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    iget-object v7, v0, Lhs/g1$l;->A:Les/i4$a;

    const v26, 0x3ffdb

    const/16 v27, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

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

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v7 .. v27}, Les/i4$a;->v(Les/i4$a;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Les/i4$a$d;Les/i4$a$c;Les/i4$a$a;Les/i4$b;ZZLjava/util/Map;Lqr/x5;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/Object;)Les/i4$a;

    move-result-object v2

    invoke-static {v1, v2}, Lhs/g1;->L(Lhs/g1;Les/i4;)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1

    :cond_5
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

    invoke-virtual {p0, p1}, Lhs/g1$l;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lhs/g1$l;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lhs/g1$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
