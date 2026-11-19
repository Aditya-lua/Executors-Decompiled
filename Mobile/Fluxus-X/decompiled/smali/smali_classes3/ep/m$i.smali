.class public final Lep/m$i;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lep/m;->S2(Lvo/y3;)V
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
    c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$render$16"
    f = "GovernmentIdStepFragment.kt"
    l = {
        0x139,
        0x13a
    }
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

.field public final synthetic u:Lep/m;

.field public final synthetic v:Lvo/y3;

.field public final synthetic w:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lep/m;Lvo/y3;Landroid/content/Context;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lep/m;",
            "Lvo/y3;",
            "Landroid/content/Context;",
            "Leu/b<",
            "-",
            "Lep/m$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lep/m$i;->u:Lep/m;

    iput-object p2, p0, Lep/m$i;->v:Lvo/y3;

    iput-object p3, p0, Lep/m$i;->w:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 3
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

    new-instance p1, Lep/m$i;

    iget-object v0, p0, Lep/m$i;->u:Lep/m;

    iget-object v1, p0, Lep/m$i;->v:Lvo/y3;

    iget-object v2, p0, Lep/m$i;->w:Landroid/content/Context;

    invoke-direct {p1, v0, v1, v2, p2}, Lep/m$i;-><init>(Lep/m;Lvo/y3;Landroid/content/Context;Leu/b;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lep/m$i;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lep/m$i;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lep/m$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lep/m$i;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lep/m$i;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lzt/n;

    invoke-virtual {p1}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lep/m$i;->u:Lep/m;

    invoke-static {p1}, Lep/m;->s2(Lep/m;)Lsn/i;

    move-result-object p1

    if-eqz p1, :cond_4

    iput v3, p0, Lep/m$i;->t:I

    invoke-interface {p1, p0}, Lsn/i;->k(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {p1}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    :cond_4
    sget-object p1, Lsn/m;->a:Lsn/m;

    iget-object v1, p0, Lep/m$i;->u:Lep/m;

    invoke-virtual {v1}, Lf4/q;->I1()Landroid/content/Context;

    move-result-object v1

    const-string v3, "requireContext(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput v2, p0, Lep/m$i;->t:I

    invoke-virtual {p1, v1, p0}, Lsn/m;->b(Landroid/content/Context;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    iget-object p1, p0, Lep/m$i;->u:Lep/m;

    iget-object v0, p0, Lep/m$i;->v:Lvo/y3;

    check-cast v0, Lvo/y3$h;

    iget-object v1, p0, Lep/m$i;->w:Landroid/content/Context;

    invoke-static {p1, v0, v1}, Lep/m;->q2(Lep/m;Lvo/y3$h;Landroid/content/Context;)V

    iget-object p1, p0, Lep/m$i;->u:Lep/m;

    invoke-static {p1}, Lep/m;->r2(Lep/m;)V

    iget-object p1, p0, Lep/m$i;->u:Lep/m;

    iget-object v0, p0, Lep/m$i;->v:Lvo/y3;

    invoke-static {p1, v0}, Lep/m;->v2(Lep/m;Lvo/y3;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
