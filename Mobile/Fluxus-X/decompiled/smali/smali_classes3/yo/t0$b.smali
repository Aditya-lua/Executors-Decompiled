.class public final Lyo/t0$b;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyo/t0;->j0(Lvo/d2$a;Lvo/j0$g;Lln/k$a;Lip/l;Lln/h;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$renderHolographicTorchDelay$2"
    f = "CaptureRenderer.kt"
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

.field public final synthetic u:Lyo/t0;

.field public final synthetic v:Lvo/d2$a;

.field public final synthetic w:Lvo/j0$g;

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

.field public final synthetic y:Lip/l;


# direct methods
.method public constructor <init>(Lyo/t0;Lvo/d2$a;Lvo/j0$g;Lln/k$a;Lip/l;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyo/t0;",
            "Lvo/d2$a;",
            "Lvo/j0$g;",
            "Lln/k<",
            "-",
            "Lvo/d2$a;",
            "Lvo/j0;",
            "+",
            "Lvo/d2$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lip/l;",
            "Leu/b<",
            "-",
            "Lyo/t0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyo/t0$b;->u:Lyo/t0;

    iput-object p2, p0, Lyo/t0$b;->v:Lvo/d2$a;

    iput-object p3, p0, Lyo/t0$b;->w:Lvo/j0$g;

    iput-object p4, p0, Lyo/t0$b;->x:Lln/k$a;

    iput-object p5, p0, Lyo/t0$b;->y:Lip/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 7
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

    new-instance v0, Lyo/t0$b;

    iget-object v1, p0, Lyo/t0$b;->u:Lyo/t0;

    iget-object v2, p0, Lyo/t0$b;->v:Lvo/d2$a;

    iget-object v3, p0, Lyo/t0$b;->w:Lvo/j0$g;

    iget-object v4, p0, Lyo/t0$b;->x:Lln/k$a;

    iget-object v5, p0, Lyo/t0$b;->y:Lip/l;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lyo/t0$b;-><init>(Lyo/t0;Lvo/d2$a;Lvo/j0$g;Lln/k$a;Lip/l;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lyo/t0$b;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lyo/t0$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lyo/t0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lyo/t0$b;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lyo/t0$b;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lyo/t0$b;->u:Lyo/t0;

    iget-object v2, p0, Lyo/t0$b;->v:Lvo/d2$a;

    iget-object v3, p0, Lyo/t0$b;->w:Lvo/j0$g;

    iget-object v4, p0, Lyo/t0$b;->x:Lln/k$a;

    invoke-virtual {v3}, Lvo/j0$g;->J()Lvo/f;

    move-result-object v5

    iget-object v6, p0, Lyo/t0$b;->y:Lip/l;

    iget-object p1, p0, Lyo/t0$b;->w:Lvo/j0$g;

    invoke-virtual {p1}, Lvo/j0$g;->f()Lsn/v;

    move-result-object v7

    iget-object p1, p0, Lyo/t0$b;->w:Lvo/j0$g;

    invoke-virtual {p1}, Lvo/j0$g;->L()Lvo/n$b;

    move-result-object v8

    invoke-static/range {v1 .. v8}, Lyo/t0;->S(Lyo/t0;Lvo/d2$a;Lvo/j0;Lln/k$a;Lvo/f;Lip/l;Lsn/v;Lvo/n$b;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
