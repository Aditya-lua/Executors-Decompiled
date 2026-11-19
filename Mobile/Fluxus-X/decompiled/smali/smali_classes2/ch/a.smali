.class public final Lch/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lch/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0018B7\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0008\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lch/a;",
        "",
        "Lav/l0;",
        "dispatcher",
        "",
        "controllerClassName",
        "Lkotlin/Function2;",
        "Lhm/i;",
        "Lhm/c;",
        "Lch/i;",
        "nativeAdsHandlerFactory",
        "<init>",
        "(Lav/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V",
        "Lj/b;",
        "activity",
        "",
        "d",
        "(Lj/b;)V",
        "e",
        "()V",
        "c",
        "(Lj/b;)Lhm/c;",
        "a",
        "Ljava/lang/String;",
        "b",
        "Lkotlin/jvm/functions/Function2;",
        "Lav/p0;",
        "Lav/p0;",
        "scope",
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
.field public static final d:Lch/a$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lhm/i;",
            "Lhm/c;",
            "Lch/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lav/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lch/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lch/a$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lch/a;->d:Lch/a$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v5}, Lch/a;-><init>(Lav/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lav/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .param p1    # Lav/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/l0;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lhm/i;",
            "-",
            "Lhm/c;",
            "Lch/i;",
            ">;)V"
        }
    .end annotation

    const-string v0, "dispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "controllerClassName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAdsHandlerFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lch/a;->a:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lch/a;->b:Lkotlin/jvm/functions/Function2;

    .line 5
    invoke-static {p1}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object p1

    iput-object p1, p0, Lch/a;->c:Lav/p0;

    return-void
.end method

.method public synthetic constructor <init>(Lav/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 6
    invoke-static {}, Lav/g1;->b()Lav/l0;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_2

    .line 7
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->X()Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "com.roblox.client.gmasdk.GmaSdkControllerImpl"

    goto :goto_0

    :cond_1
    const-string p2, "com.roblox.client.gmasdk.LegacyGmaSdkController"

    :cond_2
    :goto_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_3

    .line 8
    sget-object p3, Lch/a$a;->h:Lch/a$a;

    .line 9
    :cond_3
    invoke-direct {p0, p1, p2, p3}, Lch/a;-><init>(Lav/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public static final synthetic a(Lch/a;Lj/b;)Lhm/c;
    .locals 0

    invoke-virtual {p0, p1}, Lch/a;->c(Lj/b;)Lhm/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lch/a;)Lkotlin/jvm/functions/Function2;
    .locals 0

    iget-object p0, p0, Lch/a;->b:Lkotlin/jvm/functions/Function2;

    return-object p0
.end method


# virtual methods
.method public final c(Lj/b;)Lhm/c;
    .locals 4

    :try_start_0
    sget-object v0, Lzt/n;->b:Lzt/n$a;

    iget-object v0, p0, Lch/a;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lj/b;

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.roblox.universalapp.ads.GmaSdkController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lhm/c;

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v0, Lzt/n;->b:Lzt/n$a;

    invoke-static {p1}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_4

    instance-of v1, v0, Ljava/lang/ClassNotFoundException;

    if-eqz v1, :cond_0

    const-string v1, "GmaSdkController not found. Ensure the GMA SDK module is included."

    goto :goto_2

    :cond_0
    instance-of v1, v0, Ljava/lang/NoSuchMethodException;

    if-eqz v1, :cond_1

    const-string v1, "Constructor GmaSdkController(AppCompatActivity) not found. Check class definition."

    goto :goto_2

    :cond_1
    instance-of v1, v0, Ljava/lang/IllegalAccessException;

    if-nez v1, :cond_3

    instance-of v1, v0, Ljava/lang/InstantiationException;

    if-nez v1, :cond_3

    instance-of v1, v0, Ljava/lang/reflect/InvocationTargetException;

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "An unexpected error occurred while trying to create GmaSdkController"

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to instantiate GmaSdkController: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_2
    const-string v2, "rbx.AdsHelper"

    invoke-static {v2, v1, v0}, Lok/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_4
    invoke-static {p1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    instance-of p1, v0, Ljava/lang/ClassNotFoundException;

    if-eqz p1, :cond_6

    const-string p1, "MODULE_NOT_INSTALLED"

    goto :goto_3

    :cond_6
    const-string p1, "CONTROLLER_UNAVAILABLE"

    :goto_3
    new-instance v0, Lcom/roblox/universalapp/ads/NoopGmaSdkController;

    invoke-direct {v0, p1}, Lcom/roblox/universalapp/ads/NoopGmaSdkController;-><init>(Ljava/lang/String;)V

    move-object p1, v0

    :goto_4
    check-cast p1, Lhm/c;

    return-object p1
.end method

.method public final d(Lj/b;)V
    .locals 7
    .param p1    # Lj/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lch/a;->c:Lav/p0;

    new-instance v4, Lch/a$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lch/a$c;-><init>(Lch/a;Lj/b;Leu/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    return-void
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, Lch/a;->c:Lav/p0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lav/q0;->f(Lav/p0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method
