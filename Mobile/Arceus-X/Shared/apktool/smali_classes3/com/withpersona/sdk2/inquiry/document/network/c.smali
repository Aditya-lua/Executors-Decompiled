.class public final Lcom/withpersona/sdk2/inquiry/document/network/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lym/o;
.implements Lvr/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/document/network/c$a;,
        Lcom/withpersona/sdk2/inquiry/document/network/c$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lym/o<",
        "Lcom/withpersona/sdk2/inquiry/document/network/c$b;",
        ">;",
        "Lvr/h<",
        "Lcom/withpersona/sdk2/inquiry/document/network/c$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0012.B9\u0008\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\r2\n\u0010\u0011\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\n\u0010\u0011\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0082@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0004H\u0082@\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\"R\u0014\u0010\u0008\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,\u00a8\u0006/"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/document/network/c;",
        "Lym/o;",
        "Lcom/withpersona/sdk2/inquiry/document/network/c$b;",
        "Lvr/h;",
        "",
        "sessionToken",
        "Lbo/c;",
        "service",
        "documentId",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;",
        "localDocument",
        "Ljq/k;",
        "fileHelper",
        "",
        "isSingleFileLimit",
        "<init>",
        "(Ljava/lang/String;Lbo/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Ljq/k;Z)V",
        "otherWorker",
        "b",
        "(Lym/o;)Z",
        "c",
        "(Lvr/h;)Z",
        "Lnu/h;",
        "run",
        "()Lnu/h;",
        "",
        "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;",
        "n",
        "(Lnt/b;)Ljava/lang/Object;",
        "documentFileId",
        "",
        "m",
        "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "Ljava/lang/String;",
        "Lbo/c;",
        "d",
        "e",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;",
        "f",
        "Ljq/k;",
        "g",
        "Z",
        "Lku/p0;",
        "h",
        "Lku/p0;",
        "serviceCoroutineScope",
        "a",
        "document_release"
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
.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lbo/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Ljq/k;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Z

.field public final h:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbo/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Ljq/k;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->b:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->c:Lbo/c;

    .line 5
    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->d:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    .line 7
    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->f:Ljq/k;

    .line 8
    iput-boolean p6, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->g:Z

    .line 9
    invoke-static {}, Lku/g1;->a()Lku/l0;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x1

    invoke-static {p2, p3, p2}, Lku/g2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {p1}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->h:Lku/p0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lbo/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Ljq/k;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/withpersona/sdk2/inquiry/document/network/c;-><init>(Ljava/lang/String;Lbo/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Ljq/k;Z)V

    return-void
.end method

.method public static final synthetic d(Lcom/withpersona/sdk2/inquiry/document/network/c;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/c;->m(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/withpersona/sdk2/inquiry/document/network/c;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/network/c;->n(Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/withpersona/sdk2/inquiry/document/network/c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic g(Lcom/withpersona/sdk2/inquiry/document/network/c;)Ljq/k;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->f:Ljq/k;

    return-object p0
.end method

.method public static final synthetic h(Lcom/withpersona/sdk2/inquiry/document/network/c;)Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    return-object p0
.end method

.method public static final synthetic i(Lcom/withpersona/sdk2/inquiry/document/network/c;)Lbo/c;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->c:Lbo/c;

    return-object p0
.end method

.method public static final synthetic j(Lcom/withpersona/sdk2/inquiry/document/network/c;)Lku/p0;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->h:Lku/p0;

    return-object p0
.end method

.method public static final synthetic k(Lcom/withpersona/sdk2/inquiry/document/network/c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic l(Lcom/withpersona/sdk2/inquiry/document/network/c;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->g:Z

    return p0
.end method


# virtual methods
.method public a(Lvr/h;)Z
    .locals 0
    .param p1    # Lvr/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr/h<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lvr/h;->a(Lvr/h;)Z

    move-result p1

    return p1
.end method

.method public b(Lym/o;)Z
    .locals 2
    .param p1    # Lym/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/o<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/network/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->b:Ljava/lang/String;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/c;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/document/network/c;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/document/network/c;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public c(Lvr/h;)Z
    .locals 2
    .param p1    # Lvr/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr/h<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/network/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->b:Ljava/lang/String;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/c;

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/document/network/c;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/document/network/c;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final m(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/withpersona/sdk2/inquiry/document/network/c$c;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/c;Ljava/lang/String;Lnt/b;)V

    invoke-static {v0, p2}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueRetriableRequestWithRetry(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final n(Lnt/b;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/network/c$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/network/c$d;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$d;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$d;->v:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/c$d;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/document/network/c$d;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/c;Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$d;->t:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$d;->v:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p1, Lcom/withpersona/sdk2/inquiry/document/network/c$e;

    invoke-direct {p1, p0, v4}, Lcom/withpersona/sdk2/inquiry/document/network/c$e;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/c;Lnt/b;)V

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$d;->v:I

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueRetriableRequestWithRetry(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    if-eqz v0, :cond_4

    return-object v4

    :cond_4
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    if-eqz v0, :cond_6

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;->getResponse()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;->b()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_5
    return-object v4

    :cond_6
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method

.method public run()Lnu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/h<",
            "Lcom/withpersona/sdk2/inquiry/document/network/c$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/withpersona/sdk2/inquiry/document/network/c$f;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/c;Lnt/b;)V

    invoke-static {v0}, Lnu/j;->w(Lkotlin/jvm/functions/Function2;)Lnu/h;

    move-result-object v0

    return-object v0
.end method
