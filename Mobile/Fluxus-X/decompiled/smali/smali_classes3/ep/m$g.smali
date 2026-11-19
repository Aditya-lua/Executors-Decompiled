.class public final Lep/m$g;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lep/m;->G2(Lvo/y3;Lkotlin/jvm/functions/Function0;)V
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
    c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$finalizeVideoCaptureThenBind$1"
    f = "GovernmentIdStepFragment.kt"
    l = {
        0x157
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

.field public final synthetic u:Lsn/i;

.field public final synthetic v:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic w:Lep/m;

.field public final synthetic x:Lvo/y3;


# direct methods
.method public constructor <init>(Lsn/i;Lkotlin/jvm/functions/Function0;Lep/m;Lvo/y3;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsn/i;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lep/m;",
            "Lvo/y3;",
            "Leu/b<",
            "-",
            "Lep/m$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lep/m$g;->u:Lsn/i;

    iput-object p2, p0, Lep/m$g;->v:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lep/m$g;->w:Lep/m;

    iput-object p4, p0, Lep/m$g;->x:Lvo/y3;

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

    new-instance v0, Lep/m$g;

    iget-object v1, p0, Lep/m$g;->u:Lsn/i;

    iget-object v2, p0, Lep/m$g;->v:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lep/m$g;->w:Lep/m;

    iget-object v4, p0, Lep/m$g;->x:Lvo/y3;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lep/m$g;-><init>(Lsn/i;Lkotlin/jvm/functions/Function0;Lep/m;Lvo/y3;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lep/m$g;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lep/m$g;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lep/m$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lep/m$g;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lep/m$g;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lzt/n;

    invoke-virtual {p1}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lep/m$g;->u:Lsn/i;

    if-eqz p1, :cond_4

    iput v2, p0, Lep/m$g;->t:I

    invoke-interface {p1, p0}, Lsn/i;->k(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lep/m$g;->w:Lep/m;

    iget-object v1, p0, Lep/m$g;->u:Lsn/i;

    invoke-static {p1}, Lzt/n;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Ljava/io/File;

    invoke-static {v0}, Lep/m;->u2(Lep/m;)Lep/i1;

    move-result-object v0

    invoke-virtual {v0}, Lep/i1;->e()Lep/f1;

    move-result-object v0

    invoke-interface {v1}, Lsn/i;->f()Lsn/v;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lep/f1;->f0(Ljava/io/File;Lsn/v;)V

    :cond_3
    invoke-static {p1}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    :cond_4
    iget-object p1, p0, Lep/m$g;->v:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    iget-object p1, p0, Lep/m$g;->w:Lep/m;

    invoke-static {p1}, Lep/m;->r2(Lep/m;)V

    iget-object p1, p0, Lep/m$g;->w:Lep/m;

    iget-object v0, p0, Lep/m$g;->x:Lvo/y3;

    invoke-static {p1, v0}, Lep/m;->v2(Lep/m;Lvo/y3;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
