.class public Lt4/s;
.super Lt4/j;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000eH\u0010\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0083@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lt4/s;",
        "Lt4/j;",
        "Landroid/adservices/topics/TopicsManager;",
        "mTopicsManager",
        "<init>",
        "(Landroid/adservices/topics/TopicsManager;)V",
        "Lt4/b;",
        "request",
        "Lt4/e;",
        "a",
        "(Lt4/b;Lnt/b;)Ljava/lang/Object;",
        "Landroid/adservices/topics/GetTopicsRequest;",
        "c",
        "(Lt4/b;)Landroid/adservices/topics/GetTopicsRequest;",
        "Landroid/adservices/topics/GetTopicsResponse;",
        "response",
        "d",
        "(Landroid/adservices/topics/GetTopicsResponse;)Lt4/e;",
        "getTopicsRequest",
        "f",
        "(Landroid/adservices/topics/GetTopicsRequest;Lnt/b;)Ljava/lang/Object;",
        "b",
        "Landroid/adservices/topics/TopicsManager;",
        "ads-adservices_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Landroid/adservices/topics/TopicsManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/adservices/topics/TopicsManager;)V
    .locals 1
    .param p1    # Landroid/adservices/topics/TopicsManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "mTopicsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt4/j;-><init>()V

    iput-object p1, p0, Lt4/s;->b:Landroid/adservices/topics/TopicsManager;

    return-void
.end method

.method public static final synthetic b(Lt4/s;)Landroid/adservices/topics/TopicsManager;
    .locals 0

    iget-object p0, p0, Lt4/s;->b:Landroid/adservices/topics/TopicsManager;

    return-object p0
.end method

.method public static synthetic e(Lt4/s;Lt4/b;Lnt/b;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/s;",
            "Lt4/b;",
            "Lnt/b<",
            "-",
            "Lt4/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lt4/s$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lt4/s$a;

    iget v1, v0, Lt4/s$a;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt4/s$a;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt4/s$a;

    invoke-direct {v0, p0, p2}, Lt4/s$a;-><init>(Lt4/s;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lt4/s$a;->u:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lt4/s$a;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lt4/s$a;->t:Ljava/lang/Object;

    check-cast p0, Lt4/s;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lt4/s;->c(Lt4/b;)Landroid/adservices/topics/GetTopicsRequest;

    move-result-object p1

    iput-object p0, v0, Lt4/s$a;->t:Ljava/lang/Object;

    iput v3, v0, Lt4/s$a;->w:I

    invoke-virtual {p0, p1, v0}, Lt4/s;->f(Landroid/adservices/topics/GetTopicsRequest;Lnt/b;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p2}, Lt4/r;->a(Ljava/lang/Object;)Landroid/adservices/topics/GetTopicsResponse;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt4/s;->d(Landroid/adservices/topics/GetTopicsResponse;)Lt4/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lt4/b;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lt4/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/b;",
            "Lnt/b<",
            "-",
            "Lt4/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1, p2}, Lt4/s;->e(Lt4/s;Lt4/b;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Lt4/b;)Landroid/adservices/topics/GetTopicsRequest;
    .locals 1
    .param p1    # Lt4/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lt4/d;->a:Lt4/d;

    invoke-virtual {v0, p1}, Lt4/d;->b(Lt4/b;)Landroid/adservices/topics/GetTopicsRequest;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/adservices/topics/GetTopicsResponse;)Lt4/e;
    .locals 1
    .param p1    # Landroid/adservices/topics/GetTopicsResponse;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lt4/h;->a:Lt4/h;

    invoke-virtual {v0, p1}, Lt4/h;->a(Landroid/adservices/topics/GetTopicsResponse;)Lt4/e;

    move-result-object p1

    return-object p1
.end method

.method public final f(Landroid/adservices/topics/GetTopicsRequest;Lnt/b;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/adservices/topics/GetTopicsRequest;",
            "Lnt/b<",
            "-",
            "Landroid/adservices/topics/GetTopicsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lku/p;

    invoke-static {p2}, Lot/b;->c(Lnt/b;)Lnt/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lku/p;-><init>(Lnt/b;I)V

    invoke-virtual {v0}, Lku/p;->H()V

    invoke-static {p0}, Lt4/s;->b(Lt4/s;)Landroid/adservices/topics/TopicsManager;

    move-result-object v1

    new-instance v2, Le3/n;

    invoke-direct {v2}, Le3/n;-><init>()V

    invoke-static {v0}, Lu2/n;->a(Lnt/b;)Landroid/os/OutcomeReceiver;

    move-result-object v3

    invoke-virtual {v1, p1, v2, v3}, Landroid/adservices/topics/TopicsManager;->getTopics(Landroid/adservices/topics/GetTopicsRequest;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v0}, Lku/p;->A()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lpt/h;->c(Lnt/b;)V

    :cond_0
    return-object p1
.end method
