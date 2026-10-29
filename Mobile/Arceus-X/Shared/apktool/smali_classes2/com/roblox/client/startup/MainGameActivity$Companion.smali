.class public final Lcom/roblox/client/startup/MainGameActivity$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/startup/MainGameActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0087 \u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0087 \u00a2\u0006\u0004\u0008\u0010\u0010\u0003J\u001a\u0010\u0013\u001a\u00020\r2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0083 \u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0011H\u0083 \u00a2\u0006\u0004\u0008\u0016\u0010\u0014J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0083 \u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00118CX\u0083\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u001d\u0010\u0003\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008!\u0010 R\u0016\u0010\"\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0016\u0010$\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010#R\u0016\u0010%\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010#\u00a8\u0006&"
    }
    d2 = {
        "Lcom/roblox/client/startup/MainGameActivity$Companion;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "packageContext",
        "Lcom/roblox/client/startup/StartedForEnum;",
        "reason",
        "Landroid/content/Intent;",
        "e",
        "(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;",
        "Lcom/roblox/engine/jni/autovalue/InitParams;",
        "initParams",
        "",
        "f",
        "(Lcom/roblox/engine/jni/autovalue/InitParams;)V",
        "i",
        "",
        "assetPath",
        "j",
        "(Ljava/lang/String;)V",
        "overrides",
        "h",
        "",
        "usePersistentStorage",
        "g",
        "(Z)V",
        "getAppUpgradeKey",
        "()Ljava/lang/String;",
        "getAppUpgradeKey$annotations",
        "appUpgradeKey",
        "TAG",
        "Ljava/lang/String;",
        "STARTED_FOR_INTENT_KEY",
        "overrideFlagsAtStartupDone",
        "Z",
        "initialized",
        "inferredCrashMarkerInitialized",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/startup/MainGameActivity$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/roblox/client/startup/MainGameActivity$Companion;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/startup/MainGameActivity$Companion;->getAppUpgradeKey()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lcom/roblox/client/startup/MainGameActivity$Companion;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/startup/MainGameActivity$Companion;->g(Z)V

    return-void
.end method

.method public static final synthetic c(Lcom/roblox/client/startup/MainGameActivity$Companion;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/startup/MainGameActivity$Companion;->h(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic d(Lcom/roblox/client/startup/MainGameActivity$Companion;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/startup/MainGameActivity$Companion;->j(Ljava/lang/String;)V

    return-void
.end method

.method private final getAppUpgradeKey()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Lsg/a1;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getAppUpgradeKey(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final e(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/roblox/client/startup/StartedForEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "packageContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reason"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/startup/MainGameActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p1, "STARTED_FOR_INTENT_KEY"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "putExtra(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final f(Lcom/roblox/engine/jni/autovalue/InitParams;)V
    .locals 0
    .param p1    # Lcom/roblox/engine/jni/autovalue/InitParams;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/roblox/client/startup/MainGameActivity;->nativeAppBridgeSetInitParams(Lcom/roblox/engine/jni/autovalue/InitParams;)V

    return-void
.end method

.method public final g(Z)V
    .locals 0

    invoke-static {p1}, Lcom/roblox/client/startup/MainGameActivity;->a2(Z)V

    return-void
.end method

.method public final h(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/roblox/client/startup/MainGameActivity;->b2(Ljava/lang/String;)V

    return-void
.end method

.method public final i()V
    .locals 0

    invoke-static {}, Lcom/roblox/client/startup/MainGameActivity;->nativeRetryInit()V

    return-void
.end method

.method public final j(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/roblox/client/startup/MainGameActivity;->c2(Ljava/lang/String;)V

    return-void
.end method
