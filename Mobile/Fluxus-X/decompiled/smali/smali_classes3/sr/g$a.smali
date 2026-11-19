.class public final Lsr/g$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsr/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Ldv/i<",
        "-",
        "Ljava/lang/String;",
        ">;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.steps.ui.components.utils.DateController$1"
    f = "DateController.kt"
    l = {
        0x3c
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldv/i;",
        "",
        "",
        "<anonymous>",
        "(Ldv/i;)V"
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

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lsr/g;


# direct methods
.method public constructor <init>(Lsr/g;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsr/g;",
            "Leu/b<",
            "-",
            "Lsr/g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsr/g$a;->v:Lsr/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
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

    new-instance v0, Lsr/g$a;

    iget-object v1, p0, Lsr/g$a;->v:Lsr/g;

    invoke-direct {v0, v1, p2}, Lsr/g$a;-><init>(Lsr/g;Leu/b;)V

    iput-object p1, v0, Lsr/g$a;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldv/i;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lsr/g$a;->m(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lsr/g$a;->u:Ljava/lang/Object;

    check-cast v0, Ldv/i;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lsr/g$a;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lsr/g$a;->v:Lsr/g;

    invoke-virtual {p1}, Lsr/g;->g()Lnn/s;

    move-result-object p1

    invoke-interface {p1}, Lnn/s;->a()Ldv/h;

    move-result-object p1

    iget-object v2, p0, Lsr/g$a;->v:Lsr/g;

    invoke-virtual {v2}, Lsr/g;->d()Lnn/s;

    move-result-object v2

    invoke-interface {v2}, Lnn/s;->a()Ldv/h;

    move-result-object v2

    iget-object v4, p0, Lsr/g$a;->v:Lsr/g;

    invoke-virtual {v4}, Lsr/g;->c()Lnn/s;

    move-result-object v4

    invoke-interface {v4}, Lnn/s;->a()Ldv/h;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Ldv/h;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    aput-object v2, v5, v3

    const/4 p1, 0x2

    aput-object v4, v5, p1

    invoke-static {v5}, Ldv/j;->C([Ldv/h;)Ldv/h;

    move-result-object p1

    new-instance v2, Lsr/g$a$a;

    iget-object v4, p0, Lsr/g$a;->v:Lsr/g;

    invoke-direct {v2, v0, v4}, Lsr/g$a$a;-><init>(Ldv/i;Lsr/g;)V

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lsr/g$a;->u:Ljava/lang/Object;

    iput v3, p0, Lsr/g$a;->t:I

    invoke-interface {p1, v2, p0}, Ldv/h;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final m(Ldv/i;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/i<",
            "-",
            "Ljava/lang/String;",
            ">;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lsr/g$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lsr/g$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lsr/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
