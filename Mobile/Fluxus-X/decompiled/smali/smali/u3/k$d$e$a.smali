.class public final Lu3/k$d$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu3/k$d$e;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ldv/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "R",
        "value",
        "",
        "emit",
        "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Ldv/i;


# direct methods
.method public constructor <init>(Ldv/i;)V
    .locals 0

    iput-object p1, p0, Lu3/k$d$e$a;->a:Ldv/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 4
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lu3/k$d$e$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lu3/k$d$e$a$a;

    iget v1, v0, Lu3/k$d$e$a$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu3/k$d$e$a$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu3/k$d$e$a$a;

    invoke-direct {v0, p0, p2}, Lu3/k$d$e$a$a;-><init>(Lu3/k$d$e$a;Leu/b;)V

    :goto_0
    iget-object p2, v0, Lu3/k$d$e$a$a;->t:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lu3/k$d$e$a$a;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lu3/k$d$e$a;->a:Ldv/i;

    check-cast p1, Lu3/d0;

    instance-of v2, p1, Lu3/x;

    if-nez v2, :cond_7

    instance-of v2, p1, Lu3/f;

    if-eqz v2, :cond_4

    check-cast p1, Lu3/f;

    invoke-virtual {p1}, Lu3/f;->c()Ljava/lang/Object;

    move-result-object p1

    iput v3, v0, Lu3/k$d$e$a$a;->u:I

    invoke-interface {p2, p1, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_4
    instance-of p2, p1, Lu3/r;

    if-eqz p2, :cond_5

    goto :goto_2

    :cond_5
    instance-of v3, p1, Lu3/h0;

    :goto_2
    if-eqz v3, :cond_6

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Lzt/l;

    invoke-direct {p1}, Lzt/l;-><init>()V

    throw p1

    :cond_7
    check-cast p1, Lu3/x;

    invoke-virtual {p1}, Lu3/x;->b()Ljava/lang/Throwable;

    move-result-object p1

    throw p1
.end method
