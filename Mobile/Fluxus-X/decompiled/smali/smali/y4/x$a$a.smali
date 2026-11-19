.class public final Ly4/x$a$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly4/x$a;->run()V
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
    c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1"
    f = "RoomDatabase.android.kt"
    l = {
        0x827
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
        0x1,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ly4/u;

.field public final synthetic w:Lav/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lav/n<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final synthetic x:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lav/p0;",
            "Leu/b<",
            "-TR;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ly4/u;Lav/n;Lkotlin/jvm/functions/Function2;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly4/u;",
            "Lav/n<",
            "-TR;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lav/p0;",
            "-",
            "Leu/b<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Leu/b<",
            "-",
            "Ly4/x$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly4/x$a$a;->v:Ly4/u;

    iput-object p2, p0, Ly4/x$a$a;->w:Lav/n;

    iput-object p3, p0, Ly4/x$a$a;->x:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 4
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

    new-instance v0, Ly4/x$a$a;

    iget-object v1, p0, Ly4/x$a$a;->v:Ly4/u;

    iget-object v2, p0, Ly4/x$a$a;->w:Lav/n;

    iget-object v3, p0, Ly4/x$a$a;->x:Lkotlin/jvm/functions/Function2;

    invoke-direct {v0, v1, v2, v3, p2}, Ly4/x$a$a;-><init>(Ly4/u;Lav/n;Lkotlin/jvm/functions/Function2;Leu/b;)V

    iput-object p1, v0, Ly4/x$a$a;->u:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ly4/x$a$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Ly4/x$a$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ly4/x$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Ly4/x$a$a;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ly4/x$a$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ly4/x$a$a;->u:Ljava/lang/Object;

    check-cast v0, Leu/b;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ly4/x$a$a;->u:Ljava/lang/Object;

    check-cast p1, Lav/p0;

    invoke-interface {p1}, Lav/p0;->I()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    sget-object v1, Lkotlin/coroutines/d;->No:Lkotlin/coroutines/d$b;

    invoke-interface {p1, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/coroutines/d;

    iget-object v1, p0, Ly4/x$a$a;->v:Ly4/u;

    invoke-static {v1, p1}, Ly4/x;->a(Ly4/u;Lkotlin/coroutines/d;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    iget-object v1, p0, Ly4/x$a$a;->w:Lav/n;

    sget-object v3, Lzt/n;->b:Lzt/n$a;

    iget-object v3, p0, Ly4/x$a$a;->x:Lkotlin/jvm/functions/Function2;

    iput-object v1, p0, Ly4/x$a$a;->u:Ljava/lang/Object;

    iput v2, p0, Ly4/x$a$a;->t:I

    invoke-static {p1, v3, p0}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v1

    :goto_0
    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Leu/b;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
