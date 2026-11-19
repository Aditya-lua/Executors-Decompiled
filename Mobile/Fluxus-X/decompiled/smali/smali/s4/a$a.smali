.class public final Ls4/a$a;
.super Ls4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0013\u001a\u00020\u0012H\u0017\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0016\u001a\u00020\u000cH\u0017\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0013\u001a\u00020\u0019H\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0013\u001a\u00020\u001cH\u0017\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u0008H\u0017\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Ls4/a$a;",
        "Ls4/a;",
        "Lt4/b;",
        "mMeasurementManager",
        "<init>",
        "(Lt4/b;)V",
        "Lt4/a;",
        "deletionRequest",
        "Lpe/x;",
        "",
        "e",
        "(Lt4/a;)Lpe/x;",
        "Landroid/net/Uri;",
        "attributionSource",
        "Landroid/view/InputEvent;",
        "inputEvent",
        "f",
        "(Landroid/net/Uri;Landroid/view/InputEvent;)Lpe/x;",
        "Lt4/h;",
        "request",
        "g",
        "(Lt4/h;)Lpe/x;",
        "trigger",
        "c",
        "(Landroid/net/Uri;)Lpe/x;",
        "Lt4/i;",
        "h",
        "(Lt4/i;)Lpe/x;",
        "Lt4/j;",
        "i",
        "(Lt4/j;)Lpe/x;",
        "",
        "b",
        "()Lpe/x;",
        "Lt4/b;",
        "ads-adservices-java_release"
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
.field public final b:Lt4/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt4/b;)V
    .locals 1
    .param p1    # Lt4/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "mMeasurementManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ls4/a;-><init>()V

    iput-object p1, p0, Ls4/a$a;->b:Lt4/b;

    return-void
.end method

.method public static final synthetic d(Ls4/a$a;)Lt4/b;
    .locals 0

    iget-object p0, p0, Ls4/a$a;->b:Lt4/b;

    return-object p0
.end method


# virtual methods
.method public b()Lpe/x;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpe/x<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lav/g1;->a()Lav/l0;

    move-result-object v0

    invoke-static {v0}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object v1

    new-instance v4, Ls4/a$a$b;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Ls4/a$a$b;-><init>(Ls4/a$a;Leu/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->b(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/w0;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v0}, Lr4/b;->c(Lav/w0;Ljava/lang/Object;ILjava/lang/Object;)Lpe/x;

    move-result-object v0

    return-object v0
.end method

.method public c(Landroid/net/Uri;)Lpe/x;
    .locals 7
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Lpe/x<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "trigger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lav/g1;->a()Lav/l0;

    move-result-object v0

    invoke-static {v0}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object v1

    new-instance v4, Ls4/a$a$e;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Ls4/a$a$e;-><init>(Ls4/a$a;Landroid/net/Uri;Leu/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->b(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/w0;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lr4/b;->c(Lav/w0;Ljava/lang/Object;ILjava/lang/Object;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public e(Lt4/a;)Lpe/x;
    .locals 7
    .param p1    # Lt4/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/a;",
            ")",
            "Lpe/x<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "deletionRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lav/g1;->a()Lav/l0;

    move-result-object v0

    invoke-static {v0}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object v1

    new-instance v4, Ls4/a$a$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Ls4/a$a$a;-><init>(Ls4/a$a;Lt4/a;Leu/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->b(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/w0;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lr4/b;->c(Lav/w0;Ljava/lang/Object;ILjava/lang/Object;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public f(Landroid/net/Uri;Landroid/view/InputEvent;)Lpe/x;
    .locals 7
    .param p1    # Landroid/net/Uri;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/InputEvent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            ")",
            "Lpe/x<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "attributionSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lav/g1;->a()Lav/l0;

    move-result-object v0

    invoke-static {v0}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object v1

    new-instance v4, Ls4/a$a$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Ls4/a$a$c;-><init>(Ls4/a$a;Landroid/net/Uri;Landroid/view/InputEvent;Leu/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->b(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/w0;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, v0, p2, v0}, Lr4/b;->c(Lav/w0;Ljava/lang/Object;ILjava/lang/Object;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public g(Lt4/h;)Lpe/x;
    .locals 7
    .param p1    # Lt4/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/h;",
            ")",
            "Lpe/x<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lav/g1;->a()Lav/l0;

    move-result-object v0

    invoke-static {v0}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object v1

    new-instance v4, Ls4/a$a$d;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Ls4/a$a$d;-><init>(Ls4/a$a;Lt4/h;Leu/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->b(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/w0;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lr4/b;->c(Lav/w0;Ljava/lang/Object;ILjava/lang/Object;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public h(Lt4/i;)Lpe/x;
    .locals 7
    .param p1    # Lt4/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/i;",
            ")",
            "Lpe/x<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lav/g1;->a()Lav/l0;

    move-result-object v0

    invoke-static {v0}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object v1

    new-instance v4, Ls4/a$a$f;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Ls4/a$a$f;-><init>(Ls4/a$a;Lt4/i;Leu/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->b(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/w0;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lr4/b;->c(Lav/w0;Ljava/lang/Object;ILjava/lang/Object;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public i(Lt4/j;)Lpe/x;
    .locals 7
    .param p1    # Lt4/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/j;",
            ")",
            "Lpe/x<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lav/g1;->a()Lav/l0;

    move-result-object v0

    invoke-static {v0}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object v1

    new-instance v4, Ls4/a$a$g;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Ls4/a$a$g;-><init>(Ls4/a$a;Lt4/j;Leu/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->b(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/w0;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lr4/b;->c(Lav/w0;Ljava/lang/Object;ILjava/lang/Object;)Lpe/x;

    move-result-object p1

    return-object p1
.end method
