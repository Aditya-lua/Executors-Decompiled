.class public final Lmi/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmi/n$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u00082\u00020\u0001:\u0001\u000cB\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0015\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R,\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\u00130\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lmi/n;",
        "Lmv/r;",
        "systemDns",
        "<init>",
        "(Lmv/r;)V",
        "",
        "hostname",
        "",
        "e",
        "(Ljava/lang/String;)V",
        "",
        "Ljava/net/InetAddress;",
        "a",
        "(Ljava/lang/String;)Ljava/util/List;",
        "f",
        "()V",
        "c",
        "Lmv/r;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Lav/x;",
        "d",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "prewarmingFutures",
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
.field public static final e:Lmi/n$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:Lmi/n;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final c:Lmv/r;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lav/x<",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmi/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmi/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmi/n;->e:Lmi/n$a;

    new-instance v0, Lmi/n;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lmi/n;-><init>(Lmv/r;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmi/n;->f:Lmi/n;

    return-void
.end method

.method public constructor <init>(Lmv/r;)V
    .locals 1
    .param p1    # Lmv/r;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "systemDns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmi/n;->c:Lmv/r;

    .line 2
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lmi/n;->d:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public synthetic constructor <init>(Lmv/r;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    sget-object p1, Lmv/r;->b:Lmv/r;

    :cond_0
    invoke-direct {p0, p1}, Lmi/n;-><init>(Lmv/r;)V

    return-void
.end method

.method public static final synthetic b()Lmi/n;
    .locals 1

    sget-object v0, Lmi/n;->f:Lmi/n;

    return-object v0
.end method

.method public static final synthetic c(Lmi/n;)Lmv/r;
    .locals 0

    iget-object p0, p0, Lmi/n;->c:Lmv/r;

    return-object p0
.end method

.method public static final d()Lmi/n;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lmi/n;->e:Lmi/n$a;

    invoke-virtual {v0}, Lmi/n$a;->a()Lmi/n;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "hostname"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmi/n;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lav/x;

    if-nez v0, :cond_0

    iget-object v0, p0, Lmi/n;->c:Lmv/r;

    invoke-interface {v0, p1}, Lmv/r;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    :try_start_0
    invoke-interface {v0}, Lav/d2;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Lav/w0;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0

    :cond_1
    new-instance v1, Lmi/n$b;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p0, p1, v2}, Lmi/n$b;-><init>(Lav/x;Lmi/n;Ljava/lang/String;Leu/b;)V

    const/4 v0, 0x1

    invoke-static {v2, v1, v0, v2}, Lav/i;->f(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    iget-object v0, p0, Lmi/n;->c:Lmv/r;

    invoke-interface {v0, p1}, Lmv/r;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "hostname"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Lav/z;->c(Lav/d2;ILjava/lang/Object;)Lav/x;

    move-result-object v0

    iget-object v1, p0, Lmi/n;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lav/x;

    if-nez v1, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lmi/n;->f()V

    iget-object v1, p0, Lmi/n;->c:Lmv/r;

    invoke-interface {v1, p1}, Lmv/r;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lav/x;->s(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    invoke-interface {v0, v1}, Lav/x;->r(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lmi/n;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 7

    invoke-static {}, Lav/g1;->b()Lav/l0;

    move-result-object v0

    invoke-static {v0}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object v1

    new-instance v4, Lmi/n$c;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lmi/n$c;-><init>(Leu/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    return-void
.end method
