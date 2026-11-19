.class public final Les/s6$i;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/s6;->n1(Les/s6$b;Les/i4$a;Lln/k$a;Les/i4$a$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$runGovIdNfcWork$1"
    f = "UiWorkflow.kt"
    l = {}
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic A:Les/i4$a$d;

.field public final synthetic B:Les/i4$a;

.field public t:I

.field public final synthetic u:Lln/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lln/k<",
            "Les/s6$b;",
            "Les/i4;",
            "Les/s6$c;",
            "Ljava/lang/Object;",
            ">.a;"
        }
    .end annotation
.end field

.field public final synthetic v:Les/s6;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/util/Date;

.field public final synthetic z:Ljava/util/Date;


# direct methods
.method public constructor <init>(Lln/k$a;Les/s6;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Les/i4$a$d;Les/i4$a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lln/k<",
            "-",
            "Les/s6$b;",
            "Les/i4;",
            "+",
            "Les/s6$c;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Les/s6;",
            "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Les/i4$a$d;",
            "Les/i4$a;",
            "Leu/b<",
            "-",
            "Les/s6$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Les/s6$i;->u:Lln/k$a;

    iput-object p2, p0, Les/s6$i;->v:Les/s6;

    iput-object p3, p0, Les/s6$i;->w:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;

    iput-object p4, p0, Les/s6$i;->x:Ljava/lang/String;

    iput-object p5, p0, Les/s6$i;->y:Ljava/util/Date;

    iput-object p6, p0, Les/s6$i;->z:Ljava/util/Date;

    iput-object p7, p0, Les/s6$i;->A:Les/i4$a$d;

    iput-object p8, p0, Les/s6$i;->B:Les/i4$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Les/s6;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Les/i4$a$d;Les/i4$a;Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p7}, Les/s6$i;->p(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Les/s6;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Les/i4$a$d;Les/i4$a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Les/s6;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Les/i4$a$d;Les/i4$a;Lln/r$c;)Lkotlin/Unit;
    .locals 22

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    if-eqz p0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;->getRequiredText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static/range {p1 .. p1}, Les/s6;->m0(Les/s6;)Landroid/content/Context;

    move-result-object v1

    sget v2, Ljq/g;->F:I

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
    new-instance v1, Les/g2;

    new-instance v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;

    invoke-virtual/range {p5 .. p5}, Les/i4$a$d;->a()Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

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

    invoke-direct/range {p0 .. p5}, Les/g2;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-static/range {v1 .. v21}, Les/i4$a;->v(Les/i4$a;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Les/i4$a$d;Les/i4$a$c;Les/i4$a$a;Les/i4$b;ZZLjava/util/Map;Lqr/x5;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/Object;)Les/i4$a;

    move-result-object v0

    move-object/from16 v1, p7

    invoke-virtual {v1, v0}, Lln/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 10
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

    new-instance v0, Les/s6$i;

    iget-object v1, p0, Les/s6$i;->u:Lln/k$a;

    iget-object v2, p0, Les/s6$i;->v:Les/s6;

    iget-object v3, p0, Les/s6$i;->w:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;

    iget-object v4, p0, Les/s6$i;->x:Ljava/lang/String;

    iget-object v5, p0, Les/s6$i;->y:Ljava/util/Date;

    iget-object v6, p0, Les/s6$i;->z:Ljava/util/Date;

    iget-object v7, p0, Les/s6$i;->A:Les/i4$a$d;

    iget-object v8, p0, Les/s6$i;->B:Les/i4$a;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Les/s6$i;-><init>(Lln/k$a;Les/s6;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Les/i4$a$d;Les/i4$a;Leu/b;)V

    return-object v0
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Les/s6$i;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Les/s6$i;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Les/s6$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Les/s6$i;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Les/s6$i;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Les/s6$i;->u:Lln/k$a;

    invoke-virtual {p1}, Lln/k$a;->d()Lln/h;

    move-result-object p1

    iget-object v2, p0, Les/s6$i;->v:Les/s6;

    iget-object v1, p0, Les/s6$i;->w:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;

    iget-object v3, p0, Les/s6$i;->x:Ljava/lang/String;

    iget-object v4, p0, Les/s6$i;->y:Ljava/util/Date;

    iget-object v5, p0, Les/s6$i;->z:Ljava/util/Date;

    iget-object v6, p0, Les/s6$i;->A:Les/i4$a$d;

    iget-object v7, p0, Les/s6$i;->B:Les/i4$a;

    new-instance v0, Les/v6;

    invoke-direct/range {v0 .. v7}, Les/v6;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Les/s6;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Les/i4$a$d;Les/i4$a;)V

    const/4 v1, 0x1

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1, v3}, Lln/w;->g(Lln/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lln/h;->a(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
