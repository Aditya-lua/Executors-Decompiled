.class public final Lsn/h0$c;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsn/h0;->i(Landroid/media/Image;I)V
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
    c = "com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5"
    f = "GovernmentIdFeed.kt"
    l = {
        0x79,
        0x7b
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
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public w:I

.field public final synthetic x:Landroid/media/Image;

.field public final synthetic y:Lsn/h0;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Landroid/media/Image;Lsn/h0;ILeu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/Image;",
            "Lsn/h0;",
            "I",
            "Leu/b<",
            "-",
            "Lsn/h0$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsn/h0$c;->x:Landroid/media/Image;

    iput-object p2, p0, Lsn/h0$c;->y:Lsn/h0;

    iput p3, p0, Lsn/h0$c;->z:I

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

    new-instance p1, Lsn/h0$c;

    iget-object v0, p0, Lsn/h0$c;->x:Landroid/media/Image;

    iget-object v1, p0, Lsn/h0$c;->y:Lsn/h0;

    iget v2, p0, Lsn/h0$c;->z:I

    invoke-direct {p1, v0, v1, v2, p2}, Lsn/h0$c;-><init>(Landroid/media/Image;Lsn/h0;ILeu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lsn/h0$c;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lsn/h0$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lsn/h0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lsn/h0$c;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lsn/h0$c;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lsn/h0$c;->u:Ljava/lang/Object;

    check-cast v1, Landroid/media/Image;

    iget-object v1, p0, Lsn/h0$c;->t:Ljava/lang/Object;

    check-cast v1, Ljava/lang/AutoCloseable;

    :try_start_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lzt/n;

    invoke-virtual {p1}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lsn/h0$c;->x:Landroid/media/Image;

    iget-object p1, p0, Lsn/h0$c;->y:Lsn/h0;

    iget v4, p0, Lsn/h0$c;->z:I

    :try_start_1
    invoke-static {v1, v4}, Lsn/o0;->e(Landroid/media/Image;I)Lsn/l0;

    move-result-object v4

    iput-object v1, p0, Lsn/h0$c;->t:Ljava/lang/Object;

    invoke-static {v1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lsn/h0$c;->u:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, p0, Lsn/h0$c;->v:I

    iput v3, p0, Lsn/h0$c;->w:I

    invoke-static {p1, v4, p0}, Lsn/h0;->l(Lsn/h0;Lsn/l0;Leu/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v3, 0x0

    invoke-static {v1, v3}, Lnu/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    iget-object v1, p0, Lsn/h0$c;->y:Lsn/h0;

    invoke-static {v1}, Lsn/h0;->m(Lsn/h0;)Ldv/b0;

    move-result-object v1

    invoke-static {p1}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object v4

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lsn/h0$c;->t:Ljava/lang/Object;

    iput-object v3, p0, Lsn/h0$c;->u:Ljava/lang/Object;

    iput v2, p0, Lsn/h0$c;->w:I

    invoke-interface {v1, v4, p0}, Ldv/b0;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :goto_3
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v1, p1}, Lnu/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
.end method
