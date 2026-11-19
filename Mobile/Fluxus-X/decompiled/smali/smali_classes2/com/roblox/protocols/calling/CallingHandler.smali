.class public final Lcom/roblox/protocols/calling/CallingHandler;
.super Lcom/roblox/protocols/callingplatforminterface/generated/IPlatformCalling;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/calling/CallingHandler$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ+\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u000bJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u0014J\u001d\u0010 \u001a\u00020\t2\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\t0\u001eH\u0002\u00a2\u0006\u0004\u0008 \u0010!J:\u0010+\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\"2\u001e\u0010(\u001a\u001a\u0008\u0001\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010&0%\u0012\u0006\u0012\u0004\u0018\u00010\'0$H\u0081@\u00a2\u0006\u0004\u0008)\u0010*J\u001f\u00100\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u0017\u00103\u001a\u00020\t2\u0006\u00102\u001a\u000201H\u0016\u00a2\u0006\u0004\u00083\u00104J\u0017\u00105\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u00085\u0010\u0016J!\u00109\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\r2\u0008\u00106\u001a\u0004\u0018\u00010&H\u0001\u00a2\u0006\u0004\u00087\u00108J\u0017\u0010;\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\rH\u0000\u00a2\u0006\u0004\u0008:\u0010\u0016J\u0017\u0010=\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\rH\u0000\u00a2\u0006\u0004\u0008<\u0010\u0016J\u000f\u0010?\u001a\u00020\tH\u0001\u00a2\u0006\u0004\u0008>\u0010\u0003R\u0014\u0010@\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010B\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008B\u0010AR\u001a\u0010D\u001a\u00020C8\u0000X\u0081T\u00a2\u0006\u000c\n\u0004\u0008D\u0010E\u0012\u0004\u0008F\u0010\u0003R\u0018\u0010G\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u001b\u0010P\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008L\u0010M\u001a\u0004\u0008N\u0010OR\u001b\u0010S\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008Q\u0010M\u001a\u0004\u0008R\u0010OR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR6\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010I0$8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008W\u0010X\u0012\u0004\u0008]\u0010\u0003\u001a\u0004\u0008Y\u0010Z\"\u0004\u0008[\u0010\\RN\u0010_\u001a(\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020C\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\t0$\u0012\u0004\u0012\u00020\t0^8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008_\u0010`\u0012\u0004\u0008e\u0010\u0003\u001a\u0004\u0008a\u0010b\"\u0004\u0008c\u0010dR.\u0010f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001e8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008f\u0010g\u0012\u0004\u0008k\u0010\u0003\u001a\u0004\u0008h\u0010i\"\u0004\u0008j\u0010!R\"\u0010l\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008l\u0010m\u001a\u0004\u0008n\u0010\u0006\"\u0004\u0008o\u0010p\u00a8\u0006q"
    }
    d2 = {
        "Lcom/roblox/protocols/calling/CallingHandler;",
        "Lcom/roblox/protocols/callingplatforminterface/generated/IPlatformCalling;",
        "<init>",
        "()V",
        "",
        "isCallingEnabled",
        "()Z",
        "Landroid/content/Context;",
        "context",
        "",
        "setup",
        "(Landroid/content/Context;)V",
        "setupAsync",
        "",
        "callData",
        "callerName",
        "onIncomingCallPush",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V",
        "callId",
        "ring",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "alertIfReady",
        "(Ljava/lang/String;)V",
        "startOngoingCall",
        "",
        "cause",
        "endCall",
        "(Ljava/lang/String;I)V",
        "followCalls",
        "loadAvatar",
        "Lkotlin/Function0;",
        "block",
        "onMainThread",
        "(Lkotlin/jvm/functions/Function0;)V",
        "Lav/p0;",
        "scope",
        "Lkotlin/Function1;",
        "Leu/b;",
        "Landroid/graphics/Bitmap;",
        "",
        "load",
        "loadAvatarWithTimeout$NativeShell_googleProdRelease",
        "(Lav/p0;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;",
        "loadAvatarWithTimeout",
        "Lcom/roblox/protocols/calling/a;",
        "call",
        "forwardIncomingCallToEngine$NativeShell_googleProdRelease",
        "(Landroid/content/Context;Lcom/roblox/protocols/calling/a;)V",
        "forwardIncomingCallToEngine",
        "Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;",
        "state",
        "onCallingStateChange",
        "(Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;)V",
        "onCallingRemoved",
        "avatar",
        "onAvatarLoaded$NativeShell_googleProdRelease",
        "(Ljava/lang/String;Landroid/graphics/Bitmap;)V",
        "onAvatarLoaded",
        "answerCall$NativeShell_googleProdRelease",
        "answerCall",
        "declineCall$NativeShell_googleProdRelease",
        "declineCall",
        "resetForTest$NativeShell_googleProdRelease",
        "resetForTest",
        "TAG",
        "Ljava/lang/String;",
        "END_REASON_USER",
        "",
        "AVATAR_TIMEOUT_MS",
        "J",
        "getAVATAR_TIMEOUT_MS$NativeShell_googleProdRelease$annotations",
        "appContext",
        "Landroid/content/Context;",
        "Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;",
        "coreListener",
        "Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;",
        "mainScope$delegate",
        "Lzt/h;",
        "getMainScope",
        "()Lav/p0;",
        "mainScope",
        "ioScope$delegate",
        "getIoScope",
        "ioScope",
        "Lav/d2;",
        "surfaces",
        "Lav/d2;",
        "coreListenerFactory",
        "Lkotlin/jvm/functions/Function1;",
        "getCoreListenerFactory$NativeShell_googleProdRelease",
        "()Lkotlin/jvm/functions/Function1;",
        "setCoreListenerFactory$NativeShell_googleProdRelease",
        "(Lkotlin/jvm/functions/Function1;)V",
        "getCoreListenerFactory$NativeShell_googleProdRelease$annotations",
        "Lkotlin/Function3;",
        "fetchAvatar",
        "Lpu/n;",
        "getFetchAvatar$NativeShell_googleProdRelease",
        "()Lpu/n;",
        "setFetchAvatar$NativeShell_googleProdRelease",
        "(Lpu/n;)V",
        "getFetchAvatar$NativeShell_googleProdRelease$annotations",
        "engineFlagsLoaded",
        "Lkotlin/jvm/functions/Function0;",
        "getEngineFlagsLoaded$NativeShell_googleProdRelease",
        "()Lkotlin/jvm/functions/Function0;",
        "setEngineFlagsLoaded$NativeShell_googleProdRelease",
        "getEngineFlagsLoaded$NativeShell_googleProdRelease$annotations",
        "debugForceCallingEnabled",
        "Z",
        "getDebugForceCallingEnabled",
        "setDebugForceCallingEnabled",
        "(Z)V",
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
.field public static final AVATAR_TIMEOUT_MS:J = 0x7d0L

.field private static final END_REASON_USER:Ljava/lang/String; = "NativeEndAction"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "CallingHandler"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static volatile appContext:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static volatile coreListener:Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static coreListenerFactory:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/roblox/protocols/callingplatforminterface/generated/IPlatformCalling;",
            "+",
            "Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static volatile debugForceCallingEnabled:Z

.field private static engineFlagsLoaded:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static fetchAvatar:Lpu/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpu/n<",
            "-",
            "Landroid/content/Context;",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/graphics/Bitmap;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final ioScope$delegate:Lzt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final mainScope$delegate:Lzt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static surfaces:Lav/d2;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/protocols/calling/CallingHandler;

    invoke-direct {v0}, Lcom/roblox/protocols/calling/CallingHandler;-><init>()V

    sput-object v0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    new-instance v0, Lul/o;

    invoke-direct {v0}, Lul/o;-><init>()V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/calling/CallingHandler;->mainScope$delegate:Lzt/h;

    new-instance v0, Lul/p;

    invoke-direct {v0}, Lul/p;-><init>()V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/calling/CallingHandler;->ioScope$delegate:Lzt/h;

    new-instance v0, Lul/q;

    invoke-direct {v0}, Lul/q;-><init>()V

    sput-object v0, Lcom/roblox/protocols/calling/CallingHandler;->coreListenerFactory:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lul/r;

    invoke-direct {v0}, Lul/r;-><init>()V

    sput-object v0, Lcom/roblox/protocols/calling/CallingHandler;->fetchAvatar:Lpu/n;

    new-instance v0, Lul/s;

    invoke-direct {v0}, Lul/s;-><init>()V

    sput-object v0, Lcom/roblox/protocols/calling/CallingHandler;->engineFlagsLoaded:Lkotlin/jvm/functions/Function0;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/roblox/protocols/calling/CallingHandler;->debugForceCallingEnabled:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/protocols/callingplatforminterface/generated/IPlatformCalling;-><init>()V

    return-void
.end method

.method public static synthetic a()Lav/p0;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/calling/CallingHandler;->ioScope_delegate$lambda$0()Lav/p0;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getIoScope(Lcom/roblox/protocols/calling/CallingHandler;)Lav/p0;
    .locals 0

    invoke-direct {p0}, Lcom/roblox/protocols/calling/CallingHandler;->getIoScope()Lav/p0;

    move-result-object p0

    return-object p0
.end method

.method private final alertIfReady(Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lul/d;->a:Lul/d;

    new-instance v1, Lul/z;

    invoke-direct {v1}, Lul/z;-><init>()V

    new-instance v2, Lul/a0;

    invoke-direct {v2}, Lul/a0;-><init>()V

    invoke-virtual {v0, p1, v1, v2}, Lul/d;->m(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lul/a;

    return-void
.end method

.method private static final alertIfReady$lambda$0(Lul/a;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lul/h0;->b:Lul/h0;

    invoke-virtual {p0, v0}, Lul/a;->l(Lul/h0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lul/a;->c()Lul/e;

    move-result-object p0

    sget-object v0, Lul/e;->c:Lul/e;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final alertIfReady$lambda$1(Lul/a;)Lul/a;
    .locals 13

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lul/h0;->c:Lul/h0;

    const/16 v11, 0x1bf

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v12}, Lul/a;->b(Lul/a;Ljava/lang/String;IILjava/lang/Long;Ljava/lang/String;Lul/j;Lul/h0;Landroid/graphics/Bitmap;Lul/e;ILjava/lang/Object;)Lul/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lul/a;)Z
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/calling/CallingHandler;->loadAvatar$lambda$0(Lul/a;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lul/a;)Z
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/calling/CallingHandler;->alertIfReady$lambda$0(Lul/a;)Z

    move-result p0

    return p0
.end method

.method private static final coreListenerFactory$lambda$0(Lcom/roblox/protocols/callingplatforminterface/generated/IPlatformCalling;)Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;->setPlatformImpl(Lcom/roblox/protocols/callingplatforminterface/generated/IPlatformCalling;)Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lul/a;)Z
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/calling/CallingHandler;->startOngoingCall$lambda$0(Lul/a;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Landroid/content/Context;JLkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/roblox/protocols/calling/CallingHandler;->fetchAvatar$lambda$0(Landroid/content/Context;JLkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final endCall(Ljava/lang/String;I)V
    .locals 2

    sget-object v0, Lul/d;->a:Lul/d;

    new-instance v1, Lul/y;

    invoke-direct {v1, p2}, Lul/y;-><init>(I)V

    invoke-virtual {v0, p1, v1}, Lul/d;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lul/a;

    return-void
.end method

.method private static final endCall$lambda$0(ILul/a;)Lul/a;
    .locals 12

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    invoke-virtual {p1}, Lul/a;->i()Lul/j;

    move-result-object p0

    sget-object v0, Lul/j;->b:Lul/j;

    if-eq p0, v0, :cond_0

    sget-object p0, Lul/j;->c:Lul/j;

    :goto_0
    move-object v6, p0

    goto :goto_1

    :cond_0
    sget-object p0, Lul/j;->d:Lul/j;

    goto :goto_0

    :goto_1
    const/16 v10, 0x1df

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v11}, Lul/a;->b(Lul/a;Ljava/lang/String;IILjava/lang/Long;Ljava/lang/String;Lul/j;Lul/h0;Landroid/graphics/Bitmap;Lul/e;ILjava/lang/Object;)Lul/a;

    move-result-object p0

    return-object p0
.end method

.method private static final engineFlagsLoaded$lambda$0()Z
    .locals 1

    invoke-static {}, Lcom/roblox/client/startup/a;->m()Z

    move-result v0

    return v0
.end method

.method public static synthetic f(Lul/a;)Lul/a;
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/calling/CallingHandler;->startOngoingCall$lambda$1(Lul/a;)Lul/a;

    move-result-object p0

    return-object p0
.end method

.method private static final fetchAvatar$lambda$0(Landroid/content/Context;JLkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 8

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResult"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    invoke-direct {v0}, Lcom/roblox/protocols/calling/CallingHandler;->getIoScope()Lav/p0;

    move-result-object v1

    new-instance v2, Lcom/roblox/protocols/calling/CallingHandler$b;

    const/4 v7, 0x0

    move-object v4, p0

    move-wide v5, p1

    move-object v3, p3

    invoke-direct/range {v2 .. v7}, Lcom/roblox/protocols/calling/CallingHandler$b;-><init>(Lkotlin/jvm/functions/Function1;Landroid/content/Context;JLeu/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private final followCalls(Landroid/content/Context;)V
    .locals 8

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->surfaces:Lav/d2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lav/d2;->b()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/roblox/protocols/calling/CallingHandler;->getMainScope()Lav/p0;

    move-result-object v2

    new-instance v5, Lcom/roblox/protocols/calling/CallingHandler$c;

    const/4 v0, 0x0

    invoke-direct {v5, p1, v0}, Lcom/roblox/protocols/calling/CallingHandler$c;-><init>(Landroid/content/Context;Leu/b;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    move-result-object p1

    sput-object p1, Lcom/roblox/protocols/calling/CallingHandler;->surfaces:Lav/d2;

    return-void
.end method

.method public static synthetic g(Lul/a;)Z
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/calling/CallingHandler;->ring$lambda$0(Lul/a;)Z

    move-result p0

    return p0
.end method

.method public static synthetic getAVATAR_TIMEOUT_MS$NativeShell_googleProdRelease$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCoreListenerFactory$NativeShell_googleProdRelease$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getEngineFlagsLoaded$NativeShell_googleProdRelease$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getFetchAvatar$NativeShell_googleProdRelease$annotations()V
    .locals 0

    return-void
.end method

.method private final getIoScope()Lav/p0;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->ioScope$delegate:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lav/p0;

    return-object v0
.end method

.method private final getMainScope()Lav/p0;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->mainScope$delegate:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lav/p0;

    return-object v0
.end method

.method public static synthetic h(Ljava/lang/String;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/protocols/calling/CallingHandler;->loadAvatar$lambda$2$0(Ljava/lang/String;Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i()Z
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/calling/CallingHandler;->engineFlagsLoaded$lambda$0()Z

    move-result v0

    return v0
.end method

.method private static final ioScope_delegate$lambda$0()Lav/p0;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Lav/z2;->b(Lav/d2;ILjava/lang/Object;)Lav/a0;

    move-result-object v0

    invoke-static {}, Lav/g1;->b()Lav/l0;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object v0

    return-object v0
.end method

.method public static final isCallingEnabled()Z
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic j(Ljava/lang/String;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/protocols/calling/CallingHandler;->loadAvatar$lambda$2(Ljava/lang/String;Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lul/a;)Lul/a;
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/calling/CallingHandler;->alertIfReady$lambda$1(Lul/a;)Lul/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/calling/CallingHandler;->onCallingStateChange$lambda$0(Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final loadAvatar(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lul/d;->a:Lul/d;

    new-instance v1, Lul/b0;

    invoke-direct {v1}, Lul/b0;-><init>()V

    new-instance v2, Lul/c0;

    invoke-direct {v2}, Lul/c0;-><init>()V

    invoke-virtual {v0, p2, v1, v2}, Lul/d;->m(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lul/a;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lul/a;->g()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/roblox/protocols/calling/CallingHandler;->fetchAvatar:Lpu/n;

    new-instance v2, Lul/d0;

    invoke-direct {v2, p2}, Lul/d0;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, p1, v0, v2}, Lpu/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method private static final loadAvatar$lambda$0(Lul/a;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lul/a;->c()Lul/e;

    move-result-object p0

    sget-object v0, Lul/e;->a:Lul/e;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final loadAvatar$lambda$1(Lul/a;)Lul/a;
    .locals 13

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lul/a;->g()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lul/e;->b:Lul/e;

    :goto_0
    move-object v10, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lul/e;->c:Lul/e;

    goto :goto_0

    :goto_1
    const/16 v11, 0xff

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v12}, Lul/a;->b(Lul/a;Ljava/lang/String;IILjava/lang/Long;Ljava/lang/String;Lul/j;Lul/h0;Landroid/graphics/Bitmap;Lul/e;ILjava/lang/Object;)Lul/a;

    move-result-object p0

    return-object p0
.end method

.method private static final loadAvatar$lambda$2(Ljava/lang/String;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 2

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    new-instance v1, Lul/u;

    invoke-direct {v1, p0, p1}, Lul/u;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    invoke-direct {v0, v1}, Lcom/roblox/protocols/calling/CallingHandler;->onMainThread(Lkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final loadAvatar$lambda$2$0(Ljava/lang/String;Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    invoke-virtual {v0, p0, p1}, Lcom/roblox/protocols/calling/CallingHandler;->onAvatarLoaded$NativeShell_googleProdRelease(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic m()Lav/p0;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/calling/CallingHandler;->mainScope_delegate$lambda$0()Lav/p0;

    move-result-object v0

    return-object v0
.end method

.method private static final mainScope_delegate$lambda$0()Lav/p0;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Lav/z2;->b(Lav/d2;ILjava/lang/Object;)Lav/a0;

    move-result-object v0

    invoke-static {}, Lav/g1;->c()Lav/n2;

    move-result-object v1

    invoke-virtual {v1}, Lav/n2;->Y()Lav/n2;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic n(Lul/a;)Lul/a;
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/calling/CallingHandler;->loadAvatar$lambda$1(Lul/a;)Lul/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lul/a;)Lul/a;
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/calling/CallingHandler;->ring$lambda$1(Lul/a;)Lul/a;

    move-result-object p0

    return-object p0
.end method

.method private static final onAvatarLoaded$lambda$0(Landroid/graphics/Bitmap;Lul/a;)Lul/a;
    .locals 13

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v10, Lul/e;->c:Lul/e;

    const/16 v11, 0x7f

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, p0

    move-object v1, p1

    invoke-static/range {v1 .. v12}, Lul/a;->b(Lul/a;Ljava/lang/String;IILjava/lang/Long;Ljava/lang/String;Lul/j;Lul/h0;Landroid/graphics/Bitmap;Lul/e;ILjava/lang/Object;)Lul/a;

    move-result-object p0

    return-object p0
.end method

.method private static final onCallingRemoved$lambda$0(Ljava/lang/String;)Lkotlin/Unit;
    .locals 2

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lcom/roblox/protocols/calling/CallingHandler;->endCall(Ljava/lang/String;I)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onCallingStateChange$lambda$0(Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;)Lkotlin/Unit;
    .locals 4

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->appContext:Landroid/content/Context;

    if-nez v0, :cond_0

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;->getCallId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;->getStatus()Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    move-result-object p0

    if-nez p0, :cond_1

    const/4 p0, -0x1

    goto :goto_0

    :cond_1
    sget-object v2, Lcom/roblox/protocols/calling/CallingHandler$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v2, p0

    :goto_0
    const/4 v2, 0x6

    const/4 v3, 0x4

    packed-switch p0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    sget-object p0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, v1, v3}, Lcom/roblox/protocols/calling/CallingHandler;->endCall(Ljava/lang/String;I)V

    goto :goto_1

    :pswitch_1
    sget-object p0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, v1, v2}, Lcom/roblox/protocols/calling/CallingHandler;->endCall(Ljava/lang/String;I)V

    goto :goto_1

    :pswitch_2
    sget-object p0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/16 v0, 0xb

    invoke-direct {p0, v1, v0}, Lcom/roblox/protocols/calling/CallingHandler;->endCall(Ljava/lang/String;I)V

    goto :goto_1

    :pswitch_3
    sget-object p0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v0, 0x3

    invoke-direct {p0, v1, v0}, Lcom/roblox/protocols/calling/CallingHandler;->endCall(Ljava/lang/String;I)V

    goto :goto_1

    :pswitch_4
    sget-object p0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, v1, v3}, Lcom/roblox/protocols/calling/CallingHandler;->endCall(Ljava/lang/String;I)V

    goto :goto_1

    :pswitch_5
    sget-object p0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, v1, v2}, Lcom/roblox/protocols/calling/CallingHandler;->endCall(Ljava/lang/String;I)V

    goto :goto_1

    :pswitch_6
    sget-object p0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v0, 0x5

    invoke-direct {p0, v1, v0}, Lcom/roblox/protocols/calling/CallingHandler;->endCall(Ljava/lang/String;I)V

    goto :goto_1

    :pswitch_7
    sget-object p0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    sget-object v0, Lul/d;->a:Lul/d;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lul/d;->i(Ljava/lang/String;)Lul/a;

    move-result-object v0

    invoke-virtual {v0}, Lul/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roblox/protocols/calling/CallingHandler;->startOngoingCall(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_8
    sget-object p0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    sget-object v2, Lul/d;->a:Lul/d;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, Lul/d;->i(Ljava/lang/String;)Lul/a;

    move-result-object v1

    invoke-virtual {v1}, Lul/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/roblox/protocols/calling/CallingHandler;->ring(Landroid/content/Context;Ljava/lang/String;)V

    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static final onIncomingCallPush(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/roblox/protocols/calling/CallingHandler;->isCallingEnabled()Z

    move-result v0

    const-string v1, "CallingHandler"

    if-nez v0, :cond_0

    const-string p0, "calling is off; dropping call push"

    invoke-static {v1, p0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-eqz p1, :cond_1

    sget-object v0, Lcom/roblox/protocols/calling/a;->e:Lcom/roblox/protocols/calling/a$a;

    invoke-static {p1}, Lkotlin/text/StringsKt;->n1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcom/roblox/protocols/calling/a$a;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/roblox/protocols/calling/a;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    const-string p0, "call push has no callId; dropping"

    invoke-static {v1, p0}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    sget-object p2, Lcom/roblox/protocols/calling/CallingHandler;->engineFlagsLoaded:Lkotlin/jvm/functions/Function0;

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_3

    const-string p0, "engine flags not loaded; dropping call push"

    invoke-static {v1, p0}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    sget-object p2, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    invoke-virtual {p2, p0, p1}, Lcom/roblox/protocols/calling/CallingHandler;->forwardIncomingCallToEngine$NativeShell_googleProdRelease(Landroid/content/Context;Lcom/roblox/protocols/calling/a;)V

    return-void
.end method

.method private final onMainThread(Lkotlin/jvm/functions/Function0;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/roblox/protocols/calling/CallingHandler;->getMainScope()Lav/p0;

    move-result-object v0

    new-instance v3, Lcom/roblox/protocols/calling/CallingHandler$f;

    const/4 v1, 0x0

    invoke-direct {v3, p1, v1}, Lcom/roblox/protocols/calling/CallingHandler$f;-><init>(Lkotlin/jvm/functions/Function0;Leu/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    return-void
.end method

.method public static synthetic p(Lcom/roblox/protocols/callingplatforminterface/generated/IPlatformCalling;)Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/calling/CallingHandler;->coreListenerFactory$lambda$0(Lcom/roblox/protocols/callingplatforminterface/generated/IPlatformCalling;)Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/calling/CallingHandler;->onCallingRemoved$lambda$0(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Landroid/graphics/Bitmap;Lul/a;)Lul/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/protocols/calling/CallingHandler;->onAvatarLoaded$lambda$0(Landroid/graphics/Bitmap;Lul/a;)Lul/a;

    move-result-object p0

    return-object p0
.end method

.method private final ring(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lul/d;->a:Lul/d;

    new-instance v1, Lul/m;

    invoke-direct {v1}, Lul/m;-><init>()V

    new-instance v2, Lul/n;

    invoke-direct {v2}, Lul/n;-><init>()V

    invoke-virtual {v0, p2, v1, v2}, Lul/d;->m(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lul/a;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/roblox/protocols/calling/CallingHandler;->loadAvatar(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/roblox/protocols/calling/CallingHandler;->alertIfReady(Ljava/lang/String;)V

    return-void
.end method

.method private static final ring$lambda$0(Lul/a;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lul/h0;->a:Lul/h0;

    invoke-virtual {p0, v0}, Lul/a;->l(Lul/h0;)Z

    move-result p0

    return p0
.end method

.method private static final ring$lambda$1(Lul/a;)Lul/a;
    .locals 13

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lul/h0;->b:Lul/h0;

    const/16 v11, 0x1bf

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v12}, Lul/a;->b(Lul/a;Ljava/lang/String;IILjava/lang/Long;Ljava/lang/String;Lul/j;Lul/h0;Landroid/graphics/Bitmap;Lul/e;ILjava/lang/Object;)Lul/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(ILul/a;)Lul/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/protocols/calling/CallingHandler;->endCall$lambda$0(ILul/a;)Lul/a;

    move-result-object p0

    return-object p0
.end method

.method public static final declared-synchronized setup(Landroid/content/Context;)V
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-class v0, Lcom/roblox/protocols/calling/CallingHandler;

    monitor-enter v0

    :try_start_0
    const-string v1, "context"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/roblox/protocols/calling/CallingHandler;->isCallingEnabled()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sput-object v1, Lcom/roblox/protocols/calling/CallingHandler;->appContext:Landroid/content/Context;

    sget-object v1, Lul/i;->a:Lul/i;

    invoke-virtual {v1, p0}, Lul/i;->d(Landroid/content/Context;)V

    sget-object v1, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v2, "getApplicationContext(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p0}, Lcom/roblox/protocols/calling/CallingHandler;->followCalls(Landroid/content/Context;)V

    sget-object p0, Lcom/roblox/protocols/calling/CallingHandler;->coreListener:Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;

    if-nez p0, :cond_1

    sget-object p0, Lcom/roblox/protocols/calling/CallingHandler;->coreListenerFactory:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;

    sput-object p0, Lcom/roblox/protocols/calling/CallingHandler;->coreListener:Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static final setupAsync(Landroid/content/Context;)V
    .locals 7
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    invoke-direct {v0}, Lcom/roblox/protocols/calling/CallingHandler;->getIoScope()Lav/p0;

    move-result-object v1

    new-instance v4, Lcom/roblox/protocols/calling/CallingHandler$g;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/roblox/protocols/calling/CallingHandler$g;-><init>(Landroid/content/Context;Leu/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    return-void
.end method

.method private final startOngoingCall(Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lul/d;->a:Lul/d;

    new-instance v1, Lul/v;

    invoke-direct {v1}, Lul/v;-><init>()V

    new-instance v2, Lul/w;

    invoke-direct {v2}, Lul/w;-><init>()V

    invoke-virtual {v0, p1, v1, v2}, Lul/d;->m(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lul/a;

    return-void
.end method

.method private static final startOngoingCall$lambda$0(Lul/a;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lul/a;->i()Lul/j;

    move-result-object p0

    sget-object v0, Lul/j;->a:Lul/j;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final startOngoingCall$lambda$1(Lul/a;)Lul/a;
    .locals 13

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lul/j;->b:Lul/j;

    const/16 v11, 0x1df

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v12}, Lul/a;->b(Lul/a;Ljava/lang/String;IILjava/lang/Long;Ljava/lang/String;Lul/j;Lul/h0;Landroid/graphics/Bitmap;Lul/e;ILjava/lang/Object;)Lul/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final answerCall$NativeShell_googleProdRelease(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->coreListener:Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;->answerIncomingCall(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/roblox/protocols/calling/CallingHandler;->startOngoingCall(Ljava/lang/String;)V

    return-void
.end method

.method public final declineCall$NativeShell_googleProdRelease(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->coreListener:Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;

    if-eqz v0, :cond_0

    const-string v1, "NativeEndAction"

    invoke-virtual {v0, p1, v1}, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;->endCall(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final forwardIncomingCallToEngine$NativeShell_googleProdRelease(Landroid/content/Context;Lcom/roblox/protocols/calling/a;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/roblox/protocols/calling/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/protocols/calling/CallingHandler;->setup(Landroid/content/Context;)V

    sget-object p1, Lcom/roblox/protocols/calling/CallingHandler;->coreListener:Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;

    if-nez p1, :cond_0

    return-void

    :cond_0
    sget-object v0, Lul/d;->a:Lul/d;

    invoke-virtual {p2}, Lcom/roblox/protocols/calling/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/roblox/protocols/calling/a;->e()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p2}, Lcom/roblox/protocols/calling/a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lul/d;->j(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lul/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lul/d;->b(Lul/a;)Lul/a;

    move-result-object v0

    const-string v1, "CallingHandler"

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lcom/roblox/protocols/calling/a;->c()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "duplicate push for live call "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "; dropping"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p2}, Lcom/roblox/protocols/calling/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;->receiveIncomingCall(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p2}, Lcom/roblox/protocols/calling/a;->c()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "engine didn\'t take call "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lul/d;->a:Lul/d;

    invoke-virtual {p1, v0}, Lul/d;->d(Lul/a;)V

    return-void
.end method

.method public final getCoreListenerFactory$NativeShell_googleProdRelease()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/roblox/protocols/callingplatforminterface/generated/IPlatformCalling;",
            "Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->coreListenerFactory:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getDebugForceCallingEnabled()Z
    .locals 1

    sget-boolean v0, Lcom/roblox/protocols/calling/CallingHandler;->debugForceCallingEnabled:Z

    return v0
.end method

.method public final getEngineFlagsLoaded$NativeShell_googleProdRelease()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->engineFlagsLoaded:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getFetchAvatar$NativeShell_googleProdRelease()Lpu/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpu/n<",
            "Landroid/content/Context;",
            "Ljava/lang/Long;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/graphics/Bitmap;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/roblox/protocols/calling/CallingHandler;->fetchAvatar:Lpu/n;

    return-object v0
.end method

.method public final loadAvatarWithTimeout$NativeShell_googleProdRelease(Lav/p0;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;
    .locals 7
    .param p1    # Lav/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Leu/b<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Leu/b<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v3, Lcom/roblox/protocols/calling/CallingHandler$e;

    const/4 v6, 0x0

    invoke-direct {v3, p2, v6}, Lcom/roblox/protocols/calling/CallingHandler$e;-><init>(Lkotlin/jvm/functions/Function1;Leu/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lav/i;->b(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/w0;

    move-result-object p1

    new-instance p2, Lcom/roblox/protocols/calling/CallingHandler$d;

    invoke-direct {p2, p1, v6}, Lcom/roblox/protocols/calling/CallingHandler$d;-><init>(Lav/w0;Leu/b;)V

    const-wide/16 v0, 0x7d0

    invoke-static {v0, v1, p2, p3}, Lav/g3;->e(JLkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final onAvatarLoaded$NativeShell_googleProdRelease(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lul/d;->a:Lul/d;

    new-instance v4, Lul/l;

    invoke-direct {v4, p2}, Lul/l;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lul/d;->n(Lul/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lul/a;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, v2}, Lcom/roblox/protocols/calling/CallingHandler;->alertIfReady(Ljava/lang/String;)V

    return-void
.end method

.method public onCallingRemoved(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lul/x;

    invoke-direct {v0, p1}, Lul/x;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/roblox/protocols/calling/CallingHandler;->onMainThread(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public onCallingStateChange(Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;)V
    .locals 1
    .param p1    # Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lul/t;

    invoke-direct {v0, p1}, Lul/t;-><init>(Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;)V

    invoke-direct {p0, v0}, Lcom/roblox/protocols/calling/CallingHandler;->onMainThread(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public final resetForTest$NativeShell_googleProdRelease()V
    .locals 3

    const/4 v0, 0x0

    sput-object v0, Lcom/roblox/protocols/calling/CallingHandler;->appContext:Landroid/content/Context;

    sput-object v0, Lcom/roblox/protocols/calling/CallingHandler;->coreListener:Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;

    invoke-direct {p0}, Lcom/roblox/protocols/calling/CallingHandler;->getMainScope()Lav/p0;

    move-result-object v1

    invoke-interface {v1}, Lav/p0;->I()Lkotlin/coroutines/CoroutineContext;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v0}, Lav/g2;->f(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    sput-object v0, Lcom/roblox/protocols/calling/CallingHandler;->surfaces:Lav/d2;

    sget-object v0, Lul/d;->a:Lul/d;

    invoke-virtual {v0}, Lul/d;->c()V

    sget-object v0, Lul/i;->a:Lul/i;

    invoke-virtual {v0}, Lul/i;->i()V

    sput-boolean v2, Lcom/roblox/protocols/calling/CallingHandler;->debugForceCallingEnabled:Z

    return-void
.end method

.method public final setCoreListenerFactory$NativeShell_googleProdRelease(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/roblox/protocols/callingplatforminterface/generated/IPlatformCalling;",
            "+",
            "Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/roblox/protocols/calling/CallingHandler;->coreListenerFactory:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setDebugForceCallingEnabled(Z)V
    .locals 0

    sput-boolean p1, Lcom/roblox/protocols/calling/CallingHandler;->debugForceCallingEnabled:Z

    return-void
.end method

.method public final setEngineFlagsLoaded$NativeShell_googleProdRelease(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/roblox/protocols/calling/CallingHandler;->engineFlagsLoaded:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final setFetchAvatar$NativeShell_googleProdRelease(Lpu/n;)V
    .locals 1
    .param p1    # Lpu/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpu/n<",
            "-",
            "Landroid/content/Context;",
            "-",
            "Ljava/lang/Long;",
            "-",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/graphics/Bitmap;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/roblox/protocols/calling/CallingHandler;->fetchAvatar:Lpu/n;

    return-void
.end method
