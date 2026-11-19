.class public final Lli/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lli/m$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0013\u0018\u0000 &2\u00020\u0001:\u0001\u001eB\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u000eJ\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J!\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lli/m;",
        "",
        "Landroid/content/SharedPreferences;",
        "sharedPref",
        "Lkotlin/coroutines/CoroutineContext;",
        "coroutineContext",
        "",
        "streakIntervalMs",
        "Lok/c0;",
        "clock",
        "<init>",
        "(Landroid/content/SharedPreferences;Lkotlin/coroutines/CoroutineContext;JLok/c0;)V",
        "",
        "i",
        "(Leu/b;)Ljava/lang/Object;",
        "",
        "m",
        "l",
        "Lli/c;",
        "j",
        "",
        "streakKey",
        "k",
        "(Ljava/lang/String;Leu/b;)Ljava/lang/Object;",
        "elapsedTimeStreak",
        "currentTimeNow",
        "h",
        "(Lli/c;J)Lli/c;",
        "g",
        "()J",
        "a",
        "Landroid/content/SharedPreferences;",
        "b",
        "Lkotlin/coroutines/CoroutineContext;",
        "c",
        "J",
        "d",
        "Lok/c0;",
        "e",
        "NativeShell_googleProdRelease"
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
.field public static final e:Lli/m$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/SharedPreferences;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkotlin/coroutines/CoroutineContext;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:J

.field public final d:Lok/c0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lli/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lli/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lli/m;->e:Lli/m$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;Lkotlin/coroutines/CoroutineContext;JLok/c0;)V
    .locals 1
    .param p1    # Landroid/content/SharedPreferences;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lok/c0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sharedPref"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/m;->a:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lli/m;->b:Lkotlin/coroutines/CoroutineContext;

    iput-wide p3, p0, Lli/m;->c:J

    iput-object p5, p0, Lli/m;->d:Lok/c0;

    return-void
.end method

.method public static final synthetic a(Lli/m;)J
    .locals 2

    invoke-virtual {p0}, Lli/m;->g()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic b(Lli/m;Lli/c;J)Lli/c;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lli/m;->h(Lli/c;J)Lli/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lli/m;)Landroid/content/SharedPreferences;
    .locals 0

    iget-object p0, p0, Lli/m;->a:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method public static final synthetic d(Lli/m;)J
    .locals 2

    iget-wide v0, p0, Lli/m;->c:J

    return-wide v0
.end method

.method public static final synthetic e(Lli/m;Leu/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lli/m;->j(Leu/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lli/m;Ljava/lang/String;Leu/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lli/m;->k(Ljava/lang/String;Leu/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final g()J
    .locals 2

    iget-object v0, p0, Lli/m;->d:Lok/c0;

    invoke-interface {v0}, Lok/c0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public final h(Lli/c;J)Lli/c;
    .locals 8

    iget-object v0, p0, Lli/m;->d:Lok/c0;

    invoke-interface {v0}, Lok/c0;->b()J

    move-result-wide v0

    invoke-virtual {p1}, Lli/c;->c()J

    move-result-wide v2

    cmp-long v2, v0, v2

    const-string v3, "rbx.achievements.streak_tracker"

    if-ltz v2, :cond_1

    invoke-virtual {p1}, Lli/c;->c()J

    move-result-wide v4

    iget-wide v6, p0, Lli/m;->c:J

    add-long/2addr v4, v6

    cmp-long v2, v0, v4

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lli/c;->d()J

    move-result-wide v4

    sub-long/2addr v0, v4

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Migrating streak from elapsed time to current time at "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", streak duration is "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "ms"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lli/c;

    sub-long v0, p2, v0

    invoke-direct {p1, v0, v1, p2, p3}, Lli/c;-><init>(JJ)V

    return-object p1

    :cond_1
    :goto_0
    const-string p1, "Elapsed time streak invalid or expired"

    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public final i(Leu/b;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lli/m;->b:Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lli/m$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lli/m$b;-><init>(Lli/m;Leu/b;)V

    invoke-static {v0, v1, p1}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final j(Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lli/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "login_streak_current_time"

    invoke-virtual {p0, v0, p1}, Lli/m;->k(Ljava/lang/String;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/String;Leu/b;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Leu/b<",
            "-",
            "Lli/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lli/m;->b:Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lli/m$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lli/m$c;-><init>(Lli/m;Ljava/lang/String;Leu/b;)V

    invoke-static {v0, v1, p2}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Leu/b;)Ljava/lang/Object;
    .locals 3
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lli/m;->b:Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lli/m$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lli/m$d;-><init>(Lli/m;Leu/b;)V

    invoke-static {v0, v1, p1}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final m(Leu/b;)Ljava/lang/Object;
    .locals 3
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lli/m;->b:Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lli/m$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lli/m$e;-><init>(Lli/m;Leu/b;)V

    invoke-static {v0, v1, p1}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
