.class public final Lcom/roblox/client/shortcuts/PinShortcutHandler;
.super Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\"\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0008\u001a\u00020\u0007H\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\'\u0010 \u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008 \u0010!J/\u0010#\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010\'\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008%\u0010&R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010*\u001a\u00020\u00078\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008*\u0010)R\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008+\u0010)R\u0014\u0010,\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008,\u0010)R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008-\u0010)R\u0014\u0010.\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008.\u0010)R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008/\u0010)R\u0014\u00100\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00080\u0010)R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00081\u0010)R\u0014\u00102\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00082\u0010)R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00083\u0010)R\u0014\u00104\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00084\u0010)R\"\u00106\u001a\u0002058\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109\"\u0004\u0008:\u0010;R(\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00070<8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@\"\u0004\u0008A\u0010BR\u001a\u0010F\u001a\u0008\u0012\u0004\u0012\u00020\u00070C8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010E\u00a8\u0006G"
    }
    d2 = {
        "Lcom/roblox/client/shortcuts/PinShortcutHandler;",
        "Landroidx/lifecycle/f;",
        "Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut;",
        "<init>",
        "()V",
        "",
        "placeId",
        "",
        "thumbnailUrl",
        "experienceName",
        "shortcutId",
        "Landroid/net/Uri;",
        "deepLink",
        "",
        "requestPinShortcut",
        "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V",
        "Landroid/content/Context;",
        "context",
        "Landroidx/core/graphics/drawable/IconCompat;",
        "loadIcon",
        "(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "fallbackIcon",
        "(Landroid/content/Context;)Landroidx/core/graphics/drawable/IconCompat;",
        "Landroidx/lifecycle/s;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/s;)V",
        "onDestroy",
        "",
        "isAvailable",
        "()Z",
        "isPinExperienceV2Available",
        "pinExperience",
        "(JLjava/lang/String;Ljava/lang/String;)V",
        "universeId",
        "pinExperienceV2",
        "(JJLjava/lang/String;Ljava/lang/String;)V",
        "onPinConfirmed$NativeShell_googleProdRelease",
        "(J)V",
        "onPinConfirmed",
        "TAG",
        "Ljava/lang/String;",
        "EXTRA_PLACE_ID",
        "DEEP_LINK_BASE",
        "PARAM_PLACE_ID",
        "PARAM_JOIN_ORIGIN",
        "JOIN_ORIGIN_PINNED_SHORTCUT",
        "EXPERIENCE_DETAILS_DEEP_LINK_BASE",
        "PARAM_GAME_ID",
        "PARAM_HOME_ROOT",
        "PARAM_CONTEXT",
        "CONTEXT_PINNED_SHORTCUT",
        "PARAM_FULL_VIEW",
        "Lku/p0;",
        "coroutineScope",
        "Lku/p0;",
        "getCoroutineScope$NativeShell_googleProdRelease",
        "()Lku/p0;",
        "setCoroutineScope$NativeShell_googleProdRelease",
        "(Lku/p0;)V",
        "Lkotlin/Function0;",
        "manufacturerProvider",
        "Lkotlin/jvm/functions/Function0;",
        "getManufacturerProvider$NativeShell_googleProdRelease",
        "()Lkotlin/jvm/functions/Function0;",
        "setManufacturerProvider$NativeShell_googleProdRelease",
        "(Lkotlin/jvm/functions/Function0;)V",
        "",
        "getSilentManufacturers",
        "()Ljava/util/Set;",
        "silentManufacturers",
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
.field private static final CONTEXT_PINNED_SHORTCUT:Ljava/lang/String; = "AndroidPinnedShortcut"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final DEEP_LINK_BASE:Ljava/lang/String; = "roblox://experiences/start"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final EXPERIENCE_DETAILS_DEEP_LINK_BASE:Ljava/lang/String; = "roblox://navigation/game_details"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final EXTRA_PLACE_ID:Ljava/lang/String; = "placeId"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/roblox/client/shortcuts/PinShortcutHandler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final JOIN_ORIGIN_PINNED_SHORTCUT:Ljava/lang/String; = "PinnedShortcut"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final PARAM_CONTEXT:Ljava/lang/String; = "context"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final PARAM_FULL_VIEW:Ljava/lang/String; = "fullView"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final PARAM_GAME_ID:Ljava/lang/String; = "gameId"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final PARAM_HOME_ROOT:Ljava/lang/String; = "homeRoot"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final PARAM_JOIN_ORIGIN:Ljava/lang/String; = "joinAttemptOrigin"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final PARAM_PLACE_ID:Ljava/lang/String; = "placeId"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "PinShortcutHandler"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static coroutineScope:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static manufacturerProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/client/shortcuts/PinShortcutHandler;

    invoke-direct {v0}, Lcom/roblox/client/shortcuts/PinShortcutHandler;-><init>()V

    sput-object v0, Lcom/roblox/client/shortcuts/PinShortcutHandler;->INSTANCE:Lcom/roblox/client/shortcuts/PinShortcutHandler;

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, Lku/z2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/shortcuts/PinShortcutHandler;->coroutineScope:Lku/p0;

    new-instance v0, Lyj/e;

    invoke-direct {v0}, Lyj/e;-><init>()V

    sput-object v0, Lcom/roblox/client/shortcuts/PinShortcutHandler;->manufacturerProvider:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut;-><init>()V

    return-void
.end method

.method private static final _get_silentManufacturers_$lambda$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/text/StringsKt;->p1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toLowerCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final _get_silentManufacturers_$lambda$1(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/shortcuts/PinShortcutHandler;->_get_silentManufacturers_$lambda$0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getSilentManufacturers(Lcom/roblox/client/shortcuts/PinShortcutHandler;)Ljava/util/Set;
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/shortcuts/PinShortcutHandler;->getSilentManufacturers()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadIcon(Lcom/roblox/client/shortcuts/PinShortcutHandler;Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/client/shortcuts/PinShortcutHandler;->loadIcon(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/shortcuts/PinShortcutHandler;->_get_silentManufacturers_$lambda$1(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/client/shortcuts/PinShortcutHandler;->manufacturerProvider$lambda$0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final fallbackIcon(Landroid/content/Context;)Landroidx/core/graphics/drawable/IconCompat;
    .locals 1

    sget v0, Lsg/p0;->a:I

    invoke-static {p1, v0}, Landroidx/core/graphics/drawable/IconCompat;->d(Landroid/content/Context;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    const-string v0, "createWithResource(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getSilentManufacturers()Ljava/util/Set;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->F5()Ljava/lang/String;

    move-result-object v1

    const-string v0, "PinShortcutSilentManufacturers(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v2, v0, [C

    const/16 v0, 0x2c

    const/4 v3, 0x0

    aput-char v0, v2, v3

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->R0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    new-instance v1, Lyj/c;

    invoke-direct {v1}, Lyj/c;-><init>()V

    invoke-static {v0, v1}, Liu/p;->x(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    new-instance v1, Lyj/d;

    invoke-direct {v1}, Lyj/d;-><init>()V

    invoke-static {v0, v1}, Liu/p;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    invoke-static {v0}, Liu/p;->A(Lkotlin/sequences/Sequence;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private final loadIcon(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Landroidx/core/graphics/drawable/IconCompat;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;

    iget v1, v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->A:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->A:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;

    invoke-direct {v0, p0, p3}, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;-><init>(Lcom/roblox/client/shortcuts/PinShortcutHandler;Lnt/b;)V

    :goto_0
    iget-object p3, v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->y:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->A:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->w:Ljava/lang/Object;

    check-cast p1, Lx6/g;

    iget-object p1, v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->v:Ljava/lang/Object;

    check-cast p1, Lcom/roblox/client/shortcuts/PinShortcutHandler;

    iget-object p1, v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->u:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->t:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    :try_start_0
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-nez p3, :cond_3

    invoke-direct {p0, p1}, Lcom/roblox/client/shortcuts/PinShortcutHandler;->fallbackIcon(Landroid/content/Context;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    return-object p1

    :cond_3
    :try_start_1
    sget-object p3, Ljt/n;->b:Ljt/n$a;

    new-instance p3, Lx6/g$a;

    invoke-direct {p3, p1}, Lx6/g$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, p2}, Lx6/g$a;->c(Ljava/lang/Object;)Lx6/g$a;

    move-result-object p3

    invoke-static {p3, v5}, Lx6/j;->a(Lx6/g$a;Z)Lx6/g$a;

    move-result-object p3

    invoke-virtual {p3}, Lx6/g$a;->b()Lx6/g;

    move-result-object p3

    invoke-static {p1}, Lk6/d0;->a(Landroid/content/Context;)Lk6/s;

    move-result-object v2

    iput-object p1, v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->t:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->u:Ljava/lang/Object;

    invoke-static {p0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->v:Ljava/lang/Object;

    invoke-static {p3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->w:Ljava/lang/Object;

    iput v5, v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->x:I

    iput v3, v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$a;->A:I

    invoke-interface {v2, p3, v0}, Lk6/s;->d(Lx6/g;Lnt/b;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p3, Lx6/k;

    invoke-interface {p3}, Lx6/k;->p()Lk6/n;

    move-result-object p2

    if-eqz p2, :cond_5

    const/4 p3, 0x3

    invoke-static {p2, v5, v5, p3, v4}, Lk6/v;->g(Lk6/n;IIILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p2

    goto :goto_2

    :cond_5
    move-object p2, v4

    :goto_2
    invoke-static {p2}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :goto_3
    sget-object p3, Ljt/n;->b:Ljt/n$a;

    invoke-static {p2}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_4
    invoke-static {p2}, Ljt/n;->g(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    goto :goto_5

    :cond_6
    move-object v4, p2

    :goto_5
    check-cast v4, Landroid/graphics/Bitmap;

    if-eqz v4, :cond_7

    invoke-static {v4}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p2

    if-eqz p2, :cond_7

    goto :goto_6

    :cond_7
    invoke-direct {p0, p1}, Lcom/roblox/client/shortcuts/PinShortcutHandler;->fallbackIcon(Landroid/content/Context;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p2

    :goto_6
    return-object p2
.end method

.method private static final manufacturerProvider$lambda$0()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    return-object v0
.end method

.method private final requestPinShortcut(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V
    .locals 8

    move-wide v3, p1

    sget-object p1, Lcom/roblox/client/shortcuts/PinShortcutHandler;->coroutineScope:Lku/p0;

    new-instance v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;

    const/4 v7, 0x0

    move-object v1, p3

    move-object v6, p4

    move-object v5, p5

    move-object v2, p6

    invoke-direct/range {v0 .. v7}, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;-><init>(Ljava/lang/String;Landroid/net/Uri;JLjava/lang/String;Ljava/lang/String;Lnt/b;)V

    move-object p4, v0

    const/4 p5, 0x3

    const/4 p6, 0x0

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static/range {p1 .. p6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method


# virtual methods
.method public final getCoroutineScope$NativeShell_googleProdRelease()Lku/p0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/roblox/client/shortcuts/PinShortcutHandler;->coroutineScope:Lku/p0;

    return-object v0
.end method

.method public final getManufacturerProvider$NativeShell_googleProdRelease()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/roblox/client/shortcuts/PinShortcutHandler;->manufacturerProvider:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public isAvailable()Z
    .locals 1

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lm2/e;->g(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public isPinExperienceV2Available()Z
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->U0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/shortcuts/PinShortcutHandler;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroidx/lifecycle/s;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->w4()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/roblox/client/shortcuts/PinShortcutHandler;->coroutineScope:Lku/p0;

    invoke-static {p1}, Lku/q0;->i(Lku/p0;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, Lku/z2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {p1}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object p1

    sput-object p1, Lcom/roblox/client/shortcuts/PinShortcutHandler;->coroutineScope:Lku/p0;

    :cond_0
    invoke-static {p0}, Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPinShortcutHandlerCore;->setPlatformImpl(Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut;)Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPinShortcutHandlerCore;

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/s;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/roblox/client/shortcuts/PinShortcutHandler;->coroutineScope:Lku/p0;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lku/q0;->f(Lku/p0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

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

.method public final onPinConfirmed$NativeShell_googleProdRelease(J)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Shortcut pinned for placeId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PinShortcutHandler"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lyj/b;->a:Lyj/b;

    invoke-virtual {v0, p1, p2}, Lyj/b;->e(J)V

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

.method public bridge onStop(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStop(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public pinExperience(JLjava/lang/String;Ljava/lang/String;)V
    .locals 8
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "thumbnailUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "experienceName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "roblox://experiences/start"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "placeId"

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "joinAttemptOrigin"

    const-string v2, "PinnedShortcut"

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v7

    sget-object v0, Lyj/b;->a:Lyj/b;

    invoke-virtual {v0, p1, p2}, Lyj/b;->h(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v7}, Lcom/roblox/client/shortcuts/PinShortcutHandler;->requestPinShortcut(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V

    return-void
.end method

.method public pinExperienceV2(JJLjava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "thumbnailUrl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "experienceName"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "roblox://navigation/game_details"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "gameId"

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, v1, p3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p3

    const-string p4, "homeRoot"

    const-string v0, "true"

    invoke-virtual {p3, p4, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p3

    const-string p4, "context"

    const-string v1, "AndroidPinnedShortcut"

    invoke-virtual {p3, p4, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p3

    const-string p4, "fullView"

    invoke-virtual {p3, p4, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p3

    invoke-virtual {p3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v6

    sget-object p3, Lyj/b;->a:Lyj/b;

    invoke-virtual {p3, p1, p2}, Lyj/b;->g(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p5

    move-object v4, p6

    invoke-direct/range {v0 .. v6}, Lcom/roblox/client/shortcuts/PinShortcutHandler;->requestPinShortcut(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V

    return-void
.end method

.method public final setCoroutineScope$NativeShell_googleProdRelease(Lku/p0;)V
    .locals 1
    .param p1    # Lku/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/roblox/client/shortcuts/PinShortcutHandler;->coroutineScope:Lku/p0;

    return-void
.end method

.method public final setManufacturerProvider$NativeShell_googleProdRelease(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/roblox/client/shortcuts/PinShortcutHandler;->manufacturerProvider:Lkotlin/jvm/functions/Function0;

    return-void
.end method
