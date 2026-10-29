.class public final Lkotlin/text/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lau/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/text/c;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lkotlin/ranges/IntRange;",
        ">;",
        "Lau/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0018*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096\u0002\u00a2\u0006\u0004\u0008\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\r\u001a\u0004\u0008\u0013\u0010\u000f\"\u0004\u0008\u0014\u0010\u0011R\"\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\r\u001a\u0004\u0008\u0017\u0010\u000f\"\u0004\u0008\u0018\u0010\u0011R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u0007\"\u0004\u0008\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010\r\u001a\u0004\u0008 \u0010\u000f\"\u0004\u0008!\u0010\u0011\u00a8\u0006#"
    }
    d2 = {
        "kotlin/text/c$a",
        "",
        "Lkotlin/ranges/IntRange;",
        "",
        "b",
        "()V",
        "d",
        "()Lkotlin/ranges/IntRange;",
        "",
        "hasNext",
        "()Z",
        "",
        "a",
        "I",
        "getNextState",
        "()I",
        "setNextState",
        "(I)V",
        "nextState",
        "getCurrentStartIndex",
        "setCurrentStartIndex",
        "currentStartIndex",
        "c",
        "getNextSearchIndex",
        "setNextSearchIndex",
        "nextSearchIndex",
        "Lkotlin/ranges/IntRange;",
        "getNextItem",
        "setNextItem",
        "(Lkotlin/ranges/IntRange;)V",
        "nextItem",
        "e",
        "getCounter",
        "setCounter",
        "counter",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Lkotlin/ranges/IntRange;

.field public e:I

.field public final synthetic f:Lkotlin/text/c;


# direct methods
.method public constructor <init>(Lkotlin/text/c;)V
    .locals 2

    iput-object p1, p0, Lkotlin/text/c$a;->f:Lkotlin/text/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lkotlin/text/c$a;->a:I

    invoke-static {p1}, Lkotlin/text/c;->e(Lkotlin/text/c;)I

    move-result v0

    invoke-static {p1}, Lkotlin/text/c;->c(Lkotlin/text/c;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lkotlin/ranges/d;->j(III)I

    move-result p1

    iput p1, p0, Lkotlin/text/c$a;->b:I

    iput p1, p0, Lkotlin/text/c$a;->c:I

    return-void
.end method

.method private final b()V
    .locals 6

    iget v0, p0, Lkotlin/text/c$a;->c:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    iput v1, p0, Lkotlin/text/c$a;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, Lkotlin/text/c$a;->d:Lkotlin/ranges/IntRange;

    return-void

    :cond_0
    iget-object v0, p0, Lkotlin/text/c$a;->f:Lkotlin/text/c;

    invoke-static {v0}, Lkotlin/text/c;->d(Lkotlin/text/c;)I

    move-result v0

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-lez v0, :cond_1

    iget v0, p0, Lkotlin/text/c$a;->e:I

    add-int/2addr v0, v3

    iput v0, p0, Lkotlin/text/c$a;->e:I

    iget-object v4, p0, Lkotlin/text/c$a;->f:Lkotlin/text/c;

    invoke-static {v4}, Lkotlin/text/c;->d(Lkotlin/text/c;)I

    move-result v4

    if-ge v0, v4, :cond_2

    :cond_1
    iget v0, p0, Lkotlin/text/c$a;->c:I

    iget-object v4, p0, Lkotlin/text/c$a;->f:Lkotlin/text/c;

    invoke-static {v4}, Lkotlin/text/c;->c(Lkotlin/text/c;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-le v0, v4, :cond_3

    :cond_2
    new-instance v0, Lkotlin/ranges/IntRange;

    iget v1, p0, Lkotlin/text/c$a;->b:I

    iget-object v4, p0, Lkotlin/text/c$a;->f:Lkotlin/text/c;

    invoke-static {v4}, Lkotlin/text/c;->c(Lkotlin/text/c;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Lkotlin/text/StringsKt__StringsKt;->h0(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, Lkotlin/ranges/IntRange;-><init>(II)V

    iput-object v0, p0, Lkotlin/text/c$a;->d:Lkotlin/ranges/IntRange;

    iput v2, p0, Lkotlin/text/c$a;->c:I

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lkotlin/text/c$a;->f:Lkotlin/text/c;

    invoke-static {v0}, Lkotlin/text/c;->b(Lkotlin/text/c;)Lkotlin/jvm/functions/Function2;

    move-result-object v0

    iget-object v4, p0, Lkotlin/text/c$a;->f:Lkotlin/text/c;

    invoke-static {v4}, Lkotlin/text/c;->c(Lkotlin/text/c;)Ljava/lang/CharSequence;

    move-result-object v4

    iget v5, p0, Lkotlin/text/c$a;->c:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    if-nez v0, :cond_4

    new-instance v0, Lkotlin/ranges/IntRange;

    iget v1, p0, Lkotlin/text/c$a;->b:I

    iget-object v4, p0, Lkotlin/text/c$a;->f:Lkotlin/text/c;

    invoke-static {v4}, Lkotlin/text/c;->c(Lkotlin/text/c;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Lkotlin/text/StringsKt__StringsKt;->h0(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, Lkotlin/ranges/IntRange;-><init>(II)V

    iput-object v0, p0, Lkotlin/text/c$a;->d:Lkotlin/ranges/IntRange;

    iput v2, p0, Lkotlin/text/c$a;->c:I

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v4, p0, Lkotlin/text/c$a;->b:I

    invoke-static {v4, v2}, Lkotlin/ranges/d;->q(II)Lkotlin/ranges/IntRange;

    move-result-object v4

    iput-object v4, p0, Lkotlin/text/c$a;->d:Lkotlin/ranges/IntRange;

    add-int/2addr v2, v0

    iput v2, p0, Lkotlin/text/c$a;->b:I

    if-nez v0, :cond_5

    move v1, v3

    :cond_5
    add-int/2addr v2, v1

    iput v2, p0, Lkotlin/text/c$a;->c:I

    :goto_0
    iput v3, p0, Lkotlin/text/c$a;->a:I

    return-void
.end method


# virtual methods
.method public d()Lkotlin/ranges/IntRange;
    .locals 3

    iget v0, p0, Lkotlin/text/c$a;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lkotlin/text/c$a;->b()V

    :cond_0
    iget v0, p0, Lkotlin/text/c$a;->a:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkotlin/text/c$a;->d:Lkotlin/ranges/IntRange;

    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    iput-object v2, p0, Lkotlin/text/c$a;->d:Lkotlin/ranges/IntRange;

    iput v1, p0, Lkotlin/text/c$a;->a:I

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lkotlin/text/c$a;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lkotlin/text/c$a;->b()V

    :cond_0
    iget v0, p0, Lkotlin/text/c$a;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkotlin/text/c$a;->d()Lkotlin/ranges/IntRange;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
