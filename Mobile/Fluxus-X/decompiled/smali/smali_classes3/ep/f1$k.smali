.class public final Lep/f1$k;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lep/f1;->g0(Lvo/d2$a;Lvo/j0;)Lvo/y3;
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
    c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$renderScreen$1"
    f = "GovernmentIdStepStateManager.kt"
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

.field public final synthetic u:Lvo/d2$a;

.field public final synthetic v:Lvo/j0;

.field public final synthetic w:Lep/f1;


# direct methods
.method public constructor <init>(Lvo/d2$a;Lvo/j0;Lep/f1;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvo/d2$a;",
            "Lvo/j0;",
            "Lep/f1;",
            "Leu/b<",
            "-",
            "Lep/f1$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lep/f1$k;->u:Lvo/d2$a;

    iput-object p2, p0, Lep/f1$k;->v:Lvo/j0;

    iput-object p3, p0, Lep/f1$k;->w:Lep/f1;

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

    new-instance v0, Lep/f1$k;

    iget-object v1, p0, Lep/f1$k;->u:Lvo/d2$a;

    iget-object v2, p0, Lep/f1$k;->v:Lvo/j0;

    iget-object v3, p0, Lep/f1$k;->w:Lep/f1;

    invoke-direct {v0, v1, v2, v3, p1}, Lep/f1$k;-><init>(Lvo/d2$a;Lvo/j0;Lep/f1;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lep/f1$k;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lep/f1$k;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lep/f1$k;->u:Lvo/d2$a;

    invoke-virtual {p1}, Lvo/d2$a;->o()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lep/f1$k;->v:Lvo/j0;

    iget-object v0, p0, Lep/f1$k;->w:Lep/f1;

    iget-object v1, p0, Lep/f1$k;->u:Lvo/d2$a;

    invoke-virtual {v1}, Lvo/d2$a;->o()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvo/d3;

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lep/f1;->X(Lvo/j0;Lep/f1;Lvo/d2$a;Lvo/d3;Z)V

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
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

    invoke-virtual {p0, p1}, Lep/f1$k;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lep/f1$k;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lep/f1$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
