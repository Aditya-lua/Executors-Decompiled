.class public final Lcom/roblox/client/startup/NativeHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/startup/NativeHelper$a;,
        Lcom/roblox/client/startup/NativeHelper$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010\u0006\n\u0002\u0008\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u00a3\u00012\u00020\u0001:\u0001cB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u000eJ/\u0010\u001f\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0!H\u0007\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010\'\u001a\u00020\u000c2\u0006\u0010&\u001a\u00020%H\u0007\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010)\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008)\u0010\u000eJ\u000f\u0010*\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008*\u0010\u000eJ\u000f\u0010+\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008+\u0010\u000eJ\u000f\u0010,\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008,\u0010\u000eJ\u0017\u0010/\u001a\u00020\u000c2\u0006\u0010.\u001a\u00020-H\u0007\u00a2\u0006\u0004\u0008/\u00100J\u0017\u00102\u001a\u00020\u000c2\u0006\u00101\u001a\u00020-H\u0007\u00a2\u0006\u0004\u00082\u00100J\u001f\u00106\u001a\u00020\u000c2\u0006\u00103\u001a\u00020\u00172\u0006\u00105\u001a\u000204H\u0007\u00a2\u0006\u0004\u00086\u00107J\u0017\u00109\u001a\u00020\u000c2\u0006\u00108\u001a\u00020\"H\u0007\u00a2\u0006\u0004\u00089\u0010:J\u0017\u0010<\u001a\u00020\u000c2\u0006\u0010;\u001a\u00020\"H\u0007\u00a2\u0006\u0004\u0008<\u0010:J\u000f\u0010=\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008=\u0010\u000eJ\u0017\u0010>\u001a\u00020\u000c2\u0006\u00108\u001a\u00020\"H\u0007\u00a2\u0006\u0004\u0008>\u0010:J\u0017\u0010?\u001a\u00020\u000c2\u0006\u00108\u001a\u00020\"H\u0007\u00a2\u0006\u0004\u0008?\u0010:J\u0017\u0010@\u001a\u00020\u000c2\u0006\u00108\u001a\u00020\"H\u0007\u00a2\u0006\u0004\u0008@\u0010:J\u000f\u0010A\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008A\u0010\u000eJ\u000f\u0010B\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008B\u0010\u000eJ\u000f\u0010C\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008C\u0010\u000eJ\u0017\u0010F\u001a\u00020\u000c2\u0006\u0010E\u001a\u00020DH\u0007\u00a2\u0006\u0004\u0008F\u0010GJ\u000f\u0010H\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008H\u0010\u000eJ\u000f\u0010I\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008I\u0010\u000eJ/\u0010P\u001a\u00020\u000c2\u0006\u0010J\u001a\u00020-2\u0006\u0010K\u001a\u0002042\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0007\u00a2\u0006\u0004\u0008P\u0010QJ\u000f\u0010R\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008R\u0010\u000eJ\u0017\u0010T\u001a\u00020\u000c2\u0006\u0010S\u001a\u00020\"H\u0007\u00a2\u0006\u0004\u0008T\u0010:J\u000f\u0010U\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008U\u0010\u000eJ\u0017\u0010W\u001a\u00020\u000c2\u0006\u0010V\u001a\u00020\"H\u0007\u00a2\u0006\u0004\u0008W\u0010:J/\u0010\\\u001a\u00020\u000c2\u0006\u0010X\u001a\u00020\u00172\u0006\u0010Y\u001a\u00020\u00172\u0006\u0010Z\u001a\u00020\"2\u0006\u0010[\u001a\u00020\"H\u0007\u00a2\u0006\u0004\u0008\\\u0010]J\u0017\u0010`\u001a\u00020\u000c2\u0006\u0010_\u001a\u00020^H\u0007\u00a2\u0006\u0004\u0008`\u0010aJ\u000f\u0010b\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008b\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008c\u0010dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008g\u0010hR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008i\u0010jR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008l\u0010mR\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008p\u0010qR\u0016\u0010u\u001a\u0002048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008s\u0010tR\u0016\u0010w\u001a\u0002048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008v\u0010tR\u0016\u0010y\u001a\u0002048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008x\u0010tR\u0016\u0010{\u001a\u0002048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008z\u0010tR\u0016\u0010}\u001a\u0002048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008|\u0010tR\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u007f\u0010\u0080\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0086\u0001\u0010\u0015R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0088\u0001\u0010\u0089\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u00a2\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001\u00a8\u0006\u00a4\u0001"
    }
    d2 = {
        "Lcom/roblox/client/startup/NativeHelper;",
        "",
        "Lcom/roblox/client/startup/MainGameActivity;",
        "activity",
        "Loh/i;",
        "upgradeDialog",
        "Lch/a;",
        "adsHelper",
        "Lav/l0;",
        "ioDispatcher",
        "<init>",
        "(Lcom/roblox/client/startup/MainGameActivity;Loh/i;Lch/a;Lav/l0;)V",
        "",
        "s0",
        "()V",
        "q0",
        "l0",
        "t0",
        "x0",
        "v0",
        "w0",
        "I",
        "i0",
        "",
        "contentViewId",
        "Landroid/view/SurfaceView;",
        "surfaceView",
        "Lcom/roblox/client/RbxKeyboard;",
        "rbxEditText",
        "Luk/f$f;",
        "inputAdapter",
        "r0",
        "(ILandroid/view/SurfaceView;Lcom/roblox/client/RbxKeyboard;Luk/f$f;)V",
        "",
        "",
        "gameActivity_getShellFlagKeys",
        "()[Ljava/lang/String;",
        "Ljava/nio/ByteBuffer;",
        "flagsBuffer",
        "gameActivity_onFlagsLoaded",
        "(Ljava/nio/ByteBuffer;)V",
        "gameActivity_onFlagsFailed",
        "gameActivity_onEngineInitialized",
        "gameActivity_onHomePageLoaded",
        "gameActivity_onHomePageInteractive",
        "",
        "browserTrackerId",
        "gameActivity_setBrowserTrackerId",
        "(J)V",
        "placeId",
        "gameActivity_onGameLoaded",
        "orientation",
        "",
        "inExperience",
        "gameActivity_onScreenOrientationChanged",
        "(IZ)V",
        "data",
        "gameActivity_onGameStreamingStatusChanged",
        "(Ljava/lang/String;)V",
        "motionType",
        "gameActivity_onMotionEventListening",
        "gameActivity_onLuaAppDidReturn",
        "gameActivity_onDidLogInReceived",
        "gameActivity_onDidSignUp",
        "gameActivity_onAppReady",
        "gameActivity_onDidLogOutReceived",
        "gameActivity_onDidSwitchAccountReceived",
        "gameActivity_onExperienceStart",
        "",
        "timeInMs",
        "gameActivity_onExperienceStop",
        "(D)V",
        "gameActivity_onRestartLuaApp",
        "gameActivity_onScanQrCode",
        "textBox",
        "showNativeInput",
        "",
        "byteArrayFromTextBox",
        "Lcom/roblox/engine/jni/model/NativeTextBoxInfo;",
        "textBoxInfo",
        "gameActivity_showKeyboard",
        "(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V",
        "gameActivity_hideKeyboard",
        "value",
        "gameActivity_onLuaTextBoxChanged",
        "gameActivity_onLuaTextBoxPropertyChanged",
        "path",
        "gameActivity_onScreenshotReady",
        "result",
        "upgradeStatusCode",
        "apkUrl",
        "apkCheckSum",
        "gameActivity_setAppUpgradeStatus",
        "(IILjava/lang/String;Ljava/lang/String;)V",
        "Lyh/j;",
        "event",
        "onCodeParsedFromSMS",
        "(Lyh/j;)V",
        "k0",
        "a",
        "Lcom/roblox/client/startup/MainGameActivity;",
        "b",
        "Loh/i;",
        "c",
        "Lch/a;",
        "d",
        "Lav/l0;",
        "Luk/f;",
        "e",
        "Luk/f;",
        "inputListener",
        "Lei/x0;",
        "f",
        "Lei/x0;",
        "overlayEditTextController",
        "g",
        "Z",
        "isVisible",
        "h",
        "isForeground",
        "i",
        "isEngineInitialized",
        "j",
        "isInExperience",
        "k",
        "enableConnectivityV2ForAndroid",
        "Lih/a;",
        "l",
        "Lih/a;",
        "rtcAudioManager",
        "Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;",
        "m",
        "Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;",
        "appHangMonitor",
        "n",
        "Lei/i;",
        "o",
        "Lei/i;",
        "batteryStatusObserver",
        "Lei/a1;",
        "p",
        "Lei/a1;",
        "thermalStatusObserver",
        "Landroid/hardware/display/DisplayManager$DisplayListener;",
        "q",
        "Landroid/hardware/display/DisplayManager$DisplayListener;",
        "displayListener",
        "Landroidx/lifecycle/p;",
        "r",
        "Landroidx/lifecycle/p;",
        "lifecycleEventObserver",
        "Ldj/e$e;",
        "s",
        "Ldj/e$e;",
        "notificationObserver",
        "Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;",
        "t",
        "Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;",
        "webViewUserAgentGetter",
        "Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;",
        "u",
        "Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;",
        "mobileAdvertisingIdGetter",
        "v",
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
.field public static final v:Lcom/roblox/client/startup/NativeHelper$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final w:Ldl/h$d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/roblox/client/startup/MainGameActivity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Loh/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lch/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lav/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Luk/f;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public f:Lei/x0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public volatile k:Z

.field public l:Lih/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public m:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public n:I

.field public o:Lei/i;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public p:Lei/a1;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public q:Landroid/hardware/display/DisplayManager$DisplayListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final r:Landroidx/lifecycle/p;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final s:Ldj/e$e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final t:Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final u:Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/client/startup/NativeHelper$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/startup/NativeHelper$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/roblox/client/startup/NativeHelper;->v:Lcom/roblox/client/startup/NativeHelper$a;

    new-instance v0, Lik/n2;

    invoke-direct {v0}, Lik/n2;-><init>()V

    sput-object v0, Lcom/roblox/client/startup/NativeHelper;->w:Ldl/h$d;

    return-void
.end method

.method public constructor <init>(Lcom/roblox/client/startup/MainGameActivity;Loh/i;Lch/a;Lav/l0;)V
    .locals 1
    .param p1    # Lcom/roblox/client/startup/MainGameActivity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Loh/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lch/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lav/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upgradeDialog"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioDispatcher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    .line 3
    iput-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->b:Loh/i;

    .line 4
    iput-object p3, p0, Lcom/roblox/client/startup/NativeHelper;->c:Lch/a;

    .line 5
    iput-object p4, p0, Lcom/roblox/client/startup/NativeHelper;->d:Lav/l0;

    .line 6
    new-instance p2, Lik/z1;

    invoke-direct {p2, p0}, Lik/z1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    iput-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->r:Landroidx/lifecycle/p;

    .line 7
    new-instance p3, Lik/a2;

    invoke-direct {p3}, Lik/a2;-><init>()V

    iput-object p3, p0, Lcom/roblox/client/startup/NativeHelper;->s:Ldj/e$e;

    .line 8
    new-instance p3, Lik/b2;

    invoke-direct {p3, p0}, Lik/b2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    iput-object p3, p0, Lcom/roblox/client/startup/NativeHelper;->t:Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;

    .line 9
    new-instance p3, Lik/c2;

    invoke-direct {p3}, Lik/c2;-><init>()V

    iput-object p3, p0, Lcom/roblox/client/startup/NativeHelper;->u:Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;

    .line 10
    invoke-virtual {p1}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/roblox/client/startup/MainGameActivity;Loh/i;Lch/a;Lav/l0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 11
    invoke-static {}, Lav/g1;->b()Lav/l0;

    move-result-object p4

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roblox/client/startup/NativeHelper;-><init>(Lcom/roblox/client/startup/MainGameActivity;Loh/i;Lch/a;Lav/l0;)V

    return-void
.end method

.method public static synthetic A(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->f0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic B(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->X(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic C(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->O(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic D(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->T(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic E()V
    .locals 0

    invoke-static {}, Lcom/roblox/client/startup/NativeHelper;->u0()V

    return-void
.end method

.method public static synthetic F(Landroid/content/Context;Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->S(Landroid/content/Context;Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static final synthetic G(Lcom/roblox/client/startup/NativeHelper;)Lcom/roblox/client/startup/MainGameActivity;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    return-object p0
.end method

.method public static final synthetic H(Lcom/roblox/client/startup/NativeHelper;)Loh/i;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->b:Loh/i;

    return-object p0
.end method

.method public static final J(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->f:Lei/x0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lei/x0;->a()V

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->I()V

    return-void
.end method

.method public static final K(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->r2()V

    return-void
.end method

.method public static final L(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {v0}, Lik/k0;->s(Landroid/content/Context;)Lik/k0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lik/k0;->H(Ljava/lang/String;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->Y3()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Ldj/b;->f()Ldj/b;

    move-result-object p1

    invoke-virtual {p1}, Ldj/b;->h()V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x2000

    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->D3()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->C3()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->screenTimeStartByGuac()V

    :cond_1
    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p1}, Lcom/roblox/client/ossearch/b;->g(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p1}, Lcom/roblox/client/ossearch/b;->e(Landroid/content/Context;)V

    :cond_2
    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->s0()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->q0()V

    return-void
.end method

.method public static final M(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 3

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->W1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v0

    invoke-virtual {v0}, Ldj/h;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ldj/b;->f()Ldj/b;

    move-result-object v0

    sget-object v1, Ldj/b$d;->b:Ldj/b$d;

    invoke-virtual {v0, v1}, Ldj/b;->o(Ldj/b$d;)V

    invoke-static {}, Ldl/j;->e()Ldl/j;

    move-result-object v0

    invoke-static {}, Lbh/a1;->O()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lbh/a1;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ldl/j;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v0

    invoke-virtual {v0}, Ldj/h;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Ldj/b;->f()Ldj/b;

    move-result-object v0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    sget-object v1, Ldj/b$d;->b:Ldj/b$d;

    invoke-virtual {v0, p0, v1}, Ldj/b;->i(Landroid/app/Activity;Ldj/b$d;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p0

    invoke-interface {p0}, Lbi/i;->D3()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p0

    invoke-interface {p0}, Lbi/i;->C3()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->screenTimeStop()V

    :cond_1
    return-void
.end method

.method public static final N(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p0}, Lik/k0;->s(Landroid/content/Context;)Lik/k0;

    move-result-object p0

    invoke-virtual {p0, p1}, Lik/k0;->I(Ljava/lang/String;)V

    return-void
.end method

.method public static final O(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    invoke-static {}, Ldj/b;->f()Ldj/b;

    move-result-object v0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, p0}, Ldj/b;->j(Landroid/app/Activity;)V

    return-void
.end method

.method public static final P(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->l0()V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->D3()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->v0()V

    :cond_0
    return-void
.end method

.method public static final Q(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->I()V

    invoke-static {}, Lvm/b;->h()Lvm/b;

    move-result-object v0

    invoke-virtual {v0}, Lvm/b;->e()V

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->d()Ldj/d;

    move-result-object v0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, p0}, Ldj/d;->c(Landroid/content/Context;)V

    invoke-static {}, Ltl/a;->b()Ltl/a;

    move-result-object p0

    invoke-virtual {p0}, Ltl/a;->e()V

    return-void
.end method

.method public static final R(ZLcom/roblox/client/startup/NativeHelper;D)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lcom/roblox/client/startup/NativeHelper;->I()V

    :cond_0
    invoke-static {}, Lvm/b;->h()Lvm/b;

    move-result-object p0

    invoke-virtual {p0}, Lvm/b;->f()V

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object p0

    invoke-virtual {p0}, Lbh/y;->d()Ldj/d;

    move-result-object p0

    iget-object v0, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    double-to-long p2, p2

    invoke-virtual {p0, v0, p2, p3}, Ldj/d;->e(Landroid/content/Context;J)V

    iget-boolean p0, p1, Lcom/roblox/client/startup/NativeHelper;->h:Z

    if-eqz p0, :cond_1

    invoke-static {}, Ltl/a;->b()Ltl/a;

    move-result-object p0

    iget-object p1, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0, p1}, Ltl/a;->d(Landroid/app/Activity;)V

    :cond_1
    return-void
.end method

.method public static final S(Landroid/content/Context;Lcom/roblox/client/startup/NativeHelper;)V
    .locals 6

    invoke-static {p0}, Lik/t2;->a(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeSetAppPreviousExitReasons(Ljava/util/List;)V

    invoke-static {}, Leh/f;->h()Leh/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Leh/f;->i(Landroid/content/Context;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->L2()Z

    move-result v0

    const/4 v1, 0x2

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    const-string v5, "fmod_init_begin"

    invoke-static {v5, v2, v3, v1, v4}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    :cond_0
    iget-object v5, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {v5}, Lorg/fmod/FMOD;->init(Landroid/content/Context;)V

    if-eqz v0, :cond_1

    const-string v0, "fmod_init_end"

    invoke-static {v0, v2, v3, v1, v4}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    :cond_1
    invoke-static {}, Lbh/a1;->V0()V

    iget-object v0, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {v0}, Lok/z;->e(Landroid/content/Context;)Lok/z;

    move-result-object v0

    invoke-virtual {v0}, Lok/z;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetPreferencesFile(Ljava/lang/String;)V

    invoke-static {}, Lyi/b;->f()Lyi/b;

    move-result-object v0

    iget-object v1, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, v1}, Lyi/b;->m(Landroid/content/Context;)V

    invoke-static {p0}, Lik/k0;->w(Landroid/content/Context;)V

    iget-object v0, p1, Lcom/roblox/client/startup/NativeHelper;->m:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    if-nez v0, :cond_3

    new-instance v0, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    invoke-direct {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;-><init>()V

    invoke-virtual {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->c()V

    iget-boolean v1, p1, Lcom/roblox/client/startup/NativeHelper;->g:Z

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->b()V

    :cond_2
    iput-object v0, p1, Lcom/roblox/client/startup/NativeHelper;->m:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    :cond_3
    iget-object v0, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Lcom/roblox/client/startup/MainGameActivity;->k2()V

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v0

    invoke-virtual {v0}, Lym/g;->w()V

    invoke-static {}, Lfm/j;->j()Lfm/j;

    move-result-object v0

    invoke-virtual {v0}, Lfm/j;->f()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0, p0}, Lfm/j;->i(Landroid/content/Context;)V

    :cond_4
    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->d()Ldj/d;

    move-result-object v0

    iget-object v1, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, v1}, Ldj/d;->a(Landroid/content/Context;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->w2()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object p1, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1, v4}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    :cond_5
    invoke-static {v4}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetExternalDirectory(Ljava/lang/String;)V

    :cond_6
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->W5()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p0}, Lli/i;->m(Landroid/content/Context;)V

    :cond_7
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->Y4()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {p0}, Lwh/c;->c(Landroid/content/Context;)V

    :cond_8
    return-void
.end method

.method public static final T(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->I()V

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->r2()V

    :cond_0
    invoke-static {}, Lcom/roblox/client/startup/a;->n()V

    return-void
.end method

.method public static final U(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Le/p;->reportFullyDrawn()V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->W5()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v0

    sget-object v1, Lli/i;->a:Lli/i;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->d(Landroidx/lifecycle/r;)V

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p0}, Lli/i;->o(Lf4/v;)V

    :cond_0
    return-void
.end method

.method public static final V(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p0}, Lli/i;->p(Lf4/v;)V

    return-void
.end method

.method public static final W(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->f:Lei/x0;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lei/x0;->d(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static final X(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->f:Lei/x0;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lei/x0;->c()V

    :cond_0
    return-void
.end method

.method public static final Y(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->e:Luk/f;

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Luk/f;->H(Z)V

    :cond_0
    return-void
.end method

.method public static final Z(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lcom/roblox/client/startup/NativeHelper;->g0()V

    return-void
.end method

.method public static final a0(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    iget p0, p0, Lcom/roblox/client/startup/NativeHelper;->n:I

    invoke-static {v0, p0}, Lzj/f;->f(Lf4/v;I)V

    return-void
.end method

.method public static synthetic b(ILcom/roblox/client/startup/NativeHelper;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/roblox/client/startup/NativeHelper;->c0(ILcom/roblox/client/startup/NativeHelper;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final b0(Lcom/roblox/client/startup/NativeHelper;I)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method public static synthetic c(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->N(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    return-void
.end method

.method public static final c0(ILcom/roblox/client/startup/NativeHelper;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-static {}, Ldj/g;->b()Ldj/g;

    move-result-object p0

    const-string p2, "Android-AppLogin-BrowserTracker-Failed"

    invoke-virtual {p0, p2}, Ldj/g;->q(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roblox/client/startup/NativeHelper;->i0()V

    return-void

    :cond_0
    new-instance p0, Lcom/roblox/client/d$e;

    invoke-direct {p0}, Lcom/roblox/client/d$e;-><init>()V

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/d$e;->f()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/roblox/client/d$e;->e()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/roblox/client/d$e;->d()V

    :goto_0
    iput-object p3, p0, Lcom/roblox/client/d$e;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/client/d$e;->c:Ljava/lang/String;

    invoke-static {}, Ldj/g;->b()Ldj/g;

    move-result-object p2

    const-string p3, "Android-AppLogin-BrowserTracker-Success"

    invoke-virtual {p2, p3}, Ldj/g;->q(Ljava/lang/String;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->D3()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    const-string p3, "appLaunch"

    invoke-static {p2, p3}, Lbh/t0;->b(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p2, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2}, Lcom/roblox/client/startup/MainGameActivity;->x2()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p1, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    const-string p2, "protocolLaunch"

    invoke-static {p1, p2}, Lbh/t0;->b(Landroid/content/Context;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p0}, Lcom/roblox/client/d$e;->b()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p0}, Lcom/roblox/client/d$e;->c()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    return-void

    :cond_5
    :goto_1
    invoke-static {}, Lcom/roblox/client/d;->e()Lcom/roblox/client/d;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/roblox/client/d;->g(Lcom/roblox/client/d$e;)V

    return-void
.end method

.method public static synthetic d(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->M(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static final d0([BLcom/roblox/client/startup/NativeHelper;JZLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 2

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "UTF_8"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    move-wide p1, p2

    move p3, p4

    new-instance p4, Ljava/lang/String;

    invoke-direct {p4, p0, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iget-object p0, v1, Lcom/roblox/client/startup/NativeHelper;->f:Lei/x0;

    if-eqz p0, :cond_0

    invoke-interface/range {p0 .. p5}, Lei/x0;->b(JZLjava/lang/String;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    :cond_0
    return-void
.end method

.method public static synthetic e(Lcom/roblox/client/startup/NativeHelper;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->b0(Lcom/roblox/client/startup/NativeHelper;I)V

    return-void
.end method

.method public static final e0(Lcom/roblox/client/startup/NativeHelper;Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 5

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStateChanged: event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/client/startup/NativeHelper$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0

    :pswitch_0
    const-string p1, "Disposing RTC audio manager."

    invoke-static {v1, p1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->l:Lih/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lih/a;->a()V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->l:Lih/a;

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setWebviewUserAgentGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;)V

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setMobileAdvertisingIdGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;)V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->c:Lch/a;

    invoke-virtual {p1}, Lch/a;->e()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->x0()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->w0()V

    return-void

    :pswitch_1
    iput-boolean v3, p0, Lcom/roblox/client/startup/NativeHelper;->g:Z

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->D3()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->F5()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    if-nez p1, :cond_1

    invoke-static {v2}, Lcom/roblox/engine/jni/NativeReportingInterface;->setAppSuspended(Z)V

    :cond_1
    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lmw/c;->p(Ljava/lang/Object;)V

    invoke-static {}, Lcn/a;->c()Lcn/a;

    move-result-object p1

    invoke-virtual {p1}, Lcn/a;->b()V

    invoke-static {}, Ldj/e;->c()Ldj/e;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->s:Ldj/e$e;

    invoke-virtual {p1, v0}, Ldj/e;->g(Ldj/e$e;)V

    sget-object p1, Lcom/roblox/client/startup/NativeHelper;->v:Lcom/roblox/client/startup/NativeHelper$a;

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p1, v0, p2}, Lcom/roblox/client/startup/NativeHelper$a;->a(Lcom/roblox/client/startup/NativeHelper$a;Landroid/app/Activity;Landroidx/lifecycle/l$a;)V

    invoke-static {}, Ldl/h;->j()Ldl/h;

    move-result-object p1

    sget-object p2, Lcom/roblox/client/startup/NativeHelper;->w:Ldl/h$d;

    invoke-virtual {p1, p2}, Ldl/h;->m(Ldl/h$d;)V

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->m:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->a()V

    :cond_2
    invoke-static {}, Lvm/b;->h()Lvm/b;

    move-result-object p0

    invoke-virtual {p0}, Lvm/b;->f()V

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p0

    invoke-virtual {p0}, Lym/g;->I()V

    return-void

    :pswitch_2
    iput-boolean v3, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->e:Luk/f;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Luk/f;->I()V

    :cond_3
    invoke-static {}, Ltl/a;->b()Ltl/a;

    move-result-object p1

    invoke-virtual {p1}, Ltl/a;->e()V

    invoke-static {}, Lmm/c;->i()Lmm/c;

    move-result-object p1

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1, p0}, Lmm/c;->k(Landroid/content/Context;)V

    invoke-static {}, Lsm/a;->k()Lsm/a;

    move-result-object p0

    invoke-virtual {p0}, Lsm/a;->m()V

    return-void

    :pswitch_3
    iput-boolean v2, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->I()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->q0()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->l0()V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->e:Luk/f;

    if-eqz p1, :cond_4

    invoke-virtual {p1, v3}, Luk/f;->H(Z)V

    :cond_4
    sget-object p1, Lcom/roblox/client/startup/NativeHelper;->v:Lcom/roblox/client/startup/NativeHelper$a;

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p1, v0, p2}, Lcom/roblox/client/startup/NativeHelper$a;->a(Lcom/roblox/client/startup/NativeHelper$a;Landroid/app/Activity;Landroidx/lifecycle/l$a;)V

    invoke-static {}, Lmm/c;->i()Lmm/c;

    move-result-object p1

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1, p2}, Lmm/c;->j(Landroid/content/Context;)V

    invoke-static {}, Lsm/a;->k()Lsm/a;

    move-result-object p1

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v0, Landroid/content/Intent;

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    const-class v1, Lcom/roblox/client/ShareAppChosenReceiver;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p0, Lik/i2;

    invoke-direct {p0}, Lik/i2;-><init>()V

    const/16 v1, 0x4e9c

    invoke-virtual {p1, p2, v0, v1, p0}, Lsm/a;->l(Lj/b;Landroid/content/Intent;ILsm/a$g;)V

    return-void

    :pswitch_4
    iput-boolean v2, p0, Lcom/roblox/client/startup/NativeHelper;->g:Z

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->D3()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->F5()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {v3}, Lcom/roblox/engine/jni/NativeReportingInterface;->setAppSuspended(Z)V

    :cond_5
    invoke-static {}, Lcn/a;->c()Lcn/a;

    move-result-object p1

    invoke-virtual {p1}, Lcn/a;->a()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->s0()V

    invoke-static {}, Ldl/h;->j()Ldl/h;

    move-result-object p1

    sget-object p2, Lcom/roblox/client/startup/NativeHelper;->w:Ldl/h$d;

    invoke-virtual {p1, p2}, Ldl/h;->k(Ldl/h$d;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->W1()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, Ldl/e;->o()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, Ldl/h;->j()Ldl/h;

    move-result-object p1

    invoke-static {}, Lbh/a1;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ldl/h;->n(Ljava/lang/String;)V

    :cond_6
    invoke-static {}, Ldj/g;->b()Ldj/g;

    move-result-object p1

    invoke-virtual {p1}, Ldj/g;->i0()V

    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lmw/c;->n(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->m:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->b()V

    :cond_7
    invoke-static {}, Lvm/b;->h()Lvm/b;

    move-result-object p1

    invoke-virtual {p1}, Lvm/b;->e()V

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1, p0}, Lym/g;->H(Landroid/content/Context;)V

    return-void

    :pswitch_5
    invoke-static {}, Lyi/b;->f()Lyi/b;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2, v0}, Lyi/b;->u(Landroid/content/Context;)V

    new-instance p2, Lvi/a;

    invoke-direct {p2}, Lvi/a;-><init>()V

    invoke-static {p2}, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->setImplementation(Lxk/a;)V

    invoke-static {}, Ldj/e;->c()Ldj/e;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2, v0}, Ldj/e;->d(Landroid/content/Context;)V

    const-string p2, "Initializing RTC audio manager."

    invoke-static {v1, p2}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, v0}, Lbh/y;->c(Landroid/content/Context;)Lih/a;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-interface {p2, v0}, Lih/a;->b(Lj/b;)V

    iput-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->l:Lih/a;

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->Y3()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-static {}, Ldj/b;->m()Z

    move-result p2

    if-nez p2, :cond_8

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p2

    const/16 v0, 0x2000

    invoke-virtual {p2, v0}, Landroid/view/Window;->addFlags(I)V

    :cond_8
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->W5()Z

    move-result p2

    if-eqz p2, :cond_9

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p2

    sget-object v0, Lli/i;->a:Lli/i;

    invoke-virtual {p2, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_9
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->x5()Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->t2()Z

    move-result p2

    if-eqz p2, :cond_a

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p2

    sget-object v0, Lsl/g;->a:Lsl/g;

    invoke-virtual {p2, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    goto :goto_0

    :cond_a
    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p2

    sget-object v0, Lsl/d;->a:Lsl/d;

    invoke-virtual {p2, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_b
    :goto_0
    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->o()Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2, v0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->l(Le/p;)V

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object p2

    invoke-virtual {p2}, Lbh/y;->g()Lwm/f;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2, v0}, Lwm/f;->n(Le/p;)V

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->t:Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;

    invoke-static {p2}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setWebviewUserAgentGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;)V

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->u:Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;

    invoke-static {p2}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setMobileAdvertisingIdGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;)V

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p2

    invoke-virtual {p2}, Lnk/c;->m()V

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->c:Lch/a;

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2, v0}, Lch/a;->d(Lj/b;)V

    invoke-static {}, Lai/k;->a()Z

    move-result p2

    if-eqz p2, :cond_c

    new-instance p2, Lkotlin/Pair;

    new-instance v0, Lai/a;

    const/4 v2, 0x3

    const-wide/16 v3, 0x7d0

    invoke-direct {v0, v2, v3, v4}, Lai/a;-><init>(IJ)V

    const-string v2, "webrtcsdk"

    invoke-direct {p2, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lkotlin/collections/j0;->g(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p2}, Lai/h;->r(Ljava/util/Map;)V

    const-string p2, "Requesting WebRTC SDK module download immediately."

    invoke-static {v1, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v2}, Lai/h;->m(Ljava/lang/String;)V

    :cond_c
    invoke-static {}, Lok/v;->b()Z

    move-result p2

    if-eqz p2, :cond_d

    sget-object p2, Lai/h;->a:Lai/h;

    invoke-static {p2, v1}, Lok/v;->a(Lai/h;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object p2, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->INSTANCE:Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_d
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->a3()Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object p2, Lei/v0;->a:Lei/v0;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_e
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->R()Z

    move-result p1

    if-nez p1, :cond_f

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->i5()Z

    move-result p1

    if-eqz p1, :cond_10

    :cond_f
    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object p2, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->INSTANCE:Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_10
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->n1()Z

    move-result p1

    if-eqz p1, :cond_11

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object p2, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->INSTANCE:Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_11
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->D3()Z

    move-result p1

    if-eqz p1, :cond_12

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    invoke-static {}, Lwl/b;->a()Landroidx/lifecycle/f;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->t0()V

    :cond_12
    :pswitch_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_6
    .end packed-switch
.end method

.method public static synthetic f(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->L(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    return-void
.end method

.method public static final f0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lhk/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic g(Lcom/roblox/client/startup/NativeHelper;Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/roblox/client/startup/NativeHelper;->e0(Lcom/roblox/client/startup/NativeHelper;Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V

    return-void
.end method

.method public static final g0()V
    .locals 1

    invoke-static {}, Lok/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->setMobileAdvertisingId(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic h(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->Y(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static final h0(ILandroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x2

    const-string v1, "NativeHelper"

    if-eq p0, v0, :cond_1

    const/16 p1, 0x65

    if-eq p0, p1, :cond_0

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Unhandled notificationId"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    const-string p0, "handleNotification: Start PlaceID event..."

    invoke-static {v1, p0}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Error: Notification \'Start PlaceID\' still needs to be handled."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Ldj/b;->g(Landroid/os/Bundle;)Ldj/b$d;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "handleNotification: Logout event. type = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->D3()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Ldj/b$d;->b:Ldj/b$d;

    if-eq p0, p1, :cond_2

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2UserDidLogout()V

    const-string p0, "NativeShellEvent"

    const-string p1, "NETWORK_ERROR_401"

    invoke-static {p0, p1}, Lcom/roblox/engine/jni/memstorage/MemStorage;->fire(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static synthetic i()V
    .locals 0

    invoke-static {}, Lcom/roblox/client/startup/NativeHelper;->m0()V

    return-void
.end method

.method public static synthetic j(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->W(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    return-void
.end method

.method public static final j0(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 2

    invoke-static {}, Leh/f;->h()Leh/f;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Leh/f;->i(Landroid/content/Context;)V

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->I()V

    return-void
.end method

.method public static synthetic k(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->K(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic l(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->n0(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic m(ZLcom/roblox/client/startup/NativeHelper;D)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/roblox/client/startup/NativeHelper;->R(ZLcom/roblox/client/startup/NativeHelper;D)V

    return-void
.end method

.method public static final m0()V
    .locals 2

    const-string v0, "NativeHelper"

    const-string v1, "Requesting permissions for MediaPickerProtocol"

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->k()Lbn/k;

    move-result-object v0

    sget-object v1, Lbn/o;->h:Lbn/o;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbn/k;->O([Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic n(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->j0(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static final n0(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 1

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v0, Lik/h2;

    invoke-direct {v0, p1}, Lik/h2;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic o(ILandroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->h0(ILandroid/os/Bundle;)V

    return-void
.end method

.method public static final o0(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcm/a;->b:Lcm/a$a;

    invoke-virtual {v0, p0}, Lcm/a$a;->a(Ljava/lang/String;)Lcm/a;

    move-result-object p0

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnk/c;->u(Lcm/a;)V

    return-void
.end method

.method public static synthetic p(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->J(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static final p0(Lcom/roblox/client/startup/NativeHelper;Z)V
    .locals 1

    sget-object v0, Lxi/c;->a:Lxi/c;

    invoke-virtual {v0, p1}, Lxi/c;->j(Z)V

    sget-object v0, Lxi/b;->a:Lxi/b;

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, p0, p1}, Lxi/b;->b(Landroid/app/Activity;Z)V

    return-void
.end method

.method public static synthetic q(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->o0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic r(Lcom/roblox/client/startup/NativeHelper;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->p0(Lcom/roblox/client/startup/NativeHelper;Z)V

    return-void
.end method

.method public static synthetic s([BLcom/roblox/client/startup/NativeHelper;JZLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/roblox/client/startup/NativeHelper;->d0([BLcom/roblox/client/startup/NativeHelper;JZLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    return-void
.end method

.method public static synthetic t(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->U(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic u(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->Z(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static final u0()V
    .locals 2

    const-string v0, "NativeHelper"

    const-string v1, "(callback) onCookieChanged: Update cookies (from web) => engine."

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->W1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lbh/a1;->C0()V

    :cond_0
    invoke-static {}, Lbh/a1;->T0()V

    return-void
.end method

.method public static synthetic v(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->P(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic w(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->V(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic x(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->y0(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic y(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->a0(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static final y0(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->m2()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p0}, Lik/u2;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLInterface;->setWebviewUserAgent(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p0}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLInterface;->setWebviewUserAgent(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic z(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->Q(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method


# virtual methods
.method public final I()V
    .locals 6

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {}, Lbh/a1;->l0()Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    move v2, v3

    :cond_1
    iget-boolean v1, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    iget-boolean v3, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "adjustWindowInsets: isForeground="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isInExperience="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isLandscape="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", shouldHideInLandscape="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    const-string v1, "getWindow(...)"

    if-nez v0, :cond_3

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lbh/c2;->c(Landroid/view/Window;)V

    return-void

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lbh/c2;->b(Landroid/view/Window;)V

    return-void
.end method

.method public final gameActivity_getShellFlagKeys()[Ljava/lang/String;
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/g;->b4()Ljava/util/Set;

    move-result-object v0

    const-string v1, "getEntrySet(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

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

    invoke-static {v3, v2}, Lwh/a;->d(Ljava/lang/String;Lcom/roblox/client/flags/a;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public final gameActivity_hideKeyboard()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/y1;

    invoke-direct {v1, p0}, Lik/y1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onAppReady(Ljava/lang/String;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gameActivity_onAppReady: data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/q1;

    invoke-direct {v1, p0}, Lik/q1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    const-string v0, "Push"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object p1

    invoke-virtual {p1}, Lbh/y;->k()Lbn/k;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lbn/k;->Q(Landroid/content/Context;)V

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->m2()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->d:Lav/l0;

    invoke-static {p1}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object v0

    new-instance v3, Lcom/roblox/client/startup/NativeHelper$c;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/roblox/client/startup/NativeHelper$c;-><init>(Lcom/roblox/client/startup/NativeHelper;Leu/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    :cond_1
    return-void
.end method

.method public final gameActivity_onDidLogInReceived(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gameActivity_onDidLogInReceived: data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/u1;

    invoke-direct {v1, p0, p1}, Lik/u1;-><init>(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onDidLogOutReceived()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onDidLogOutReceived:"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/x1;

    invoke-direct {v1, p0}, Lik/x1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onDidSignUp(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gameActivity_onDidSignUp: data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/r1;

    invoke-direct {v1, p0, p1}, Lik/r1;-><init>(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onDidSwitchAccountReceived()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onDidSwitchAccountReceived:"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/m1;

    invoke-direct {v1, p0}, Lik/m1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onEngineInitialized()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onEngineInitialized:"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->i:Z

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->k:Z

    const-string v1, "getApplicationContext(...)"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->setup(Landroid/content/Context;)V

    :cond_0
    invoke-static {}, Lcom/roblox/protocols/calling/CallingHandler;->isCallingEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roblox/protocols/calling/CallingHandler;->setup(Landroid/content/Context;)V

    :cond_1
    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/l1;

    invoke-direct {v1, p0}, Lik/l1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onExperienceStart()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onExperienceStart:"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    sget-object v1, Lgj/a;->a:Lgj/a;

    invoke-virtual {v1, v0}, Lgj/a;->b(Z)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/k2;

    invoke-direct {v1, p0}, Lik/k2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onExperienceStop(D)V
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onExperienceStop:"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->D3()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    sget-object v2, Lgj/a;->a:Lgj/a;

    invoke-virtual {v2, v1}, Lgj/a;->b(Z)V

    :cond_0
    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v2, Lik/w1;

    invoke-direct {v2, v0, p0, p1, p2}, Lik/w1;-><init>(ZLcom/roblox/client/startup/NativeHelper;D)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onFlagsFailed()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onFlagsFailed:"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->i0()V

    return-void
.end method

.method public final gameActivity_onFlagsLoaded(Ljava/nio/ByteBuffer;)V
    .locals 5
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "flagsBuffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "gameActivity_onFlagsLoaded: size = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roblox/client/startup/a;->F(Ljava/lang/String;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/roblox/client/startup/a;->B(Landroid/content/Context;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->q3()Z

    move-result p1

    iput-boolean p1, p0, Lcom/roblox/client/startup/NativeHelper;->k:Z

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->D3()Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt p1, v1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    const-class v1, Landroid/os/PowerManager;

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/os/PowerManager;->getCurrentThermalStatus()I

    move-result p1

    int-to-long v1, p1

    const-wide/16 v3, 0x3e8

    add-long/2addr v1, v3

    const-string p1, "android_thermal_throttling"

    invoke-static {p1, v1, v2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->h(Ljava/lang/String;J)V

    :cond_0
    iget-boolean p1, p0, Lcom/roblox/client/startup/NativeHelper;->k:Z

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeAppBridgeInterface;->setEnableConnectivityV2ForAndroid(Z)V

    invoke-static {v0}, Lcom/roblox/client/startup/a;->g(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/o1;

    invoke-direct {v1, v0, p0}, Lik/o1;-><init>(Landroid/content/Context;Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {p1, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onGameLoaded(J)V
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gameActivity_onGameLoaded: placeId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    sget-object p2, Lgj/a;->a:Lgj/a;

    invoke-virtual {p2, p1}, Lgj/a;->b(Z)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->t4()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    const/4 p2, 0x0

    const-string v2, "native_experience_start"

    invoke-static {v2, v0, v1, p1, p2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance p2, Lik/k1;

    invoke-direct {p2, p0}, Lik/k1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onGameStreamingStatusChanged(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->X1()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    sget-object v0, Lzt/n;->b:Lzt/n$a;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "inGameStreaming"

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p1}, Lei/q0;->f(Landroid/app/Activity;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p1}, Lei/q0;->i(Landroid/app/Activity;)V

    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    sget-object v0, Lzt/n;->b:Lzt/n$a;

    invoke-static {p1}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    invoke-static {p1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse GAME_STREAMING_STATUS_CHANGED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "NativeHelper"

    invoke-static {v0, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method

.method public final gameActivity_onHomePageInteractive()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onHomePageInteractive:"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->D3()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/v1;

    invoke-direct {v1, p0}, Lik/v1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    invoke-static {}, Lcom/roblox/client/startup/a;->n()V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->v1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/roblox/client/startup/FlagCacheUtils;->flushRetryDialogTelemetry()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final gameActivity_onHomePageLoaded()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onHomePageLoaded:"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->D3()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->l2()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Leh/k;->q()Leh/k;

    move-result-object v0

    const-string v1, "luaHomeScreen"

    invoke-virtual {v0, v1}, Leh/k;->k(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roblox/client/startup/FlagCacheUtils;->flushPendingVersionBWrite(Landroid/content/Context;)V

    invoke-static {}, Lcom/roblox/client/startup/FlagCacheUtils;->flushPendingVersionBTelemetry()V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->c1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lai/b;->c()V

    :cond_2
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->W5()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/g2;

    invoke-direct {v1, p0}, Lik/g2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final gameActivity_onLuaAppDidReturn()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onLuaAppDidReturn:"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Lcom/roblox/client/startup/MainGameActivity;->requestOrientationAsDefault()V

    return-void
.end method

.method public final gameActivity_onLuaTextBoxChanged(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/o2;

    invoke-direct {v1, p0, p1}, Lik/o2;-><init>(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onLuaTextBoxPropertyChanged()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/j2;

    invoke-direct {v1, p0}, Lik/j2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onMotionEventListening(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "motionType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v0, Lik/n1;

    invoke-direct {v0, p0}, Lik/n1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onRestartLuaApp()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/t1;

    invoke-direct {v1, p0}, Lik/t1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onScanQrCode()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/p1;

    invoke-direct {v1, p0}, Lik/p1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onScreenOrientationChanged(IZ)V
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    if-nez p2, :cond_0

    const-string p1, "gameActivity_onScreenOrientationChanged: (In-App) request the default Orientation."

    invoke-static {v0, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1}, Lcom/roblox/client/startup/MainGameActivity;->requestOrientationAsDefault()V

    return-void

    :cond_0
    sget-object p2, Lcom/roblox/client/startup/NativeHelper;->v:Lcom/roblox/client/startup/NativeHelper$a;

    invoke-static {p2, p1}, Lcom/roblox/client/startup/NativeHelper$a;->b(Lcom/roblox/client/startup/NativeHelper$a;I)I

    move-result p2

    const/4 v1, -0x1

    if-eq p2, v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "gameActivity_onScreenOrientationChanged: orientation:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " => "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v0, Lik/m2;

    invoke-direct {v0, p0, p2}, Lik/m2;-><init>(Lcom/roblox/client/startup/NativeHelper;I)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final gameActivity_onScreenshotReady(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->d:Lav/l0;

    invoke-static {v0}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object v1

    new-instance v4, Lcom/roblox/client/startup/NativeHelper$d;

    const/4 v0, 0x0

    invoke-direct {v4, p1, v0}, Lcom/roblox/client/startup/NativeHelper$d;-><init>(Ljava/lang/String;Leu/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    return-void
.end method

.method public final gameActivity_setAppUpgradeStatus(IILjava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "apkUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apkCheckSum"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/s1;

    move-object v3, p0

    move v2, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lik/s1;-><init>(ILcom/roblox/client/startup/NativeHelper;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_setBrowserTrackerId(J)V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_setBrowserTrackerId:"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->D3()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sput-wide p1, Lbh/a1;->u:J

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->W5()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1, p2}, Lli/i;->n(Landroid/content/Context;J)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final gameActivity_showKeyboard(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 8
    .param p4    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/roblox/engine/jni/model/NativeTextBoxInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "byteArrayFromTextBox"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textBoxInfo"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/p2;

    move-object v3, p0

    move-wide v4, p1

    move v6, p3

    move-object v2, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lik/p2;-><init>([BLcom/roblox/client/startup/NativeHelper;JZLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i0()V
    .locals 5

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "init_failure"

    const-wide/16 v3, 0x0

    invoke-static {v2, v3, v4, v0, v1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lik/l2;

    invoke-direct {v1, p0}, Lik/l2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final k0()V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->I()V

    return-void
.end method

.method public final l0()V
    .locals 4

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    iget-boolean v1, p0, Lcom/roblox/client/startup/NativeHelper;->i:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onForegroundOrEngineInitialized: isForeground = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isEngineInitialized = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->i:Z

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->o()Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v2, Lik/d2;

    invoke-direct {v2}, Lik/d2;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->m(Le/p;Lzl/f;)V

    invoke-static {}, Ltl/a;->b()Ltl/a;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, v1}, Ltl/a;->d(Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v0

    sget-object v1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    new-instance v0, Lik/e2;

    invoke-direct {v0, p0}, Lik/e2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v1, v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->O(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->f5()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lxi/m;->a:Lxi/m;

    new-instance v2, Lcom/roblox/client/startup/NativeHelper$e;

    invoke-direct {v2, v0}, Lcom/roblox/client/startup/NativeHelper$e;-><init>(Lxi/m;)V

    invoke-virtual {v1, v2}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->H(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->Y0()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lik/f2;

    invoke-direct {v0, p0}, Lik/f2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v1, v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->K(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;)V

    :cond_1
    :goto_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->m3()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v0

    sget-object v1, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->a:Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_2
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->a1()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v0

    sget-object v1, Lcom/roblox/client/shortcuts/PinShortcutHandler;->INSTANCE:Lcom/roblox/client/shortcuts/PinShortcutHandler;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_3
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->N5()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v0

    sget-object v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->INSTANCE:Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_4
    return-void
.end method

.method public final onCodeParsedFromSMS(Lyh/j;)V
    .locals 2
    .param p1    # Lyh/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation runtime Lmw/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SMS code received."

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Calling IdentityProtocol to parse OTP."

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->g()Lwm/f;

    move-result-object v0

    iget-object p1, p1, Lyh/j;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lwm/f;->o(Ljava/lang/String;)V

    return-void
.end method

.method public final q0()V
    .locals 4

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v1

    invoke-virtual {v1}, Ldj/h;->f()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onForegroundOrLogin: isForeground = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isLoggedIn = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roblox/client/d;->e()Lcom/roblox/client/d;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/startup/NativeHelper$f;

    invoke-direct {v1, p0}, Lcom/roblox/client/startup/NativeHelper$f;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Lcom/roblox/client/d;->b(Lcom/roblox/client/d$d;)V

    :cond_0
    return-void
.end method

.method public final r0(ILandroid/view/SurfaceView;Lcom/roblox/client/RbxKeyboard;Luk/f$f;)V
    .locals 1
    .param p2    # Landroid/view/SurfaceView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/roblox/client/RbxKeyboard;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Luk/f$f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "surfaceView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rbxEditText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inputAdapter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput p1, p0, Lcom/roblox/client/startup/NativeHelper;->n:I

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->e:Luk/f;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Luk/f;->I()V

    :cond_0
    new-instance p1, Luk/f;

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-direct {p1, v0, p2, p4}, Luk/f;-><init>(Landroid/app/Activity;Landroid/view/SurfaceView;Luk/f$f;)V

    iput-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->e:Luk/f;

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    new-instance p1, Lei/r0;

    invoke-direct {p1, p3}, Lei/r0;-><init>(Lcom/roblox/client/RbxKeyboard;)V

    iput-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->f:Lei/x0;

    return-void
.end method

.method public final s0()V
    .locals 4

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->g:Z

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v1

    invoke-virtual {v1}, Ldj/h;->f()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onVisibleOrLogin: isVisible = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isLoggedIn = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->g:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v0

    invoke-virtual {v0}, Ldj/h;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ldj/e;->c()Ldj/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->s:Ldj/e$e;

    invoke-virtual {v0, v1}, Ldj/e;->b(Ldj/e$e;)V

    :cond_0
    return-void
.end method

.method public final t0()V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    const-class v1, Landroid/hardware/display/DisplayManager;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/display/DisplayManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/roblox/client/startup/NativeHelper$g;

    invoke-direct {v1, v0}, Lcom/roblox/client/startup/NativeHelper$g;-><init>(Landroid/hardware/display/DisplayManager;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    iput-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->q:Landroid/hardware/display/DisplayManager$DisplayListener;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-static {v0}, Lcom/roblox/platform/util/DeviceUtils;->getCurrentRefreshRate(Landroid/view/Display;)F

    move-result v1

    invoke-static {v1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativePassCurrentDisplayRefreshRate(F)V

    invoke-static {v0}, Lcom/roblox/platform/util/DeviceUtils;->getSupportedRefreshRates(Landroid/view/Display;)[F

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativePassSupportedRefreshRates([F)V

    return-void
.end method

.method public final v0()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->o:Lei/i;

    if-nez v0, :cond_1

    new-instance v0, Lei/i;

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lei/i;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lei/i;->o()V

    iput-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->o:Lei/i;

    :cond_1
    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->p:Lei/a1;

    if-nez v0, :cond_2

    new-instance v0, Lei/a1;

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lei/a1;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lei/a1;->a()V

    iput-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->p:Lei/a1;

    :cond_2
    :goto_0
    return-void
.end method

.method public final w0()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->o:Lei/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lei/i;->q()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->o:Lei/i;

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->p:Lei/a1;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lei/a1;->b()V

    :cond_1
    iput-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->p:Lei/a1;

    return-void
.end method

.method public final x0()V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->q:Landroid/hardware/display/DisplayManager$DisplayListener;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    const-class v2, Landroid/hardware/display/DisplayManager;

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/display/DisplayManager;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroid/hardware/display/DisplayManager;->unregisterDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->q:Landroid/hardware/display/DisplayManager$DisplayListener;

    return-void
.end method
