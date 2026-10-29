.class public final Lnu/v$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/v;->e(Lnu/h;Lzt/o;)Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnu/h<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "nu/v$d",
        "Lnu/h;",
        "Lnu/i;",
        "collector",
        "",
        "collect",
        "(Lnu/i;Lnt/b;)Ljava/lang/Object;",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lnu/h;

.field public final synthetic b:Lzt/o;


# direct methods
.method public constructor <init>(Lnu/h;Lzt/o;)V
    .locals 0

    iput-object p1, p0, Lnu/v$d;->a:Lnu/h;

    iput-object p2, p0, Lnu/v$d;->b:Lzt/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-TT;>;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lnu/v$d$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lnu/v$d$a;

    iget v1, v0, Lnu/v$d$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnu/v$d$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnu/v$d$a;

    invoke-direct {v0, p0, p2}, Lnu/v$d$a;-><init>(Lnu/v$d;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lnu/v$d$a;->t:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lnu/v$d$a;->u:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide v5, v0, Lnu/v$d$a;->z:J

    iget-object p1, v0, Lnu/v$d$a;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    iget-object v2, v0, Lnu/v$d$a;->x:Ljava/lang/Object;

    check-cast v2, Lnu/i;

    iget-object v7, v0, Lnu/v$d$a;->w:Ljava/lang/Object;

    check-cast v7, Lnu/v$d;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lnu/v$d$a;->A:I

    iget-wide v5, v0, Lnu/v$d$a;->z:J

    iget-object v2, v0, Lnu/v$d$a;->x:Ljava/lang/Object;

    check-cast v2, Lnu/i;

    iget-object v7, v0, Lnu/v$d$a;->w:Ljava/lang/Object;

    check-cast v7, Lnu/v$d;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    const-wide/16 v5, 0x0

    move-object p2, p0

    :goto_1
    iget-object v2, p2, Lnu/v$d;->a:Lnu/h;

    iput-object p2, v0, Lnu/v$d$a;->w:Ljava/lang/Object;

    iput-object p1, v0, Lnu/v$d$a;->x:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, v0, Lnu/v$d$a;->y:Ljava/lang/Object;

    iput-wide v5, v0, Lnu/v$d$a;->z:J

    const/4 v7, 0x0

    iput v7, v0, Lnu/v$d$a;->A:I

    iput v4, v0, Lnu/v$d$a;->u:I

    invoke-static {v2, p1, v0}, Lnu/j;->g(Lnu/h;Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_3

    :cond_4
    move-object v10, v2

    move-object v2, p1

    move p1, v7

    move-object v7, p2

    move-object p2, v10

    :goto_2
    check-cast p2, Ljava/lang/Throwable;

    if-eqz p2, :cond_6

    iget-object p1, v7, Lnu/v$d;->b:Lzt/o;

    invoke-static {v5, v6}, Lpt/b;->e(J)Ljava/lang/Long;

    move-result-object v8

    iput-object v7, v0, Lnu/v$d$a;->w:Ljava/lang/Object;

    iput-object v2, v0, Lnu/v$d$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lnu/v$d$a;->y:Ljava/lang/Object;

    iput-wide v5, v0, Lnu/v$d$a;->z:J

    iput v3, v0, Lnu/v$d$a;->u:I

    const/4 v9, 0x6

    invoke-static {v9}, Lkotlin/jvm/internal/l;->c(I)V

    invoke-interface {p1, v2, p2, v8, v0}, Lzt/o;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v8, 0x7

    invoke-static {v8}, Lkotlin/jvm/internal/l;->c(I)V

    if-ne p1, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    move-object v10, p2

    move-object p2, p1

    move-object p1, v10

    :goto_4
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_7

    const-wide/16 p1, 0x1

    add-long/2addr v5, p1

    move p1, v4

    :cond_6
    move-object p2, v7

    goto :goto_5

    :cond_7
    throw p1

    :goto_5
    if-nez p1, :cond_8

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_8
    move-object p1, v2

    goto :goto_1
.end method
