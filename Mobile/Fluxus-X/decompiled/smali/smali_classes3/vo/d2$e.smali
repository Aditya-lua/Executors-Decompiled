.class public final Lvo/d2$e;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvo/d2;->i0(Lvo/d2$a;Lvo/j0;Lln/k$a;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$render$3"
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

.field public final synthetic u:Lln/k$a;
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

.field public final synthetic v:Lvo/d2;


# direct methods
.method public constructor <init>(Lln/k$a;Lvo/d2;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lln/k<",
            "-",
            "Lvo/d2$a;",
            "Lvo/j0;",
            "+",
            "Lvo/d2$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lvo/d2;",
            "Leu/b<",
            "-",
            "Lvo/d2$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvo/d2$e;->u:Lln/k$a;

    iput-object p2, p0, Lvo/d2$e;->v:Lvo/d2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Lvo/d2;Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lvo/d2$e;->p(Lvo/d2;Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lvo/d2;Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lvo/d2;->Y(Lvo/d2;Lln/r$c;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
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

    new-instance p1, Lvo/d2$e;

    iget-object v0, p0, Lvo/d2$e;->u:Lln/k$a;

    iget-object v1, p0, Lvo/d2$e;->v:Lvo/d2;

    invoke-direct {p1, v0, v1, p2}, Lvo/d2$e;-><init>(Lln/k$a;Lvo/d2;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lvo/d2$e;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lvo/d2$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lvo/d2$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lvo/d2$e;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lvo/d2$e;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lvo/d2$e;->u:Lln/k$a;

    invoke-virtual {p1}, Lln/k$a;->d()Lln/h;

    move-result-object p1

    iget-object v0, p0, Lvo/d2$e;->v:Lvo/d2;

    new-instance v1, Lvo/e2;

    invoke-direct {v1, v0}, Lvo/e2;-><init>(Lvo/d2;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2, v3}, Lln/w;->g(Lln/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

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
