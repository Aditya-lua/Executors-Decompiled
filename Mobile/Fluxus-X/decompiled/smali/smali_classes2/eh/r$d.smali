.class public final Leh/r$d;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leh/r;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
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
    c = "com.roblox.client.analytics.EventUploadWorker$addEvent$1$1"
    f = "EventUploadWorker.kt"
    l = {
        0x74
    }
    m = "invokeSuspend"
    v = 0x1
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
.field public final synthetic A:Leh/r;

.field public final synthetic B:Z

.field public t:Ljava/lang/Object;

.field public u:I

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Luh/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Luh/a;Leh/r;ZLeu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Luh/a;",
            "Leh/r;",
            "Z",
            "Leu/b<",
            "-",
            "Leh/r$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Leh/r$d;->v:Ljava/lang/String;

    iput-object p2, p0, Leh/r$d;->w:Ljava/lang/String;

    iput-object p3, p0, Leh/r$d;->x:Ljava/lang/String;

    iput-object p4, p0, Leh/r$d;->y:Ljava/lang/String;

    iput-object p5, p0, Leh/r$d;->z:Luh/a;

    iput-object p6, p0, Leh/r$d;->A:Leh/r;

    iput-boolean p7, p0, Leh/r$d;->B:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 9
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

    new-instance v0, Leh/r$d;

    iget-object v1, p0, Leh/r$d;->v:Ljava/lang/String;

    iget-object v2, p0, Leh/r$d;->w:Ljava/lang/String;

    iget-object v3, p0, Leh/r$d;->x:Ljava/lang/String;

    iget-object v4, p0, Leh/r$d;->y:Ljava/lang/String;

    iget-object v5, p0, Leh/r$d;->z:Luh/a;

    iget-object v6, p0, Leh/r$d;->A:Leh/r;

    iget-boolean v7, p0, Leh/r$d;->B:Z

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Leh/r$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Luh/a;Leh/r;ZLeu/b;)V

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
    invoke-virtual {p0, p1, p2}, Leh/r$d;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Leh/r$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Leh/r$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Leh/r$d;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Leh/r$d;->u:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Leh/r$d;->t:Ljava/lang/Object;

    check-cast v0, Lvh/a;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    new-instance v3, Lvh/a;

    iget-object v5, p0, Leh/r$d;->v:Ljava/lang/String;

    iget-object v6, p0, Leh/r$d;->w:Ljava/lang/String;

    iget-object v7, p0, Leh/r$d;->x:Ljava/lang/String;

    iget-object v8, p0, Leh/r$d;->y:Ljava/lang/String;

    const/16 v10, 0x20

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lvh/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Leh/r$d;->z:Luh/a;

    filled-new-array {v3}, [Lvh/a;

    move-result-object v1

    iput-object v3, p0, Leh/r$d;->t:Ljava/lang/Object;

    iput v2, p0, Leh/r$d;->u:I

    invoke-interface {p1, v1, p0}, Luh/a;->d([Lvh/a;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v3

    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const-string v1, "EventUploadJob"

    if-eqz p1, :cond_3

    iget-object p1, p0, Leh/r$d;->v:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Added event "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to database."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Lgu/b;->c(I)Ljava/lang/Integer;

    goto :goto_1

    :cond_3
    iget-object p1, p0, Leh/r$d;->v:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to add event "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to database. Adding it to in-memory queue."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Leh/r$d;->A:Leh/r;

    invoke-static {p1}, Leh/r;->f(Leh/r;)Ljava/util/concurrent/LinkedBlockingQueue;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lgu/b;->a(Z)Ljava/lang/Boolean;

    :goto_1
    iget-object p1, p0, Leh/r$d;->A:Leh/r;

    iget-boolean v0, p0, Leh/r$d;->B:Z

    invoke-virtual {p1, v0}, Leh/r;->b(Z)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
