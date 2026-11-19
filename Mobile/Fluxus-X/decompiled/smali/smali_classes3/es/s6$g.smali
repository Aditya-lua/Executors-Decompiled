.class public final Les/s6$g;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/s6;->G0(Les/s6$b;Les/i4;Lln/k$a;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$3$1"
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

.field public final synthetic w:Les/i4;

.field public final synthetic x:Lqr/i;


# direct methods
.method public constructor <init>(Lln/k$a;Les/s6;Les/i4;Lqr/i;Leu/b;)V
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
            "Les/i4;",
            "Lqr/i;",
            "Leu/b<",
            "-",
            "Les/s6$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Les/s6$g;->u:Lln/k$a;

    iput-object p2, p0, Les/s6$g;->v:Les/s6;

    iput-object p3, p0, Les/s6$g;->w:Les/i4;

    iput-object p4, p0, Les/s6$g;->x:Lqr/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Les/i4;Lqr/i;Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Les/s6$g;->p(Les/i4;Lqr/i;Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Les/i4;Lqr/i;Lln/r$c;)Lkotlin/Unit;
    .locals 22

    move-object/from16 v1, p0

    check-cast v1, Les/i4$a;

    new-instance v9, Les/i4$a$a;

    invoke-interface/range {p1 .. p1}, Lqr/i;->getAutoSubmitIntervalSeconds()Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface/range {p1 .. p1}, Lqr/i;->getAutoSubmitCountdownText()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface/range {p1 .. p1}, Lqr/i;->getAutoSubmitIntervalSeconds()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, "{time}"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/x;->N(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :goto_0
    move-object/from16 v3, p1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :goto_1
    invoke-direct {v9, v3, v0, v2}, Les/i4$a$a;-><init>(Lqr/d;ILjava/lang/String;)V

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

    invoke-static/range {v1 .. v21}, Les/i4$a;->v(Les/i4$a;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Les/i4$a$d;Les/i4$a$c;Les/i4$a$a;Les/i4$b;ZZLjava/util/Map;Lqr/x5;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/Object;)Les/i4$a;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lln/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 6
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

    new-instance v0, Les/s6$g;

    iget-object v1, p0, Les/s6$g;->u:Lln/k$a;

    iget-object v2, p0, Les/s6$g;->v:Les/s6;

    iget-object v3, p0, Les/s6$g;->w:Les/i4;

    iget-object v4, p0, Les/s6$g;->x:Lqr/i;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Les/s6$g;-><init>(Lln/k$a;Les/s6;Les/i4;Lqr/i;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Les/s6$g;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Les/s6$g;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Les/s6$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Les/s6$g;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Les/s6$g;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Les/s6$g;->u:Lln/k$a;

    invoke-virtual {p1}, Lln/k$a;->d()Lln/h;

    move-result-object p1

    iget-object v0, p0, Les/s6$g;->v:Les/s6;

    iget-object v1, p0, Les/s6$g;->w:Les/i4;

    iget-object v2, p0, Les/s6$g;->x:Lqr/i;

    new-instance v3, Les/t6;

    invoke-direct {v3, v1, v2}, Les/t6;-><init>(Les/i4;Lqr/i;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v3, v1, v2}, Lln/w;->g(Lln/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

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
