.class public final Lzo/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0015\u0010\u0010J2\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0019H\u0082@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lzo/i;",
        "",
        "Lgp/w;",
        "inquiryService",
        "Lum/w;",
        "moshi",
        "Lnp/b;",
        "logger",
        "Lku/p0;",
        "coroutineScope",
        "<init>",
        "(Lgp/w;Lum/w;Lnp/b;Lku/p0;)V",
        "",
        "sessionToken",
        "Lku/d2;",
        "i",
        "(Ljava/lang/String;)Lku/d2;",
        "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;",
        "errorInfo",
        "f",
        "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lku/d2;",
        "h",
        "subsystem",
        "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;",
        "errorType",
        "Lnp/a;",
        "level",
        "",
        "e",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Lnp/a;Lnt/b;)Ljava/lang/Object;",
        "a",
        "Lgp/w;",
        "b",
        "Lum/w;",
        "c",
        "Lnp/b;",
        "d",
        "Lku/p0;",
        "inquiry-internal_release"
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
.field public final a:Lgp/w;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lum/w;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lnp/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgp/w;Lum/w;Lnp/b;Lku/p0;)V
    .locals 1
    .param p1    # Lgp/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lum/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnp/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lku/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "inquiryService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moshi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo/i;->a:Lgp/w;

    iput-object p2, p0, Lzo/i;->b:Lum/w;

    iput-object p3, p0, Lzo/i;->c:Lnp/b;

    iput-object p4, p0, Lzo/i;->d:Lku/p0;

    return-void
.end method

.method public static final synthetic a(Lzo/i;)Lgp/w;
    .locals 0

    iget-object p0, p0, Lzo/i;->a:Lgp/w;

    return-object p0
.end method

.method public static final synthetic b(Lzo/i;)Lnp/b;
    .locals 0

    iget-object p0, p0, Lzo/i;->c:Lnp/b;

    return-object p0
.end method

.method public static final synthetic c(Lzo/i;)Lum/w;
    .locals 0

    iget-object p0, p0, Lzo/i;->b:Lum/w;

    return-object p0
.end method

.method public static final synthetic d(Lzo/i;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Lnp/a;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lzo/i;->e(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Lnp/a;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lzo/i;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Lnp/a;Lnt/b;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    sget-object p4, Lnp/a;->c:Lnp/a;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lzo/i;->e(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Lnp/a;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final e(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Lnp/a;Lnt/b;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;",
            "Lnp/a;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lzo/i$b;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lzo/i$b;

    iget v1, v0, Lzo/i$b;->A:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lzo/i$b;->A:I

    goto :goto_0

    :cond_0
    new-instance v0, Lzo/i$b;

    invoke-direct {v0, p0, p5}, Lzo/i$b;-><init>(Lzo/i;Lnt/b;)V

    :goto_0
    iget-object p5, v0, Lzo/i$b;->y:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lzo/i$b;->A:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lzo/i$b;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lzo/i$b;->w:Ljava/lang/Object;

    check-cast p1, Lnp/a;

    iget-object p1, v0, Lzo/i$b;->v:Ljava/lang/Object;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    iget-object p1, v0, Lzo/i$b;->u:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lzo/i$b;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p5}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lzo/i$b;->w:Ljava/lang/Object;

    move-object p4, p1

    check-cast p4, Lnp/a;

    iget-object p1, v0, Lzo/i$b;->v:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    iget-object p1, v0, Lzo/i$b;->u:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljava/lang/String;

    iget-object p1, v0, Lzo/i$b;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p5}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p5}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p5, p0, Lzo/i;->c:Lnp/b;

    iput-object p1, v0, Lzo/i$b;->t:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lzo/i$b;->u:Ljava/lang/Object;

    iput-object p3, v0, Lzo/i$b;->v:Ljava/lang/Object;

    invoke-static {p4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lzo/i$b;->w:Ljava/lang/Object;

    iput v4, v0, Lzo/i$b;->A:I

    invoke-virtual {p5, p2, p4, v0}, Lnp/b;->j(Ljava/lang/String;Lnp/a;Lnt/b;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p5, Ljava/lang/String;

    if-nez p5, :cond_5

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_5
    invoke-static {p5}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_6
    iget-object v2, p0, Lzo/i;->a:Lgp/w;

    new-instance v4, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;

    iget-object v5, p0, Lzo/i;->b:Lum/w;

    const-class v6, Lcom/withpersona/sdk2/inquiry/internal/ErrorLog;

    invoke-virtual {v5, v6}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v5

    new-instance v6, Lcom/withpersona/sdk2/inquiry/internal/ErrorLog;

    invoke-direct {v6, p5}, Lcom/withpersona/sdk2/inquiry/internal/ErrorLog;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Lum/h;->toJsonValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v4, p3, v5}, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Ljava/lang/Object;)V

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lzo/i$b;->t:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v0, Lzo/i$b;->u:Ljava/lang/Object;

    invoke-static {p3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v0, Lzo/i$b;->v:Ljava/lang/Object;

    invoke-static {p4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v0, Lzo/i$b;->w:Ljava/lang/Object;

    invoke-static {p5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v0, Lzo/i$b;->x:Ljava/lang/Object;

    iput v3, v0, Lzo/i$b;->A:I

    invoke-interface {v2, p1, v4, v0}, Lgp/w;->c(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final f(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lku/d2;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "sessionToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lzo/i;->d:Lku/p0;

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v2

    new-instance v4, Lzo/i$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Lzo/i$a;-><init>(Lzo/i;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lnt/b;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/String;)Lku/d2;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "sessionToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lzo/i;->d:Lku/p0;

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v2

    new-instance v4, Lzo/i$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lzo/i$c;-><init>(Lzo/i;Ljava/lang/String;Lnt/b;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object p1

    return-object p1
.end method

.method public final i(Ljava/lang/String;)Lku/d2;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "sessionToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lzo/i;->d:Lku/p0;

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v2

    new-instance v4, Lzo/i$d;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lzo/i$d;-><init>(Lzo/i;Ljava/lang/String;Lnt/b;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object p1

    return-object p1
.end method
