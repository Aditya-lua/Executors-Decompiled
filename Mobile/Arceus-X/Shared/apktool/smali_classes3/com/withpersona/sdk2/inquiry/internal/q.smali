.class public final Lcom/withpersona/sdk2/inquiry/internal/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/internal/q$a;,
        Lcom/withpersona/sdk2/inquiry/internal/q$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\r\u0013B\u001b\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/q;",
        "",
        "Lzo/k0;",
        "orchestrator",
        "Lku/l0;",
        "dispatcher",
        "<init>",
        "(Lzo/k0;Lku/l0;)V",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;",
        "state",
        "",
        "d",
        "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V",
        "b",
        "()V",
        "c",
        "Lcom/withpersona/sdk2/inquiry/internal/q$b;",
        "e",
        "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)Lcom/withpersona/sdk2/inquiry/internal/q$b;",
        "a",
        "Lzo/k0;",
        "Lku/l0;",
        "Lku/p0;",
        "Lku/p0;",
        "scope",
        "Lku/d2;",
        "Lku/d2;",
        "currentJob",
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


# static fields
.field public static final e:Lcom/withpersona/sdk2/inquiry/internal/q$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lzo/k0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lku/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public volatile d:Lku/d2;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/internal/q$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/internal/q;->e:Lcom/withpersona/sdk2/inquiry/internal/q$a;

    return-void
.end method

.method public constructor <init>(Lzo/k0;Lku/l0;)V
    .locals 1
    .param p1    # Lzo/k0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lku/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "orchestrator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/q;->a:Lzo/k0;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/q;->b:Lku/l0;

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p1, v0, p1}, Lku/z2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {p1}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/q;->c:Lku/p0;

    return-void
.end method

.method public static final synthetic a(Lcom/withpersona/sdk2/inquiry/internal/q;)Lzo/k0;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/internal/q;->a:Lzo/k0;

    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/q;->d:Lku/d2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lku/d2$a;->a(Lku/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iput-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/q;->d:Lku/d2;

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/q;->c:Lku/p0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lku/q0;->f(Lku/p0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public final d(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V
    .locals 8
    .param p1    # Lcom/withpersona/sdk2/inquiry/internal/InquiryState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/q;->e(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)Lcom/withpersona/sdk2/inquiry/internal/q$b;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/q;->d:Lku/d2;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lku/d2;->b()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/q;->c:Lku/p0;

    new-instance v5, Lcom/withpersona/sdk2/inquiry/internal/q$c;

    const/4 v0, 0x0

    invoke-direct {v5, p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/internal/q$c;-><init>(Lcom/withpersona/sdk2/inquiry/internal/q;Lcom/withpersona/sdk2/inquiry/internal/q$b;Lnt/b;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/q;->d:Lku/d2;

    return-void
.end method

.method public final e(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)Lcom/withpersona/sdk2/inquiry/internal/q$b;
    .locals 3

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;->W()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/withpersona/sdk2/inquiry/internal/q$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$GovernmentIdStepRunning;->V()Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v1, v2, v0, p1}, Lcom/withpersona/sdk2/inquiry/internal/q$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    :cond_1
    :goto_0
    return-object v1

    :cond_2
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;->R()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    new-instance v1, Lcom/withpersona/sdk2/inquiry/internal/q$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState$SelfieStepRunning;->Q()Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v1, v2, v0, p1}, Lcom/withpersona/sdk2/inquiry/internal/q$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    :cond_4
    :goto_1
    return-object v1
.end method
