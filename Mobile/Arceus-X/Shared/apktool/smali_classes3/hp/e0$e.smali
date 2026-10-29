.class public final Lhp/e0$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhp/e0;->M(Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;)Lhp/s0;
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
    c = "com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$renderComplete$1"
    f = "InquiryStateManager.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lhp/e0;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;


# direct methods
.method public constructor <init>(Lhp/e0;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhp/e0;",
            "Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;",
            "Lnt/b<",
            "-",
            "Lhp/e0$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhp/e0$e;->u:Lhp/e0;

    iput-object p2, p0, Lhp/e0$e;->v:Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 3
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

    new-instance v0, Lhp/e0$e;

    iget-object v1, p0, Lhp/e0$e;->u:Lhp/e0;

    iget-object v2, p0, Lhp/e0$e;->v:Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;

    invoke-direct {v0, v1, v2, p1}, Lhp/e0$e;-><init>(Lhp/e0;Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lhp/e0$e;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lhp/e0$e;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lhp/e0$e;->u:Lhp/e0;

    iget-object v0, p0, Lhp/e0$e;->v:Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lhp/e0$e;->v:Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;->y()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lhp/e0$e;->v:Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;->t()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lhp/e0$e;->v:Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;->s()Ljava/util/Map;

    move-result-object v4

    iget-object v0, p0, Lhp/e0$e;->v:Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$Complete;->f()Ljava/lang/String;

    move-result-object v6

    new-instance v1, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Complete;

    invoke-direct/range {v1 .. v6}, Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Complete;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lhp/e0;->z0(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
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

    invoke-virtual {p0, p1}, Lhp/e0$e;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lhp/e0$e;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lhp/e0$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
