.class public final Lw6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/i;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JB\u0010\u000e\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00062\u0006\u0010\u0008\u001a\u00020\u00072\"\u0010\r\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\tH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u00a8\u0006\u001c"
    }
    d2 = {
        "Lw6/a;",
        "Lt6/i;",
        "Lokhttp3/Call$Factory;",
        "callFactory",
        "c",
        "(Lokhttp3/Call$Factory;)Lokhttp3/Call$Factory;",
        "T",
        "Lt6/o;",
        "request",
        "Lkotlin/Function2;",
        "Lt6/q;",
        "Lnt/b;",
        "",
        "block",
        "e",
        "(Lokhttp3/Call$Factory;Lt6/o;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lokhttp3/Call$Factory;",
        "coil-network-okhttp"
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
.field public final a:Lokhttp3/Call$Factory;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public synthetic constructor <init>(Lokhttp3/Call$Factory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw6/a;->a:Lokhttp3/Call$Factory;

    return-void
.end method

.method public static final synthetic b(Lokhttp3/Call$Factory;)Lw6/a;
    .locals 1

    new-instance v0, Lw6/a;

    invoke-direct {v0, p0}, Lw6/a;-><init>(Lokhttp3/Call$Factory;)V

    return-object v0
.end method

.method public static c(Lokhttp3/Call$Factory;)Lokhttp3/Call$Factory;
    .locals 0
    .param p0    # Lokhttp3/Call$Factory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    return-object p0
.end method

.method public static d(Lokhttp3/Call$Factory;Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lw6/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lw6/a;

    invoke-virtual {p1}, Lw6/a;->h()Lokhttp3/Call$Factory;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static e(Lokhttp3/Call$Factory;Lt6/o;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;
    .locals 8
    .param p1    # Lt6/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lokhttp3/Call$Factory;",
            "Lt6/o;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lt6/q;",
            "-",
            "Lnt/b<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lnt/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p3, Lw6/a$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lw6/a$a;

    iget v1, v0, Lw6/a$a;->A:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw6/a$a;->A:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw6/a$a;

    invoke-direct {v0, p3}, Lw6/a$a;-><init>(Lnt/b;)V

    :goto_0
    iget-object p3, v0, Lw6/a$a;->z:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lw6/a$a;->A:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lw6/a$a;->x:Ljava/lang/Object;

    check-cast p0, Lokhttp3/Response;

    iget-object p0, v0, Lw6/a$a;->w:Ljava/lang/Object;

    check-cast p0, Ljava/io/Closeable;

    iget-object p1, v0, Lw6/a$a;->v:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function2;

    iget-object p1, v0, Lw6/a$a;->u:Ljava/lang/Object;

    check-cast p1, Lt6/o;

    iget-object p1, v0, Lw6/a$a;->t:Ljava/lang/Object;

    check-cast p1, Lokhttp3/Call$Factory;

    :try_start_0
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lw6/a$a;->v:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/functions/Function2;

    iget-object p1, v0, Lw6/a$a;->u:Ljava/lang/Object;

    check-cast p1, Lt6/o;

    iget-object p2, v0, Lw6/a$a;->t:Ljava/lang/Object;

    check-cast p2, Lokhttp3/Call$Factory;

    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p0, v0, Lw6/a$a;->w:Ljava/lang/Object;

    check-cast p0, Lokhttp3/Call$Factory;

    iget-object p1, v0, Lw6/a$a;->v:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lkotlin/jvm/functions/Function2;

    iget-object p1, v0, Lw6/a$a;->u:Ljava/lang/Object;

    check-cast p1, Lt6/o;

    iget-object v2, v0, Lw6/a$a;->t:Ljava/lang/Object;

    check-cast v2, Lokhttp3/Call$Factory;

    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {p0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, v0, Lw6/a$a;->t:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, v0, Lw6/a$a;->u:Ljava/lang/Object;

    iput-object p2, v0, Lw6/a$a;->v:Ljava/lang/Object;

    iput-object p0, v0, Lw6/a$a;->w:Ljava/lang/Object;

    iput v5, v0, Lw6/a$a;->A:I

    invoke-static {p1, v0}, Lw6/e;->c(Lt6/o;Lnt/b;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v2, p0

    :goto_1
    check-cast p3, Lokhttp3/Request;

    invoke-interface {p0, p3}, Lokhttp3/Call$Factory;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object p0

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, v0, Lw6/a$a;->t:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, v0, Lw6/a$a;->u:Ljava/lang/Object;

    iput-object p2, v0, Lw6/a$a;->v:Ljava/lang/Object;

    iput-object v6, v0, Lw6/a$a;->w:Ljava/lang/Object;

    iput v4, v0, Lw6/a$a;->A:I

    invoke-static {p0, v0}, Lw6/b;->a(Lokhttp3/Call;Lnt/b;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    goto :goto_3

    :cond_6
    move-object p0, p2

    move-object p2, v2

    :goto_2
    check-cast p3, Ljava/io/Closeable;

    :try_start_1
    move-object v2, p3

    check-cast v2, Lokhttp3/Response;

    invoke-static {v2}, Lw6/e;->b(Lokhttp3/Response;)Lt6/q;

    move-result-object v4

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v0, Lw6/a$a;->t:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lw6/a$a;->u:Ljava/lang/Object;

    invoke-static {p0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lw6/a$a;->v:Ljava/lang/Object;

    iput-object p3, v0, Lw6/a$a;->w:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lw6/a$a;->x:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lw6/a$a;->y:I

    iput v3, v0, Lw6/a$a;->A:I

    invoke-interface {p0, v4, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p0, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    move-object v7, p3

    move-object p3, p0

    move-object p0, v7

    :goto_4
    invoke-static {p0, v6}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object p3

    :catchall_1
    move-exception p1

    move-object p0, p3

    :goto_5
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    move-exception p2

    invoke-static {p0, p1}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static f(Lokhttp3/Call$Factory;)I
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public static g(Lokhttp3/Call$Factory;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CallFactoryNetworkClient(callFactory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lt6/o;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lt6/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lt6/o;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lt6/q;",
            "-",
            "Lnt/b<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lnt/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lw6/a;->a:Lokhttp3/Call$Factory;

    invoke-static {v0, p1, p2, p3}, Lw6/a;->e(Lokhttp3/Call$Factory;Lt6/o;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lw6/a;->a:Lokhttp3/Call$Factory;

    invoke-static {v0, p1}, Lw6/a;->d(Lokhttp3/Call$Factory;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic h()Lokhttp3/Call$Factory;
    .locals 1

    iget-object v0, p0, Lw6/a;->a:Lokhttp3/Call$Factory;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lw6/a;->a:Lokhttp3/Call$Factory;

    invoke-static {v0}, Lw6/a;->f(Lokhttp3/Call$Factory;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw6/a;->a:Lokhttp3/Call$Factory;

    invoke-static {v0}, Lw6/a;->g(Lokhttp3/Call$Factory;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
