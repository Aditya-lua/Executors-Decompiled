.class public Lt4/g;
.super Lt4/b;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi",
        "ClassVerificationFailure"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@\u00a2\u0006\u0004\u0008\t\u0010\nJ\"\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0097@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u000bH\u0097@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0014H\u0097@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0018H\u0097@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u001bH\u0097@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0097@\u00a2\u0006\u0004\u0008\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lt4/g;",
        "Lt4/b;",
        "Landroid/adservices/measurement/MeasurementManager;",
        "mMeasurementManager",
        "<init>",
        "(Landroid/adservices/measurement/MeasurementManager;)V",
        "Lt4/a;",
        "deletionRequest",
        "",
        "a",
        "(Lt4/a;Leu/b;)Ljava/lang/Object;",
        "Landroid/net/Uri;",
        "attributionSource",
        "Landroid/view/InputEvent;",
        "inputEvent",
        "c",
        "(Landroid/net/Uri;Landroid/view/InputEvent;Leu/b;)Ljava/lang/Object;",
        "trigger",
        "e",
        "(Landroid/net/Uri;Leu/b;)Ljava/lang/Object;",
        "Lt4/i;",
        "request",
        "f",
        "(Lt4/i;Leu/b;)Ljava/lang/Object;",
        "Lt4/h;",
        "d",
        "(Lt4/h;Leu/b;)Ljava/lang/Object;",
        "Lt4/j;",
        "g",
        "(Lt4/j;Leu/b;)Ljava/lang/Object;",
        "",
        "b",
        "(Leu/b;)Ljava/lang/Object;",
        "Landroid/adservices/measurement/MeasurementManager;",
        "i",
        "()Landroid/adservices/measurement/MeasurementManager;",
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
.field public final b:Landroid/adservices/measurement/MeasurementManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/adservices/measurement/MeasurementManager;)V
    .locals 1
    .param p1    # Landroid/adservices/measurement/MeasurementManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "mMeasurementManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt4/b;-><init>()V

    iput-object p1, p0, Lt4/g;->b:Landroid/adservices/measurement/MeasurementManager;

    return-void
.end method

.method public static synthetic h(Lt4/g;Lt4/a;Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/g;",
            "Lt4/a;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Lav/p;

    invoke-static {p2}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object p2

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0}, Lav/p;-><init>(Leu/b;I)V

    invoke-virtual {p1}, Lav/p;->G()V

    invoke-virtual {p0}, Lt4/g;->i()Landroid/adservices/measurement/MeasurementManager;

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic j(Lt4/g;Leu/b;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/g;",
            "Leu/b<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lav/p;

    invoke-static {p1}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lav/p;-><init>(Leu/b;I)V

    invoke-virtual {v0}, Lav/p;->G()V

    invoke-virtual {p0}, Lt4/g;->i()Landroid/adservices/measurement/MeasurementManager;

    move-result-object p0

    new-instance v1, Le3/n;

    invoke-direct {v1}, Le3/n;-><init>()V

    invoke-static {v0}, Lu2/n;->a(Leu/b;)Landroid/os/OutcomeReceiver;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Landroid/adservices/measurement/MeasurementManager;->getMeasurementApiStatus(Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v0}, Lav/p;->y()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lgu/h;->c(Leu/b;)V

    :cond_0
    return-object p0
.end method

.method public static synthetic k(Lt4/g;Landroid/net/Uri;Landroid/view/InputEvent;Leu/b;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/g;",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lav/p;

    invoke-static {p3}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lav/p;-><init>(Leu/b;I)V

    invoke-virtual {v0}, Lav/p;->G()V

    invoke-virtual {p0}, Lt4/g;->i()Landroid/adservices/measurement/MeasurementManager;

    move-result-object p0

    new-instance v1, Le3/n;

    invoke-direct {v1}, Le3/n;-><init>()V

    invoke-static {v0}, Lu2/n;->a(Leu/b;)Landroid/os/OutcomeReceiver;

    move-result-object v2

    invoke-virtual {p0, p1, p2, v1, v2}, Landroid/adservices/measurement/MeasurementManager;->registerSource(Landroid/net/Uri;Landroid/view/InputEvent;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v0}, Lav/p;->y()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p3}, Lgu/h;->c(Leu/b;)V

    :cond_0
    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic l(Lt4/g;Lt4/h;Leu/b;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/g;",
            "Lt4/h;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lt4/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lt4/g$a;-><init>(Lt4/h;Lt4/g;Leu/b;)V

    invoke-static {v0, p2}, Lav/q0;->g(Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic m(Lt4/g;Landroid/net/Uri;Leu/b;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/g;",
            "Landroid/net/Uri;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lav/p;

    invoke-static {p2}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lav/p;-><init>(Leu/b;I)V

    invoke-virtual {v0}, Lav/p;->G()V

    invoke-virtual {p0}, Lt4/g;->i()Landroid/adservices/measurement/MeasurementManager;

    move-result-object p0

    new-instance v1, Le3/n;

    invoke-direct {v1}, Le3/n;-><init>()V

    invoke-static {v0}, Lu2/n;->a(Leu/b;)Landroid/os/OutcomeReceiver;

    move-result-object v2

    invoke-virtual {p0, p1, v1, v2}, Landroid/adservices/measurement/MeasurementManager;->registerTrigger(Landroid/net/Uri;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v0}, Lav/p;->y()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p2}, Lgu/h;->c(Leu/b;)V

    :cond_0
    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic n(Lt4/g;Lt4/i;Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/g;",
            "Lt4/i;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Lav/p;

    invoke-static {p2}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object p2

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0}, Lav/p;-><init>(Leu/b;I)V

    invoke-virtual {p1}, Lav/p;->G()V

    invoke-virtual {p0}, Lt4/g;->i()Landroid/adservices/measurement/MeasurementManager;

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic o(Lt4/g;Lt4/j;Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/g;",
            "Lt4/j;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Lav/p;

    invoke-static {p2}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object p2

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0}, Lav/p;-><init>(Leu/b;I)V

    invoke-virtual {p1}, Lav/p;->G()V

    invoke-virtual {p0}, Lt4/g;->i()Landroid/adservices/measurement/MeasurementManager;

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public a(Lt4/a;Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lt4/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/a;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1, p2}, Lt4/g;->h(Lt4/g;Lt4/a;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1}, Lt4/g;->j(Lt4/g;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/net/Uri;Landroid/view/InputEvent;Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/InputEvent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lt4/g;->k(Lt4/g;Landroid/net/Uri;Landroid/view/InputEvent;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Lt4/h;Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lt4/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/h;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1, p2}, Lt4/g;->l(Lt4/g;Lt4/h;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Landroid/net/Uri;Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1, p2}, Lt4/g;->m(Lt4/g;Landroid/net/Uri;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Lt4/i;Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lt4/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/i;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1, p2}, Lt4/g;->n(Lt4/g;Lt4/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g(Lt4/j;Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lt4/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/j;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1, p2}, Lt4/g;->o(Lt4/g;Lt4/j;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final i()Landroid/adservices/measurement/MeasurementManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lt4/g;->b:Landroid/adservices/measurement/MeasurementManager;

    return-object v0
.end method
