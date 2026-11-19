.class public final Lno/u2$h;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lno/u2;->V0(Lno/u2$b;Lno/u2$f;Lln/k$a;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.document.DocumentWorkflow$render$4"
    f = "DocumentWorkflow.kt"
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
            "Lno/u2$b;",
            "Lno/u2$f;",
            "Lno/u2$c;",
            "Ljava/lang/Object;",
            ">.a;"
        }
    .end annotation
.end field

.field public final synthetic v:Lno/u2;

.field public final synthetic w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lln/k$a;Lno/u2;Ljava/lang/String;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lln/k<",
            "-",
            "Lno/u2$b;",
            "Lno/u2$f;",
            "+",
            "Lno/u2$c;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lno/u2;",
            "Ljava/lang/String;",
            "Leu/b<",
            "-",
            "Lno/u2$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lno/u2$h;->u:Lln/k$a;

    iput-object p2, p0, Lno/u2$h;->v:Lno/u2;

    iput-object p3, p0, Lno/u2$h;->w:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Ljava/lang/String;Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lno/u2$h;->p(Ljava/lang/String;Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Ljava/lang/String;Lln/r$c;)Lkotlin/Unit;
    .locals 11

    invoke-virtual {p1}, Lln/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lno/u2$f$c;

    if-eqz v1, :cond_0

    check-cast v0, Lno/u2$f$c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    new-instance v4, Lno/u2$f$f$d;

    invoke-direct {v4, p0}, Lno/u2$f$f$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lno/u2$f$c;->l()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lno/u2$f$c;->q()Ljava/lang/String;

    move-result-object v8

    new-instance v0, Lno/u2$f$b;

    const/16 v9, 0x74

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    invoke-direct/range {v0 .. v10}, Lno/u2$f$b;-><init>(Ljava/util/List;Ljava/lang/String;Lno/u2$f$a;Lno/u2$f$f;Lno/e;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lln/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
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

    new-instance p1, Lno/u2$h;

    iget-object v0, p0, Lno/u2$h;->u:Lln/k$a;

    iget-object v1, p0, Lno/u2$h;->v:Lno/u2;

    iget-object v2, p0, Lno/u2$h;->w:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lno/u2$h;-><init>(Lln/k$a;Lno/u2;Ljava/lang/String;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lno/u2$h;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lno/u2$h;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lno/u2$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lno/u2$h;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lno/u2$h;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lno/u2$h;->u:Lln/k$a;

    invoke-virtual {p1}, Lln/k$a;->d()Lln/h;

    move-result-object p1

    iget-object v0, p0, Lno/u2$h;->v:Lno/u2;

    iget-object v1, p0, Lno/u2$h;->w:Ljava/lang/String;

    new-instance v2, Lno/v2;

    invoke-direct {v2, v1}, Lno/v2;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v1, v3}, Lln/w;->g(Lln/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

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
