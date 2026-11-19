.class public final Lnp/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnp/m0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u000b\u0008\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u001fB!\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J&\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0016*\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ \u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lnp/m0;",
        "",
        "Landroid/content/Context;",
        "applicationContext",
        "Lnr/b$a;",
        "silentNetworkAuthWorkerFactory",
        "Lup/w;",
        "service",
        "<init>",
        "(Landroid/content/Context;Lnr/b$a;Lup/w;)V",
        "",
        "sessionToken",
        "checkUrl",
        "",
        "timeoutSeconds",
        "",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;ILeu/b;)Ljava/lang/Object;",
        "Lzt/n;",
        "Lnr/d$b;",
        "d",
        "(Ljava/lang/String;ILeu/b;)Ljava/lang/Object;",
        "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;",
        "g",
        "(Lnr/d$b;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;",
        "",
        "f",
        "(Ljava/lang/Throwable;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;",
        "request",
        "e",
        "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Leu/b;)Ljava/lang/Object;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lnr/b$a;",
        "Lup/w;",
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
.field public static final d:Lnp/m0$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lnr/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lup/w;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnp/m0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnp/m0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lnp/m0;->d:Lnp/m0$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lnr/b$a;Lup/w;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnr/b$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lup/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "silentNetworkAuthWorkerFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "service"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnp/m0;->a:Landroid/content/Context;

    iput-object p2, p0, Lnp/m0;->b:Lnr/b$a;

    iput-object p3, p0, Lnp/m0;->c:Lup/w;

    return-void
.end method

.method public static final synthetic a(Lnp/m0;Ljava/lang/String;ILeu/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnp/m0;->d(Ljava/lang/String;ILeu/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lnp/m0;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Leu/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnp/m0;->e(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Leu/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;Ljava/lang/String;ILeu/b;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p4, Lnp/m0$b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lnp/m0$b;

    iget v1, v0, Lnp/m0$b;->A:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnp/m0$b;->A:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnp/m0$b;

    invoke-direct {v0, p0, p4}, Lnp/m0$b;-><init>(Lnp/m0;Leu/b;)V

    :goto_0
    iget-object p4, v0, Lnp/m0$b;->y:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lnp/m0$b;->A:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lnp/m0$b;->w:Ljava/lang/Object;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;

    iget-object p1, v0, Lnp/m0$b;->u:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lnp/m0$b;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p3, v0, Lnp/m0$b;->x:I

    iget-object p1, v0, Lnp/m0$b;->u:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljava/lang/String;

    iget-object p1, v0, Lnp/m0$b;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lzt/o;->b(Ljava/lang/Object;)V

    check-cast p4, Lzt/n;

    invoke-virtual {p4}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object p4

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lzt/o;->b(Ljava/lang/Object;)V

    iput-object p1, v0, Lnp/m0$b;->t:Ljava/lang/Object;

    invoke-static {p2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    iput-object p4, v0, Lnp/m0$b;->u:Ljava/lang/Object;

    iput p3, v0, Lnp/m0$b;->x:I

    iput v4, v0, Lnp/m0$b;->A:I

    invoke-virtual {p0, p2, p3, v0}, Lnp/m0;->d(Ljava/lang/String;ILeu/b;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    invoke-static {p4}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_5

    move-object v2, p4

    check-cast v2, Lnr/d$b;

    invoke-virtual {p0, v2}, Lnp/m0;->g(Lnr/d$b;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;

    move-result-object v2

    goto :goto_2

    :cond_5
    invoke-virtual {p0, v2}, Lnp/m0;->f(Ljava/lang/Throwable;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;

    move-result-object v2

    :goto_2
    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lnp/m0$b;->t:Ljava/lang/Object;

    invoke-static {p2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v0, Lnp/m0$b;->u:Ljava/lang/Object;

    invoke-static {p4}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v0, Lnp/m0$b;->v:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v0, Lnp/m0$b;->w:Ljava/lang/Object;

    iput p3, v0, Lnp/m0$b;->x:I

    iput v3, v0, Lnp/m0$b;->A:I

    invoke-virtual {p0, p1, v2, v0}, Lnp/m0;->e(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    :goto_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final d(Ljava/lang/String;ILeu/b;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Leu/b<",
            "-",
            "Lzt/n<",
            "+",
            "Lnr/d$b;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lnp/m0$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lnp/m0$c;

    iget v1, v0, Lnp/m0$c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnp/m0$c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnp/m0$c;

    invoke-direct {v0, p0, p3}, Lnp/m0$c;-><init>(Lnp/m0;Leu/b;)V

    :goto_0
    iget-object p3, v0, Lnp/m0$c;->w:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lnp/m0$c;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lnp/m0$c;->u:Ljava/lang/Object;

    check-cast p1, Lnr/b;

    iget-object p1, v0, Lnp/m0$c;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p3}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lzt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Lnp/m0;->b:Lnr/b$a;

    iget-object v2, p0, Lnp/m0;->a:Landroid/content/Context;

    new-instance v4, Lnr/a;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move-object v5, p1

    invoke-direct/range {v4 .. v10}, Lnr/a;-><init>(Ljava/lang/String;IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p3, v2, v4, p2}, Lnr/b$a;->a(Landroid/content/Context;Lnr/a;I)Lnr/b;

    move-result-object p1

    sget-object p3, Lzt/n;->b:Lzt/n$a;

    invoke-virtual {p1}, Lnr/b;->run()Ldv/h;

    move-result-object p3

    invoke-static {v5}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lnp/m0$c;->t:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lnp/m0$c;->u:Ljava/lang/Object;

    iput p2, v0, Lnp/m0$c;->v:I

    iput v3, v0, Lnp/m0$c;->y:I

    invoke-static {p3, v0}, Ldv/j;->t(Ldv/h;Leu/b;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p3}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :goto_2
    sget-object p2, Lzt/n;->b:Lzt/n$a;

    invoke-static {p1}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :goto_3
    throw p1
.end method

.method public final e(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Leu/b;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lnp/m0$d;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lnp/m0$d;

    iget v1, v0, Lnp/m0$d;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnp/m0$d;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnp/m0$d;

    invoke-direct {v0, p0, p3}, Lnp/m0$d;-><init>(Lnp/m0;Leu/b;)V

    :goto_0
    iget-object p3, v0, Lnp/m0$d;->v:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lnp/m0$d;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lnp/m0$d;->u:Ljava/lang/Object;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;

    iget-object p1, v0, Lnp/m0$d;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p3}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lzt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Lnp/m0;->c:Lup/w;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lnp/m0$d;->t:Ljava/lang/Object;

    invoke-static {p2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lnp/m0$d;->u:Ljava/lang/Object;

    iput v3, v0, Lnp/m0$d;->x:I

    invoke-interface {p3, p1, p2, v0}, Lup/w;->e(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Leu/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v1, :cond_3

    return-object v1

    :catchall_0
    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :goto_2
    throw p1
.end method

.method public final f(Ljava/lang/Throwable;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;
    .locals 6

    sget-object v0, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;->b:Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-string v2, "sdk_error"

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;->c(Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lnr/d$b;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;
    .locals 7

    instance-of v0, p1, Lnr/d$b$b;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;->b:Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;

    check-cast p1, Lnr/d$b$b;

    invoke-virtual {p1}, Lnr/d$b$b;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;->c(Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lnr/d$b$a;

    if-eqz v0, :cond_1

    sget-object v1, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;->b:Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;

    check-cast p1, Lnr/d$b$a;

    invoke-virtual {p1}, Lnr/d$b$a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lnr/d$b$a;->a()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;->c(Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lzt/l;

    invoke-direct {p1}, Lzt/l;-><init>()V

    throw p1
.end method
