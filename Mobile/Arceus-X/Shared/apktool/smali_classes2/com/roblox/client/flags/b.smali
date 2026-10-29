.class public final Lcom/roblox/client/flags/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010#\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\t0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR$\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010#\u001a\u0004\u0008\u001e\u0010$R\u0011\u0010)\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Lcom/roblox/client/flags/b;",
        "",
        "<init>",
        "()V",
        "Landroid/content/SharedPreferences;",
        "preferences",
        "",
        "f",
        "(Landroid/content/SharedPreferences;)V",
        "",
        "name",
        "h",
        "(Ljava/lang/String;)V",
        "i",
        "(Lnt/b;)Ljava/lang/Object;",
        "",
        "d",
        "()[Ljava/lang/String;",
        "Lku/l0;",
        "b",
        "Lku/l0;",
        "ioDispatcher",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "c",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "nativeFlagsInitialized",
        "",
        "Ljava/util/Set;",
        "flagsToRegister",
        "Luu/a;",
        "e",
        "Luu/a;",
        "flagsMutex",
        "",
        "value",
        "I",
        "()I",
        "nativeFlagProviderId",
        "",
        "g",
        "()Z",
        "isNativeFlagProviderInitialized",
        "flags_prodRelease"
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
.field public static final a:Lcom/roblox/client/flags/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lku/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Luu/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static volatile f:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/client/flags/b;

    invoke-direct {v0}, Lcom/roblox/client/flags/b;-><init>()V

    sput-object v0, Lcom/roblox/client/flags/b;->a:Lcom/roblox/client/flags/b;

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/flags/b;->b:Lku/l0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/roblox/client/flags/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sput-object v0, Lcom/roblox/client/flags/b;->d:Ljava/util/Set;

    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Luu/g;->b(ZILjava/lang/Object;)Luu/a;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/flags/b;->e:Luu/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Luu/a;
    .locals 1

    sget-object v0, Lcom/roblox/client/flags/b;->e:Luu/a;

    return-object v0
.end method

.method public static final synthetic b()Ljava/util/Set;
    .locals 1

    sget-object v0, Lcom/roblox/client/flags/b;->d:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic c(Lcom/roblox/client/flags/b;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/flags/b;->i(Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d()[Ljava/lang/String;
    .locals 5

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/g;->R3()Ljava/util/Set;

    move-result-object v0

    const-string v1, "getEntrySet(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roblox/client/flags/a;

    instance-of v4, v2, Lcom/roblox/client/flags/a$d;

    if-eqz v4, :cond_1

    check-cast v2, Lcom/roblox/client/flags/a$d;

    invoke-virtual {v2}, Lcom/roblox/client/flags/a;->a()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public final e()I
    .locals 1

    sget v0, Lcom/roblox/client/flags/b;->f:I

    return v0
.end method

.method public final f(Landroid/content/SharedPreferences;)V
    .locals 9
    .param p1    # Landroid/content/SharedPreferences;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "preferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initializeNativeFlagsWithCache:"

    const-string v1, "FlagSettings"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/client/flags/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "initializeNativeFlagsWithCache called already, ignoring"

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/flags/b;->d()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/client/flags/FlagJniInterface;->nativeInitializeNativeFlags([Ljava/lang/String;)Lcom/roblox/client/flags/NativeFlagsInitResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/flags/NativeFlagsInitResult;->getNativeFlagProviderId()I

    move-result v2

    sput v2, Lcom/roblox/client/flags/b;->f:I

    sget-object v3, Lth/f;->a:Lth/f;

    invoke-virtual {v0}, Lcom/roblox/client/flags/NativeFlagsInitResult;->getBooleanCachedMap()Ljava/util/Map;

    move-result-object v4

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v5, p1

    invoke-static/range {v3 .. v8}, Lth/f;->k(Lth/f;Ljava/util/Map;Landroid/content/SharedPreferences;ZILjava/lang/Object;)V

    sget p1, Lcom/roblox/client/flags/b;->f:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initializeNativeFlagsWithCache: returning providerId = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/flags/b;->b:Lku/l0;

    invoke-static {p1}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v0

    new-instance v3, Lcom/roblox/client/flags/b$a;

    const/4 p1, 0x0

    invoke-direct {v3, p1}, Lcom/roblox/client/flags/b$a;-><init>(Lnt/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public final g()Z
    .locals 1

    sget-object v0, Lcom/roblox/client/flags/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public final h(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/client/flags/b;->b:Lku/l0;

    invoke-static {v0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v1

    new-instance v4, Lcom/roblox/client/flags/b$b;

    const/4 v0, 0x0

    invoke-direct {v4, p1, v0}, Lcom/roblox/client/flags/b$b;-><init>(Ljava/lang/String;Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public final i(Lnt/b;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lcom/roblox/client/flags/b;->b:Lku/l0;

    new-instance v1, Lcom/roblox/client/flags/b$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/roblox/client/flags/b$c;-><init>(Lnt/b;)V

    invoke-static {v0, v1, p1}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
