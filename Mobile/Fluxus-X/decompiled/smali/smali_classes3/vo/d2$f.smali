.class public final Lvo/d2$f;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvo/d2;->j0(Lvo/d2$a;Lvo/j0;Lln/k$a;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$renderScreen$1"
    f = "GovernmentIdWorkflow.kt"
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

.field public final synthetic u:Lvo/d2$a;

.field public final synthetic v:Lvo/j0;

.field public final synthetic w:Lvo/d2;

.field public final synthetic x:Lln/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lln/k<",
            "Lvo/d2$a;",
            "Lvo/j0;",
            "Lvo/d2$b;",
            "Ljava/lang/Object;",
            ">.a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lvo/d2$a;Lvo/j0;Lvo/d2;Lln/k$a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvo/d2$a;",
            "Lvo/j0;",
            "Lvo/d2;",
            "Lln/k<",
            "-",
            "Lvo/d2$a;",
            "Lvo/j0;",
            "+",
            "Lvo/d2$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Leu/b<",
            "-",
            "Lvo/d2$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvo/d2$f;->u:Lvo/d2$a;

    iput-object p2, p0, Lvo/d2$f;->v:Lvo/j0;

    iput-object p3, p0, Lvo/d2$f;->w:Lvo/d2;

    iput-object p4, p0, Lvo/d2$f;->x:Lln/k$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lgu/m;-><init>(ILeu/b;)V

    return-void
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

    new-instance v0, Lvo/d2$f;

    iget-object v1, p0, Lvo/d2$f;->u:Lvo/d2$a;

    iget-object v2, p0, Lvo/d2$f;->v:Lvo/j0;

    iget-object v3, p0, Lvo/d2$f;->w:Lvo/d2;

    iget-object v4, p0, Lvo/d2$f;->x:Lln/k$a;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lvo/d2$f;-><init>(Lvo/d2$a;Lvo/j0;Lvo/d2;Lln/k$a;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lvo/d2$f;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lvo/d2$f;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lvo/d2$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lvo/d2$f;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lvo/d2$f;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lvo/d2$f;->u:Lvo/d2$a;

    invoke-virtual {p1}, Lvo/d2$a;->o()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object v1, p0, Lvo/d2$f;->v:Lvo/j0;

    iget-object v2, p0, Lvo/d2$f;->w:Lvo/d2;

    iget-object v3, p0, Lvo/d2$f;->x:Lln/k$a;

    iget-object v4, p0, Lvo/d2$f;->u:Lvo/d2$a;

    invoke-virtual {v4}, Lvo/d2$a;->o()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lvo/d3;

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lvo/d2;->X(Lvo/j0;Lvo/d2;Lln/k$a;Lvo/d2$a;Lvo/d3;Z)V

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
