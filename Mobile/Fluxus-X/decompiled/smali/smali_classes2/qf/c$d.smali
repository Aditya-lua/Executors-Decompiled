.class public final Lqf/c$d;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqf/c;->k(Ly3/f$a;Ljava/lang/Object;)Ly3/f;
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
        "Ly3/f;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1"
    f = "JavaDataStorage.kt"
    l = {
        0x91
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "Ly3/f;",
        "<anonymous>",
        "(Lav/p0;)Ly3/f;"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lqf/c;

.field public final synthetic v:Ly3/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly3/f$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic w:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lqf/c;Ly3/f$a;Ljava/lang/Object;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqf/c;",
            "Ly3/f$a<",
            "TT;>;TT;",
            "Leu/b<",
            "-",
            "Lqf/c$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqf/c$d;->u:Lqf/c;

    iput-object p2, p0, Lqf/c$d;->v:Ly3/f$a;

    iput-object p3, p0, Lqf/c$d;->w:Ljava/lang/Object;

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

    new-instance p1, Lqf/c$d;

    iget-object v0, p0, Lqf/c$d;->u:Lqf/c;

    iget-object v1, p0, Lqf/c$d;->v:Ly3/f$a;

    iget-object v2, p0, Lqf/c$d;->w:Ljava/lang/Object;

    invoke-direct {p1, v0, v1, v2, p2}, Lqf/c$d;-><init>(Lqf/c;Ly3/f$a;Ljava/lang/Object;Leu/b;)V

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
            "Ly3/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lqf/c$d;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lqf/c$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lqf/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lqf/c$d;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lqf/c$d;->t:I

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

    iget-object p1, p0, Lqf/c$d;->u:Lqf/c;

    invoke-static {p1}, Lqf/c;->c(Lqf/c;)Lu3/i;

    move-result-object p1

    new-instance v1, Lqf/c$d$a;

    iget-object v3, p0, Lqf/c$d;->v:Ly3/f$a;

    iget-object v4, p0, Lqf/c$d;->w:Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-direct {v1, v3, v4, v5}, Lqf/c$d$a;-><init>(Ly3/f$a;Ljava/lang/Object;Leu/b;)V

    iput v2, p0, Lqf/c$d;->t:I

    invoke-static {p1, v1, p0}, Ly3/j;->a(Lu3/i;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
