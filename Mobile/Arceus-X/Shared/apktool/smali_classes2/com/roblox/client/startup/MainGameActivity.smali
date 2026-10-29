.class public final Lcom/roblox/client/startup/MainGameActivity;
.super Lcom/google/androidgamesdk/GameActivity;
.source "SourceFile"

# interfaces
.implements Lej/a;
.implements Lwh/q;
.implements Lcom/roblox/client/startup/c$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/startup/MainGameActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ea\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\t\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u0000 \u00a2\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u00a3\u0001B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008 \u0010\u0006J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008$\u0010\u0006J\u000f\u0010%\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008%\u0010\u0006J\u0019\u0010(\u001a\u00020\u00072\u0008\u0010\'\u001a\u0004\u0018\u00010&H\u0014\u00a2\u0006\u0004\u0008(\u0010)J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0014\u00a2\u0006\u0004\u0008,\u0010-J\u0017\u0010.\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00100\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u00080\u0010\u0006J\u000f\u00101\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u00081\u0010\u0006J\u0017\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0016\u00a2\u0006\u0004\u00084\u00105J\u0017\u00106\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0016\u00a2\u0006\u0004\u00086\u00105J\u000f\u00107\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u00087\u0010\u0006J\u000f\u00108\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u00088\u0010\u0006J\u001f\u0010<\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:H\u0016\u00a2\u0006\u0004\u0008<\u0010=J\u001f\u0010>\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:H\u0016\u00a2\u0006\u0004\u0008>\u0010=J-\u0010D\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u001b2\u000c\u0010A\u001a\u0008\u0012\u0004\u0012\u00020\u000b0@2\u0006\u0010C\u001a\u00020BH\u0016\u00a2\u0006\u0004\u0008D\u0010EJ\u0017\u0010H\u001a\u00020\u00072\u0006\u0010G\u001a\u00020FH\u0016\u00a2\u0006\u0004\u0008H\u0010IJ\u000f\u0010J\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008J\u0010\u0006J\u000f\u0010K\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008K\u0010\u0006J\u000f\u0010L\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008L\u0010\u0006J\u000f\u0010M\u001a\u00020\u0007H\u0017\u00a2\u0006\u0004\u0008M\u0010\u0006J\u001f\u0010P\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008P\u0010QJ\u000f\u0010R\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008R\u0010\u0006J\u000f\u0010S\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008S\u0010\u0006J\u001f\u0010W\u001a\u00020\u00072\u0006\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008W\u0010XJ)\u0010[\u001a\u00020\u00072\u0006\u0010U\u001a\u00020T2\u0006\u0010Y\u001a\u00020\u000b2\u0008\u0010Z\u001a\u0004\u0018\u00010\u000bH\u0007\u00a2\u0006\u0004\u0008[\u0010\\J\u000f\u0010]\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008]\u0010\u0006J\u000f\u0010^\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008^\u0010\u0006J\u0011\u0010`\u001a\u0004\u0018\u00010_H\u0017\u00a2\u0006\u0004\u0008`\u0010aJ\u000f\u0010c\u001a\u00020bH\u0016\u00a2\u0006\u0004\u0008c\u0010dJ\u0017\u0010f\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008f\u0010\u001eJ\u0017\u0010g\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008g\u0010#J\u000f\u0010h\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008h\u0010\u0006J\u000f\u0010i\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008i\u0010\u0006R\u0017\u0010o\u001a\u00020j8\u0007\u00a2\u0006\u000c\n\u0004\u0008k\u0010l\u001a\u0004\u0008m\u0010nR\u0017\u0010u\u001a\u00020p8\u0006\u00a2\u0006\u000c\n\u0004\u0008q\u0010r\u001a\u0004\u0008s\u0010tR\u0016\u0010y\u001a\u00020v8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008w\u0010xR\u0016\u0010}\u001a\u00020z8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008{\u0010|R\u0017\u0010\u0080\u0001\u001a\u00020~8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008f\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u00020z8\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\u0008\u0081\u0001\u0010|R\u0017\u0010\u0085\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008g\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0001\u0010\u008c\u0001R!\u0010\u0093\u0001\u001a\u00030\u008e\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u008f\u0001\u0010\u0090\u0001\u001a\u0006\u0008\u0091\u0001\u0010\u0092\u0001R!\u0010\u0098\u0001\u001a\u00030\u0094\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u0095\u0001\u0010\u0090\u0001\u001a\u0006\u0008\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009a\u0001\u0010\u009b\u0001R\u0017\u0010\u009f\u0001\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u009d\u0001\u0010\u009e\u0001R\u001a\u0010y\u001a\u00020v*\u00020\t8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001\u00a8\u0006\u00a4\u0001"
    }
    d2 = {
        "Lcom/roblox/client/startup/MainGameActivity;",
        "Lcom/google/androidgamesdk/GameActivity;",
        "Lej/a;",
        "Lwh/q;",
        "Lcom/roblox/client/startup/c$b;",
        "<init>",
        "()V",
        "",
        "r2",
        "Landroid/content/Intent;",
        "intent",
        "",
        "tag",
        "o2",
        "(Landroid/content/Intent;Ljava/lang/String;)V",
        "q2",
        "Lcom/roblox/client/RbxKeyboard;",
        "s2",
        "()Lcom/roblox/client/RbxKeyboard;",
        "C2",
        "",
        "visible",
        "K2",
        "(Z)V",
        "F2",
        "d2",
        "z2",
        "",
        "messageResourceId",
        "I2",
        "(I)V",
        "i2",
        "B2",
        "message",
        "t2",
        "(Ljava/lang/String;)V",
        "L2",
        "x2",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/content/Context;",
        "newBase",
        "attachBaseContext",
        "(Landroid/content/Context;)V",
        "onNewIntent",
        "(Landroid/content/Intent;)V",
        "onStart",
        "onResume",
        "Landroid/view/SurfaceHolder;",
        "holder",
        "surfaceCreated",
        "(Landroid/view/SurfaceHolder;)V",
        "surfaceDestroyed",
        "onPause",
        "onDestroy",
        "keyCode",
        "Landroid/view/KeyEvent;",
        "event",
        "onKeyDown",
        "(ILandroid/view/KeyEvent;)Z",
        "onKeyUp",
        "requestCode",
        "",
        "permissions",
        "",
        "grantResults",
        "onRequestPermissionsResult",
        "(I[Ljava/lang/String;[I)V",
        "Landroid/content/res/Configuration;",
        "newConfig",
        "onConfigurationChanged",
        "(Landroid/content/res/Configuration;)V",
        "p2",
        "bootstrapTheApp",
        "requestOrientationAsDefault",
        "E",
        "url",
        "title",
        "openWebActivity",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "syncCookiesFromEngine",
        "showLeaveAppPrompt",
        "",
        "userId",
        "productId",
        "promptNativePurchase",
        "(JLjava/lang/String;)V",
        "robloxNativeProductId",
        "payloadStr",
        "promptNativePurchaseWithPayload",
        "(JLjava/lang/String;Ljava/lang/String;)V",
        "J",
        "j2",
        "Lcom/roblox/client/b;",
        "q0",
        "()Lcom/roblox/client/b;",
        "Landroid/app/Activity;",
        "f0",
        "()Landroid/app/Activity;",
        "stringResourceId",
        "U",
        "W",
        "i",
        "N",
        "Lcom/roblox/client/startup/NativeHelper;",
        "Q",
        "Lcom/roblox/client/startup/NativeHelper;",
        "getNativeHelper",
        "()Lcom/roblox/client/startup/NativeHelper;",
        "nativeHelper",
        "Lmi/a;",
        "R",
        "Lmi/a;",
        "k2",
        "()Lmi/a;",
        "appInsetManager",
        "Lcom/roblox/client/startup/StartedForEnum;",
        "S",
        "Lcom/roblox/client/startup/StartedForEnum;",
        "startReason",
        "Landroid/view/View;",
        "T",
        "Landroid/view/View;",
        "splashScreen",
        "Lcom/roblox/client/components/LoadingBar;",
        "Lcom/roblox/client/components/LoadingBar;",
        "loadingView",
        "V",
        "webOverlayView",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "initParamsForEngineDone",
        "Lcom/roblox/client/purchase/IAPPurchaseManager;",
        "X",
        "Lcom/roblox/client/purchase/IAPPurchaseManager;",
        "iapPurchaseManager",
        "Lak/o0;",
        "Y",
        "Lak/o0;",
        "inputAdapter",
        "Lak/a0;",
        "Z",
        "Ljt/h;",
        "l2",
        "()Lak/a0;",
        "browserServiceAppAdapter",
        "Lwg/c;",
        "a0",
        "m2",
        "()Lwg/c;",
        "browserServiceBridge",
        "Lml/d;",
        "b0",
        "Lml/d;",
        "platformEmergencyObserver",
        "u2",
        "()Z",
        "isInForeground",
        "n2",
        "(Landroid/content/Intent;)Lcom/roblox/client/startup/StartedForEnum;",
        "c0",
        "Companion",
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
.field public static final c0:Lcom/roblox/client/startup/MainGameActivity$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static d0:Z

.field public static e0:Z

.field public static f0:Z


# instance fields
.field public final Q:Lcom/roblox/client/startup/NativeHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final R:Lmi/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public S:Lcom/roblox/client/startup/StartedForEnum;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public T:Landroid/view/View;

.field public U:Lcom/roblox/client/components/LoadingBar;

.field public V:Landroid/view/View;

.field public final W:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final X:Lcom/roblox/client/purchase/IAPPurchaseManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Y:Lak/o0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Z:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final a0:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b0:Lml/d;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/client/startup/MainGameActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/startup/MainGameActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/roblox/client/startup/MainGameActivity;->c0:Lcom/roblox/client/startup/MainGameActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    invoke-direct {p0}, Lcom/google/androidgamesdk/GameActivity;-><init>()V

    new-instance v0, Lcom/roblox/client/startup/NativeHelper;

    invoke-static {p0}, Lfh/j;->a(Landroid/app/Activity;)Lfh/i;

    move-result-object v2

    new-instance v3, Ltg/a;

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Ltg/a;-><init>(Lku/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v5, 0x8

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roblox/client/startup/NativeHelper;-><init>(Lcom/roblox/client/startup/MainGameActivity;Lfh/i;Ltg/a;Lku/l0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, v1, Lcom/roblox/client/startup/MainGameActivity;->Q:Lcom/roblox/client/startup/NativeHelper;

    new-instance v0, Lmi/a;

    invoke-direct {v0}, Lmi/a;-><init>()V

    iput-object v0, v1, Lcom/roblox/client/startup/MainGameActivity;->R:Lmi/a;

    sget-object v0, Lcom/roblox/client/startup/StartedForEnum;->SYSTEM:Lcom/roblox/client/startup/StartedForEnum;

    iput-object v0, v1, Lcom/roblox/client/startup/MainGameActivity;->S:Lcom/roblox/client/startup/StartedForEnum;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, v1, Lcom/roblox/client/startup/MainGameActivity;->W:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lcom/roblox/client/purchase/IAPPurchaseManager;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;-><init>(Lej/a;Z)V

    iput-object v0, v1, Lcom/roblox/client/startup/MainGameActivity;->X:Lcom/roblox/client/purchase/IAPPurchaseManager;

    new-instance v0, Lak/o0;

    invoke-direct {v0}, Lak/o0;-><init>()V

    iput-object v0, v1, Lcom/roblox/client/startup/MainGameActivity;->Y:Lak/o0;

    new-instance v0, Lak/w0;

    invoke-direct {v0, p0}, Lak/w0;-><init>(Lcom/roblox/client/startup/MainGameActivity;)V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    iput-object v0, v1, Lcom/roblox/client/startup/MainGameActivity;->Z:Ljt/h;

    new-instance v0, Lak/x0;

    invoke-direct {v0, p0}, Lak/x0;-><init>(Lcom/roblox/client/startup/MainGameActivity;)V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    iput-object v0, v1, Lcom/roblox/client/startup/MainGameActivity;->a0:Ljt/h;

    return-void
.end method

.method public static final A2(Lcom/roblox/client/startup/MainGameActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/startup/MainGameActivity;->d2()V

    return-void
.end method

.method public static final D2(Lcom/roblox/client/startup/MainGameActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->m2()Lwg/c;

    move-result-object p0

    invoke-virtual {p0}, Lwg/c;->c()V

    return-void
.end method

.method public static final E2(Lcom/roblox/client/startup/MainGameActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->F2()V

    return-void
.end method

.method public static final G2(Lcom/roblox/client/startup/MainGameActivity;)V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/roblox/client/startup/d;

    invoke-direct {v0}, Lcom/roblox/client/startup/d;-><init>()V

    new-instance v1, Lak/v0;

    invoke-direct {v1, p0}, Lak/v0;-><init>(Lcom/roblox/client/startup/MainGameActivity;)V

    invoke-virtual {v0, p0, v1}, Lcom/roblox/client/startup/d;->c(Landroid/content/Context;Lcom/roblox/client/startup/d$a;)V

    :cond_0
    return-void
.end method

.method public static final H2(Lcom/roblox/client/startup/MainGameActivity;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public static final J2()V
    .locals 0

    invoke-static {}, Lak/k0;->T()Z

    return-void
.end method

.method public static synthetic O1(Lcom/roblox/client/startup/MainGameActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/MainGameActivity;->e2(Lcom/roblox/client/startup/MainGameActivity;)V

    return-void
.end method

.method public static synthetic P1(Lcom/roblox/client/startup/MainGameActivity;)Lak/a0;
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/MainGameActivity;->f2(Lcom/roblox/client/startup/MainGameActivity;)Lak/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q1(Ljt/r;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/MainGameActivity;->y2(Ljt/r;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R1(Lcom/roblox/client/startup/MainGameActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/roblox/client/startup/MainGameActivity;->w2(Lcom/roblox/client/startup/MainGameActivity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic S1(Lcom/roblox/client/startup/MainGameActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/MainGameActivity;->G2(Lcom/roblox/client/startup/MainGameActivity;)V

    return-void
.end method

.method public static synthetic T1(Lcom/roblox/client/startup/MainGameActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/MainGameActivity;->D2(Lcom/roblox/client/startup/MainGameActivity;)V

    return-void
.end method

.method public static synthetic U1(Lcom/roblox/client/startup/MainGameActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/MainGameActivity;->A2(Lcom/roblox/client/startup/MainGameActivity;)V

    return-void
.end method

.method public static synthetic V1(Le/m0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/MainGameActivity;->v2(Le/m0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic W1(Lcom/roblox/client/startup/MainGameActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/MainGameActivity;->E2(Lcom/roblox/client/startup/MainGameActivity;)V

    return-void
.end method

.method public static synthetic X1(Lcom/roblox/client/startup/MainGameActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/MainGameActivity;->H2(Lcom/roblox/client/startup/MainGameActivity;)V

    return-void
.end method

.method public static synthetic Y1(Lcom/roblox/client/startup/MainGameActivity;)Lwg/c;
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/MainGameActivity;->g2(Lcom/roblox/client/startup/MainGameActivity;)Lwg/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z1()V
    .locals 0

    invoke-static {}, Lcom/roblox/client/startup/MainGameActivity;->J2()V

    return-void
.end method

.method public static final synthetic a2(Z)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/MainGameActivity;->nativeEnableVersionBFlagCache(Z)V

    return-void
.end method

.method public static final synthetic b2(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/MainGameActivity;->nativePreloadFlagOverrides(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic c2(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/MainGameActivity;->nativeSetAssetPath(Ljava/lang/String;)V

    return-void
.end method

.method private final d2()V
    .locals 1

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lsg/a1;->k0()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lsg/a1;->o0()Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0xd

    goto :goto_1

    :cond_2
    invoke-static {}, Lsg/a1;->p0()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x7

    goto :goto_1

    :cond_3
    const/4 v0, 0x6

    :goto_1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method public static final e2(Lcom/roblox/client/startup/MainGameActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->C2()V

    return-void
.end method

.method public static final f2(Lcom/roblox/client/startup/MainGameActivity;)Lak/a0;
    .locals 7

    new-instance v0, Lak/a0;

    sget v2, Lsg/m0;->s0:I

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lak/a0;-><init>(Lj/b;ILkm/f;Lyi/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final g2(Lcom/roblox/client/startup/MainGameActivity;)Lwg/c;
    .locals 3

    new-instance v0, Lwg/c;

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->l2()Lak/a0;

    move-result-object p0

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, p0, v1}, Lwg/c;-><init>(Lwg/c$d;Landroid/os/Handler;)V

    return-object v0
.end method

.method private static final getAppUpgradeKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    sget-object v0, Lcom/roblox/client/startup/MainGameActivity;->c0:Lcom/roblox/client/startup/MainGameActivity$Companion;

    invoke-static {v0}, Lcom/roblox/client/startup/MainGameActivity$Companion;->a(Lcom/roblox/client/startup/MainGameActivity$Companion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final h2(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/roblox/client/startup/StartedForEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/roblox/client/startup/MainGameActivity;->c0:Lcom/roblox/client/startup/MainGameActivity$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/roblox/client/startup/MainGameActivity$Companion;->e(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static final native nativeAppBridgeSetInitParams(Lcom/roblox/engine/jni/autovalue/InitParams;)V
    .param p0    # Lcom/roblox/engine/jni/autovalue/InitParams;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method private static final native nativeEnableVersionBFlagCache(Z)V
.end method

.method private static final native nativePreloadFlagOverrides(Ljava/lang/String;)V
.end method

.method public static final native nativeRetryInit()V
.end method

.method private static final native nativeSetAssetPath(Ljava/lang/String;)V
.end method

.method private final u2()Z
    .locals 2

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/l;->b()Landroidx/lifecycle/l$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/l$b;->e:Landroidx/lifecycle/l$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l$b;->b(Landroidx/lifecycle/l$b;)Z

    move-result v0

    return v0
.end method

.method public static final v2(Le/m0;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$addCallback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "MainGameActivity"

    const-string v0, "onBackPressed: ... notify Lua of this BACK button."

    invoke-static {p0, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeHandleBackPressed()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final w2(Lcom/roblox/client/startup/MainGameActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, p1, p2, v0, v1}, Lsg/q;->h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-void
.end method

.method public static final y2(Ljt/r;)Ljava/lang/CharSequence;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljt/r;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0}, Ljt/r;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p0}, Ljt/r;->c()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\n\t"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " : "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " => "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final B2()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roblox/client/startup/MainGameActivity;->K2(Z)V

    sget-object v0, Lcom/roblox/client/startup/MainGameActivity;->c0:Lcom/roblox/client/startup/MainGameActivity$Companion;

    invoke-virtual {v0}, Lcom/roblox/client/startup/MainGameActivity$Companion;->i()V

    return-void
.end method

.method public final C2()V
    .locals 2

    const-string v0, "Set up context and start to unpack assets:"

    const-string v1, "MainGameActivity"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lmk/c;->g:Lmk/c$a;

    invoke-virtual {v0}, Lmk/c$a;->c()Lmk/c;

    move-result-object v0

    invoke-virtual {v0}, Lmk/c;->r()Ljava/lang/String;

    new-instance v0, Lak/d1;

    invoke-direct {v0, p0}, Lak/d1;-><init>(Lcom/roblox/client/startup/MainGameActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->n0()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "runAndWaitToUnpackAssets: check for platform emergency..."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->b0:Lml/d;

    if-eqz v0, :cond_0

    new-instance v1, Lak/e1;

    invoke-direct {v1, p0}, Lak/e1;-><init>(Lcom/roblox/client/startup/MainGameActivity;)V

    invoke-virtual {v0, v1}, Lml/d;->g(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->F2()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->F2()V

    return-void
.end method

.method public E()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/startup/MainGameActivity;->d2()V

    return-void
.end method

.method public final declared-synchronized F2()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->W:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MainGameActivity"

    const-string v1, "setInitParamsForEngine: initializing"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Lwh/p;->c(Landroid/content/Context;)Lcom/roblox/engine/jni/model/DeviceParams;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetDeviceInfo(Lcom/roblox/engine/jni/model/DeviceParams;)V

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/InitParams;->builder()Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v0

    invoke-static {p0, p0}, Lwh/p;->b(Landroid/content/Context;Landroid/app/Activity;)Lwh/f$d;

    move-result-object v1

    invoke-virtual {v1}, Lwh/f$d;->b()Lcom/roblox/engine/jni/model/PlatformParams;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->setPlatformParams(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    invoke-virtual {v1}, Lwh/f$d;->a()Lcom/roblox/engine/jni/model/DeviceParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->setDeviceParams(Lcom/roblox/engine/jni/model/DeviceParams;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v0

    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->setBaseURL(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v0

    invoke-static {}, Lsg/a1;->Z0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->setUserAgent(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v0

    invoke-static {}, Lsg/a1;->r0()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->setIsTablet(Z)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v0

    invoke-static {}, Lsg/a1;->t0()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->setIsPotato(Z)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v0

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->setIsVrDevice(Z)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->build()Lcom/roblox/engine/jni/autovalue/InitParams;

    move-result-object v0

    sget-object v1, Lcom/roblox/client/startup/MainGameActivity;->c0:Lcom/roblox/client/startup/MainGameActivity$Companion;

    invoke-virtual {v1, v0}, Lcom/roblox/client/startup/MainGameActivity$Companion;->f(Lcom/roblox/engine/jni/autovalue/InitParams;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const-string v0, "MainGameActivity"

    const-string v1, "setInitParamsForEngine: already initialized"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final I2(I)V
    .locals 5

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "retry_during_splash"

    const-wide/16 v3, 0x0

    invoke-static {v2, v3, v4, v0, v1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    invoke-static {p0, p1}, Lcom/roblox/client/startup/c;->y2(Lj/b;I)V

    return-void
.end method

.method public final J()V
    .locals 1

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lsg/q0;->S:I

    invoke-static {p0, v0}, Lgk/x;->a(Landroid/app/Activity;I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roblox/client/startup/MainGameActivity;->K2(Z)V

    invoke-direct {p0}, Lcom/roblox/client/startup/MainGameActivity;->u2()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lsg/q0;->S:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/startup/MainGameActivity;->I2(I)V

    :cond_1
    return-void
.end method

.method public final K2(Z)V
    .locals 1

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "MainGameActivity"

    const-string v0, "updateLoadingView is disabled to disable loading screen for full VR experience."

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->U:Lcom/roblox/client/components/LoadingBar;

    if-nez v0, :cond_1

    const-string v0, "loadingView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final L2()V
    .locals 7

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v0

    invoke-static {v0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v1

    new-instance v4, Lcom/roblox/client/startup/MainGameActivity$b;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/roblox/client/startup/MainGameActivity$b;-><init>(Lcom/roblox/client/startup/MainGameActivity;Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->E2()Z

    move-result v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x2

    if-eqz v1, :cond_0

    const-string v5, "update_native_settings_begin"

    invoke-static {v5, v2, v3, v4, v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    :cond_0
    invoke-static {}, Lsg/a1;->V0()V

    if-eqz v1, :cond_1

    const-string v1, "update_native_settings_end"

    invoke-static {v1, v2, v3, v4, v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    :cond_1
    sget-object v1, Lmk/c;->g:Lmk/c$a;

    invoke-virtual {v1}, Lmk/c$a;->c()Lmk/c;

    move-result-object v1

    invoke-virtual {v1}, Lmk/c;->r()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/roblox/client/startup/MainGameActivity;->c0:Lcom/roblox/client/startup/MainGameActivity$Companion;

    invoke-static {v2, v1}, Lcom/roblox/client/startup/MainGameActivity$Companion;->d(Lcom/roblox/client/startup/MainGameActivity$Companion;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->e6()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "getApplicationContext(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/roblox/client/startup/FlagCacheUtils;->getVersionBCacheChannelMiss(Landroid/content/Context;)Lcom/roblox/client/startup/FlagCacheUtils$a;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->x1()Z

    move-result v0

    invoke-static {v2, v0}, Lcom/roblox/client/startup/MainGameActivity$Companion;->b(Lcom/roblox/client/startup/MainGameActivity$Companion;Z)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/roblox/client/startup/FlagCacheUtils$a;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "vb_cache_"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0, v4, v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->m(Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)V

    :cond_3
    :goto_0
    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lwj/a;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lwj/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lwj/a;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v2, v0}, Lcom/roblox/client/startup/MainGameActivity$Companion;->c(Lcom/roblox/client/startup/MainGameActivity$Companion;Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public N()V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->i2()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->B2()V

    return-void
.end method

.method public U(I)V
    .locals 1

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/startup/MainGameActivity;->t2(Ljava/lang/String;)V

    return-void
.end method

.method public W(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/startup/MainGameActivity;->t2(Ljava/lang/String;)V

    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "newBase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-static {}, Lqi/b;->f()Lqi/b;

    move-result-object v1

    invoke-virtual {v1, p1}, Lqi/b;->d(Landroid/content/Context;)Lqi/f;

    move-result-object v1

    const-string v2, "getDefaultLocaleValue(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lqi/b;->f()Lqi/b;

    move-result-object v2

    invoke-virtual {v2}, Lqi/b;->j()Lqi/f;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v4

    invoke-virtual {v1}, Lqi/f;->c()Ljava/lang/String;

    move-result-object v5

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lqi/f;->c()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " -> Locale: base = "

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "; default = "

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "; user = "

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "rbx.locale"

    invoke-static {v4, v3}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    invoke-virtual {v1}, Lqi/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lqi/b;->b(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    invoke-virtual {v0, v1}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Lj/b;->attachBaseContext(Landroid/content/Context;)V

    invoke-static {p0}, Lsh/i;->b(Landroid/content/Context;)V

    return-void
.end method

.method public final bootstrapTheApp()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "MainGameActivity"

    const-string v1, "Unpack assets in a background thread."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lak/c1;

    invoke-direct {v1, p0}, Lak/c1;-><init>(Lcom/roblox/client/startup/MainGameActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public f0()Landroid/app/Activity;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    return-object p0
.end method

.method public final getNativeHelper()Lcom/roblox/client/startup/NativeHelper;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->Q:Lcom/roblox/client/startup/NativeHelper;

    return-object v0
.end method

.method public i()V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->i2()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->B2()V

    return-void
.end method

.method public final i2()V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/c;->v2(Lj/b;)V

    return-void
.end method

.method public final j2()V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->i2()V

    return-void
.end method

.method public final k2()Lmi/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->R:Lmi/a;

    return-object v0
.end method

.method public final l2()Lak/a0;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->Z:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lak/a0;

    return-object v0
.end method

.method public final m2()Lwg/c;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->a0:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwg/c;

    return-object v0
.end method

.method public final n2(Landroid/content/Intent;)Lcom/roblox/client/startup/StartedForEnum;
    .locals 5

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    const-class v1, Lcom/roblox/client/startup/StartedForEnum;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const/4 v0, 0x0

    :try_start_0
    sget-object v2, Ljt/n;->b:Ljt/n$a;

    const-string v2, "STARTED_FOR_INTENT_KEY"

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-lt v3, v4, :cond_0

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    instance-of v1, p1, Lcom/roblox/client/startup/StartedForEnum;

    if-nez v1, :cond_1

    move-object p1, v0

    :cond_1
    check-cast p1, Lcom/roblox/client/startup/StartedForEnum;

    :goto_0
    check-cast p1, Lcom/roblox/client/startup/StartedForEnum;

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    sget-object v1, Ljt/n;->b:Ljt/n$a;

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    invoke-static {p1}, Ljt/n;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_3

    :cond_2
    move-object v0, p1

    :goto_3
    check-cast v0, Lcom/roblox/client/startup/StartedForEnum;

    if-eqz v0, :cond_3

    goto :goto_4

    :cond_3
    sget-object v0, Lcom/roblox/client/startup/StartedForEnum;->SYSTEM:Lcom/roblox/client/startup/StartedForEnum;

    :goto_4
    return-object v0
.end method

.method public final o2(Landroid/content/Intent;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/roblox/client/startup/MainGameActivity;->n2(Landroid/content/Intent;)Lcom/roblox/client/startup/StartedForEnum;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->S:Lcom/roblox/client/startup/StartedForEnum;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": Started for: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "MainGameActivity"

    invoke-static {v0, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lcom/roblox/client/startup/MainGameActivity;->S:Lcom/roblox/client/startup/StartedForEnum;

    sget-object v0, Lcom/roblox/client/startup/StartedForEnum;->LOADED_FROM_PUSH_NOTIFICATION:Lcom/roblox/client/startup/StartedForEnum;

    if-ne p2, v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljj/r;->G(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1
    .param p1    # Landroid/content/res/Configuration;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "newConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/androidgamesdk/GameActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    sget-object v0, Lmk/h;->a:Lmk/h;

    invoke-virtual {v0, p1}, Lmk/h;->d(Landroid/content/res/Configuration;)V

    sget-object p1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    invoke-virtual {p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->C()V

    invoke-static {}, Lsg/a1;->l0()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/startup/MainGameActivity;->Q:Lcom/roblox/client/startup/NativeHelper;

    invoke-virtual {p1}, Lcom/roblox/client/startup/NativeHelper;->g0()V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 10
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-static {p0}, Lcom/axjava/Main;->Start(Landroid/content/Context;)V

    const-string v0, "MainGameActivity"

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-boolean v2, Lcom/roblox/client/startup/MainGameActivity;->e0:Z

    const/4 v3, 0x2

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_0

    const-string v2, "process_reuse"

    invoke-static {v2, v4, v5, v3, v6}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    :cond_0
    invoke-static {p0}, Ljm/a;->c(Landroid/content/Context;)V

    invoke-static {}, Ljm/a;->j()Ljm/a;

    move-result-object v2

    sget-object v7, Ljm/a$a;->c:Ljm/a$a;

    invoke-virtual {v2, v7, p1}, Ljm/a;->a(Ljm/a$a;Landroid/os/Bundle;)V

    const-string v2, "main_activity_oncreate"

    invoke-static {v2, v4, v5, v3, v6}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->x2()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->H1()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p0}, Lfj/a0;->R(Landroid/content/Context;)Lfj/a0;

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    :goto_0
    const/4 v2, 0x3

    invoke-static {p0, v6, v6, v2, v6}, Le/x;->c(Le/p;Le/u0;Le/u0;ILjava/lang/Object;)V

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object v2

    invoke-virtual {v2, p0}, Lvi/b;->l(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->L2()V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "getIntent(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v2, v1}, Lcom/roblox/client/startup/MainGameActivity;->o2(Landroid/content/Intent;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->h0()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Using GameActivity (for QA)"

    const/4 v2, 0x0

    invoke-static {p0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    :cond_2
    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v1

    invoke-virtual {v1}, Lvi/h;->i()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v1

    invoke-virtual {v1}, Lvi/h;->g()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {}, Ljj/r;->l()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v4, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v5, "recipient_user_id"

    invoke-direct {v4, v5, v1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "androidNotificationsSettings"

    const-string v4, "onAppForeground"

    invoke-static {v1, v4, v3, v2}, Lvg/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    :cond_3
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->n0()Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "Attach platform emergency observer."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->b0:Lml/d;

    if-nez v0, :cond_4

    new-instance v0, Lml/d;

    invoke-direct {v0, v6, v2, v6}, Lml/d;-><init>(Lku/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->b0:Lml/d;

    :cond_4
    sget-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->INSTANCE:Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;

    iget-object v1, p0, Lcom/roblox/client/startup/MainGameActivity;->b0:Lml/d;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->attachObserver(Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)Z

    invoke-virtual {v0, p0}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->setActivity(Landroid/app/Activity;)V

    :cond_5
    invoke-super {p0, p1}, Lcom/google/androidgamesdk/GameActivity;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, Lmk/h;->a:Lmk/h;

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    const-string v1, "getConfiguration(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lmk/h;->c(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->q2()V

    iget-object p1, p0, Lcom/google/androidgamesdk/GameActivity;->H:Lcom/google/androidgamesdk/GameActivity$d;

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->s2()Lcom/roblox/client/RbxKeyboard;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/startup/MainGameActivity;->Q:Lcom/roblox/client/startup/NativeHelper;

    iget v2, p0, Lcom/google/androidgamesdk/GameActivity;->E:I

    iget-object v3, p0, Lcom/roblox/client/startup/MainGameActivity;->Y:Lak/o0;

    invoke-virtual {v1, v2, p1, v0, v3}, Lcom/roblox/client/startup/NativeHelper;->n0(ILandroid/view/SurfaceView;Lcom/roblox/client/RbxKeyboard;Lmk/f$f;)V

    invoke-virtual {p0}, Le/p;->Q()Le/p0;

    move-result-object v4

    new-instance v7, Lak/z0;

    invoke-direct {v7}, Lak/z0;-><init>()V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Le/q0;->b(Le/p0;Landroidx/lifecycle/s;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Le/m0;

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->r2()V

    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "GameActivity SurfaceView failed to initialize"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onDestroy()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDestroy. isFinishing = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MainGameActivity"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->m2()Lwg/c;

    move-result-object v0

    invoke-virtual {v0}, Lwg/c;->e()V

    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->b0:Lml/d;

    if-eqz v0, :cond_0

    const-string v0, "Detach platform emergency observer."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->INSTANCE:Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;

    iget-object v1, p0, Lcom/roblox/client/startup/MainGameActivity;->b0:Lml/d;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->detachObserver(Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->b0:Lml/d;

    :cond_0
    invoke-super {p0}, Lcom/google/androidgamesdk/GameActivity;->onDestroy()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p2    # Landroid/view/KeyEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmk/h;->a:Lmk/h;

    invoke-virtual {v0, p2}, Lmk/h;->e(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, Lcom/google/androidgamesdk/GameActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p2    # Landroid/view/KeyEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmk/h;->a:Lmk/h;

    invoke-virtual {v0, p2}, Lmk/h;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, Lcom/google/androidgamesdk/GameActivity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Le/p;->onNewIntent(Landroid/content/Intent;)V

    const-string v0, "onNewIntent"

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/startup/MainGameActivity;->o2(Landroid/content/Intent;Ljava/lang/String;)V

    return-void
.end method

.method public onPause()V
    .locals 5

    invoke-super {p0}, Lcom/google/androidgamesdk/GameActivity;->onPause()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->H3()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->T:Landroid/view/View;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "splashScreen"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "MainGameActivity"

    const-string v2, "onPause: MainGameActivity backgrounded before becoming interactive."

    invoke-static {v0, v2}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v2, 0x0

    const/4 v0, 0x2

    const-string v4, "startup_interrupted"

    invoke-static {v4, v2, v3, v0, v1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    :cond_1
    invoke-static {}, Ljm/a;->j()Ljm/a;

    move-result-object v0

    sget-object v1, Ljm/a$a;->c:Ljm/a$a;

    invoke-virtual {v0, v1}, Ljm/a;->b(Ljm/a$a;)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1
    .param p2    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "permissions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "grantResults"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Le4/q;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->k()Lom/k;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lom/k;->Q(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public onResume()V
    .locals 3

    const-string v0, "onResume:"

    const-string v1, "MainGameActivity"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0}, Lcom/google/androidgamesdk/GameActivity;->onResume()V

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljj/r;->s(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->z2()V

    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->S:Lcom/roblox/client/startup/StartedForEnum;

    sget-object v2, Lcom/roblox/client/startup/StartedForEnum;->PROTOCOL_LAUNCH:Lcom/roblox/client/startup/StartedForEnum;

    if-ne v0, v2, :cond_0

    invoke-static {}, Lcom/roblox/client/startup/a;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v0

    invoke-virtual {v0}, Lkm/f;->t()V

    :cond_0
    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/h;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "onResume: ... (Logged in) Try to grant pending purchases."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->D(Landroid/content/Context;Z)V

    :cond_1
    invoke-static {}, Lgk/t;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->e()Lbm/r;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbm/r;->x(Landroid/app/Activity;)V

    :cond_2
    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Lcom/google/androidgamesdk/GameActivity;->onStart()V

    const/4 v0, 0x1

    sput-boolean v0, Lcom/roblox/client/startup/MainGameActivity;->e0:Z

    invoke-static {}, Ljm/a;->j()Ljm/a;

    move-result-object v0

    invoke-virtual {v0}, Ljm/a;->f()V

    return-void
.end method

.method public final openWebActivity(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "openWebActivity: url = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", title = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MainGameActivity"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lak/a1;

    invoke-direct {v0, p0, p1, p2}, Lak/a1;-><init>(Lcom/roblox/client/startup/MainGameActivity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final p2()V
    .locals 2

    const-string v0, "MainGameActivity"

    const-string v1, "... Hide the progress bar."

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->T:Landroid/view/View;

    if-nez v0, :cond_0

    const-string v0, "splashScreen"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final promptNativePurchase(JLjava/lang/String;)V
    .locals 2
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "productId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "promptNativePurchase: userId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", productId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MainGameActivity"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->X:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->y(JLjava/lang/String;)V

    return-void
.end method

.method public final promptNativePurchaseWithPayload(JLjava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "robloxNativeProductId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "promptNativePurchaseWithPayload: userId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", roblox-native-productId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MainGameActivity"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->X:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->A(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public q0()Lcom/roblox/client/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public final q2()V
    .locals 3

    const-string v0, "MainGameActivity"

    const-string v1, "Adding our custom loading view..."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Lcom/google/androidgamesdk/GameActivity;->E:I

    invoke-virtual {p0, v0}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lsg/n0;->b:I

    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    sget v1, Lsg/m0;->S:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iput-object v1, p0, Lcom/roblox/client/startup/MainGameActivity;->T:Landroid/view/View;

    sget v1, Lsg/m0;->U:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/roblox/client/components/LoadingBar;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Lcom/roblox/client/components/LoadingBar;->setVisibility(I)V

    iput-object v1, p0, Lcom/roblox/client/startup/MainGameActivity;->U:Lcom/roblox/client/components/LoadingBar;

    sget v1, Lsg/m0;->s0:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iput-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->V:Landroid/view/View;

    iget-object v1, p0, Lcom/roblox/client/startup/MainGameActivity;->R:Lmi/a;

    invoke-virtual {v1, v0}, Lmi/a;->e(Landroid/view/View;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "`web_overlay_layout` not found in the `activity_game` layout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "`loading_progress_view` not found in the `activity_game` layout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "`loading_layout` not found in the `activity_game` layout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Surface view not created or expected view hierarchy not matching."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final r2()V
    .locals 4

    sget-boolean v0, Lcom/roblox/client/startup/MainGameActivity;->f0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roblox/client/startup/MainGameActivity;->f0:Z

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "ROBLOXCrash"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v2

    invoke-virtual {v2, v1}, Lvi/g;->i(Z)V

    sget-object v1, Landroidx/lifecycle/h0;->i:Landroidx/lifecycle/h0$b;

    invoke-virtual {v1}, Landroidx/lifecycle/h0$b;->a()Landroidx/lifecycle/s;

    move-result-object v1

    invoke-interface {v1}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object v1

    new-instance v2, Lcom/roblox/client/startup/MainGameActivity$a;

    invoke-direct {v2, v0}, Lcom/roblox/client/startup/MainGameActivity$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    return-void
.end method

.method public final requestOrientationAsDefault()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "MainGameActivity"

    const-string v1, "requestOrientationAsDefault"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lak/y0;

    invoke-direct {v0, p0}, Lak/y0;-><init>(Lcom/roblox/client/startup/MainGameActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final s2()Lcom/roblox/client/RbxKeyboard;
    .locals 2

    sget v0, Lsg/m0;->b0:I

    invoke-virtual {p0, v0}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/RbxKeyboard;

    if-eqz v0, :cond_0

    const-string v1, "SourceSansPro-Regular.ttf"

    invoke-static {v0, p0, v1}, Leh/e;->d(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "`rbx_edit_text` not found. Was `inflateOverlayLayout` called?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final showLeaveAppPrompt()V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance v0, Lak/t0;

    invoke-direct {v0, p0}, Lak/t0;-><init>(Lcom/roblox/client/startup/MainGameActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1
    .param p1    # Landroid/view/SurfaceHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/androidgamesdk/GameActivity;->surfaceCreated(Landroid/view/SurfaceHolder;)V

    iget-object p1, p0, Lcom/roblox/client/startup/MainGameActivity;->Y:Lak/o0;

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lak/o0;->a(Z)V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2
    .param p1    # Landroid/view/SurfaceHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity;->Y:Lak/o0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lak/o0;->a(Z)V

    invoke-super {p0, p1}, Lcom/google/androidgamesdk/GameActivity;->surfaceDestroyed(Landroid/view/SurfaceHolder;)V

    return-void
.end method

.method public final syncCookiesFromEngine()V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance v0, Lak/b1;

    invoke-direct {v0}, Lak/b1;-><init>()V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final t2(Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/appcompat/app/a$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;)V

    sget v1, Lsg/q0;->u:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/a$a;->j(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/a$a;->h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/a$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/a$a;->r()Landroidx/appcompat/app/a;

    return-void
.end method

.method public final x2()V
    .locals 12

    sget-boolean v0, Lcom/roblox/client/startup/MainGameActivity;->d0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roblox/client/startup/MainGameActivity;->d0:Z

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "overrideFlagsAtStartup: count = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "MainGameActivity"

    invoke-static {v2, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v4

    invoke-interface {v4, v1}, Lth/g;->N0(Ljava/lang/String;)Lcom/roblox/client/flags/a;

    move-result-object v4

    const-string v5, "Flag "

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/roblox/client/flags/a;->a()Z

    move-result v6

    if-nez v6, :cond_3

    instance-of v6, v4, Lcom/roblox/client/flags/a$a;

    if-eqz v6, :cond_1

    check-cast v4, Lcom/roblox/client/flags/a$a;

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/roblox/client/flags/a$a;->k()Ljava/lang/Boolean;

    move-result-object v5

    const-string v6, "valueOf(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4, v6}, Lcom/roblox/client/flags/a;->g(Ljava/lang/Object;)V

    new-instance v6, Ljt/r;

    invoke-virtual {v4}, Lcom/roblox/client/flags/a$a;->k()Ljava/lang/Boolean;

    move-result-object v4

    invoke-direct {v6, v1, v5, v4}, Ljt/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is not a boolean flag."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is cached and not supported."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is not found."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    new-instance v9, Lak/u0;

    invoke-direct {v9}, Lak/u0;-><init>()V

    const/16 v10, 0x1d

    const/4 v11, 0x0

    const/4 v4, 0x0

    const-string v5, "overrideFlagsAtStartup:"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Lkotlin/collections/CollectionsKt;->m0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final z2()V
    .locals 3

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v0

    invoke-virtual {v0}, Ljj/r;->i()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "processPushNotification: Handle notifications using Linking..."

    const-string v2, "MainGameActivity"

    invoke-static {v2, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljj/r;->t(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    const-string v0, "processPushNotification: Handle legacy push notifications..."

    invoke-static {v2, v0}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
