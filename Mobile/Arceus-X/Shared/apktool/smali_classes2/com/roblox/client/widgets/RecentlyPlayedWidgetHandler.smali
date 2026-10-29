.class public final Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001<B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0011H\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J+\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0011H\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J \u0010\u001b\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0087@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\"\u0010(\u001a\u00020\'8\u0000@\u0001X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-R\"\u0010.\u001a\u00020\'8\u0000@\u0001X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008.\u0010)\u001a\u0004\u0008/\u0010+\"\u0004\u00080\u0010-R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105R#\u0010;\u001a\n 7*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00088\u00103\u001a\u0004\u00089\u0010:\u00a8\u0006="
    }
    d2 = {
        "Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;",
        "Landroidx/lifecycle/f;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "variant",
        "",
        "cacheWidgetVariant",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "Landroidx/lifecycle/s;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/s;)V",
        "onStop",
        "widgetDataJson",
        "",
        "",
        "thumbnailURLs",
        "cacheRecentlyPlayedData",
        "(Ljava/lang/String;Ljava/util/Map;)V",
        "jsonString",
        "reformatData",
        "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;",
        "",
        "isRecentlyPlayedWidgetEnabled",
        "maybeToggleWidget",
        "(Landroid/content/Context;ZLnt/b;)Ljava/lang/Object;",
        "getCachedWidgetVariant",
        "(Landroid/content/Context;)Ljava/lang/String;",
        "Llk/c;",
        "recentlyPlayedWidgetFileProvider",
        "Llk/c;",
        "TAG",
        "Ljava/lang/String;",
        "Luu/a;",
        "cacheMutex",
        "Luu/a;",
        "Lku/l0;",
        "ioDispatcher",
        "Lku/l0;",
        "getIoDispatcher$NativeShell_googleProdRelease",
        "()Lku/l0;",
        "setIoDispatcher$NativeShell_googleProdRelease",
        "(Lku/l0;)V",
        "defaultDispatcher",
        "getDefaultDispatcher$NativeShell_googleProdRelease",
        "setDefaultDispatcher$NativeShell_googleProdRelease",
        "Landroid/content/ComponentName;",
        "componentName$delegate",
        "Ljt/h;",
        "getComponentName",
        "()Landroid/content/ComponentName;",
        "componentName",
        "kotlin.jvm.PlatformType",
        "recentlyPlayedRequestMessageId$delegate",
        "getRecentlyPlayedRequestMessageId",
        "()Ljava/lang/String;",
        "recentlyPlayedRequestMessageId",
        "a",
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
.field public static final INSTANCE:Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "RecentlyPlayedWidgetHandler"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final cacheMutex:Luu/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final componentName$delegate:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static defaultDispatcher:Lku/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static ioDispatcher:Lku/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final recentlyPlayedRequestMessageId$delegate:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final recentlyPlayedWidgetFileProvider:Llk/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;

    invoke-direct {v0}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;-><init>()V

    sput-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->INSTANCE:Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;

    new-instance v0, Llk/c;

    invoke-direct {v0}, Llk/c;-><init>()V

    sput-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->recentlyPlayedWidgetFileProvider:Llk/c;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Luu/g;->b(ZILjava/lang/Object;)Luu/a;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->cacheMutex:Luu/a;

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->ioDispatcher:Lku/l0;

    invoke-static {}, Lku/g1;->a()Lku/l0;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->defaultDispatcher:Lku/l0;

    new-instance v0, Llk/d;

    invoke-direct {v0}, Llk/d;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->componentName$delegate:Ljt/h;

    new-instance v0, Llk/e;

    invoke-direct {v0}, Llk/e;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->recentlyPlayedRequestMessageId$delegate:Ljt/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->recentlyPlayedRequestMessageId_delegate$lambda$0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$cacheWidgetVariant(Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->cacheWidgetVariant(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getCacheMutex$p()Luu/a;
    .locals 1

    sget-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->cacheMutex:Luu/a;

    return-object v0
.end method

.method public static final synthetic access$getRecentlyPlayedRequestMessageId(Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->getRecentlyPlayedRequestMessageId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getRecentlyPlayedWidgetFileProvider$p()Llk/c;
    .locals 1

    sget-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->recentlyPlayedWidgetFileProvider:Llk/c;

    return-object v0
.end method

.method public static synthetic b()Landroid/content/ComponentName;
    .locals 1

    invoke-static {}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->componentName_delegate$lambda$0()Landroid/content/ComponentName;

    move-result-object v0

    return-object v0
.end method

.method private final cacheWidgetVariant(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "recently_played_widget_variant"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

.method private static final componentName_delegate$lambda$0()Landroid/content/ComponentName;
    .locals 3

    new-instance v0, Landroid/content/ComponentName;

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider;

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method private final getComponentName()Landroid/content/ComponentName;
    .locals 1

    sget-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->componentName$delegate:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ComponentName;

    return-object v0
.end method

.method private final getRecentlyPlayedRequestMessageId()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->recentlyPlayedRequestMessageId$delegate:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private static final recentlyPlayedRequestMessageId_delegate$lambda$0()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/roblox/universalapp/widgets/JNIWidgetDataProtocol;->a:Lcom/roblox/universalapp/widgets/JNIWidgetDataProtocol;

    invoke-virtual {v0}, Lcom/roblox/universalapp/widgets/JNIWidgetDataProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/roblox/universalapp/widgets/JNIWidgetDataProtocol;->getRecentlyPlayedRequestMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final cacheRecentlyPlayedData(Ljava/lang/String;Ljava/util/Map;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "widgetDataJson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "thumbnailURLs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, Lku/z2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object v0

    sget-object v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->defaultDispatcher:Lku/l0;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v2

    new-instance v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;

    invoke-direct {v5, p1, p2, v1}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$b;-><init>(Ljava/lang/String;Ljava/util/Map;Lnt/b;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public final getCachedWidgetVariant(Landroid/content/Context;)Ljava/lang/String;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "recently_played_widget_variant"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$a;->c:Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$a;

    invoke-virtual {p1}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$a;->b()Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final getDefaultDispatcher$NativeShell_googleProdRelease()Lku/l0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->defaultDispatcher:Lku/l0;

    return-object v0
.end method

.method public final getIoDispatcher$NativeShell_googleProdRelease()Lku/l0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->ioDispatcher:Lku/l0;

    return-object v0
.end method

.method public final maybeToggleWidget(Landroid/content/Context;ZLnt/b;)Ljava/lang/Object;
    .locals 21
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Z",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move/from16 v0, p2

    move-object/from16 v1, p3

    instance-of v2, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;

    iget v3, v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;->A:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;->A:I

    move-object/from16 v3, p0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;

    move-object/from16 v3, p0

    invoke-direct {v2, v3, v1}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;-><init>(Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;Lnt/b;)V

    :goto_0
    iget-object v1, v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;->y:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v4

    iget v5, v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;->A:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;->u:Ljava/lang/Object;

    check-cast v0, Landroid/content/pm/PackageManager;

    iget-object v0, v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;->t:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-static {v1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-direct {v3}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->getComponentName()Landroid/content/ComponentName;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    move-result v5

    if-eqz v0, :cond_3

    move v7, v6

    goto :goto_1

    :cond_3
    const/4 v7, 0x2

    :goto_1
    if-ne v5, v7, :cond_4

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_4
    invoke-direct {v3}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->getComponentName()Landroid/content/ComponentName;

    move-result-object v8

    invoke-virtual {v1, v8, v7, v6}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    if-eqz v0, :cond_5

    sget-object v9, Lvg/m;->a:Lvg/m;

    sget-object v11, Llk/f;->d:Llk/f;

    sget-object v13, Llk/g;->a:Llk/g;

    const-string v14, ""

    const-string v10, "recents"

    const-string v12, ""

    invoke-static/range {v9 .. v14}, Llk/b;->b(Lvg/m;Ljava/lang/String;Llk/f;Ljava/lang/String;Llk/g;Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    sget-object v15, Lvg/m;->a:Lvg/m;

    sget-object v17, Llk/f;->e:Llk/f;

    sget-object v19, Llk/g;->a:Llk/g;

    const-string v20, ""

    const-string v16, "recents"

    const-string v18, ""

    invoke-static/range {v15 .. v20}, Llk/b;->b(Lvg/m;Ljava/lang/String;Llk/f;Ljava/lang/String;Llk/g;Ljava/lang/String;)V

    new-instance v8, Llk/c;

    invoke-direct {v8}, Llk/c;-><init>()V

    invoke-static/range {p1 .. p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;->t:Ljava/lang/Object;

    invoke-static {v1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;->u:Ljava/lang/Object;

    iput-boolean v0, v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;->v:Z

    iput v5, v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;->w:I

    iput v7, v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;->x:I

    iput v6, v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$c;->A:I

    move-object/from16 v0, p1

    invoke-virtual {v8, v0, v2}, Llk/c;->a(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_6

    return-object v4

    :cond_6
    :goto_2
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "RecentlyPlayedWidgetHandler"

    const-string v1, "Recently Played Widget cache cleanup failed"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public onCreate(Landroidx/lifecycle/s;)V
    .locals 7
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->Q3()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/s;)Landroidx/lifecycle/m;

    move-result-object v1

    sget-object v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->ioDispatcher:Lku/l0;

    new-instance v4, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$d;

    const/4 p1, 0x0

    invoke-direct {v4, p1}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$d;-><init>(Lnt/b;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    :cond_0
    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onDestroy(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onPause(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onResume(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStart(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public onStop(Landroidx/lifecycle/s;)V
    .locals 7
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/s;)Landroidx/lifecycle/m;

    move-result-object v1

    sget-object v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->ioDispatcher:Lku/l0;

    new-instance v4, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$e;

    const/4 p1, 0x0

    invoke-direct {v4, p1}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$e;-><init>(Lnt/b;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public final reformatData(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "jsonString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "thumbnailURLs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "placeId"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_0

    const-string v4, "thumbnailUrl"

    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    const-string v3, "thumbnailPath"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "toString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final setDefaultDispatcher$NativeShell_googleProdRelease(Lku/l0;)V
    .locals 1
    .param p1    # Lku/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->defaultDispatcher:Lku/l0;

    return-void
.end method

.method public final setIoDispatcher$NativeShell_googleProdRelease(Lku/l0;)V
    .locals 1
    .param p1    # Lku/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->ioDispatcher:Lku/l0;

    return-void
.end method
