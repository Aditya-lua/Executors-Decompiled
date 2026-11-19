.class public final Ll6/w$e;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll6/w;->g(Ly6/g;ILeu/b;)Ljava/lang/Object;
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
        "Ly6/k;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "coil3.RealImageLoader$execute$result$1"
    f = "RealImageLoader.kt"
    l = {
        0x8e
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "Ly6/k;",
        "<anonymous>",
        "(Lav/p0;)Ly6/k;"
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

.field public final synthetic u:Ly6/g;

.field public final synthetic v:Ll6/w;

.field public final synthetic w:Lz6/g;

.field public final synthetic x:Ll6/j;

.field public final synthetic y:Ll6/n;


# direct methods
.method public constructor <init>(Ly6/g;Ll6/w;Lz6/g;Ll6/j;Ll6/n;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly6/g;",
            "Ll6/w;",
            "Lz6/g;",
            "Ll6/j;",
            "Ll6/n;",
            "Leu/b<",
            "-",
            "Ll6/w$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ll6/w$e;->u:Ly6/g;

    iput-object p2, p0, Ll6/w$e;->v:Ll6/w;

    iput-object p3, p0, Ll6/w$e;->w:Lz6/g;

    iput-object p4, p0, Ll6/w$e;->x:Ll6/j;

    iput-object p5, p0, Ll6/w$e;->y:Ll6/n;

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

    new-instance v0, Ll6/w$e;

    iget-object v1, p0, Ll6/w$e;->u:Ly6/g;

    iget-object v2, p0, Ll6/w$e;->v:Ll6/w;

    iget-object v3, p0, Ll6/w$e;->w:Lz6/g;

    iget-object v4, p0, Ll6/w$e;->x:Ll6/j;

    iget-object v5, p0, Ll6/w$e;->y:Ll6/n;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ll6/w$e;-><init>(Ly6/g;Ll6/w;Lz6/g;Ll6/j;Ll6/n;Leu/b;)V

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
            "Ly6/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ll6/w$e;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Ll6/w$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ll6/w$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Ll6/w$e;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ll6/w$e;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    new-instance v3, Lq6/e;

    iget-object v4, p0, Ll6/w$e;->u:Ly6/g;

    iget-object p1, p0, Ll6/w$e;->v:Ll6/w;

    invoke-virtual {p1}, Ll6/w;->getComponents()Ll6/h;

    move-result-object p1

    invoke-virtual {p1}, Ll6/h;->g()Ljava/util/List;

    move-result-object v5

    iget-object v7, p0, Ll6/w$e;->u:Ly6/g;

    iget-object v8, p0, Ll6/w$e;->w:Lz6/g;

    iget-object v9, p0, Ll6/w$e;->x:Ll6/j;

    iget-object p1, p0, Ll6/w$e;->y:Ll6/n;

    if-eqz p1, :cond_2

    move v10, v2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    move v10, p1

    :goto_0
    const/4 v6, 0x0

    invoke-direct/range {v3 .. v10}, Lq6/e;-><init>(Ly6/g;Ljava/util/List;ILy6/g;Lz6/g;Ll6/j;Z)V

    iput v2, p0, Ll6/w$e;->t:I

    invoke-virtual {v3, p0}, Lq6/e;->g(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    return-object p1
.end method
