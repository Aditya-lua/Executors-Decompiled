.class public final Liq/l$h;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liq/l;->y(Lfq/n1$c;Liq/l$e;)V
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
    c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$handleState$1"
    f = "PermissionRequestStateManager.kt"
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

.field public final synthetic u:Liq/l;

.field public final synthetic v:Lfq/n1$c;


# direct methods
.method public constructor <init>(Liq/l;Lfq/n1$c;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liq/l;",
            "Lfq/n1$c;",
            "Leu/b<",
            "-",
            "Liq/l$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liq/l$h;->u:Liq/l;

    iput-object p2, p0, Liq/l$h;->v:Lfq/n1$c;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Leu/b;)Leu/b;
    .locals 3
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

    new-instance v0, Liq/l$h;

    iget-object v1, p0, Liq/l$h;->u:Liq/l;

    iget-object v2, p0, Liq/l$h;->v:Lfq/n1$c;

    invoke-direct {v0, v1, v2, p1}, Liq/l$h;-><init>(Liq/l;Lfq/n1$c;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Liq/l$h;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Liq/l$h;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Liq/l$h;->u:Liq/l;

    invoke-static {p1}, Liq/l;->t(Liq/l;)Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Liq/l$h;->v:Lfq/n1$c;

    invoke-virtual {v0}, Lfq/n1$c;->k()Lfq/n0;

    move-result-object v0

    invoke-static {p1, v0}, Lfq/y1;->b(Landroid/content/Context;Lfq/n0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Liq/l$h;->u:Liq/l;

    invoke-virtual {p1}, Lls/d;->d()Lls/g;

    move-result-object p1

    sget-object v0, Liq/l$e$e;->a:Liq/l$e$e;

    invoke-virtual {p1, v0}, Lls/g;->p(Lls/h;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Liq/l$h;->u:Liq/l;

    invoke-virtual {p1}, Lls/d;->d()Lls/g;

    move-result-object p1

    sget-object v0, Liq/l$e$b;->a:Liq/l$e$b;

    invoke-virtual {p1, v0}, Lls/g;->p(Lls/h;)V

    :goto_0
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

    invoke-virtual {p0, p1}, Liq/l$h;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Liq/l$h;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Liq/l$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
